package com.zend.ide.n;

import com.zend.ide.util.s;
import com.zend.ide.y.i;
import javax.swing.ActionMap;
import javax.swing.JComponent;

public class cd extends ca
{
  public cd()
  {
    super("CommentsTool");
  }

  protected void a(bw parambw)
  {
    s locals = (s)parambw.q();
    ActionMap localActionMap = parambw.c().getActionMap();
    gp localgp = new gp(new fl(this), b());
    localActionMap.put("lineComment", localgp);
    locals.a("keys.addRemoveComment", localgp, "textComponent", false);
    localgp = new gp(new fk(this), b());
    localActionMap.put("phpBlockComment", localgp);
    locals.a("keys.addRemovePHPBlockComment", localgp, "textComponent", false);
  }

  protected void d()
  {
    c().a("phpEditorPane.addRemoveComment", "lineComment");
    c().a("phpEditorPane.addRemovePHPBlockComment", "phpBlockComment");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.cd
 * JD-Core Version:    0.6.0
 */