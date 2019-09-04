package com.zend.ide.eb;

import com.zend.ide.d.co;
import com.zend.ide.n.gz;
import com.zend.ide.y.m;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class eb
  implements PropertyChangeListener
{
  final k a;

  private eb(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (k.l(this.a) != null)
    {
      k.l(this.a).a(m.a().c());
      k.l(this.a).repaint();
    }
  }

  eb(k paramk, b paramb)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.eb
 * JD-Core Version:    0.6.0
 */