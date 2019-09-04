package com.zend.ide.z;

import java.io.Serializable;

public class j
  implements Serializable
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f = 0;
  private int g = 0;
  private int h = 1000000;

  public j()
  {
  }

  public j(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    a(paramInt1);
    b(paramInt2);
    c(paramInt3);
    d(paramInt4);
    e(paramInt5);
  }

  public int h()
  {
    return this.a;
  }

  public void a(int paramInt)
  {
    this.a = paramInt;
  }

  public int b()
  {
    return this.b;
  }

  private void b(int paramInt)
  {
    this.b = paramInt;
  }

  public int c()
  {
    return this.c;
  }

  private void c(int paramInt)
  {
    this.c = paramInt;
  }

  public int d()
  {
    return this.d;
  }

  public void d(int paramInt)
  {
    this.d = paramInt;
  }

  public int e()
  {
    return this.e;
  }

  public void e(int paramInt)
  {
    this.e = paramInt;
  }

  public double f()
  {
    double d1 = (this.f * this.h + this.g) / this.h;
    return d1;
  }

  public double g()
  {
    return f() * 1000.0D;
  }

  public void a(long paramLong1, long paramLong2)
  {
    long l1 = this.d;
    long l2 = this.e;
    long l3 = l2 + l1 * this.h;
    long l4 = paramLong2 + paramLong1 * this.h;
    int i = (int)(l4 - l3);
    this.f = (i / this.h);
    this.g = (i % this.h);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.j
 * JD-Core Version:    0.6.0
 */