package com.zend.ide.be.a;

import com.zend.ide.be.k;
import com.zend.ide.util.c.f;
import com.zend.ide.util.c.h;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JProgressBar;

public class o
  implements k
{
  private String l = "Zend Development Environment";
  private bs a;
  private f b;
  private f c;
  private q d;
  private r e;
  private String f = "";
  private int g = 0;
  private ArrayList h;
  private ArrayList i;
  private String j = "";
  private int k = 1000;

  public o(bs parambs)
  {
    this.a = parambs;
    this.e = new r(this, null);
    this.b = h.c().b(this.e);
    this.d = new q(this, null);
    this.c = h.c().b(this.d);
    parambs.a(this.l);
    this.h = new ArrayList();
    this.i = new ArrayList();
  }

  public void a(JComponent paramJComponent)
  {
    this.a.a(paramJComponent);
  }

  public synchronized void a(String paramString)
  {
    this.h.add(paramString);
    b();
  }

  public synchronized void b(String paramString)
  {
    this.h.remove(paramString);
    if ((this.f.equals(paramString)) && (!this.c.e()))
      b();
  }

  public synchronized void c(String paramString)
  {
    this.i.add(paramString);
    b();
  }

  private synchronized void a(String paramString, boolean paramBoolean)
  {
    this.b.a(500L, 500L);
    this.c.d();
    this.f = paramString;
    if (paramBoolean)
      this.c.a(this.k, this.k);
    this.a.a(paramString);
    this.g = 0;
  }

  private synchronized void b()
  {
    boolean bool = true;
    String str;
    if (!this.j.equals(""))
    {
      str = this.j;
      bool = false;
    }
    else if (this.i.size() > 0)
    {
      if (this.i.remove(this.f))
      {
        b();
        return;
      }
      str = this.i.get(this.i.size() - 1).toString();
    }
    else if (this.h.size() > 0)
    {
      str = this.h.get(this.h.size() - 1).toString();
    }
    else
    {
      this.b.d();
      this.f = this.l;
      this.a.a(this.l);
      return;
    }
    if (!str.equals(this.f))
      a(str, bool);
  }

  private boolean c()
  {
    return this.a.b().equals(this.l);
  }

  private String d()
  {
    String str = "";
    for (int m = 0; m < this.g; m++)
      str = str + ".";
    return str;
  }

  public void a(int paramInt)
  {
    this.a.a().setMaximum(paramInt);
  }

  public void b(int paramInt)
  {
    this.a.a().setValue(paramInt);
  }

  static boolean a(o paramo)
  {
    return paramo.c();
  }

  static String b(o paramo)
  {
    return paramo.f;
  }

  static String c(o paramo)
  {
    return paramo.d();
  }

  static bs d(o paramo)
  {
    return paramo.a;
  }

  static int a(o paramo, int paramInt)
  {
    return paramo.g = paramInt;
  }

  static int e(o paramo)
  {
    return paramo.g;
  }

  static f f(o paramo)
  {
    return paramo.c;
  }

  static void g(o paramo)
  {
    paramo.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.o
 * JD-Core Version:    0.6.0
 */