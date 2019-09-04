package com.zend.ide.desktop;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class bs
  implements DocumentListener
{
  final ek a;

  private bs(ek paramek)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    ek.a(this.a, System.currentTimeMillis());
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    ek.a(this.a, System.currentTimeMillis());
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
    ek.a(this.a, System.currentTimeMillis());
  }

  bs(ek paramek, eh parameh)
  {
    this(paramek);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.bs
 * JD-Core Version:    0.6.0
 */