package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.n.bw;
import com.zend.ide.p.cd;
import com.zend.ide.p.z;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import com.zend.ide.zendPlatformIntegration.b.b.f;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.HashMap;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class hb extends JComponent
  implements bn, AncestorListener, cu
{
  private static final long serialVersionUID = 1L;
  private com.zend.ide.zendPlatformIntegration.b.e a;
  private d b;
  private bb c;
  private bt d;
  protected jb e;
  private z f = new z();
  private com.zend.ide.zendPlatformIntegration.c g;
  private f h = f.a();
  private HashMap i = new HashMap();
  private com.zend.ide.zendPlatformIntegration.b.b.b j;
  private JPanel k;
  private JButton l;
  private JButton m;
  private JButton n;
  private JButton o;
  private s p;
  private com.zend.ide.be.l q;
  private bw r;
  private long s = 0L;

  public hb(com.zend.ide.be.l paraml, bw parambw)
  {
    this.q = paraml;
    this.r = parambw;
    setLayout(new BorderLayout());
    this.p = s.a();
    this.a = com.zend.ide.zendPlatformIntegration.b.e.a();
    com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b[] arrayOfb = new com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b[0];
    String str = com.zend.ide.y.b.a("platform.guiURL").c().toString();
    if ((str == null) || (str.equals("")))
      com.zend.ide.y.b.a("platform.guiURL").a("http://localhost/ZendPlatform");
    a();
    this.a.a(arrayOfb);
    this.b = new d(this.a);
    this.e = new jb(this.b);
    this.e.setDragEnabled(false);
    cd localcd = new cd(this.e);
    this.e.setAutoResizeMode(0);
    add(localcd, "Center");
    k();
    this.c = i();
    this.d = new bt(this);
    this.d.a(this.e);
    f();
    paraml.b().addAncestorListener(this);
    paraml.a(ct.a(1918), cv.b("platform.gif"), this, "", "PLATFORM_INTEGRATION");
  }

  private void a()
  {
    this.k = new JPanel();
    BorderLayout localBorderLayout = new BorderLayout();
    localBorderLayout.setHgap(0);
    localBorderLayout.setVgap(0);
    this.k.setLayout(localBorderLayout);
    JToolBar localJToolBar = new JToolBar();
    localJToolBar.setFloatable(false);
    localJToolBar.setRollover(true);
    FlowLayout localFlowLayout = new FlowLayout(2);
    localJToolBar.setLayout(localFlowLayout);
    localFlowLayout.setHgap(0);
    localFlowLayout.setVgap(0);
    this.n = new JButton();
    this.n.addActionListener(new h(this));
    this.n.setToolTipText(ct.a(1886));
    this.n.setIcon(new ImageIcon(cv.b("sql/previous.gif").getImage()));
    localJToolBar.add(this.n);
    this.o = new JButton();
    this.o.setToolTipText(ct.a(1887));
    this.o.addActionListener(new j(this));
    this.o.setIcon(new ImageIcon(cv.b("sql/next.gif").getImage()));
    localJToolBar.add(this.o);
    this.m = new JButton();
    this.m.setToolTipText(ct.a(1888));
    this.m.setIcon(new ImageIcon(cv.b("sql/refresh.gif").getImage()));
    this.m.addActionListener(new k(this));
    localJToolBar.add(this.m);
    this.l = new JButton();
    this.l.setToolTipText(ct.a(1889));
    this.l.addActionListener(new l(this));
    this.l.setIcon(new ImageIcon(cv.b("sql/preferences.gif").getImage()));
    localJToolBar.add(this.l);
    this.k.add(localJToolBar, "East");
    this.k.add(this.f, "West");
    add(this.k, "First");
  }

  public void b()
  {
    String str = com.zend.ide.y.b.a("platform.guiURL").c().toString();
    int i1 = a(str);
    m localm = new m(this, str, i1);
    new Thread(localm).start();
    if (this.p.a)
    {
      c();
    }
    else if (this.g != null)
    {
      this.g.a();
      this.g = null;
    }
  }

  private void c()
  {
    if (this.g != null)
      this.g.a();
    this.g = new com.zend.ide.zendPlatformIntegration.c(this, this.h);
  }

  private void d()
  {
    String str1 = new String(com.zend.ide.y.b.a("platform.guiURL").c().toString());
    int i1 = ((Integer)com.zend.ide.y.b.a("platform.limitSize").c()).intValue();
    boolean bool1 = ((Boolean)com.zend.ide.y.b.a("platform.useLimits").c()).booleanValue();
    int i2 = ((Integer)com.zend.ide.y.b.a("platform.sortingFieldIndex").c()).intValue();
    boolean bool2 = ((Boolean)com.zend.ide.y.b.a("platform.isAutoRefresh").c()).booleanValue();
    boolean bool3 = ((Boolean)com.zend.ide.y.b.a("platform.sortingIsDesc").c()).booleanValue();
    int i3 = ((Integer)com.zend.ide.y.b.a("platform.refreshRate").c()).intValue();
    int i4 = ((Integer)com.zend.ide.y.b.a("platform.eventsFromFilterKey").c()).intValue();
    String str2 = new String(com.zend.ide.y.b.a("platform.eventTypesFilterKey").c().toString());
    String str3 = new String(com.zend.ide.y.b.a("platform.statusFilterKey").c().toString());
    String str4 = new String(com.zend.ide.y.b.a("platform.severityFilterKey").c().toString());
    String str5 = new String(com.zend.ide.y.b.a("platform.timeFilterKey").c().toString());
    r[] arrayOfr1 = (r[])(r[])com.zend.ide.y.b.a("platform.serversFilterArray").c();
    boolean bool4 = this.p.e;
    int i5 = this.p.f;
    int i6 = this.p.c;
    boolean bool5 = this.p.d;
    int i7 = this.p.b;
    boolean bool6 = this.p.a;
    int i8 = this.p.g;
    String str6 = this.p.h;
    String str7 = this.p.i;
    String str8 = this.p.j;
    String str9 = this.p.k;
    r[] arrayOfr2 = this.p.l;
    this.p.d();
    Object localObject;
    if ((bool1 != bool4) || (i1 != i5))
    {
      localObject = new n(this, str1, bool1, bool4, i1, i5);
      new Thread((Runnable)localObject).start();
    }
    else if ((i2 != i6) || (bool3 != bool5))
    {
      localObject = new o(this, str1);
      new Thread((Runnable)localObject).start();
    }
    else if ((i4 != i8) || (!str2.equals(str6)) || (!str4.equals(str8)) || (!str3.equals(str7)) || (!str5.equals(str9)) || (a(arrayOfr1, arrayOfr2)))
    {
      localObject = new p(this, str1);
      new Thread((Runnable)localObject).start();
    }
    if (bool2 != bool6)
    {
      if ((bool6) && (this.h.e() != null))
      {
        c();
      }
      else if (this.g != null)
      {
        this.g.a();
        this.g = null;
      }
    }
    else if ((bool6) && (i3 != i7) && (this.h.e() != null))
      c();
  }

  private void e()
  {
    com.zend.ide.zendPlatformIntegration.b.a.q[] arrayOfq = com.zend.ide.zendPlatformIntegration.b.a.p.a;
    for (int i1 = 0; i1 < arrayOfq.length; i1++)
      this.e.a(i1, 0);
  }

  private boolean a(r[] paramArrayOfr1, r[] paramArrayOfr2)
  {
    if (paramArrayOfr1.length != paramArrayOfr2.length)
      return true;
    for (int i1 = 0; i1 < paramArrayOfr1.length; i1++)
      if ((paramArrayOfr1[i1].a() != paramArrayOfr2[i1].a()) || (paramArrayOfr1[i1].c() != paramArrayOfr2[i1].c()))
        return true;
    return false;
  }

  private void a(com.zend.ide.zendPlatformIntegration.b.b.b paramb)
  {
    String str = com.zend.ide.y.b.a("platform.guiURL").c().toString();
    if (paramb == null)
      return;
    this.i.put(str, Integer.valueOf(0));
    b(paramb);
  }

  public synchronized void b(com.zend.ide.zendPlatformIntegration.b.b.b paramb)
  {
    int i1 = this.h.e().d();
    a(this.h.d(), this.h.b(), 0, i1);
    this.a.a(paramb.b());
    this.e.a(this.b);
    f();
  }

  private void a(String paramString, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      com.zend.ide.zendPlatformIntegration.b.b.e locale = new com.zend.ide.zendPlatformIntegration.b.b.e(paramString, paramInt, false);
      this.h.a(locale);
      this.j = this.h.e();
    }
    else
    {
      this.j = this.h.a(paramString, paramInt);
    }
    if (this.j == null)
    {
      this.j = new com.zend.ide.zendPlatformIntegration.b.b.b(new com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b[0], 0, System.currentTimeMillis());
      this.f.setText("");
    }
    else
    {
      int i1 = this.h.b();
      int i2 = paramInt + this.j.d();
      a(paramString, i1, paramInt, i2);
    }
    f();
    this.a.a(this.j.b());
    this.e.a(this.b);
  }

  private void a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 != 0)
      this.f.setText(ct.a(1487) + ": '" + paramString + "'        " + ct.a(1890) + ": " + (paramInt2 + 1) + "-" + paramInt3 + "        " + ct.a(1891) + ": " + paramInt1);
    else
      this.f.setText(ct.a(1487) + ": '" + paramString + "'        " + ct.a(1890) + ": " + paramInt2 + "-" + paramInt3 + "        " + ct.a(1891) + ": " + paramInt1);
  }

  public void f()
  {
    com.zend.ide.zendPlatformIntegration.b.b.b localb = this.h.e();
    int i1 = 0;
    if (localb != null)
      i1 = localb.c();
    if (i1 == 0)
    {
      if ((localb == null) || (localb.d() == 0))
      {
        this.o.setEnabled(false);
        this.n.setEnabled(false);
      }
      else if (localb.d() != 0)
      {
        if (localb.d() == this.h.b())
          this.o.setEnabled(false);
        else
          this.o.setEnabled(true);
        this.n.setEnabled(false);
      }
    }
    else if ((localb == null) || (localb.d() == 0))
    {
      this.o.setEnabled(false);
      this.n.setEnabled(true);
    }
    else if (this.p.f + i1 >= this.h.b())
    {
      this.o.setEnabled(false);
      this.n.setEnabled(true);
    }
    else
    {
      this.o.setEnabled(true);
      this.n.setEnabled(true);
    }
  }

  public void g()
  {
    this.p.b();
    String str = com.zend.ide.y.b.a("platform.guiURL").c().toString();
    int i1 = a(str) + this.p.f;
    if (i1 >= this.h.b())
      return;
    this.i.put(str, new Integer(i1));
    q localq = new q(this, str, i1);
    new Thread(localq).start();
  }

  public void h()
  {
    String str = com.zend.ide.y.b.a("platform.guiURL").c().toString();
    this.p.b();
    int i1 = a(str) - this.p.f;
    if (i1 < 0)
      return;
    this.i.put(str, new Integer(i1));
    i locali = new i(this, str, i1);
    new Thread(locali).start();
  }

  private int a(String paramString)
  {
    Integer localInteger = (Integer)this.i.get(paramString);
    if (localInteger == null)
    {
      localInteger = new Integer(0);
      this.i.put(paramString, localInteger);
    }
    return localInteger.intValue();
  }

  protected bb i()
  {
    b localb = new b(this);
    return localb;
  }

  public Object s()
  {
    return null;
  }

  public JComponent c()
  {
    return this;
  }

  public String r()
  {
    return null;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return null;
  }

  public bb q()
  {
    return this.c;
  }

  public bs t()
  {
    return this.d;
  }

  public boolean d(boolean paramBoolean)
  {
    return false;
  }

  public void c(Object paramObject)
  {
  }

  public void d(String paramString)
  {
  }

  public void a(bn parambn)
  {
    this.c.a(parambn.q());
  }

  public void setVisible(boolean paramBoolean)
  {
    if ((!isVisible()) && (paramBoolean))
    {
      long l1 = System.currentTimeMillis();
      this.p.b();
      if ((this.p.a) && (this.h != null) && (this.h.e() != null) && (this.s != 0L))
      {
        long l2 = l1 - this.s;
        long l3 = l2 / 1000L / 60L;
        int i1 = this.p.b;
        if (l3 >= i1)
        {
          b();
          this.s = 0L;
        }
        else
        {
          c();
        }
      }
    }
    else if ((isVisible()) && (!paramBoolean) && (this.g != null))
    {
      this.g.a();
      this.g = null;
      if (this.s == 0L)
        this.s = System.currentTimeMillis();
    }
    super.setVisible(paramBoolean);
  }

  public void ancestorAdded(AncestorEvent paramAncestorEvent)
  {
    setVisible(true);
  }

  public void ancestorMoved(AncestorEvent paramAncestorEvent)
  {
  }

  public void ancestorRemoved(AncestorEvent paramAncestorEvent)
  {
    setVisible(false);
  }

  public ActionMap j()
  {
    return this.r.c().getActionMap();
  }

  protected void k()
  {
    ActionMap localActionMap = j();
    gb localgb = new gb(this);
    localActionMap.put("OpenZendPlatformWindowAction", localgb);
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean == l())
      return;
    com.zend.ide.bd.c.b().c().a("PlatformEvents", paramBoolean);
    this.r.grabFocus();
  }

  public boolean l()
  {
    return com.zend.ide.bd.c.b().c().c("PlatformEvents");
  }

  static f a(hb paramhb)
  {
    return paramhb.h;
  }

  static void b(hb paramhb)
  {
    paramhb.d();
  }

  static void a(hb paramhb, String paramString, int paramInt, boolean paramBoolean)
  {
    paramhb.a(paramString, paramInt, paramBoolean);
  }

  static void c(hb paramhb)
  {
    paramhb.e();
  }

  static void a(hb paramhb, com.zend.ide.zendPlatformIntegration.b.b.b paramb)
  {
    paramhb.a(paramb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.hb
 * JD-Core Version:    0.6.0
 */