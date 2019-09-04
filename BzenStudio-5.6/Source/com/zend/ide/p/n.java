package com.zend.ide.p;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JOptionPane;

class n
  implements PropertyChangeListener
{
  final com.zend.ide.i.n a;
  final ba b;

  n(ba paramba, com.zend.ide.i.n paramn)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if ((this.a.isVisible()) && (paramPropertyChangeEvent.getSource() == this.b) && (paramPropertyChangeEvent.getPropertyName().equals("value")) && (paramPropertyChangeEvent.getNewValue() != null) && (paramPropertyChangeEvent.getNewValue() != JOptionPane.UNINITIALIZED_VALUE))
      this.a.setVisible(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.n
 * JD-Core Version:    0.6.0
 */