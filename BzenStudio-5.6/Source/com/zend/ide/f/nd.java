package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.m.ba;
import com.zend.ide.m.bd;
import com.zend.ide.m.bf;
import com.zend.ide.m.bh;
import com.zend.ide.m.c;
import com.zend.ide.m.v;
import com.zend.ide.m.z;
import com.zend.ide.n.bw;
import com.zend.ide.p.bs;
import com.zend.ide.p.f.e;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import javax.swing.Timer;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.Position.Bias;
import javax.swing.tree.TreePath;

public class nd
  implements CaretListener, cu
{
  private bs a;
  private bw b;
  private s c = bp.d().b();
  private int d = 250;
  private Timer e = new Timer(this.d, new od(this));
  bf f;

  public nd(bs parambs, bw parambw)
  {
    this.a = parambs;
    this.b = parambw;
    this.b.addCaretListener(this);
    b();
    caretUpdate(null);
  }

  public void caretUpdate(CaretEvent paramCaretEvent)
  {
    if ((!this.a.isShowing()) || (!c()))
      return;
    this.e.restart();
  }

  public void a()
  {
    ba[] arrayOfba = a(this.b.getCaretPosition());
    if (arrayOfba == null)
      return;
    if (arrayOfba.length == 2)
    {
      String str = arrayOfba[0].a();
      if ((str.equals(ct.a(1014))) || (str.equals(ct.a(1579))))
        localTreePath = this.a.getNextMatch(str, 0, Position.Bias.Forward);
      else
        localTreePath = a(arrayOfba[0]);
      if ((localTreePath != null) && (!this.a.isExpanded(localTreePath)))
        this.a.expandPath(localTreePath);
    }
    TreePath localTreePath = a(arrayOfba[(arrayOfba.length - 1)]);
    if (localTreePath != null)
      this.a.setSelectionPath(localTreePath);
  }

  private ba[] a(int paramInt)
  {
    v[] arrayOfv1 = d();
    int n;
    for (int i = 0; i < arrayOfv1.length; i++)
    {
      v localv1 = arrayOfv1[i];
      int k = localv1.f().d();
      n = localv1.f().e();
      if ((k < paramInt) && (n > paramInt))
        return a(localv1, paramInt);
    }
    bh[] arrayOfbh = e();
    int i2;
    for (int j = 0; j < arrayOfbh.length; j++)
    {
      bh localbh = arrayOfbh[j];
      n = localbh.f().d();
      i2 = localbh.f().e();
      if ((n < paramInt) && (i2 > paramInt))
        return new ba[] { localbh };
    }
    bd[] arrayOfbd = f();
    int i3;
    for (int m = 0; m < arrayOfbd.length; m++)
    {
      bd localbd = arrayOfbd[m];
      i2 = localbd.f().d();
      i3 = localbd.f().e();
      if ((i2 < paramInt) && (i3 > paramInt))
        return new ba[] { di.b(ct.a(1014), null, null), localbd };
    }
    v[] arrayOfv2 = g();
    for (int i1 = 0; i1 < arrayOfv2.length; i1++)
    {
      v localv2 = arrayOfv2[i1];
      i3 = localv2.f().d();
      int i4 = localv2.f().e();
      if ((i3 < paramInt) && (i4 > paramInt))
        return new ba[] { di.b(ct.a(1579), null, null), localv2 };
    }
    return null;
  }

  private ba[] a(v paramv, int paramInt)
  {
    bh[] arrayOfbh = paramv.h();
    int n;
    for (int i = 0; i < arrayOfbh.length; i++)
    {
      bh localbh = arrayOfbh[i];
      int k = localbh.f().d();
      n = localbh.f().e();
      if ((k < paramInt) && (n > paramInt))
        return new ba[] { paramv, localbh };
    }
    c[] arrayOfc = paramv.a();
    int i1;
    for (int j = 0; j < arrayOfc.length; j++)
    {
      c localc = arrayOfc[j];
      n = localc.f().d();
      i1 = localc.f().e();
      if ((n < paramInt) && (i1 > paramInt))
        return new ba[] { paramv, localc };
    }
    z[] arrayOfz = paramv.g();
    for (int m = 0; m < arrayOfz.length; m++)
    {
      z localz = arrayOfz[m];
      i1 = localz.f().d();
      int i2 = localz.f().e();
      if ((i1 < paramInt) && (i2 > paramInt))
        return new ba[] { paramv, localz };
    }
    return new ba[] { paramv };
  }

  private TreePath a(ba paramba)
  {
    String str = paramba.a();
    int i = paramba.f().d();
    int j = 0;
    for (TreePath localTreePath = this.a.getNextMatch(str, j, Position.Bias.Forward); localTreePath != null; localTreePath = this.a.getNextMatch(str, j, Position.Bias.Forward))
    {
      e locale = (e)localTreePath.getLastPathComponent();
      ba localba = (ba)locale.getUserObject();
      int k = localba.f().d();
      if ((k == i) || (this.a.getRowForPath(localTreePath) + 1 <= j))
        break;
      j = this.a.getRowForPath(localTreePath) + 1;
    }
    return localTreePath;
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
      this.b.addCaretListener(this);
    else
      this.b.removeCaretListener(this);
  }

  protected void b()
  {
    this.f = this.c.a(this.b.k());
  }

  protected boolean c()
  {
    return this.c.a(this.b.k()) != null;
  }

  protected v[] d()
  {
    if (this.f == null)
      return new v[0];
    return this.f.c();
  }

  protected bh[] e()
  {
    if (this.f == null)
      return new bh[0];
    return this.f.d();
  }

  protected bd[] f()
  {
    if (this.f == null)
      return new bd[0];
    return this.f.k();
  }

  protected v[] g()
  {
    if (this.f == null)
      return new v[0];
    return this.f.a();
  }

  static Timer a(nd paramnd)
  {
    return paramnd.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.nd
 * JD-Core Version:    0.6.0
 */