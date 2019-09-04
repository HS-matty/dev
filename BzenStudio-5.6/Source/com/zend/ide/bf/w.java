package com.zend.ide.bf;

import com.zend.ide.s.cw;
import com.zend.ide.s.o;
import com.zend.ide.util.dn;
import java.awt.event.ActionEvent;
import javax.swing.Action;

class w extends dn
{
  final m b;

  private w(m paramm, Action paramAction)
  {
    super(paramAction);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (m.f(this.b).c().isShowing())
    {
      super.actionPerformed(paramActionEvent);
      return;
    }
    m.g(this.b);
  }

  w(m paramm, Action paramAction, n paramn)
  {
    this(paramm, paramAction);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.w
 * JD-Core Version:    0.6.0
 */