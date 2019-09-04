package com.zend.ide.o.c;

import com.zend.ide.o.fk;
import com.zend.ide.util.dr;
import javax.swing.Action;
import javax.swing.ActionMap;

class j extends v
{
  final bq h;

  j(bq parambq)
  {
    super(parambq);
  }

  private void b()
  {
    ActionMap localActionMap = this.h.getActionMap();
    localActionMap.put("removeWatchkey", new bn(this.h));
    l locall = new l(this);
    a(locall);
    Object localObject = this.h.j.C().get("AddWatchAction");
    a("keys.addWatch", (Action)localObject, "watch", true);
    localObject = new dr(this, new bm(this.h), locall);
    a("keys.removeAllWatchs", (Action)localObject, "watch", true);
    localObject = localActionMap.get("removeWatchkey");
    a("keys.removeWatch", (Action)localObject, "watch_root_cnotext", true);
    a("keys.removeWatch", (Action)localObject, "multipleSelection", true);
    a("keys.delete", (Action)localObject, "watch_root_cnotext", false);
    localObject = localActionMap.get("CopyValueAction");
    a("keys.copyValue", (Action)localObject, "watch_root_cnotext", true);
    localObject = localActionMap.get("AssignValueAction");
    a("keys.assignValue", (Action)localObject, "watch_root_cnotext", true);
    localObject = new bl(this.h);
    a("keys.editWatch", (Action)localObject, "watch_root_cnotext", true);
  }

  static void a(j paramj)
  {
    paramj.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.j
 * JD-Core Version:    0.6.0
 */