package com.zend.ide.gb.a;

import com.zend.ide.gb.b.b;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class u
  implements ActionListener
{
  final nb a;

  u(nb paramnb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.l.a.d(nb.d(this.a).getText());
    this.a.l.a.b(nb.e(this.a).isSelected());
    this.a.l.a.a(nb.f(this.a).isSelected());
    if (nb.b(this.a).isSelected())
      this.a.l.a.c("http://schemas.xmlsoap.org/soap/encoding/");
    else
      this.a.l.a.c(nb.e(this.a).getText());
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.u
 * JD-Core Version:    0.6.0
 */