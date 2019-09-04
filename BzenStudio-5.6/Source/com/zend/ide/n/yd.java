package com.zend.ide.n;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class yd
  implements ListSelectionListener
{
  final gt a;

  yd(gt paramgt)
  {
  }

  public void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    int i = gt.b(this.a).getSelectedIndex();
    if (i != -1)
      gt.b(this.a).ensureIndexIsVisible(i);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.yd
 * JD-Core Version:    0.6.0
 */