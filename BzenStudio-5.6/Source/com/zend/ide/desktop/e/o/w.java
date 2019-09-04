package com.zend.ide.desktop.e.o;

import com.zend.ide.h.e;
import com.zend.ide.w.a.d;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

class w extends AbstractAction
{
  final c a;

  public w(c paramc)
  {
    super("cvsDiffActionKey");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File localFile = c.b(this.a).x();
    c.c(this.a).e(localFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.o.w
 * JD-Core Version:    0.6.0
 */