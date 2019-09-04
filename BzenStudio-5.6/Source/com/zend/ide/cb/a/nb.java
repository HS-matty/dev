package com.zend.ide.cb.a;

import com.zend.ide.util.u;
import com.zend.ide.y.i;
import javax.swing.Action;
import javax.swing.ActionMap;

public class nb extends u
{
  private i j;
  final od i;

  public nb(od paramod)
  {
    super(paramod);
  }

  public void b()
  {
    super.b();
    ActionMap localActionMap = this.i.getActionMap();
    Action localAction = localActionMap.get("closeAction");
    a("keys.closeDocument", localAction, "sqlResults", true);
    localAction = localActionMap.get("closeAllAction");
    a("keys.closeAll", localAction, "sqlResults", true);
    localAction = localActionMap.get("closeOthersAction");
    a("keys.closeOthers", localAction, "sqlResults", true);
    this.j = new i(this.i);
    this.j.a("editorComponent.closeDocument", "closeAction", 2);
    this.j.a("editorComponent.closeAll", "closeAllAction", 2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.nb
 * JD-Core Version:    0.6.0
 */