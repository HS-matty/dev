package com.zend.ide.cb.a;

import com.zend.ide.cb.r;
import com.zend.ide.cb.t;
import com.zend.ide.util.c.d;

class he
  implements d
{
  final oc a;

  he(oc paramoc)
  {
  }

  public Object k()
  {
    r localr = t.a().a(dd.h(this.a.a));
    if (!dd.a(this.a.a, localr))
    {
      dd.a(this.a.a, false);
      return null;
    }
    if (this.a.a.w() == null)
    {
      if (!dd.i(this.a.a))
      {
        dd.a(this.a.a, false);
        return null;
      }
    }
    else if (!dd.j(this.a.a))
    {
      dd.a(this.a.a, false);
      return null;
    }
    dd.a(this.a.a, false);
    this.a.a.dispose();
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.he
 * JD-Core Version:    0.6.0
 */