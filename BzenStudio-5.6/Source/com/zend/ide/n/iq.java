package com.zend.ide.n;

import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

class iq
  implements MouseWheelListener
{
  final MouseWheelListener a;
  final dm b;

  iq(dm paramdm, MouseWheelListener paramMouseWheelListener)
  {
  }

  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent)
  {
    if (paramMouseWheelEvent.isControlDown())
    {
      Font localFont = dm.a(this.b).getFont();
      if (paramMouseWheelEvent.getWheelRotation() > 0)
        dm.a(this.b).setFont(localFont.deriveFont(Math.min(72, localFont.getSize() + 1)));
      else
        dm.a(this.b).setFont(localFont.deriveFont(Math.max(7, localFont.getSize() - 1)));
    }
    else if (this.a != null)
    {
      this.a.mouseWheelMoved(paramMouseWheelEvent);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.iq
 * JD-Core Version:    0.6.0
 */