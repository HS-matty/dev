package com.zend.ide.cb.c;

import com.zend.ide.cb.a.n;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class y
  implements PropertyChangeListener
{
  final w a;

  private y(w paramw)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    w.b(this.a).a((Color)paramPropertyChangeEvent.getNewValue());
  }

  y(w paramw, x paramx)
  {
    this(paramw);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.y
 * JD-Core Version:    0.6.0
 */