package com.zend.ide.desktop;

import com.zend.ide.desktop.e.e;
import com.zend.ide.j.h;
import com.zend.ide.j.s;
import com.zend.ide.l.v;
import com.zend.ide.p.ba;
import com.zend.ide.u.bh;
import com.zend.ide.util.ct;
import java.util.Vector;

class dt
  implements Runnable
{
  final cj b;

  dt(cj paramcj)
  {
  }

  public void run()
  {
    int i = 0;
    int j = 0;
    Vector localVector = new Vector(h.m.a());
    for (int k = 0; k < localVector.size(); k++)
    {
      s locals = (s)localVector.get(k);
      if (!(locals instanceof bh))
        continue;
      this.b.l().a((bh)locals);
      h.m.b(locals);
      i = 1;
    }
    if (cj.c(this.b).e())
    {
      cj.c(this.b).d();
      j = 1;
    }
    if ((i != 0) && (j != 0))
      ba.a(cj.a(this.b).h(), ct.a(1546, "FTP/SQL", "FTP/SQL"), ct.a(1545), 1);
    else if (i != 0)
      ba.a(cj.a(this.b).h(), ct.a(1546, "FTP", "FTP"), ct.a(1545), 1);
    else if (j != 0)
      ba.a(cj.a(this.b).h(), ct.a(1546, "SQL", "SQL"), ct.a(1545), 1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.dt
 * JD-Core Version:    0.6.0
 */