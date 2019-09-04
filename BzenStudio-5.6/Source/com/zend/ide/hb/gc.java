package com.zend.ide.hb;

import com.zend.ide.util.cl;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

class gc
  implements DocumentListener
{
  final wc a;

  gc(wc paramwc)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    try
    {
      wc.a(this.a, paramDocumentEvent.getDocument().getText(0, wc.a(this.a).getDocument().getLength()));
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    try
    {
      fc.a(this.a.h, fc.a());
      wc.a(this.a, paramDocumentEvent.getDocument().getText(0, wc.a(this.a).getDocument().getLength()));
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.gc
 * JD-Core Version:    0.6.0
 */