package com.zend.ide.n;

import java.awt.Container;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.SwingUtilities;

class lf
  implements MouseWheelListener
{
  final dm a;

  private lf(dm paramdm)
  {
  }

  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent)
  {
    this.a.i.getParent().getParent().dispatchEvent(paramMouseWheelEvent);
    SwingUtilities.invokeLater(new mf(this));
  }

  lf(dm paramdm, iq paramiq)
  {
    this(paramdm);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.lf
 * JD-Core Version:    0.6.0
 */