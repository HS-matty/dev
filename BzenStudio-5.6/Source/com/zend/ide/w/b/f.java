package com.zend.ide.w.b;

public class f
  implements j
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private q[] h;
  private q[] i;

  public f(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 2))
      throw new IllegalArgumentException("Unfamiliar element type");
    this.e = paramInt;
  }

  public void a(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < paramInt1) || (paramInt2 < 0) || (paramInt1 < 0))
      throw new IllegalArgumentException("The 'to' field cannot be smaller then the 'from' field!");
    this.a = paramInt1;
    this.b = paramInt2;
    this.g = (this.b - this.a + 1);
    this.h = new q[this.g];
  }

  public void b(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < paramInt1) || (paramInt2 < 0) || (paramInt1 < 0))
      throw new IllegalArgumentException("The 'to' field cannot be smaller then the 'from' field!");
    this.c = paramInt1;
    this.d = paramInt2;
    this.f = (this.d - this.c + 1);
    this.i = new q[this.f];
  }

  public int b()
  {
    return this.f;
  }

  public int c()
  {
    return this.g;
  }

  public int f()
  {
    return this.e;
  }

  public q a(int paramInt)
  {
    if (this.h == null)
      throw new IllegalStateException("setLocalEffectedRange should be called first!");
    if ((paramInt < this.a) || (paramInt > this.b))
      throw new IllegalArgumentException("Non existed line number - " + paramInt);
    return this.h[(paramInt - this.a)];
  }

  public q b(int paramInt)
  {
    if (this.i == null)
      throw new IllegalStateException("setRepositoryEffectedRange should be called first!");
    if ((paramInt < this.c) || (paramInt > this.d))
      throw new IllegalArgumentException("Non existed line number - " + paramInt);
    return this.i[(paramInt - this.c)];
  }

  public void a(int paramInt, q paramq)
  {
    if (this.h == null)
      throw new IllegalStateException("setLocalEffectedRange should be called first!");
    if ((paramInt < this.a) || (paramInt > this.b))
      throw new IllegalArgumentException("Non existed line number - " + paramInt);
    this.h[(paramInt - this.a)] = paramq;
  }

  public void b(int paramInt, q paramq)
  {
    if (this.i == null)
      throw new IllegalStateException("setRepositoryEffectedRange should be called first!");
    if ((paramInt < this.c) || (paramInt > this.d))
      throw new IllegalArgumentException("Non existed line number - " + paramInt);
    this.i[(paramInt - this.c)] = paramq;
  }

  public int[] d()
  {
    return new int[] { this.a, this.b };
  }

  public int[] e()
  {
    return new int[] { this.c, this.d };
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer("DefaultDiffElement [");
    switch (f())
    {
    case 2:
      localStringBuffer.append("type=DELETE, ");
      break;
    case 0:
      localStringBuffer.append("type=APPEND, ");
      break;
    case 1:
      localStringBuffer.append("type=CHANGE, ");
      break;
    default:
      localStringBuffer.append("type=Unknown!, ");
    }
    localStringBuffer.append("affected_repository=" + b());
    localStringBuffer.append(", repositoy_change_range=(" + this.c + ',' + this.d + ')');
    localStringBuffer.append(", affected_local=" + c());
    localStringBuffer.append(", local_change_range=(" + this.a + ',' + this.b + ")]");
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.f
 * JD-Core Version:    0.6.0
 */