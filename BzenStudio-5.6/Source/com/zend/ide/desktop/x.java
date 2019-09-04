package com.zend.ide.desktop;

import com.zend.ide.util.ct;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Locale;

class x
  implements PropertyChangeListener
{
  final cj a;

  private x(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    Locale localLocale1 = (Locale)paramPropertyChangeEvent.getOldValue();
    Locale localLocale2 = (Locale)paramPropertyChangeEvent.getNewValue();
    if ((localLocale1 == null) || (localLocale1.getLanguage().equals(localLocale2.getLanguage())))
      return;
    cj.a(this.a, ct.a(432));
  }

  x(cj paramcj, n paramn)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.x
 * JD-Core Version:    0.6.0
 */