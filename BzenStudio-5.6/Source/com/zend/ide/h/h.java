package com.zend.ide.h;

import com.zend.ide.util.c.m;
import com.zend.ide.util.t;
import javax.swing.Action;
import javax.swing.ActionMap;

public class h extends t
{
  protected bt i = new bt(this);
  final be h;

  public h(be parambe)
  {
    super(parambe);
  }

  protected void b()
  {
    super.b();
    a(this.i);
    ActionMap localActionMap = this.h.getActionMap();
    Object localObject = new m(new bb(this.h));
    this.i.b((Action)localObject);
    localActionMap.put(be.k, (Action)localObject);
    a("keys.openSelectedFile", (Action)localObject, "file", true);
    a("keys.openSelectedFile", (Action)localObject, "multipleSelection", true);
    localObject = new bc(this.h);
    localActionMap.put(be.j, (Action)localObject);
    a("keys.refreshFolder", (Action)localObject, "file", true);
    a("keys.refreshFolder", (Action)localObject, "directory", true);
    a("keys.refreshFolder", (Action)localObject, "root", true);
    a("keys.refreshFolder", (Action)localObject, "filesystem", true);
    a("keys.refreshFolder", (Action)localObject, "projectsTab", true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.h
 * JD-Core Version:    0.6.0
 */