package com.zend.ide.hb;

import com.zend.ide.bc.a;
import com.zend.ide.i.n;
import com.zend.ide.p.db;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ComboBoxEditor;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.text.Document;

public class qb extends n
  implements cu
{
  private JPanel b;
  private JPanel c;
  private JPanel d;
  private db e = null;
  private db f = null;
  private z g = null;
  private z h = null;
  private x i = null;
  private x j = null;
  private x k = null;
  private x l = null;
  private x m = null;
  private x n = null;
  private w o = null;
  private w p = null;
  private w q = null;
  private w r = null;
  private ac s = new ac(this, 0);
  private ac t = new ac(this, 1);
  private ac u = new ac(this, 2);
  private ac v = new ac(this, 3);
  private zb w = new zb(this);
  private String x = "EnterAction";
  private yb y;
  private String z = "CancelAction";
  private int A = -1;
  private p B;

  public qb(Frame paramFrame)
  {
    super(paramFrame, true);
    g();
    a.a(this, "FIND_REPLACE");
  }

  public void a(p paramp)
  {
    this.B = paramp;
  }

  public void a(e parame)
  {
    this.i.setSelected(parame.b);
    this.j.setSelected(parame.c);
    this.k.setSelected(parame.d);
    this.l.setSelected(!parame.e);
    this.m.setSelected(parame.f);
    this.n.setSelected(parame.g);
    this.e.a(parame.a);
  }

  public e a()
  {
    e locale = new e();
    locale.b = this.i.isSelected();
    locale.c = this.j.isSelected();
    locale.d = this.k.isSelected();
    locale.e = (!this.l.isSelected());
    locale.f = this.m.isSelected();
    locale.a = b();
    locale.g = this.n.isSelected();
    return locale;
  }

  private String b()
  {
    return (String)this.e.getEditor().getItem();
  }

  public String c()
  {
    return (String)this.f.getEditor().getItem();
  }

  public void a(boolean paramBoolean)
  {
    this.q.setEnabled(paramBoolean);
  }

  private void d()
  {
    this.c = new JPanel();
    this.c.setLayout(new FlowLayout(2));
    this.o = new w();
    this.o.addActionListener(this.w);
    this.o.setText(ct.b(262));
    this.o.setIcon(cv.b("find16.gif"));
    this.c.add(this.o);
    this.o.setEnabled(false);
    this.q = new w(ct.b(268));
    this.q.addActionListener(this.t);
    this.q.setIcon(cv.b("replace16.gif"));
    this.c.add(this.q);
    this.r = new w(ct.b(269));
    this.r.addActionListener(this.u);
    this.c.add(this.r);
    this.p = new w();
    this.y = new yb(this);
    this.p.setAction(this.y);
    this.p.setText(ct.b(117));
    this.c.add(this.p);
  }

  private void e()
  {
    this.b = new JPanel();
    this.b.setLayout(new BorderLayout(10, 0));
    this.b.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
    Box localBox1 = new Box(1);
    localBox1.add(Box.createVerticalStrut(5));
    this.e = new db();
    a.a(this.e, "FIND_REPLACE");
    this.e.setEditable(true);
    this.f = new db();
    a.a(this.f, "FIND_REPLACE");
    this.f.setEditable(true);
    ((JTextField)this.e.getEditor().getEditorComponent()).getDocument().addDocumentListener(new o(this));
    this.g = new z();
    this.g.setLabelFor(this.e);
    this.g.setText(ct.b(266));
    localBox1.add(this.g);
    localBox1.add(Box.createVerticalStrut(10));
    this.h = new z();
    this.h.setLabelFor(this.f);
    this.h.setText(ct.b(267));
    localBox1.add(this.h);
    this.b.add(localBox1, "West");
    Box localBox2 = new Box(1);
    localBox2.add(this.e);
    localBox2.add(Box.createVerticalStrut(5));
    localBox2.add(this.f);
    this.b.add(localBox2, "Center");
    c localc = new c(this);
    addWindowListener(localc);
    addWindowFocusListener(localc);
    this.e.setPreferredSize(this.e.getPreferredSize());
    this.f.setPreferredSize(this.f.getPreferredSize());
  }

  private void f()
  {
    this.d = new JPanel();
    this.d.setLayout(new GridBagLayout());
    this.d.setBorder(BorderFactory.createTitledBorder(ct.a(562)));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.anchor = 17;
    localGridBagConstraints.insets = new Insets(0, 5, 5, 40);
    this.i = new x(ct.b(263));
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    this.d.add(this.i, localGridBagConstraints);
    this.j = new x(ct.b(264));
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    this.d.add(this.j, localGridBagConstraints);
    this.k = new x(ct.b(265));
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 2;
    this.d.add(this.k, localGridBagConstraints);
    this.l = new x(ct.b(521));
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 0;
    this.d.add(this.l, localGridBagConstraints);
    this.m = new x(ct.b(522));
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 1;
    this.d.add(this.m, localGridBagConstraints);
    this.n = new x(ct.b(524));
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 2;
    this.d.add(this.n, localGridBagConstraints);
  }

  private void g()
  {
    d();
    e();
    f();
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(this.b, "North");
    getContentPane().add(this.d, "Center");
    getContentPane().add(this.c, "South");
    h();
  }

  private void h()
  {
    JComponent localJComponent1 = (JComponent)getContentPane();
    ActionMap localActionMap = localJComponent1.getActionMap();
    InputMap localInputMap = localJComponent1.getInputMap(1);
    localActionMap.put(this.z, this.y);
    localInputMap.put(KeyStroke.getKeyStroke(27, 0), this.z);
    localActionMap.put(this.x, this.w);
    localInputMap.put(KeyStroke.getKeyStroke(10, 0), this.x);
    JComponent localJComponent2 = (JComponent)this.e.getEditor().getEditorComponent();
    localJComponent2.getInputMap().put(KeyStroke.getKeyStroke(10, 0), this.x);
    localJComponent2.getActionMap().put(this.x, this.w);
  }

  public void a(int paramInt)
  {
    if (this.A != paramInt)
    {
      this.A = paramInt;
      i();
    }
    pack();
  }

  private void i()
  {
    boolean bool;
    int i1;
    if (this.A == 0)
    {
      bool = false;
      i1 = 262;
    }
    else
    {
      bool = true;
      i1 = 270;
    }
    this.q.setVisible(bool);
    this.r.setVisible(bool);
    this.h.setVisible(bool);
    this.f.setVisible(bool);
    String str = ct.a(i1);
    setTitle(str);
  }

  public void j()
  {
    this.e.grabFocus();
  }

  static String a(qb paramqb)
  {
    return paramqb.b();
  }

  static w b(qb paramqb)
  {
    return paramqb.o;
  }

  static p c(qb paramqb)
  {
    return paramqb.B;
  }

  static db d(qb paramqb)
  {
    return paramqb.e;
  }

  static int e(qb paramqb)
  {
    return paramqb.A;
  }

  static db f(qb paramqb)
  {
    return paramqb.f;
  }

  static String g(qb paramqb)
  {
    return paramqb.x;
  }

  static ac h(qb paramqb)
  {
    return paramqb.s;
  }

  static ac i(qb paramqb)
  {
    return paramqb.v;
  }

  static String j(qb paramqb)
  {
    return paramqb.z;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.qb
 * JD-Core Version:    0.6.0
 */