package com.zend.ide.o;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ct
  implements PropertyChangeListener
{
  final fn a;

  private ct(fn paramfn)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    fn.e(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  ct(fn paramfn, cq paramcq)
  {
    this(paramfn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.ct
 * JD-Core Version:    0.6.0
 */