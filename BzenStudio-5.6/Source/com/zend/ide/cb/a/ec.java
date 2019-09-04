package com.zend.ide.cb.a;

import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class ec extends AbstractAction
{
  final n a;

  public ec(n paramn)
  {
    super("", cv.b("sql/runSQL.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (paramActionEvent.getSource() == n.b(this.a).h())
      n.b(this.a).e();
    this.a.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.ec
 * JD-Core Version:    0.6.0
 */