package com.zend.ide.o;

import com.zend.ide.util.r;
import com.zend.ide.util.s;
import javax.swing.Action;
import javax.swing.ActionMap;

class g extends s
  implements r
{
  final fq g;

  private g(fq paramfq)
  {
  }

  private void b()
  {
    ActionMap localActionMap = this.g.getActionMap();
    localActionMap.put("RemoveSelectedBreakpointsAction", new du(this.g));
    dr localdr = new dr(this, null);
    a(localdr);
    dq localdq = new dq(this, null);
    a(localdq);
    dt localdt = new dt(this, null);
    a(localdt);
    ds localds = new ds(this, null);
    a(localds);
    Object localObject = localActionMap.get("RemoveSelectedBreakpointsAction");
    a("keys.removeBreakpoint", (Action)localObject, "breakpoint", true);
    a("keys.removeBreakpoint", (Action)localObject, "multipleSelection", true);
    a("keys.delete", (Action)localObject, "breakpoint", false);
    a("keys.delete", (Action)localObject, "multipleSelection", false);
    localObject = new com.zend.ide.util.dr(this, new el(this.g), localdr);
    a("keys.enableBreakpoint", (Action)localObject, "breakpoint", true);
    a("keys.enableBreakpoint", (Action)localObject, "multipleSelection", true);
    localObject = new com.zend.ide.util.dr(this, new ei(this.g), localdq);
    a("keys.disableBreakpoint", (Action)localObject, "breakpoint", true);
    a("keys.disableBreakpoint", (Action)localObject, "multipleSelection", true);
    localObject = new ej(this.g);
    a("keys.editBreakpoint", (Action)localObject, "breakpoint", true);
    localObject = new em(this.g);
    a("keys.gotoSource", (Action)localObject, "breakpoint", true);
    localObject = fq.b(this.g).C().get("RemoveAllBreakpointsAction");
    a("keys.deleteAllBreakpoints", (Action)localObject, "breakpointCompoent", true);
    localObject = new com.zend.ide.util.dr(this, new ek(this.g), localdt);
    a("keys.enableAllBreakpoints", (Action)localObject, "breakpointCompoent", true);
    localObject = new com.zend.ide.util.dr(this, new eh(this.g), localds);
    a("keys.disableAllBreakpoints", (Action)localObject, "breakpointCompoent", true);
  }

  static void a(g paramg)
  {
    paramg.b();
  }

  g(fq paramfq, f paramf)
  {
    this(paramfq);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.g
 * JD-Core Version:    0.6.0
 */