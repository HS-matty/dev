package com.zend.ide.p.f;

import com.zend.ide.util.a.b;
import com.zend.ide.util.c.h;
import com.zend.ide.util.cl;
import com.zend.ide.util.d.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Vector;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

public class f extends DefaultTreeModel
  implements c
{
  private transient h a;
  private ArrayList b = new ArrayList(5);
  private i[] d = new i[0];
  private static final Object[] c = new Object[0];

  public f(TreeNode paramTreeNode)
  {
    super(paramTreeNode);
    a(paramTreeNode);
    this.a = h.c();
  }

  public void setRoot(TreeNode paramTreeNode)
  {
    b(this.root);
    super.setRoot(paramTreeNode);
    a(paramTreeNode);
  }

  public void a(i parami)
  {
    i[] arrayOfi;
    synchronized (this.b)
    {
      this.b.add(parami);
      arrayOfi = new i[this.b.size()];
      this.b.toArray(arrayOfi);
    }
    this.d = arrayOfi;
  }

  public void b(i parami)
  {
    i[] arrayOfi;
    synchronized (this.b)
    {
      this.b.remove(parami);
      arrayOfi = new i[this.b.size()];
      this.b.toArray(arrayOfi);
    }
    this.d = arrayOfi;
  }

  private void c(e parame)
  {
    k localk = new k(parame);
    i[] arrayOfi = this.d;
    for (int i = 0; i < arrayOfi.length; i++)
      arrayOfi[i].a(localk);
  }

  protected void a(Object paramObject)
  {
    if ((paramObject instanceof e))
      ((e)paramObject).a(this);
  }

  protected void b(Object paramObject)
  {
    if ((paramObject instanceof e))
      ((e)paramObject).a(this);
  }

  protected void a(e parame, int paramInt, boolean paramBoolean)
  {
    if (parame.f)
      return;
    synchronized (parame)
    {
      if (parame.f)
        return;
      parame.f = true;
      if (paramInt == e.a)
      {
        a(parame, paramBoolean);
        return;
      }
      com.zend.ide.util.c.f localf = this.a.b(new a(this, parame, paramBoolean));
      if (paramInt == e.c)
        localf.g();
      else if (paramInt == e.b)
        localf.h();
    }
  }

  protected void a(e parame, boolean paramBoolean)
  {
    try
    {
      a(parame);
      if (!paramBoolean)
        return;
      Enumeration localEnumeration = parame.children();
      if (localEnumeration == null)
        return;
      while (localEnumeration.hasMoreElements())
      {
        e locale = (e)localEnumeration.nextElement();
        if (c(locale))
          a(locale, locale.i(), true);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      b.a(localRuntimeException);
    }
  }

  protected boolean c(e parame)
  {
    return parame.e;
  }

  private void a(e parame)
  {
    synchronized (parame)
    {
      try
      {
        b(parame);
        parame.e = true;
        parame.f = false;
        c(parame);
      }
      catch (RuntimeException localRuntimeException)
      {
        parame.e = true;
        parame.f = false;
        throw localRuntimeException;
      }
      catch (Throwable localThrowable)
      {
        parame.e = true;
        parame.f = false;
        cl.a(localThrowable);
      }
    }
  }

  private void b(e parame)
  {
    if (parame.c())
      nodeChanged(parame);
    Object[] arrayOfObject = c(parame.d());
    HashSet localHashSet = new HashSet((int)(arrayOfObject.length * 1.5D));
    localHashSet.addAll(Arrays.asList(arrayOfObject));
    Vector localVector = parame.b();
    ArrayList localArrayList1 = null;
    Object localObject1;
    boolean bool;
    Object localObject2;
    if (localVector != null)
      synchronized (localVector)
      {
        int j = localVector.size();
        for (int k = 0; k < j; k++)
        {
          e locale = (e)localVector.get(k);
          localObject1 = locale.getUserObject();
          bool = !localHashSet.remove(localObject1);
          if (bool)
          {
            localObject2 = locale.a(localHashSet);
            if (localObject2 != null)
            {
              bool = false;
              locale.setUserObject(localObject2);
              localHashSet.remove(localObject2);
            }
          }
          if (!bool)
            continue;
          if (localArrayList1 == null)
            localArrayList1 = new ArrayList(5);
          localArrayList1.add(locale);
        }
      }
    int i = localHashSet.size();
    ArrayList localArrayList2 = null;
    g localg = null;
    if (i > 0)
    {
      localArrayList2 = new ArrayList(i);
      localg = new g(i);
      parame.setAllowsChildren(true);
      for (int m = 0; m < arrayOfObject.length; m++)
      {
        localObject1 = arrayOfObject[m];
        bool = localHashSet.remove(localObject1);
        if (localObject1 == null)
        {
          cl.a("Unexcpected exception at: " + this);
        }
        else
        {
          if (!bool)
            continue;
          localObject2 = parame.a(localObject1);
          localArrayList2.add(localObject2);
          localg.b(m);
        }
      }
    }
    a(parame, localArrayList1, localArrayList2, localg);
  }

  protected void a(e parame, ArrayList paramArrayList1, ArrayList paramArrayList2, g paramg)
  {
    Object localObject2;
    if (paramArrayList1 != null)
    {
      int[] arrayOfInt = new int[paramArrayList1.size()];
      for (int j = paramArrayList1.size() - 1; j >= 0; j--)
      {
        e locale = (e)paramArrayList1.get(j);
        b(locale);
        arrayOfInt[j] = parame.getIndex(locale);
        parame.remove(arrayOfInt[j]);
      }
      localObject2 = paramArrayList1.toArray();
      fireTreeNodesRemoved(this, getPathToRoot(parame), arrayOfInt, localObject2);
    }
    if (paramArrayList2 != null)
    {
      for (int i = 0; i < paramArrayList2.size(); i++)
      {
        localObject2 = (e)paramArrayList2.get(i);
        int k = paramg.c(i);
        if (k > parame.getChildCount())
          k = parame.getChildCount();
        a(localObject2);
        parame.insert((MutableTreeNode)localObject2, k);
      }
      localObject1 = paramArrayList2.toArray();
      localObject2 = paramg.d();
      fireTreeNodesInserted(this, getPathToRoot(parame), localObject2, localObject1);
    }
    Object localObject1 = parame.children();
    if (localObject1 == null)
      return;
    while (((Enumeration)localObject1).hasMoreElements())
    {
      localObject2 = (e)((Enumeration)localObject1).nextElement();
      nodeChanged((TreeNode)localObject2);
    }
  }

  private static final Object[] c(Object paramObject)
  {
    if ((paramObject instanceof Object[]))
      return (Object[])(Object[])paramObject;
    if ((paramObject instanceof Collection))
    {
      Collection localCollection = (Collection)paramObject;
      return localCollection.toArray();
    }
    return c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.f.f
 * JD-Core Version:    0.6.0
 */