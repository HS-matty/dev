package com.zend.ide.h;

import com.zend.ide.util.a.f;
import com.zend.ide.util.dq;
import javax.swing.Action;
import javax.swing.ActionMap;

public class i extends h
{
  final bf i;

  protected i(bf parambf)
  {
    super(parambf);
  }

  protected void b()
  {
    super.b();
    ActionMap localActionMap = this.i.getActionMap();
    o localo = new o(this);
    j localj = new j(this);
    q localq = new q(this);
    l locall = new l(this);
    p localp = new p(this);
    n localn = new n(this);
    m localm = new m(this);
    a(localo);
    a(localj);
    a(localq);
    a(locall);
    a(localp);
    a(localn);
    a(localm);
    Object localObject = new com.zend.ide.util.c.m(new w(this.i));
    localObject = new dq(this, (Action)localObject);
    localm.b((Action)localObject);
    localActionMap.put(bf.u, (Action)localObject);
    a("keys.copy", (Action)localObject, "file", true);
    a("keys.copy", (Action)localObject, "directory", true);
    a("keys.copy", (Action)localObject, "multipleSelection", true);
    localObject = new com.zend.ide.util.c.m(new x(this.i));
    localObject = new dq(this, (Action)localObject);
    localj.b((Action)localObject);
    localActionMap.put(bf.w, (Action)localObject);
    a("keys.cut", (Action)localObject, "file", true);
    a("keys.cut", (Action)localObject, "directory", true);
    a("keys.cut", (Action)localObject, "multipleSelection", true);
    localObject = new com.zend.ide.util.c.m(new z(this.i));
    localObject = new f((Action)localObject);
    localObject = new dq(this, (Action)localObject);
    localq.b((Action)localObject);
    localActionMap.put(bf.A, (Action)localObject);
    a("keys.paste", (Action)localObject, "file", true);
    a("keys.paste", (Action)localObject, "directory", true);
    a("keys.paste", (Action)localObject, "root", true);
    localObject = new com.zend.ide.util.c.m(new y(this.i));
    localObject = new f((Action)localObject);
    localObject = new dq(this, (Action)localObject);
    localn.b((Action)localObject);
    localActionMap.put(bf.t, (Action)localObject);
    a("keys.delete", (Action)localObject, "file", true);
    a("keys.delete", (Action)localObject, "directory", true);
    a("keys.delete", (Action)localObject, "multipleSelection", true);
    localObject = new com.zend.ide.util.c.m(new u(this.i));
    localObject = new f((Action)localObject);
    localObject = new dq(this, (Action)localObject);
    localp.b((Action)localObject);
    localActionMap.put(bf.x, (Action)localObject);
    a("keys.addFile", (Action)localObject, "directory", true);
    a("keys.addFile", (Action)localObject, "root", true);
    localObject = new com.zend.ide.util.c.m(new v(this.i));
    localObject = new f((Action)localObject);
    localObject = new dq(this, (Action)localObject);
    localp.b((Action)localObject);
    localActionMap.put(bf.y, (Action)localObject);
    a("keys.addFolder", (Action)localObject, "directory", true);
    a("keys.addFolder", (Action)localObject, "root", true);
    localObject = new com.zend.ide.util.c.m(new ba(this.i));
    localObject = new f((Action)localObject);
    localActionMap.put(bf.z, (Action)localObject);
    a("keys.rename", (Action)localObject, "file", true);
    a("keys.rename", (Action)localObject, "directory", true);
    localObject = localActionMap.get(be.k);
    a("keys.openSelectedFile", (Action)localObject, "file", true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.i
 * JD-Core Version:    0.6.0
 */