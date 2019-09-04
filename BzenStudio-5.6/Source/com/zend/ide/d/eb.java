package com.zend.ide.d;

import com.zend.ide.n.gz;
import com.zend.ide.n.ho;
import com.zend.ide.n.kc;
import com.zend.ide.s.bc;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class eb
  implements PropertyChangeListener
{
  final dd a;

  private eb(dd paramdd)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if ((dd.a(this.a) instanceof bc))
      dd.a(this.a, kc.b((ho)dd.a(this.a).getDocument()));
  }

  eb(dd paramdd, bp parambp)
  {
    this(paramdd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.eb
 * JD-Core Version:    0.6.0
 */