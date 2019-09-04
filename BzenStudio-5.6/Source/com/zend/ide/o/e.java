package com.zend.ide.o;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class e extends KeyAdapter
{
  final fi a;

  e(fi paramfi)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 10) || (paramKeyEvent.getKeyCode() == 27))
      this.a.setVisible(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.e
 * JD-Core Version:    0.6.0
 */