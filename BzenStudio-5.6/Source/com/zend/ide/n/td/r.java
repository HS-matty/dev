package com.zend.ide.n.td;

import javax.swing.text.Position;

public class r
  implements gb
{
  private boolean a;
  private Position b;
  private Position c;
  private ob d;
  private pb e;
  private int f;
  private int g;

  public r(boolean paramBoolean, Position paramPosition1, Position paramPosition2)
  {
    this.a = paramBoolean;
    this.b = paramPosition1;
    this.c = paramPosition2;
    this.g = -1;
    this.f = -1;
    c();
  }

  protected void c()
  {
    this.d = d();
    this.e = new pb();
  }

  protected ob d()
  {
    return new w();
  }

  public void a()
  {
    this.a = true;
  }

  public void b()
  {
    this.a = false;
  }

  public boolean c()
  {
    return this.a;
  }

  public int d()
  {
    this.f = this.b.getOffset();
    return this.f;
  }

  public int e()
  {
    this.g = this.c.getOffset();
    return this.g;
  }

  public int f()
  {
    if (this.f < 0)
      return d();
    return this.f;
  }

  public int g()
  {
    if (this.g < 0)
      return e();
    return this.g;
  }

  public int h()
  {
    return e() - d() + 1;
  }

  public ob i()
  {
    return this.d;
  }

  public pb j()
  {
    return this.e;
  }

  public int k()
  {
    return this.e.b();
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if ((paramObject instanceof r))
    {
      r localr = (r)paramObject;
      int i = this.b.getOffset();
      int j = localr.b.getOffset();
      if (i != j)
        return false;
      int k = this.c.getOffset();
      int m = localr.c.getOffset();
      return k == m;
    }
    return false;
  }

  public int hashCode()
  {
    return this.b.hashCode() + this.c.hashCode();
  }

  public int compareTo(Object paramObject)
  {
    gb localgb = (gb)paramObject;
    return d() - localgb.d();
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("BasicFold (");
    localStringBuffer.append(this.b);
    localStringBuffer.append(", ");
    localStringBuffer.append(this.c);
    localStringBuffer.append("), ");
    localStringBuffer.append(c() ? "collapsed" : "expanded");
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.r
 * JD-Core Version:    0.6.0
 */