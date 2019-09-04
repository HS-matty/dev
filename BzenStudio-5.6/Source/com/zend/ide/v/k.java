package com.zend.ide.v;

import com.zend.ide.p.w;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class k
  implements ListSelectionListener
{
  final bc a;
  final bd b;

  k(bd parambd, bc parambc)
  {
  }

  public void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    bc.b(this.b.a).setEnabled(this.b.getSelectedValue() != null);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.k
 * JD-Core Version:    0.6.0
 */