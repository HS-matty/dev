package com.zend.ide.n.td;

import com.zend.ide.util.cl;

public class k extends i
{
  public k(pb parampb, int paramInt1, int paramInt2)
  {
    super(parampb, paramInt1, paramInt2);
  }

  protected boolean a(gb paramgb)
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
        Object localObject = this.j.b(i);
        gb localgb;
        if (a((gb)localObject))
        {
          this.d = ((gb)localObject);
        }
        else if ((((gb)localObject).k() == 0) || (this.i == 2))
        {
          if ((this.j.b() > i + 1) && (this.b <= ((gb)localObject).e()))
          {
            localgb = this.j.b(i + 1);
            if (a(localgb))
            {
              localObject = localgb;
              this.d = ((gb)localObject);
              i++;
            }
          }
        }
        else
        {
          localgb = ((gb)localObject).j().b(0);
          if (a(localgb))
          {
            this.d = localgb;
            if (this.i == 0)
            {
              this.f = i;
              this.j = ((gb)localObject).j();
              this.k = this.j;
              this.i = 1;
              return;
            }
            this.g = i;
            this.j = ((gb)localObject).j();
            this.i = 2;
            return;
          }
        }
        if (this.i == 0)
        {
          this.f = i;
          if (this.d == null)
            this.g = 0;
          if (((gb)localObject).j().b() > 0)
          {
            this.j = ((gb)localObject).j();
            this.k = this.j;
            this.i = 1;
          }
          else
          {
            return;
          }
        }
        else if (this.i == 1)
        {
          this.g = i;
          if (this.d == null)
            this.h = 0;
          if (((gb)localObject).j().b() > 0)
          {
            this.j = ((gb)localObject).j();
            this.i = 2;
          }
          else
          {
            if (this.e.b() > this.f + 1)
            {
              localgb = this.e.b(this.f + 1);
              if (localgb.d() < this.c)
                c();
            }
            return;
          }
        }
        else
        {
          this.h = i;
          if (this.d == null)
          {
            if (this.k.b() > this.g + 1)
            {
              localgb = this.k.b(this.g + 1);
              if (localgb.d() < this.c)
              {
                c();
                return;
              }
            }
            if (this.e.b() > this.f + 1)
            {
              localgb = this.e.b(this.f + 1);
              if (localgb.d() < this.c)
                c();
            }
            return;
          }
        }
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      if (a)
        cl.a(localIndexOutOfBoundsException);
      this.d = null;
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.k
 * JD-Core Version:    0.6.0
 */