package com.zend.ide.f;

import com.zend.ide.util.c.f;
import com.zend.ide.util.c.h;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class eb
  implements PropertyChangeListener
{
  final de a;

  private eb(de paramde)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (de.b(this.a) != null)
      return;
    de.a(this.a, h.c().b(new t(this.a)));
    de.b(this.a).a(1500L, 1000L);
  }

  eb(de paramde, ab paramab)
  {
    this(paramde);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.eb
 * JD-Core Version:    0.6.0
 */