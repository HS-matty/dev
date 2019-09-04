package com.zend.ide.v;

import java.io.Serializable;

public class o
  implements Serializable
{
  private p[] a = new p[0];
  private int b = 0;

  public void a(p[] paramArrayOfp, int paramInt)
  {
    this.a = paramArrayOfp;
    this.b = paramInt;
  }

  public p[] c()
  {
    return this.a;
  }

  public int b()
  {
    if (this.b < 0)
      this.b = 0;
    return this.b;
  }

  public void a(int paramInt)
  {
    this.b = paramInt;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.o
 * JD-Core Version:    0.6.0
 */