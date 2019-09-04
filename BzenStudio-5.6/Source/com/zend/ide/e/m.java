package com.zend.ide.e;

import com.zend.ide.p.x;
import com.zend.ide.y.b;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class m extends AbstractAction
{
  final c a;

  public m(c paramc)
  {
    super("StartupAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    c.a(this.a, c.g(this.a).isSelected());
    b.a("application.showTipsDialog").a(new Boolean(c.h(this.a)));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.e.m
 * JD-Core Version:    0.6.0
 */