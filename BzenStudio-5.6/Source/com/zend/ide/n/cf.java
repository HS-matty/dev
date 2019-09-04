package com.zend.ide.n;

import com.zend.ide.hb.gb;
import com.zend.ide.util.s;
import com.zend.ide.y.i;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;

public class cf extends ca
{
  private gb d;

  public cf()
  {
    super("FindTool");
  }

  protected void a(bw parambw)
  {
    s locals = (s)parambw.q();
    ActionMap localActionMap = parambw.c().getActionMap();
    Object localObject = new fp(this);
    localActionMap.put("find", (Action)localObject);
    locals.a("keys.find", (Action)localObject, "textComponent", false);
    localObject = new fq(this);
    localActionMap.put("find-next", (Action)localObject);
    locals.a("keys.find-next", (Action)localObject, "textComponent", false);
    localObject = new ip(this);
    localActionMap.put("find-prev", (Action)localObject);
    locals.a("keys.find-prev", (Action)localObject, "textComponent", false);
    localObject = new fr(this);
    localActionMap.put("replace", (Action)localObject);
    locals.a("keys.replace", (Action)localObject, "textComponent", false);
    this.d = new gb();
  }

  protected void d()
  {
    c().a("phpEditorPane.find", "find");
    c().a("phpEditorPane.find-next", "find-next");
    c().a("phpEditorPane.find-prev", "find-prev");
    c().a("phpEditorPane.replace", "replace");
  }

  static gb a(cf paramcf)
  {
    return paramcf.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.cf
 * JD-Core Version:    0.6.0
 */