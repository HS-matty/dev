package com.zend.ide.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.io.File;
import java.io.Serializable;
import javax.swing.SwingUtilities;

public class eb
  implements Serializable
{
  private boolean a;
  private boolean b;
  private boolean c;
  private boolean o;
  private boolean d;
  private boolean p;
  private boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  private int i;
  private int j;
  private Color k;
  private int l;
  private int m;
  private String n;
  private boolean q;
  private Font r;

  public eb()
  {
    m();
  }

  public boolean a()
  {
    return this.a;
  }

  public void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public boolean b()
  {
    return this.b;
  }

  public void b(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public boolean c()
  {
    return this.c;
  }

  public void c(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  public boolean f()
  {
    return this.o;
  }

  public void h(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }

  public boolean d()
  {
    return this.d;
  }

  public void d(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public void i(boolean paramBoolean)
  {
    this.p = paramBoolean;
    if ((this.d) && (!paramBoolean))
    {
      d(false);
      this.q = true;
    }
    else if ((paramBoolean) && (!d()) && (this.q))
    {
      d(true);
      this.q = false;
    }
  }

  public boolean h()
  {
    return this.p;
  }

  public boolean e()
  {
    return this.e;
  }

  public void e(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }

  public int f()
  {
    return this.i;
  }

  public void a(int paramInt)
  {
    if ((paramInt != 1) && (paramInt != 0))
      throw new IllegalArgumentException("Wrong orientation key");
    this.i = paramInt;
  }

  public boolean g()
  {
    return this.f;
  }

  public void f(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public void b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 3))
      paramInt = 4;
    this.j = paramInt;
  }

  public Color h()
  {
    return this.k;
  }

  public void a(Color paramColor)
  {
    this.k = paramColor;
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.l = paramInt1;
    this.m = paramInt2;
    this.g = (paramInt1 != paramInt2);
    g(this.g);
  }

  public boolean i()
  {
    return this.g;
  }

  public void g(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public boolean j()
  {
    return this.h;
  }

  public int k()
  {
    return this.l;
  }

  public int l()
  {
    return this.m;
  }

  public void m()
  {
    a(Color.BLUE);
    b(true);
    a(1);
    b(4);
    c(true);
    h(true);
    e(true);
    a(true);
    d(true);
    f(true);
  }

  public int n()
  {
    int i1 = r();
    if (d())
      i1 += 12;
    return i1;
  }

  public int o()
  {
    int i1 = r();
    if (e())
      i1 += 12;
    return i1;
  }

  public int a(FontMetrics paramFontMetrics, int paramInt)
  {
    int i1 = r();
    if (a())
    {
      int i2 = String.valueOf(paramInt).length();
      char[] arrayOfChar = new char[i2];
      for (int i3 = 0; i3 < arrayOfChar.length; i3++)
        arrayOfChar[i3] = 'm';
      String str = new String(arrayOfChar);
      i1 += SwingUtilities.computeStringWidth(paramFontMetrics, str) + 8;
    }
    return i1;
  }

  public int p()
  {
    return r();
  }

  public int q()
  {
    return r();
  }

  private int r()
  {
    int i1 = 0;
    if (b())
      i1 += 5;
    return i1;
  }

  public String s()
  {
    return this.n;
  }

  public void a(String paramString)
  {
    if (paramString != null)
    {
      File localFile = new File(paramString);
      paramString = localFile.getName();
      i(true);
    }
    else
    {
      i(false);
    }
    this.n = paramString;
  }

  public Font i()
  {
    return this.r;
  }

  public void a(Font paramFont)
  {
    this.r = paramFont;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.eb
 * JD-Core Version:    0.6.0
 */