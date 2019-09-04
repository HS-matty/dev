package com.zend.ide.cb.a;

import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

class ib extends AbstractAction
{
  final s a;

  public ib(s params, KeyStroke paramKeyStroke)
  {
    super(ct.a(84), cv.b("sql/runSQL.gif"));
    putValue("AcceleratorKey", paramKeyStroke);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.e();
    s.a(this.a).b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.ib
 * JD-Core Version:    0.6.0
 */