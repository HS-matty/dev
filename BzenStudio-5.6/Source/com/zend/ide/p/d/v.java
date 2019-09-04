package com.zend.ide.p.d;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import sun.awt.shell.ShellFolder;

public class v extends AbstractListModel
  implements ComboBoxModel
{
  Vector a = new Vector();
  int[] b = null;
  File c = null;
  JFileChooser d = this.f.getFileChooser();
  FileSystemView e = this.d.getFileSystemView();
  final bw f;

  public v(bw parambw)
  {
    File localFile = parambw.getFileChooser().getCurrentDirectory();
    if (localFile != null)
      a(localFile);
  }

  private void a(File paramFile)
  {
    if (paramFile == null)
      return;
    this.a.clear();
    File[] arrayOfFile = this.e.getRoots();
    this.a.addAll(Arrays.asList(arrayOfFile));
    File localFile = null;
    try
    {
      localFile = paramFile.getCanonicalFile();
    }
    catch (IOException localIOException)
    {
      localFile = paramFile;
    }
    try
    {
      Object localObject1 = localFile;
      try
      {
        localObject1 = ShellFolder.getShellFolder(localFile);
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
      }
      Object localObject2 = localObject1;
      Vector localVector = new Vector(10);
      do
        localVector.addElement(localObject2);
      while ((localObject2 = ((File)localObject2).getParentFile()) != null);
      int i = localVector.size();
      for (int j = 0; j < i; j++)
      {
        localObject2 = (File)localVector.get(j);
        if (!this.a.contains(localObject2))
          continue;
        int k = this.a.indexOf(localObject2);
        for (int m = j - 1; m >= 0; m--)
          this.a.insertElementAt(localVector.get(m), k + j - m);
        break;
      }
      b();
      setSelectedItem(localObject1);
    }
    catch (Exception localException)
    {
      b();
    }
  }

  private void b()
  {
    this.b = new int[this.a.size()];
    for (int i = 0; i < this.b.length; i++)
    {
      File localFile1 = (File)this.a.get(i);
      File localFile2 = localFile1.getParentFile();
      this.b[i] = 0;
      if (localFile2 == null)
        continue;
      for (int j = i - 1; j >= 0; j--)
      {
        if (!localFile2.equals(this.a.get(j)))
          continue;
        this.b[j] += 1;
        break;
      }
    }
  }

  public int a(int paramInt)
  {
    return (this.b != null) && (paramInt >= 0) && (paramInt < this.b.length) ? this.b[paramInt] : 0;
  }

  public void setSelectedItem(Object paramObject)
  {
    this.c = ((File)paramObject);
    fireContentsChanged(this, -1, -1);
  }

  public Object getSelectedItem()
  {
    return this.c;
  }

  public int getSize()
  {
    return this.a.size();
  }

  public Object getElementAt(int paramInt)
  {
    return this.a.elementAt(paramInt);
  }

  static void a(v paramv, File paramFile)
  {
    paramv.a(paramFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.v
 * JD-Core Version:    0.6.0
 */