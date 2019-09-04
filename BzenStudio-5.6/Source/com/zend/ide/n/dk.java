package com.zend.ide.n;

import com.zend.ide.util.cl;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class dk
  implements PropertyChangeListener
{
  final bp a;

  private dk(bp parambp)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    try
    {
      this.a.a(0, true);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  dk(bp parambp, dj paramdj)
  {
    this(parambp);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.dk
 * JD-Core Version:    0.6.0
 */