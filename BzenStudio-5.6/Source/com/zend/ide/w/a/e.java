package com.zend.ide.w.a;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

class e
  implements PropertyChangeListener
{
  final c a;

  e(c paramc)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    c.a(this.a, ((File)paramPropertyChangeEvent.getNewValue()).getPath());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.e
 * JD-Core Version:    0.6.0
 */