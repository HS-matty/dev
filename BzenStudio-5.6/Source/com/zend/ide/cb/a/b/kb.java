package com.zend.ide.cb.a.b;

import com.zend.ide.cb.a.sc;
import com.zend.ide.cb.a.tc;
import com.zend.ide.cb.a.uc;
import com.zend.ide.cb.c.w;
import com.zend.ide.cb.f;
import com.zend.ide.cb.h;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.cb.v;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import java.sql.SQLException;

public class kb
{
  private w a;

  public kb(w paramw)
  {
    this.a = paramw;
  }

  public void a(q paramq)
  {
    uc localuc = null;
    localuc = new uc(this.a, paramq);
    if (paramq.a(false))
    {
      localuc.a(paramq.a() + ct.a(1532));
      this.a.a(localuc, this.a.k());
    }
  }

  public void a(f paramf)
  {
    sc localsc = new sc(this.a);
    try
    {
      localsc.a(paramf.a(), paramf.c());
    }
    catch (SQLException localSQLException)
    {
      if (paramf.c().a(true, true))
        cl.a(localSQLException);
      return;
    }
    tc localtc = new tc(paramf.a(), localsc);
    localtc.a(paramf.d() + ct.a(1532));
    this.a.a(localtc, this.a.k());
  }

  public void a(p paramp)
  {
    sc localsc = new sc(this.a);
    try
    {
      localsc.a(paramp.b(), paramp.c());
    }
    catch (SQLException localSQLException)
    {
      if (paramp.c().a(true, true))
        cl.a(localSQLException);
      return;
    }
    tc localtc = new tc(paramp.a(), localsc);
    localtc.a(paramp.a() + ct.a(1532));
    this.a.a(localtc, this.a.k());
  }

  public void a(v paramv)
  {
    sc localsc = new sc(this.a);
    try
    {
      localsc.a(paramv.c(), paramv.c());
    }
    catch (SQLException localSQLException)
    {
      if (paramv.c().a(true, true))
        cl.a(localSQLException);
      return;
    }
    tc localtc = new tc(paramv.a(), localsc);
    localtc.a(paramv.a() + ct.a(1532));
    this.a.a(localtc, this.a.k());
  }

  public void a(h paramh)
  {
    sc localsc = new sc(this.a);
    try
    {
      localsc.a(paramh.c(), paramh.c());
    }
    catch (SQLException localSQLException)
    {
      if (paramh.c().a(true, true))
        cl.a(localSQLException);
      return;
    }
    tc localtc = new tc(paramh.a(), localsc);
    localtc.a(paramh.a() + ct.a(1532));
    this.a.a(localtc, this.a.k());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.kb
 * JD-Core Version:    0.6.0
 */