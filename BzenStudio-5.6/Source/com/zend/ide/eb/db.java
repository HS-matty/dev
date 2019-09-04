package com.zend.ide.eb;

import com.zend.ide.n.gz;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class db
  implements PropertyChangeListener
{
  final k a;

  private db(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    k.l(this.a).setBackground((Color)paramPropertyChangeEvent.getNewValue());
    k.l(this.a).repaint();
  }

  db(k paramk, b paramb)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.db
 * JD-Core Version:    0.6.0
 */