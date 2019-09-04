package com.zend.ide.p.d;

import com.zend.ide.j.u;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.UIManager;

class bi extends bh
{
  protected static final String r = UIManager.getString("FileChooser.other.newFolder");

  bi(u paramu, g paramg)
  {
    super(paramu, paramg);
  }

  public File createNewFolder(File paramFile)
    throws IOException
  {
    if (paramFile == null)
      throw new IOException("Containing directory is null:");
    File localFile = createFileObject(paramFile, r);
    if (localFile.exists())
      throw new IOException("Directory already exists:" + localFile.getAbsolutePath());
    localFile.mkdirs();
    return localFile;
  }

  protected Icon c(Object paramObject, File paramFile)
  {
    return super.a(paramFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bi
 * JD-Core Version:    0.6.0
 */