package com.zend.ide.db;

import com.zend.ide.p.w;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

class db
  implements ActionListener
{
  final x a;

  db(x paramx)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    boolean bool = x.k(this.a).isSelected();
    x.l(this.a).setEnabled(bool);
    x.l(this.a).setEditable(bool);
    x.m(this.a).setEnabled(bool);
    x.e(this.a).setEnabled(bool);
    x.n(this.a).setEnabled(bool);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.db
 * JD-Core Version:    0.6.0
 */