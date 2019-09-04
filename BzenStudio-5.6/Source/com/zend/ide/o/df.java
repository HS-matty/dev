package com.zend.ide.o;

import com.zend.ide.o.d.h;
import com.zend.ide.o.d.i;
import com.zend.ide.o.d.j;
import com.zend.ide.o.d.k;
import com.zend.ide.o.d.p;
import com.zend.ide.o.d.q;
import com.zend.ide.o.d.r;
import com.zend.ide.o.d.t;
import com.zend.ide.o.d.u;
import com.zend.ide.o.d.v;
import com.zend.ide.o.d.y;
import com.zend.ide.t.w;

class df
  implements w
{
  Object a;

  public df(Object paramObject)
  {
    this.a = paramObject;
  }

  public void a(Object paramObject1, Object paramObject2)
  {
    boolean bool = (paramObject2 != null) && (((com.zend.ide.t.s)paramObject2).c() == 0);
    if ((paramObject1 instanceof h))
    {
      h localh = (h)paramObject1;
      di localdi = localh.c();
      String str = de.e(localdi.j());
      int i = localdi.b();
      int j = -1;
      if (paramObject2 != null)
        j = ((v)paramObject2).d();
      ((bk)this.a).a(str, i, j, bool);
    }
    else if ((paramObject1 instanceof j))
    {
      ((bl)this.a).a(((j)paramObject1).c(), bool);
    }
    else if ((paramObject1 instanceof i))
    {
      ((bj)this.a).a(bool);
    }
    else if ((paramObject1 instanceof q))
    {
      ((gc)this.a).d(bool);
    }
    else if ((paramObject1 instanceof k))
    {
      ((bo)this.a).a(((k)paramObject1).c(), bool ? ((y)paramObject2).d() : null, bool);
    }
    else if ((paramObject1 instanceof r))
    {
      ((bu)this.a).e(bool);
    }
    else if ((paramObject1 instanceof t))
    {
      ((bw)this.a).g(bool);
    }
    else if ((paramObject1 instanceof com.zend.ide.o.d.s))
    {
      ((bv)this.a).f(bool);
    }
    else if ((paramObject1 instanceof p))
    {
      ((br)this.a).b(bool);
    }
    else if ((paramObject1 instanceof u))
    {
      ((bs)this.a).c(bool);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.df
 * JD-Core Version:    0.6.0
 */