package com.zend.ide.desktop.e.o;

import com.zend.ide.h.e;
import com.zend.ide.w.a.d;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

class z extends AbstractAction
{
  final c a;

  public z(c paramc)
  {
    super("cvsUpdateActionKey");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File[] arrayOfFile = c.b(this.a).b();
    c.c(this.a).b(arrayOfFile);
    c.a(this.a);
    c.b(this.a).i();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.o.z
 * JD-Core Version:    0.6.0
 */