package com.zend.ide.p.d;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.filechooser.FileSystemView;
import javax.swing.plaf.basic.BasicFileChooserUI.SelectionListener;

class by extends BasicFileChooserUI.SelectionListener
{
  final bw a;

  by(bw parambw)
  {
    super(parambw);
  }

  public void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    if (!paramListSelectionEvent.getValueIsAdjusting())
    {
      JFileChooser localJFileChooser = this.a.getFileChooser();
      FileSystemView localFileSystemView = localJFileChooser.getFileSystemView();
      JList localJList = (JList)paramListSelectionEvent.getSource();
      Object localObject;
      if (localJFileChooser.isMultiSelectionEnabled())
      {
        localObject = null;
        Object[] arrayOfObject = localJList.getSelectedValues();
        if (arrayOfObject != null)
          if ((arrayOfObject.length == 1) && (((File)arrayOfObject[0]).isDirectory()) && (localJFileChooser.isTraversable((File)arrayOfObject[0])) && ((localJFileChooser.getFileSelectionMode() == 0) || (!localFileSystemView.isFileSystem((File)arrayOfObject[0]))))
          {
            this.a.setDirectorySelected(true);
            bw.a(this.a, (File)arrayOfObject[0]);
          }
          else
          {
            localObject = new File[arrayOfObject.length];
            int i = 0;
            for (int j = 0; j < arrayOfObject.length; j++)
            {
              File localFile = (File)arrayOfObject[j];
              if (((!localJFileChooser.isFileSelectionEnabled()) || (!localFile.isFile())) && ((!localJFileChooser.isDirectorySelectionEnabled()) || (!localFileSystemView.isFileSystem(localFile)) || (!localFile.isDirectory())))
                continue;
              localObject[(i++)] = localFile;
            }
            if (i == 0)
            {
              localObject = null;
            }
            else if (i < arrayOfObject.length)
            {
              File[] arrayOfFile = new File[i];
              System.arraycopy(localObject, 0, arrayOfFile, 0, i);
              localObject = arrayOfFile;
            }
            this.a.setDirectorySelected(false);
          }
        localJFileChooser.setSelectedFiles(localObject);
      }
      else
      {
        localObject = (File)localJList.getSelectedValue();
        if ((localObject != null) && (((File)localObject).isDirectory()) && (localJFileChooser.isTraversable((File)localObject)) && ((localJFileChooser.getFileSelectionMode() == 0) || (!localFileSystemView.isFileSystem((File)localObject))))
        {
          this.a.setDirectorySelected(true);
          bw.b(this.a, (File)localObject);
          localJFileChooser.setSelectedFile(null);
        }
        else
        {
          this.a.setDirectorySelected(false);
          if (localObject != null)
            localJFileChooser.setSelectedFile((File)localObject);
        }
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.by
 * JD-Core Version:    0.6.0
 */