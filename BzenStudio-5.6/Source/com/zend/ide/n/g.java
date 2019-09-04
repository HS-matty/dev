package com.zend.ide.n;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

class g extends MouseAdapter
{
  final sc a;

  private g(sc paramsc)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if ((paramMouseEvent.getClickCount() == 2) && (sc.b(this.a).getSelectedColumn() == 0))
      sc.a(this.a, true);
  }

  g(sc paramsc, uc paramuc)
  {
    this(paramsc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.g
 * JD-Core Version:    0.6.0
 */