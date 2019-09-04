package com.zend.ide.s;

import com.zend.ide.b.d;
import java.util.ArrayList;

class cb
{
  private ArrayList a = new ArrayList(0);
  private d b;
  private int c = -1;
  final n d;

  public cb(n paramn)
  {
  }

  public void a()
  {
    this.a.clear();
    this.b = null;
    this.c = -1;
  }

  public void a(d paramd)
  {
    if ((this.b != null) && (this.b.equals(paramd)))
    {
      f();
      return;
    }
    this.b = paramd;
    this.a.add(++this.c, this.b);
    for (int i = this.c + 1; i < this.a.size(); i++)
      this.a.remove(i);
    f();
  }

  public boolean b()
  {
    return this.c > 0;
  }

  public void c()
  {
    if (!b())
      return;
    d locald = (d)this.a.get(--this.c);
    this.b = locald;
    n.a(this.d, this.b);
    this.d.a(this.b, true);
    f();
  }

  public boolean d()
  {
    return (this.c > -1) && (this.c < this.a.size() - 1);
  }

  public void e()
  {
    if (!d())
      return;
    d locald = (d)this.a.get(++this.c);
    this.b = locald;
    n.a(this.d, this.b);
    this.d.a(this.b, true);
    f();
  }

  private void f()
  {
    n.a(this.d).c(b());
    n.a(this.d).b(d());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.cb
 * JD-Core Version:    0.6.0
 */