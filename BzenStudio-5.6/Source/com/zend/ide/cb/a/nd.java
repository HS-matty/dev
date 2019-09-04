package com.zend.ide.cb.a;

import com.zend.ide.cb.q;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

class nd
  implements ItemListener
{
  final n a;
  final t b;

  nd(t paramt, n paramn)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    if ((paramItemEvent.getStateChange() == 1) && (this.b.a()))
    {
      t.a(this.b).removeAllElements();
      q localq = this.b.b();
      this.b.a(localq.i());
      this.b.a(t.a(this.b, this.b.b().a()));
      t.b(this.b).setEnabled(localq.b());
      t.a(this.b).setEnabled((localq.a()) && (localq.k()));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.nd
 * JD-Core Version:    0.6.0
 */