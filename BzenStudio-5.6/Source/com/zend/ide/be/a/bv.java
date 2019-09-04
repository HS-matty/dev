package com.zend.ide.be.a;

class bv
  implements Comparable
{
  int a;
  int b;

  public bv(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }

  public int compareTo(Object paramObject)
  {
    return this.b - ((bv)paramObject).b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bv
 * JD-Core Version:    0.6.0
 */