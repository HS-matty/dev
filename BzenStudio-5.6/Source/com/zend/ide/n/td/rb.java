package com.zend.ide.n.td;

import java.util.Iterator;
import java.util.List;

public class rb
{
  private pb a = new pb();
  private sb b = new sb(this);

  public gb a(int paramInt)
  {
    return this.a.e(paramInt);
  }

  public List b(int paramInt)
  {
    return this.a.g(paramInt);
  }

  public gb c(int paramInt)
  {
    return this.a.f(paramInt);
  }

  public void a(List paramList)
  {
    this.a.a(paramList);
  }

  public void b(List paramList)
  {
    this.a.b(paramList);
  }

  public void a()
  {
    this.a.a();
  }

  public void c(List paramList)
  {
    this.b.a(paramList);
  }

  public List b()
  {
    return sb.a(this.b);
  }

  public List c()
  {
    return sb.b(this.b);
  }

  public Iterator d()
  {
    int i = 0;
    int j = 0;
    if (this.a.b() > 0)
    {
      i = this.a.b(0).d();
      j = this.a.b(this.a.b() - 1).e();
    }
    return new k(this.a, i, j);
  }

  public Iterator e()
  {
    int i = 0;
    int j = 0;
    if (this.a.b() > 0)
    {
      i = this.a.b(0).d();
      j = this.a.b(this.a.b() - 1).e();
    }
    return new j(this.a, i, j);
  }

  public Iterator a(int paramInt1, int paramInt2)
  {
    return new j(this.a, paramInt1, paramInt2);
  }

  public Iterator b(int paramInt1, int paramInt2)
  {
    return new k(this.a, paramInt1, paramInt2);
  }

  public gb f()
  {
    if (this.a.b() == 0)
      return null;
    return this.a.b(0);
  }

  public gb g()
  {
    if (this.a.b() == 0)
      return null;
    return this.a.b(this.a.b() - 1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.rb
 * JD-Core Version:    0.6.0
 */