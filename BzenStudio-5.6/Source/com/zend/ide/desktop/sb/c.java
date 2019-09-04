package com.zend.ide.desktop.sb;

import com.zend.ide.eb.k;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class c extends AbstractAction
{
  final a a;

  public c(a parama)
  {
    super("snippetsAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (a.a(this.a) == null)
      a.a(this.a, new k(com.zend.ide.bd.c.b().h(), a.b(this.a)));
    a.a(this.a).t();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.sb.c
 * JD-Core Version:    0.6.0
 */