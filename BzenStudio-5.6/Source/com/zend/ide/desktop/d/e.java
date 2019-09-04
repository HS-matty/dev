package com.zend.ide.desktop.d;

import com.zend.ide.l.u;
import com.zend.ide.l.v;
import com.zend.ide.l.x;
import com.zend.ide.util.s;
import com.zend.ide.y.i;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;

class e extends x
{
  final j a;
  final Action c;
  final a b;

  e(a parama, j paramj, Action paramAction)
  {
  }

  public void b(u paramu)
  {
    s locals = (s)a.b(this.b).h().q();
    locals.a(this.a);
    locals.a("keys.codeAnalyzer", this.c, "file", true);
    locals.a("keys.codeAnalyzer", this.c, "multipleSelection", true);
    locals.a("keys.codeAnalyzer", this.c, "directory", true);
    locals.a("keys.codeAnalyzer", this.c, "project_root", true);
    a.b(this.b).h().c().getActionMap().put("AnalyzeTreeAction", this.c);
    a.a(this.b, new i(a.b(this.b).h().c()));
    a.a(this.b).a("codeAnalyzer", "AnalyzeTreeAction", 0);
  }

  public void d(u paramu)
  {
    a.b(this.b).h().c().getActionMap().remove("AnalyzeTreeAction");
    a.a(this.b).a("codeAnalyzer");
    a.a(this.b, null);
    s locals = (s)a.b(this.b).h().q();
    locals.a("keys.codeAnalyzer", "file", true);
    locals.a("keys.codeAnalyzer", "multipleSelection", true);
    locals.a("keys.codeAnalyzer", "directory", true);
    locals.a("keys.codeAnalyzer", "project_root", true);
    locals.b(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.d.e
 * JD-Core Version:    0.6.0
 */