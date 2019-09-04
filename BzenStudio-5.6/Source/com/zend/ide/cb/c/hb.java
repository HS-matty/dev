package com.zend.ide.cb.c;

import com.zend.ide.util.ct;
import com.zend.ide.util.dj;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;

class hb
  implements PropertyChangeListener
{
  final w a;

  private hb(w paramw)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    String str = paramPropertyChangeEvent.getNewValue().toString();
    try
    {
      new SimpleDateFormat(str);
    }
    catch (Throwable localThrowable)
    {
      throw new dj(ct.a(1352));
    }
    w.a(this.a, str);
  }

  hb(w paramw, x paramx)
  {
    this(paramw);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.hb
 * JD-Core Version:    0.6.0
 */