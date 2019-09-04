package com.zend.ide.v;

import com.zend.ide.be.i;
import com.zend.ide.be.j;
import com.zend.ide.j.h;
import com.zend.ide.n.br;
import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.n.ek;
import com.zend.ide.p.d.bl;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bp;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import com.zend.ide.util.s;
import java.awt.Rectangle;
import java.awt.dnd.DropTarget;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class d extends c
{
  public static final String o = ct.a(633);
  private static d f;
  private static final ImageIcon m = cv.b("explorer/phpfile.gif");
  private e g;
  private ArrayList h;
  private n i;
  private bt j;
  private ArrayList n = new ArrayList();
  private int k = 0;
  private b l = new b(this, null);

  public d()
  {
    f = this;
    this.g = new e();
    a(this.g);
    this.h = new ArrayList();
    x().b(this.g);
    ba localba = new ba(this, null);
    ((s)q()).a("keys.cloneView", localba, "textComponent", true);
    this.i = new n(this, null);
    com.zend.ide.a.b.a("EditorComponent", this);
    this.j = new bt(this);
    new DropTarget(c(), 3, new u(this, null));
    z();
    a(this.l);
    a(new cb(this));
    a(new kb(this));
  }

  public static d y()
  {
    return f;
  }

  public bw[] v()
  {
    bw[] arrayOfbw = new bw[this.h.size() + 1];
    arrayOfbw[0] = this.g;
    for (int i1 = 0; i1 < this.h.size(); i1++)
      arrayOfbw[(i1 + 1)] = ((bw)this.h.get(i1));
    return arrayOfbw;
  }

  public String o()
  {
    return this.g.o();
  }

  public boolean a(String paramString, com.zend.ide.util.bh parambh, int paramInt)
  {
    a();
    paramString = br.c(paramString);
    synchronized (this.n)
    {
      if (this.n.contains(paramString))
        return true;
      this.n.add(paramString);
    }
    try
    {
      boolean bool = b(paramString, parambh, paramInt);
      return bool;
    }
    finally
    {
      synchronized (this.n)
      {
        this.n.remove(paramString);
      }
    }
    throw localObject3;
  }

  public boolean a(String paramString, com.zend.ide.util.bh parambh, InputStream paramInputStream)
  {
    a();
    paramString = br.c(paramString);
    synchronized (this.n)
    {
      if (this.n.contains(paramString))
        return true;
      this.n.add(paramString);
    }
    try
    {
      boolean bool = b(paramString, parambh, paramInputStream);
      return bool;
    }
    finally
    {
      synchronized (this.n)
      {
        this.n.remove(paramString);
      }
    }
    throw localObject3;
  }

  private void a()
  {
    com.zend.ide.be.d locald = com.zend.ide.bd.c.b().c();
    com.zend.ide.be.l locall = (com.zend.ide.be.l)locald.a("EditorComponent");
    locall.b(o);
  }

  private boolean b(String paramString, com.zend.ide.util.bh parambh, int paramInt)
  {
    if (a(paramString, paramInt))
      return true;
    boolean bool = this.g.a(paramString, parambh, paramInt);
    if (bool)
      a(this.g);
    return bool;
  }

  private boolean b(String paramString, com.zend.ide.util.bh parambh, InputStream paramInputStream)
  {
    if (a(paramString, -1))
      return true;
    boolean bool = this.g.a(paramString, parambh, paramInputStream);
    if (bool)
      a(this.g);
    return bool;
  }

  public boolean a(dz paramdz, int paramInt)
  {
    bw[] arrayOfbw = v();
    for (int i1 = 0; i1 < arrayOfbw.length; i1++)
    {
      if (!arrayOfbw[i1].a(paramdz, paramInt))
        continue;
      arrayOfbw[i1].grabFocus();
      a(arrayOfbw[i1]);
      return true;
    }
    return false;
  }

  public boolean a(String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    bw[] arrayOfbw = v();
    for (int i1 = arrayOfbw.length - 1; (i1 >= 0) && (bool); i1--)
      bool = arrayOfbw[i1].a(paramString, paramBoolean);
    return bool;
  }

  public boolean b(boolean paramBoolean)
  {
    bw localbw;
    for (boolean bool = true; (!this.h.isEmpty()) && (bool); bool = localbw.a(paramBoolean))
      localbw = (bw)this.h.get(0);
    if (bool)
      bool = this.g.b(paramBoolean);
    return bool;
  }

  public boolean c(boolean paramBoolean)
  {
    bw localbw;
    for (boolean bool = true; (!this.h.isEmpty()) && (bool); bool = localbw.a(paramBoolean))
      localbw = (bw)this.h.get(0);
    if (bool)
      bool = this.g.c(paramBoolean);
    return bool;
  }

  public dz f()
  {
    return this.g.f();
  }

  public bb q()
  {
    return this.g.q();
  }

  public bs t()
  {
    return this.j;
  }

  public void a(bn parambn)
  {
    this.g.a(parambn);
  }

  public JComponent c()
  {
    return this.g.c();
  }

  public void repaint()
  {
    super.repaint();
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
    {
      bw localbw = (bw)localIterator.next();
      localbw.repaint();
    }
  }

  public void d(String paramString)
  {
    this.g.d(paramString);
  }

  public Object s()
  {
    o localo = (o)this.g.s();
    if (!this.h.isEmpty())
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.h.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (bw)localIterator.next();
        if ((((bw)localObject1).k().startsWith(o())) && (!((bw)localObject1).l()))
          continue;
        localObject2 = (p)((bw)localObject1).s();
        localArrayList.add(localObject2);
      }
      Object localObject1 = localo.c();
      Object localObject2 = new p[localObject1.length + localArrayList.size()];
      System.arraycopy(localObject1, 0, localObject2, 0, localObject1.length);
      for (int i1 = 0; i1 < localArrayList.size(); i1++)
        localObject2[(localObject1.length + i1)] = ((p)localArrayList.get(i1));
      localo.a(localObject2, localo.b());
    }
    return localo;
  }

  public void c(Object paramObject)
  {
    b(false);
    if ((paramObject == null) || (!(paramObject instanceof o)))
      return;
    o localo = (o)paramObject;
    p[] arrayOfp1 = localo.c();
    ArrayList localArrayList = new ArrayList();
    for (int i1 = arrayOfp1.length - 1; i1 >= 0; i1--)
    {
      if (!arrayOfp1[i1].d())
        continue;
      localArrayList.add(arrayOfp1[i1]);
    }
    if (!localArrayList.isEmpty())
    {
      p[] arrayOfp2 = new p[arrayOfp1.length - localArrayList.size()];
      System.arraycopy(arrayOfp1, 0, arrayOfp2, 0, arrayOfp2.length);
      localo.a(arrayOfp2, localo.b());
    }
    SwingUtilities.invokeLater(new l(this, localo, localArrayList));
  }

  private void a(w paramw)
  {
    this.h.remove(paramw);
    x().a(paramw, true);
    paramw.a(this);
    x().a(paramw);
    if (this.g.j() > 0)
      this.g.grabFocus();
    if (this.h.isEmpty())
    {
      a(this.g);
      this.g.grabFocus();
    }
    else
    {
      ((bw)this.h.get(0)).grabFocus();
    }
  }

  protected ek w()
  {
    return new z(this, null);
  }

  protected bw b(Object paramObject)
  {
    Object localObject;
    if ((paramObject != null) && (paramObject.equals("clone")))
    {
      localObject = new w(this, null);
      ((bw)localObject).a("clone", Boolean.TRUE);
    }
    else
    {
      localObject = this.g.b(null);
    }
    return (bw)localObject;
  }

  protected void b(bw parambw)
  {
    Object localObject = parambw.a("clone");
    if ((localObject == null) || (!localObject.equals(Boolean.TRUE)))
    {
      this.g.c(parambw);
      return;
    }
    bp.a(parambw);
    parambw.a(this);
    x().b(parambw);
    this.h.add(parambw);
    parambw.c().setName(k());
    String str = "Clone Editor" + this.k++;
    JComponent localJComponent = parambw.c();
    localJComponent.putClientProperty("Window Name", str);
    i locali = new i(true, false, 2, 1.0D, -1, new Rectangle(50, 50, 250, 350));
    com.zend.ide.be.d locald = com.zend.ide.bd.c.b().c();
    j localj = locald.a("", m, parambw.k(), localJComponent, true, locali, "Clone_View");
    localJComponent.putClientProperty("cloneTitle", localj);
    locald.a(str, localj);
    b((w)parambw);
    parambw.c().revalidate();
    parambw.c().repaint();
    x().b(parambw, true);
  }

  private void z()
  {
    com.zend.ide.bd.c.b().c().a(new bg(this, null));
    com.zend.ide.bd.c.b().c().a(new bh(this, null));
  }

  private w e(String paramString)
  {
    for (int i1 = 0; i1 < this.h.size(); i1++)
    {
      w localw = (w)this.h.get(i1);
      if (localw.c().getClientProperty("Window Name").equals(paramString))
        return localw;
    }
    return null;
  }

  private static void b(w paramw)
  {
    String str1 = paramw.k();
    File localFile = h.m.g(str1);
    String str2 = localFile.getName();
    Object localObject = m;
    if (localFile.exists())
      localObject = bl.q.getSystemIcon(localFile);
    boolean bool = paramw.l();
    if (bool)
    {
      str1 = str1 + '*';
      str2 = str2 + '*';
    }
    j localj = (j)paramw.c().getClientProperty("cloneTitle");
    localj.a((Icon)localObject);
    localj.b(str1);
    com.zend.ide.be.d locald = com.zend.ide.bd.c.b().c();
    JComponent localJComponent = paramw.c();
    try
    {
      String str3 = (String)localJComponent.getClientProperty("Window Name");
      locald.a(str3, str2);
      locald.a(str3, (Icon)localObject);
      locald.b(str3, str1);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  static e a(d paramd)
  {
    return paramd.g;
  }

  static void a(d paramd, w paramw)
  {
    paramd.a(paramw);
  }

  static ArrayList a(d paramd)
  {
    return paramd.h;
  }

  static w a(d paramd, String paramString)
  {
    return paramd.e(paramString);
  }

  static void c(w paramw)
  {
    b(paramw);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.d
 * JD-Core Version:    0.6.0
 */