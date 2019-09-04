package com.zend.ide.desktop.e.p;

import java.awt.event.ActionEvent;
import java.io.File;

class qb extends hb
{
  final c c;

  public qb(c paramc)
  {
    super(paramc, "svnUpdateActionKey", com.zend.ide.w.c.e.a(c.c(paramc), "Update", null));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File[] arrayOfFile = c.b(this.c).b();
    a(arrayOfFile);
    super.actionPerformed(paramActionEvent);
    c.a(this.c);
    c.b(this.c).i();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.p.qb
 * JD-Core Version:    0.6.0
 */