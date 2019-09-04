package com.zend.ide.util.d;

class e
  implements i
{
  int a;
  int b;
  Object c;
  e d;

  protected e(int paramInt1, int paramInt2, Object paramObject, e parame)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramObject;
    this.d = parame;
  }

  protected Object clone()
  {
    return new e(this.a, this.b, this.c, this.d == null ? null : (e)this.d.clone());
  }

  public int c()
  {
    return this.b;
  }

  public Object b()
  {
    return this.c;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof i))
      return false;
    i locali = (i)paramObject;
    return (this.b == 0 ? locali.c() == 0 : this.b == locali.c()) && (this.c == null ? locali.b() == null : this.c.equals(locali.b()));
  }

  public int hashCode()
  {
    return this.a ^ (this.c == null ? 0 : this.c.hashCode());
  }

  public String toString()
  {
    return this.b + "=" + this.c.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.d.e
 * JD-Core Version:    0.6.0
 */