package com.zend.ide.z;

import com.zend.ide.j.h;
import java.io.File;
import java.io.Serializable;

public class r
  implements Serializable
{
  private String a;
  private String j;
  private String b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private double k = 1000000.0D;

  public r()
  {
  }

  public r(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    b(paramString1);
    a(paramString2);
    a(paramInt1);
    b(paramInt2);
    c(paramInt3);
    d(paramInt4);
    e(paramInt5);
    f(paramInt6);
    g(paramInt7);
  }

  public void a(String paramString)
  {
    this.b = paramString;
  }

  public String k()
  {
    return this.b;
  }

  public void b(String paramString)
  {
    File localFile = h.m.g(paramString);
    this.a = localFile.getName();
    this.j = paramString;
  }

  public String b()
  {
    return this.a;
  }

  public String h()
  {
    return this.j;
  }

  public void a(int paramInt)
  {
    this.c = paramInt;
  }

  public int c()
  {
    return this.c;
  }

  public void b(int paramInt)
  {
    this.d = paramInt;
  }

  public int d()
  {
    return this.d;
  }

  public void c(int paramInt)
  {
    this.e = paramInt;
  }

  public void d(int paramInt)
  {
    this.f = paramInt;
  }

  public void e(int paramInt)
  {
    this.g = paramInt;
  }

  public void f(int paramInt)
  {
    if ((paramInt == 0) && (this.g == 0))
    {
      this.g = this.e;
      this.h = this.f;
    }
    else
    {
      this.h = paramInt;
    }
  }

  public void g(int paramInt)
  {
    this.i = paramInt;
  }

  public int e()
  {
    return this.i;
  }

  public double f()
  {
    double d1 = (this.g * this.k + this.h) / this.k;
    return d1;
  }

  public double i()
  {
    return f() * 1000.0D;
  }

  public double g()
  {
    double d1 = (this.e * this.k + this.f) / this.k;
    return d1;
  }

  public double j()
  {
    return g() * 1000.0D;
  }

  public String toString()
  {
    return this.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.r
 * JD-Core Version:    0.6.0
 */