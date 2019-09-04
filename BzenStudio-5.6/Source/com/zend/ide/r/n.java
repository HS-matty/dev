package com.zend.ide.r;

import com.zend.ide.p.w;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class n
  implements ListSelectionListener
{
  final ba a;

  private n(ba paramba)
  {
  }

  public void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    ba.i(this.a);
    d locald = (d)ba.a(this.a).getSelectedValue();
    if (locald == null)
    {
      ba.m(this.a).setEnabled(false);
      ba.j(this.a).setEnabled(false);
    }
    else if ((locald.d()) || (locald.b().equals("PHP files")) || (locald.b().equals("HTML files")))
    {
      ba.m(this.a).setEnabled(false);
      ba.j(this.a).setEnabled(false);
    }
    else
    {
      ba.m(this.a).setEnabled(true);
      ba.j(this.a).setEnabled(true);
    }
  }

  n(ba paramba, z paramz)
  {
    this(paramba);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.n
 * JD-Core Version:    0.6.0
 */