package com.zend.ide.desktop.e.o;

import com.zend.ide.j.h;
import com.zend.ide.n.bw;
import com.zend.ide.w.a.d;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

class q extends AbstractAction
{
  final a a;

  public q(a parama)
  {
    super("LogAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = a.b(this.a).k();
    File localFile = str != null ? h.m.g(str) : null;
    a.c(this.a).g(localFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.o.q
 * JD-Core Version:    0.6.0
 */