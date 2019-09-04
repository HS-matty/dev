package com.zend.ide.n.td;

import com.zend.ide.f.bp;
import com.zend.ide.f.pd;
import com.zend.ide.m.bf;
import com.zend.ide.n.bw;
import com.zend.ide.n.ca;
import com.zend.ide.n.dm;
import com.zend.ide.n.gx;
import com.zend.ide.r.bo;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import com.zend.ide.r.r;
import com.zend.ide.y.b;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import com.zend.ide.y.i;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class bc extends ca
  implements pd, r
{
  private static boolean d = ((Boolean)b.a("editing.foldingEnabled")).booleanValue();
  private cc e = new cc(this, null);
  private Map f = new HashMap();
  private String g = "";
  private PropertyChangeListener h = new cb(this, null);
  private e i;

  public bc()
  {
    super("CodeFoldingTool");
    a();
  }

  private void a()
  {
    f localf = new f();
    this.i = new e(localf);
    localf.a("editing.foldingEnabled", this.h);
    this.i.a("editing.foldingEnabled");
  }

  public static boolean b()
  {
    return d;
  }

  protected void a(bw parambw)
  {
    com.zend.ide.util.s locals = (com.zend.ide.util.s)parambw.q();
    ActionMap localActionMap = parambw.c().getActionMap();
    Action localAction = nb.a(parambw);
    localActionMap.put("expandAllFolds", localAction);
    locals.a("keys.folding*keys.expandAllFolds", localAction, "textComponent", false);
    localAction = nb.b(parambw);
    localActionMap.put("collapseAllFolds", localAction);
    locals.a("keys.folding*keys.collapseAllFolds", localAction, "textComponent", false);
    localAction = nb.d(parambw);
    localActionMap.put("foldFunctions", localAction);
    locals.a("keys.folding*keys.foldFunctions", localAction, "textComponent", false);
    localAction = nb.e(parambw);
    localActionMap.put("foldClasses", localAction);
    locals.a("keys.folding*keys.foldClasses", localAction, "textComponent", false);
    localAction = nb.f(parambw);
    localActionMap.put("foldNonPHP", localAction);
    locals.a("keys.folding*keys.foldNonPHP", localAction, "textComponent", false);
    localAction = nb.g(parambw);
    localActionMap.put("foldDocs", localAction);
    locals.a("keys.folding*keys.foldDocs", localAction, "textComponent", false);
    localAction = nb.c(parambw);
    localActionMap.put("collapseInScope", localAction);
    locals.a("keys.folding*keys.collapseInScope", localAction, "textComponent", false);
    b().a(this.e);
    p.e().a(this);
  }

  protected void b(bw parambw)
  {
    com.zend.ide.util.s locals = (com.zend.ide.util.s)parambw.q();
    ActionMap localActionMap = parambw.c().getActionMap();
    localActionMap.remove("expandAllFolds");
    locals.a("keys.folding*keys.expandAllFolds", "textComponent", false);
    localActionMap.remove("collapseAllFolds");
    locals.a("keys.folding*keys.collapseAllFolds", "textComponent", false);
    localActionMap.remove("foldFunctions");
    locals.a("keys.folding*keys.foldFunctions", "textComponent", false);
    localActionMap.remove("foldClasses");
    locals.a("keys.folding*keys.foldClasses", "textComponent", false);
    localActionMap.remove("foldNonPHP");
    locals.a("keys.folding*keys.foldNonPHP", "textComponent", false);
    localActionMap.remove("foldDocs");
    locals.a("keys.folding*keys.foldDocs", "textComponent", false);
    b().b(this.e);
    p.e().b(this);
  }

  protected void d()
  {
    if (!d)
      return;
    c().a("editor.expandAllFolds", "expandAllFolds");
    c().a("editor.collapseAllFolds", "expandAllFolds");
    c().a("editor.foldClasses", "foldClasses");
    c().a("editor.foldFunctions", "foldFunctions");
    c().a("editor.foldNonPHP", "foldNonPHP");
    c().a("editor.foldDocs", "foldDocs");
  }

  protected void c()
  {
    c().a("editor.expandAllFolds");
    c().a("editor.collapseAllFolds");
    c().a("editor.foldClasses");
    c().a("editor.foldFunctions");
    c().a("editor.foldNonPHP");
    c().a("editor.foldDocs");
  }

  private void a(String paramString, boolean paramBoolean)
  {
    if ((paramString != null) && (!paramString.equals("")))
    {
      bf localbf = bp.d().b().a(paramString);
      a(paramString, localbf, paramBoolean);
    }
  }

  private void a(String paramString, bf parambf, boolean paramBoolean)
  {
    a(paramString, parambf);
    if (this.g.equals(paramString))
      b().repaint();
  }

  private void a(String paramString, bf parambf)
  {
    Object localObject;
    if (this.f.containsKey(paramString))
    {
      localObject = (jb)this.f.get(paramString);
      ((jb)localObject).a(parambf);
    }
    else
    {
      localObject = b().a(paramString);
      if (localObject != null)
      {
        jb localjb = ((gx)((dm)localObject).e()).a();
        if (localjb != null)
        {
          this.f.put(paramString, localjb);
          localjb.a(parambf);
        }
      }
    }
  }

  public void a(bf parambf)
  {
    a(parambf.a(), parambf, false);
  }

  public void b(bf parambf)
  {
    a(parambf.a(), parambf, false);
  }

  public void c(bf parambf)
  {
    if (parambf != null)
      this.f.remove(parambf.a());
    a(parambf.a(), parambf, false);
  }

  public void h()
  {
  }

  public void a(bo parambo)
  {
    SwingUtilities.invokeLater(new bb(this, parambo));
  }

  public void a(o paramo)
  {
  }

  public void c(o paramo)
  {
  }

  static bw a(bc parambc)
  {
    return parambc.b();
  }

  static void a(bc parambc, String paramString, bf parambf)
  {
    parambc.a(paramString, parambf);
  }

  static bw b(bc parambc)
  {
    return parambc.b();
  }

  static void a(bc parambc, String paramString, boolean paramBoolean)
  {
    parambc.a(paramString, paramBoolean);
  }

  static Map c(bc parambc)
  {
    return parambc.f;
  }

  static String a(bc parambc, String paramString)
  {
    return parambc.g = paramString;
  }

  static String d(bc parambc)
  {
    return parambc.g;
  }

  static boolean a(boolean paramBoolean)
  {
    return bc.d = paramBoolean;
  }

  static boolean d()
  {
    return d;
  }

  static bw e(bc parambc)
  {
    return parambc.b();
  }

  static bw f(bc parambc)
  {
    return parambc.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.bc
 * JD-Core Version:    0.6.0
 */