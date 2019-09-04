package com.zend.ide.e;

import com.zend.ide.e.a.a;
import com.zend.ide.e.a.ab;
import com.zend.ide.e.a.ba;
import com.zend.ide.e.a.bb;
import com.zend.ide.e.a.bc;
import com.zend.ide.e.a.bd;
import com.zend.ide.e.a.be;
import com.zend.ide.e.a.bf;
import com.zend.ide.e.a.bg;
import com.zend.ide.e.a.bh;
import com.zend.ide.e.a.bi;
import com.zend.ide.e.a.bj;
import com.zend.ide.e.a.bk;
import com.zend.ide.e.a.bl;
import com.zend.ide.e.a.bm;
import com.zend.ide.e.a.bn;
import com.zend.ide.e.a.bo;
import com.zend.ide.e.a.br;
import com.zend.ide.e.a.cb;
import com.zend.ide.e.a.db;
import com.zend.ide.e.a.eb;
import com.zend.ide.e.a.fb;
import com.zend.ide.e.a.gb;
import com.zend.ide.e.a.o;
import com.zend.ide.e.a.p;
import com.zend.ide.e.a.q;
import com.zend.ide.e.a.r;
import com.zend.ide.e.a.s;
import com.zend.ide.e.a.t;
import com.zend.ide.e.a.u;
import com.zend.ide.e.a.v;
import com.zend.ide.e.a.y;
import com.zend.ide.e.a.z;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.Vector;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

