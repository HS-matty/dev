package com.zend.ide.cb.a;

import com.zend.ide.bd.c;
import com.zend.ide.cb.a.c.a;
import com.zend.ide.cb.c.w;
import com.zend.ide.p.eb;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import com.zend.ide.y.f;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Time;
import java.util.Hashtable;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

public class pd extends eb
  implements k
{
  private static zd b = new zd(null);
  private JPopupMenu c;
  private JPopupMenu d;
  private JPopupMenu e;
  private JPopupMenu q;
  private ob f;
  private ob g;
  private ob h;
  private ob r;
  private tb i;
  private String j;
  private com.zend.ide.cb.q k;
  private w l;
  private String x;
  private q m;
  private q n;
  private f o;
  private Font p = cv.e();
  private static int s;
  private static JDialog t;
  private static Point u;

  public pd(w paramw, com.zend.ide.cb.q paramq, TableModel paramTableModel)
  {
    super(paramTableModel);
    this.l = paramw;
    a(paramq);
    e();
  }

  public com.zend.ide.cb.q a()
  {
    return this.k;
  }

  public void a(com.zend.ide.cb.q paramq)
  {
    this.k = paramq;
    if (paramq != null)
      this.x = paramq.l().j();
  }

  protected void e()
  {
    s();
    setAutoResizeMode(0);
    f();
    g();
    i();
    h();
    j();
    v();
    t();
    w();
    k();
    l();
    m();
    n();
    addMouseListener(new d(this, null));
  }

  private void s()
  {
    this.o = new f();
    this.o.a("editing.font", new kd(this, null));
    com.zend.ide.y.e locale = new com.zend.ide.y.e(this.o);
    locale.a("editing.font");
  }

  protected void f()
  {
    setDefaultRenderer(String.class, new sd());
  }

  protected void g()
  {
    setDefaultEditor(String.class, new yc(this));
  }

  protected void h()
  {
    setDefaultRenderer(Blob.class, new td());
  }

  protected void i()
  {
    setDefaultRenderer(Clob.class, new ud());
  }

  protected void j()
  {
    setDefaultRenderer(java.sql.Date.class, new vd(this));
    setDefaultRenderer(java.util.Date.class, new vd(this));
  }

  protected void v()
  {
    setDefaultEditor(java.sql.Date.class, new pe(this));
    setDefaultEditor(java.util.Date.class, new pe(this));
  }

  protected void t()
  {
    setDefaultRenderer(Time.class, new le(this));
  }

  protected void w()
  {
    setDefaultEditor(Time.class, new qe(this));
  }

  protected void k()
  {
    setDefaultRenderer(lb.class, new yd());
  }

  protected void l()
  {
    setDefaultRenderer(Boolean.class, new ad());
  }

  protected void m()
  {
    setDefaultRenderer(Number.class, new wd());
    xd localxd = new xd();
    setDefaultRenderer(Float.class, localxd);
    setDefaultRenderer(Double.class, localxd);
  }

  private void n()
  {
    if (this.f == null)
    {
      this.f = new ob(2);
      this.f.put("text", new ub(this));
      this.f.put("hex", new sb(this));
      this.i = new tb(this);
      this.f.put("image", this.i);
    }
    if (this.c == null)
      this.c = a(this.f);
  }

  private void x()
  {
    if (this.r == null)
    {
      this.r = new ob(1);
      this.r.put("setNull", new vb(this));
    }
    if (this.q == null)
      this.q = a(this.r);
    int i1 = getSelectedRow();
    int i2 = getSelectedColumn();
    if ((i1 < 0) || (i2 < 0))
      return;
    ((vb)this.r.get("setNull")).setEnabled(isCellEditable(i1, i2));
  }

  private void o()
  {
    if (this.g == null)
    {
      this.g = new ob(2);
      this.g.put("fullText", new wb(this));
      this.g.put("setNull", new vb(this));
    }
    if (this.d == null)
      this.d = a(this.g);
    int i1 = getSelectedRow();
    int i2 = getSelectedColumn();
    if ((i1 < 0) || (i2 < 0))
      return;
    ((vb)this.g.get("setNull")).setEnabled(isCellEditable(i1, i2));
  }

  private void p()
  {
    if (this.h == null)
    {
      this.h = new ob(2);
      this.h.put("fullText", new wb(this));
      this.h.put("killProcess", new rb(this));
    }
    if (this.e == null)
      this.e = a(this.h);
    int i1 = getSelectedRow();
    int i2 = getSelectedColumn();
    rb localrb = (rb)this.h.get("killProcess");
    if ((i1 < 0) || (i2 < 0))
    {
      localrb.setEnabled(false);
    }
    else
    {
      com.zend.ide.cb.q localq = a();
      if (localq == null)
      {
        localrb.setEnabled(false);
        return;
      }
      localrb.setEnabled(localq.n() != null);
    }
  }

  private JPopupMenu a(ob paramob)
  {
    JPopupMenu localJPopupMenu = new JPopupMenu();
    Object[] arrayOfObject = paramob.a();
    for (int i1 = 0; i1 < arrayOfObject.length; i1++)
      localJPopupMenu.add((Action)paramob.get(arrayOfObject[i1]));
    return localJPopupMenu;
  }

  private void a(JPopupMenu paramJPopupMenu, MouseEvent paramMouseEvent)
  {
    if (paramJPopupMenu.isVisible())
      paramJPopupMenu.setVisible(false);
    SwingUtilities.invokeLater(new g(this, paramJPopupMenu, paramMouseEvent));
  }

  public void u()
  {
    if ((this.m == null) && (this.l != null))
      this.m = new q(this.l.b());
    else if ((this.m != null) && (!this.m.a().equals(this.l.b())))
      this.m.a(this.l.b());
  }

  private static String a(String paramString)
  {
    if (paramString.length() > 400)
      paramString = paramString.substring(0, 399) + "...";
    return paramString;
  }

  public TableCellRenderer getDefaultRenderer(Class paramClass)
  {
    if (paramClass == null)
      return new sd();
    Object localObject = this.defaultRenderersByColumnClass.get(paramClass);
    if (localObject != null)
      return (TableCellRenderer)localObject;
    return getDefaultRenderer(paramClass.getSuperclass());
  }

  private boolean a()
  {
    return "SQLite".equals(this.x);
  }

  private void q()
  {
    com.zend.ide.ab.a.d locald = new com.zend.ide.ab.a.d();
    locald.a(s());
    JDialog localJDialog = a(ct.a(1481), locald.a(), false, true, 580, 450);
    localJDialog.setResizable(false);
    localJDialog.addWindowListener(new gb(this, locald));
    localJDialog.setVisible(true);
  }

  private void r()
  {
    com.zend.ide.cb.a.c.b localb = new com.zend.ide.cb.a.c.b();
    localb.a(t());
    JDialog localJDialog = a(ct.a(1476), localb.a(), true, true, 580, 250);
    localJDialog.setVisible(true);
  }

  private byte[] s()
  {
    ae localae = (ae)e();
    int i1 = localae.h() ? -1 : 0;
    return localae.a(b(getSelectedRow()), getSelectedColumn() + i1);
  }

  private String t()
  {
    ae localae = (ae)e();
    Object localObject = localae.getValueAt(b(getSelectedRow()), getSelectedColumn());
    String str = null;
    if (localObject != null)
      str = localObject.toString();
    return str == null ? "" : str;
  }

  private JDialog a(String paramString, JComponent paramJComponent, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    JDialog localJDialog;
    if (paramBoolean2)
    {
      localJDialog = new JDialog(c.b().h(), paramString);
    }
    else
    {
      localJDialog = new JDialog();
      localJDialog.setTitle(paramString);
    }
    localJDialog.getContentPane().setLayout(new BorderLayout());
    if (paramBoolean1)
      localJDialog.getContentPane().add(new JScrollPane(paramJComponent));
    else
      localJDialog.getContentPane().add(paramJComponent);
    localJDialog.setSize(paramInt1, paramInt2);
    localJDialog.setLocationRelativeTo(null);
    return localJDialog;
  }

  public JComponent a()
  {
    return this;
  }

  public void c()
  {
  }

  public void a(String paramString)
  {
    this.j = paramString;
  }

  public String d()
  {
    if (this.j == null)
      this.j = "";
    return this.j;
  }

  public boolean e()
  {
    return requestFocusInWindow();
  }

  static Font a(pd parampd, Font paramFont)
  {
    return parampd.p = paramFont;
  }

  static Font a(pd parampd)
  {
    return parampd.p;
  }

  static zd v()
  {
    return b;
  }

  static String b(String paramString)
  {
    return a(paramString);
  }

  static q b(pd parampd)
  {
    return parampd.m;
  }

  static q a(pd parampd, q paramq)
  {
    return parampd.m = paramq;
  }

  static w c(pd parampd)
  {
    return parampd.l;
  }

  static boolean d(pd parampd)
  {
    return parampd.a();
  }

  static int y()
  {
    return s;
  }

  static JDialog z()
  {
    return t;
  }

  static Point a(Point paramPoint)
  {
    u = paramPoint;
    return paramPoint;
  }

  static int a(int paramInt)
  {
    return pd.s = paramInt;
  }

  static JDialog a(JDialog paramJDialog)
  {
    t = paramJDialog;
    return paramJDialog;
  }

  static Point A()
  {
    return u;
  }

  static q a(pd parampd)
  {
    return parampd.n;
  }

  static q b(pd parampd, q paramq)
  {
    return parampd.n = paramq;
  }

  static void b(pd parampd)
  {
    parampd.q();
  }

  static void c(pd parampd)
  {
    parampd.r();
  }

  static void d(pd parampd)
  {
    parampd.p();
  }

  static JPopupMenu j(pd parampd)
  {
    return parampd.e;
  }

  static void a(pd parampd, JPopupMenu paramJPopupMenu, MouseEvent paramMouseEvent)
  {
    parampd.a(paramJPopupMenu, paramMouseEvent);
  }

  static tb e(pd parampd)
  {
    return parampd.i;
  }

  static JPopupMenu f(pd parampd)
  {
    return parampd.c;
  }

  static void g(pd parampd)
  {
    parampd.o();
  }

  static JPopupMenu h(pd parampd)
  {
    return parampd.d;
  }

  static void i(pd parampd)
  {
    parampd.x();
  }

  static JPopupMenu k(pd parampd)
  {
    return parampd.q;
  }

  static com.zend.ide.cb.q l(pd parampd)
  {
    return parampd.k;
  }

  static byte[] m(pd parampd)
  {
    return parampd.s();
  }

  static JDialog a(pd parampd, String paramString, JComponent paramJComponent, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    return parampd.a(paramString, paramJComponent, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.pd
 * JD-Core Version:    0.6.0
 */