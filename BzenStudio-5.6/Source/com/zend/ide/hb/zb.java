package com.zend.ide.hb;

import java.awt.event.ActionEvent;
import javax.swing.text.TextAction;

class zb extends TextAction
{
  final qb a;

  public zb(qb paramqb)
  {
    super(qb.g(paramqb));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (qb.e(this.a) == 0)
      qb.h(this.a).actionPerformed(paramActionEvent);
    else
      qb.i(this.a).actionPerformed(paramActionEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.zb
 * JD-Core Version:    0.6.0
 */