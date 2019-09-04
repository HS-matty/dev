package com.zend.ide.n;

import javax.swing.text.Segment;

class wb extends ub
  implements sb
{
  private int e;
  private int d;

  wb(ho paramho, Segment paramSegment, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramho, paramSegment, paramInt3);
    this.e = paramInt1;
    this.d = paramInt2;
  }

  public int a(int paramInt)
  {
    return this.c + this.e + paramInt;
  }

  protected int b(int paramInt)
  {
    return this.b.offset + this.e + paramInt;
  }

  public int length()
  {
    return this.d;
  }

  public sb a(int paramInt1, int paramInt2)
  {
    return new wb(this.a, this.b, this.e + paramInt1, paramInt2 - paramInt1, this.c);
  }

  public sb b(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0)
      return a(paramInt2, this.d);
    if (paramInt2 == this.d)
      return a(0, paramInt1);
    int[] arrayOfInt = { this.e, paramInt1, this.e + paramInt2, this.d - paramInt2 };
    return new vb(this.a, this.b, arrayOfInt, this.c);
  }

  public String toString()
  {
    return new String(this.b.array, this.b.offset + this.e, this.d);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.wb
 * JD-Core Version:    0.6.0
 */