package com.zend.ide.s;

class be
  implements bl
{
  private bm a;
  private bm b;
  private boolean h;
  private boolean i;
  private bm f;
  private bm j;
  private byte c = (byte)this.e.a();
  private boolean d = this.e.z == bc.c(this.e);
  private boolean g = this.e.z == bc.f(this.e);
  private boolean k = this.e.z == bc.a(this.e);
  final bc e;

  public be(bc parambc)
  {
    if (!bc.c(parambc).h())
      this.a = bc.c(parambc).f();
    if (!bc.b(parambc).h())
      this.b = bc.b(parambc).f();
    if (!bc.f(parambc).h())
      this.f = bc.f(parambc).f();
    if (!bc.a(parambc).h())
      this.j = bc.a(parambc).f();
    this.h = bc.d(parambc);
    this.i = bc.e(parambc);
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (paramObject == null)
      return false;
    if (!(paramObject instanceof be))
      return false;
    be localbe = (be)paramObject;
    if (localbe.c != this.c)
      return false;
    if ((this.a != null) && (!this.a.equals(localbe.a)))
      return false;
    if ((this.b != null) && (!this.b.equals(localbe.b)))
      return false;
    if ((this.f != null) && (!this.f.equals(localbe.f)))
      return false;
    if ((this.j != null) && (!this.j.equals(localbe.j)))
      return false;
    if (this.h != localbe.h)
      return false;
    if (this.i != localbe.i)
      return false;
    return (this.b == localbe.b) && (this.a == localbe.a) && (this.f == localbe.f) && (this.j == localbe.j);
  }

  public boolean a(bl parambl)
  {
    if (parambl == this)
      return true;
    if (parambl == null)
      return false;
    if (!(parambl instanceof be))
      return false;
    be localbe = (be)parambl;
    if (localbe.c != this.c)
      return false;
    bm localbm1 = b();
    bm localbm2 = localbe.b();
    return (localbm1 == localbm2) || ((localbm1 != null) && (localbm1.equals(localbm2)));
  }

  public int c()
  {
    return this.c;
  }

  protected bm b()
  {
    if (this.d)
      return this.a;
    if (this.g)
      return this.f;
    if (this.k)
      return this.j;
    return this.b;
  }

  public void a(bk parambk)
  {
    bc localbc = (bc)parambk;
    if (this.b == null)
      bc.b(localbc).d();
    else
      bc.b(localbc).a(this.b);
    if (this.f == null)
      bc.f(localbc).d();
    else
      bc.f(localbc).a(this.f);
    bc.a(localbc, this.h);
    if (this.j == null)
      bc.a(localbc).d();
    else
      bc.a(localbc).a(this.j);
    bc.b(localbc, this.i);
    if (this.a == null)
      bc.c(localbc).d();
    else
      bc.c(localbc).a(this.a);
    if (this.d)
      localbc.z = bc.c(localbc);
    else if (this.g)
      localbc.z = bc.f(localbc);
    else if (this.k)
      localbc.z = bc.a(localbc);
    else
      localbc.z = bc.b(localbc);
    localbc.f(this.c);
  }

  public boolean a(int paramInt)
  {
    if (this.c == paramInt)
      return true;
    bm localbm = b();
    if (localbm == null)
      return false;
    return localbm.b(paramInt);
  }

  public String toString()
  {
    bm localbm = b();
    String str = localbm == null ? "null" : localbm.toString();
    return "Stack: " + str + ", currState: " + this.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.be
 * JD-Core Version:    0.6.0
 */