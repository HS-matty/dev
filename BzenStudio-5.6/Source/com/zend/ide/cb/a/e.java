package com.zend.ide.cb.a;

import com.zend.ide.p.w;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;

class e extends KeyAdapter
{
  final cd a;

  public e(cd paramcd, JComponent paramJComponent)
  {
    paramJComponent.addKeyListener(this);
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    super.keyPressed(paramKeyEvent);
    if (paramKeyEvent.getKeyCode() == 10)
      cd.a(this.a).doClick(1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.e
 * JD-Core Version:    0.6.0
 */