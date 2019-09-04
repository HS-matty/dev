package com.zend.ide.n;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class cx
  implements DocumentListener
{
  final ho a;

  private cx(ho paramho)
  {
  }

  public void b()
  {
    this.a.c(true);
    this.a.removeDocumentListener(this);
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    b();
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    b();
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
  }

  cx(ho paramho, cr paramcr)
  {
    this(paramho);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.cx
 * JD-Core Version:    0.6.0
 */