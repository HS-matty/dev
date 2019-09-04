package com.zend.ide.u;

import com.zend.ide.util.c.d;

public class bp
  implements d, Runnable
{
  bh a;

  bp(bh parambh)
  {
    this.a = parambh;
  }

  public Object k()
  {
    run();
    return null;
  }

  public void run()
  {
    this.a.f();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.bp
 * JD-Core Version:    0.6.0
 */