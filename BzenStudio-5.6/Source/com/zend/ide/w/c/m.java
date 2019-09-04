package com.zend.ide.w.c;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

class m
  implements PropertyChangeListener
{
  final d a;

  private m(d paramd)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.a(((File)paramPropertyChangeEvent.getNewValue()).getPath());
  }

  m(d paramd, l paraml)
  {
    this(paramd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.m
 * JD-Core Version:    0.6.0
 */