package com.zend.ide.w.b;

import com.zend.ide.d.co;
import com.zend.ide.n.gz;
import com.zend.ide.y.m;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class bh
  implements PropertyChangeListener
{
  final bf a;

  private bh(bf parambf)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    bf.a(this.a).a(m.a().c());
    bf.a(this.a).repaint();
  }

  bh(bf parambf, bg parambg)
  {
    this(parambf);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bh
 * JD-Core Version:    0.6.0
 */