package com.zend.ide.cb.a;

import com.zend.ide.cb.e;
import com.zend.ide.cb.q;
import com.zend.ide.p.x;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class zb extends AbstractAction
{
  final cd a;

  public zb(cd paramcd)
  {
    super(ct.a(116));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    cd.b(this.a).a(cd.a(this.a).getText());
    cd.b(this.a).b(new String(cd.c(this.a).getPassword()));
    cd.b(this.a).e(cd.d(this.a).isSelected());
    cd.e(this.a).a(cd.b(this.a));
    cd.a(this.a, 0);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.zb
 * JD-Core Version:    0.6.0
 */