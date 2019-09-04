package com.zend.ide.f;

import com.zend.ide.p.bf;
import com.zend.ide.util.bb;
import com.zend.ide.util.c.h;
import com.zend.ide.util.ct;
import com.zend.ide.y.e;
import com.zend.ide.y.i;
import java.beans.PropertyChangeListener;
import javax.swing.ActionMap;
import javax.swing.tree.DefaultMutableTreeNode;

public class de extends db
{
  private e l;
  private PropertyChangeListener m = new eb(this, null);
  private Object[] z;
  private i B;
  private com.zend.ide.util.c.f k;

  public de(s params)
  {
    super(params, ct.a(550));
    setRootVisible(false);
    setShowsRootHandles(true);
    d("phpFunctionsBrowser");
    this.k = h.c().b(new t(this));
    this.k.a(2000L, 1000L);
    p();
    setName("PHP Inspector");
  }

  protected DefaultMutableTreeNode b(Object paramObject)
  {
    return new dp(this, paramObject);
  }

  protected bb d()
  {
    cz localcz = new cz(this);
    getActionMap().put("showFunctionHelpAction", localcz);
    bf localbf = new bf(this);
    localbf.a("keys.functionHelpAction", localcz, "functionDataContext", true);
    return localbf;
  }

  private void p()
  {
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.l = new e(localf);
    localf.a("desktop.phpVersion", this.m);
    this.l.a("desktop.phpVersion");
    localf.a("desktop.includeFrameworkData", this.m);
    this.l.a("desktop.includeFrameworkData");
    this.B = new i(this);
    this.B.a("editor.functionHelpAction", "showFunctionHelpAction");
  }

  protected void k()
  {
  }

  static com.zend.ide.util.c.f b(de paramde)
  {
    return paramde.k;
  }

  static com.zend.ide.util.c.f a(de paramde, com.zend.ide.util.c.f paramf)
  {
    return paramde.k = paramf;
  }

  static Object[] a(de paramde)
  {
    return paramde.z;
  }

  static Object[] a(de paramde, Object[] paramArrayOfObject)
  {
    return paramde.z = paramArrayOfObject;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.de
 * JD-Core Version:    0.6.0
 */