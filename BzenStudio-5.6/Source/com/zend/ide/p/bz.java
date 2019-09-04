package com.zend.ide.p;

import com.zend.ide.bd.c;
import com.zend.ide.util.g;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkEvent.EventType;
import javax.swing.event.HyperlinkListener;

class bz
  implements HyperlinkListener
{
  long a = 0L;
  final cb b;

  bz(cb paramcb)
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
      c.b().e().a(paramHyperlinkEvent.getDescription(), false);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bz
 * JD-Core Version:    0.6.0
 */