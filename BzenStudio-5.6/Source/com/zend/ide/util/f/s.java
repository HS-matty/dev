package com.zend.ide.util.f;

import javax.swing.SwingUtilities;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkEvent.EventType;
import javax.swing.event.HyperlinkListener;

class s
  implements HyperlinkListener
{
  long a = 0L;
  final p b;

  s(p paramp)
  {
  }

  public void hyperlinkUpdate(HyperlinkEvent paramHyperlinkEvent)
  {
    if (paramHyperlinkEvent.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
    {
      long l = System.currentTimeMillis();
      if (l <= this.a + 1000L)
        return;
      this.a = l;
      String str = paramHyperlinkEvent.getDescription();
      SwingUtilities.invokeLater(new t(this, str));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.f.s
 * JD-Core Version:    0.6.0
 */