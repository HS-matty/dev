package com.zend.ide.util;

import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class cp
  implements PropertyChangeListener
{
  final cn a;

  private cp(cn paramcn)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    cn.a(this.a, (Font)paramPropertyChangeEvent.getNewValue());
  }

  cp(cn paramcn, co paramco)
  {
    this(paramcn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.cp
 * JD-Core Version:    0.6.0
 */