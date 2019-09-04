package com.zend.ide.cb.a;

import com.zend.ide.cb.c.w;
import com.zend.ide.n.dm;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.JTextComponent;

class dc extends AbstractAction
{
  final n a;

  public dc(n paramn)
  {
    super("", cv.b("sql/delSQL.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    n.a(this.a).e().setText("");
    n.c(this.a).a().c();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.dc
 * JD-Core Version:    0.6.0
 */