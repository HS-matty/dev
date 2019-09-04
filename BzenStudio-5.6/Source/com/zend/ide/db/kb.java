package com.zend.ide.db;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class kb
  implements ActionListener
{
  final JList a;
  final x b;

  kb(x paramx, JList paramJList)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int i = this.a.getSelectedIndex();
    if (i != -1)
      ((DefaultListModel)this.a.getModel()).removeElementAt(i);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.kb
 * JD-Core Version:    0.6.0
 */