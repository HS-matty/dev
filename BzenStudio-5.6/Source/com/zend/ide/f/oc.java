package com.zend.ide.f;

import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class oc
  implements PropertyChangeListener
{
  final cj a;

  private oc(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    cj.a(b.a("desktop.phpVersion").c().toString().equalsIgnoreCase("PHP5"));
    cj.j(this.a);
  }

  oc(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.oc
 * JD-Core Version:    0.6.0
 */