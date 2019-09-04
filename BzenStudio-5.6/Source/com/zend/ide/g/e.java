package com.zend.ide.g;

import com.zend.ide.n.gx;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class e
  implements PropertyChangeListener
{
  final n a;

  private e(n paramn)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.a.setTabSize(((Integer)paramPropertyChangeEvent.getNewValue()).intValue());
    this.a.a.repaint();
  }

  e(n paramn, a parama)
  {
    this(paramn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.g.e
 * JD-Core Version:    0.6.0
 */