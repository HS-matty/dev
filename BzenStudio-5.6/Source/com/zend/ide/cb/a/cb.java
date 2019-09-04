package com.zend.ide.cb.a;

import com.zend.ide.p.w;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;

class cb extends KeyAdapter
{
  final dd a;

  public cb(dd paramdd, JComponent paramJComponent)
  {
    paramJComponent.addKeyListener(this);
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    super.keyPressed(paramKeyEvent);
    if (paramKeyEvent.getKeyCode() == 10)
      if (dd.k(this.a).isEnabled())
        dd.k(this.a).doClick(1);
      else
        Toolkit.getDefaultToolkit().beep();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.cb
 * JD-Core Version:    0.6.0
 */