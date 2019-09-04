package com.zend.ide.g;

import com.zend.ide.d.co;
import com.zend.ide.n.gx;
import com.zend.ide.y.m;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class d
  implements PropertyChangeListener
{
  final n a;

  private d(n paramn)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.a.a(m.a().c());
    this.a.a.repaint();
  }

  d(n paramn, a parama)
  {
    this(paramn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.g.d
 * JD-Core Version:    0.6.0
 */