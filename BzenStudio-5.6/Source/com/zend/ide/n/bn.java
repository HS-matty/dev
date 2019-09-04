package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class bn
  implements PropertyChangeListener
{
  final bk a;

  private bn(bk parambk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    bk.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
    if (bk.d(this.a))
      bk.b(this.a);
    else
      bk.e(this.a);
  }

  bn(bk parambk, bl parambl)
  {
    this(parambk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.bn
 * JD-Core Version:    0.6.0
 */