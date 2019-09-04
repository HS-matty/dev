package com.zend.ide.util;

import com.zend.ide.p.x;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class qc
  implements ActionListener
{
  final wc a;

  qc(wc paramwc)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    mc.a(this.a.l, wc.a(this.a).isSelected(), wc.c(this.a).getText(), wc.d(this.a).getText(), wc.b(this.a).isSelected(), wc.e(this.a).getText(), new String(wc.f(this.a).getPassword()));
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.qc
 * JD-Core Version:    0.6.0
 */