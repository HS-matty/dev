package com.zend.ide.desktop;

import com.zend.ide.util.bh;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class xb
  implements PropertyChangeListener
{
  final be a;

  private xb(be parambe)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    be.a(this.a, (bh)paramPropertyChangeEvent.getNewValue());
    if (!bh.a(be.f(this.a)))
      be.a(this.a, null);
  }

  xb(be parambe, bf parambf)
  {
    this(parambe);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.xb
 * JD-Core Version:    0.6.0
 */