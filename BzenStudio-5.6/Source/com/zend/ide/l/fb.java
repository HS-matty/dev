package com.zend.ide.l;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class fb
  implements ListSelectionListener
{
  final tb a;

  fb(tb paramtb)
  {
  }

  public void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    tb.a(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.fb
 * JD-Core Version:    0.6.0
 */