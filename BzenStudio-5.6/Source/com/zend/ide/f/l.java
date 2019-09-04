package com.zend.ide.f;

import com.zend.ide.p.bf;
import com.zend.ide.util.dr;
import javax.swing.Action;
import javax.swing.ActionMap;

class l extends bf
{
  final db g;

  public l(db paramdb)
  {
    super(paramdb);
    b();
  }

  private void b()
  {
    ActionMap localActionMap = this.g.getActionMap();
    localActionMap.put("GotoSourceAction", new cv(this.g));
    localActionMap.put("CheckIncludeFileAction", new cs(this.g));
    localActionMap.put("addDescriptionAction", new cr(this.g));
    localActionMap.put("GotoIncludeFileAction", new ct(this.g));
    localActionMap.put("GotoWsdlFileAction", new ee(this.g));
    localActionMap.put("RefreshSoapClientAction", new fe(this.g));
    m localm = new m(this);
    x localx = new x(this);
    ae localae = new ae(this);
    Object localObject = new dr(this, localActionMap.get("GotoSourceAction"), localae);
    a("keys.gotoSource", (Action)localObject, "classDataContext", true);
    a("keys.gotoSource", (Action)localObject, "wsClassDataContext", true);
    a("keys.gotoSource", (Action)localObject, "DataTypeDataContext", true);
    a("keys.gotoSource", (Action)localObject, "functionDataContext", true);
    a("keys.gotoSource", (Action)localObject, "variableDataContext", true);
    a("keys.gotoSource", (Action)localObject, "classConstDataContext", true);
    a("keys.gotoSource", (Action)localObject, "includeFileDataContext", true);
    a("keys.gotoSource", (Action)localObject, "constantsDataContext", true);
    localObject = localActionMap.get("GotoWsdlFileAction");
    a("keys.gotoWsdlFile", (Action)localObject, "wsClassDataContext", true);
    localObject = localActionMap.get("RefreshSoapClientAction");
    a("keys.refreshSoapClientAction", (Action)localObject, "wsClassDataContext", true);
    localObject = localActionMap.get("CheckIncludeFileAction");
    a("keys.checkIncludes", (Action)localObject, com.zend.ide.f.b.l.l, true);
    localObject = new dr(this, localActionMap.get("addDescriptionAction"), localm);
    a("keys.addDescription", (Action)localObject, "classDataContext", true);
    a("keys.addDescription", (Action)localObject, "wsClassDataContext", true);
    a("keys.addDescription", (Action)localObject, "DataTypeDataContext", true);
    a("keys.addDescription", (Action)localObject, "fileDataContext", true);
    a("keys.addDescription", (Action)localObject, "functionDataContext", true);
    a("keys.addDescription", (Action)localObject, "constantsDataContext", true);
    a("keys.addDescription", (Action)localObject, "variableDataContext", true);
    a("keys.addDescription", (Action)localObject, "classConstDataContext", true);
    a("keys.addDescription", (Action)localObject, "includeFileDataContext", true);
    localObject = new dr(this, localActionMap.get("GotoIncludeFileAction"), localx);
    a("keys.gotoIncludeFile", (Action)localObject, "includeFileDataContext", true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.l
 * JD-Core Version:    0.6.0
 */