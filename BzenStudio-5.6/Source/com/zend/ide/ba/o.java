package com.zend.ide.ba;

import com.zend.ide.bc.a;
import com.zend.ide.util.eo;
import com.zend.ide.util.es;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;

class o extends eo
{
  private h[] j;
  final f k;

  public o(f paramf)
  {
    super("");
    setEditable(false);
    setRootVisible(false);
    setShowsRootHandles(true);
    a.a(this, "ANALYZER_RESULTS");
  }

  protected DefaultTreeCellRenderer f()
  {
    return new s(this);
  }

  protected DefaultTreeModel a(DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    t localt = new t(this, paramDefaultMutableTreeNode);
    return localt;
  }

  protected DefaultMutableTreeNode b(Object paramObject)
  {
    return new r(this, null);
  }

  protected es d(Object paramObject)
  {
    if ((paramObject instanceof b))
      return new p(this, paramObject, null);
    if ((paramObject instanceof h))
      return new q(this, paramObject, null);
    return null;
  }

  public void a(h[] paramArrayOfh)
  {
    this.j = paramArrayOfh;
    i();
  }

  static h[] a(o paramo)
  {
    return paramo.j;
  }

  static h[] a(o paramo, h[] paramArrayOfh)
  {
    return paramo.j = paramArrayOfh;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ba.o
 * JD-Core Version:    0.6.0
 */