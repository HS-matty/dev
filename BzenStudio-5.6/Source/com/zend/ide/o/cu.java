package com.zend.ide.o;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class cu
  implements PropertyChangeListener
{
  final fn a;

  private cu(fn paramfn)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    fn.d(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  cu(fn paramfn, cq paramcq)
  {
    this(paramfn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.cu
 * JD-Core Version:    0.6.0
 */