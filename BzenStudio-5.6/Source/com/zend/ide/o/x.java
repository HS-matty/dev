package com.zend.ide.o;

import com.zend.ide.desktop.bl;
import com.zend.ide.j.h;
import com.zend.ide.j.s;
import com.zend.ide.n.bw;
import com.zend.ide.r.d;
import com.zend.ide.r.p;
import com.zend.ide.util.ab;
import com.zend.ide.util.bc;
import com.zend.ide.util.cl;
import com.zend.ide.util.cu;
import com.zend.ide.y.b;
import com.zend.ide.y.e;
import java.beans.PropertyChangeListener;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;
import javax.swing.ActionMap;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public abstract class x
  implements ge, cu
{
  private String a = null;
  private fi h;
  private PropertyChangeListener i = new gm(this, null);
  private int k = 10;
  private e l;
  private boolean m = true;
  private tb g;
  protected static String b = "dummy.php";
  protected Hashtable c = new Hashtable();
  protected File d = null;
  protected bw f;
  protected de e;
  protected com.zend.ide.util.c.f j;
  protected boolean n = true;
  protected boolean o = false;

  public x(bw parambw, de paramde)
  {
    this.f = parambw;
    this.e = paramde;
    this.g = new tb(com.zend.ide.bd.c.b().h());
  }

  protected void A()
  {
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.l = new e(localf);
    localf.a("debugging.serverResponseTimeout", this.i);
    this.l.a("debugging.serverResponseTimeout");
  }

  protected void d(String paramString1, String paramString2)
  {
    this.m = true;
    String str = "no_remote";
    if ((paramString1.indexOf(str) != -1) || (paramString2.indexOf(str) != -1))
      this.m = false;
  }

  public void e(String paramString, int paramInt)
  {
    try
    {
      a(new URL(paramString), paramInt);
    }
    catch (MalformedURLException localMalformedURLException)
    {
      cl.a(localMalformedURLException);
    }
  }

  public void a(URL paramURL, int paramInt)
  {
    this.e.r();
    String str = paramURL.getHost();
    int i1 = paramInt;
    new Thread(new z(this, str, i1)).start();
  }

  protected int F()
  {
    if (this.o)
      return Q();
    return w();
  }

  private int Q()
  {
    int i1 = w();
    for (int i2 = i1; i2 == i1; i2 = (int)(Math.random() * 65535.0D));
    return i2;
  }

  public InputStream c(String paramString)
  {
    if (paramString.equals(""))
      return null;
    Object localObject1 = null;
    String str = paramString;
    Object localObject2;
    if (i(str))
    {
      localObject2 = v();
      if (localObject2 != null)
        localObject1 = new ByteArrayInputStream(((String)localObject2).getBytes());
      f(null);
    }
    if (localObject1 == null)
    {
      localObject2 = bl.a().a(str);
      localObject1 = ((bc)localObject2).b;
      str = ((bc)localObject2).a;
    }
    if (localObject1 != null)
    {
      if (ab.a(str, (InputStream)localObject1))
        return null;
      if (!str.equalsIgnoreCase(paramString))
      {
        this.c.put(paramString, str);
        a(paramString, str);
      }
      return localObject1;
    }
    return (InputStream)(InputStream)null;
  }

  public boolean a(String paramString1, int paramInt, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.trim().equals("")))
      return false;
    Object localObject1 = null;
    int i1 = 0;
    Object localObject2;
    Object localObject3;
    int i2;
    if (this.m)
    {
      localObject2 = v();
      if (i(paramString1))
      {
        if (localObject2 != null)
          localObject1 = new ByteArrayInputStream(((String)localObject2).getBytes());
        f(null);
      }
      if (localObject1 == null)
      {
        localObject3 = bl.a().a(paramString1);
        localObject1 = ((bc)localObject3).b;
        paramString1 = ((bc)localObject3).a;
      }
      if (localObject1 == null)
      {
        localObject1 = b(paramString1, paramInt, paramString2);
        i1 = 1;
      }
    }
    else
    {
      localObject2 = bl.a().b(paramString1);
      localObject1 = ((bc)localObject2).b;
      if (localObject1 == null)
      {
        localObject1 = b(paramString1, paramInt, paramString2);
        i1 = 1;
      }
      else if (h.m.g(((bc)localObject2).a).exists())
      {
        localObject3 = null;
        try
        {
          localObject3 = h.m.f(((bc)localObject2).a);
        }
        catch (IOException localIOException)
        {
        }
        i2 = ((Boolean)b.a("application.showDebugConflictDialog").c()).booleanValue();
        if ((i2 != 0) && (localObject3 != null) && (a((InputStream)localObject1, (InputStream)localObject3)) && (this.n))
        {
          this.n = false;
          this.g.setVisible(true);
        }
      }
    }
    if (localObject1 != null)
    {
      localObject2 = bd();
      i(paramString1);
      if (((bw)localObject2).a(paramString1, null, (InputStream)localObject1))
      {
        if (i1 != 0)
        {
          localObject3 = ((bw)localObject2).c(paramString1);
          for (i2 = 0; i2 < localObject3.length; i2++)
          {
            if (!(localObject3[i2] instanceof bw))
              continue;
            bw localbw = (bw)localObject3[i2];
            localbw.b(true);
          }
        }
        SwingUtilities.invokeLater(new ca(this, (bw)localObject2, paramInt));
        return true;
      }
      try
      {
        ((InputStream)localObject1).close();
      }
      catch (Exception localException)
      {
      }
    }
    return false;
  }

  private static void i(String paramString)
  {
    if ((paramString == null) || (paramString.indexOf(".") == -1))
      return;
    int i1 = paramString.lastIndexOf(".");
    int i2 = h.m.h(paramString).d();
    int i3 = paramString.lastIndexOf(i2);
    String str = "";
    if ((i1 >= 0) && (i1 > i3))
      str = paramString.substring(i1 + 1);
    d locald1 = p.e().c("PHP files");
    d locald2 = p.e().c("HTML files");
    if (((locald1 != null) && (locald1.a(str))) || ((locald2 != null) && (locald2.a(str))))
      return;
    p.e().a(locald1, new com.zend.ide.r.f(str));
  }

  public fi bl()
  {
    if (this.h == null)
      this.h = new fi(com.zend.ide.bd.c.b().h(), this.j);
    return this.h;
  }

  private void a(Integer paramInteger)
  {
    this.k = paramInteger.intValue();
    d(this.k * 1000);
  }

  public int bm()
  {
    return this.k;
  }

  protected void c(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer("<?php include('");
    localStringBuffer.append(paramString);
    localStringBuffer.append("'); ?>");
    f(localStringBuffer.toString());
  }

  protected void e(String paramString1, String paramString2)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("<?php chdir('" + paramString2 + "');");
    localStringBuffer.append("include('" + paramString1 + "');?>");
    f(localStringBuffer.toString());
  }

  protected void f(String paramString)
  {
    this.a = paramString;
  }

  private String v()
  {
    return this.a;
  }

  public static void h(String paramString)
  {
    b = paramString;
  }

  public static boolean i(String paramString)
  {
    return (paramString != null) && (paramString.endsWith(b));
  }

  public ActionMap C()
  {
    return this.f.c().getActionMap();
  }

  public boolean b(String paramString, int paramInt)
  {
    return a(paramString, paramInt, null);
  }

  private static boolean a(InputStream paramInputStream1, InputStream paramInputStream2)
  {
    int i1;
    int i2;
    try
    {
      while ((i1 = paramInputStream1.read()) != -1)
      {
        if ((i2 = paramInputStream2.read()) == -1)
          return false;
        if (i1 != i2)
          return false;
      }
      i2 = paramInputStream2.read();
    }
    catch (IOException localIOException)
    {
      return false;
    }
    return i1 == i2;
  }

  public bw bd()
  {
    return this.f;
  }

  public String bg()
  {
    return bd().k();
  }

  public static void a(String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    i.b(paramString2, paramInt2, paramString1, paramInt1);
  }

  public void c(String paramString1, int paramInt, String paramString2)
  {
    i.b(paramString1, paramInt, paramString2, this.o);
  }

  public abstract InputStream b(String paramString1, int paramInt, String paramString2);

  protected abstract int w();

  protected abstract void d(int paramInt);

  protected abstract void a(String paramString1, String paramString2);

  static void a(x paramx, Integer paramInteger)
  {
    paramx.a(paramInteger);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.x
 * JD-Core Version:    0.6.0
 */