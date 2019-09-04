package com.zend.ide.util;

import com.zend.ide.util.a.b;
import com.zend.ide.util.c.d;
import java.util.Enumeration;

class bw
  implements Runnable, d
{
  private boolean b;
  final es a;

  public bw(es parames, boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public Object k()
  {
    run();
    return null;
  }

  public void run()
  {
    try
    {
      this.a.e();
      if (!this.b)
        return;
      Enumeration localEnumeration = this.a.children();
      if (localEnumeration == null)
        return;
      while (localEnumeration.hasMoreElements())
      {
        es locales = (es)localEnumeration.nextElement();
        if (locales.a)
          this.a.c.a(locales, this.a.c.h, true);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      b.a(localRuntimeException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.bw
 * JD-Core Version:    0.6.0
 */