package com.zend.ide.p.d;

import com.zend.ide.j.i;
import com.zend.ide.j.u;
import com.zend.ide.u.cb;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.swing.Icon;

public abstract class bh extends bg
{
  protected u p = null;
  protected g q = null;

  public static bg a(u paramu, g paramg)
  {
    int i = paramu.d();
    if (((paramu instanceof com.zend.ide.u.bh)) && (i == 47))
      return new cb(paramu, paramg);
    if (i == 92)
      return new bk(paramu, paramg);
    if (i == 47)
      return new bj(paramu, paramg);
    return new bi(paramu, paramg);
  }

  bh(u paramu, g paramg)
  {
    this.p = paramu;
    this.q = paramg;
  }

  public boolean isRoot(File paramFile)
  {
    return super.isRoot(paramFile);
  }

  public Boolean isTraversable(File paramFile)
  {
    return super.isTraversable(paramFile);
  }

  public String getSystemDisplayName(File paramFile)
  {
    return super.getSystemDisplayName(paramFile);
  }

  public String getSystemTypeDescription(File paramFile)
  {
    return super.getSystemTypeDescription(paramFile);
  }

  public Icon getSystemIcon(File paramFile)
  {
    Icon localIcon = super.getSystemIcon(paramFile);
    return localIcon;
  }

  public boolean isParent(File paramFile1, File paramFile2)
  {
    return super.isParent(paramFile1, paramFile2);
  }

  public File getChild(File paramFile, String paramString)
  {
    return super.getChild(paramFile, paramString);
  }

  public boolean isFileSystem(File paramFile)
  {
    return super.isFileSystem(paramFile);
  }

  public abstract File createNewFolder(File paramFile)
    throws IOException;

  public boolean isHiddenFile(File paramFile)
  {
    if (isFloppyDrive(paramFile))
      return false;
    return super.isHiddenFile(paramFile);
  }

  public boolean isFileSystemRoot(File paramFile)
  {
    return this.p.m(paramFile);
  }

  public boolean isDrive(File paramFile)
  {
    if ((this.p instanceof i))
      return super.isDrive(paramFile);
    return isRoot(paramFile);
  }

  public boolean isFloppyDrive(File paramFile)
  {
    return super.isFloppyDrive(paramFile);
  }

  public boolean isComputerNode(File paramFile)
  {
    if ((this.p instanceof i))
      return super.isComputerNode(paramFile);
    return false;
  }

  public File[] getRoots()
  {
    File[] arrayOfFile = this.q.b();
    return arrayOfFile;
  }

  public File getHomeDirectory()
  {
    return this.p.g(this.p.e());
  }

  public File getDefaultDirectory()
  {
    if ((this.p instanceof i))
      return super.getDefaultDirectory();
    return getHomeDirectory();
  }

  public File createFileObject(File paramFile, String paramString)
  {
    if (paramFile == null)
      return this.p.g(paramString);
    return this.p.a(paramFile, paramString);
  }

  public File createFileObject(String paramString)
  {
    File localFile = this.p.g(paramString);
    return localFile;
  }

  public File[] getFiles(File paramFile, boolean paramBoolean)
  {
    if ((this.p instanceof i))
      return super.getFiles(paramFile, paramBoolean);
    File[] arrayOfFile = paramFile.listFiles();
    int i = arrayOfFile == null ? 0 : arrayOfFile.length;
    Vector localVector = new Vector(i);
    for (int j = 0; j < i; j++)
    {
      File localFile = arrayOfFile[j];
      if ((paramBoolean) && (isHiddenFile(localFile)))
        continue;
      localVector.addElement(localFile);
    }
    return (File[])(File[])localVector.toArray(new File[localVector.size()]);
  }

  public File getParentDirectory(File paramFile)
  {
    if ((this.p instanceof i))
      return super.getParentDirectory(paramFile);
    return paramFile.getParentFile();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bh
 * JD-Core Version:    0.6.0
 */