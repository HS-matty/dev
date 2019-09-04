package com.zend.ide.w.b;

import com.zend.ide.n.bw;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class z
  implements m
{
  private static final x a = new x();
  private static final x b = new x();
  private static final x c = new x();
  private static final x d = new x();
  private l e;
  private bf f;
  private bf g;
  private JTextArea h;
  private JTextArea i;
  private List j;
  private List k;
  private List l;
  private List m;
  private List n;
  private List o;
  private Rectangle p;
  private Rectangle q;
  private int r;
  private int s;
  private int t;
  private x u;
  private x v;
  private boolean w;
  private int x;
  private Rectangle y;
  private Rectangle z;
  private int A;
  private int B;
  private int C;
  private int D;
  private bd E;
  private bd F;
  private int G;
  private int H;
  private int I;
  private int J;
  private ArrayList K;
  private bb L;
  private bc M;

  public z(l paraml, bf parambf1, bf parambf2)
  {
    this.e = paraml;
    this.f = parambf1;
    this.g = parambf2;
    this.p = new Rectangle();
    this.q = new Rectangle();
    this.A = 1;
    this.B = 1;
    this.h = parambf1.g();
    this.i = parambf2.g();
    this.j = new ArrayList();
    this.k = new ArrayList();
    this.l = new ArrayList();
    this.m = new ArrayList();
    this.n = new ArrayList();
    this.o = new ArrayList();
    this.K = new ArrayList(2);
    paraml.a(this);
    this.E = new bd(this, 0);
    this.F = new bd(this, 1);
    this.M = new bc(this);
    this.L = new bb(this);
    this.g.f().addCaretListener(this.M);
    this.f.f().addCaretListener(this.L);
  }

  public void a(boolean paramBoolean)
  {
    if (this.w != paramBoolean)
    {
      this.w = paramBoolean;
      if (this.w)
      {
        d();
        this.u = a(this.j, n(), 0, 0);
        this.v = a(this.k, o(), 0, 1);
      }
      else
      {
        e();
      }
    }
  }

  public void b()
  {
    Rectangle localRectangle = this.x == 0 ? this.y : this.z;
    a(1, localRectangle);
  }

  public void c()
  {
    Rectangle localRectangle = this.x == 0 ? this.y : this.z;
    a(-1, localRectangle);
  }

  private void a(int paramInt, Rectangle paramRectangle)
  {
    if (paramRectangle == null)
      paramRectangle = new Rectangle(0, 0, 1, 1);
    JTextArea localJTextArea;
    int i1;
    List localList;
    if (this.x == 0)
    {
      localJTextArea = this.h;
      i1 = this.r;
      localList = this.n;
    }
    else
    {
      localJTextArea = this.i;
      i1 = this.s;
      localList = this.o;
    }
    x localx1 = a(localList, paramRectangle.y, paramInt, this.x);
    if (localx1.c(paramRectangle.y) != 0)
      paramInt = 0;
    int i2 = localx1.f() + paramInt;
    if (i2 > localList.size() - 1)
      i2 = localList.size() - 1;
    else
      i2 = Math.max(i2, 0);
    localx1 = (x)localList.get(i2);
    int i3 = localx1.b().y;
    Rectangle localRectangle = localJTextArea.getVisibleRect();
    int i4 = i3 - i1;
    localRectangle.translate(0, i4);
    localJTextArea.scrollRectToVisible(localRectangle);
    x localx2;
    int i5;
    if (this.x == 0)
    {
      this.F.a(false);
      localx2 = (x)this.o.get(i2);
      if (localx1.e())
        i5 = paramRectangle.height;
      else if (localx2.e())
        i5 = -paramRectangle.height + 1;
      else
        i5 = 1;
      c(localx2, 1, i5);
      this.F.a(true);
    }
    else
    {
      this.E.a(false);
      localx2 = (x)this.n.get(i2);
      if (localx1.e())
        i5 = paramRectangle.height;
      else if (localx2.e())
        i5 = -paramRectangle.height + 1;
      else
        i5 = 1;
      c(localx2, 0, i5);
      this.E.a(true);
    }
    a(localx1, paramRectangle);
  }

  private void a(x paramx, Rectangle paramRectangle)
  {
    Rectangle localRectangle = paramx.b();
    int i1;
    if (this.x == 0)
    {
      i1 = this.h.viewToModel(new Point(0, localRectangle.y));
      this.h.setCaretPosition(i1);
    }
    else
    {
      i1 = this.i.viewToModel(new Point(0, localRectangle.y));
      this.i.setCaretPosition(i1);
    }
    paramRectangle.y = localRectangle.y;
  }

  private void d()
  {
    this.f.a(this.E);
    this.g.a(this.F);
  }

  private void e()
  {
    this.f.b(this.E);
    this.g.b(this.F);
  }

  private void f()
  {
    Rectangle localRectangle1 = this.h.getVisibleRect();
    if (localRectangle1 == null)
      return;
    if (localRectangle1.y != this.p.y)
    {
      this.p = localRectangle1;
      this.r = (this.t + this.p.y);
      this.A = (this.p.y - this.C);
      this.C = this.p.y;
      this.u = a(this.j, this.u, this.A, this.r, 0);
      if (this.w)
        try
        {
          i();
        }
        catch (Exception localException)
        {
        }
    }
    else if (this.w)
    {
      this.F.a(false);
      Rectangle localRectangle2 = this.i.getVisibleRect();
      localRectangle2.translate(localRectangle1.x - localRectangle2.x, 0);
      m();
      this.i.scrollRectToVisible(localRectangle2);
      this.F.a(true);
    }
  }

  private void g()
  {
    Rectangle localRectangle1 = this.i.getVisibleRect();
    if (localRectangle1 == null)
      return;
    if (localRectangle1.y != this.q.y)
    {
      this.q = localRectangle1;
      this.s = (this.t + this.q.y);
      this.B = (this.q.y - this.D);
      this.D = this.q.y;
      this.v = a(this.k, this.v, this.B, this.s, 1);
      if (this.w)
        try
        {
          h();
        }
        catch (Exception localException)
        {
        }
    }
    else if (this.w)
    {
      this.E.a(false);
      Rectangle localRectangle2 = this.h.getVisibleRect();
      localRectangle2.translate(localRectangle1.x - localRectangle2.x, 0);
      l();
      this.h.scrollRectToVisible(localRectangle2);
      this.E.a(true);
    }
  }

  private void h()
  {
    this.E.a(false);
    if ((!a(this.u)) && (!a(this.v)))
    {
      int i1 = this.u.c(this.r);
      int i2 = this.v.c(this.s);
      int i3 = this.u.f();
      int i4 = this.v.f();
      int i5 = this.B;
      if (i3 == i4)
      {
        a(i2, i1, i5, 0);
      }
      else
      {
        x localx = (x)this.j.get(i4);
        if (Math.abs(this.v.f() - this.u.f()) > 1)
        {
          if (i2 == 0)
            a(localx, 0, true);
          else
            a(localx, 0, false);
        }
        else if ((i2 == 0) && (i1 != 0))
          a(localx, 0, true);
        else if ((i2 != 0) && (i1 == 0))
          a(localx, i5, 0);
        else if ((i2 != 0) && (i1 != 0))
          a(localx, i5, 0);
        else
          a(localx, 0, true);
      }
    }
    else if (!a(this.v))
    {
      this.u = a(this.j, this.r, -this.A, 0);
    }
    else if (!a(this.u))
    {
      this.v = a(this.k, this.s, -this.B, 1);
    }
    this.E.a(true);
  }

  private void i()
  {
    this.F.a(false);
    if ((!a(this.u)) && (!a(this.v)))
    {
      int i1 = this.u.c(this.r);
      int i2 = this.v.c(this.s);
      int i3 = this.u.f();
      int i4 = this.v.f();
      int i5 = this.A;
      if (i3 == i4)
      {
        a(i1, i2, i5, 1);
      }
      else
      {
        x localx = (x)this.k.get(i3);
        if (Math.abs(this.v.f() - this.u.f()) > 1)
        {
          if (i1 == 0)
            a(localx, 1, true);
          else
            a(localx, 1, false);
        }
        else if ((i1 == 0) && (i2 != 0))
          a(localx, 1, true);
        else if ((i1 != 0) && (i2 == 0))
          a(localx, i5, 1);
        else if ((i2 != 0) && (i1 != 0))
          a(localx, i5, 1);
        else
          a(localx, 1, true);
      }
    }
    else if (!a(this.v))
    {
      this.u = a(this.j, this.r, -this.A, 0);
    }
    else if (!a(this.u))
    {
      this.v = a(this.k, this.s, -this.B, 1);
    }
    this.F.a(true);
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt4 == 0 ? this.r : this.s;
    x localx = paramInt4 == 0 ? this.u : this.v;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      c(paramInt4);
    }
    else if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      double d1 = b(paramInt4, i1);
      if (paramInt3 > 0)
        c(localx, paramInt4, (int)(paramInt1 * d1));
      else
        a((int)(paramInt3 * d1), paramInt4);
    }
    else if (paramInt1 == 0)
    {
      a(localx, paramInt4, true);
    }
  }

  private void a(x paramx, int paramInt1, int paramInt2)
  {
    x localx1;
    int i1;
    List localList;
    int i2;
    if (paramInt2 == 1)
    {
      localx1 = this.v;
      i1 = this.s;
      localList = this.m;
      i2 = this.u.c(this.r);
    }
    else
    {
      localx1 = this.u;
      i1 = this.r;
      localList = this.l;
      i2 = this.v.c(this.s);
    }
    int i3 = paramx.c(i1 + paramInt1);
    x localx2;
    if (localx1.e())
    {
      localx2 = a(localList, i1 + paramInt1, paramInt1, paramInt2);
      if ((!a(localx2)) && (localx2.c(i1 + paramInt1) == 0))
        a(paramInt1, paramInt2);
      else if (paramInt1 > 0)
        b(paramx, paramInt2);
      else
        a(localx1, paramInt2);
    }
    else if (paramx.e())
    {
      localx2 = a(localList, i1 + paramInt1, paramInt1, paramInt2);
      if ((!a(localx2)) && (localx2.c(i1 + paramInt1) == 0))
        a(paramInt1, paramInt2);
      else if (paramInt1 > 0)
        b(paramx, paramInt2);
      else
        a(paramx, paramInt2);
    }
    else if (i3 == 0)
    {
      a(paramx, paramInt2, false);
    }
    else
    {
      double d1 = b(paramInt2, i1 + paramInt1);
      if (paramInt1 > 0)
        c(paramx, paramInt2, (int)(i2 * d1));
      else
        a((int)(paramInt1 * d1), paramInt2);
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0)
      return;
    if (paramInt2 == 0)
    {
      this.p.translate(0, paramInt1);
      b(paramInt1);
      this.h.scrollRectToVisible(this.p);
    }
    else
    {
      this.q.translate(0, paramInt1);
      a(paramInt1);
      this.i.scrollRectToVisible(this.q);
    }
  }

  private double b(int paramInt1, int paramInt2)
  {
    int i1;
    int i2;
    int i3;
    if (paramInt1 == 1)
    {
      i1 = this.r;
      i2 = paramInt2;
      i3 = this.A;
    }
    else
    {
      i1 = paramInt2;
      i2 = this.s;
      i3 = this.B;
    }
    x localx1 = a(this.l, i1, i3, 0);
    x localx2 = a(this.m, i2, i3, 1);
    double d1 = 1.0D;
    if ((!a(localx1)) && (!a(localx2)) && (localx1.c(i1) == 0) && (localx2.c(i2) == 0))
    {
      double d2 = localx1.b().getHeight();
      double d3 = localx2.b().getHeight();
      if (paramInt1 == 1)
        d1 = d3 / d2;
      else
        d1 = d2 / d3;
    }
    return d1;
  }

  private void a(int paramInt)
  {
    k();
    this.B = paramInt;
    this.D = this.q.y;
    this.s = (this.t + this.q.y);
    this.v = a(this.k, this.v, this.B, this.s, 1);
  }

  private void b(int paramInt)
  {
    j();
    this.A = paramInt;
    this.C = this.p.y;
    this.r = (this.t + this.p.y);
    this.u = a(this.j, this.u, this.A, this.r, 0);
  }

  private void j()
  {
    if (this.p.y + this.p.height > this.I)
      this.p.translate(0, this.I - (this.p.y + this.p.height));
    else if (this.p.y < 0)
      this.p.translate(0, -this.p.y);
  }

  private void k()
  {
    if (this.q.y + this.q.height > this.G)
      this.q.translate(0, this.G - (this.q.y + this.q.height));
    else if (this.q.y < 0)
      this.q.translate(0, -this.q.y);
  }

  private void l()
  {
    if (this.p.x + this.p.width > this.J)
      this.p.translate(this.J - (this.p.x + this.p.width), 0);
    else if (this.p.x < 0)
      this.p.translate(-this.p.x, 0);
  }

  private void m()
  {
    if (this.q.x + this.q.width > this.H)
      this.q.translate(this.H - (this.q.x + this.q.width), 0);
    else if (this.q.x < 0)
      this.q.translate(-this.q.x, 0);
  }

  private void c(int paramInt)
  {
    int i1 = this.r - this.u.b().y;
    int i2 = this.s - this.v.b().y;
    if (i1 != i2)
      if (paramInt == 0)
      {
        this.p.translate(0, i2 - i1);
        j();
        this.r = (this.t + this.p.y);
      }
      else
      {
        this.q.translate(0, i1 - i2);
        k();
        this.s = (this.t + this.q.y);
      }
    if (paramInt == 0)
      this.h.scrollRectToVisible(this.p);
    else
      this.i.scrollRectToVisible(this.q);
  }

  private void a(x paramx, int paramInt)
  {
    b(paramx, paramInt, 0);
  }

  private void b(x paramx, int paramInt1, int paramInt2)
  {
    int i1 = paramInt1 == 0 ? this.r : this.s;
    int i2 = paramInt1 == 1 ? this.A : this.B;
    JTextArea localJTextArea = paramInt1 == 0 ? this.h : this.i;
    Rectangle localRectangle = paramInt1 == 0 ? new Rectangle(this.p) : new Rectangle(this.q);
    int i3 = i1 - (paramx.b().y + paramx.b().height);
    i3 -= paramInt2;
    localRectangle.translate(0, -(i3 + 1));
    localJTextArea.scrollRectToVisible(localRectangle);
    localRectangle = localJTextArea.getVisibleRect();
    if (paramInt1 == 0)
    {
      this.p = localRectangle;
      b(i2);
    }
    else
    {
      this.q = localRectangle;
      a(i2);
    }
  }

  private void b(x paramx, int paramInt)
  {
    c(paramx, paramInt, 0);
  }

  private void c(x paramx, int paramInt1, int paramInt2)
  {
    int i1 = paramInt1 == 0 ? this.r : this.s;
    int i2 = paramInt1 == 1 ? this.A : this.B;
    JTextArea localJTextArea = paramInt1 == 0 ? this.h : this.i;
    Rectangle localRectangle = paramInt1 == 0 ? new Rectangle(this.p) : new Rectangle(this.q);
    int i3 = i1 - (paramx.b().y + paramx.b().height) + paramx.b().height;
    i3 += paramInt2;
    localRectangle.translate(0, -(i3 - 1));
    localJTextArea.scrollRectToVisible(localRectangle);
    localRectangle = localJTextArea.getVisibleRect();
    if (paramInt1 == 0)
    {
      this.p = localRectangle;
      b(i2);
    }
    else
    {
      this.q = localRectangle;
      a(i2);
    }
  }

  private void a(x paramx, int paramInt, boolean paramBoolean)
  {
    int i1 = paramInt == 0 ? this.r : this.s;
    int i2 = i1 - paramx.b().y;
    int i3 = paramInt == 1 ? this.A : this.B;
    JTextArea localJTextArea = paramInt == 0 ? this.h : this.i;
    Rectangle localRectangle;
    if (paramInt == 0)
      localRectangle = new Rectangle(this.p);
    else
      localRectangle = new Rectangle(this.q);
    localRectangle.translate(0, -i2);
    if (!paramBoolean)
    {
      localJTextArea.scrollRectToVisible(localRectangle);
      localRectangle = localJTextArea.getVisibleRect();
    }
    if (paramInt == 0)
    {
      this.p = localRectangle;
      b(i3);
    }
    else
    {
      this.q = localRectangle;
      a(i3);
    }
    if (paramBoolean)
    {
      int i4 = paramInt == 0 ? this.r : this.s;
      if (i1 != i4)
        c(paramInt);
    }
  }

  private x a(List paramList, x paramx, int paramInt1, int paramInt2, int paramInt3)
  {
    if (a(paramx))
      return a(paramList, paramx, paramInt1);
    x localx = null;
    if (paramx != null)
    {
      int i1 = paramx.c(paramInt2);
      if (i1 != 0)
        localx = a(paramList, paramInt2, paramInt1, paramInt3);
      else
        localx = paramx;
    }
    return localx;
  }

  private static boolean a(x paramx)
  {
    return (paramx == null) || (paramx == b) || (paramx == a) || (paramx == d) || (paramx == c);
  }

  private x a(List paramList, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject;
    int i2;
    x localx;
    int i1;
    if (paramInt2 < 0)
    {
      localObject = paramInt3 == 0 ? a : c;
      for (i2 = paramList.size() - 1; i2 >= 0; i2--)
      {
        localx = (x)paramList.get(i2);
        i1 = localx.c(paramInt1);
        if (i1 > 0)
          continue;
        localObject = localx;
        break;
      }
    }
    else
    {
      localObject = paramInt3 == 0 ? b : d;
      for (i2 = 0; i2 < paramList.size(); i2++)
      {
        localx = (x)paramList.get(i2);
        i1 = localx.c(paramInt1);
        if (i1 < 0)
          continue;
        localObject = localx;
        break;
      }
    }
    return (x)localObject;
  }

  private x a(List paramList, x paramx, int paramInt)
  {
    int i1 = paramList.size();
    if (i1 == 0)
      return paramx;
    x localx = paramx;
    if (paramInt < 0)
    {
      if ((paramx == b) || (paramx == d))
        localx = (x)paramList.get(i1 - 1);
    }
    else if ((paramx == a) || (paramx == c))
      localx = (x)paramList.get(0);
    return localx;
  }

  public void a(bl parambl)
  {
    switch (parambl.b())
    {
    case 0:
      this.L.a(false);
      this.M.a(false);
      this.j.clear();
      this.k.clear();
      this.l.clear();
      this.m.clear();
      this.n.clear();
      this.o.clear();
      this.u = null;
      this.v = null;
      this.A = 0;
      this.B = 0;
      this.C = 0;
      this.D = 0;
      break;
    case 1:
      this.j = this.e.b();
      this.k = this.e.c();
      this.l = this.e.e();
      this.m = this.e.d();
      this.n = this.e.f();
      this.o = this.e.g();
      SwingUtilities.invokeLater(new ba(this));
    }
  }

  public void d(int paramInt)
  {
    this.t = paramInt;
    c(this.t, this.A);
    d(this.t, this.B);
  }

  private void c(int paramInt1, int paramInt2)
  {
    this.p = this.h.getVisibleRect();
    this.r = (paramInt1 + this.p.y);
    this.u = a(this.j, paramInt1, paramInt2, 0);
  }

  private void d(int paramInt1, int paramInt2)
  {
    this.q = this.i.getVisibleRect();
    this.s = (paramInt1 + this.q.y);
    this.v = a(this.k, paramInt1, paramInt2, 1);
  }

  public int n()
  {
    return this.r;
  }

  public int o()
  {
    return this.s;
  }

  public void a(g paramg)
  {
    this.K.add(paramg);
  }

  private void a(bk parambk)
  {
    for (int i1 = 0; i1 < this.K.size(); i1++)
      ((g)this.K.get(i1)).a(parambk);
  }

  static int a(z paramz, int paramInt)
  {
    return paramz.G = paramInt;
  }

  static JTextArea a(z paramz)
  {
    return paramz.i;
  }

  static int b(z paramz, int paramInt)
  {
    return paramz.I = paramInt;
  }

  static JTextArea b(z paramz)
  {
    return paramz.h;
  }

  static int c(z paramz, int paramInt)
  {
    return paramz.H = paramInt;
  }

  static int d(z paramz, int paramInt)
  {
    return paramz.J = paramInt;
  }

  static bb c(z paramz)
  {
    return paramz.L;
  }

  static bc d(z paramz)
  {
    return paramz.M;
  }

  static void e(z paramz)
  {
    paramz.f();
  }

  static void f(z paramz)
  {
    paramz.g();
  }

  static int e(z paramz, int paramInt)
  {
    return paramz.x = paramInt;
  }

  static Rectangle g(z paramz)
  {
    return paramz.y;
  }

  static Rectangle a(z paramz, Rectangle paramRectangle)
  {
    return paramz.y = paramRectangle;
  }

  static List h(z paramz)
  {
    return paramz.n;
  }

  static x a(z paramz, List paramList, int paramInt1, int paramInt2, int paramInt3)
  {
    return paramz.a(paramList, paramInt1, paramInt2, paramInt3);
  }

  static x p()
  {
    return b;
  }

  static x q()
  {
    return a;
  }

  static void a(z paramz, bk parambk)
  {
    paramz.a(parambk);
  }

  static Rectangle i(z paramz)
  {
    return paramz.z;
  }

  static Rectangle b(z paramz, Rectangle paramRectangle)
  {
    return paramz.z = paramRectangle;
  }

  static List j(z paramz)
  {
    return paramz.o;
  }

  static x r()
  {
    return d;
  }

  static x s()
  {
    return c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.z
 * JD-Core Version:    0.6.0
 */