package com.zend.ide.d;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class bc
  implements ListSelectionListener
{
  final ud a;

  bc(ud paramud)
  {
  }

  public void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    ud.a(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bc
 * JD-Core Version:    0.6.0
 */