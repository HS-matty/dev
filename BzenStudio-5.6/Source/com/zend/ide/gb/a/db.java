package com.zend.ide.gb.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class db
  implements ActionListener
{
  final rb a;

  db(rb paramrb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int i = rb.u().getSelectedIndex();
    if (i == -1)
      return;
    ((DefaultListModel)rb.u().getModel()).removeElementAt(i);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.db
 * JD-Core Version:    0.6.0
 */