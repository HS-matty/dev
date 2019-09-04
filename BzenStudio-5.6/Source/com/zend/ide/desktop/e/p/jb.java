package com.zend.ide.desktop.e.p;

import java.awt.event.ActionEvent;
import java.io.File;

class jb extends hb
{
  final c c;

  public jb(c paramc)
  {
    super(paramc, "svnCommitActionKey", com.zend.ide.w.c.e.a(c.c(paramc), "Commit", null));
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
 * Qualified Name:     com.zend.ide.desktop.e.p.jb
 * JD-Core Version:    0.6.0
 */