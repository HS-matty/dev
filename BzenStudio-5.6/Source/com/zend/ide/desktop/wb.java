package com.zend.ide.desktop;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class wb
  implements PropertyChangeListener
{
  boolean b = false;
  final be a;

  private wb(be parambe)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (this.b)
      this.a.b();
    else
      this.b = true;
  }

  wb(be parambe, bf parambf)
  {
    this(parambe);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.wb
 * JD-Core Version:    0.6.0
 */