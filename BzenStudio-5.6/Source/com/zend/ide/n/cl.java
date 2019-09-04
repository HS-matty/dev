package com.zend.ide.n;

import com.zend.ide.n.b.g;
import com.zend.ide.util.s;
import com.zend.ide.y.i;
import javax.swing.ActionMap;
import javax.swing.JComponent;
import javax.swing.text.Document;

public class cl extends ca
{
  private es e = new es(this);
  private eh f = new eh(this);
  private eu g;
  private et h;

  public cl()
  {
    super("UndoManagerTool");
  }

  protected void a(bw parambw)
  {
    s locals = (s)parambw.q();
    ActionMap localActionMap = parambw.c().getActionMap();
    this.g = new eu(this);
    this.h = new et(this);
    locals.a(this.g);
    locals.a(this.h);
    gp localgp = new gp(new go(this), b());
    localActionMap.put("undo", localgp);
    this.g.b(localgp);
    locals.a("keys.undo", localgp, "textComponent", false);
    localgp = new gp(new gn(this), b());
    localActionMap.put("redo", localgp);
    this.h.b(localgp);
    locals.a("keys.redo", localgp, "textComponent", false);
    parambw.a(this.f);
    if ((parambw instanceof dm))
      this.f.b(parambw, true);
  }

  protected void d()
  {
    c().a("phpEditorPane.undo", "undo");
    c().a("phpEditorPane.redo", "redo");
  }

  private g e()
  {
    return this.e;
  }

  private g a(Document paramDocument)
  {
    ei localei = new ei(paramDocument);
    this.e.a(localei);
    return localei;
  }

  private g f()
  {
    Document localDocument = b().getDocument();
    return (g)localDocument.getProperty("undoTool");
  }

  static g a(cl paramcl)
  {
    return paramcl.e();
  }

  static g a(cl paramcl, Document paramDocument)
  {
    return paramcl.a(paramDocument);
  }

  static eu b(cl paramcl)
  {
    return paramcl.g;
  }

  static et c(cl paramcl)
  {
    return paramcl.h;
  }

  static g d(cl paramcl)
  {
    return paramcl.f();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.cl
 * JD-Core Version:    0.6.0
 */