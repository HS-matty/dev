package com.zend.ide.util.c;

import com.zend.ide.util.ba;
import com.zend.ide.util.cl;
import java.util.Timer;
import java.util.TimerTask;

class j
  implements d, f, Runnable
{
  private d a;
  private Object b = null;
  private Thread d = null;
  private boolean e = false;
  private TimerTask f;
  private boolean g = false;
  final h h;

  public j(h paramh, d paramd)
  {
    this.a = paramd;
  }

  public Object k()
  {
    run();
    return this.b;
  }

  public void run()
  {
    synchronized (this)
    {
      this.d = Thread.currentThread();
      this.e = false;
    }
    try
    {
      this.b = this.a.k();
    }
    catch (java.lang.Exception )
    {
      cl.a(__x);
      this.b = __x;
    }
    synchronized (this)
    {
      this.e = true;
      this.d = null;
    }
  }

  public boolean g()
  {
    synchronized (h.a(this.h))
    {
      if (!h.a(this.h).c(this))
      {
        h.a(this.h).a(this);
        return true;
      }
    }
    return false;
  }

  public boolean i()
  {
    synchronized (h.a(this.h))
    {
      return h.a(this.h).c(this);
    }
  }

  public boolean f()
  {
    synchronized (h.a(this.h))
    {
      if (i())
      {
        h.a(this.h).b(this);
        return true;
      }
      return false;
    }
  }

  public synchronized void a(long paramLong1, long paramLong2)
  {
    this.g = true;
    if (this.f != null)
      this.f.cancel();
    this.f = new b(this);
    h.a().schedule(this.f, paramLong1, paramLong2);
  }

  public boolean e()
  {
    return this.g;
  }

  public synchronized void d()
  {
    if (this.f != null)
    {
      this.f.cancel();
      this.g = false;
    }
  }

  public Object b()
  {
    h.a(this.h).b(this);
    return k();
  }

  public synchronized boolean a()
  {
    if (j())
    {
      this.d.interrupt();
      return true;
    }
    boolean bool = f();
    return bool;
  }

  public synchronized boolean j()
  {
    return this.d != null;
  }

  public void h()
  {
    new Thread(this).start();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.c.j
 * JD-Core Version:    0.6.0
 */