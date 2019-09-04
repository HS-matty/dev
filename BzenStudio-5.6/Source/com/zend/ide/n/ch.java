package com.zend.ide.n;

import com.zend.ide.util.a.f;
import com.zend.ide.util.c.m;
import com.zend.ide.util.s;
import com.zend.ide.y.i;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;

public class ch extends ca
{
  private er e;
  private eq f;
  private kb g;
  private oe d;
  private ab h;

  public ch()
  {
    super("IDEEditorControlTool");
  }

  protected void a(bw parambw)
  {
    s locals = (s)parambw.q();
    ActionMap localActionMap = parambw.c().getActionMap();
    this.e = new er(this, null);
    this.f = new eq(this, null);
    this.g = new kb(this, null);
    this.d = new oe(this, null);
    this.h = new ab(this, null);
    b().a(this.h);
    locals.a(this.e);
    locals.a(this.f);
    locals.a(this.g);
    locals.a(this.d);
    Object localObject = new f(new m(new gc(this)));
    this.e.b((Action)localObject);
    localActionMap.put("save-File", (Action)localObject);
    locals.a("keys.saveFile", (Action)localObject, "textComponent", true);
    localObject = new f(new m(new gb(this)));
    this.g.b((Action)localObject);
    localActionMap.put("save-As", (Action)localObject);
    locals.a("keys.saveAs", (Action)localObject, "textComponent", true);
    localObject = new f(new m(new ga(this)));
    this.f.b((Action)localObject);
    localActionMap.put("save-All", (Action)localObject);
    locals.a("keys.saveAll", (Action)localObject, "textComponent", false);
    locals.a("keys.saveAll", (Action)localObject, "editor", true);
    localObject = new fy(this);
    localActionMap.put("new-Document", (Action)localObject);
    locals.a("keys.newDocument", (Action)localObject, "textComponent", false);
    locals.a("keys.newDocument", (Action)localObject, "editor", true);
    localObject = new fz(this);
    localActionMap.put("open-Document", (Action)localObject);
    locals.a("keys.openDocument", (Action)localObject, "textComponent", false);
    locals.a("keys.openDocument", (Action)localObject, "editor", true);
    localObject = new fw(this);
    this.g.b((Action)localObject);
    localActionMap.put("close-Document", (Action)localObject);
    locals.a("keys.closeDocument", (Action)localObject, "textComponent", true);
    locals.a("keys.closeDocument", (Action)localObject, "editor", true);
    localObject = new fx(this);
    this.g.b((Action)localObject);
    localActionMap.put("close-All-Documents", (Action)localObject);
    locals.a("keys.closeAll", (Action)localObject, "textComponent", false);
    locals.a("keys.closeAll", (Action)localObject, "editor", true);
    localObject = new pe(this);
    this.d.b((Action)localObject);
    localActionMap.put("close-Others-Documents", (Action)localObject);
    locals.a("keys.closeOthers", (Action)localObject, "textComponent", false);
    locals.a("keys.closeOthers", (Action)localObject, "editor", true);
    this.e.c();
    this.f.c();
    this.g.c();
    this.d.c();
  }

  protected void d()
  {
    c().a("phpEditorPane.saveFile", "save-File");
    c().a("phpEditorPane.saveAs", "save-As");
    c().a("editorComponent.saveAll", "save-All");
    c().a("editorComponent.newDocument", "new-Document");
    c().a("editorComponent.openDocument", "open-Document");
    c().a("editorComponent.closeDocument", "close-Document");
    c().a("editorComponent.closeAll", "close-All-Documents");
  }

  static er a(ch paramch)
  {
    return paramch.e;
  }

  static eq b(ch paramch)
  {
    return paramch.f;
  }

  static kb c(ch paramch)
  {
    return paramch.g;
  }

  static oe d(ch paramch)
  {
    return paramch.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ch
 * JD-Core Version:    0.6.0
 */