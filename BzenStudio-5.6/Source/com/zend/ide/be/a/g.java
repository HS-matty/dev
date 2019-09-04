package com.zend.ide.be.a;

import com.zend.ide.be.i;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.awt.Rectangle;
import java.util.Hashtable;
import java.util.Vector;
import javax.swing.JPanel;

class g
  implements LayoutManager2
{
  private static final Cursor a = Cursor.getPredefinedCursor(10);
  private static final Cursor b = Cursor.getPredefinedCursor(8);
  private Container c;
  private Component d;
  private Component e = new a(this);
  private h f = new h(this, true);
  private h g = new h(this, false);
  private h h = new h(this, false);
  private h i = new h(this, true);
  private Hashtable j = new Hashtable();
  private double k = 0.2D;
  private double l = 0.2D;
  private double m = 0.2D;
  private double n = 0.2D;
  private boolean u = true;
  private boolean v = true;
  private boolean w = true;
  private boolean x = true;
  private int o = 4;
  private Component p;
  private Component q;
  private Component r;
  private Component s;
  private Vector t = new Vector();

  public g(Container paramContainer)
  {
    a(new bd());
    this.c = paramContainer;
    this.p = a(0);
    paramContainer.add(this.p, "dividerConstraint");
    this.s = a(3);
    paramContainer.add(this.s, "dividerConstraint");
    this.q = a(2);
    paramContainer.add(this.q, "dividerConstraint");
    this.r = a(1);
    paramContainer.add(this.r, "dividerConstraint");
  }

  public bd b()
  {
    bd localbd = new bd();
    localbd.a = this.k;
    localbd.b = this.l;
    localbd.c = this.m;
    localbd.d = this.n;
    localbd.e = this.u;
    localbd.f = this.v;
    localbd.g = this.w;
    localbd.h = this.x;
    return localbd;
  }

  public void a(bd parambd)
  {
    this.k = parambd.a;
    this.l = parambd.b;
    this.m = parambd.c;
    this.n = parambd.d;
    this.u = parambd.e;
    this.v = parambd.f;
    this.w = parambd.g;
    this.x = parambd.h;
  }

  private Component a(int paramInt)
  {
    JPanel localJPanel = new JPanel();
    if ((paramInt == 3) || (paramInt == 2))
      localJPanel.setCursor(a);
    else
      localJPanel.setCursor(b);
    bg localbg = new bg(this, localJPanel, paramInt);
    localJPanel.addMouseListener(localbg);
    localJPanel.addMouseMotionListener(localbg);
    return localJPanel;
  }

  public void addLayoutComponent(Component paramComponent, Object paramObject)
  {
    synchronized (this.c.getTreeLock())
    {
      if (paramObject == null)
        throw new IllegalArgumentException("cannot add to layout: constraints cant be null");
      if (paramObject.equals("dividerConstraint"))
        return;
      if (!(paramObject instanceof i))
        throw new IllegalArgumentException("cannot add to layout: constraints must be a DesktopConstraint");
      b(((i)paramObject).c);
      a(paramComponent, (i)paramObject);
    }
  }

  public void removeLayoutComponent(Component paramComponent)
  {
    synchronized (this.c.getTreeLock())
    {
      i locali = (i)this.j.get(paramComponent);
      if (locali == null)
        return;
      int i1 = locali.c;
      if (i1 == 4)
        this.d = null;
      else if (i1 == 2)
        this.h.a(paramComponent);
      else if (i1 == 0)
        this.f.a(paramComponent);
      else if (i1 == 1)
        this.i.a(paramComponent);
      else if (i1 == 3)
        this.g.a(paramComponent);
      this.j.remove(paramComponent);
    }
  }

  public void a(Component paramComponent, i parami)
  {
    synchronized (this.c.getTreeLock())
    {
      i locali = (i)this.j.get(paramComponent);
      if (locali != null)
      {
        if (locali.equals(parami))
          return;
        removeLayoutComponent(paramComponent);
      }
      parami = (i)parami.clone();
      this.j.put(paramComponent, parami);
      int i1 = parami.c;
      if (i1 == 4)
        this.d = paramComponent;
      else if (i1 == 2)
        this.h.a(paramComponent, parami);
      else if (i1 == 0)
        this.f.a(paramComponent, parami);
      else if (i1 == 1)
        this.i.a(paramComponent, parami);
      else if (i1 == 3)
        this.g.a(paramComponent, parami);
    }
  }

  public i a(Component paramComponent)
  {
    i locali = (i)this.j.get(paramComponent);
    if (locali != null)
      locali = (i)locali.clone();
    return locali;
  }

  public void layoutContainer(Container paramContainer)
  {
    synchronized (this.c.getTreeLock())
    {
      int i1 = !this.f.b() ? 1 : 0;
      int i2 = !this.g.b() ? 1 : 0;
      int i3 = !this.h.b() ? 1 : 0;
      int i4 = !this.i.b() ? 1 : 0;
      int i5 = paramContainer.getHeight();
      int i6 = paramContainer.getWidth();
      int i7 = i1 != 0 ? (int)(i5 * this.k) : 0;
      int i8 = i4 != 0 ? (int)(i5 * this.n) : 0;
      int i9 = i2 != 0 ? (int)(i6 * this.l) : 0;
      int i10 = i3 != 0 ? (int)(i6 * this.m) : 0;
      Rectangle localRectangle1 = new Rectangle(i9, i7, i6 - i9 - i10, i5 - i7 - i8);
      Rectangle localRectangle2 = new Rectangle();
      if (i1 != 0)
        localRectangle2.setBounds(0, 0, i6, i7);
      Rectangle localRectangle3 = new Rectangle();
      if (i2 != 0)
        localRectangle3.setBounds(0, 0, i9, i5);
      Rectangle localRectangle4 = new Rectangle();
      if (i4 != 0)
        localRectangle4.setBounds(0, localRectangle1.y + localRectangle1.height, i6, i8);
      Rectangle localRectangle5 = new Rectangle();
      if (i3 != 0)
        localRectangle5.setBounds(localRectangle1.x + localRectangle1.width, 0, i10, i5);
      if ((i1 != 0) && (i2 != 0))
        if (this.u)
        {
          localRectangle3.y += localRectangle2.height;
          localRectangle3.height -= localRectangle2.height;
        }
        else
        {
          localRectangle2.x += localRectangle3.width;
          localRectangle2.width -= localRectangle3.width;
        }
      if ((i1 != 0) && (i3 != 0))
        if (this.v)
        {
          localRectangle5.y += localRectangle2.height;
          localRectangle5.height -= localRectangle2.height;
        }
        else
        {
          localRectangle2.width -= localRectangle5.width;
        }
      if ((i4 != 0) && (i2 != 0))
        if (this.w)
        {
          localRectangle3.height -= localRectangle4.height;
        }
        else
        {
          localRectangle4.x += localRectangle3.width;
          localRectangle4.width -= localRectangle3.width;
        }
      if ((i4 != 0) && (i3 != 0))
        if (this.x)
          localRectangle5.height -= localRectangle4.height;
        else
          localRectangle4.width -= localRectangle5.width;
      if (this.d != null)
        this.d.setBounds(localRectangle1);
      else
        this.e.setBounds(localRectangle1);
      localRectangle2.height -= this.o;
      localRectangle3.width -= this.o;
      localRectangle4.y += this.o;
      localRectangle4.height -= this.o;
      localRectangle5.x += this.o;
      localRectangle5.width -= this.o;
      this.p.setBounds(localRectangle2.x, localRectangle2.height, localRectangle2.width, this.o);
      this.s.setBounds(localRectangle3.width, localRectangle3.y, this.o, localRectangle3.height);
      this.q.setBounds(localRectangle5.x - this.o, localRectangle5.y, this.o, localRectangle5.height);
      this.r.setBounds(localRectangle4.x, localRectangle4.y - this.o, localRectangle4.width, this.o);
      this.f.a(localRectangle2);
      this.h.a(localRectangle5);
      this.i.a(localRectangle4);
      this.g.a(localRectangle3);
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

  private static final double a(double paramDouble)
  {
    return Math.round(paramDouble * 10000.0D) / 10000.0D;
  }

  private void b(int paramInt)
  {
    if (paramInt == 2)
    {
      if ((this.h.b()) && (!this.g.b()))
      {
        this.m = (this.m < 0.1D ? 0.1D : this.m);
        this.l = (this.l > 0.8D ? 0.8D : this.l);
        if (this.m + this.l + 0.1D > 1.0D)
          this.m = (1.0D - this.l - 0.1D);
      }
    }
    else if (paramInt == 3)
    {
      if ((this.g.b()) && (!this.h.b()))
      {
        this.l = (this.l < 0.1D ? 0.1D : this.l);
        this.m = (this.m > 0.8D ? 0.8D : this.m);
        if (this.m + this.l + 0.1D > 1.0D)
          this.l = (1.0D - this.m - 0.1D);
      }
    }
    else if (paramInt == 0)
    {
      if ((this.f.b()) && (!this.i.b()))
      {
        this.k = (this.k < 0.1D ? 0.1D : this.k);
        this.n = (this.n > 0.8D ? 0.8D : this.n);
        if (this.k + this.n + 0.1D > 1.0D)
          this.k = (1.0D - this.n - 0.1D);
      }
    }
    else if ((paramInt == 1) && (this.i.b()) && (!this.f.b()))
    {
      this.n = (this.n < 0.1D ? 0.1D : this.n);
      this.k = (this.k > 0.8D ? 0.8D : this.k);
      if (this.k + this.n + 0.1D > 1.0D)
        this.n = (1.0D - this.k - 0.1D);
    }
  }

  private Component a(h paramh)
  {
    by localby;
    if (this.t.isEmpty())
    {
      localby = new by(this);
      this.c.add(localby, "dividerConstraint");
    }
    else
    {
      localby = (by)this.t.remove(this.t.size() - 1);
    }
    localby.a(paramh);
    return localby;
  }

  static Container a(g paramg)
  {
    return paramg.c;
  }

  static Component b(g paramg)
  {
    return paramg.d;
  }

  static Component c(g paramg)
  {
    return paramg.e;
  }

  static int d(g paramg)
  {
    return paramg.o;
  }

  static double a(g paramg, double paramDouble)
  {
    return paramg.l = paramDouble;
  }

  static double b(double paramDouble)
  {
    return a(paramDouble);
  }

  static double b(g paramg, double paramDouble)
  {
    return paramg.m = paramDouble;
  }

  static double c(g paramg, double paramDouble)
  {
    return paramg.k = paramDouble;
  }

  static double d(g paramg, double paramDouble)
  {
    return paramg.n = paramDouble;
  }

  static Component a(g paramg, h paramh)
  {
    return paramg.a(paramh);
  }

  static Vector e(g paramg)
  {
    return paramg.t;
  }

  static Cursor c()
  {
    return a;
  }

  static Cursor d()
  {
    return b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.g
 * JD-Core Version:    0.6.0
 */