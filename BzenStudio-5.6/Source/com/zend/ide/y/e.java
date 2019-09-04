package com.zend.ide.y;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class e
  implements PropertyChangeListener
{
  private PropertyChangeListener a;

  public e(PropertyChangeListener paramPropertyChangeListener)
  {
    this.a = paramPropertyChangeListener;
  }

  public void a(String paramString)
  {
    b.a(this, paramString);
  }

  public void b(String paramString)
  {
    b.c(this, paramString);
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.propertyChange(paramPropertyChangeEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.e
 * JD-Core Version:    0.6.0
 */