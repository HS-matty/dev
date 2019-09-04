package com.zend.ide.s;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class cm
  implements DocumentListener
{
  final db a;

  cm(db paramdb)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    changedUpdate(paramDocumentEvent);
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    changedUpdate(paramDocumentEvent);
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
    if (!db.g)
      db.a(this.a).j();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.cm
 * JD-Core Version:    0.6.0
 */