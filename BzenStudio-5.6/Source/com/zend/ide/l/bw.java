package com.zend.ide.l;

import com.zend.ide.f.zc.b.l;
import com.zend.ide.j.h;
import com.zend.ide.j.y;
import com.zend.ide.o.cf;
import com.zend.ide.p.ba;
import com.zend.ide.p.cd;
import com.zend.ide.p.d.bp;
import com.zend.ide.p.e.b;
import com.zend.ide.p.w;
import com.zend.ide.p.z;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import com.zend.ide.util.f.a;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;

public class bw extends com.zend.ide.i.n
  implements cu
{
  private JPanel f;
  private JPanel g;
  private JPanel h;
  private JPanel i;
  private JPanel j;
  private JPanel D;
  private sb J;
  private JPanel k;
  private by l;
  private w m;
  private w n;
  private w o;
  private w p;
  private w q;
  private bp r;
  private bp s;
  private JTextField t;
  private JTextField u;
  private int v = 0;
  private JPanel[] w;
  private z x;
  private JTextArea y;
  private z z;
  private z A;
  private z B;
  private JTextArea C;
  private com.zend.ide.p.bw b;
  private JScrollPane E;
  private w F;
  private w G;
  private JLabel H;
  private JPanel I;
  private static String d;
  private u c;
  private y e;
  private boolean K;

  public static String A()
  {
    if (d == null)
      d = new File(cv.f() + File.separator + "ZDEProjects").getPath();
    return d;
  }

  public bw()
  {
    super(com.zend.ide.bd.c.b().h(), ct.a(683));
    c();
    p();
  }

  private void c()
  {
    this.f = new JPanel(new BorderLayout());
    this.f.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEtchedBorder()));
    e();
    i();
    j();
    getContentPane().add(this.f, "Center");
    getContentPane().add(this.g, "South");
    getContentPane().add(this.I, "West");
    setModal(true);
    setSize(500, 450);
    setResizable(false);
    setLocationRelativeTo(null);
  }

  private void e()
  {
    f();
    g();
    a();
    d();
    this.w = new JPanel[] { this.h, this.i, this.j, this.D };
  }

  private void f()
  {
    this.h = new JPanel(new BorderLayout());
    this.y = new JTextArea(ct.a(684));
    this.y.setFocusable(false);
    this.y.setBackground(this.h.getBackground());
    this.y.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.DARK_GRAY), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
    this.y.setEditable(false);
    this.y.setLineWrap(true);
    this.y.setWrapStyleWord(true);
    this.z = new z(ct.b(1294));
    this.z.setBackground(Color.red);
    this.t = new JTextField(ct.a(686));
    this.t.setDocument(new com.zend.ide.p.a.c());
    this.z.setLabelFor(this.t);
    v();
    this.A = new z(ct.b(687));
    this.u = new JTextField(A() + File.separator + this.t.getText() + ".zpj");
    this.u.setEnabled(false);
    this.A.setLabelFor(this.u);
    this.q = k();
    this.q.setMinimumSize(new Dimension(this.q.getPreferredSize().width, 20));
    this.k = new JPanel(new GridBagLayout());
    this.k.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    localGridBagConstraints.anchor = 18;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.gridwidth = 0;
    this.k.add(this.y, localGridBagConstraints);
    localGridBagConstraints.weighty = 10.0D;
    localGridBagConstraints.ipady = 10;
    this.k.add(this.z, localGridBagConstraints);
    localGridBagConstraints.ipady = 0;
    this.k.add(this.t, localGridBagConstraints);
    localGridBagConstraints.weighty = 100.0D;
    localGridBagConstraints.ipady = 10;
    this.k.add(this.A, localGridBagConstraints);
    localGridBagConstraints.gridwidth = -1;
    localGridBagConstraints.weightx = 2.0D;
    localGridBagConstraints.weighty = 600.0D;
    localGridBagConstraints.ipady = 0;
    this.k.add(this.u, localGridBagConstraints);
    localGridBagConstraints.gridwidth = 0;
    localGridBagConstraints.fill = 0;
    localGridBagConstraints.weightx = 0.0D;
    localGridBagConstraints.weighty = 3800.0D;
    this.k.add(this.q, localGridBagConstraints);
    this.h.add(this.k, "Center");
    this.f.add(this.h, "Center");
  }

  private void g()
  {
    this.i = new JPanel(new BorderLayout());
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    JPanel localJPanel2 = new JPanel(new FlowLayout(2));
    this.C = new JTextArea(ct.a(688));
    this.C.setEditable(false);
    this.C.setLineWrap(true);
    this.C.setWrapStyleWord(true);
    this.C.setBackground(this.i.getBackground());
    this.C.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.B = new z(ct.a(689));
    this.b = new com.zend.ide.p.bw();
    DefaultListModel localDefaultListModel = new DefaultListModel();
    this.b.setModel(localDefaultListModel);
    this.E = new cd(this.b);
    localJPanel1.add(this.B, "North");
    localJPanel1.add(this.E, "Center");
    this.F = new w(ct.b(690));
    this.F.addActionListener(new m(this));
    this.G = new w(ct.b(691));
    this.G.addActionListener(new n(this));
    localJPanel2.add(this.F);
    localJPanel2.add(this.G);
    this.i.add(this.C, "North");
    this.i.add(localJPanel1, "Center");
    this.i.add(localJPanel2, "South");
  }

  private void a()
  {
    this.l = z();
    if (this.j == null)
      this.j = new JPanel(new BorderLayout());
    this.j.add(this.l, "North");
  }

  private void d()
  {
    if (this.D == null)
      this.D = new JPanel(new BorderLayout());
    else
      this.D.removeAll();
    JTextArea localJTextArea = new JTextArea(ct.a(1810));
    localJTextArea.setFocusable(false);
    localJTextArea.setEditable(false);
    localJTextArea.setLineWrap(true);
    localJTextArea.setWrapStyleWord(true);
    localJTextArea.setBackground(getBackground());
    localJTextArea.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.DARK_GRAY), BorderFactory.createEmptyBorder(1, 0, 10, 0)));
    this.D.add(localJTextArea, "North");
    this.J = new sb(this);
    this.J.a(l.b());
    this.D.add(this.J, "Center");
    this.D.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.J.setEnabled(!a.a.b());
  }

  private void i()
  {
    this.g = new JPanel(new FlowLayout(2));
    this.m = new w(ct.b(117));
    this.n = new w(ct.b(699));
    this.o = new w(ct.b(700));
    this.p = new w(ct.b(701));
    this.m.addActionListener(new o(this));
    this.n.addActionListener(new p(this));
    this.o.addActionListener(new q(this));
    this.p.addActionListener(new r(this));
    this.g.add(this.o);
    this.g.add(this.p);
    this.g.add(this.n);
    this.g.add(this.m);
    com.zend.ide.p.e.d.b(new JButton[] { this.o, this.p });
    com.zend.ide.p.e.d.b(new JButton[] { this.n, this.m });
    JButton localJButton = new JButton(ct.a(639));
    localJButton.addActionListener(new s(this));
    this.g.add(localJButton);
  }

  private void j()
  {
    this.x = new z(ct.a(78));
    this.x.setForeground(b.b);
    this.x.setFont(this.x.getFont().deriveFont(1));
    JPanel localJPanel = new JPanel(new FlowLayout(1));
    localJPanel.add(this.x);
    this.H = new JLabel(cv.b("zdeproject.gif"), 0);
    this.I = new JPanel(new BorderLayout());
    this.I.add(this.H, "Center");
    this.I.add(localJPanel, "North");
    this.I.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black)));
  }

  private w k()
  {
    if (this.q == null)
      l();
    return this.q;
  }

  private void l()
  {
    this.q = new w("...");
    this.q.addActionListener(new t(this));
    this.q.setPreferredSize(new Dimension(this.q.getPreferredSize().width, 20));
    this.q.setMaximumSize(new Dimension(this.q.getMaximumSize().width, 20));
  }

  public u m()
  {
    return this.c;
  }

  private boolean n()
  {
    if (!q())
      return false;
    if (this.K)
    {
      com.zend.ide.util.b.e.a().a(this.u.getText());
      this.K = false;
    }
    this.c = new i();
    this.c.a(this.t.getText());
    this.c.b(this.u.getText());
    this.e = w();
    o();
    return true;
  }

  private void o()
  {
    com.zend.ide.v.o localo = new com.zend.ide.v.o();
    cf localcf = new cf();
    be localbe = new be();
    eb localeb = null;
    try
    {
      localeb = this.J.f();
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
    localcf.a(this.l.e());
    localcf.a(this.l.f());
    localcf.b(this.l.g());
    localcf.b(this.l.h());
    localcf.a(this.l.i());
    localbe.a(x());
    this.c.a(this.l.b());
    this.c.a(new e(localo, "editor_component"));
    this.c.a(new e(localcf, "debugger"));
    this.c.a(new e(localbe, "project_roots"));
    if (localeb != null)
      this.c.a(new e(localeb, "javaBridge"));
  }

  private void a(boolean paramBoolean)
  {
    if (!q())
      return;
    this.f.remove(this.w[this.v]);
    if (paramBoolean)
      this.v += 1;
    else
      this.v -= 1;
    this.f.add(this.w[this.v], "Center");
    p();
    SwingUtilities.invokeLater(new ib(this));
  }

  private static void a(Component paramComponent, String paramString)
  {
    if (paramComponent == null)
      paramComponent = com.zend.ide.bd.c.b().h();
    ba.a(paramComponent, paramString, ct.a(1545), -1, 1);
  }

  private void p()
  {
    switch (this.v)
    {
    case 0:
      this.o.setEnabled(false);
      this.p.setEnabled(true);
      break;
    case 1:
      this.o.setEnabled(true);
      this.p.setEnabled(true);
      break;
    case 2:
      this.o.setEnabled(true);
      this.p.setEnabled(true);
      break;
    case 3:
      this.p.setEnabled(false);
    }
  }

  private boolean q()
  {
    this.K = false;
    boolean bool = true;
    if (this.v == 0)
    {
      File localFile = h.m.g(this.u.getText());
      if (localFile.exists())
      {
        String str1 = ct.a(203, localFile.getName());
        String str2 = ct.a(705);
        int i1 = ba.b(this, str1, str2, 0);
        if (i1 != 0)
          bool = false;
        if (!bool)
        {
          this.t.requestFocus();
          this.t.selectAll();
        }
        this.K = bool;
      }
    }
    return bool;
  }

  private bp r()
  {
    if (this.r == null)
    {
      this.r = new bp(false);
      this.r.addChoosableFileFilter(com.zend.ide.r.p.e().l());
      this.r.setApproveButtonText(ct.a(116));
      this.r.setFileSelectionMode(2);
      this.r.setMultiSelectionEnabled(false);
      this.r.setDialogTitle(ct.a(702));
      File localFile = new File(A());
      if (!localFile.exists())
        localFile.mkdirs();
      this.r.setCurrentDirectory(localFile);
    }
    return this.r;
  }

  private bp s()
  {
    if (this.s == null)
    {
      this.s = new bp(false);
      this.s.setApproveButtonText(ct.a(8));
      this.s.setFileSelectionMode(2);
      this.s.setDialogTitle(ct.a(703));
      this.s.setMultiSelectionEnabled(true);
    }
    return this.s;
  }

  private void t()
  {
    bp localbp = s();
    int i1 = localbp.showOpenDialog(this);
    if (i1 != 0)
      return;
    File[] arrayOfFile = localbp.getSelectedFiles();
    DefaultListModel localDefaultListModel = (DefaultListModel)this.b.getModel();
    for (int i2 = 0; i2 < arrayOfFile.length; i2++)
    {
      File localFile = arrayOfFile[i2];
      if (localDefaultListModel.contains(localFile.getPath()))
        continue;
      localDefaultListModel.addElement(localFile.getPath());
    }
    this.b.repaint();
  }

  private void u()
  {
    Object[] arrayOfObject = this.b.getSelectedValues();
    if (arrayOfObject == null)
      return;
    for (int i1 = 0; i1 < arrayOfObject.length; i1++)
      ((DefaultListModel)this.b.getModel()).removeElement(arrayOfObject[i1]);
    ((DefaultListModel)this.b.getModel()).removeElement(arrayOfObject);
    this.b.repaint();
  }

  private void v()
  {
    this.t.getDocument().addDocumentListener(new hb(this));
  }

  private y w()
  {
    d locald = new d();
    if (this.b.getModel().getSize() <= 0)
      return locald;
    DefaultListModel localDefaultListModel = (DefaultListModel)this.b.getModel();
    Object[] arrayOfObject = localDefaultListModel.toArray();
    File[] arrayOfFile = new File[arrayOfObject.length];
    for (int i1 = 0; i1 < arrayOfObject.length; i1++)
    {
      String str = (String)arrayOfObject[i1];
      arrayOfFile[i1] = h.m.g(str);
    }
    locald.c(arrayOfFile);
    return locald;
  }

  protected y x()
  {
    return this.e;
  }

  public void setVisible(boolean paramBoolean)
  {
    if (paramBoolean)
      y();
    super.setVisible(paramBoolean);
  }

  private void y()
  {
    this.c = null;
    this.u.setText(A() + File.separator + this.t.getText() + ".zpj");
    ((DefaultListModel)this.b.getModel()).clear();
    if (this.v != 0)
      while (this.v > 0)
        a(false);
    a();
    d();
    z().b(true);
    z().j();
    this.t.setText(ct.a(686));
    this.t.grabFocus();
    this.t.selectAll();
  }

  protected by z()
  {
    if (this.l == null)
      this.l = new by();
    return this.l;
  }

  protected sb e()
  {
    return this.J;
  }

  static void a(bw parambw)
  {
    parambw.t();
  }

  static void b(bw parambw)
  {
    parambw.u();
  }

  static boolean c(bw parambw)
  {
    return parambw.n();
  }

  static void a(bw parambw, boolean paramBoolean)
  {
    parambw.a(paramBoolean);
  }

  static bp d(bw parambw)
  {
    return parambw.r();
  }

  static JTextField e(bw parambw)
  {
    return parambw.t;
  }

  static JTextField f(bw parambw)
  {
    return parambw.u;
  }

  static JPanel[] a(bw parambw)
  {
    return parambw.w;
  }

  static int b(bw parambw)
  {
    return parambw.v;
  }

  static JPanel c(bw parambw)
  {
    return parambw.D;
  }

  static void b(Component paramComponent, String paramString)
  {
    a(paramComponent, paramString);
  }

  static w d(bw parambw)
  {
    return parambw.p;
  }

  static w e(bw parambw)
  {
    return parambw.n;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.bw
 * JD-Core Version:    0.6.0
 */