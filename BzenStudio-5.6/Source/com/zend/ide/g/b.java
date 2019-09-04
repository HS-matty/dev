package com.zend.ide.g;

import com.zend.ide.n.gx;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class b
  implements PropertyChangeListener
{
  final n a;

  private b(n paramn)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.a.setBackground((Color)paramPropertyChangeEvent.getNewValue());
    this.a.a.repaint();
  }

  b(n paramn, a parama)
  {
    this(paramn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.g.b
 * JD-Core Version:    0.6.0
 */