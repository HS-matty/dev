package com.zend.ide.o.n;

import com.zend.ide.p.w;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class a extends KeyAdapter
{
  final u a;

  a(u paramu)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 10)
      u.f(this.a).doClick();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.n.a
 * JD-Core Version:    0.6.0
 */