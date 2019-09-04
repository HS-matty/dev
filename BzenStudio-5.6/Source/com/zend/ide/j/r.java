package com.zend.ide.j;

import com.zend.ide.util.ct;
import com.zend.ide.util.dj;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class r
  implements PropertyChangeListener
{
  final e a;

  private r(e parame)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (this.a.a != null)
    {
      int i = ((Integer)paramPropertyChangeEvent.getNewValue()).intValue();
      if (i == 0)
        throw new dj(ct.a(856));
      this.a.a.a(i);
    }
  }

  r(e parame, n paramn)
  {
    this(parame);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.r
 * JD-Core Version:    0.6.0
 */