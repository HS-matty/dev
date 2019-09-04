package com.zend.ide.desktop;

import com.zend.ide.hb.ab;
import com.zend.ide.hb.ub;
import com.zend.ide.l.v;
import com.zend.ide.n.bw;
import com.zend.ide.p.b.a;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.dj;
import com.zend.ide.y.e;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JList;

class co extends com.zend.ide.hb.cb
  implements cu
{
  private bw a;
  private com.zend.ide.k.c b;
  private ab c;
  private v d;
  private ub e = null;
  private DefaultListModel f = null;
  private int g;
  private int h;
  private boolean i;
  private boolean j = false;
  private PropertyChangeListener l = new cb(this, null);
  private e m;
  private int n = 100;
  private ca k = new ca(this, null);
  private a o;

  public co(cj paramcj)
  {
    super(paramcj.l());
    this.a = paramcj.X();
    this.b = com.zend.ide.bd.c.b().f();
    this.c = paramcj.l();
    this.d = paramcj.l();
    this.o = new gb(this, null);
    this.c.a(this);
    this.c.a(this.d);
    this.c.a(paramcj.X());
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.m = new e(localf);
    localf.a("editing.searchResultDisplaySize", this.l);
    this.m.a("editing.searchResultDisplaySize");
  }

  public void a(String paramString1, String paramString2)
  {
    ab localab = this.c;
    if (!localab.a())
    {
      localab.b(paramString1);
      if (!paramString2.equals(""))
      {
        localab.a(paramString2);
        localab.d(false);
      }
      localab.b();
    }
    else
    {
      this.i = false;
      this.o.g();
    }
  }

  public void g()
  {
    this.g = 0;
    this.h = 0;
    this.i = false;
    this.j = false;
    this.e = null;
    this.o.g();
    this.o.a(ct.a(559));
    this.f = new DefaultListModel();
  }

  public void h()
  {
    this.o.h();
    String str = this.c.l();
    if (this.g == 0)
    {
      ba.a(com.zend.ide.bd.c.b().h(), ct.a(621, str), ct.a(366), 1);
      if (this.i)
      {
        ub localub = null;
        localub = (ub)this.b.a("findInFiles");
        if (localub != null)
        {
          this.b.b(localub);
          this.b.c().updateUI();
        }
      }
      return;
    }
    if (!this.j)
    {
      if (this.g == 1)
        this.f.add(0, new String(ct.a(622, str)));
      else if (this.h == 1)
        this.f.add(0, new String(ct.a(623, "" + this.g, str)));
      else
        this.f.add(0, new String(ct.a(625, "" + this.g, "" + this.h, str)));
    }
    else
      this.f.add(0, new String(ct.a(626, "" + this.g, "" + this.g, str)));
    a(this.f);
  }

  public void i()
  {
    if (this.j)
    {
      h();
      return;
    }
    this.o.h();
    this.f.add(0, new String(ct.a(629, this.c.l())));
    a(this.f);
  }

  private void a(DefaultListModel paramDefaultListModel)
  {
    if (this.e == null)
      this.e = a();
    JList localJList = this.e.d();
    localJList.setModel(paramDefaultListModel);
    localJList.validate();
    localJList.repaint();
  }

  public void b(File paramFile)
  {
    if (!this.i)
      this.o.a(ct.a(175) + paramFile);
  }

  public void a(File paramFile)
  {
  }

  public void a(com.zend.ide.hb.d[] paramArrayOfd)
  {
    for (int i1 = 0; i1 < paramArrayOfd.length; i1++)
    {
      this.f.addElement(paramArrayOfd[i1]);
      this.g += 1;
      if (this.g < this.n)
        continue;
      this.c.g().b();
      this.j = true;
      break;
    }
    this.h += 1;
  }

  private ub a()
  {
    String str = this.c.l();
    ub localub = null;
    if (!this.c.k())
      localub = (ub)this.b.a("findInFiles");
    if (localub != null)
      this.b.b(localub);
    localub = new ub(str, this.c.e(), this.c.i());
    localub.a(this.k);
    this.b.a(localub, "FIND_IN_FILES");
    localub.x().d();
    localub.b(str);
    this.b.c(localub);
    com.zend.ide.bd.c.b().c().a("MessageComponent", true);
    return localub;
  }

  private void c(int paramInt)
  {
    if ((paramInt <= 0) || (paramInt > 10000))
      throw new dj(ct.a(1130));
    this.n = paramInt;
  }

  static bw a(co paramco)
  {
    return paramco.a;
  }

  static void a(co paramco, int paramInt)
  {
    paramco.c(paramInt);
  }

  static ab a(co paramco)
  {
    return paramco.c;
  }

  static boolean a(co paramco, boolean paramBoolean)
  {
    return paramco.i = paramBoolean;
  }

  static ub b(co paramco)
  {
    return paramco.e;
  }

  static ub a(co paramco, ub paramub)
  {
    return paramco.e = paramub;
  }

  static ub c(co paramco)
  {
    return paramco.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.co
 * JD-Core Version:    0.6.0
 */