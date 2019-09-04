package com.zend.ide.w.a;

import com.zend.ide.j.h;
import com.zend.ide.p.ba;
import com.zend.ide.p.d.bp;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class br extends ab
{
  private x f;
  private x g;
  private x h;
  private JTextField i;
  private JTextField j;
  private JTextField k;
  private JTextField l;
  private JTextField m;
  private JTextField n;
  private JLabel o;
  private JLabel p;
  private JLabel q;
  private JLabel r;
  private JLabel s;
  private JLabel t;
  private JPanel u;
  private JPanel v;
  private JPanel w;
  private JPanel x;
  private JPanel y;
  private JPanel z;
  private JPanel A;
  private w B;
  private w C;
  private w D;
  private bp E;
  private File F;

  public br(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(603));
    g();
  }

  private void g()
  {
    h();
    k();
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(this.z, "Center");
    getContentPane().add(this.A, "South");
    setModal(true);
    setResizable(false);
    pack();
  }

  private void h()
  {
    j();
    i();
    this.z = new JPanel(new GridBagLayout());
    this.z.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEtchedBorder()));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.anchor = 17;
    localGridBagConstraints.insets = new Insets(5, 5, 2, 2);
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    this.z.add(this.x, localGridBagConstraints);
    localGridBagConstraints.gridy = 1;
    this.z.add(this.u, localGridBagConstraints);
  }

  private void i()
  {
    this.f = new x(ct.a(574));
    this.g = new x(ct.a(576));
    this.h = new x(ct.a(577));
    Box localBox = new Box(1);
    localBox.add(this.f);
    localBox.add(Box.createVerticalStrut(10));
    localBox.add(this.g);
    localBox.add(Box.createVerticalStrut(10));
    localBox.add(this.h);
    localBox.add(Box.createVerticalStrut(30));
    this.v = new JPanel(new BorderLayout());
    this.v.add(localBox, "Center");
    this.i = new JTextField();
    this.j = new JTextField();
    this.k = new JTextField();
    this.o = new JLabel(ct.a(580));
    this.o.setLabelFor(this.i);
    this.p = new JLabel(ct.a(581));
    this.p.setLabelFor(this.j);
    this.q = new JLabel(ct.a(582));
    this.q.setLabelFor(this.k);
    this.w = new JPanel(new GridLayout(6, 1));
    this.w.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.gray), BorderFactory.createEmptyBorder(0, 5, 0, 5)));
    this.w.add(this.o);
    this.w.add(this.i);
    this.w.add(this.p);
    this.w.add(this.j);
    this.w.add(this.q);
    this.w.add(this.k);
    this.u = new JPanel();
    this.u.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5), BorderFactory.createTitledBorder(ct.a(1585))));
    this.u.add(this.v);
    this.u.add(this.w);
  }

  private void j()
  {
    this.l = new JTextField();
    this.m = new JTextField();
    this.n = new JTextField();
    this.D = new w("...");
    this.D.setPreferredSize(new Dimension(30, 10));
    this.D.addActionListener(new i(this));
    this.r = new JLabel(ct.a(604));
    this.r.setLabelFor(this.l);
    this.s = new JLabel(ct.a(605));
    this.s.setLabelFor(this.m);
    this.t = new JLabel(ct.a(606));
    this.t.setLabelFor(this.n);
    this.x = new JPanel(new GridLayout(6, 1));
    this.x.add(this.r);
    this.x.add(this.l);
    this.x.add(this.s);
    this.x.add(this.m);
    this.x.add(this.t);
    Box localBox = new Box(0);
    localBox.add(this.n);
    localBox.add(this.D);
    this.x.add(localBox);
  }

  protected void e()
  {
    if (!m())
      return;
    a(1);
    dispose();
  }

  private void k()
  {
    this.A = new JPanel(new BorderLayout());
    this.y = new JPanel(new FlowLayout(2));
    this.B = new w(ct.a(116));
    this.B.addActionListener(new j(this));
    this.C = new w(ct.a(117));
    this.C.addActionListener(new k(this));
    this.y.add(this.B);
    this.y.add(this.C);
    this.A.add(this.y, "Center");
  }

  public q b()
  {
    l locall = new l(4);
    locall.c(this.f.isSelected());
    locall.e(this.h.isSelected());
    locall.a(this.g.isSelected());
    locall.f(this.l.getText());
    locall.g(this.m.getText());
    locall.b(this.i.getText());
    locall.c(this.j.getText());
    locall.d(this.k.getText());
    locall.a(l());
    return locall;
  }

  public void a(q paramq)
  {
    if (!(paramq instanceof l))
      throw new IllegalArgumentException("Command arguments are not CVS arguments!");
    l locall = (l)paramq;
    if (locall == null)
      return;
    this.f.setSelected(locall.d());
    this.h.setSelected(locall.f());
    this.g.setSelected(locall.b());
    this.l.setText(locall.m());
    this.m.setText(locall.n());
    this.i.setText(locall.j());
    this.j.setText(locall.k());
    this.k.setText(locall.l());
    a(locall.o());
  }

  private File l()
  {
    return new File(this.n.getText());
  }

  public void a(File paramFile)
  {
    this.F = paramFile;
    this.n.setText(paramFile.getPath());
  }

  private boolean m()
  {
    return (!this.l.getText().equals("")) && (!this.m.getText().equals("")) && (n()) && (o());
  }

  private boolean o()
  {
    String str = this.l.getText();
    if (str.equals(""))
      return false;
    if (!cb.a(str))
    {
      ba.a(this, ct.a(1298, str), ct.a(1236), 0);
      return false;
    }
    return true;
  }

  private boolean n()
  {
    String str = this.n.getText();
    if (str.equals(""))
      return false;
    File localFile = h.m.g(str);
    if (!localFile.exists())
    {
      int i1 = ba.b(this, ct.a(885, str), ct.a(606), 0);
      if (i1 != 0)
        return false;
    }
    return true;
  }

  public void a(boolean paramBoolean)
  {
  }

  static bp a(br parambr)
  {
    return parambr.E;
  }

  static bp a(br parambr, bp parambp)
  {
    return parambr.E = parambp;
  }

  static JTextField b(br parambr)
  {
    return parambr.n;
  }

  static File a(br parambr, File paramFile)
  {
    return parambr.F = paramFile;
  }

  static void a(br parambr, int paramInt)
  {
    parambr.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.br
 * JD-Core Version:    0.6.0
 */