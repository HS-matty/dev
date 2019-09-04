package com.zend.ide.w.c.a;

import com.zend.ide.p.w;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class g
  implements DocumentListener
{
  final hb a;

  g(hb paramhb)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    hb.d(this.a).setEnabled(hb.c(this.a));
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    hb.d(this.a).setEnabled(hb.c(this.a));
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
    hb.d(this.a).setEnabled(hb.c(this.a));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.g
 * JD-Core Version:    0.6.0
 */