package com.zend.ide.zendPlatformIntegration.a;

import javax.swing.event.EventListenerList;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreePath;

public abstract class c
  implements fb
{
  protected Object a;
  protected EventListenerList b = new EventListenerList();

  public c()
  {
  }

  public c(Object paramObject)
  {
    this.a = paramObject;
  }

  public Object getRoot()
  {
    return this.a;
  }

  public boolean isLeaf(Object paramObject)
  {
    return getChildCount(paramObject) == 0;
  }

  public void valueForPathChanged(TreePath paramTreePath, Object paramObject)
  {
  }

  public int getIndexOfChild(Object paramObject1, Object paramObject2)
  {
    for (int i = 0; i < getChildCount(paramObject1); i++)
      if (getChild(paramObject1, i).equals(paramObject2))
        return i;
    return -1;
  }

  public void addTreeModelListener(TreeModelListener paramTreeModelListener)
  {
    this.b.add(TreeModelListener.class, paramTreeModelListener);
  }

  public void removeTreeModelListener(TreeModelListener paramTreeModelListener)
  {
    this.b.remove(TreeModelListener.class, paramTreeModelListener);
  }

  public Class b(int paramInt)
  {
    return Object.class;
  }

  public boolean b(Object paramObject, int paramInt)
  {
    return b(paramInt) == fb.class;
  }

  public void a(Object paramObject1, Object paramObject2, int paramInt)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.c
 * JD-Core Version:    0.6.0
 */