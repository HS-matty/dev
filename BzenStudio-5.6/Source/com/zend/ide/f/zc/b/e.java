package com.zend.ide.f.zc.b;

import com.zend.ide.f.zc.a.b;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class e
  implements d
{
  private final com.zend.ide.f.zc.a.d a;
  private final String b;

  public e(File paramFile)
    throws IOException
  {
    this(null, paramFile);
  }

  public e(String paramString, File paramFile)
    throws IOException
  {
    this.a = new com.zend.ide.f.zc.a.d(paramFile);
    this.b = paramString;
  }

  public final b a()
  {
    return this.a.a();
  }

  public Class[] a(String[] paramArrayOfString)
    throws ClassNotFoundException
  {
    if ((!c) && (paramArrayOfString == null))
      throw new AssertionError();
    b localb = a();
    URLClassLoader localURLClassLoader = new URLClassLoader(new URL[0], this.a);
    Class[] arrayOfClass = new Class[paramArrayOfString.length];
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      if (!localb.d(paramArrayOfString[i]))
        throw new ClassNotFoundException();
      arrayOfClass[i] = localURLClassLoader.loadClass(paramArrayOfString[i]);
    }
    localURLClassLoader = null;
    return arrayOfClass;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zc.b.e
 * JD-Core Version:    0.6.0
 */