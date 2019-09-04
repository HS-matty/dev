package com.zend.ide.n.td.a;

import javax.swing.text.Element;

class j
{
  private static final e[] a = new e[0];
  private e[] b = new e[1];
  private e[] c;
  private int d;
  private int e;
  private int f;
  private Element g;

  public j(Element paramElement)
  {
    this(50, paramElement);
  }

  public j(int paramInt, Element paramElement)
  {
    this.g = paramElement;
    paramInt = Math.max(2, paramInt);
    this.c = a(paramInt);
    this.d = 0;
    this.e = paramInt;
  }

  protected e[] a(int paramInt)
  {
    return new e[paramInt];
  }

  protected int a()
  {
    e[] arrayOfe = d();
    return arrayOfe.length;
  }

  public e b(int paramInt)
  {
    int i = e();
    if (paramInt < i)
      return this.c[paramInt];
    int j = f();
    paramInt += j - i;
    return this.c[paramInt];
  }

  public void a(e parame, int paramInt)
  {
    this.b[0] = parame;
    a(paramInt, 0, this.b, 1);
  }

  public void a(e parame)
  {
    a(parame, b());
  }

  public void c(int paramInt)
    throws IndexOutOfBoundsException
  {
    a(paramInt, 1);
  }

  public void a(int paramInt1, int paramInt2)
    throws IndexOutOfBoundsException
  {
    if (paramInt1 + paramInt2 > b())
      throw new IndexOutOfBoundsException("Invalid remove");
    a(paramInt1, paramInt2, a, 0);
  }

  public int b()
  {
    return this.f;
  }

  public void c()
  {
    this.f = 0;
    for (int i = 0; i < this.c.length; i++)
      this.c[i] = null;
  }

  public void a(int paramInt1, int paramInt2, e[] paramArrayOfe, int paramInt3)
  {
    a(paramInt1, paramInt2, paramArrayOfe, paramInt3);
  }

  public int d(int paramInt)
  {
    if (this.f == 0)
      return -1;
    int i = -1;
    if (this.f > 16)
      i = c(this, this.f, paramInt);
    else
      i = a(this, this.f, paramInt);
    i = Math.min(i, this.f - 1);
    for (int j = i - 1; (j >= 0) && (b(j).c() == paramInt); j--)
      i = j;
    return i;
  }

  public int e(int paramInt)
  {
    int i = b(paramInt).c();
    int j = paramInt;
    for (int k = paramInt + 1; (k < this.f) && (b(k).c() == i); k++)
      j = k;
    return j;
  }

  public int f(int paramInt)
  {
    if (this.f == 0)
      return -1;
    int i = -1;
    if (this.f > 16)
      i = d(this, this.f, paramInt);
    else
      i = b(this, this.f, paramInt);
    return i;
  }

  private static int a(j paramj, int paramInt1, int paramInt2)
  {
    int i = 0;
    for (int j = 0; j < paramInt1; j++)
    {
      e locale = paramj.b(j);
      if (locale.c() > paramInt2)
        return i - 1;
      if (locale.c() == paramInt2)
        return i;
      i++;
    }
    return i;
  }

