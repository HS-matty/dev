package com.zend.ide.s;

class bh
  implements bl
{
  private String a;
  private be b;
  final bc c;

  public bh(bc parambc, be parambe)
  {
    this.b = parambe;
    this.a = parambc.v;
  }

  public boolean a(int paramInt)
  {
    return this.b.a(paramInt);
  }

  public void a(bk parambk)
  {
    bc localbc = (bc)parambk;
    this.b.a(localbc);
    localbc.v = this.a;
    localbc.u = (this.a == null ? 0 : this.a.length());
  }

  public int c()
  {
    return this.b.c();
  }

  public boolean a(bl parambl)
  {
    if (parambl == this)
      return true;
    if (parambl == null)
      return false;
    if (!(parambl instanceof bh))
      return false;
    return this.b.equals(((bh)parambl).b);
  }

  public boolean equals(Object paramObject)
  {
    if (((paramObject instanceof bh)) && (((bh)paramObject).b.equals(this.b)))
    {
      String str = ((bh)paramObject).a;
      if (this.a == str)
        return true;
      if ((str != null) && (str.equals(this.a)))
        return true;
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.bh
 * JD-Core Version:    0.6.0
 */