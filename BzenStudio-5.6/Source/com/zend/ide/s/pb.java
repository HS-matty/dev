package com.zend.ide.s;

class pb
  implements bl
{
  private bm a;
  private byte b = (byte)ob.a(this.c);
  final ob c;

  public pb(ob paramob)
  {
    if (!ob.b(paramob).h())
      this.a = ob.b(paramob).f();
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (paramObject == null)
      return false;
    if (!(paramObject instanceof pb))
      return false;
    pb localpb = (pb)paramObject;
    if (localpb.b != this.b)
      return false;
    return (this.a == null) || (this.a.equals(localpb.a));
  }

  public boolean a(bl parambl)
  {
    if (parambl == this)
      return true;
    if (parambl == null)
      return false;
    if (!(parambl instanceof pb))
      return false;
    pb localpb = (pb)parambl;
    if (localpb.b != this.b)
      return false;
    bm localbm1 = a();
    bm localbm2 = localpb.a();
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
    ob localob = (ob)parambk;
    if (this.a == null)
      ob.b(localob).d();
    else
      ob.b(localob).a(this.a);
    localob.d(this.b);
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
 * Qualified Name:     com.zend.ide.s.pb
 * JD-Core Version:    0.6.0
 */