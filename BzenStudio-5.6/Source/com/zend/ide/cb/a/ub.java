package com.zend.ide.cb.a;

import com.zend.ide.cb.a.c.a;
import com.zend.ide.cb.a.c.b;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;

class ub extends AbstractAction
{
  final pd a;

  public ub(pd parampd)
  {
    super(ct.a(1475), cv.b("sql/textView.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    b localb = new b(pd.m(this.a));
    JDialog localJDialog = pd.a(this.a, ct.a(1476), localb.a(), true, true, 580, 250);
    localJDialog.setVisible(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.ub
 * JD-Core Version:    0.6.0
 */