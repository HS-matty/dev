package com.zend.ide.v;

import com.zend.ide.n.bw;

class q
  implements Runnable
{
  final int a;
  final bw b;
  final e c;

  q(e parame, int paramInt, bw parambw)
  {
  }

  public void run()
  {
    int i = this.a < 0 ? 0 : this.a;
    this.b.setCaretPosition(i);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.q
 * JD-Core Version:    0.6.0
 */