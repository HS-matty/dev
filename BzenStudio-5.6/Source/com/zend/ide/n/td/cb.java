package com.zend.ide.n.td;

import com.zend.ide.f.bp;
import com.zend.ide.f.bt;
import com.zend.ide.f.s;
import com.zend.ide.util.c.h;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class cb
  implements PropertyChangeListener
{
  final bc a;

  private cb(bc parambc)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    boolean bool = ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue();
    bc.a(bool);
    if (bc.d())
    {
      bp.d().b().g().a(this.a);
      a();
    }
    else
    {
      bp.d().b().g().b(this.a);
      b();
    }
  }

  private void a()
  {
    db localdb = new db(this);
    h.c().a(localdb, true);
  }

  private void b()
  {
    eb localeb = new eb(this);
    h.c().a(localeb, true);
  }

  cb(bc parambc, bb parambb)
  {
    this(parambc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.cb
 * JD-Core Version:    0.6.0
 */