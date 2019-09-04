package com.zend.ide.o.n;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class m
  implements ActionListener
{
  final u a;

  m(u paramu)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    synchronized (u.c(this.a))
    {
      u.d(this.a);
      if (u.e(this.a))
        o.a().f();
      else
        o.a().c();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.n.m
 * JD-Core Version:    0.6.0
 */