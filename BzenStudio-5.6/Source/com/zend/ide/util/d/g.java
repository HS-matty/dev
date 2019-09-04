package com.zend.ide.util.d;

public class g
  implements Cloneable
{
  private int a;
  private int[] b;
  private int c;

  public g()
  {
    this(5);
  }

  public g(int paramInt)
  {
    this.b = new int[paramInt];
    this.a = paramInt;
    this.c = -1;
  }

  public void a(int paramInt)
  {
    this.c += 1;
    b();
    this.b[this.c] = paramInt;
  }

  public void b(int paramInt)
  {
    a(paramInt);
  }

  public int c(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this.c))
      throw new IndexOutOfBoundsException("index must be at range 0.." + this.c + ". got index " + paramInt);
    return this.b[paramInt];
  }

  public int e()
  {
    return this.c + 1;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (!(paramObject instanceof g)))
      return false;
    g localg = (g)paramObject;
    if (this.c != localg.c)
      return false;
    for (int i = this.c; i >= 0; i--)
      if (this.b[i] != localg.b[i])
        return false;
    return true;
  }

  private void b()
  {
    int i = this.b.length;
    if (this.c == this.b.length)
    {
      int[] arrayOfInt = new int[i * 2];
      System.arraycopy(this.b, 0, arrayOfInt, 0, i);
      this.b = arrayOfInt;
    }
  }

  public void a(g paramg)
  {
    this.c = paramg.c;
    for (int i = 0; i <= paramg.c; i++)
      b(paramg.b[i]);
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer(50);
    for (int i = 0; i <= this.c; i++)
      localStringBuffer.append(" stack[" + i + "]= " + this.b[i]);
    return localStringBuffer.toString();
  }

  public Object clone()
  {
    g localg = new g(e());
    localg.a(this);
    return localg;
  }

  public int[] d()
  {
    int[] arrayOfInt = new int[e()];
    return a(arrayOfInt);
  }

  public int[] a(int[] paramArrayOfInt)
  {
    for (int i = 0; i <= this.c; i++)
      paramArrayOfInt[i] = this.b[i];
    return paramArrayOfInt;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.d.g
 * JD-Core Version:    0.6.0
 */