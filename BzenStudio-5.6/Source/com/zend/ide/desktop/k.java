package com.zend.ide.desktop;

import com.zend.ide.bd.c;
import com.zend.ide.util.g;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkEvent.EventType;
import javax.swing.event.HyperlinkListener;

class k
  implements HyperlinkListener
{
  long a = 0L;

  public void hyperlinkUpdate(HyperlinkEvent paramHyperlinkEvent)
  {
    if (paramHyperlinkEvent.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
    {
      long l = System.currentTimeMillis();
      if (l <= this.a + 500L)
        return;
      this.a = l;
      c.b().e().a("http://www.zend.com", false);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.k
 * JD-Core Version:    0.6.0
 */