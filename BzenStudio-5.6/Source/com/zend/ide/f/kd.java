package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.j.h;
import com.zend.ide.m.bd;
import com.zend.ide.m.bh;
import com.zend.ide.m.v;
import com.zend.ide.util.bi;
import com.zend.ide.util.cl;
import com.zend.ide.util.wb;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class kd
{
  private static final String a = bi.a("FRAMEWORK_PATH", "./ZendFramework");
  private static r b = new r();
  private static md c = new md(null);
  private static boolean d = false;
  private static boolean e = false;
  private static bh[] f = di.c;
  private static Map g = new HashMap(1000);
  private static v[] h = di.b;
  private static Map i = new HashMap(100);
  private static bd[] j = di.e;

  public static void a()
  {
    c();
  }

  public static boolean b()
  {
    return e;
  }

  private static synchronized void c()
  {
    boolean bool = ((Boolean)b.a("desktop.includeFrameworkData").c()).booleanValue();
    try
    {
      if ((bool) && (!d))
      {
        d = true;
        d();
        b(new File(a).getCanonicalFile());
      }
      e = true;
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
  }

  private static void d()
  {
    f = di.c;
    g = new HashMap(3000);
    h = di.b;
    i = new HashMap(10);
    j = di.e;
  }

  public static v a(String paramString)
  {
    return (v)i.get(paramString);
  }

  public static d[] e()
  {
    return h;
  }

  public static d[] b(String paramString)
  {
    return bl.a(h, paramString);
  }

  public static bd[] f()
  {
    return j;
  }

  public static d[] g()
  {
    return f;
  }

  public static d[] c(String paramString)
  {
    Object localObject = g.get(paramString);
    if (localObject == null)
      return di.a;
    return new bh[] { (bh)localObject };
  }

  private static boolean a(File paramFile)
  {
    return wb.a(paramFile);
  }

  private static boolean b(File paramFile)
  {
    try
    {
      File[] arrayOfFile = paramFile.listFiles();
      if (arrayOfFile == null)
        return true;
      for (int k = 0; k < arrayOfFile.length; k++)
      {
        boolean bool = arrayOfFile[k].isFile();
        if (!bool)
        {
          if (!b(arrayOfFile[k]))
            return false;
        }
        else
        {
          if (!a(arrayOfFile[k]))
            continue;
          InputStream localInputStream = h.m.f(arrayOfFile[k]);
          InputStreamReader localInputStreamReader = new InputStreamReader(localInputStream);
          b.a(localInputStreamReader, arrayOfFile[k].getPath(), c);
        }
      }
    }
    catch (IOException localIOException)
    {
      return false;
    }
    return true;
  }

  static bh[] a(bh[] paramArrayOfbh)
  {
    f = paramArrayOfbh;
    return paramArrayOfbh;
  }

  static Map h()
  {
    return g;
  }

  static v[] a(v[] paramArrayOfv)
  {
    h = paramArrayOfv;
    return paramArrayOfv;
  }

  static Map i()
  {
    return i;
  }

  static bd[] a(bd[] paramArrayOfbd)
  {
    j = paramArrayOfbd;
    return paramArrayOfbd;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.kd
 * JD-Core Version:    0.6.0
 */