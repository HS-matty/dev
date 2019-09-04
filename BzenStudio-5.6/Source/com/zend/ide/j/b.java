package com.zend.ide.j;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class b extends File
{
  final i a;

  public b(i parami, String paramString)
  {
    super(paramString);
  }

  public b(i parami, String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
  }

  public boolean delete()
  {
    return this.a.g(this);
  }

  public boolean renameTo(File paramFile)
  {
    return this.a.a(this, paramFile, true);
  }

  public boolean createNewFile()
    throws IOException
  {
    return this.a.e(getPath());
  }

  public boolean mkdir()
  {
    return this.a.j(this);
  }

  public boolean mkdirs()
  {
    if (exists())
      return false;
    if (mkdir())
      return true;
    String str = getParent();
    return (str != null) && (new b(this.a, str).mkdirs()) && (mkdir());
  }

  public File[] listFiles()
  {
    String[] arrayOfString = list();
    if (arrayOfString == null)
      return null;
    int i = arrayOfString.length;
    b[] arrayOfb = new b[i];
    for (int j = 0; j < i; j++)
      arrayOfb[j] = new b(this.a, getPath(), arrayOfString[j]);
    return arrayOfb;
  }

  public File[] listFiles(FilenameFilter paramFilenameFilter)
  {
    String[] arrayOfString = list();
    if (arrayOfString == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < arrayOfString.length; i++)
    {
      if ((paramFilenameFilter != null) && (!paramFilenameFilter.accept(this, arrayOfString[i])))
        continue;
      localArrayList.add(new b(this.a, getPath(), arrayOfString[i]));
    }
    return (File[])localArrayList.toArray(new b[0]);
  }

  public File getParentFile()
  {
    String str = getParent();
    if (str == null)
      return null;
    return new b(this.a, str);
  }

  public File getAbsoluteFile()
  {
    return new b(this.a, getAbsolutePath());
  }

  public File getCanonicalFile()
    throws IOException
  {
    return new b(this.a, getCanonicalPath());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.b
 * JD-Core Version:    0.6.0
 */