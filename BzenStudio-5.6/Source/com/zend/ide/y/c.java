package com.zend.ide.y;

import com.zend.ide.util.ct;
import com.zend.ide.util.di;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class c
{
  private Object a;
  private String b;
  private int c;
  private Object d;
  private Object e;
  final b f;

  public c(b paramb, Object paramObject1, String paramString, int paramInt, Object paramObject2)
  {
    this.a = paramObject1;
    this.b = paramString;
    this.d = paramObject2;
    this.c = paramInt;
    this.e = paramObject2;
  }

  public Object e()
  {
    return this.a;
  }

  public Object b()
  {
    return this.d;
  }

  public Object c()
  {
    return this.e;
  }

  public void a(Object paramObject)
  {
    Object localObject = this.e;
    this.e = paramObject;
    if (b.a(this.f))
      return;
    try
    {
      b.b(this.f).firePropertyChange((String)this.a, localObject, this.e);
    }
    catch (RuntimeException localRuntimeException)
    {
      this.e = localObject;
      b.b(this.f).firePropertyChange((String)this.a, paramObject, this.e);
      throw localRuntimeException;
    }
  }

  public String d()
  {
    return ct.a(this.c);
  }

  public void a()
  {
    a(this.d);
  }

  public void a(PropertyChangeListener paramPropertyChangeListener)
  {
    b.b(this.f).addPropertyChangeListener((String)this.a, di.a(paramPropertyChangeListener, b.b(this.f)));
    b(paramPropertyChangeListener);
  }

  public void c(PropertyChangeListener paramPropertyChangeListener)
  {
    b.b(this.f).removePropertyChangeListener((String)this.a, di.a(paramPropertyChangeListener, b.b(this.f)));
  }

  public void b(PropertyChangeListener paramPropertyChangeListener)
  {
    PropertyChangeEvent localPropertyChangeEvent = new PropertyChangeEvent(this.f, (String)this.a, null, this.e);
    paramPropertyChangeListener.propertyChange(localPropertyChangeEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.c
 * JD-Core Version:    0.6.0
 */