package com.zend.ide.g;

import com.zend.ide.util.dr;
import com.zend.ide.util.u;
import javax.swing.Action;
import javax.swing.ActionMap;

public class f extends u
{
  final m i;

  public f(m paramm)
  {
    super(paramm);
  }

  public void b()
  {
    super.b();
    ActionMap localActionMap = this.i.getActionMap();
    Object localObject = new dr(this, new k(this.i), this.g);
    localActionMap.put(m.k, (Action)localObject);
    a("keys.showInBrowser", (Action)localObject, "outputComponent", true);
    a("keys.showInBrowser", (Action)localObject, "debug_output", true);
    localObject = localActionMap.get("closeAction");
    a("keys.closeDocument", (Action)localObject, "debug_output", true);
    a("keys.closeDocument", (Action)localObject, "outputComponent", true);
    localObject = localActionMap.get("closeAllAction");
    a("keys.closeAll", (Action)localObject, "debug_output", true);
    a("keys.closeAll", (Action)localObject, "outputComponent", false);
    localObject = localActionMap.get("closeOthersAction");
    a("keys.closeOthers", (Action)localObject, "debug_output", true);
    a("keys.closeOthers", (Action)localObject, "outputComponent", false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.g.f
 * JD-Core Version:    0.6.0
 */