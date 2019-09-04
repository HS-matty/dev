package com.zend.ide.d;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class hc
  implements ListSelectionListener
{
  final mb a;

  hc(mb parammb)
  {
  }

  public void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    if (!paramListSelectionEvent.getValueIsAdjusting())
    {
      if (mb.d(this.a).getSelectedIndex() > -1)
        mb.a(this.a, mb.d(this.a).getSelectedIndex());
      this.a.h();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.hc
 * JD-Core Version:    0.6.0
 */