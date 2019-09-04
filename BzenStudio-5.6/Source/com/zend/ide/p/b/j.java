package com.zend.ide.p.b;

import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class j extends AbstractAction
{
  final k a;

  public j(k paramk)
  {
    super(ct.a(448));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (k.b(this.a).e())
    {
      this.a.setVisible(false);
      k.b(this.a).d();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.b.j
 * JD-Core Version:    0.6.0
 */