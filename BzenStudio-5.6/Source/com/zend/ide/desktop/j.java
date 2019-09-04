package com.zend.ide.desktop;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

class j
  implements WindowFocusListener
{
  final du a;

  j(du paramdu)
  {
  }

  public void windowGainedFocus(WindowEvent paramWindowEvent)
  {
    this.a.setVisible(true);
  }

  public void windowLostFocus(WindowEvent paramWindowEvent)
  {
    if ((paramWindowEvent.getOppositeWindow() == null) || (!paramWindowEvent.getOppositeWindow().equals(paramWindowEvent.getWindow())))
      this.a.setVisible(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.j
 * JD-Core Version:    0.6.0
 */