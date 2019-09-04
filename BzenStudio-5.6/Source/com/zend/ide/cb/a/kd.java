package com.zend.ide.cb.a;

import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class kd
  implements PropertyChangeListener
{
  final pd a;

  private kd(pd parampd)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    pd.a(this.a, (Font)paramPropertyChangeEvent.getNewValue());
    this.a.setFont(pd.a(this.a));
  }

  kd(pd parampd, g paramg)
  {
    this(parampd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.kd
 * JD-Core Version:    0.6.0
 */