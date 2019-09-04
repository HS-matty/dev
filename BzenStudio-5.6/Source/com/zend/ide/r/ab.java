package com.zend.ide.r;

import com.zend.ide.p.w;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class ab extends KeyAdapter
{
  final w a;
  final bq b;

  ab(bq parambq, w paramw)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 10)
      this.a.doClick();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.ab
 * JD-Core Version:    0.6.0
 */