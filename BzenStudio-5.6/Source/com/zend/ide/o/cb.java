package com.zend.ide.o;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class cb
  implements PropertyChangeListener
{
  final fn a;

  private cb(fn paramfn)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    fn.b(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  cb(fn paramfn, cq paramcq)
  {
    this(paramfn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.cb
 * JD-Core Version:    0.6.0
 */