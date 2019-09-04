package com.zend.ide.desktop.e.p;

import com.zend.ide.j.h;
import com.zend.ide.n.bw;
import com.zend.ide.w.c.e;
import java.awt.event.ActionEvent;
import java.io.File;

class cb extends x
{
  final a c;

  public cb(a parama)
  {
    super(parama, "svnLogActionKey", e.a(a.c(parama), "Log", null));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = a.b(this.c).k();
    Object localObject = str != null ? h.m.g(str) : null;
    a(new File[] { localObject });
    super.actionPerformed(paramActionEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.p.cb
 * JD-Core Version:    0.6.0
 */