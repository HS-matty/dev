package com.zend.ide.n;

import com.zend.ide.bc.c;
import com.zend.ide.n.a.e;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.SwingUtilities;

class ez extends AbstractAction
{
  final cb a;

  private ez(cb paramcb)
  {
    super("gotoNextBookmarkAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    c.a().a("add_bookmark");
    int i = this.a.a().d();
    e locale = cb.a(this.a, true, i, false);
    if ((locale != null) && (this.a.a().a(locale.j(), null, -1)))
      SwingUtilities.invokeLater(new kd(this, locale));
  }

  ez(cb paramcb, hc paramhc)
  {
    this(paramcb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ez
 * JD-Core Version:    0.6.0
 */