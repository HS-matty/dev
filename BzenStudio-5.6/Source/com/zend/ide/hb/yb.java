package com.zend.ide.hb;

import java.awt.event.ActionEvent;
import javax.swing.text.TextAction;

class yb extends TextAction
{
  final qb a;

  public yb(qb paramqb)
  {
    super(qb.j(paramqb));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    qb.c(this.a).a(-1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.yb
 * JD-Core Version:    0.6.0
 */