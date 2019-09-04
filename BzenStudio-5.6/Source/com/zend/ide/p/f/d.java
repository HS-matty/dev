package com.zend.ide.p.f;

import com.zend.ide.p.bs;
import java.awt.Rectangle;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class d extends bs
  implements HierarchyListener, i
{
  private TreePath a;
  private int e;
  private boolean f;
  private boolean g;
  private com.zend.ide.util.c.f h;
  private ArrayList k = new ArrayList(5);
  private j[] l = new j[0];

  public d(Object paramObject)
  {
    super(paramObject);
    setModel(a(b(paramObject)));
    a(1000);
    a(true);
    this.g = false;
    this.h = com.zend.ide.util.c.h.c().b(new h(this, null));
    addMouseListener(new b(this));
    b();
  }

  public void a(j paramj)
  {
    j[] arrayOfj;
    synchronized (this.k)
    {
      this.k.add(paramj);
      arrayOfj = new j[this.k.size()];
      this.k.toArray(arrayOfj);
    }
    this.l = arrayOfj;
  }

  public void b(j paramj)
  {
    j[] arrayOfj;
    synchronized (this.k)
    {
      this.k.remove(paramj);
      arrayOfj = new j[this.k.size()];
      this.k.toArray(arrayOfj);
    }
    this.l = arrayOfj;
  }

  private void a(TreePath paramTreePath)
  {
    l locall = new l(this, paramTreePath);
    j[] arrayOfj = this.l;
    for (int i = 0; i < arrayOfj.length; i++)
      arrayOfj[i].a(locall);
  }

  public void setModel(TreeModel paramTreeModel)
  {
    TreeModel localTreeModel = getModel();
    if ((localTreeModel instanceof f))
      ((f)localTreeModel).b(this);
    if ((paramTreeModel instanceof f))
      ((f)paramTreeModel).a(this);
    super.setModel(paramTreeModel);
  }

  protected f a(TreeNode paramTreeNode)
  {
    return new g(this, paramTreeNode);
  }

  protected DefaultMutableTreeNode b(Object paramObject)
  {
    return new e(paramObject);
  }

  public void b()
  {
    this.g = true;
    if ((!this.h.e()) && (o()))
      this.h.a(0L, i());
  }

  private void h()
  {
    Object localObject = getModel().getRoot();
    if ((localObject instanceof e))
    {
      e locale = (e)localObject;
      ((DefaultTreeModel)getModel()).nodeChanged(locale);
      a(locale, locale.i());
    }
  }

  public void a(e parame, int paramInt)
  {
    f localf = (f)getModel();
    localf.a(parame, paramInt, true);
  }

  public void fireTreeExpanded(TreePath paramTreePath)
  {
    this.a = paramTreePath;
    super.fireTreeExpanded(paramTreePath);
    e locale = (e)paramTreePath.getLastPathComponent();
    synchronized (locale)
    {
      if (!locale.e)
        a(locale, locale.i());
    }
  }

  protected void b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt2 < getRowCount()))
    {
      Rectangle localRectangle1;
      if (paramInt1 == paramInt2)
      {
        localRectangle1 = getPathBounds(getPathForRow(paramInt1));
        if (localRectangle1 != null)
          scrollRectToVisible(localRectangle1);
      }
      else
      {
        localRectangle1 = getPathBounds(getPathForRow(paramInt1));
        Rectangle localRectangle2 = getVisibleRect();
        Rectangle localRectangle3 = localRectangle1;
        int i = localRectangle1.y;
        int j = i + localRectangle2.height;
        for (int m = paramInt1 + 1; m <= paramInt2; m++)
        {
          localRectangle3 = getPathBounds(getPathForRow(m));
          if (localRectangle3.y + localRectangle3.height <= j)
            continue;
          m = paramInt2;
        }
        scrollRectToVisible(new Rectangle(localRectangle2.x, i, 1, localRectangle3.y + localRectangle3.height - i));
      }
    }
  }

  public void a(int paramInt)
  {
    if (paramInt < 0)
      paramInt = 100;
    this.e = paramInt;
  }

  public int i()
  {
    return this.e;
  }

  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
    removeHierarchyListener(this);
    if (!this.f)
      addHierarchyListener(this);
  }

  public boolean n()
  {
    return this.f;
  }

  public void hierarchyChanged(HierarchyEvent paramHierarchyEvent)
  {
    long l1 = paramHierarchyEvent.getChangeFlags();
    int i = (l1 & 0x4) != 0L ? 1 : 0;
    int j = (i != 0) && (isShowing()) ? 1 : 0;
    if ((j != 0) && (this.g))
      b();
  }

  private boolean o()
  {
    return (this.g) && ((n()) || (isShowing()));
  }

  public void a(k paramk)
  {
    a(new TreePath(paramk.a().getPath()));
  }

  static TreePath a(d paramd)
  {
    return paramd.a;
  }

  static TreePath a(d paramd, TreePath paramTreePath)
  {
    return paramd.a = paramTreePath;
  }

  static boolean b(d paramd)
  {
    return paramd.o();
  }

  static boolean a(d paramd, boolean paramBoolean)
  {
    return paramd.g = paramBoolean;
  }

  static void c(d paramd)
  {
    paramd.h();
  }

  static com.zend.ide.util.c.f d(d paramd)
  {
    return paramd.h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.f.d
 * JD-Core Version:    0.6.0
 */