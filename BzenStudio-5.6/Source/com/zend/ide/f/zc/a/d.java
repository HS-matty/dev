package com.zend.ide.f.zc.a;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

public class d extends URLClassLoader
{
  private static final int a;
  private final b b = a(paramArrayOfFile, this.c);
  private final List c = new ArrayList();

  public d(File[] paramArrayOfFile)
    throws IOException
  {
    super(a(paramArrayOfFile));
  }

  public d(File paramFile)
    throws IOException
  {
    this(new File[] { paramFile });
  }

  private static URL[] a(File[] paramArrayOfFile)
    throws IOException
  {
    if ((paramArrayOfFile == null) || (paramArrayOfFile.length == 0))
      throw new IOException();
    URL[] arrayOfURL = new URL[paramArrayOfFile.length];
    for (int i = 0; i < paramArrayOfFile.length; i++)
    {
      File localFile = paramArrayOfFile[i];
      if ((!d) && (localFile == null))
        throw new AssertionError();
      String str = localFile.getName().toLowerCase();
      if ((!str.endsWith(".jar")) && (!str.endsWith(".zip")))
        throw new IOException("Unfamiliar extention");
      arrayOfURL[i] = localFile.toURL();
    }
    return arrayOfURL;
  }

  public final b a()
  {
    return this.b;
  }

  public static b a(File[] paramArrayOfFile, List paramList)
  {
    if ((!d) && (paramList == null))
      throw new AssertionError();
    c localc = new c("");
    for (int i = 0; i < paramArrayOfFile.length; i++)
      try
      {
        JarFile localJarFile = new JarFile(paramArrayOfFile[i]);
        Enumeration localEnumeration = localJarFile.entries();
        while (localEnumeration.hasMoreElements())
        {
          ZipEntry localZipEntry = (ZipEntry)localEnumeration.nextElement();
          a(localc, localZipEntry);
        }
      }
      catch (Exception localException)
      {
        paramList.add(localException);
      }
    return localc;
  }

  private static void a(b paramb, ZipEntry paramZipEntry)
  {
    String str1 = paramZipEntry.getName();
    if (str1.endsWith(".class"))
    {
      String str2 = str1.substring(0, str1.length() - a).replace('/', '.');
      int i = str2.lastIndexOf('.');
      String str3 = str2.substring(i + 1);
      String str4 = str2.substring(0, i);
      b localb = paramb.c(str4);
      if (localb == null)
        localb = paramb.a(str4);
      localb.b(str3);
    }
    else if ((str1.endsWith("/")) && (!str1.startsWith("META-INF")))
    {
      paramb.a(str1.substring(0, str1.length() - 1).replace('/', '.'));
    }
  }

  static
  {
    a = ".class".length();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zc.a.d
 * JD-Core Version:    0.6.0
 */