package com.zend.ide.n.td;

import com.zend.ide.n.hl;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class wb
  implements PropertyChangeListener
{
  final gc a;

  private wb(gc paramgc)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.a((hl)paramPropertyChangeEvent.getNewValue());
  }

  wb(gc paramgc, vb paramvb)
  {
    this(paramgc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.wb
 * JD-Core Version:    0.6.0
 */