package com.zend.ide.y;

import com.a.f;
import com.zend.ide.d.co;
import com.zend.ide.d.cp;
import com.zend.ide.d.cq;
import com.zend.ide.util.cl;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

public class m
{
  private static m a;
  private Hashtable b;
  private String c = "schemes";
  private String d = ".xml";

  private static m b()
  {
    c();
    return a;
  }

  private static void c()
  {
    if (a == null)
      a = new m();
  }

  public m()
  {
    d();
  }

  private void d()
  {
    this.b = new Hashtable();
  }

  public static boolean a(String paramString)
  {
    return b().b(paramString);
  }

  private boolean b(String paramString)
  {
    return (paramString.equals("Default")) || (paramString.equals("Dark"));
  }

  public static void c(String paramString)
  {
    b().d(paramString);
  }

  private void d(String paramString)
  {
    File localFile1 = new File(paramString, this.c);
    if (!localFile1.exists())
    {
      localFile1.mkdirs();
    }
    else
    {
      localObject = localFile1.listFiles();
      for (int i = 0; i < localObject.length; i++)
        localObject[i].delete();
    }
    Object localObject = this.b.keys();
    while (((Enumeration)localObject).hasMoreElements())
    {
      String str = (String)((Enumeration)localObject).nextElement();
      if (!a(str))
        try
        {
          File localFile2 = new File(localFile1, str + this.d);
          localFile2.createNewFile();
          try
          {
            f.a(localFile2.getPath(), this.b.get(str));
          }
          catch (IOException localIOException2)
          {
            cl.a(localIOException2);
          }
        }
        catch (IOException localIOException1)
        {
          cl.a(localIOException1);
        }
    }
  }

  public static Hashtable e()
  {
    return b().f();
  }

  private Hashtable f()
  {
    return this.b;
  }

  public static co a()
  {
    return b().b();
  }

  private co b()
  {
    String str = (String)b.a("application.chosenScheme").c();
    return a(str);
  }

  private co a(String paramString)
  {
    co localco = (co)this.b.get(paramString);
    if (localco == null)
    {
      b.a("application.chosenScheme").a("Default");
      return (co)this.b.get("Default");
    }
    return localco;
  }

  public static void a(Hashtable paramHashtable)
  {
    b().b(paramHashtable);
  }

  private void b(Hashtable paramHashtable)
  {
    this.b = paramHashtable;
  }

  public static void e(String paramString)
  {
    b().f(paramString);
  }

  private void f(String paramString)
  {
    this.b.put("Default", new cp());
    this.b.put("Dark", new cq());
    File localFile = new File(paramString, this.c);
    if ((localFile.exists()) && (localFile.listFiles() != null))
      try
      {
        File[] arrayOfFile = localFile.listFiles();
        for (int i = 0; i < arrayOfFile.length; i++)
        {
          String str2 = arrayOfFile[i].getName();
          int j = str2.indexOf(this.d);
          if (j == -1)
            continue;
          String str1 = str2.substring(0, j);
          co localco = (co)f.a(arrayOfFile[i].getPath());
          this.b.put(str1, localco);
        }
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.m
 * JD-Core Version:    0.6.0
 */