package com.zend.ide.util;

import com.zend.ide.util.c.f;
import com.zend.ide.util.c.h;
import com.zend.ide.util.d.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Vector;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

public class es extends DefaultMutableTreeNode
{
  protected boolean a;
  protected boolean b;
  final eo c;

  public es(eo parameo, Object paramObject)
  {
    super(paramObject);
  }

  public es(eo parameo, Object paramObject, boolean paramBoolean)
  {
    super(paramObject, paramBoolean);
  }

  public boolean isLeaf()
  {
    return !getAllowsChildren();
  }

  public int getChildCount()
  {
    if (!this.a)
      c();
    return super.getChildCount();
  }

  public void removeAllChildren()
  {
    synchronized (this.children)
    {
      for (int i = super.getChildCount() - 1; i >= 0; i--)
        remove(i);
    }
  }

  protected Object b()
  {
    return null;
  }

  public TreeNode getChildAt(int paramInt)
  {
    if (!this.a)
      c();
    return super.getChildAt(paramInt);
  }

  public Enumeration children()
  {
    if (!this.a)
      c();
    return super.children();
  }

  public void a(boolean paramBoolean)
  {
    this.a = (!paramBoolean);
  }

  protected void c()
  {
    a(this.c.h, true);
  }

  protected void d()
  {
  }

  protected synchronized void e()
  {
    try
    {
      a(null);
      this.a = true;
      this.b = false;
      this.c.repaint();
    }
    catch (RuntimeException localRuntimeException)
    {
      this.a = true;
      this.b = false;
      throw localRuntimeException;
    }
    catch (Throwable localThrowable)
    {
      this.a = true;
      this.b = false;
      cl.a(localThrowable);
    }
  }

  protected void a(int paramInt, boolean paramBoolean)
  {
    if (!this.b)
      synchronized (this)
      {
        if (this.b)
          return;
        this.b = true;
        f localf = this.c.a.b(new bw(this, paramBoolean));
        a(paramInt, localf);
      }
  }

  protected void a(int paramInt, f paramf)
  {
    if (paramInt == eo.d)
      paramf.g();
    else if (paramInt == eo.c)
      paramf.h();
    else if (paramInt == eo.b)
      paramf.b();
  }

  protected void a(ArrayList paramArrayList)
  {
    d();
    Object localObject1 = b();
    if (localObject1 == null)
      localObject1 = new Object[0];
    Object[] arrayOfObject = null;
    if ((localObject1 instanceof Object[]))
    {
      arrayOfObject = (Object[])(Object[])localObject1;
    }
    else if ((localObject1 instanceof Collection))
    {
      localObject2 = (Collection)localObject1;
      arrayOfObject = new Object[((Collection)localObject2).size()];
      ((Collection)localObject2).toArray(arrayOfObject);
    }
    if (arrayOfObject == null)
      return;
    Object localObject2 = new HashSet((int)(arrayOfObject.length * 1.5D));
    ((HashSet)localObject2).addAll(Arrays.asList(arrayOfObject));
    Object localObject3;
    boolean bool;
    Object localObject4;
    if (this.children != null)
      synchronized (this.children)
      {
        int j = this.children.size();
        for (int k = 0; k < j; k++)
        {
          DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)this.children.get(k);
          localObject3 = localDefaultMutableTreeNode.getUserObject();
          bool = !((HashSet)localObject2).remove(localObject3);
          if (bool)
          {
            localObject4 = a(localDefaultMutableTreeNode, (HashSet)localObject2);
            if (localObject4 != null)
            {
              bool = false;
              localDefaultMutableTreeNode.setUserObject(localObject4);
              ((HashSet)localObject2).remove(localObject4);
              ((DefaultTreeModel)this.c.getModel()).nodeChanged(localDefaultMutableTreeNode);
            }
          }
          if (!bool)
            continue;
          if (paramArrayList == null)
            paramArrayList = new ArrayList(5);
          paramArrayList.add(localDefaultMutableTreeNode);
        }
      }
    int i = ((HashSet)localObject2).size();
    ArrayList localArrayList = null;
    g localg = null;
    if (i > 0)
    {
      localArrayList = new ArrayList(i);
      localg = new g(i);
      this.allowsChildren = true;
    }
    for (int m = 0; m < arrayOfObject.length; m++)
    {
      localObject3 = arrayOfObject[m];
      bool = ((HashSet)localObject2).remove(localObject3);
      if (localObject3 == null)
      {
        cl.a("Unexcpected exception at: " + this);
      }
      else
      {
        if (!bool)
          continue;
        localObject4 = this.c.d(localObject3);
        localArrayList.add(localObject4);
        localg.b(m);
      }
    }
    a(paramArrayList, localArrayList, localg);
  }

  protected void a(ArrayList paramArrayList1, ArrayList paramArrayList2, g paramg)
  {
    synchronized (this.c.getTreeLock())
    {
      DefaultTreeModel localDefaultTreeModel = (DefaultTreeModel)this.c.getModel();
      int i;
      DefaultMutableTreeNode localDefaultMutableTreeNode;
      if (paramArrayList1 != null)
        for (i = 0; i < paramArrayList1.size(); i++)
        {
          localDefaultMutableTreeNode = (DefaultMutableTreeNode)paramArrayList1.get(i);
          localDefaultTreeModel.removeNodeFromParent(localDefaultMutableTreeNode);
        }
      if (paramArrayList2 != null)
        for (i = 0; i < paramArrayList2.size(); i++)
        {
          localDefaultMutableTreeNode = (DefaultMutableTreeNode)paramArrayList2.get(i);
          int j = paramg.c(i);
          if (j > getChildCount())
            j = getChildCount();
          localDefaultTreeModel.insertNodeInto(localDefaultMutableTreeNode, this, j);
        }
    }
  }

  public Object a(DefaultMutableTreeNode paramDefaultMutableTreeNode, HashSet paramHashSet)
  {
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.es
 * JD-Core Version:    0.6.0
 */