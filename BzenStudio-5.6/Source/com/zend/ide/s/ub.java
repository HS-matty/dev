package com.zend.ide.s;

class ub
  implements bl
{
  private bm a;
  private byte b = (byte)tb.a(this.c);
  final tb c;

  public ub(tb paramtb)
  {
    if (!tb.b(paramtb).h())
      this.a = tb.b(paramtb).f();
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (paramObject == null)
      return false;
    if (!(paramObject instanceof ub))
      return false;
    ub localub = (ub)paramObject;
    if (localub.b != this.b)
      return false;
    return (this.a == null) || (this.a.equals(localub.a));
  }

  public boolean a(bl parambl)
  {
    if (parambl == this)
      return true;
    if (parambl == null)
      return false;
    if (!(parambl instanceof ub))
      return false;
    ub localub = (ub)parambl;
    if (localub.b != this.b)
      return false;
    bm localbm1 = a();
    bm localbm2 = localub.a();
    return (localbm1 == localbm2) || ((localbm1 != null) && (localbm1.equals(localbm2)));
  }

  public int c()
  {
    return this.b;
  }

  protected bm a()
  {
    return this.a;
  }

  public void a(bk parambk)
  {
    tb localtb = (tb)parambk;
    if (this.a == null)
      tb.b(localtb).d();
    else
      tb.b(localtb).a(this.a);
    localtb.d(this.b);
  }

  public boolean a(int paramInt)
  {
    if (this.b == paramInt)
      return true;
    bm localbm = a();
    if (localbm == null)
      return false;
    return localbm.b(paramInt);
  }

  public String toString()
  {
    bm localbm = a();
    String str = this.a == null ? "null" : localbm.toString();
    return "Stack: " + str + ", currState: " + this.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.ub
 * JD-Core Version:    0.6.0
 */