package com.zend.ide.fb;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class n
  implements PropertyChangeListener
{
  final l a;

  private n(l paraml)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    l.a(this.a, (String)paramPropertyChangeEvent.getNewValue());
  }

  n(l paraml, m paramm)
  {
    this(paraml);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.n
 * JD-Core Version:    0.6.0
 */