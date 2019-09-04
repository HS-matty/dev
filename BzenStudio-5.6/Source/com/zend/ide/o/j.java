package com.zend.ide.o;

import com.zend.ide.i.o;

public class j
{
  private di a;

  public di e()
  {
    return this.a;
  }

  public void b()
  {
    if (this.a == null)
      c();
    else
      d();
  }

  private void c()
  {
    int i = 1;
    o localo = new o();
    while (i != 0)
    {
      localo.setVisible(true);
      if (localo.j())
      {
        this.a = new di();
        a(localo);
        i = 0;
        continue;
      }
      i = 0;
    }
  }

  private void d()
  {
    int i = 1;
    o localo = new o(this.a.g(), this.a.j(), this.a.h(), this.a.b(), this.a.i());
    while (i != 0)
    {
      localo.setVisible(true);
      if (localo.j())
      {
        a(localo);
        i = 0;
        continue;
      }
      i = 0;
    }
  }

  private void a(o paramo)
  {
    if (this.a.f() != paramo.c())
      this.a.c(paramo.c());
    if (this.a.g() != paramo.e())
      this.a.d(paramo.e());
    if (!this.a.h().equalsIgnoreCase(paramo.h()))
      this.a.b(paramo.h());
    if (!this.a.j().equals(paramo.f()))
      this.a.a(paramo.f());
    if (this.a.b() != paramo.g())
      this.a.a(paramo.g());
    if (this.a.i() != paramo.i())
      this.a.c(paramo.i());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.j
 * JD-Core Version:    0.6.0
 */