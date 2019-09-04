package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

class hj
  implements PropertyChangeListener, DocumentListener
{
  final hb a;

  hj(hb paramhb)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    hb.a(this.a, true);
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    hb.a(this.a, true);
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    Object localObject1 = paramPropertyChangeEvent.getOldValue();
    if ((localObject1 != null) && ((localObject1 instanceof Document)))
      ((Document)localObject1).removeDocumentListener(this);
    Object localObject2 = paramPropertyChangeEvent.getNewValue();
    if ((localObject2 != null) && ((localObject2 instanceof Document)))
      ((Document)localObject2).addDocumentListener(this);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hj
 * JD-Core Version:    0.6.0
 */