package com.zend.ide.i;

import com.zend.ide.bd.c;
import com.zend.ide.be.k;
import com.zend.ide.util.ct;
import com.zend.ide.util.eq;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class v extends AbstractAction
{
  final x a;

  public v(x paramx)
  {
    super("checkActionKey");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    x.a(this.a);
    this.a.setVisible(false);
    c.b().d().a(ct.a(1269));
    eq.a(true);
    c.b().d().b(ct.a(1269));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.v
 * JD-Core Version:    0.6.0
 */