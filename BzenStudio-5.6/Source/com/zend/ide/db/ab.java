package com.zend.ide.db;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;

class ab extends KeyAdapter
{
  final x a;
  final ib b;

  ab(ib paramib, x paramx)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 127)
    {
      int i = this.b.getSelectedIndex();
      if (i != -1)
        ((DefaultListModel)this.b.getModel()).removeElementAt(i);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.ab
 * JD-Core Version:    0.6.0
 */