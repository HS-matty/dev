package com.zend.ide.cb.a;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;
import java.awt.Point;
import javax.swing.JComponent;

public class db
  implements LayoutManager2
{
  private Component a;
  private Component b;
  private Component c;
  private int d = -1;
  private int e = 4;
  private int f = 30;
  private Point g;
  private int h;
  private double i = 0.5D;

  public void addLayoutComponent(Component paramComponent, Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof String)))
    {
      if (paramObject.equals("top"))
      {
        this.a = paramComponent;
      }
      else if (paramObject.equals("bottom"))
      {
        this.b = paramComponent;
      }
      else if (paramObject.equals("divider"))
      {
        this.c = paramComponent;
        this.c.addMouseListener(new o(this, null));
        this.c.addMouseMotionListener(new p(this, null));
        a();
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

  private void a()
  {
    if ((this.c != null) && (this.c.getParent() != null))
    {
      Container localContainer = this.c.getParent();
      int j = localContainer.getHeight();
      if (j != 0)
      {
        this.h = this.c.getParent().getHeight();
        int k = localContainer.getWidth();
        Insets localInsets = localContainer.getInsets();
        this.d = ((j - localInsets.top - localInsets.bottom) / 2 - this.e / 2);
        this.c.setBounds(localInsets.left, this.d, k - localInsets.left - localInsets.right, this.e);
      }
    }
  }

  private void a(Container paramContainer)
  {
    if ((paramContainer != null) && ((paramContainer instanceof JComponent)))
    {
      JComponent localJComponent = (JComponent)paramContainer;
      localJComponent.addComponentListener(new fb(this, null));
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
      a();
    synchronized (paramContainer.getTreeLock())
    {
      if (this.c != null)
      {
        c();
        b();
      }
      d();
    }
  }

  private void b()
  {
    if ("top" == null)
      return;
    Container localContainer = this.a.getParent();
    Insets localInsets = localContainer.getInsets();
    this.a.setBounds(localInsets.left, localInsets.top, this.c.getWidth(), localContainer.getHeight() - (localContainer.getHeight() - this.d) - localInsets.top);
    this.a.validate();
  }

  private void c()
  {
    Container localContainer = this.c.getParent();
    Insets localInsets = localContainer.getInsets();
    this.c.setBounds(localInsets.left, this.d + localInsets.top, localContainer.getWidth() - localInsets.left - localInsets.right, this.e);
  }

  private void d()
  {
    if (this.b == null)
      return;
    Container localContainer = this.b.getParent();
    Insets localInsets = localContainer.getInsets();
    if (this.c != null)
      this.b.setBounds(localInsets.left, this.d + this.e + localInsets.top, localContainer.getWidth() - localInsets.left - localInsets.right, this.h - this.d - this.e);
    else
      this.b.setBounds(localInsets.left, localInsets.top, localContainer.getWidth() - localInsets.left - localInsets.right, this.h - localInsets.top - localInsets.bottom);
    this.b.validate();
  }

  static Point a(db paramdb, Point paramPoint)
  {
    return paramdb.g = paramPoint;
  }

  static Component a(db paramdb)
  {
    return paramdb.c;
  }

  static Point b(db paramdb)
  {
    return paramdb.g;
  }

  static int c(db paramdb)
  {
    return paramdb.f;
  }

  static int d(db paramdb)
  {
    return paramdb.e;
  }

  static int a(db paramdb, int paramInt)
  {
    return paramdb.d = paramInt;
  }

  static void e(db paramdb)
  {
    paramdb.b();
  }

  static void f(db paramdb)
  {
    paramdb.d();
  }

  static double a(db paramdb, double paramDouble)
  {
    return paramdb.i = paramDouble;
  }

  static int g(db paramdb)
  {
    return paramdb.h;
  }

  static int h(db paramdb)
  {
    return paramdb.d;
  }

  static void i(db paramdb)
  {
    paramdb.a();
  }

  static double j(db paramdb)
  {
    return paramdb.i;
  }

  static int b(db paramdb, int paramInt)
  {
    return paramdb.h = paramInt;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.db
 * JD-Core Version:    0.6.0
 */