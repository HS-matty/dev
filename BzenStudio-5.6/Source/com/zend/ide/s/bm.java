package com.zend.ide.s;

public class bm
  implements Cloneable
{
  private byte[] a;
  private int b = -1;

  public bm()
  {
    this(5);
  }

  public bm(int paramInt)
  {
    this.a = new byte[paramInt];
    this.b = -1;
  }

  public boolean h()
  {
    return this.b == -1;
  }

  public int b()
  {
    int i = this.a[this.b];
    this.b -= 1;
    return i;
  }

  public void a(int paramInt)
  {
    this.b += 1;
    if (this.b == this.a.length)
      c();
    this.a[this.b] = (byte)paramInt;
  }

  private void c()
  {
    int i = this.a.length;
    byte[] arrayOfByte = new byte[i * 2];
    System.arraycopy(this.a, 0, arrayOfByte, 0, i);
    this.a = arrayOfByte;
  }

  public int d()
  {
    return this.b = -1;
  }

  public int e()
  {
    return this.b + 1;
  }

  public bm f()
  {
    bm localbm = new bm(e());
    localbm.a(this);
    return localbm;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (!(paramObject instanceof bm)))
      return false;
    bm localbm = (bm)paramObject;
    if (this.b != localbm.b)
      return false;
    for (int i = this.b; i >= 0; i--)
      if (this.a[i] != localbm.a[i])
        return false;
    return true;
  }

  public void a(bm parambm)
  {
    while (parambm.b >= this.a.length)
      c();
    this.b = parambm.b;
    for (int i = 0; i <= parambm.b; i++)
      this.a[i] = parambm.a[i];
  }

  public boolean b(int paramInt)
  {
    for (int i = 0; i <= this.b; i++)
      if (this.a[i] == paramInt)
        return true;
    return false;
  }

  public int c(int paramInt)
  {
    return this.a[paramInt];
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer(50);
    for (int i = 0; i <= this.b; i++)
      localStringBuffer.append(" stack[" + i + "]= " + this.a[i]);
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.bm
 * JD-Core Version:    0.6.0
 */