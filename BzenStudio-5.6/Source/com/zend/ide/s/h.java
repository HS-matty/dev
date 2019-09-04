package com.zend.ide.s;

import com.zend.ide.b.d;
import com.zend.ide.n.bw;
import com.zend.ide.util.cl;
import com.zend.ide.util.cu;

public abstract class h
  implements cu
{
  private bw a;
  private n b = new n(this, null);
  private s c = new s(this, null);
  private z d;
  private z e;

  public void a(bw parambw)
  {
    this.a = parambw;
  }

  protected bw n()
  {
    return this.a;
  }

  public cw c()
  {
    return n.a(this.b);
  }

  public bj a()
  {
    return n.b(this.b);
  }

  public z d()
  {
    return this.d;
  }

  protected void a(z paramz)
  {
    this.d = paramz;
  }

  protected boolean a(boolean paramBoolean)
  {
    if ((this.d != null) && (!this.d.c()))
    {
      n.a(this.b, this.d, paramBoolean);
      return true;
    }
    return false;
  }

  public dj e()
  {
    return s.a(this.c);
  }

  public z f()
  {
    return this.e;
  }

  protected void b(z paramz)
  {
    this.e = paramz;
  }

  protected void g()
  {
    if ((this.e != null) && (!this.e.c()))
      s.a(this.c, this.e);
  }

  public void h()
  {
    this.c.b();
  }

  public void i()
  {
    this.b.b();
  }

  protected void a(d paramd)
  {
    boolean bool1 = e().isShowing();
    h();
    i();
    if (paramd == null)
      paramd = c().A();
    try
    {
      boolean bool2;
      synchronized (this)
      {
        bool2 = this.d.a(paramd);
      }
      if (bool2)
        a(false);
      b(bool1);
    }
    catch (Exception localException)
    {
      cl.a(localException);
      i();
    }
  }

  public abstract void a(boolean paramBoolean);

  public abstract void b(boolean paramBoolean);

  public void j()
  {
    i();
    h();
  }

  static z a(h paramh)
  {
    return paramh.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.h
 * JD-Core Version:    0.6.0
 */