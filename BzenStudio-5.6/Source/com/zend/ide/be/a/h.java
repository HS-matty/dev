package com.zend.ide.be.a;

import com.zend.ide.be.i;
import java.awt.Component;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Vector;

class h
{
  private ArrayList a = new ArrayList();
  private ArrayList b = new ArrayList();
  private ArrayList c = new ArrayList();
  private boolean d;
  final g e;

  public h(g paramg, boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public void a(Component paramComponent, i parami)
  {
    if (!b())
    {
      Component localComponent1 = g.a(this.e, this);
      this.c.add(localComponent1);
    }
    int i = c();
    if (parami.e == -1)
      if (i == 0)
        parami.e = 0;
      else
        parami.e = (((i)this.b.get(i - 1)).e + 1);
    for (int j = 0; j < i; j++)
    {
      i locali = (i)this.b.get(j);
      if (parami.e < locali.e)
      {
        this.a.add(j, paramComponent);
        this.b.add(j, parami);
        return;
      }
      if (parami.e != locali.e)
        continue;
      locali.e += 1;
      Component localComponent2 = (Component)this.a.get(j);
      this.a.set(j, paramComponent);
      paramComponent = localComponent2;
      this.b.set(j, parami);
      parami = locali;
    }
    this.a.add(paramComponent);
    this.b.add(parami);
  }

  public void a(Component paramComponent)
  {
    for (int i = 0; (i < c()) && (this.a.get(i) != paramComponent); i++);
    if (i == c())
      return;
    this.a.remove(i);
    this.b.remove(i);
    if (c() > 0)
    {
      Component localComponent = (Component)this.c.remove(this.c.size() - 1);
      g.e(this.e).add(localComponent);
      localComponent.setBounds(0, 0, 0, 0);
    }
  }

  public boolean b()
  {
    return this.a.isEmpty();
  }

  public int c()
  {
    return this.a.size();
  }

  public void a(Rectangle paramRectangle)
  {
    if (b())
      return;
    double d1 = 0.0D;
    for (int i = 0; i < this.b.size(); i++)
      d1 += ((i)this.b.get(i)).d;
    if (this.d)
      b(paramRectangle, d1);
    else
      a(paramRectangle, d1);
  }

  public void a(Rectangle paramRectangle, double paramDouble)
  {
    int i = paramRectangle.height - c() * g.d(this.e) + g.d(this.e);
    int j = paramRectangle.x;
    int k = paramRectangle.y;
    for (int m = 0; m < this.a.size(); m++)
    {
      Component localComponent1 = (Component)this.a.get(m);
      i locali = (i)this.b.get(m);
      int n = (int)Math.round(locali.d / paramDouble * i);
      localComponent1.setBounds(j, k, paramRectangle.width, n);
      k += n;
      if (m == c() - 1)
        continue;
      Component localComponent2 = (Component)this.c.get(m);
      localComponent2.setBounds(j, k, paramRectangle.width, g.d(this.e));
      k += g.d(this.e);
    }
  }

  public void b(Rectangle paramRectangle, double paramDouble)
  {
    int i = paramRectangle.width - c() * g.d(this.e) + g.d(this.e);
    int j = paramRectangle.x;
    int k = paramRectangle.y;
    for (int m = 0; m < this.a.size(); m++)
    {
      Component localComponent1 = (Component)this.a.get(m);
      i locali = (i)this.b.get(m);
      int n = (int)Math.round(locali.d / paramDouble * i);
      localComponent1.setBounds(j, k, n, paramRectangle.height);
      j += n;
      if (m == c() - 1)
        continue;
      Component localComponent2 = (Component)this.c.get(m);
      localComponent2.setBounds(j, k, g.d(this.e), paramRectangle.width);
      j += g.d(this.e);
    }
  }

  static boolean a(h paramh)
  {
    return paramh.d;
  }

  static ArrayList c(h paramh)
  {
    return paramh.c;
  }

  static ArrayList d(h paramh)
  {
    return paramh.a;
  }

  static ArrayList e(h paramh)
  {
    return paramh.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.h
 * JD-Core Version:    0.6.0
 */