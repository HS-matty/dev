package com.zend.ide.util.c;

import com.zend.ide.util.ba;
import com.zend.ide.util.cl;
import java.io.PrintStream;

class k extends Thread
{
  private boolean a = false;
  private d b;
  final h c;

  private k(h paramh)
  {
  }

  public void run()
  {
    while (!this.a)
      try
      {
        this.b = ((j)h.a(this.c).d());
        if (this.b == null)
          System.out.println("Empty command!");
        this.b.k();
        synchronized (this.b)
        {
          this.b.notify();
        }
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
  }

  public void b()
  {
    this.a = true;
  }

  k(h paramh, i parami)
  {
    this(paramh);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.c.k
 * JD-Core Version:    0.6.0
 */