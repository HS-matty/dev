package com.zend.ide.gb.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class n
  implements ActionListener
{
  final pb a;

  n(pb parampb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int i = pb.c(this.a).getSelectedIndex();
    if (i == -1)
      return;
    ((DefaultListModel)pb.c(this.a).getModel()).removeElementAt(i);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.n
 * JD-Core Version:    0.6.0
 */