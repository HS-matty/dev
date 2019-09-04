package com.zend.ide.d;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;

class l extends MouseAdapter
{
  final nd a;

  l(nd paramnd)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    if (this.a.isEnabled())
      this.a.setBorder(BorderFactory.createLoweredBevelBorder());
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    if (this.a.isEnabled())
      this.a.setBorder(BorderFactory.createRaisedBevelBorder());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.l
 * JD-Core Version:    0.6.0
 */