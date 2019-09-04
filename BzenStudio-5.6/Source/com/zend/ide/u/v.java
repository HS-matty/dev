package com.zend.ide.u;

import java.util.Timer;
import java.util.TimerTask;

class v
{
  static Timer a = new Timer();
  TimerTask b;
  private bi c;

  private v(bi parambi)
  {
    this.c = parambi;
  }

  private synchronized void b()
  {
    c();
    this.b = new fb(this);
    a.schedule(this.b, 60000L, 60000L);
  }

  public synchronized void c()
  {
    if (this.b != null)
      this.b.cancel();
  }

  v(bi parambi, u paramu)
  {
    this(parambi);
  }

  static void a(v paramv)
  {
    paramv.b();
  }

  static bi a(v paramv)
  {
    return paramv.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.v
 * JD-Core Version:    0.6.0
 */