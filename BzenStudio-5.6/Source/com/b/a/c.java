package com.b.a;

public class c
{
  public int a;
  public int b;
  boolean c = false;
  public int d;
  public int e;
  public Object f;

  public c(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    this(paramInt1);
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramObject;
  }

  public c(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = null;
  }

  public c(int paramInt)
  {
    this(paramInt, -1);
    this.d = -1;
    this.e = -1;
    this.f = null;
  }

  public c(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }

  public String toString()
  {
    return "#" + this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.b.a.c
 * JD-Core Version:    0.6.0
 */