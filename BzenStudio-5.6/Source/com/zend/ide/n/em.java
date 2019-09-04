package com.zend.ide.n;

import com.zend.ide.util.s;
import javax.swing.ActionMap;

class em extends s
{
  final gz g;

  private em(gz paramgz)
  {
  }

  private void b()
  {
    ActionMap localActionMap = this.g.getActionMap();
    gp localgp = new gp(new jg(this.g, localActionMap.get("cut-to-clipboard")), this.g);
    a("keys.cut", localgp, "textComponent", true);
    localgp = new gp(new jg(this.g, localActionMap.get("copy-to-clipboard")), this.g);
    a("keys.copy", localgp, "textComponent", true);
    localgp = new gp(new jg(this.g, localActionMap.get("paste-from-clipboard")), this.g);
    a("keys.paste", localgp, "textComponent", true);
    localgp = new gp(new jg(this.g, localActionMap.get("select-all")), this.g);
    a("keys.selectAll", localgp, "textComponent", false);
  }

  static void a(em paramem)
  {
    paramem.b();
  }

  em(gz paramgz, cy paramcy)
  {
    this(paramgz);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.em
 * JD-Core Version:    0.6.0
 */