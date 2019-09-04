package com.zend.ide.cb.a;

import com.zend.ide.cb.f;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;

class ce
  implements ItemListener
{
  final n a;
  final t b;

  ce(t paramt, n paramn)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    if ((paramItemEvent.getStateChange() == 1) && (this.b.a()))
    {
      p localp = this.b.d();
      if ((localp != null) && (!localp.equals(t.c(this.b).get(this.b.b().a() + this.b.c().a()))))
        t.c(this.b).put(this.b.b().a() + this.b.c().a(), localp);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.ce
 * JD-Core Version:    0.6.0
 */