package com.zend.ide.desktop.a;

import com.zend.ide.l.g;
import com.zend.ide.o.fk;
import com.zend.ide.util.ct;
import com.zend.ide.util.dj;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.MalformedURLException;
import java.net.URL;

class f
  implements PropertyChangeListener
{
  final b a;

  private f(b paramb)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if ((!b.a(this.a).e()) || (b.b(this.a)))
      try
      {
        b.c(this.a).a(new URL(paramPropertyChangeEvent.getNewValue().toString()));
      }
      catch (MalformedURLException localMalformedURLException)
      {
        throw new dj(ct.a(1142));
      }
  }

  f(b paramb, c paramc)
  {
    this(paramb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.a.f
 * JD-Core Version:    0.6.0
 */