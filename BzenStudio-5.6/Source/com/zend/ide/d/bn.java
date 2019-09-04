package com.zend.ide.d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

class bn
  implements ActionListener
{
  final bs a;

  bn(bs parambs)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    boolean bool = bs.a(this.a).isSelected();
    bs.b(this.a).setEnabled(bool);
    bs.c(this.a).setEnabled(bool);
    bs.d(this.a).setEnabled(bool);
    bs.e(this.a).setEnabled(bool);
    bs.f(this.a).setEnabled(bool);
    bs.g(this.a).setEnabled(bool);
    bs.h(this.a).setEnabled(bool);
    bs.i(this.a).setEnabled(bool);
    bs.j(this.a).setEnabled(bool);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bn
 * JD-Core Version:    0.6.0
 */