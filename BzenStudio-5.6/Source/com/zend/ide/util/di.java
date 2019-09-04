package com.zend.ide.util;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;

public class di extends dh
  implements PropertyChangeListener
{
  private Object b;
  private static ReferenceQueue c = new ReferenceQueue();
  private static Class[] d = { PropertyChangeListener.class };
  private static Object[] e = { null };
  private static String f = "removePropertyChangeListener";

  public static di a(PropertyChangeListener paramPropertyChangeListener, Object paramObject)
  {
    b();
    return new di(paramPropertyChangeListener, paramObject);
  }

  public static void b()
  {
    di localdi = (di)c.poll();
    while (localdi != null)
      try
      {
        Method localMethod = localdi.b.getClass().getMethod(f, d);
        e[0] = localdi;
        localMethod.invoke(localdi.b, e);
        localdi = (di)c.poll();
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
  }

  protected di(PropertyChangeListener paramPropertyChangeListener, Object paramObject)
  {
    super(paramPropertyChangeListener, c);
    this.b = paramObject;
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    PropertyChangeListener localPropertyChangeListener = (PropertyChangeListener)get();
    if (localPropertyChangeListener != null)
      localPropertyChangeListener.propertyChange(paramPropertyChangeEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.di
 * JD-Core Version:    0.6.0
 */