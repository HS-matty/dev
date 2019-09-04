package com.zend.ide.p.d;

import com.zend.ide.util.bk;
import com.zend.ide.util.cl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import javax.swing.Icon;
import javax.swing.filechooser.FileSystemView;
import sun.awt.shell.ShellFolder;

public class bl extends bg
{
  private static Hashtable p = new Hashtable(10);
  public static bl q = new bl();
  private g r = new h(this);
  private bk s = new p(this, 1000L);
  private bk t = new q(this, 1000L);
  private bk u = new r(this, 1000L);
  private bk v = new s(this, 1000L);

  public File createNewFolder(File paramFile)
    throws IOException
  {
    return b(paramFile).createNewFolder(paramFile);
  }

  public boolean isRoot(File paramFile)
  {
    return super.isRoot(paramFile);
  }

  public Boolean isTraversable(File paramFile)
  {
    return b(paramFile).isTraversable(paramFile);
  }

  public String getSystemDisplayName(File paramFile)
  {
    String str = b(paramFile).getSystemDisplayName(paramFile);
    return str;
  }

  public String getSystemTypeDescription(File paramFile)
  {
    return b(paramFile).getSystemTypeDescription(paramFile);
  }

  public Icon getSystemIcon(File paramFile)
  {
    return b(paramFile).getSystemIcon(paramFile);
  }

  public Icon b(File paramFile, boolean paramBoolean)
  {
    FileSystemView localFileSystemView = b(paramFile);
    if ((localFileSystemView instanceof bg))
      return ((bg)localFileSystemView).b(paramFile, paramBoolean);
    return localFileSystemView.getSystemIcon(paramFile);
  }

  public boolean isParent(File paramFile1, File paramFile2)
  {
    return b(paramFile1).isParent(paramFile1, paramFile2);
  }

  public File getChild(File paramFile, String paramString)
  {
    return b(paramFile).getChild(paramFile, paramString);
  }

  public boolean isFileSystem(File paramFile)
  {
    FileSystemView localFileSystemView = b(paramFile);
    return localFileSystemView.isFileSystem(paramFile);
  }

  public boolean isHiddenFile(File paramFile)
  {
    FileSystemView localFileSystemView = b(paramFile);
    return localFileSystemView.isHiddenFile(paramFile);
  }

  public boolean isFileSystemRoot(File paramFile)
  {
    FileSystemView localFileSystemView = b(paramFile);
    return localFileSystemView.isFileSystemRoot(paramFile);
  }

  public boolean isDrive(File paramFile)
  {
    FileSystemView localFileSystemView = b(paramFile);
    return localFileSystemView.isDrive(paramFile);
  }

  public boolean isFloppyDrive(File paramFile)
  {
    FileSystemView localFileSystemView = b(paramFile);
    return localFileSystemView.isFloppyDrive(paramFile);
  }

  public boolean isComputerNode(File paramFile)
  {
    FileSystemView localFileSystemView = b(paramFile);
    return localFileSystemView.isComputerNode(paramFile);
  }

  public File[] getRoots()
  {
    ArrayList localArrayList = new ArrayList();
    File[] arrayOfFile1 = f();
    if (arrayOfFile1 != null)
      localArrayList.addAll(Arrays.asList(arrayOfFile1));
    localArrayList.addAll(e());
    File[] arrayOfFile2 = new File[localArrayList.size()];
    localArrayList.toArray(arrayOfFile2);
    return arrayOfFile2;
  }

  public File getHomeDirectory()
  {
    return super.getHomeDirectory();
  }

  public File getDefaultDirectory()
  {
    return super.getDefaultDirectory();
  }

  public File createFileObject(File paramFile, String paramString)
  {
    FileSystemView localFileSystemView = b(paramFile);
    return localFileSystemView.createFileObject(paramFile, paramString);
  }

  public File createFileObject(String paramString)
  {
    com.zend.ide.j.s locals = com.zend.ide.j.h.m.h(paramString);
    FileSystemView localFileSystemView = a(locals);
    return localFileSystemView.createFileObject(paramString);
  }

  public File[] getFiles(File paramFile, boolean paramBoolean)
  {
    Object localObject = paramFile;
    if (((paramFile instanceof ShellFolder)) && (((ShellFolder)paramFile).isLink()))
      try
      {
        localObject = ((ShellFolder)paramFile).getLinkLocation();
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        cl.a("Target for " + paramFile.getPath() + " not found.");
      }
    FileSystemView localFileSystemView = b((File)localObject);
    return (File)localFileSystemView.getFiles((File)localObject, paramBoolean);
  }

  public File getParentDirectory(File paramFile)
  {
    FileSystemView localFileSystemView = b(paramFile);
    return localFileSystemView.getParentDirectory(paramFile);
  }

  public FileSystemView b(File paramFile)
  {
    com.zend.ide.j.s locals = com.zend.ide.j.h.m.A(paramFile);
    return a(locals);
  }

  public FileSystemView a(com.zend.ide.j.s params)
  {
    synchronized (p)
    {
      Object localObject1 = (FileSystemView)p.get(params);
      if (localObject1 != null)
        return localObject1;
      localObject1 = bh.a(params, this.r);
      if (localObject1 != null)
      {
        p.put(params, localObject1);
        return localObject1;
      }
    }
    return (FileSystemView)null;
  }

  protected Icon c(Object paramObject, File paramFile)
  {
    throw new RuntimeException("You should not be here.");
  }

  public File[] f()
  {
    return (File[])(File[])this.s.a(null);
  }

  public File[] b()
  {
    return (File[])(File[])this.t.a(null);
  }

  public File[] c()
  {
    return (File[])(File[])this.u.a(null);
  }

  public File[] d()
  {
    return (File[])(File[])this.v.a(null);
  }

  public List e()
  {
    ArrayList localArrayList = new ArrayList(Arrays.asList(d()));
    List localList = Arrays.asList(File.listRoots());
    localArrayList.removeAll(localList);
    return localArrayList;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bl
 * JD-Core Version:    0.6.0
 */