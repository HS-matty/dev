package com.zend.ide.w.b;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;
import java.awt.Point;
import javax.swing.JComponent;

public class n
  implements LayoutManager2
{
  private Component a;
  private Component b;
  private Component c;
  private int d = -1;
  private int e = 100;
  private int f = 30;
  private Point g;
  private int h;

  public void addLayoutComponent(Component paramComponent, Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof String)))
    {
      if (paramObject.equals("left"))
      {
        this.a = paramComponent;
      }
      else if (paramObject.equals("right"))
      {
        this.b = paramComponent;
      }
      else if (paramObject.equals("divider"))
      {
        this.c = paramComponent;
        this.c.addMouseListener(new b(this, null));
        this.c.addMouseMotionListener(new c(this, null));
        b();
        a(this.c.getParent());
      }
      else
      {
        throw new IllegalArgumentException("Unfamiliar constraints - " + paramObject);
      }
    }
    else
      throw new IllegalArgumentException("Constraints must be of type String.");
  }

  private void b()
  {
    if ((this.c != null) && (this.c.getParent() != null))
    {
      Container localContainer = this.c.getParent();
      int i = localContainer.getWidth();
      if (i != 0)
      {
        this.h = this.c.getParent().getWidth();
        int j = localContainer.getHeight();
        Insets localInsets = localContainer.getInsets();
        this.d = ((i - localInsets.left - localInsets.right) / 2 - this.e / 2);
        this.c.setBounds(this.d, localInsets.top, this.e, j - localInsets.top - localInsets.bottom);
      }
    }
  }

  private void a(Container paramContainer)
  {
    if ((paramContainer != null) && ((paramContainer instanceof JComponent)))
    {
      JComponent localJComponent = (JComponent)paramContainer;
      localJComponent.addComponentListener(new p(this, null));
    }
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

  public void invalidateLayout(Container paramContainer)
  {
  }

  public void addLayoutComponent(String paramString, Component paramComponent)
  {
    addLayoutComponent(paramComponent, paramString);
  }

  public void removeLayoutComponent(Component paramComponent)
  {
  }

  public Dimension preferredLayoutSize(Container paramContainer)
  {
    return null;
  }

  public Dimension minimumLayoutSize(Container paramContainer)
  {
    return new Dimension(0, 0);
  }

  public void layoutContainer(Container paramContainer)
  {
    if (this.d < 0)
      b();
    synchronized (paramContainer.getTreeLock())
    {
      if (this.c != null)
      {
        d();
        c();
      }
      e();
    }
  }

  private void c()
  {
    if (this.a == null)
      return;
    Container localContainer = this.a.getParent();
    Insets localInsets = localContainer.getInsets();
    this.a.setBounds(localInsets.left, localInsets.top, this.c.getX() - localInsets.left, localContainer.getHeight() - localInsets.top - localInsets.bottom);
    this.a.validate();
  }

  private void d()
  {
    Container localContainer = this.c.getParent();
    Insets localInsets = localContainer.getInsets();
    this.c.setBounds(this.d + localInsets.left, localInsets.top, this.e, localContainer.getHeight() - localInsets.top - localInsets.bottom);
  }

  private void e()
  {
    if (this.b == null)
      return;
    Container localContainer = this.b.getParent();
    Insets localInsets = localContainer.getInsets();
    if (this.c != null)
      this.b.setBounds(this.c.getX() + this.e, localInsets.top, localContainer.getWidth() - (this.c.getX() + this.e) - localInsets.right, localContainer.getHeight() - localInsets.top - localInsets.bottom);
    else
      this.b.setBounds(localInsets.left, localInsets.top, localContainer.getWidth() - localInsets.left - localInsets.right, localContainer.getHeight() - localInsets.top - localInsets.bottom);
    this.b.validate();
  }

  static Point a(n paramn, Point paramPoint)
  {
    return paramn.g = paramPoint;
  }

  static Component a(n paramn)
  {
    return paramn.c;
  }

  static Point b(n paramn)
  {
    return paramn.g;
  }

  static int c(n paramn)
  {
    return paramn.f;
  }

  static int d(n paramn)
  {
    return paramn.e;
  }

  static int a(n paramn, int paramInt)
  {
    return paramn.d = paramInt;
  }

  static void e(n paramn)
  {
    paramn.c();
  }

  static void f(n paramn)
  {
    paramn.e();
  }

  static int g(n paramn)
  {
    return paramn.d;
  }

  static void h(n paramn)
  {
    paramn.b();
  }

  static int i(n paramn)
  {
    return paramn.h;
  }

  static int b(n paramn, int paramInt)
  {
    return paramn.h = paramInt;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.n
 * JD-Core Version:    0.6.0
 */