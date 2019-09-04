package com.zend.ide.be.a;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.util.Arrays;

class s
  implements LayoutManager2
{
  public void invalidateLayout(Container paramContainer)
  {
    synchronized (paramContainer.getTreeLock())
    {
      Component[] arrayOfComponent = paramContainer.getComponents();
      bv[] arrayOfbv = new bv[arrayOfComponent.length];
      for (int i = 0; i < arrayOfbv.length; i++)
        arrayOfbv[i] = new bv(i, arrayOfComponent[i].getPreferredSize().width + 10);
      Arrays.sort(arrayOfbv);
      i = paramContainer.getWidth();
      int j = paramContainer.getHeight();
      int[] arrayOfInt = new int[arrayOfbv.length];
      int k = i;
      for (int m = 0; m < arrayOfbv.length; m++)
      {
        n = k / (arrayOfbv.length - m);
        int i1 = Math.min(arrayOfbv[m].b, n);
        arrayOfInt[arrayOfbv[m].a] = i1;
        k -= i1;
      }
      m = 0;
      for (int n = 0; n < arrayOfInt.length; n++)
      {
        arrayOfComponent[n].setBounds(m, 0, arrayOfInt[n], j);
        m += arrayOfInt[n];
      }
    }
  }

  public void addLayoutComponent(Component paramComponent, Object paramObject)
  {
  }

  public void removeLayoutComponent(Component paramComponent)
  {
  }

  public Dimension maximumLayoutSize(Container paramContainer)
  {
    return null;
  }

  public float getLayoutAlignmentX(Container paramContainer)
  {
    return 0.0F;
  }

  public float getLayoutAlignmentY(Container paramContainer)
  {
    return 0.0F;
  }

  public void addLayoutComponent(String paramString, Component paramComponent)
  {
  }

  public Dimension preferredLayoutSize(Container paramContainer)
  {
    return minimumLayoutSize(paramContainer);
  }

  public Dimension minimumLayoutSize(Container paramContainer)
  {
    return bo.a();
  }

  public void layoutContainer(Container paramContainer)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.s
 * JD-Core Version:    0.6.0
 */