package com.zend.ide.util;

import javax.swing.JEditorPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkEvent.EventType;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLFrameHyperlinkEvent;

class bm
  implements HyperlinkListener
{
  final ei a;

  bm(ei paramei)
  {
  }

  public void hyperlinkUpdate(HyperlinkEvent paramHyperlinkEvent)
  {
    if (paramHyperlinkEvent.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
    {
      JEditorPane localJEditorPane = (JEditorPane)paramHyperlinkEvent.getSource();
      if ((paramHyperlinkEvent instanceof HTMLFrameHyperlinkEvent))
      {
        HTMLFrameHyperlinkEvent localHTMLFrameHyperlinkEvent = (HTMLFrameHyperlinkEvent)paramHyperlinkEvent;
        HTMLDocument localHTMLDocument = (HTMLDocument)localJEditorPane.getDocument();
        localHTMLDocument.processHTMLFrameHyperlinkEvent(localHTMLFrameHyperlinkEvent);
      }
      else
      {
        try
        {
          localJEditorPane.setPage(paramHyperlinkEvent.getURL());
        }
        catch (Throwable localThrowable)
        {
          cl.a(localThrowable);
        }
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.bm
 * JD-Core Version:    0.6.0
 */