public class c
  implements cu
{
  private int a = 2;
  private g b;
  private com.zend.ide.i.n c;
  private JPanel d;
  private JPanel e;
  private JPanel f;
  private JPanel g;
  private JPanel h;
  private com.zend.ide.p.w i;
  private com.zend.ide.p.w j;
  private com.zend.ide.p.w k;
  private com.zend.ide.p.w l;
  private com.zend.ide.p.x[] m;
  private com.zend.ide.p.x n;
  private int o = 0;
  private Vector p;
  private Vector q;
  private Vector r;
  private a s = null;
  private ImageIcon t;
  private boolean u = true;
  private JComponent v = null;
  private JComboBox w = null;
  private int x = -1;
  private n y = null;
  private boolean z = false;
  private d A;
  private int B = -1;
  private Frame C;
  private f D = null;

  public c(Frame paramFrame)
  {
    this.C = paramFrame;
    this.D = new f(-1, true, true);
  }

  public Object r()
  {
    if (this.c == null)
      return this.D;
    return new f(d(), this.m[0].isSelected(), this.m[1].isSelected());
  }

  public void a(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof Integer)))
      this.D.a(((Integer)paramObject).intValue() + 1, true, true);
    else if ((paramObject != null) && ((paramObject instanceof f)))
      this.D = ((f)paramObject);
  }

  private void b()
  {
    this.m[0].setSelected(this.D.b());
    this.m[1].setSelected(this.D.c());
    c();
    a(this.D.d() + 1);
  }

  public void a(d paramd)
  {
    this.A = paramd;
  }

  private int a(String paramString)
  {
    for (int i1 = 0; i1 < this.p.size(); i1++)
      if (((a)this.p.get(i1)).c().equalsIgnoreCase(paramString))
        return i1;
    return 0;
  }

  private void c()
  {
    int i1 = 0;
    for (int i2 = 0; i2 < this.m.length; i2++)
    {
      if (!this.m[i2].isSelected())
        continue;
      i1++;
      b(i2);
    }
    if (i1 == 0)
    {
      b(3);
      this.k.setEnabled(false);
      this.j.setEnabled(false);
    }
    else
    {
      this.k.setEnabled(true);
      this.j.setEnabled(true);
    }
    if (i1 == this.m.length)
      b(2);
    i();
  }

  private void a(int paramInt)
  {
    this.o = paramInt;
    h();
  }

  private int d()
  {
    return this.o;
  }

  private void b(int paramInt)
  {
    int i1;
    if (paramInt == 2)
      for (i1 = 0; i1 < this.m.length; i1++)
        this.m[i1].setSelected(true);
    else if (paramInt == 3)
      for (i1 = 0; i1 < this.m.length; i1++)
        this.m[i1].setSelected(false);
    else
      this.m[paramInt].setSelected(true);
    this.x = paramInt;
  }

  private void e()
  {
    if (this.p.size() != 0)
    {
      for (int i1 = this.p.size() - 1; i1 >= 0; i1--)
      {
        this.o -= 1;
        if (this.o == -1)
          this.o = (this.p.size() - 1);
        int i2 = ((com.zend.ide.e.a.b)this.p.get(this.o)).b();
        if ((i2 == this.x) || (i2 == 3) || (this.x == 2))
          break;
      }
      h();
    }
  }

  private void f()
  {
    for (int i1 = 0; i1 < this.p.size(); i1++)
    {
      this.o += 1;
      if (this.o >= this.p.size())
        this.o = 0;
      int i2 = ((com.zend.ide.e.a.b)this.p.get(this.o)).b();
      if ((i2 == this.x) || (i2 == 3) || (this.x == 2))
        break;
    }
    h();
  }

  public void g()
  {
    if (this.c == null)
      l();
    a(((Boolean)com.zend.ide.y.b.a("application.showTipsDialog").c()).booleanValue());
    this.c.setVisible(true);
  }

  private void a(boolean paramBoolean)
  {
    this.u = paramBoolean;
    this.n.setSelected(paramBoolean);
  }

  private void h()
  {
    if ((this.o >= this.p.size()) || (this.o < 0))
      this.o = 0;
    this.s = ((a)this.p.get(this.o));
    if ((this.s.b() != this.x) && (this.s.b() != 3) && (this.x != 2))
      f();
    if (this.B != this.o)
    {
      if (this.v != null)
        this.h.remove(this.v);
      JComponent localJComponent = this.s.e();
      this.h.add(localJComponent, "Center");
      this.h.doLayout();
      this.h.repaint();
      this.c.validate();
      this.v = localJComponent;
      this.B = this.o;
    }
    this.z = true;
    this.w.setSelectedItem(this.s.c());
  }

  private void i()
  {
    if (this.x == -1)
      this.x = this.a;
    this.w.removeAllItems();
    this.w.removeActionListener(this.y);
    for (int i1 = 0; i1 < this.p.size(); i1++)
    {
      com.zend.ide.e.a.b localb = (com.zend.ide.e.a.b)this.p.get(i1);
      if ((localb.b() != this.x) && (localb.b() != 3) && (this.x != 2))
        continue;
      this.w.addItem(localb.c());
    }
    this.w.addActionListener(this.y);
    this.w.repaint();
    h();
  }

  public com.zend.ide.i.n j()
  {
    return this.c;
  }

  private void k()
  {
    this.p.add(new com.zend.ide.e.a.k());
    this.p.add(new com.zend.ide.e.a.x());
    this.p.add(new s());
    this.p.add(new v());
    this.p.add(new bj());
    this.p.add(new com.zend.ide.e.a.d());
    this.p.add(new com.zend.ide.e.a.e());
    this.p.add(new bi());
    this.p.add(new com.zend.ide.e.a.h());
    this.p.add(new y());
    this.p.add(new bb());
    this.p.add(new ba());
    this.p.add(new com.zend.ide.e.a.j());
    this.p.add(new com.zend.ide.e.a.c());
    this.p.add(new com.zend.ide.e.a.f());
    this.p.add(new bg());
    this.p.add(new bk());
    this.p.add(new bh());
    this.p.add(new bl());
    this.p.add(new com.zend.ide.e.a.i());
    this.p.add(new com.zend.ide.e.a.l());
    this.p.add(new com.zend.ide.e.a.m());
    this.p.add(new bf());
    this.p.add(new com.zend.ide.e.a.n());
    this.p.add(new q());
    this.p.add(new p());
    this.p.add(new r());
    this.p.add(new u());
    this.p.add(new com.zend.ide.e.a.w());
    this.p.add(new z());
    this.p.add(new bc());
    this.p.add(new bd());
    this.p.add(new be());
    this.p.add(new com.zend.ide.e.a.g());
    this.p.add(new o());
    this.p.add(new t());
    this.p.add(new br());
    this.p.add(new bo());
    this.p.add(new bm());
    this.p.add(new bn());
    this.p.add(new cb());
    this.p.add(new ab());
    this.p.add(new fb());
    this.p.add(new gb());
    this.p.add(new eb());
    this.p.add(new db());
  }

  private void l()
  {
    this.t = cv.b("didYouKnow.gif");
    this.b = new g(this);
    this.p = new Vector();
    this.q = new Vector();
    this.r = new Vector();
    this.y = new n(this);
    this.r.add(ct.b(673));
    this.r.add(ct.b(674));
    this.r.add(ct.b(675));
    this.c = new com.zend.ide.i.n(this.C, ct.a(594), true);
    this.c.addWindowListener(new b(this));
    k();
    p();
    this.c.pack();
    this.c.B();
    b();
  }

  private void m()
  {
    this.f = new JPanel(new BorderLayout(5, 5));
    this.m = new com.zend.ide.p.x[this.r.size() - 1];
    e locale = new e(this, null);
    JPanel localJPanel1 = new JPanel(new GridLayout(0, 1));
    JPanel localJPanel2 = new JPanel(new FlowLayout(1, 2, 2));
    localJPanel2.add(new JLabel(this.t, 0));
    for (int i1 = 0; i1 < this.r.size() - 1; i1++)
    {
      this.m[i1] = new com.zend.ide.p.x();
      this.m[i1].addActionListener(locale);
      this.m[i1].setSelected(true);
      localJPanel1.add(this.m[i1]);
    }
    this.m[0].setText(ct.b(591));
    this.m[0].setName("basicTipsCheckBox");
    this.m[1].setText(ct.b(592));
    this.m[1].setName("advanceTipsCheckBox");
    JPanel localJPanel3 = new JPanel(new BorderLayout(5, 5));
    localJPanel3.add(localJPanel2, "Center");
    JPanel localJPanel4 = new JPanel(new FlowLayout(2, 2, 2));
    localJPanel4.add(localJPanel1);
    this.f.add(localJPanel4, "East");
    this.f.add(localJPanel3, "West");
  }

  private void n()
  {
    this.g = new JPanel(new BorderLayout(5, 5));
    this.h = new JPanel(new BorderLayout(10, 10));
    this.h.setDoubleBuffered(true);
    this.w = new JComboBox(this.q);
    DefaultListCellRenderer localDefaultListCellRenderer = new DefaultListCellRenderer();
    localDefaultListCellRenderer.setHorizontalAlignment(0);
    this.w.setRenderer(localDefaultListCellRenderer);
    this.h.resetKeyboardActions();
    this.w.addActionListener(this.y);
    this.h.setBorder(new MetalBorders.TextFieldBorder());
    this.h.setPreferredSize(new Dimension(485, 265));
    this.h.setBackground(Color.white);
    this.h.add(this.w, "North");
    this.g.add(this.h, "Center");
  }

  private void o()
  {
    this.l = new com.zend.ide.p.w(ct.b(593));
    this.e = new JPanel(new BorderLayout());
    JPanel localJPanel1 = new JPanel();
    JPanel localJPanel2 = new JPanel();
    this.k = new com.zend.ide.p.w();
    this.j = new com.zend.ide.p.w();
    this.i = new com.zend.ide.p.w(ct.b(329));
    this.n = new com.zend.ide.p.x(ct.b(590));
    this.n.setName("openStartUpTipsCheckBox");
    this.i.setName("closeDailyTipButton");
    this.j.setName("nextTipButton");
    this.k.setName("prevTipButton");
    this.l.setName("debugDemoButton");
    this.k.setIcon(cv.b("moveleft16.gif"));
    this.k.setToolTipText(ct.b(588));
    this.j.setIcon(cv.b("moveright16.gif"));
    this.j.setToolTipText(ct.b(589));
    this.l.setToolTipText(ct.b(142));
    this.i.setToolTipText(ct.b(350));
    this.j.setPreferredSize(this.i.getPreferredSize());
    this.k.setPreferredSize(this.i.getPreferredSize());
    this.j.addActionListener(new j(this));
    this.k.addActionListener(new k(this));
    this.i.addActionListener(this.b);
    this.n.addActionListener(new m(this));
    this.l.addActionListener(new h(this));
    localJPanel1.add(this.l);
    localJPanel1.add(this.k);
    localJPanel1.add(this.j);
    localJPanel1.add(this.i);
    localJPanel2.add(this.n);
    this.l.setForeground(Color.BLUE);
    this.l.setIcon(cv.b("debugwindow16.gif"));
    this.e.add(localJPanel2, "West");
    this.e.add(localJPanel1, "East");
  }

  private void p()
  {
    m();
    n();
    o();
    b(this.a);
    i();
    this.d = new JPanel(new BorderLayout(5, 5));
    this.d.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    this.d.add(this.f, "North");
    this.d.add(this.g, "Center");
    this.d.add(this.e, "South");
    this.c.getContentPane().add(this.d);
    q();
  }

  private void q()
  {
    JRootPane localJRootPane = this.d.getRootPane();
    ActionMap localActionMap = localJRootPane.getActionMap();
    InputMap localInputMap = localJRootPane.getInputMap(1);
    String str1 = "leftKey";
    localInputMap.put(KeyStroke.getKeyStroke(37, 0), str1);
    localActionMap.put(str1, new i(this));
    String str2 = "pageUpKey";
    localInputMap.put(KeyStroke.getKeyStroke(33, 0), str2);
    localActionMap.put(str2, new i(this));
    String str3 = "rightKey";
    localInputMap.put(KeyStroke.getKeyStroke(39, 0), str3);
    localActionMap.put(str3, new l(this));
    String str4 = "pageDownKey";
    localInputMap.put(KeyStroke.getKeyStroke(34, 0), str4);
    localActionMap.put(str4, new l(this));
  }

  static d a(c paramc)
  {
    return paramc.A;
  }

  static com.zend.ide.i.n b(c paramc)
  {
    return paramc.c;
  }

  static void c(c paramc)
  {
    paramc.e();
  }

  static com.zend.ide.p.w d(c paramc)
  {
    return paramc.k;
  }

  static com.zend.ide.p.w e(c paramc)
  {
    return paramc.j;
  }

  static void f(c paramc)
  {
    paramc.f();
  }

  static boolean a(c paramc, boolean paramBoolean)
  {
    return paramc.u = paramBoolean;
  }

  static com.zend.ide.p.x g(c paramc)
  {
    return paramc.n;
  }

  static boolean h(c paramc)
  {
    return paramc.u;
  }

  static boolean i(c paramc)
  {
    return paramc.z;
  }

  static JComboBox j(c paramc)
  {
    return paramc.w;
  }

  static int a(c paramc, int paramInt)
  {
    return paramc.o = paramInt;
  }

  static int a(c paramc, String paramString)
  {
    return paramc.a(paramString);
  }

  static void k(c paramc)
  {
    paramc.h();
  }

  static boolean b(c paramc, boolean paramBoolean)
  {
    return paramc.z = paramBoolean;
  }

  static void l(c paramc)
  {
    paramc.c();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.e.c
 * JD-Core Version:    0.6.0
 */