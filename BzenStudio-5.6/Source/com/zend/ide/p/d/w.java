package com.zend.ide.p.d;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

public class w extends AbstractListModel
  implements ComboBoxModel, PropertyChangeListener
{
  protected FileFilter[] a;
  final bw b;

  protected w(bw parambw)
  {
    this.a = parambw.getFileChooser().getChoosableFileFilters();
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    String str = paramPropertyChangeEvent.getPropertyName();
    if (str == "ChoosableFileFilterChangedProperty")
    {
      this.a = ((FileFilter[])(FileFilter[])paramPropertyChangeEvent.getNewValue());
      fireContentsChanged(this, -1, -1);
    }
    else if (str == "fileFilterChanged")
    {
      fireContentsChanged(this, -1, -1);
    }
  }

  public void setSelectedItem(Object paramObject)
  {
    if (paramObject != null)
    {
      this.b.getFileChooser().setFileFilter((FileFilter)paramObject);
      fireContentsChanged(this, -1, -1);
    }
  }

  public Object getSelectedItem()
  {
    FileFilter localFileFilter = this.b.getFileChooser().getFileFilter();
    int i = 0;
    if (localFileFilter != null)
    {
      for (int j = 0; j < this.a.length; j++)
      {
        if (this.a[j] != localFileFilter)
          continue;
        i = 1;
      }
      if (i == 0)
        this.b.getFileChooser().addChoosableFileFilter(localFileFilter);
    }
    return this.b.getFileChooser().getFileFilter();
  }

  public int getSize()
  {
    if (this.a != null)
      return this.a.length;
    return 0;
  }

  public Object getElementAt(int paramInt)
  {
    if (paramInt > getSize() - 1)
      return this.b.getFileChooser().getFileFilter();
    if (this.a != null)
      return this.a[paramInt];
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.w
 * JD-Core Version:    0.6.0
 */