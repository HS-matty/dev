package com.zend.ide.hb;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class j
  implements DocumentListener
{
  final pb a;

  j(pb parampb)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    pb.c(this.a);
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    pb.c(this.a);
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
    pb.c(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.j
 * JD-Core Version:    0.6.0
 */