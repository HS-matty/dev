package com.zend.ide.desktop.e.p;

import java.awt.event.ActionEvent;
import java.io.File;

class mb extends hb
{
  final c c;

  public mb(c paramc)
  {
    super(paramc, "svnLogActionKey", com.zend.ide.w.c.e.a(c.c(paramc), "Log", null));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File localFile = c.b(this.c).x();
    a(new File[] { localFile });
    super.actionPerformed(paramActionEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.p.mb
 * JD-Core Version:    0.6.0
 */