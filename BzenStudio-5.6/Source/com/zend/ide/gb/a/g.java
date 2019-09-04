package com.zend.ide.gb.a;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class g
  implements DocumentListener
{
  final pb a;

  g(pb parampb)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    pb.a(this.a, pb.b(this.a));
    this.a.b();
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    pb.a(this.a, pb.b(this.a));
    this.a.b();
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
    pb.a(this.a, pb.b(this.a));
    this.a.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.g
 * JD-Core Version:    0.6.0
 */