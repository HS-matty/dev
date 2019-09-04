package com.zend.ide.w.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;

class bj
  implements ActionListener
{
  final cf a;

  bj(cf paramcf)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    cf.a(this.a, 0);
    cf.a(this.a).setText("");
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.bj
 * JD-Core Version:    0.6.0
 */