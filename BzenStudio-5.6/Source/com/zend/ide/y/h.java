package com.zend.ide.y;

import com.zend.ide.util.ct;
import com.zend.ide.util.di;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Vector;
import javax.swing.KeyStroke;

public class h
{
  private Object a;
  private String b;
  private int c;
  private Vector d = new Vector(5);
  private Vector e = new Vector(5);
  final g f;

  public h(g paramg, Object paramObject1, String paramString, int paramInt, Object paramObject2)
  {
    this.a = paramObject1;
    this.b = paramString;
    if ((paramObject2 instanceof Vector))
    {
      Vector localVector = (Vector)paramObject2;
      for (int i = 0; i < localVector.size(); i++)
      {
        this.d.add(localVector.get(i));
        this.e.add(localVector.get(i));
      }
    }
    else
    {
      this.e.add(paramObject2);
      this.d.add(paramObject2);
    }
    this.c = paramInt;
  }

  public Object h()
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

  public Object d()
  {
    if (this.e.size() > 0)
      return this.e.get(0);
    return null;
  }

  private void a(Vector paramVector1, Vector paramVector2)
  {
    KeyStroke[] arrayOfKeyStroke1 = new KeyStroke[paramVector1.size()];
    KeyStroke[] arrayOfKeyStroke2 = new KeyStroke[paramVector2.size()];
    if (!g.h())
      g.b(this.f).firePropertyChange((String)this.a, paramVector1.toArray(arrayOfKeyStroke1), paramVector2.toArray(arrayOfKeyStroke2));
  }

  public void a(Object paramObject)
  {
    Vector localVector = new Vector(this.e);
    this.e.removeAllElements();
    if ((paramObject instanceof Vector))
      this.e.addAll((Vector)paramObject);
    else
      this.e.add(paramObject);
    a(localVector, this.e);
  }

  public void b(Object paramObject)
  {
    Vector localVector = new Vector(this.e);
    this.e.add(paramObject);
    a(localVector, this.e);
  }

  public void c(Object paramObject)
  {
    Vector localVector = new Vector(this.e);
    this.e.add(paramObject);
    this.d.add(paramObject);
    a(localVector, this.e);
  }

  public void d(Object paramObject)
  {
    Vector localVector = new Vector(this.e);
    this.e.remove(paramObject);
    a(localVector, this.e);
  }

  public String e()
  {
    return this.b;
  }

  public String f()
  {
    return ct.a(this.c);
  }

  public int g()
  {
    return this.c;
  }

  public void a(PropertyChangeListener paramPropertyChangeListener)
  {
    g.b(this.f).addPropertyChangeListener((String)this.a, di.a(paramPropertyChangeListener, g.b(this.f)));
    b(paramPropertyChangeListener);
  }

  public void c(PropertyChangeListener paramPropertyChangeListener)
  {
    g.b(this.f).removePropertyChangeListener((String)this.a, di.a(paramPropertyChangeListener, g.b(this.f)));
  }

  public void b(PropertyChangeListener paramPropertyChangeListener)
  {
    KeyStroke[] arrayOfKeyStroke = new KeyStroke[this.e.size()];
    PropertyChangeEvent localPropertyChangeEvent = new PropertyChangeEvent(this.f, (String)this.a, null, this.e.toArray(arrayOfKeyStroke));
    paramPropertyChangeListener.propertyChange(localPropertyChangeEvent);
  }

  public String toString()
  {
    return "[id=" + this.a + ", name=" + this.b + ", values=" + this.e + ", initValues=" + this.d + ']';
  }

  static int a(h paramh)
  {
    return paramh.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.h
 * JD-Core Version:    0.6.0
 */