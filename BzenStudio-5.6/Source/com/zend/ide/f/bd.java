package com.zend.ide.f;

import com.zend.ide.d.co;
import com.zend.ide.n.be;
import com.zend.ide.n.hl;
import com.zend.ide.s.bb;
import com.zend.ide.y.m;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class bd
  implements PropertyChangeListener
{
  final by a;

  private bd(by paramby)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    be localbe = m.a().c();
    by.a(this.a, localbe.a(bb.bk).b());
    by.b(this.a, localbe.a(bb.X).b());
  }

  bd(by paramby, bs parambs)
  {
    this(paramby);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.bd
 * JD-Core Version:    0.6.0
 */