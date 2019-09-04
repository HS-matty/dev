package com.zend.ide.desktop;

import com.zend.ide.hb.d;
import com.zend.ide.n.bw;

class hc
  implements Runnable
{
  final d a;
  final int b;
  final ca c;

  hc(ca paramca, d paramd, int paramInt)
  {
  }

  public void run()
  {
    co.a(this.c.a).a(this.a.a() - 1, true);
    int i = co.a(this.c.a).getCaretPosition() + this.a.c() + this.a.e();
    co.a(this.c.a).select(i, i + this.b);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.hc
 * JD-Core Version:    0.6.0
 */