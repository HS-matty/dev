package com.zend.ide.r;

import com.zend.ide.p.w;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class t extends KeyAdapter
{
  final y a;

  t(y paramy)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 10)
      y.a(this.a).doClick();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.t
 * JD-Core Version:    0.6.0
 */