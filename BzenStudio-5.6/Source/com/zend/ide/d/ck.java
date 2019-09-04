package com.zend.ide.d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

class ck
  implements ActionListener
{
  final bs a;

  ck(bs parambs)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    boolean bool = bs.k(this.a).isSelected();
    bs.l(this.a).setEnabled(bool);
    bs.m(this.a).setEnabled(bool);
    bs.n(this.a).setEnabled(bool);
    bs.o(this.a).setEnabled(bool);
    bs.p(this.a).setEnabled(bool);
    bs.q(this.a).setEnabled(bool);
    bs.r(this.a).setEnabled(bool);
    bs.s(this.a).setEnabled(bool);
    bs.t(this.a).setEnabled(bool);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.ck
 * JD-Core Version:    0.6.0
 */