  private static int b(j paramj, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < paramInt1; i++)
    {
      e locale = paramj.b(i);
      if ((locale.a() <= paramInt2) && (locale.b() > paramInt2))
        return i;
    }
    return -1;
  }

  private static int c(j paramj, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = paramInt1 - 1;
    while (i <= j)
    {
      int k = i + j >> 1;
      e locale2 = paramj.b(k);
      int m = locale2.c() - paramInt2;
      if (m < 0)
        i = k + 1;
      else if (m > 0)
        j = k - 1;
      else
        return k;
    }
    if (i < paramj.b())
    {
      e locale1 = paramj.b(i);
      if ((locale1 != null) && (locale1.c() > i) && (i > 0))
        return i - 1;
    }
    return i;
  }

  private static int d(j paramj, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = paramInt1 - 1;
    while (i <= j)
    {
      int k = i + j >> 1;
      e locale2 = paramj.b(k);
      if (paramInt2 < locale2.a())
        j = k - 1;
      else if (paramInt2 >= locale2.b())
        i = k + 1;
      else
        return k;
    }
    if (i < paramj.b())
    {
      e locale1 = paramj.b(i);
      if ((locale1 != null) && (locale1.a() <= paramInt2) && (locale1.b() > paramInt2))
        return i;
    }
    return -1;
  }

  protected e[] d()
  {
    return this.c;
  }

  protected final int e()
  {
    return this.d;
  }

  protected final int f()
  {
    return this.e;
  }

  private void a(int paramInt1, int paramInt2, Object paramObject, int paramInt3)
  {
    int i = paramInt3;
    int j = 0;
    if (paramInt3 == 0)
    {
      b(paramInt1, paramInt2);
      this.f -= paramInt2;
      return;
    }
    if (paramInt2 > paramInt3)
    {
      b(paramInt1 + paramInt3, paramInt2 - paramInt3);
    }
    else
    {
      k = paramInt3 - paramInt2;
      int m = c(paramInt1 + paramInt2, k);
      System.arraycopy(paramObject, paramInt2, this.c, m, k);
      paramInt3 = paramInt2;
    }
    System.arraycopy(paramObject, j, this.c, paramInt1, paramInt3);
    this.f += i - paramInt2;
    int k = paramInt1 + i;
    if (k < this.f)
    {
      e locale1 = b(k);
      int n = locale1.c();
      int i1 = this.g.getElementIndex(locale1.a());
      int i2 = i1 - n;
      if (i2 != 0)
        for (int i3 = k; i3 < this.f; i3++)
        {
          e locale2 = b(i3);
          locale2.a(locale2.c() + i2);
        }
    }
  }

  void b(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
      return;
    int i = paramInt1 + paramInt2;
    int j = this.e - this.d + paramInt2;
    if (i <= this.d)
    {
      if (this.d != i)
        i(i);
      j(this.d - paramInt2);
    }
    else if (paramInt1 >= this.d)
    {
      if (this.d != paramInt1)
        i(paramInt1);
      k(this.d + j);
    }
    else
    {
      j(paramInt1);
      k(this.d + j);
    }
  }

  int c(int paramInt1, int paramInt2)
  {
    int i = this.e - this.d;
    i(paramInt1);
    if (paramInt2 >= i)
    {
      h(a() - i + paramInt2);
      i = this.e - this.d;
    }
    this.d += paramInt2;
    return paramInt1;
  }

  void g(int paramInt)
  {
    e[] arrayOfe = a(paramInt);
    System.arraycopy(this.c, 0, arrayOfe, 0, Math.min(paramInt, a()));
    this.c = arrayOfe;
  }

  protected void h(int paramInt)
  {
    int i = a();
    int j = this.e;
    int k = i - j;
    int m = (paramInt + 1) * 2;
    int n = m - k;
    g(m);
    this.e = n;
    if (k != 0)
      System.arraycopy(this.c, j, this.c, n, k);
  }

  protected void i(int paramInt)
  {
    if (paramInt == this.d)
      return;
    int i = this.d;
    int j = paramInt - i;
    int k = this.e;
    int m = k + j;
    this.d = paramInt;
    this.e = m;
    if (j > 0)
      System.arraycopy(this.c, k, this.c, i, j);
    else if (j < 0)
      System.arraycopy(this.c, paramInt, this.c, m, -j);
  }

  protected void j(int paramInt)
  {
    this.d = paramInt;
  }

  protected void k(int paramInt)
  {
    this.e = paramInt;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer("Pointers Vector {\n");
    for (int i = 0; i < this.f; i++)
    {
      localStringBuffer.append('\t');
      localStringBuffer.append(b(i));
      localStringBuffer.append('\n');
    }
    localStringBuffer.append('}');
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.a.j
 * JD-Core Version:    0.6.0
 */