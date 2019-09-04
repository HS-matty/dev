package com.zend.ide.desktop.e.o;

import com.zend.ide.h.e;
import com.zend.ide.w.a.d;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

class v extends AbstractAction
{
  final c a;

  public v(c paramc)
  {
    super("cvsCommitActionKey");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File[] arrayOfFile = c.b(this.a).b();
    c.c(this.a).c(arrayOfFile);
    c.a(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.o.v
 * JD-Core Version:    0.6.0
 */