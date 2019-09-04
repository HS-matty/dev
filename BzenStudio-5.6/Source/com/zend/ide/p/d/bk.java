package com.zend.ide.p.d;

import com.zend.ide.j.bd;
import com.zend.ide.j.u;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import javax.swing.Icon;
import javax.swing.UIManager;

public class bk extends bh
{
  private static final String r = UIManager.getString("FileChooser.win32.newFolder");
  private static final String s = UIManager.getString("FileChooser.win32.newFolder.subsequent");

  bk(u paramu, g paramg)
  {
    super(paramu, paramg);
  }

  public Boolean isTraversable(File paramFile)
  {
    return Boolean.valueOf((isFileSystemRoot(paramFile)) || (isComputerNode(paramFile)) || (paramFile.isDirectory()));
  }

  public File getChild(File paramFile, String paramString)
  {
    if ((paramString.startsWith("\\")) && (!paramString.startsWith("\\\\")) && (isFileSystem(paramFile)))
    {
      String str = paramFile.getAbsolutePath();
      if ((str.length() >= 2) && (str.charAt(1) == ':') && (Character.isLetter(str.charAt(0))))
        return createFileObject(str.substring(0, 2) + paramString);
    }
    return super.getChild(paramFile, paramString);
  }

  public String getSystemTypeDescription(File paramFile)
  {
    return super.getSystemTypeDescription(paramFile);
  }

  public File getHomeDirectory()
  {
    return getRoots()[0];
  }

  public File createNewFolder(File paramFile)
    throws IOException
  {
    if (paramFile == null)
      throw new IOException("Containing directory is null:");
    File localFile = null;
    localFile = createFileObject(paramFile, r);
    for (int i = 2; (localFile.exists()) && (i < 100); i++)
      localFile = createFileObject(paramFile, MessageFormat.format(s, new Object[] { new Integer(i) }));
    if (localFile.exists())
      throw new IOException("Directory already exists:" + localFile.getAbsolutePath());
    localFile.mkdirs();
    return localFile;
  }

  public boolean isDrive(File paramFile)
  {
    return isFileSystemRoot(paramFile);
  }

  public boolean isFloppyDrive(File paramFile)
  {
    String str = paramFile.getAbsolutePath();
    return (str != null) && ((str.equals("A:\\")) || (str.equals("B:\\"))) && (!(paramFile instanceof bd));
  }

  public File createFileObject(String paramString)
  {
    if ((paramString.length() >= 2) && (paramString.charAt(1) == ':') && (Character.isLetter(paramString.charAt(0))))
      if (paramString.length() == 2)
        paramString = paramString + "\\";
      else if (paramString.charAt(2) != '\\')
        paramString = paramString.substring(0, 2) + "\\" + paramString.substring(2);
    return super.createFileObject(paramString);
  }

  public Object a(File paramFile, boolean paramBoolean)
  {
    Object localObject = null;
    String str = paramFile.getPath();
    int i = str.lastIndexOf(".");
    if (i == -1)
    {
      localObject = paramFile;
    }
    else
    {
      localObject = str.substring(i + 1);
      if (("exe".equalsIgnoreCase((String)localObject)) || ("lnk".equalsIgnoreCase((String)localObject)))
        localObject = paramFile;
    }
    return localObject;
  }

  protected Icon c(Object paramObject, File paramFile)
  {
    Icon localIcon = null;
    try
    {
      localIcon = super.a(paramFile);
    }
    catch (Exception localException)
    {
    }
    return localIcon;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bk
 * JD-Core Version:    0.6.0
 */