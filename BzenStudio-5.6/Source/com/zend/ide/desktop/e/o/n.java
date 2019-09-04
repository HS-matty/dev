package com.zend.ide.desktop.e.o;

import com.zend.ide.j.h;
import com.zend.ide.n.bw;
import com.zend.ide.w.a.d;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

class n extends AbstractAction
{
  final a a;

  public n(a parama)
  {
    super("cvsAddActionKey");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = a.b(this.a).k();
    Object localObject = str != null ? h.m.g(str) : null;
    File[] arrayOfFile = { localObject };
    a.c(this.a).d(arrayOfFile);
    a.a(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.o.n
 * JD-Core Version:    0.6.0
 */