package com.zend.ide.s;

import com.zend.ide.util.d.a;
import javax.swing.text.Segment;

public abstract class bc
  implements bk
{
  protected int s = -1;
  protected int t = -1;
  protected int u = 0;
  protected String v = null;
  protected boolean w = true;
  private bm x;
  private bm y;
  private bm r;
  private bm A;
  protected bm z = this.y;
  private boolean B = false;
  private boolean C = false;
  private static a F = new a(100);
  private final int a = kc.h(120);
  private final int b = kc.h(132);
  private final int c = kc.h(129);
  private final int d = kc.h(110);
  private final int e = kc.h(137);
  private final int f = kc.h(143);
  private final int g = kc.h(136);

  protected abstract int a();

  protected abstract int b();

  protected abstract int c();

  protected abstract char[] d();

  public abstract void f(int paramInt);

  public abstract void a(char[] paramArrayOfChar, int paramInt1, int paramInt2);

  public void c(int paramInt)
  {
    this.x = new bm();
    this.y = new bm();
    this.r = new bm();
    this.A = new bm();
    this.z = this.y;
    d(paramInt);
  }

  protected void d(int paramInt)
  {
    f(paramInt);
  }

  protected void r()
  {
    f(this.a);
    if (this.s == bb.cQ)
      j();
    if (this.s == bb.Nb)
      a();
  }

  protected void e(int paramInt)
  {
    this.z.a(a());
    f(paramInt);
  }

  protected void g()
  {
    f(this.z.b());
  }

  protected void h()
  {
    a(this.x, this.b);
  }

  protected void i()
  {
    if (this.B)
      a(this.r, this.c);
    else if (this.C)
      a(this.A, this.d);
    else
      a(this.y, this.a);
    if (this.x.e() == 1)
      this.x.b();
  }

  protected void j()
  {
    this.B = true;
    a(this.r, this.c);
  }

  protected void q()
  {
    this.B = false;
    a(this.y, this.a);
    this.r.d();
  }

  protected void a()
  {
    this.C = true;
    a(this.A, this.d);
  }

  protected void b()
  {
    this.C = false;
    a(this.y, this.a);
    this.A.d();
  }

  private void a(bm parambm, int paramInt)
  {
    this.z.a(a());
    this.z = parambm;
    if (this.z.h())
      d(paramInt);
    else
      d(this.z.b());
  }

  private int m()
  {
    int i = a();
    for (int j = 0; j < this.y.e(); j++)
      i = 31 * i + this.y.c(j);
    for (j = 0; j < this.x.e(); j++)
      i = 31 * i + this.x.c(j);
    for (j = 0; j < this.r.e(); j++)
      i = 31 * i + this.r.c(j);
    for (j = 0; j < this.A.e(); j++)
      i = 31 * i + this.A.c(j);
    if (this.v != null)
      for (j = 0; j < this.v.length(); j++)
        i = 31 * i + this.v.charAt(j);
    return i;
  }

  public Object b()
  {
    int i = m();
    Object localObject = F.b(i);
    if (localObject == null)
    {
      localObject = new be(this);
      int j = a();
      if ((j == this.e) || (j == this.f) || (j == this.g))
        localObject = new bh(this, (be)localObject);
      F.a(i, localObject);
    }
    return localObject;
  }

  public Object c()
  {
    d();
    return b();
  }

  public int d()
  {
    int i = s();
    int j = i;
    while (i != -1)
    {
      j = i;
      i = s();
    }
    return j;
  }

  public int a(int paramInt)
  {
    if (this.t + paramInt < b())
      throw new RuntimeException("Bad offset");
    for (int i = s(); (b() < this.t + paramInt) && (i != -1); i = s());
    return i;
  }

  public int e()
  {
    return b();
  }

  public int f()
  {
    return this.t;
  }

  public void a(int paramInt1, int paramInt2, Segment paramSegment)
  {
    if (paramInt1 + paramInt2 > c())
      throw new RuntimeException("bad segment !!");
    paramSegment.array = d();
    paramSegment.offset = paramInt1;
    paramSegment.count = paramInt2;
  }

  public void a(Segment paramSegment)
  {
    a(paramSegment.array, paramSegment.offset, paramSegment.count);
  }

  public void a(Object paramObject)
  {
    ((bl)paramObject).a(this);
  }

  public void a(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }

  protected static final boolean b(String paramString)
  {
    if (paramString == null)
      return false;
    for (int i = 0; i < paramString.length(); i++)
      if (!Character.isLowerCase(paramString.charAt(i)))
        return false;
    return true;
  }

  static bm c(bc parambc)
  {
    return parambc.x;
  }

  static bm f(bc parambc)
  {
    return parambc.r;
  }

  static bm a(bc parambc)
  {
    return parambc.A;
  }

  static bm b(bc parambc)
  {
    return parambc.y;
  }

  static boolean d(bc parambc)
  {
    return parambc.B;
  }

  static boolean e(bc parambc)
  {
    return parambc.C;
  }

  static boolean a(bc parambc, boolean paramBoolean)
  {
    return parambc.B = paramBoolean;
  }

  static boolean b(bc parambc, boolean paramBoolean)
  {
    return parambc.C = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.bc
 * JD-Core Version:    0.6.0
 */