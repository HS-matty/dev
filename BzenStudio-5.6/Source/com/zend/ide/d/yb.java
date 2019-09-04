package com.zend.ide.d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

class yb
  implements ActionListener
{
  final rd a;

  yb(rd paramrd)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    boolean bool = rd.h(this.a).isSelected();
    rd.i(this.a).setEnabled(bool);
    rd.j(this.a).setEnabled(bool);
    rd.k(this.a).setEnabled(bool);
    rd.l(this.a).setEnabled(bool);
    rd.m(this.a).setEnabled(bool);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.yb
 * JD-Core Version:    0.6.0
 */