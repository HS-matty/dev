package com.zend.ide.o;

import com.zend.ide.n.a.e;
import com.zend.ide.n.a.h;

class r
  implements h
{
  final fk a;

  r(fk paramfk)
  {
  }

  public void a(e parame)
  {
    di localdi = (di)parame;
    if (this.a.d())
    {
      String str = this.a.p(localdi.j());
      if (str == null)
        this.a.a(localdi, new q(this.a));
      else
        this.a.a(str, localdi.b(), new q(this.a));
    }
  }

  public void b(e parame)
  {
    if (this.a.d())
    {
      di localdi = (di)parame;
      this.a.a(localdi.c(), fk.b(this.a));
    }
  }

  public void a(e parame, String paramString, Object paramObject1, Object paramObject2)
  {
    if (this.a.d())
    {
      di localdi = (di)parame;
      String str = this.a.p(localdi.j());
      if ((paramString.equals("expression")) || (paramString.equals("fileName")) || (paramString.equals("lineNumber")) || (paramString.equals("lifetime")))
      {
        this.a.a(localdi.c(), fk.b(this.a));
        if (str != null)
        {
          localdi = (di)localdi.clone();
          localdi.a(str);
        }
        this.a.a(localdi, new q(this.a));
      }
      else if (paramString.equals("enable"))
      {
        if (((Boolean)paramObject2).booleanValue())
        {
          if (str != null)
          {
            localdi = (di)localdi.clone();
            localdi.a(str);
          }
          this.a.a(localdi, new q(this.a));
        }
        else
        {
          this.a.a(localdi.c(), fk.b(this.a));
        }
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.r
 * JD-Core Version:    0.6.0
 */