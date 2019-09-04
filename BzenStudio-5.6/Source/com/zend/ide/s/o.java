package com.zend.ide.s;

import com.zend.ide.b.d;
import com.zend.ide.bb.f;
import com.zend.ide.f.cj;
import com.zend.ide.f.ob;
import com.zend.ide.f.yc;
import com.zend.ide.n.bw;
import com.zend.ide.n.ho;
import com.zend.ide.util.cl;
import com.zend.ide.util.d.a;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.text.Document;

public class o extends h
{
  private a i;
  private m j;
  private m k;
  private m f;
  private m o;
  private m n;
  private r l = new r(this);
  private boolean g = false;
  private boolean h = false;
  private boolean m = false;

  public o()
  {
    b();
    com.zend.ide.bf.m.b().a(this);
  }

  private void b()
  {
    this.i = new a();
    this.j = new k();
    this.k = new cj();
    this.f = new f((k)this.j);
    this.o = new yc();
    this.n = new ob();
    this.i.a(132, this.k);
    this.i.a(135, this.k);
    this.i.a(142, this.k);
    this.i.a(138, this.k);
    this.i.a(137, this.k);
    this.i.a(143, this.k);
    this.i.a(136, this.k);
    this.i.a(144, this.k);
    this.i.a(140, this.k);
    this.i.a(141, this.k);
    this.i.a(134, this.n);
    this.i.a(139, this.k);
    this.i.a(145, this.k);
    this.i.a(129, this.f);
    this.i.a(126, this.f);
    this.i.a(130, this.f);
    this.i.a(127, this.f);
    this.i.a(131, this.f);
    this.i.a(128, this.f);
    this.i.a(120, this.j);
    this.i.a(124, this.j);
    this.i.a(118, this.j);
    this.i.a(114, this.j);
    this.i.a(121, this.j);
    this.i.a(125, this.j);
    this.i.a(116, this.j);
    this.i.a(123, this.j);
    this.i.a(117, this.j);
    this.i.a(102, this.o);
    this.i.a(105, this.o);
    this.i.a(106, this.o);
    this.i.a(107, this.o);
    this.i.a(108, this.o);
    this.i.a(109, this.o);
    this.i.a(110, this.o);
    this.i.a(111, this.o);
    this.i.a(112, this.o);
    this.i.a(113, this.o);
  }

  public void a(bw parambw)
  {
    super.a(parambw);
    this.j.a(parambw);
    this.k.a(parambw);
    this.f.a(parambw);
    this.o.a(parambw);
    this.n.a(parambw);
  }

  public void a(boolean paramBoolean)
  {
    bw localbw = n();
    int i1 = localbw.getCaretPosition();
    int i2 = a(i1, localbw.getDocument());
    m localm = (m)this.i.b(kc.g(i2));
    if (localm == null)
      return;
    if ((!paramBoolean) && (!localm.i()))
      return;
    int i3 = paramBoolean ? 0 : localm.c();
    this.l.a(paramBoolean, i3, i1, i2, localm);
  }

  private boolean o()
  {
    bw localbw = n();
    int i1 = localbw.getCaretPosition();
    String str = localbw.getSelectedText();
    if ((str != null) && (str.length() > 0))
      return false;
    int i2 = a(i1, localbw.getDocument());
    m localm = (m)this.i.b(kc.g(i2));
    if (localm == null)
      return false;
    this.m = localm.a(i2, i1);
    return this.m;
  }

  protected boolean a(boolean paramBoolean)
  {
    this.l.a();
    return super.a(paramBoolean);
  }

  public void i()
  {
    this.l.a();
    super.i();
  }

  public void b(boolean paramBoolean)
  {
    bw localbw = n();
    int i1 = localbw.getCaretPosition();
    int i2 = a(i1, localbw.getDocument());
    m localm = (m)this.i.b(kc.g(i2));
    if (localm != null)
      try
      {
        b(localm.b(i2, i1, paramBoolean));
        g();
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
  }

  private static int a(int paramInt, Document paramDocument)
  {
    ho localho = (ho)paramDocument;
    return com.zend.ide.n.kc.a(paramInt, localho);
  }

  protected void a(d paramd)
  {
    Iterator localIterator = this.i.e().iterator();
    m localm;
    while (localIterator.hasNext())
    {
      localm = (m)localIterator.next();
      localm.b(true);
    }
    super.a(paramd);
    localIterator = this.i.e().iterator();
    while (localIterator.hasNext())
    {
      localm = (m)localIterator.next();
      localm.b(false);
    }
  }

  public boolean a(int paramInt)
  {
    this.h = e().isShowing();
    h();
    this.g = c().isShowing();
    if (this.g)
    {
      switch (paramInt)
      {
      case 5:
        c().y();
        return true;
      case 4:
        c().z();
        return true;
      case 6:
        c().u();
        return true;
      case 7:
        c().v();
        return true;
      case 9:
      case 14:
        c().w();
        return true;
      case 8:
      case 13:
        c().x();
        return true;
      case 10:
      case 11:
        return true;
      case 12:
      }
    }
    else if (paramInt == 11)
    {
      i();
      return o();
    }
    i();
    return false;
  }

  public void c(int paramInt)
  {
    if (this.m)
    {
      this.m = false;
      return;
    }
    d(paramInt);
    e(paramInt);
  }

  private void d(int paramInt)
  {
    if (paramInt == 1)
    {
      if ((this.h) && (f().h()))
      {
        g();
        return;
      }
      b(false);
      return;
    }
    if (!this.h)
      return;
    switch (paramInt)
    {
    case 2:
      if (!f().g())
        break;
      g();
      break;
    case 3:
      if (!f().h())
        break;
      g();
      break;
    case 12:
      if (!f().g())
        break;
      g();
      break;
    case 5:
      if (!f().j())
        break;
      g();
      break;
    case 4:
      if (!f().i())
        break;
      g();
      break;
    case 10:
      if (!f().m())
        break;
      g();
      break;
    case 11:
      if (!f().n())
        break;
      g();
      break;
    case 8:
      if (!f().k())
        break;
      g();
      break;
    case 9:
      if (!f().l())
        break;
      g();
    case 6:
    case 7:
    }
  }

  private void e(int paramInt)
  {
    if (paramInt == 1)
    {
      if ((this.g) && (d().h()) && (a(false)))
        return;
      a(false);
      return;
    }
    if (!this.g)
      return;
    switch (paramInt)
    {
    case 2:
      if (!d().g())
        break;
      a(false);
      break;
    case 3:
      if (!d().h())
        break;
      a(false);
      break;
    case 12:
      if (!d().g())
        break;
      a(false);
      break;
    case 10:
    case 11:
      a(null);
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
  }

  static r a(o paramo)
  {
    return paramo.l;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.o
 * JD-Core Version:    0.6.0
 */