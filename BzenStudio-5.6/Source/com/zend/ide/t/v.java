package com.zend.ide.t;

import com.zend.ide.util.ba;
import com.zend.ide.util.cl;
import com.zend.ide.util.d.a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

class v
  implements Runnable
{
  private ba a = new ba(100);
  private boolean b = false;
  private boolean c = true;
  private boolean d = true;
  private Thread e;
  private DataOutputStream f;
  private Object g = new Object();
  private ByteArrayOutputStream h = new ByteArrayOutputStream();
  private DataOutputStream i = new DataOutputStream(this.h);
  private Object j = new Object();
  private Object k = new Object();
  final n l;

  public v(n paramn, DataOutputStream paramDataOutputStream)
  {
    this.f = paramDataOutputStream;
    this.c = true;
    this.d = true;
    this.b = false;
    this.e = new Thread(this);
    this.e.setPriority(1);
    this.e.start();
  }

  public synchronized void a(DataOutputStream paramDataOutputStream, boolean paramBoolean)
  {
    if (paramBoolean)
      this.a.c();
    this.f = paramDataOutputStream;
    e();
  }

  public void b(DataOutputStream paramDataOutputStream, boolean paramBoolean)
  {
    if (this.d)
      synchronized (this.k)
      {
        try
        {
          this.k.wait();
        }
        catch (InterruptedException localInterruptedException)
        {
        }
      }
    a(paramDataOutputStream, paramBoolean);
  }

  public synchronized void e()
  {
    synchronized (this.j)
    {
      this.d = true;
      this.c = true;
      this.b = false;
      this.j.notifyAll();
    }
  }

  public synchronized void a(boolean paramBoolean)
  {
    if (!this.d)
      return;
    this.d = false;
    this.c = true;
    this.a.b();
    if (paramBoolean)
      this.a.c();
    synchronized (this.j)
    {
      this.j.notifyAll();
    }
  }

  public void a(g paramg)
  {
    this.a.a(paramg);
  }

  private void a(Object paramObject)
  {
    this.a.a(paramObject);
  }

  public synchronized void b()
  {
    e();
    a(n.a(this.l));
  }

  private synchronized void c()
  {
    if (n.b(this.l) != null)
      n.b(this.l).b();
    a(true);
    synchronized (n.e(this.l))
    {
      Iterator localIterator = n.e(this.l).e().iterator();
      while (localIterator.hasNext())
      {
        r localr = (r)localIterator.next();
        synchronized (localr)
        {
          localr.notifyAll();
        }
      }
    }
    n.e(this.l).c();
    n.d(this.l).c();
    n.c(this.l).clear();
  }

  public void run()
  {
    while (this.c)
    {
      while ((!this.d) && (this.c))
        try
        {
          synchronized (this.j)
          {
            synchronized (this.k)
            {
              this.k.notify();
            }
            this.j.wait();
          }
        }
        catch (InterruptedException localInterruptedException)
        {
        }
      if (!this.c)
        break;
      try
      {
        Object localObject1 = this.a.d();
        synchronized (this)
        {
          try
          {
            if ((localObject1 instanceof p))
            {
              this.l.f().a(localObject1);
            }
            else if ((localObject1 instanceof r))
            {
              int m = ((r)localObject1).b();
              s locals2 = (s)this.l.f().b(localObject1);
              locals2.a(m);
              this.h.reset();
              this.i.writeShort(locals2.g());
              this.i.writeInt(m);
              this.l.b().a(locals2, this.i);
              if (n.a())
                System.out.println("sending message size=" + this.h.size());
              synchronized (this.f)
              {
                this.f.writeInt(this.h.size());
                this.h.writeTo(this.f);
                this.f.flush();
              }
            }
            else if ((localObject1 instanceof s))
            {
              s locals1 = (s)localObject1;
              int n = locals1.b();
              __x = (r)n.e(this.l).c(n);
              w localw = (w)n.c(this.l).remove(Integer.valueOf(n));
              localw.a(__x, locals1);
            }
            else if (localObject1 == this.g)
            {
              synchronized (this.g)
              {
                this.d = false;
                this.g.notifyAll();
                if (this.b)
                {
                  this.c = false;
                  this.a.b();
                }
              }
            }
            else if (localObject1 == n.a(this.l))
            {
              d();
            }
          }
          catch (Exception localException2)
          {
            cl.a(localException2);
          }
        }
      }
      catch (Exception localException1)
      {
        cl.a(localException1);
      }
    }
  }

  private void d()
  {
    c();
    this.l.g().b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.t.v
 * JD-Core Version:    0.6.0
 */