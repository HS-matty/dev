package com.zend.ide.p.d;

import com.zend.ide.j.u;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import javax.swing.Icon;
import javax.swing.UIManager;

public class bj extends bh
{
  private static final String r = UIManager.getString("FileChooser.other.newFolder");
  private static final String s = UIManager.getString("FileChooser.other.newFolder.subsequent");

  public bj(u paramu, g paramg)
  {
    super(paramu, paramg);
  }

  public File createNewFolder(File paramFile)
    throws IOException
  {
    if (paramFile == null)
      throw new IOException("Containing directory is null:");
    File localFile = null;
    localFile = createFileObject(paramFile, r);
    for (int i = 1; (localFile.exists()) && (i < 100); i++)
      localFile = createFileObject(paramFile, MessageFormat.format(s, new Object[] { new Integer(i) }));
    if (localFile.exists())
      throw new IOException("Directory already exists:" + localFile.getAbsolutePath());
    localFile.mkdirs();
    return localFile;
  }

  public boolean isFileSystemRoot(File paramFile)
  {
    return (paramFile != null) && (paramFile.getAbsolutePath().equals("/"));
  }

  public boolean isDrive(File paramFile)
  {
    return isFloppyDrive(paramFile);
  }

  public boolean isFloppyDrive(File paramFile)
  {
    return false;
  }

  public boolean isComputerNode(File paramFile)
  {
    if (paramFile != null)
    {
      String str = paramFile.getParent();
      if ((str != null) && (str.equals("/net")))
        return true;
    }
    return false;
  }

  protected Icon c(Object paramObject, File paramFile)
  {
    Icon localIcon = super.a(paramFile);
    return localIcon;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bj
 * JD-Core Version:    0.6.0
 */