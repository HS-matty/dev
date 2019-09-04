package com.zend.ide.p.d;

import java.io.File;
import java.text.NumberFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.plaf.basic.BasicDirectoryModel;
import javax.swing.table.AbstractTableModel;

class bz extends AbstractTableModel
  implements ListDataListener
{
  String[] a = { bw.p(this.d), bw.l(this.d), bw.m(this.d), bw.b(this.d), bw.c(this.d) };
  JFileChooser b;
  ListModel c;
  final bw d;

  bz(bw parambw, JFileChooser paramJFileChooser)
  {
    this.b = paramJFileChooser;
    this.c = parambw.getModel();
    this.c.addListDataListener(this);
  }

  public int getRowCount()
  {
    return this.c.getSize();
  }

  public int getColumnCount()
  {
    return 5;
  }

  public String getColumnName(int paramInt)
  {
    return this.a[paramInt];
  }

  public Class getColumnClass(int paramInt)
  {
    switch (paramInt)
    {
    case 0:
      return File.class;
    case 3:
      return Date.class;
    }
    return super.getColumnClass(paramInt);
  }

  public Object getValueAt(int paramInt1, int paramInt2)
  {
    File localFile = (File)this.c.getElementAt(paramInt1);
    switch (paramInt2)
    {
    case 0:
      return localFile;
    case 1:
      if ((!localFile.exists()) || (localFile.isDirectory()))
        return null;
      return NumberFormat.getInstance().format((localFile.length() + 1023L) / 1024L) + " KB ";
    case 2:
      if (!localFile.exists())
        return null;
      return this.b.getFileSystemView().getSystemTypeDescription(localFile);
    case 3:
      if ((!localFile.exists()) || (this.b.getFileSystemView().isFileSystemRoot(localFile)))
        return null;
      long l = localFile.lastModified();
      return l == 0L ? null : new Date(l);
    case 4:
      if ((!localFile.exists()) || (this.b.getFileSystemView().isFileSystemRoot(localFile)))
        return null;
      String str = "";
      if (!localFile.canWrite())
        str = str + "R";
      if (localFile.isHidden())
        str = str + "H";
      return str;
    }
    return null;
  }

  public void setValueAt(Object paramObject, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
    {
      JFileChooser localJFileChooser = this.d.getFileChooser();
      File localFile1 = (File)getValueAt(paramInt1, paramInt2);
      if (localFile1 != null)
      {
        String str1 = localJFileChooser.getName(localFile1);
        String str2 = localFile1.getName();
        String str3 = ((String)paramObject).trim();
        if (!str3.equals(str1))
        {
          String str4 = str3;
          int i = str2.length();
          int j = str1.length();
          if ((i > j) && (str2.charAt(j) == '.'))
            str4 = str3 + str2.substring(j);
          FileSystemView localFileSystemView = localJFileChooser.getFileSystemView();
          File localFile2 = localFileSystemView.createFileObject(localFile1.getParentFile(), str4);
          if ((this.d.getModel().renameFile(localFile1, localFile2)) && (localFileSystemView.isParent(localJFileChooser.getCurrentDirectory(), localFile2)))
            if (localJFileChooser.isMultiSelectionEnabled())
              localJFileChooser.setSelectedFiles(new File[] { localFile2 });
            else
              localJFileChooser.setSelectedFile(localFile2);
        }
      }
    }
  }

  public boolean isCellEditable(int paramInt1, int paramInt2)
  {
    return paramInt2 == 0;
  }

  public void contentsChanged(ListDataEvent paramListDataEvent)
  {
    fireTableDataChanged();
  }

  public void intervalAdded(ListDataEvent paramListDataEvent)
  {
    fireTableDataChanged();
  }

  public void intervalRemoved(ListDataEvent paramListDataEvent)
  {
    fireTableDataChanged();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bz
 * JD-Core Version:    0.6.0
 */