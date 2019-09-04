package com.zend.ide.n;

import java.awt.Color;

public class bd
  implements hk, Cloneable
{
  private Color a;
  private Color b;
  private int c;
  private boolean d;
  private int e;
  private boolean f = false;

  public Color b()
  {
    return this.a;
  }

  public void a(Color paramColor)
  {
    this.a = paramColor;
  }

  public Color c()
  {
    return this.b;
  }

  public boolean d()
  {
    return this.f;
  }

  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public void b(Color paramColor)
  {
    this.b = paramColor;
  }

  public void a(int paramInt)
  {
    this.c = paramInt;
  }

  public int e()
  {
    return this.c;
  }

  public void b(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public boolean f()
  {
    return this.d;
  }

  public void b(int paramInt)
  {
    this.e = paramInt;
  }

  public int g()
  {
    return this.e;
  }

  public Object clone()
  {
    bd localbd = new bd();
    localbd.b(this.b);
    localbd.a(this.c);
    localbd.a(this.a);
    localbd.b(this.e);
    localbd.b(this.d);
    localbd.a(this.f);
    return localbd;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Cloneable))
    {
      bd localbd = (bd)paramObject;
      return ((this.b != null) && (localbd.c() != null) && (this.b.equals(localbd.c()))) || ((this.b == localbd.c()) && (this.c == localbd.e()) && (this.a.equals(localbd.b())) && (this.d == localbd.f()) && (this.f == localbd.d()));
    }
    return false;
  }

  public String toString()
  {
    return "tokenNumber = " + this.e + ", foreground = " + this.a + ", background = " + this.b + ", underline = " + this.d + ", fontStyle = " + this.c + ", backgroundExists = " + this.f;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.bd
 * JD-Core Version:    0.6.0
 */