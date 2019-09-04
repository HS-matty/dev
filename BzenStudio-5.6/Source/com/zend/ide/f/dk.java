package com.zend.ide.f;

import com.zend.ide.b.m;
import java.io.Serializable;

final class dk
  implements m, Serializable
{
  private String a;
  private int b;
  private int c;
  private int d;
  private int e;

  public dk(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
  }

  public final String c()
  {
    return this.a;
  }

  public final int d()
  {
    return this.b;
  }

  public final int e()
  {
    return this.c;
  }

  final void a(int paramInt)
  {
    this.c = paramInt;
  }

  public final int f()
  {
    return this.d;
  }

  public final int b()
  {
    return this.e;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof Serializable))
      return false;
    m localm = (Serializable)paramObject;
    return (this.b == localm.d()) && (this.c == localm.e()) && (this.d == localm.f()) && (this.a.equals(localm.c()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.dk
 * JD-Core Version:    0.6.0
 */