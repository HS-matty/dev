package com.zend.ide.hb;

import com.zend.ide.util.cl;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

class s
  implements DocumentListener
{
  final rb a;

  s(rb paramrb)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    try
    {
      rb.a(this.a, paramDocumentEvent.getDocument().getText(0, rb.a(this.a).getDocument().getLength()));
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
      rb.a(this.a, paramDocumentEvent.getDocument().getText(0, rb.a(this.a).getDocument().getLength()));
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
 * Qualified Name:     com.zend.ide.hb.s
 * JD-Core Version:    0.6.0
 */