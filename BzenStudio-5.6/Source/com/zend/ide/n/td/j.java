package com.zend.ide.n.td;

import com.zend.ide.util.cl;

public class j extends i
{
  public j(pb parampb, int paramInt1, int paramInt2)
  {
    super(parampb, paramInt1, paramInt2);
  }

  protected boolean a(gb paramgb)
  {
    if (!paramgb.c())
      return false;
    int i = paramgb.d();
    return (i >= this.b) && (i <= this.c);
  }

  private boolean b(gb paramgb)
  {
    int i = paramgb.d();
    return (i >= this.b) && (i <= this.c);
  }

  protected void d()
  {
    this.j = this.e;
    try
    {
      while (this.d == null)
      {
        if (this.j.b() == 0)
        {
          this.d = null;
          return;
        }
        int i = this.j.c(this.b);
        if (this.j.b() == i)
          i--;
        if (i < 0)
        {
          this.d = null;
          return;
        }
        gb localgb = this.j.b(i);
        if (b(localgb))
          this.d = localgb;
        if (this.i == 0)
        {
          this.f = i;
          if (this.d == null)
            this.g = 0;
          if (localgb.j().b() > 0)
          {
            this.j = localgb.j();
            this.k = this.j;
            this.i = 1;
          }
          else
          {
            b();
            return;
          }
        }
        else if (this.i == 1)
        {
          this.g = i;
          if (this.d == null)
            this.h = 0;
          if (localgb.j().b() > 0)
          {
            this.j = localgb.j();
            this.i = 2;
          }
          else
          {
            b();
            return;
          }
        }
        else
        {
          this.h = i;
          if (this.d == null)
            return;
        }
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      if (a)
        cl.a(localIndexOutOfBoundsException);
      this.d = null;
      return;
    }
    b();
  }

  private void b()
  {
    if (this.d == null)
      c();
    if ((this.d != null) && (!this.d.c()))
      c();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.j
 * JD-Core Version:    0.6.0
 */