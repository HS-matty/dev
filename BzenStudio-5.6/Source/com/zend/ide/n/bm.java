package com.zend.ide.n;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class bm
  implements PropertyChangeListener
{
  final bk a;

  private bm(bk parambk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.a = ((Color)paramPropertyChangeEvent.getNewValue());
  }

  bm(bk parambk, bl parambl)
  {
    this(parambk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.bm
 * JD-Core Version:    0.6.0
 */