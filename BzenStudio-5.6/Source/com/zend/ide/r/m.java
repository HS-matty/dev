package com.zend.ide.r;

import com.zend.ide.p.w;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class m
  implements ListSelectionListener
{
  final ba a;

  private m(ba paramba)
  {
  }

  public void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    if ((ba.k(this.a).getSelectedValue() == null) || (ba.a(this.a).a((f)ba.k(this.a).getSelectedValue())))
      ba.l(this.a).setEnabled(false);
    else
      ba.l(this.a).setEnabled(true);
  }

  m(ba paramba, z paramz)
  {
    this(paramba);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.m
 * JD-Core Version:    0.6.0
 */