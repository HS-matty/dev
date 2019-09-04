package com.zend.ide.hb;

import com.zend.ide.p.w;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class o
  implements DocumentListener
{
  final qb a;

  o(qb paramqb)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    a();
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    a();
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
    a();
  }

  private void a()
  {
    if (!qb.a(this.a).equals(""))
      qb.b(this.a).setEnabled(true);
    else
      qb.b(this.a).setEnabled(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.o
 * JD-Core Version:    0.6.0
 */