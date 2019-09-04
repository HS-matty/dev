package com.zend.ide.z;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class d extends MouseAdapter
{
  final bn a;

  d(bn parambn)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    if ((SwingUtilities.isRightMouseButton(paramMouseEvent)) || (paramMouseEvent.isPopupTrigger()))
      ((x)bn.a(this.a)).e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.d
 * JD-Core Version:    0.6.0
 */