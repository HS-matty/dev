package com.zend.ide.bf;

import com.zend.ide.s.cw;
import com.zend.ide.s.o;
import java.awt.event.ActionEvent;
import javax.swing.text.TextAction;

class bd extends TextAction
{
  final m a;

  private bd(m paramm)
  {
    super("escapeAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if ((m.f(this.a) != null) && (m.f(this.a).c().isShowing()))
    {
      m.f(this.a).i();
      return;
    }
    m.b(this.a);
  }

  bd(m paramm, n paramn)
  {
    this(paramm);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.bd
 * JD-Core Version:    0.6.0
 */