package com.zend.ide.n;

import com.zend.ide.util.s;
import com.zend.ide.y.i;
import javax.swing.ActionMap;
import javax.swing.JComponent;

public class cj extends ca
{
  public cj()
  {
    super("PrintTool");
  }

  protected void a(bw parambw)
  {
    s locals = (s)parambw.q();
    ActionMap localActionMap = parambw.c().getActionMap();
    gh localgh = new gh(this);
    localActionMap.put("print", localgh);
    locals.a("keys.print", localgh, "textComponent", false);
  }

  protected void d()
  {
    c().a("phpEditorPane.print", "print");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.cj
 * JD-Core Version:    0.6.0
 */