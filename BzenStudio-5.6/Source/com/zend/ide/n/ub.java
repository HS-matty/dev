package com.zend.ide.n;

import javax.swing.text.Segment;

abstract class ub
  implements sb
{
  ho a;
  Segment b;
  int c;

  protected ub(ho paramho, Segment paramSegment, int paramInt)
  {
    this.a = paramho;
    this.b = paramSegment;
    this.c = paramInt;
  }

  public ho a()
  {
    return this.a;
  }

  public char charAt(int paramInt)
  {
    return this.b.array[b(paramInt)];
  }

  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return a(paramInt1, paramInt2);
  }

  protected abstract int b(int paramInt);
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ub
 * JD-Core Version:    0.6.0
 */