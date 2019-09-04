package com.zend.ide.v;

import com.zend.ide.be.d;
import com.zend.ide.be.l;
import com.zend.ide.desktop.fb;
import com.zend.ide.j.h;
import com.zend.ide.n.br;
import com.zend.ide.n.bw;
import com.zend.ide.n.dm;
import com.zend.ide.n.dz;
import com.zend.ide.n.ek;
import com.zend.ide.p.d.bl;
import com.zend.ide.util.bb;
import com.zend.ide.util.bh;
import com.zend.ide.util.bn;
import com.zend.ide.util.bp;
import com.zend.ide.util.bs;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class e extends c
  implements bw, cu
{
  private int f = 0;
  private s g = new s(this, null);
  private ImageIcon h = cv.b("explorer/phpfile.gif");
  private be i = new be(this, null);
  private bw[] j = new cu[0];

  public e()
  {
    a(this.g);
  }

  public Object s()
  {
    o localo = new o();
    int k = this.i.getSelectedIndex();
    ArrayList localArrayList = new ArrayList();
    bw[] arrayOfbw = v();
    for (int m = 0; m < arrayOfbw.length; m++)
    {
      if ((arrayOfbw[m].k().startsWith(o())) && (!arrayOfbw[m].l()))
        continue;
      p localp = (p)arrayOfbw[m].s();
      localArrayList.add(localp);
    }
    p[] arrayOfp = new p[localArrayList.size()];
    localArrayList.toArray(arrayOfp);
    localo.a(arrayOfp, k);
    return localo;
  }

  public void c(Object paramObject)
  {
    b(false);
    this.f = 0;
    if ((paramObject == null) || (!(paramObject instanceof o)))
      return;
    o localo = (o)paramObject;
    int k = localo.b();
    p[] arrayOfp = localo.c();
    if ((arrayOfp == null) || (arrayOfp.length == 0))
    {
      f();
      return;
    }
    for (int m = 0; m < arrayOfp.length; m++)
    {
      if (arrayOfp[m].e().startsWith(o()))
        continue;
      bw localbw = b("");
      try
      {
        localbw.c(arrayOfp[m]);
      }
      catch (Exception localException)
      {
        localbw.d(true);
        continue;
      }
      c(localbw);
    }
    if (this.i.getTabCount() > k)
      this.i.setSelectedIndex(k);
  }

  public bs t()
  {
    return null;
  }

  private bw c(int paramInt)
  {
    if (this.j.length <= paramInt)
      return null;
    return this.j[paramInt];
  }

  protected bw[] v()
  {
    return this.j;
  }

  public String o()
  {
    return "PHPDocument";
  }

  public bb q()
  {
    return this.i.q();
  }

  public void d(String paramString)
  {
    this.i.d(paramString);
  }

  public String r()
  {
    return this.i.r();
  }

  public String a(int paramInt1, int paramInt2)
  {
    return this.i.a(paramInt1, paramInt2);
  }

  public void a(bn parambn)
  {
    this.i.a(parambn);
  }

  public JComponent c()
  {
    return this.i;
  }

  public boolean b(boolean paramBoolean)
  {
    return this.i.a(paramBoolean);
  }

  public boolean c(boolean paramBoolean)
  {
    return this.i.b(paramBoolean);
  }

  protected bw u()
  {
    int k = this.i.getSelectedIndex();
    if (k < 0)
      return null;
    return c(k);
  }

  public dz f()
  {
    bw localbw = b("");
    this.f += 1;
    String str = o() + this.f;
    localbw.b(str);
    c(localbw);
    this.i.setSelectedComponent(localbw.c());
    l locall = (l)fb.b().c().a("EditorComponent");
    locall.a(c());
    return localbw;
  }

  private void y()
  {
    if (j() == 1)
    {
      bw localbw = u();
      if (localbw.l())
        return;
      File localFile = h.m.g(localbw.k());
      if ((localFile.getName().equals(o() + "1")) && (!localFile.exists()))
        b(false);
    }
  }

  public boolean a(boolean paramBoolean)
  {
    return this.i.a(this.i.getSelectedIndex(), paramBoolean);
  }

  public boolean a(String paramString, boolean paramBoolean)
  {
    dz localdz = a(paramString);
    if (localdz == null)
      return true;
    bw[] arrayOfbw = v();
    for (int k = 0; k < arrayOfbw.length; k++)
    {
      if (!arrayOfbw[k].k().equals(paramString))
        continue;
      JComponent localJComponent = arrayOfbw[k].c();
      return this.i.a(localJComponent, paramBoolean);
    }
    return true;
  }

  public boolean a(String paramString, bh parambh, int paramInt)
  {
    if (a(paramString, paramInt))
      return true;
    bw localbw = b("");
    if (!br.a(localbw, paramString, parambh))
    {
      localbw.d(true);
      return false;
    }
    y();
    c(localbw);
    this.i.setSelectedComponent(localbw.c());
    SwingUtilities.invokeLater(new q(this, paramInt, localbw));
    return true;
  }

  public boolean a(String paramString, bh parambh, InputStream paramInputStream)
  {
    if (a(paramString, -1))
      return true;
    bw localbw = b("");
    if (!br.a(localbw, paramString, parambh, paramInputStream))
    {
      localbw.d(true);
      return false;
    }
    y();
    c(localbw);
    this.i.setSelectedComponent(localbw.c());
    return true;
  }

  public boolean a(dz paramdz, int paramInt)
  {
    bw[] arrayOfbw = v();
    for (int k = 0; k < arrayOfbw.length; k++)
    {
      if (!arrayOfbw[k].a(paramdz, paramInt))
        continue;
      this.i.setSelectedComponent(arrayOfbw[k].c());
      return true;
    }
    return false;
  }

  private void b(bw parambw)
  {
    e(parambw);
    x().a(parambw);
    x().a(parambw, true);
  }

  protected bw b(Object paramObject)
  {
    dm localdm = new dm();
    return localdm;
  }

  protected void c(bw parambw)
  {
    bp.a(parambw);
    parambw.a(this);
    x().b(parambw);
    d(parambw);
    File localFile = h.m.g(parambw.k());
    String str = localFile.getName();
    Object localObject = this.h;
    if (localFile.exists())
      localObject = bl.q.getSystemIcon(localFile);
    this.i.addTab(str, (Icon)localObject, parambw.c(), parambw.k());
    x().b(parambw, true);
  }

  private void d(bw parambw)
  {
    synchronized (this.j)
    {
      bw[] arrayOfbw = new cu[this.j.length + 1];
      System.arraycopy(this.j, 0, arrayOfbw, 0, this.j.length);
      arrayOfbw[this.j.length] = parambw;
      this.j = arrayOfbw;
    }
  }

  private void e(bw parambw)
  {
    if (this.j.length == 0)
      return;
    int k = -1;
    for (int m = 0; m < this.j.length; m++)
    {
      if (this.j[m] != parambw)
        continue;
      k = m;
      break;
    }
    if (k == -1)
      return;
    bw[] arrayOfbw = new cu[this.j.length - 1];
    System.arraycopy(this.j, 0, arrayOfbw, 0, k);
    System.arraycopy(this.j, k + 1, arrayOfbw, k, this.j.length - 1 - k);
    this.j = arrayOfbw;
  }

  static bw a(e parame, int paramInt)
  {
    return parame.c(paramInt);
  }

  static be b(e parame)
  {
    return parame.i;
  }

  static ImageIcon a(e parame)
  {
    return parame.h;
  }

  static void a(e parame, bw parambw)
  {
    parame.b(parambw);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.e
 * JD-Core Version:    0.6.0
 */