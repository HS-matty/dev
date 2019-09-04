package com.zend.ide.s;

import javax.swing.text.Segment;

public class lb
  implements bk
{
  private static final char[] a = a("");
  private static final int[] b = { 0, 1 };
  private static final int[] c = a();
  private static final String[] d = { "Unkown internal scanner error", "Internal error: unknown state", "Error: could not match input", "Error: pushback value was too large" };
  private static final byte[] e = { 0, 9 };
  private int f;
  private int g = 0;
  private char[] h = new char[16384];
  private int i;
  private int k;
  private int l;
  private int m;
  private boolean p;
  private int q = -1;
  private Object j = new yb(this);

  public lb(int paramInt)
  {
    c(paramInt);
  }

  public Object c()
  {
    d();
    return b();
  }

  public Object b()
  {
    return this.j;
  }

  public int d()
  {
    int n = s();
    int i1 = n;
    while (n != -1)
    {
      i1 = n;
      n = s();
    }
    return i1;
  }

  public int a(int paramInt)
  {
    if (this.q + paramInt < this.i)
      throw new RuntimeException("Bad offset");
    for (int n = s(); (this.i < this.q + paramInt) && (n != -1); n = s());
    return n;
  }

  public int e()
  {
    return this.i;
  }

  public int f()
  {
    return this.q;
  }

  public void a(int paramInt1, int paramInt2, Segment paramSegment)
  {
    if (paramInt1 + paramInt2 > this.m)
      throw new RuntimeException("bad segment !!");
    paramSegment.array = this.h;
    paramSegment.offset = paramInt1;
    paramSegment.count = paramInt2;
  }

  public void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.h = paramArrayOfChar;
    this.k = paramInt1;
    this.i = paramInt1;
    this.m = (paramInt1 + paramInt2);
    this.l = paramInt1;
    this.p = (this.k >= this.m);
    this.q = paramInt1;
  }

  public void a(Segment paramSegment)
  {
    a(paramSegment.array, paramSegment.offset, paramSegment.count);
  }

  public void a(Object paramObject)
  {
    ((bl)paramObject).a(this);
  }

  private static int[] a()
  {
    int[] arrayOfInt = new int[2];
    int n = 0;
    n = a("", n, arrayOfInt);
    return arrayOfInt;
  }

  private static int a(String paramString, int paramInt, int[] paramArrayOfInt)
  {
    int n = 0;
    int i1 = paramInt;
    int i2 = paramString.length();
    while (n < i2)
    {
      int i3 = paramString.charAt(n++);
      int i4 = paramString.charAt(n++);
      i4--;
      do
      {
        paramArrayOfInt[(i1++)] = i4;
        i3--;
      }
      while (i3 > 0);
    }
    return i1;
  }

  private static char[] a(String paramString)
  {
    char[] arrayOfChar = new char[65536];
    int n = 0;
    int i1 = 0;
    while (n < 6)
    {
      int i2 = paramString.charAt(n++);
      int i3 = paramString.charAt(n++);
      do
      {
        arrayOfChar[(i1++)] = i3;
        i2--;
      }
      while (i2 > 0);
    }
    return arrayOfChar;
  }

  private boolean b()
  {
    return this.k >= this.m;
  }

  public final void c(int paramInt)
  {
    this.g = paramInt;
  }

  private void d(int paramInt)
  {
    String str;
    try
    {
      str = d[paramInt];
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      str = d[0];
    }
    throw new Error(str);
  }

  public int s()
  {
    int i5 = this.m;
    char[] arrayOfChar1 = this.h;
    char[] arrayOfChar2 = a;
    int[] arrayOfInt1 = c;
    int[] arrayOfInt2 = b;
    byte[] arrayOfByte = e;
    while (true)
    {
      int i4 = this.i;
      int i1 = -1;
      int i2;
      int i3 = i2 = this.k = this.l = i4;
      this.f = this.g;
      int n;
      while (true)
      {
        if (i2 < i5)
        {
          n = arrayOfChar1[(i2++)];
        }
        else
        {
          if (this.p)
          {
            n = -1;
            break;
          }
          this.k = i2;
          this.i = i4;
          boolean bool = b();
          i2 = this.k;
          i4 = this.i;
          arrayOfChar1 = this.h;
          i5 = this.m;
          if (bool)
          {
            n = -1;
            break;
          }
          n = arrayOfChar1[(i2++)];
        }
        int i6 = arrayOfInt1[(arrayOfInt2[this.f] + arrayOfChar2[n])];
        if (i6 == -1)
          break;
        this.f = i6;
        int i7 = arrayOfByte[this.f];
        if ((i7 & 0x1) == 1)
        {
          i1 = this.f;
          i4 = i2;
          if ((i7 & 0x8) == 8)
            break;
        }
      }
      this.i = i4;
      switch (i1)
      {
      case 1:
        return bb.Yb;
      case 3:
        break;
      default:
        if ((n == -1) && (this.l == this.k))
        {
          this.p = true;
          return -1;
        }
        d(2);
      }
    }
  }

  static int a(lb paramlb)
  {
    return paramlb.g;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.lb
 * JD-Core Version:    0.6.0
 */