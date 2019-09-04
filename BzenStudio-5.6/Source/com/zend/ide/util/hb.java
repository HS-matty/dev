package com.zend.ide.util;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

class hb extends URLClassLoader
{
  final gb a;

  hb(gb paramgb, URL[] paramArrayOfURL, ClassLoader paramClassLoader)
  {
    super(paramArrayOfURL, paramClassLoader);
  }

  protected String findLibrary(String paramString)
  {
    if (gb.a(this.a) == null)
      return null;
    for (int i = 0; i < gb.a(this.a).size(); i++)
    {
      String str = (String)gb.a(this.a).get(i);
      if ((str.endsWith(".jar")) || (str.endsWith("zip")))
        continue;
      File localFile1 = new File(str);
      if (!localFile1.isDirectory())
        continue;
      File localFile2 = new File(localFile1, paramString);
      if (localFile2.exists())
        return localFile2.getAbsolutePath();
      switch (cr.c())
      {
      case 1:
        localFile2 = new File(localFile1, paramString + ".dll");
        if (!localFile2.exists())
          continue;
        return localFile2.getAbsolutePath();
      case 2:
        localFile2 = new File(localFile1, "lib" + paramString + ".so");
        if (localFile2.exists())
          return localFile2.getPath();
        localFile2 = new File(localFile1, paramString + ".so");
        if (!localFile2.exists())
          continue;
        return localFile2.getAbsolutePath();
      case 3:
        localFile2 = new File(localFile1, "lib" + paramString + ".jnilib");
        if (localFile2.exists())
          return localFile2.getAbsolutePath();
        localFile2 = new File(localFile1, "lib" + paramString + ".dylib");
        if (!localFile2.exists())
          continue;
        return localFile2.getAbsolutePath();
      }
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.hb
 * JD-Core Version:    0.6.0
 */