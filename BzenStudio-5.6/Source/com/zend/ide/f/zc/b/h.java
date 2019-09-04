package com.zend.ide.f.zc.b;

import java.io.File;
import java.io.IOException;

public class h
{
  private static j a;
  private static final d b;
  static final boolean c = !h.class.desiredAssertionStatus();

  public static final d a(String paramString, File[] paramArrayOfFile)
    throws IOException
  {
    if ((!c) && (paramArrayOfFile == null))
      throw new AssertionError();
    d[] arrayOfd = new d[paramArrayOfFile.length];
    for (int i = 0; i < paramArrayOfFile.length; i++)
      arrayOfd[i] = new e(paramArrayOfFile[i]);
    return new a(paramString, arrayOfd);
  }

  public static final d a()
  {
    return b;
  }

  public static j b()
  {
    if (a == null)
    {
      String str1 = System.getProperty("java.home");
      String str2 = System.getProperty("java.version", "Unknown JRE");
      try
      {
        a = new j(str2, new File(str1));
      }
      catch (IOException localIOException)
      {
        return null;
      }
    }
    return a;
  }

  static
  {
    b = new i();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zc.b.h
 * JD-Core Version:    0.6.0
 */