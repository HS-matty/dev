package com.zend.ide.n;

import com.zend.ide.n.a.e;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.SwingUtilities;

class fa extends AbstractAction
{
  final cb a;

  private fa(cb paramcb)
  {
    super("gotoNextProjectBookmarkAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int i = this.a.a().d();
    e locale = cb.a(this.a, false, i, true);
    if ((locale != null) && (this.a.a().a(locale.j(), null, -1)))
      SwingUtilities.invokeLater(new ld(this, locale));
  }

  fa(cb paramcb, hc paramhc)
  {
    this(paramcb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.fa
 * JD-Core Version:    0.6.0
 */