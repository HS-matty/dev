package com.zend.ide.bf;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class o
  implements DocumentListener
{
  final m a;

  private o(m paramm)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    if (!m.i(this.a))
      m.b(this.a);
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    if (!m.i(this.a))
      m.b(this.a);
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
    m.b(this.a);
  }

  o(m paramm, n paramn)
  {
    this(paramm);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.o
 * JD-Core Version:    0.6.0
 */