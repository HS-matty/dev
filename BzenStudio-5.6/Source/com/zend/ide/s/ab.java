package com.zend.ide.s;

import com.zend.ide.b.d;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkEvent.EventType;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;

class ab
  implements HyperlinkListener
{
  long a = 0L;
  final h b;
  final n c;

  ab(n paramn, h paramh)
  {
  }

  public void hyperlinkUpdate(HyperlinkEvent paramHyperlinkEvent)
  {
    if (paramHyperlinkEvent.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
    {
      if (h.a(this.c.i).a(paramHyperlinkEvent.getDescription()))
      {
        int i = paramHyperlinkEvent.getSourceElement().getStartOffset();
        int j = paramHyperlinkEvent.getSourceElement().getEndOffset();
        int k = j - i;
        String str = null;
        try
        {
          str = paramHyperlinkEvent.getSourceElement().getDocument().getText(i, k);
        }
        catch (BadLocationException localBadLocationException)
        {
        }
        d locald = h.a(this.c.i).a(n.c(this.c), paramHyperlinkEvent.getDescription(), str);
        if (locald != null)
        {
          n.a(this.c).a(locald.e() ? 0 : 1);
          boolean bool = (locald.e()) && ((locald.b() == null) || (locald.b().equals("")));
          n.a(this.c).d(bool);
          this.c.a(locald, true);
          n.d(this.c).a(n.c(this.c));
        }
        return;
      }
      this.c.b();
      long l = System.currentTimeMillis();
      if (l <= this.a + 500L)
        return;
      this.a = l;
      n.a(this.c, null);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.ab
 * JD-Core Version:    0.6.0
 */