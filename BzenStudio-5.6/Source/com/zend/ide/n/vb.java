package com.zend.ide.n;

import javax.swing.text.Segment;

class vb extends ub
  implements sb
{
  private int[] d;
  private int e = -1;

  vb(ho paramho, Segment paramSegment, int[] paramArrayOfInt, int paramInt)
  {
    super(paramho, paramSegment, paramInt);
    this.d = paramArrayOfInt;
  }

  public int length()
  {
    if (this.e == -1)
    {
      int i = 0;
      for (int j = 1; j < this.d.length; j += 2)
        i += this.d[j];
      this.e = i;
    }
    return this.e;
  }

  public int a(int paramInt)
  {
    int i = this.c;
    for (int j = 0; j < this.d.length; j += 2)
    {
      if (paramInt - this.d[(j + 1)] < 0)
      {
        i += this.d[j] + paramInt;
        break;
      }
      paramInt -= this.d[(j + 1)];
    }
    return i;
  }

  protected int b(int paramInt)
  {
    int i = this.b.offset;
    for (int j = 0; j < this.d.length; j += 2)
    {
      if (paramInt - this.d[(j + 1)] < 0)
      {
        i += this.d[j] + paramInt;
        break;
      }
      paramInt -= this.d[(j + 1)];
    }
    return i;
  }

  public sb a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramInt2 == length()))
      return this;
    int i = 0;
    int j = 0;
    int k = 0;
    for (int m = 0; m < this.d.length; m += 2)
    {
      if (k + this.d[(m + 1)] > paramInt1)
      {
        i = m >> 1;
        break;
      }
      k += this.d[(m + 1)];
    }
    m = k;
    for (int n = i << 1; n < this.d.length; n += 2)
    {
      if (m + this.d[(n + 1)] >= paramInt2)
      {
        j = n >> 1;
        break;
      }
      m += this.d[(n + 1)];
    }
    n = j - i + 1;
    if (n == 1)
    {
      int i1 = this.d[(i << 1)] + paramInt1 - k;
      i2 = paramInt2 - paramInt1;
      return new wb(this.a, this.b, i1, i2, this.c);
    }
    int[] arrayOfInt = new int[n << 1];
    arrayOfInt[0] = (this.d[(i << 1)] + paramInt1 - k);
    arrayOfInt[1] = (this.d[((i << 1) + 1)] - (paramInt1 - k));
    for (int i2 = 2; i2 < arrayOfInt.length - 3; i2++)
    {
      arrayOfInt[i2] = this.d[(i2 + (i << 1))];
      arrayOfInt[(i2 + 1)] = this.d[(i2 + (i << 1) + 1)];
    }
    arrayOfInt[(arrayOfInt.length - 2)] = this.d[(j << 1)];
    arrayOfInt[(arrayOfInt.length - 1)] = (paramInt2 - m);
    return new vb(this.a, this.b, arrayOfInt, this.c);
  }

  public sb b(int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    for (int m = 0; m < this.d.length; m += 2)
    {
      if (k + this.d[(m + 1)] > paramInt1)
      {
        i = m >> 1;
        break;
      }
      k += this.d[(m + 1)];
    }
    m = k;
    for (int n = i << 1; n < this.d.length; n += 2)
    {
      if (m + this.d[(n + 1)] >= paramInt2)
      {
        j = n >> 1;
        break;
      }
      m += this.d[(n + 1)];
    }
    n = this.d.length >> 1;
    int i1 = i + n - j + 1;
    int[] arrayOfInt = new int[i1 << 1];
    for (int i2 = 0; i2 < i; i2++)
    {
      arrayOfInt[(i2 << 1)] = this.d[(i2 << 1)];
      arrayOfInt[((i2 << 1) + 1)] = this.d[((i2 << 1) + 1)];
    }
    arrayOfInt[(i2 << 1)] = this.d[(i << 1)];
    arrayOfInt[((i2 << 1) + 1)] = (paramInt1 - k);
    i2++;
    arrayOfInt[(i2 << 1)] = (this.d[(j << 1)] + (paramInt2 - m));
    arrayOfInt[((i2 << 1) + 1)] = (this.d[((j << 1) + 1)] - (paramInt2 - m));
    i2++;
    int i3 = n - i1;
    while (i2 + i3 < n)
    {
      arrayOfInt[(i2 << 1)] = this.d[(i2 + i3 << 1)];
      arrayOfInt[((i2 << 1) + 1)] = this.d[((i2 + i3 << 1) + 1)];
      i2++;
    }
    return new vb(this.a, this.b, arrayOfInt, this.c);
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer(length());
    for (int i = 0; i < this.d.length; i += 2)
      localStringBuffer.append(this.b.array, this.b.offset + this.d[i], this.d[(i + 1)]);
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.vb
 * JD-Core Version:    0.6.0
 */