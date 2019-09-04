package com.zend.ide.o.c;

import com.zend.ide.p.bf;
import com.zend.ide.util.dr;
import javax.swing.Action;
import javax.swing.ActionMap;

public class v extends bf
{
  final bo l;

  v(bo parambo)
  {
    super(parambo);
    ActionMap localActionMap = parambo.getActionMap();
    localActionMap.put("AssignValueAction", new bh(parambo));
    localActionMap.put("CopyValueAction", new bi(parambo));
    localActionMap.put("WatchFromHereAction", new bk(parambo));
    k localk = new k(this);
    a(localk);
    Object localObject = new dr(this, localActionMap.get("AssignValueAction"), localk);
    a("keys.assignValue", (Action)localObject, "variableContext", true);
    localObject = localActionMap.get("CopyValueAction");
    a("keys.copyValue", (Action)localObject, "variableContext", true);
    localObject = new dr(this, localActionMap.get("WatchFromHereAction"), localk);
    a("keys.watchFromHere", (Action)localObject, "variableContext", true);
    a("keys.watchFromHere", (Action)localObject, "multipleSelection", true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.v
 * JD-Core Version:    0.6.0
 */