package com.zend.ide.eb;

import com.zend.ide.n.gz;
import com.zend.ide.y.f;
import com.zend.ide.y.i;

class e extends gz
{
  final k a;

  e(k paramk)
  {
  }

  protected void z()
  {
    this.v = new i(c());
    this.v.a("editor.functionHelpAction", "functionHelp", 0);
    f localf = new f();
    this.n = new com.zend.ide.y.e(localf);
    localf.a("editing.font", this.q);
    localf.a("editing.tabSize", this.s);
    localf.a("editing.lineWrap", this.t);
    localf.a("editing.wordWrap", this.u);
    this.n.a("editing.font");
    this.n.a("editing.tabSize");
    this.n.a("editing.lineWrap");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.e
 * JD-Core Version:    0.6.0
 */