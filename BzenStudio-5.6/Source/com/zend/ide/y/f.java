package com.zend.ide.y;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;

public class f
  implements PropertyChangeListener
{
  private HashMap a = new HashMap();

  public void a(String paramString, PropertyChangeListener paramPropertyChangeListener)
  {
    this.a.put(paramString, paramPropertyChangeListener);
  }

  public void a(String paramString)
  {
    this.a.remove(paramString);
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    String str = paramPropertyChangeEvent.getPropertyName();
    PropertyChangeListener localPropertyChangeListener = (PropertyChangeListener)this.a.get(str);
    localPropertyChangeListener.propertyChange(paramPropertyChangeEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.f
 * JD-Core Version:    0.6.0
 */