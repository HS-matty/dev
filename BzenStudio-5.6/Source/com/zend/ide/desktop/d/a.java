package com.zend.ide.desktop.d;

import com.zend.ide.desktop.cj;
import com.zend.ide.j.bd;
import com.zend.ide.l.v;
import com.zend.ide.n.br;
import com.zend.ide.n.bw;
import com.zend.ide.p.ba;
import com.zend.ide.p.x;
import com.zend.ide.util.c.m;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.s;
import com.zend.ide.util.wb;
import java.awt.FlowLayout;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ActionMap;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.text.JTextComponent;

public class a
  implements cu
{
  private cj a;
  private com.zend.ide.ba.f d;
  private b e;
  private com.zend.ide.p.b.e f;
  private ArrayList h = new ArrayList(1);
  private com.zend.ide.ba.h[] i;
  private boolean g = false;
  private bw b;
  private v c;
  private com.zend.ide.y.e m;
  private PropertyChangeListener n = new l(this, null);
  private boolean o = false;
  private com.zend.ide.ba.h[] p = null;
  private com.zend.ide.y.i k;
  private com.zend.ide.y.i l;

  public a(cj paramcj)
  {
    this.a = paramcj;
    this.b = this.a.X();
    this.c = this.a.l();
    g();
    h();
    this.i = new com.zend.ide.ba.h[] { new com.zend.ide.ba.h("") };
  }

  private void h()
  {
    m localm = new m(new c(this));
    s locals = (s)this.b.q();
    i locali = new i(this, this.b);
    locali.b(localm);
    locals.a(locali);
    locals.a("keys.codeAnalyzer", localm, "textComponent", true);
    this.b.c().getActionMap().put("AnalyzeEditorAction", localm);
    this.k = new com.zend.ide.y.i(this.b.c());
    this.k.a("codeAnalyzer", "AnalyzeEditorAction");
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.m = new com.zend.ide.y.e(localf);
    localf.a("desktop.phpVersion", this.n);
    this.m.a("desktop.phpVersion");
  }

  private void g()
  {
    j localj = new j(this);
    m localm = new m(new d(this));
    localj.b(localm);
    this.c.a(new e(this, localj, localm));
  }

  private com.zend.ide.ba.f c()
  {
    if (this.d == null)
    {
      this.d = new com.zend.ide.ba.f(this.a.P());
      this.d.a(new f(this, null));
    }
    return this.d;
  }

  private void d()
  {
    if (this.h.size() == 0)
    {
      i();
      return;
    }
    com.zend.ide.ba.h[] arrayOfh = new com.zend.ide.ba.h[this.h.size()];
    this.p = ((com.zend.ide.ba.h[])(com.zend.ide.ba.h[])this.h.toArray(arrayOfh));
    j();
  }

  private void a(com.zend.ide.ba.h paramh)
  {
    if ((paramh == null) || (paramh.d().length == 0))
    {
      i();
      return;
    }
    this.p = new com.zend.ide.ba.h[] { paramh };
    j();
  }

  private void j()
  {
    b();
    com.zend.ide.ba.h[] arrayOfh = a(this.p);
    if ((arrayOfh == null) || (arrayOfh.length == 0))
    {
      i();
      return;
    }
    c().a(arrayOfh);
  }

  private com.zend.ide.ba.h[] a(com.zend.ide.ba.h[] paramArrayOfh)
  {
    if (this.o)
      return paramArrayOfh;
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < paramArrayOfh.length; j++)
    {
      com.zend.ide.ba.h localh1 = paramArrayOfh[j];
      com.zend.ide.ba.h localh2 = new com.zend.ide.ba.h(localh1.b());
      com.zend.ide.ba.b[] arrayOfb = localh1.d();
      for (int i1 = 0; i1 < arrayOfb.length; i1++)
      {
        if (arrayOfb[i1].f())
          continue;
        localh2.a(arrayOfb[i1]);
      }
      if (localh2.c())
        continue;
      localArrayList.add(localh2);
    }
    com.zend.ide.ba.h[] arrayOfh = new com.zend.ide.ba.h[localArrayList.size()];
    arrayOfh = (com.zend.ide.ba.h[])(com.zend.ide.ba.h[])localArrayList.toArray(arrayOfh);
    return arrayOfh;
  }

  private void i()
  {
    f();
    ba.a(com.zend.ide.bd.c.b().h(), ct.a(1042));
  }

  private void b()
  {
    com.zend.ide.bd.c localc = com.zend.ide.bd.c.b();
    com.zend.ide.k.c localc1 = localc.f();
    if (localc1.a(c().x().m()) == null)
      localc1.a(c(), "ANALYZER_RESULTS");
    try
    {
      localc1.c(c());
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
    localc.c().a("MessageComponent", true);
    if (!this.a.a())
      localc.c().a("DebugWindow", false);
  }

  private void f()
  {
    c().a(this.i);
  }

  private b e()
  {
    if (this.e == null)
      this.e = new b(this);
    return this.e;
  }

  private static boolean a(String paramString)
  {
    return wb.a(paramString);
  }

  private static boolean b(String paramString)
  {
    return com.zend.ide.j.h.m.g(paramString).exists();
  }

  private static boolean f(String paramString)
  {
    return com.zend.ide.j.h.m.g(paramString) instanceof bd;
  }

  private void c(String paramString)
  {
    if (((Boolean)com.zend.ide.y.b.a("application.showAnalayzerDialog").c()).booleanValue())
    {
      ba localba = new ba(ct.a(1053), 3, 0);
      JPanel localJPanel = new JPanel(new FlowLayout(0));
      x localx = new x(ct.a(1054));
      localx.setFocusPainted(false);
      localx.addItemListener(new h(this));
      localJPanel.add(localx);
      localba.add(localJPanel, 1);
      JDialog localJDialog = localba.createDialog(this.b.e().getTopLevelAncestor(), ct.a(150));
      localJDialog.setVisible(true);
      Object localObject = localba.getValue();
      if ((localObject != null) && ((localObject instanceof Integer)) && (((Integer)localObject).intValue() == 0))
        br.a(this.b.a(paramString));
    }
    else
    {
      br.a(this.b.a(paramString));
    }
  }

  static v b(a parama)
  {
    return parama.c;
  }

  static com.zend.ide.y.i a(a parama, com.zend.ide.y.i parami)
  {
    return parama.l = parami;
  }

  static com.zend.ide.y.i a(a parama)
  {
    return parama.l;
  }

  static bw c(a parama)
  {
    return parama.b;
  }

  static boolean e(String paramString)
  {
    return b(paramString);
  }

  static boolean d(String paramString)
  {
    return f(paramString);
  }

  static void a(a parama, String paramString)
  {
    parama.c(paramString);
  }

  static b e(a parama)
  {
    return parama.e();
  }

  static com.zend.ide.p.b.e f(a parama)
  {
    return parama.f;
  }

  static com.zend.ide.ba.f d(a parama)
  {
    return parama.c();
  }

  static void a(a parama, com.zend.ide.ba.h paramh)
  {
    parama.a(paramh);
  }

  static boolean g(String paramString)
  {
    return a(paramString);
  }

  static void j(a parama)
  {
    parama.f();
  }

  static ArrayList g(a parama)
  {
    return parama.h;
  }

  static boolean a(a parama, boolean paramBoolean)
  {
    return parama.g = paramBoolean;
  }

  static boolean k(a parama)
  {
    return parama.g;
  }

  static void h(a parama)
  {
    parama.d();
  }

  static void i(a parama)
  {
    parama.b();
  }

  static com.zend.ide.p.b.e a(a parama, com.zend.ide.p.b.e parame)
  {
    return parama.f = parame;
  }

  static boolean b(a parama, boolean paramBoolean)
  {
    return parama.o = paramBoolean;
  }

  static com.zend.ide.ba.h[] l(a parama)
  {
    return parama.p;
  }

  static void m(a parama)
  {
    parama.j();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.d.a
 * JD-Core Version:    0.6.0
 */