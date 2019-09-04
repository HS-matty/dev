package com.zend.ide.be.a;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JPanel;

class t
  implements LayoutManager2
{
  final f a;

  private t(f paramf)
  {
  }

  public void layoutContainer(Container paramContainer)
  {
    synchronized (paramContainer.getTreeLock())
    {
      int i = paramContainer.getHeight();
      int j = paramContainer.getWidth();
      JPanel localJPanel = f.d(this.a);
      int k = f.i(this.a).getComponentCount() > 0 ? 1 : 0;
      int m = f.j(this.a).getComponentCount() > 0 ? 1 : 0;
      int n = f.k(this.a).getComponentCount() > 0 ? 1 : 0;
      int i1 = f.l(this.a).getComponentCount() > 0 ? 1 : 0;
      int i2 = k != 0 ? f.i(this.a).getComponent(0).getPreferredSize().height + 4 : 0;
      int i3 = m != 0 ? f.j(this.a).getComponent(0).getPreferredSize().width + 4 : 0;
      int i4 = n != 0 ? f.k(this.a).getComponent(0).getPreferredSize().height + 4 : 0;
      int i5 = i1 != 0 ? f.l(this.a).getComponent(0).getPreferredSize().width + 4 : 0;
      int i6 = i3;
      int i7 = i2;
      int i8 = j - (i3 + i5);
      int i9 = i - (i2 + i4);
      localJPanel.setBounds(i6, i2, i8, i9);
      Rectangle localRectangle1 = new Rectangle();
      Rectangle localRectangle2 = new Rectangle();
      Rectangle localRectangle3 = new Rectangle();
      Rectangle localRectangle4 = new Rectangle();
      if (k != 0)
        localRectangle1.setBounds(i6, 0, i8, i2);
      if (m != 0)
        localRectangle2.setBounds(0, i7, i3, i9);
      if (n != 0)
        localRectangle3.setBounds(i6, i7 + i9, i8, i4);
      if (i1 != 0)
        localRectangle4.setBounds(i6 + i8, i7, i5, i9);
      f.i(this.a).setBounds(localRectangle1);
      f.j(this.a).setBounds(localRectangle2);
      f.k(this.a).setBounds(localRectangle3);
      f.l(this.a).setBounds(localRectangle4);
      if ((k != 0) && (m != 0))
        f.m(this.a).setBounds(0, 0, i6, i7);
      else
        f.m(this.a).setBounds(0, 0, 0, 0);
      if ((k != 0) && (i1 != 0))
        f.n(this.a).setBounds(i6 + i8, 0, i5, i2);
      else
        f.n(this.a).setBounds(0, 0, 0, 0);
      if ((n != 0) && (m != 0))
        f.o(this.a).setBounds(0, i7 + i9, i6, i4);
      else
        f.o(this.a).setBounds(0, 0, 0, 0);
      if ((n != 0) && (i1 != 0))
        f.p(this.a).setBounds(i6 + i8, i7 + i9, i5, i4);
      else
        f.p(this.a).setBounds(0, 0, 0, 0);
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

  public Dimension preferredLayoutSize(Container paramContainer)
  {
    return null;
  }

  public Dimension minimumLayoutSize(Container paramContainer)
  {
    return new Dimension(0, 0);
  }

  public void invalidateLayout(Container paramContainer)
  {
  }

  public void addLayoutComponent(String paramString, Component paramComponent)
  {
  }

  t(f paramf, bi parambi)
  {
    this(paramf);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.t
 * JD-Core Version:    0.6.0
 */