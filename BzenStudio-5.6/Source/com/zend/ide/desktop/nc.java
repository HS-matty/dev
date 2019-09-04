package com.zend.ide.desktop;

import com.zend.ide.p.e.f;
import com.zend.ide.util.ct;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class nc
  implements PropertyChangeListener
{
  final cj a;

  private nc(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    boolean bool = ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue();
    if (bool != f.a())
      cj.a(this.a, ct.a(1827));
  }

  nc(cj paramcj, n paramn)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.nc
 * JD-Core Version:    0.6.0
 */