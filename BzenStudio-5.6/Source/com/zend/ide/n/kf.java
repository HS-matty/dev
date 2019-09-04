package com.zend.ide.n;

import com.zend.ide.f.bp;
import com.zend.ide.f.s;
import com.zend.ide.m.bf;
import com.zend.ide.n.td.jb;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class kf
  implements PropertyChangeListener
{
  final dm a;

  public kf(dm paramdm)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (dm.a(this.a) != null)
    {
      Boolean localBoolean = (Boolean)paramPropertyChangeEvent.getNewValue();
      if (localBoolean != null)
      {
        dm.a(this.a, localBoolean.booleanValue());
        dm.a(this.a).d(dm.a(this.a));
        this.a.d(dm.a(this.a));
        if (dm.a(this.a))
        {
          bf localbf = bp.d().b().a(this.a.k());
          dm.a(this.a).a().a(localbf);
        }
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.kf
 * JD-Core Version:    0.6.0
 */