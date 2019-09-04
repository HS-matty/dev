package com.zend.ide.r;

import com.zend.ide.p.w;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class x extends KeyAdapter
{
  final bp a;

  x(bp parambp)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 10)
      bp.a(this.a).doClick();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.x
 * JD-Core Version:    0.6.0
 */