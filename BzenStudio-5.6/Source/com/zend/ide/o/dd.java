package com.zend.ide.o;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class dd
  implements PropertyChangeListener
{
  final db a;

  private dd(db paramdb)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    db.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  dd(db paramdb, dc paramdc)
  {
    this(paramdb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.dd
 * JD-Core Version:    0.6.0
 */