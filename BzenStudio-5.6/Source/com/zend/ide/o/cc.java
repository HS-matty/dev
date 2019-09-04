package com.zend.ide.o;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class cc
  implements PropertyChangeListener
{
  final fn a;

  private cc(fn paramfn)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    fn.c(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  cc(fn paramfn, cq paramcq)
  {
    this(paramfn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.cc
 * JD-Core Version:    0.6.0
 */