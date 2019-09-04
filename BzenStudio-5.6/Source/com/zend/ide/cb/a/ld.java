package com.zend.ide.cb.a;

import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JTextField;

class ld
  implements PropertyChangeListener
{
  final yc a;

  private ld(yc paramyc)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    Font localFont = (Font)paramPropertyChangeEvent.getNewValue();
    if (yc.c(this.a) != null)
      yc.c(this.a).setFont(localFont);
  }

  ld(yc paramyc, g paramg)
  {
    this(paramyc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.ld
 * JD-Core Version:    0.6.0
 */