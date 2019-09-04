package com.zend.ide.o;

import com.zend.ide.n.bw;
import com.zend.ide.util.dr;
import com.zend.ide.util.r;
import com.zend.ide.util.s;
import javax.swing.Action;
import javax.swing.ActionMap;

class dp extends s
  implements r
{
  cj g = new cj(this);
  final fk h;

  public dp(fk paramfk)
  {
    paramfk.a(this.g);
  }

  protected void b()
  {
    bw localbw = this.h.bd();
    localbw.a(this.h);
    dz localdz = new dz(this);
    dy localdy = new dy(this, null);
    eb localeb = new eb(this, null);
    ea localea = new ea(this, null);
    ec localec = new ec(this, null);
    ce localce = new ce(this, null);
    dx localdx = new dx(this);
    a(localdz);
    a(localdy);
    a(localea);
    a(localce);
    a(localec);
    a(localeb);
    a(localdx);
    ActionMap localActionMap = this.h.C();
    Object localObject = localActionMap.get("ToggleBreakpointAction");
    localdz.b((Action)localObject);
    a("keys.toggleBreakpoint", (Action)localObject, "textComponent", true);
    localObject = new dr(this, localActionMap.get("RemoveAllBreakpointsAction"), localdx);
    a("keys.removeAllBreakpoints", (Action)localObject, "default", false);
    localObject = localActionMap.get("StepOutAction");
    localec.b((Action)localObject);
    a("keys.stepOut", (Action)localObject, "default", false);
    localObject = localActionMap.get("StepIntoAction");
    localec.b((Action)localObject);
    a("keys.stepInto", (Action)localObject, "default", false);
    localObject = localActionMap.get("StepOverAction");
    localce.b((Action)localObject);
    a("keys.stepOver", (Action)localObject, "default", false);
    localObject = localActionMap.get("GoAction");
    localea.b((Action)localObject);
    a("keys.go", (Action)localObject, "default", false);
    localObject = localActionMap.get("RunAction");
    localea.b((Action)localObject);
    a("keys.run", (Action)localObject, "default", false);
    localObject = localActionMap.get("GoToCursorAction");
    localea.b((Action)localObject);
    a("keys.gotoCursor", (Action)localObject, "default", false);
    localObject = localActionMap.get("AddWatchAction");
    a("keys.addWatch", (Action)localObject, "textComponent", true);
    localObject = localActionMap.get("OpenDebugWindowAction");
    a("keys.showDebugWindow", (Action)localObject, "default", false);
    localObject = new dr(this, localActionMap.get("FinishDebugAction"), localdy);
    localdy.b((Action)localObject);
    a("keys.finishDebugger", (Action)localObject, "default", false);
    localObject = localActionMap.get("PauseAction");
    localeb.b((Action)localObject);
    a("keys.pauseDebugger", (Action)localObject, "default", false);
    localObject = localActionMap.get("ToggleOutputAreaAction");
    a("keys.toggleOutputArea", (Action)localObject, "default", false);
    a("keys.toggleOutputArea", (Action)localObject, "debug_output", true);
    a("keys.toggleOutputArea", (Action)localObject, this.h.D().r(), true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.dp
 * JD-Core Version:    0.6.0
 */