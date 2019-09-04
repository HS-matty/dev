package com.zend.ide.i;

import javax.swing.SwingUtilities;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkEvent.EventType;
import javax.swing.event.HyperlinkListener;

class t
  implements HyperlinkListener
{
  long a = 0L;
  final y b;

  t(y paramy)
  {
  }

  public void hyperlinkUpdate(HyperlinkEvent paramHyperlinkEvent)
  {
    if (paramHyperlinkEvent.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
    {
      long l = System.currentTimeMillis();
      if (l <= this.a + 700L)
        return;
      this.a = l;
      String str = paramHyperlinkEvent.getDescription();
      SwingUtilities.invokeLater(new ab(this, str));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.t
 * JD-Core Version:    0.6.0
 */