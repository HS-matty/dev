package com.zend.ide.l;

import com.zend.ide.h.br;
import com.zend.ide.p.bx;
import com.zend.ide.p.fb.b;
import com.zend.ide.util.eo;
import java.awt.Rectangle;
import java.util.Hashtable;
import java.util.LinkedList;
import javax.swing.JPanel;

class y extends x
  implements k
{
  b b;
  final g a;

  y(g paramg)
  {
  }

  public void a(u paramu)
  {
    g.a(this.a, paramu);
  }

  public void b(u paramu)
  {
    bx.a(new cb(this));
  }

  public void c(u paramu)
  {
    g.a(this.a, null);
  }

  public void d(u paramu)
  {
    g.a(this.a).b(this.a.i());
    com.zend.ide.j.y localy = ((be)((e)paramu.d().get("project_roots")).b()).b();
    localy.b(this.a.i());
    g.c(this.a).remove(g.d(this.a).c());
    g.c(this.a).add(g.a(this.a));
    g.c(this.a).revalidate();
  }

  public Object m()
  {
    if (g.a(this.a) == null)
      return null;
    return g.a(this.a).n().a();
  }

  public void a(Object paramObject)
  {
    this.b = ((b)paramObject);
  }

  public boolean b(Object paramObject)
  {
    if (g.a(this.a) == null)
      return false;
    return !g.a(this.a).n().a().equals(paramObject);
  }

  public Object b()
  {
    return "ProjectViewerManager";
  }

  public Object d()
  {
    return new b(new LinkedList(), new Rectangle());
  }

  public boolean a(boolean paramBoolean)
  {
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.y
 * JD-Core Version:    0.6.0
 */