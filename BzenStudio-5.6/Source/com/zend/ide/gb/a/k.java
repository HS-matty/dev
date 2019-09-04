package com.zend.ide.gb.a;

import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class k
  implements ListSelectionListener
{
  final pb a;

  k(pb parampb)
  {
  }

  public void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    if (this.a.a != null)
      ob.b.d();
    SwingUtilities.invokeLater(new l(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.k
 * JD-Core Version:    0.6.0
 */