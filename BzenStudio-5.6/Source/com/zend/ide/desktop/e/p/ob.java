package com.zend.ide.desktop.e.p;

import java.awt.event.ActionEvent;
import java.io.File;

class ob extends hb
{
  final c c;

  public ob(c paramc)
  {
    super(paramc, "svnRevertActionKey", com.zend.ide.w.c.e.a(c.c(paramc), "Revert", null));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File localFile = c.b(this.c).x();
    a(new File[] { localFile });
    super.actionPerformed(paramActionEvent);
    c.b(this.c).i();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.p.ob
 * JD-Core Version:    0.6.0
 */