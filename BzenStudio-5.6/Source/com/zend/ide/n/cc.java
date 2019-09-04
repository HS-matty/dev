package com.zend.ide.n;

import com.zend.ide.util.s;
import com.zend.ide.y.i;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;

public class cc extends ca
{
  private ec e;
  private bh f;
  private en g;
  private eo h;

  public cc()
  {
    super("CaretChangeTool");
  }

  protected void a(bw parambw)
  {
    this.e = new ec(this, null);
    parambw.a(this.e);
    this.f = new bh(this);
    parambw.addCaretListener(this.f);
    s locals = (s)parambw.q();
    ActionMap localActionMap = parambw.c().getActionMap();
    this.g = new en(this, null);
    locals.a(this.g);
    this.h = new eo(this, null);
    locals.a(this.h);
    Object localObject = new fi(this);
    localActionMap.put("back", (Action)localObject);
    this.g.b((Action)localObject);
    locals.a("keys.back", (Action)localObject, "textComponent", false);
    localObject = new fj(this);
    localActionMap.put("forward", (Action)localObject);
    this.h.b((Action)localObject);
    locals.a("keys.forward", (Action)localObject, "textComponent", false);
  }

  protected void d()
  {
    c().a("phpEditorPane.back", "back");
    c().a("phpEditorPane.forward", "forward");
  }

  static bh a(cc paramcc)
  {
    return paramcc.f;
  }

  static en b(cc paramcc)
  {
    return paramcc.g;
  }

  static eo c(cc paramcc)
  {
    return paramcc.h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.cc
 * JD-Core Version:    0.6.0
 */