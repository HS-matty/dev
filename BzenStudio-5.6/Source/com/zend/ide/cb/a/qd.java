package com.zend.ide.cb.a;

import com.zend.ide.cb.f;
import com.zend.ide.cb.q;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import javax.swing.JComboBox;

class qd
  implements ItemListener
{
  final n a;
  final t b;

  qd(t paramt, n paramn)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    if ((paramItemEvent.getStateChange() == 1) && (this.b.a()))
    {
      t.b(this.b).put(this.b.b().a(), this.b.c());
      q localq = this.b.b();
      if ((localq.a()) && (localq.k()))
      {
        t.a(this.b).setEnabled(true);
        this.b.a(this.b.c().b());
        this.b.a(t.a(this.b, this.b.b().a(), this.b.c().a()));
      }
      else
      {
        t.a(this.b).setEnabled(false);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.qd
 * JD-Core Version:    0.6.0
 */