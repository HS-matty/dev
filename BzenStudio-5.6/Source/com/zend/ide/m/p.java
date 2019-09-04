package com.zend.ide.m;

import com.zend.ide.n.bw;
import com.zend.ide.util.cl;

class p
  implements Runnable
{
  final bw b;
  final int a;
  final int c;

  p(bw parambw, int paramInt1, int paramInt2)
  {
  }

  public void run()
  {
    try
    {
      this.b.select(this.a, this.a + this.c);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.m.p
 * JD-Core Version:    0.6.0
 */