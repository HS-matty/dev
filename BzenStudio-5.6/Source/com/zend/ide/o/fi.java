package com.zend.ide.o;

import com.zend.ide.i.n;
import com.zend.ide.p.cd;
import com.zend.ide.p.w;
import com.zend.ide.p.z;
import com.zend.ide.util.c.f;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.en;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

public class fi extends n
  implements cu
{
  private f c;
  private h d;
  boolean e;
  boolean x;
  private JPanel f;
  private z g;
  private z h;
  private w i;
  private w j;
  private JTextArea k;
  private JTextArea l;
  private JScrollPane m;
  private en n;
  private JPanel o;
  private JPanel p;
  private JPanel q;
  private ff r;
  private String s;
  private String t;
  private final String u = ct.a(419);
  private final String v = ct.a(420);
  private boolean w = true;

  public fi(JFrame paramJFrame, f paramf)
  {
    super(paramJFrame);
    this.c = paramf;
    this.d = new h(this, null);
    c();
  }

  private void c()
  {
    setResizable(false);
    setTitle(ct.a(411));
    this.o = new JPanel();
    this.p = new JPanel();
    this.q = new JPanel();
    this.r = new ff(this, null);
    Dimension localDimension = new Dimension(64, 64);
    this.r.setMinimumSize(localDimension);
    this.r.setPreferredSize(localDimension);
    this.g = new z();
    this.g.setBackground(Color.yellow);
    this.h = new z(ct.a(752));
    this.f = new JPanel(new GridLayout(2, 1));
    this.f.add(this.g);
    this.f.add(this.h);
    this.i = new w(ct.b(412));
    this.i.addActionListener(new be(this));
    this.j = new w(ct.b(413));
    this.j.addActionListener(new bf(this));
    this.q.setLayout(new GridLayout(2, 1));
    this.q.add(this.i);
    this.q.add(this.j);
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    this.o.setLayout(new GridBagLayout());
    localGridBagConstraints.insets = new Insets(5, 5, 3, 3);
    localGridBagConstraints.anchor = 17;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.fill = 1;
    this.o.add(this.r, localGridBagConstraints);
    localGridBagConstraints.anchor = 10;
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.weightx = 3.0D;
    this.o.add(this.f, localGridBagConstraints);
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.weightx = 0.0D;
    this.o.add(this.q, localGridBagConstraints);
    this.l = new JTextArea(ct.a(414) + "\n" + ct.a(1566));
    this.l.setWrapStyleWord(true);
    this.l.setEditable(false);
    this.m = new cd(this.l);
    this.m.setPreferredSize(new Dimension(380, 160));
    this.k = new JTextArea("");
    this.k.setLineWrap(true);
    this.k.setWrapStyleWord(true);
    this.k.setEditable(false);
    this.k.setBorder(new MetalBorders.TextFieldBorder());
    this.k.setPreferredSize(new Dimension(380, 160));
    this.n = new en();
    this.n.setTabPlacement(3);
    this.n.addTab(ct.a(415), this.m);
    this.n.addTab(ct.a(416), this.k);
    this.p.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.gray));
    this.p.add(this.n, "Center");
    getContentPane().add(this.o, "North");
    getContentPane().add(this.p, "Center");
    setSize(410, 300);
    addKeyListener(new e(this));
  }

  public void a(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }

  public void setVisible(boolean paramBoolean)
  {
    if (!paramBoolean)
      removeWindowListener(this.d);
    super.setVisible(paramBoolean);
  }

  public void h()
  {
    removeWindowListener(this.d);
    addWindowListener(this.d);
    this.g.setText(this.t);
    this.k.setText("");
    this.n.setSelectedComponent(this.m);
    B();
    this.e = this.x;
    this.h.setText(ct.a(752));
    setVisible(true);
  }

  private void e()
  {
    if (this.w)
    {
      remove(this.p);
      this.j.setText(ct.a(417));
      setSize(400, 100);
      this.w = false;
    }
    else
    {
      getContentPane().add(this.p, "Center");
      this.j.setText(ct.a(413));
      setSize(400, 300);
      this.w = true;
    }
    doLayout();
    repaint();
  }

  public void a(String paramString)
  {
    this.s = paramString;
    this.t = ct.a(418, this.s);
    for (int i1 = this.g.getFontMetrics(this.g.getFont()).stringWidth(this.t); i1 > 200; i1 = this.g.getFontMetrics(this.g.getFont()).stringWidth(this.t))
    {
      int i2 = this.t.length();
      this.t = this.t.substring(0, i2 - 5);
    }
    if (!this.t.endsWith("..."))
      this.t += "...";
    setSize(400, getHeight());
    doLayout();
    repaint();
  }

  public void b(String paramString)
  {
    this.g.setText(this.u);
    this.k.setText(paramString);
    this.c.d();
    g();
    this.n.setSelectedComponent(this.k);
  }

  public void f()
  {
    this.g.setText(this.u);
    this.k.setText(this.v);
    g();
    this.n.setSelectedComponent(this.k);
  }

  private void g()
  {
    this.h.setText("");
    this.h.revalidate();
    this.h.repaint();
  }

  static void a(fi paramfi)
  {
    paramfi.e();
  }

  static ff b(fi paramfi)
  {
    return paramfi.r;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.fi
 * JD-Core Version:    0.6.0
 */