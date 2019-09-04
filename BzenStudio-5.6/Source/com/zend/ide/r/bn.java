package com.zend.ide.r;

import com.zend.ide.p.w;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class bn
  implements ListSelectionListener
{
  final ba a;

  private bn(ba paramba)
  {
  }

  public void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    ba.f(this.a);
    o localo = (o)ba.b(this.a).getSelectedValue();
    if (localo == null)
    {
      ba.f(this.a).setEnabled(false);
      ba.g(this.a).setEnabled(false);
      ba.k(this.a).setEnabled(false);
    }
    else if (localo.d())
    {
      ba.f(this.a).setEnabled(false);
      ba.g(this.a).setEnabled(false);
      ba.k(this.a).setEnabled(false);
    }
    else
    {
      ba.f(this.a).setEnabled(true);
      ba.d(this.a);
    }
  }

  bn(ba paramba, z paramz)
  {
    this(paramba);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.bn
 * JD-Core Version:    0.6.0
 */