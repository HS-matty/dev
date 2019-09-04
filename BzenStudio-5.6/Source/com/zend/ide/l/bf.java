package com.zend.ide.l;

import com.zend.ide.util.c.m;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import com.zend.ide.util.n;
import com.zend.ide.util.o;
import com.zend.ide.util.r;
import com.zend.ide.util.s;
import java.io.File;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.JComponent;

class bf extends s
  implements w, r
{
  private final String h = ct.a(213);
  private final String i = ct.a(214);
  private final Icon j = cv.b("saveproject16.gif");
  private final Icon k = cv.b("saveasproject16.gif");
  final g g;

  bf(g paramg)
  {
  }

  public void b()
  {
    this.g.a(this);
    ActionMap localActionMap = this.g.c().getActionMap();
    bh localbh = new bh(this);
    bi localbi = new bi(this);
    a(localbh);
    a(localbi);
    Object localObject = new bm(this.g);
    localbh.b((Action)localObject);
    localActionMap.put("CheckIncludesAction", (Action)localObject);
    a("keys.checkIncludes", (Action)localObject, "projectsTab", true);
    localObject = new bp(this.g);
    localActionMap.put("NewProjectAction", (Action)localObject);
    a("keys.newProject", (Action)localObject, "projectsTab", true);
    a("keys.newProject", (Action)localObject, "TabbedPaneContext", true);
    localObject = new m(new bq(this.g));
    localActionMap.put("OpenProjectAction", (Action)localObject);
    a("keys.openProject", (Action)localObject, "projectsTab", true);
    a("keys.openProject", (Action)localObject, "TabbedPaneContext", true);
    localObject = new bt(this.g);
    localActionMap.put("SaveProjectAction", (Action)localObject);
    a("keys.saveProject", (Action)localObject, "projectsTab", true);
    a("keys.saveProject", (Action)localObject, "TabbedPaneContext", true);
    localObject = new bn(this.g);
    localbh.b((Action)localObject);
    localActionMap.put("CloseProjectAction", (Action)localObject);
    a("keys.closeProject", (Action)localObject, "projectsTab", true);
    a("keys.closeProject", (Action)localObject, "TabbedPaneContext", true);
    localObject = new bs(this.g);
    localbi.b((Action)localObject);
    localActionMap.put("RemoveFromProjectAction", (Action)localObject);
    localObject = new br(this.g);
    localbi.b((Action)localObject);
    localActionMap.put("RemoveAllFromProjectAction", (Action)localObject);
    a("keys.removeAllFromProject", (Action)localObject, "projectsTab", true);
    localObject = new bl(this.g);
    localbh.b((Action)localObject);
    localActionMap.put("AddExistingToProject", (Action)localObject);
    a("keys.addExistingToProject", (Action)localObject, "projectsTab", true);
    localObject = new bo(this.g);
    localbh.b((Action)localObject);
    localActionMap.put("EncodeProjectAction", (Action)localObject);
    a("keys.encodeProject", (Action)localObject, "projectsTab", true);
    localObject = new bu(this.g);
    localbh.b((Action)localObject);
    localActionMap.put("ShowProjectPropertiesAction", (Action)localObject);
    a("keys.showProjectProperties", (Action)localObject, "projectsTab", true);
    a();
  }

  public void d(u paramu)
  {
    e();
    a();
  }

  public void b(u paramu)
  {
    e();
    a();
  }

  public void a(File[] paramArrayOfFile)
  {
    e();
  }

  public void b(File[] paramArrayOfFile)
  {
    e();
  }

  public void c(File paramFile1, File paramFile2)
  {
  }

  public void r(File paramFile)
  {
  }

  public void c(u paramu)
  {
  }

  public void c(File paramFile, boolean paramBoolean)
  {
  }

  public void t(File paramFile)
  {
  }

  public void s(File paramFile)
  {
  }

  public void a(u paramu)
  {
  }

  public void a(File paramFile)
  {
  }

  private void a()
  {
    boolean bool = this.g.e();
    String str = bool ? this.h : this.i;
    Icon localIcon = bool ? this.j : this.k;
    o localo = n.c().a("keys.saveProject");
    localo.a(str);
    localo.a(localIcon);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.bf
 * JD-Core Version:    0.6.0
 */