package com.zend.ide.d;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class bm
  implements ListSelectionListener
{
  final bi a;

  bm(bi parambi)
  {
  }

  public void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    if (bi.e(this.a) != null)
      bi.b(this.a, (String)bi.d(this.a).getSelectedValue());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bm
 * JD-Core Version:    0.6.0
 */