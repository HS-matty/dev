package com.zend.ide.desktop.e.o;

import com.zend.ide.h.e;
import com.zend.ide.w.a.d;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

class y extends AbstractAction
{
  final c a;

  public y(c paramc)
  {
    super("cvsStatusActionKey");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File[] arrayOfFile = c.b(this.a).b();
    c.c(this.a).e(arrayOfFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.o.y
 * JD-Core Version:    0.6.0
 */