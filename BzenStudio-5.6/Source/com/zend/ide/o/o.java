package com.zend.ide.o;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class o
  implements PropertyChangeListener
{
  final fk a;

  private o(fk paramfk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    String str = paramPropertyChangeEvent.getPropertyName();
    boolean bool = ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue();
    if (str == "debugging.autoOpenDebugMessagesWindow")
      fk.a(this.a, bool);
    else if (str == "debugging.autoOpenDebugWindow")
      fk.b(this.a, bool);
    else if (str == "debugging.autoOpenOutputWindow")
      fk.d(this.a, bool);
  }

  o(fk paramfk, m paramm)
  {
    this(paramfk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.o
 * JD-Core Version:    0.6.0
 */