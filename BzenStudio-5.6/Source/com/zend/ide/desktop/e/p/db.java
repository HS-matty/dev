package com.zend.ide.desktop.e.p;

import com.zend.ide.j.h;
import com.zend.ide.n.bw;
import com.zend.ide.w.c.e;
import java.awt.event.ActionEvent;
import java.io.File;

class db extends x
{
  final a c;

  public db(a parama)
  {
    super(parama, "svnResolveActionKey", e.a(a.c(parama), "Resolve", null));
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
 * Qualified Name:     com.zend.ide.desktop.e.p.db
 * JD-Core Version:    0.6.0
 */