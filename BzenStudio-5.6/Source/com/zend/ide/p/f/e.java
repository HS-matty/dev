package com.zend.ide.p.f;

import com.zend.ide.p.bt;
import java.util.HashSet;
import java.util.Vector;
import javax.swing.tree.DefaultMutableTreeNode;

public class e extends bt
{
  public static int a = 0;
  public static int b = 1;
  public static int c = 2;
  private c d;
  boolean e;
  boolean f;
  private int g = a;

  public e(Object paramObject)
  {
    this(paramObject, true);
  }

  public e(Object paramObject, boolean paramBoolean)
  {
    super(paramObject, paramBoolean);
  }

  public boolean isLeaf()
  {
    return !getAllowsChildren();
  }

  public void removeAllChildren()
  {
    synchronized (this.children)
    {
      for (int i = super.getChildCount() - 1; i >= 0; i--)
        remove(i);
    }
  }

  public void a(c paramc)
  {
    this.d = paramc;
  }

  public void a(int paramInt)
  {
    this.g = paramInt;
  }

  public int i()
  {
    return this.g;
  }

  Vector b()
  {
    return this.children;
  }

  public Object d()
  {
    return null;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return new e(paramObject);
  }

  public Object a(HashSet paramHashSet)
  {
    return null;
  }

  protected boolean c()
  {
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.f.e
 * JD-Core Version:    0.6.0
 */