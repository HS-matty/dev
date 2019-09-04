package com.zend.ide.r;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class u
  implements ActionListener
{
  final y a;

  u(y paramy)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    o localo = p.e().a(this.a).a(null, 1);
    if (localo != null)
    {
      DefaultListModel localDefaultListModel = (DefaultListModel)y.b(this.a).getModel();
      d locald = (d)localo;
      localDefaultListModel.addElement(locald);
      y.b(this.a).setSelectedValue(locald, true);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.u
 * JD-Core Version:    0.6.0
 */