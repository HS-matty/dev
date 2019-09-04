package com.zend.ide.l;

import com.zend.ide.util.ct;
import com.zend.ide.util.f.a;

class ib
  implements Runnable
{
  final bw a;

  ib(bw parambw)
  {
  }

  public void run()
  {
    this.a.validate();
    this.a.repaint();
    if ((bw.a(this.a)[bw.b(this.a)] == bw.c(this.a)) && (a.a.b()))
      bw.b(this.a, ct.a(1542));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.ib
 * JD-Core Version:    0.6.0
 */