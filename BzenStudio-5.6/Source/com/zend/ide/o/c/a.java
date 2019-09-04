package com.zend.ide.o.c;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class a extends MouseAdapter
{
  final y a;

  a(y paramy)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if ((paramMouseEvent.getClickCount() == 2) && (!SwingUtilities.isRightMouseButton(paramMouseEvent)))
      y.a(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.a
 * JD-Core Version:    0.6.0
 */