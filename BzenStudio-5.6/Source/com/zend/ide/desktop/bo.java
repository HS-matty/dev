package com.zend.ide.desktop;

import com.zend.ide.util.c.d;
import com.zend.ide.util.c.f;
import com.zend.ide.util.c.h;

class bo
  implements d
{
  private String a;
  private f c;
  private long e = 0L;
  private int f = 500;
  private int g = 6;
  private int h = 0;
  private boolean b = true;
  final be d;

  public bo(be parambe, String paramString)
  {
    this.a = paramString;
  }

  public synchronized void b()
  {
    this.c = be.a(this.d).a(this, false);
  }

  public synchronized void c()
  {
    this.c.d();
    this.c.f();
  }

  public void d()
  {
    this.b = false;
    this.e = System.currentTimeMillis();
    if (!this.c.e())
      this.c.a(this.f, this.f);
  }

  public void e()
  {
    this.b = true;
    this.e = System.currentTimeMillis();
    if (!this.c.e())
      this.c.a(this.f, this.f);
  }

  public Object k()
  {
    long l = System.currentTimeMillis();
    if (l - this.e >= this.f)
    {
      this.c.d();
      if (this.b)
        be.a(this.d, this.a, false);
      else
        be.a(this.d, this.a);
      this.h = 0;
    }
    else
    {
      this.h += 1;
      if (this.h == this.g)
      {
        this.c.d();
        if (this.b)
          be.a(this.d, this.a, false);
        else
          be.a(this.d, this.a);
        this.h = 0;
      }
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.bo
 * JD-Core Version:    0.6.0
 */