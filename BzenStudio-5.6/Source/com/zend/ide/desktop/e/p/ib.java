package com.zend.ide.desktop.e.p;

import java.awt.event.ActionEvent;
import java.io.File;

class ib extends hb
{
  final c c;

  public ib(c paramc)
  {
    super(paramc, "svnAddActionKey", com.zend.ide.w.c.e.a(c.c(paramc), "Add", null));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File[] arrayOfFile = c.b(this.c).b();
    a(arrayOfFile);
    super.actionPerformed(paramActionEvent);
    c.a(this.c);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.p.ib
 * JD-Core Version:    0.6.0
 */