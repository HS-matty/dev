package com.zend.ide.w.c.a;

import com.zend.ide.j.h;
import com.zend.ide.p.ba;
import com.zend.ide.p.d.bp;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.w.ab;
import com.zend.ide.w.q;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.Document;

public class hb extends ab
{
  private x e;
  private x f;
  private JTextField g;
  private JTextField h;
  private JTextField i;
  private JTextField j;
  private JTextField k;
  private JPasswordField l;
  private JLabel m;
  private JLabel n;
  private JLabel o;
  private JLabel p;
  private JLabel q;
  private JLabel r;
  private JPanel s;
  private JPanel t;
  private JPanel u;
  private JPanel v;
  private JPanel w;
  private JPanel x;
  private JPanel y;
  private w z;
  private w A;
  private w B;
  private bp C;

  public hb(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(603));
    a();
  }

  private void a()
  {
    c();
    g();
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(this.x, "Center");
    getContentPane().add(this.y, "South");
    setModal(true);
    setResizable(false);
    pack();
    a(this.i);
    a(this.j);
    this.z.setEnabled(i());
  }

  private void c()
  {
    f();
    d();
    this.x = new JPanel(new GridBagLayout());
    this.x.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEtchedBorder()));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.anchor = 17;
    localGridBagConstraints.insets = new Insets(5, 5, 2, 2);
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    this.x.add(this.v, localGridBagConstraints);
    localGridBagConstraints.gridy = 1;
    this.x.add(this.s, localGridBagConstraints);
  }

  private void d()
  {
    this.e = new x(ct.a(1657));
    this.f = new x(ct.a(1658));
    Box localBox = new Box(1);
    localBox.add(this.e);
    localBox.add(Box.createVerticalStrut(10));
    localBox.add(this.f);
    localBox.add(Box.createVerticalStrut(30));
    this.t = new JPanel(new BorderLayout());
    this.t.add(localBox, "Center");
    this.g = new JTextField();
    this.h = new JTextField();
    this.m = new JLabel(ct.a(580));
    this.m.setLabelFor(this.g);
    this.n = new JLabel(ct.a(582));
    this.n.setLabelFor(this.h);
    this.u = new JPanel(new GridLayout(4, 1));
    this.u.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.gray), BorderFactory.createEmptyBorder(0, 5, 0, 5)));
    this.u.add(this.m);
    this.u.add(this.g);
    this.u.add(this.n);
    this.u.add(this.h);
    this.s = new JPanel(new GridLayout(1, 2));
    this.s.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5), BorderFactory.createTitledBorder(ct.a(1585))));
    this.s.add(this.t);
    this.s.add(this.u);
  }

  private void f()
  {
    this.i = new JTextField();
    this.j = new JTextField();
    this.B = new w("...");
    this.B.setPreferredSize(new Dimension(30, 10));
    this.B.addActionListener(new d(this));
    this.k = new JTextField();
    this.l = new JPasswordField();
    this.o = new z(ct.a(1659));
    this.o.setLabelFor(this.i);
    this.p = new z(ct.a(606));
    this.p.setLabelFor(this.j);
    this.q = new z(ct.a(190));
    this.q.setLabelFor(this.k);
    this.r = new z(ct.a(191));
    this.r.setLabelFor(this.l);
    this.v = new JPanel(new GridLayout(8, 1));
    this.v.add(this.o);
    this.v.add(this.i);
    this.v.add(this.p);
    Box localBox = new Box(0);
    localBox.add(this.j);
    localBox.add(this.B);
    this.v.add(localBox);
    this.v.add(this.q);
    this.v.add(this.k);
    this.v.add(this.r);
    this.v.add(this.l);
  }

  protected void e()
  {
    if (!j())
      return;
    a(1);
    dispose();
  }

  private void g()
  {
    this.y = new JPanel(new BorderLayout());
    this.w = new JPanel(new FlowLayout(2));
    this.z = new w(ct.a(116));
    this.z.addActionListener(new e(this));
    this.A = new w(ct.a(117));
    this.A.addActionListener(new f(this));
    this.w.add(this.z);
    this.w.add(this.A);
    com.zend.ide.p.e.d.b(new JButton[] { this.z, this.A });
    this.y.add(this.w, "Center");
  }

  public q b()
  {
    com.zend.ide.w.c.f localf = new com.zend.ide.w.c.f(4);
    localf.a(this.e.isSelected());
    localf.c(this.f.isSelected());
    localf.f(this.i.getText());
    localf.c(this.g.getText());
    localf.d(this.h.getText());
    localf.a(h());
    localf.g(this.k.getText());
    localf.h(new String(this.l.getPassword()));
    return localf;
  }

  public void a(q paramq)
  {
    if (!(paramq instanceof com.zend.ide.w.c.f))
      throw new IllegalArgumentException("Command arguments are not SVN arguments!");
    com.zend.ide.w.c.f localf = (com.zend.ide.w.c.f)paramq;
    this.e.setSelected(localf.b());
    this.f.setSelected(localf.d());
    this.i.setText(localf.n());
    this.g.setText(localf.k());
    this.h.setText(localf.l());
    a(localf.o());
    this.k.setText(localf.p());
    this.l.setText(localf.q());
  }

  private File h()
  {
    return new File(this.j.getText());
  }

  public void a(File paramFile)
  {
    this.j.setText(paramFile.getPath());
  }

  private void a(JTextField paramJTextField)
  {
    paramJTextField.getDocument().addDocumentListener(new g(this));
  }

  private boolean i()
  {
    return (!this.i.getText().equals("")) && (!this.j.getText().equals(""));
  }

  private boolean j()
  {
    return (!this.i.getText().equals("")) && (k());
  }

  private boolean k()
  {
    String str = this.j.getText();
    if (str.equals(""))
      return false;
    File localFile = h.m.g(str);
    if (!localFile.exists())
    {
      int i1 = ba.b(this, ct.a(885, str), ct.a(606), 0);
      if (i1 == 1)
        return false;
    }
    return true;
  }

  public void a(boolean paramBoolean)
  {
  }

  static bp a(hb paramhb)
  {
    return paramhb.C;
  }

  static bp a(hb paramhb, bp parambp)
  {
    return paramhb.C = parambp;
  }

  static JTextField b(hb paramhb)
  {
    return paramhb.j;
  }

  static void a(hb paramhb, int paramInt)
  {
    paramhb.a(paramInt);
  }

  static boolean c(hb paramhb)
  {
    return paramhb.i();
  }

  static w d(hb paramhb)
  {
    return paramhb.z;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.hb
 * JD-Core Version:    0.6.0
 */