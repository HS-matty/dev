package com.zend.ide.o;

import com.zend.ide.util.w;
import java.util.Collection;
import java.util.Iterator;

class dt extends w
{
  final g c;

  private dt(g paramg)
  {
  }

  public boolean b()
  {
    Iterator localIterator = fq.a(this.c.g).k().iterator();
    while (localIterator.hasNext())
    {
      di localdi = (di)localIterator.next();
      if (!localdi.i())
        return true;
    }
    return false;
  }

  dt(g paramg, f paramf)
  {
    this(paramg);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.dt
 * JD-Core Version:    0.6.0
 */