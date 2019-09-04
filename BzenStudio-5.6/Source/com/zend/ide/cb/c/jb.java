package com.zend.ide.cb.c;

import com.zend.ide.util.ct;
import com.zend.ide.util.dj;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class jb
  implements PropertyChangeListener
{
  final w a;

  private jb(w paramw)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    int i = ((Integer)paramPropertyChangeEvent.getNewValue()).intValue();
    if ((i < 1) || (i > 3000))
      throw new dj(ct.a(1351) + 3000);
    w.a(this.a, i);
  }

  jb(w paramw, x paramx)
  {
    this(paramw);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.jb
 * JD-Core Version:    0.6.0
 */