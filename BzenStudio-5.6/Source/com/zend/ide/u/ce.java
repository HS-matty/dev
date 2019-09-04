package com.zend.ide.u;

import com.zend.ide.i.n;
import com.zend.ide.j.h;
import com.zend.ide.j.s;
import com.zend.ide.p.a.c;
import com.zend.ide.p.ba;
import com.zend.ide.p.bb;
import com.zend.ide.p.cc;
import com.zend.ide.p.e.b;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.ds;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.List;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.text.Document;

public class ce extends n
  implements cu
{
  private bh c;
  private boolean d = true;
  private JTextField J;
  private JTextField e;
  private JTextField f;
  private JTextField h;
  private JTextField i;
  private JTextField p;
  private JPasswordField m;
  private z g;
  private z b;
  private JButton j;
  private JButton k;
  private com.zend.ide.p.x l;
  private com.zend.ide.p.x r;
  private com.zend.ide.p.x q;
  private com.zend.ide.p.x s;
  private bb n;
  private bb v;
  private cc y;
  private cc I;
  private cc w;
  private JPanel G;
  private JPanel z;
  private JPanel B;
  private JPanel o;
  private JPanel x;
  private bw t;
  private boolean u = false;

  private ce(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(188), true);
    p();
    s();
    o();
    pack();
    B();
    setResizable(false);
  }

  public ce(JFrame paramJFrame, bh parambh, boolean paramBoolean)
  {
    this(paramJFrame);
    this.d = paramBoolean;
    a(parambh);
  }

  public void a(bh parambh)
  {
    this.c = parambh;
    f(parambh.a());
    a(parambh.l(), false);
    a(parambh.m());
    b(parambh.n());
    c(parambh.k());
    a(parambh.o());
    b(parambh.q());
    a(parambh.p());
    b(parambh.r());
    c(parambh.s());
    d(parambh.t());
    c(parambh.a());
    d(parambh.b());
    this.J.setEnabled(this.d);
    this.e.setEnabled(this.d);
    this.p.setEnabled(this.d);
    this.h.setEnabled(this.d);
    this.w.setEnabled(this.d);
    this.I.setEnabled(this.d);
    this.y.setEnabled(this.d);
    this.n.setEnabled(this.d);
    this.v.setEnabled(this.d);
  }

  public String c()
  {
    String str = this.e.getText();
    if (str != null)
      str = str.trim();
    return str;
  }

  public void a(String paramString, boolean paramBoolean)
  {
    this.e.setText(paramString);
    if (paramBoolean)
      this.e.selectAll();
  }

  public String a()
  {
    return this.J.getText().trim();
  }

  public void f(String paramString)
  {
    if ((paramString != null) && (paramString.endsWith(":")))
      paramString = paramString.substring(0, paramString.indexOf(":"));
    this.J.setText(paramString);
  }

  public String e()
  {
    return this.f.getText().trim();
  }

  public void a(String paramString)
  {
    this.f.setText(paramString);
  }

  public String f()
  {
    return String.valueOf(this.m.getPassword());
  }

  public void b(String paramString)
  {
    this.m.setText(paramString);
  }

  public String g()
  {
    return this.p.getText();
  }

  public void c(String paramString)
  {
    this.p.setText(paramString);
  }

  public int h()
  {
    int i1 = -1;
    try
    {
      Integer localInteger = Integer.valueOf(this.h.getText());
      i1 = localInteger.intValue();
    }
    catch (Exception localException)
    {
    }
    return i1;
  }

  public void a(int paramInt)
  {
    this.h.setText(Integer.toString(paramInt));
  }

  public int i()
  {
    int i1 = -1;
    try
    {
      String str = this.i.getText();
      if (str.equals(""))
        str = "20";
      Integer localInteger = Integer.valueOf(str);
      i1 = localInteger.intValue();
    }
    catch (Exception localException)
    {
    }
    return i1;
  }

  public void b(int paramInt)
  {
    this.i.setText(Integer.toString(paramInt));
  }

  public boolean j()
  {
    return this.l.isSelected();
  }

  public int a()
  {
    if (this.I.isSelected())
      return 1;
    if (this.w.isSelected())
      return 2;
    return 0;
  }

  public void c(int paramInt)
  {
    switch (paramInt)
    {
    case 1:
      this.I.setSelected(true);
      break;
    case 2:
      this.w.setSelected(true);
      break;
    default:
      this.y.setSelected(true);
    }
    a();
  }

  public int b()
  {
    if (this.v.isSelected())
      return 4;
    return 3;
  }

  public void d(int paramInt)
  {
    this.v.setSelected(paramInt == 4);
    this.n.setSelected(paramInt != 4);
  }

  public void a(boolean paramBoolean)
  {
    this.l.setSelected(paramBoolean);
  }

  public void b(boolean paramBoolean)
  {
    this.q.setSelected(paramBoolean);
    this.r.setEnabled(paramBoolean);
  }

  public boolean k()
  {
    return this.q.isSelected();
  }

  public void c(boolean paramBoolean)
  {
    this.r.setSelected(paramBoolean);
  }

  public boolean l()
  {
    return this.r.isSelected();
  }

  public void d(boolean paramBoolean)
  {
    this.s.setSelected(paramBoolean);
    c();
  }

  public boolean m()
  {
    return this.s.isSelected();
  }

  public boolean n()
  {
    return this.u;
  }

  private void o()
  {
    JRootPane localJRootPane = getRootPane();
    ActionMap localActionMap = localJRootPane.getActionMap();
    KeyStroke localKeyStroke1 = KeyStroke.getKeyStroke(10, 0);
    KeyStroke localKeyStroke2 = KeyStroke.getKeyStroke(27, 0);
    String str1 = "enterKey";
    String str2 = "ecapeKey";
    localActionMap.put(str1, this.t);
    localActionMap.put(str2, new ds());
    InputMap localInputMap = localJRootPane.getInputMap(1);
    localInputMap.put(localKeyStroke1, str1);
    localInputMap.put(localKeyStroke2, str2);
    localInputMap = localJRootPane.getInputMap(0);
    localInputMap.put(localKeyStroke1, str1);
    localInputMap.put(localKeyStroke2, str2);
    localInputMap = localJRootPane.getInputMap(2);
    localInputMap.put(localKeyStroke1, str1);
    localInputMap.put(localKeyStroke2, str2);
  }

  private void a()
  {
    int i1 = a();
    d();
    if (this.d)
    {
      if (i1 == 1)
      {
        this.h.setText("22");
        this.s.setSelected(false);
      }
      else if ((i1 == 2) && (this.n.isSelected()))
      {
        this.h.setText("990");
      }
      else
      {
        this.h.setText("21");
      }
      this.l.setSelected(i1 != 1);
      d(3);
    }
    this.s.setEnabled(a() != 1);
    if (i1 == 1)
      c();
    this.G.revalidate();
    repaint();
  }

  private void d()
  {
    e(a());
  }

  private void e(int paramInt)
  {
    int i1 = 0;
    this.x.removeAll();
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.insets = new Insets(1, 3, 1, 3);
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.ipadx = 15;
    if (paramInt == 2)
    {
      localGridBagConstraints.gridx = 0;
      localGridBagConstraints.gridy = (i1++);
      localGridBagConstraints.anchor = 17;
      this.x.add(this.n, localGridBagConstraints);
      localGridBagConstraints.gridx = 0;
      localGridBagConstraints.gridy = (i1++);
      localGridBagConstraints.anchor = 17;
      this.x.add(this.v, localGridBagConstraints);
    }
    if (paramInt != 1)
    {
      localGridBagConstraints.gridx = 0;
      localGridBagConstraints.gridy = (i1++);
      localGridBagConstraints.anchor = 17;
      this.x.add(this.l, localGridBagConstraints);
    }
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = i1;
    localGridBagConstraints.anchor = 17;
    JPanel localJPanel1 = new JPanel();
    localJPanel1.setLayout(new FlowLayout(0));
    localJPanel1.add(this.b);
    this.x.add(localJPanel1, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = (i1++);
    localGridBagConstraints.anchor = 18;
    localGridBagConstraints.weightx = 1.0D;
    this.x.add(this.i, localGridBagConstraints);
    localGridBagConstraints.weightx = 0.0D;
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = i1;
    localGridBagConstraints.anchor = 17;
    JPanel localJPanel2 = new JPanel();
    localJPanel2.setLayout(new FlowLayout(0));
    localJPanel2.add(this.g);
    this.x.add(localJPanel2, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = (i1++);
    localGridBagConstraints.anchor = 18;
    localGridBagConstraints.weightx = 1.0D;
    this.x.add(this.h, localGridBagConstraints);
    localGridBagConstraints.weightx = 0.0D;
    if (paramInt != 2)
    {
      localGridBagConstraints.gridx = 0;
      localGridBagConstraints.gridy = (i1++);
      localGridBagConstraints.weighty = (5.0D - i1);
      localGridBagConstraints.anchor = 17;
      this.x.add(new JLabel(), localGridBagConstraints);
    }
  }

  private void z()
  {
    z localz1 = new z();
    z localz2 = new z();
    z localz3 = new z();
    z localz4 = new z();
    this.e = new JTextField();
    this.f = new JTextField();
    this.m = new JPasswordField();
    this.p = new JTextField();
    this.s = new com.zend.ide.p.x();
    this.z = new JPanel();
    this.z.setLayout(new GridBagLayout());
    this.z.setBorder(BorderFactory.createTitledBorder(ct.a(1711)));
    a(this.e);
    a(this.f);
    a(this.m);
    localz1.setLabelFor(this.e);
    localz1.setText(ct.b(1234));
    localz2.setLabelFor(this.f);
    localz2.setText(ct.b(190));
    localz3.setLabelFor(this.m);
    localz3.setText(ct.b(191));
    this.s.setText(ct.b(436));
    localz4.setLabelFor(this.p);
    localz4.setText(ct.b(192));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.insets = new Insets(3, 3, 3, 3);
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.anchor = 17;
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    this.z.add(localz1, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.anchor = 18;
    this.z.add(this.e, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 1;
    this.z.add(this.s, localGridBagConstraints);
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 2;
    localGridBagConstraints.anchor = 17;
    this.z.add(localz2, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 2;
    localGridBagConstraints.anchor = 18;
    this.z.add(this.f, localGridBagConstraints);
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 3;
    localGridBagConstraints.anchor = 17;
    this.z.add(localz3, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 3;
    localGridBagConstraints.anchor = 18;
    this.z.add(this.m, localGridBagConstraints);
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 4;
    localGridBagConstraints.anchor = 17;
    this.z.add(localz4, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 4;
    localGridBagConstraints.anchor = 18;
    this.z.add(this.p, localGridBagConstraints);
  }

  private void C()
  {
    this.q = new com.zend.ide.p.x();
    this.q.setText(ct.b(1193));
    this.r = new com.zend.ide.p.x();
    this.r.setText(ct.b(197));
    this.B = new JPanel(new GridLayout(1, 2));
    this.B.setBorder(BorderFactory.createTitledBorder(ct.a(1194)));
    this.B.add(this.q);
    this.B.add(this.r);
  }

  private void e()
  {
    this.n = new bb(ct.b(1712));
    this.n.addActionListener(new a(this));
    this.v = new bb(ct.b(1713));
    this.v.addActionListener(new bj(this));
    ButtonGroup localButtonGroup = new ButtonGroup();
    localButtonGroup.add(this.n);
    localButtonGroup.add(this.v);
    this.l = new com.zend.ide.p.x();
    this.l.setText(ct.b(195));
    this.b = new z();
    this.i = new JTextField();
    this.r = new com.zend.ide.p.x();
    this.r.setText(ct.b(197));
    this.b.setLabelFor(this.i);
    this.b.setText(ct.b(194));
    this.i.setDocument(new com.zend.ide.p.a.d(7));
    this.i.setColumns(5);
    this.i.setText("30");
    this.g = new z();
    this.h = new JTextField();
    this.g.setLabelFor(this.h);
    this.g.setText(ct.b(193));
    this.g.setPreferredSize(this.b.getPreferredSize());
    this.h.setDocument(new com.zend.ide.p.a.d(7));
    this.h.setColumns(5);
    this.h.setText("21");
    this.x = new JPanel();
    this.x.setLayout(new GridBagLayout());
    this.x.setBorder(BorderFactory.createTitledBorder(ct.a(1714)));
    e(0);
  }

  private void D()
  {
    this.j = new JButton();
    this.k = new JButton();
    this.t = new bw(this);
    this.o = new JPanel();
    this.o.setLayout(new FlowLayout(2));
    this.j.setText(ct.a(116));
    this.j.setEnabled(false);
    this.k.setText(ct.a(117));
    this.o.add(this.j);
    this.o.add(this.k);
    JButton localJButton = new JButton(ct.a(639));
    localJButton.setPreferredSize(b.d);
    localJButton.addActionListener(new bk(this));
    this.o.add(localJButton);
    Dimension localDimension = com.zend.ide.p.e.d.a(new JButton[] { this.j, this.k, localJButton });
    this.j.setPreferredSize(localDimension);
    this.j.setMaximumSize(localDimension);
    this.j.setMinimumSize(localDimension);
    this.k.setPreferredSize(localDimension);
    this.k.setMaximumSize(localDimension);
    this.k.setMinimumSize(localDimension);
    localJButton.setPreferredSize(localDimension);
    localJButton.setMaximumSize(localDimension);
    localJButton.setMinimumSize(localDimension);
  }

  private void p()
  {
    z();
    e();
    C();
    D();
    this.J = new JTextField();
    this.J.setDocument(new c());
    a(this.J);
    JPanel localJPanel1 = new JPanel(new BorderLayout(2, 2));
    localJPanel1.add(this.J, "Center");
    localJPanel1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(' ' + ct.a(1584) + ' '), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    this.y = new cc(ct.b(1223));
    this.y.addActionListener(new bl(this));
    this.I = new cc(ct.b(1188));
    this.I.addActionListener(new bm(this));
    this.w = new cc(ct.b(1715));
    this.w.addActionListener(new r(this));
    ButtonGroup localButtonGroup = new ButtonGroup();
    localButtonGroup.add(this.y);
    localButtonGroup.add(this.I);
    localButtonGroup.add(this.w);
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    JPanel localJPanel3 = new JPanel();
    localJPanel3.setLayout(new FlowLayout(1));
    localJPanel3.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(ct.a(1254)), BorderFactory.createEmptyBorder(0, 0, 5, 0)));
    localJPanel3.add(this.y);
    localJPanel3.add(this.I);
    localJPanel3.add(this.w);
    this.y.setSelected(true);
    localJPanel2.add(localJPanel1, "North");
    localJPanel2.add(localJPanel3, "Center");
    this.G = new JPanel(new GridLayout(1, 2));
    this.G.add(this.z);
    this.G.add(this.x);
    JPanel localJPanel4 = new JPanel(new BorderLayout(5, 5));
    localJPanel4.add(localJPanel2, "North");
    localJPanel4.add(this.G, "Center");
    localJPanel4.add(this.B, "South");
    localJPanel4.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    getContentPane().setLayout(new BorderLayout(0, 0));
    getContentPane().add(localJPanel4, "Center");
    getContentPane().add(this.o, "South");
    addWindowListener(new x(this));
  }

  private void a(JTextField paramJTextField)
  {
    paramJTextField.getDocument().addDocumentListener(new y(this));
  }

  private void q()
  {
    if (!this.q.isSelected())
    {
      this.r.setSelected(false);
      this.r.setEnabled(false);
    }
    else
    {
      this.r.setEnabled(true);
    }
    if (b())
      this.j.setEnabled(true);
    else
      this.j.setEnabled(false);
  }

  private boolean b()
  {
    return (!a().equals("")) && (!c().equals("")) && ((this.s.isSelected()) || ((!this.f.getText().equals("")) && (this.m.getPassword().length > 0)));
  }

  private void r()
  {
    cm localcm = new cm();
    localcm.h(a());
    localcm.a(c());
    localcm.b(e());
    localcm.c(f());
    localcm.d(g());
    localcm.a(i());
    localcm.a(j());
    localcm.b(l());
    localcm.c(k());
    localcm.d(m());
    localcm.b(h());
    localcm.c(a());
    localcm.d(b());
    this.c.a(localcm);
  }

  private void s()
  {
    this.j.addActionListener(this.t);
    this.k.addActionListener(new ab(this));
    this.q.addActionListener(new jb(this));
    this.s.addActionListener(new kb(this));
  }

  private void c()
  {
    boolean bool = this.s.isSelected();
    if (bool)
    {
      this.f.setText("anonymous");
      this.m.setText("ZDEuser@");
      this.q.setSelected(true);
    }
    this.f.setEnabled(!bool);
    this.m.setEnabled(!bool);
    this.q.setEnabled(!bool);
  }

  private boolean t()
  {
    if ((this.J.getText().length() > 0) && (this.f.getText().length() > 0) && (this.e.getText().length() > 0) && (this.m.getPassword().length > 0))
    {
      List localList = h.m.a();
      if (this.J.isEnabled())
        for (int i1 = 0; i1 < localList.size(); i1++)
        {
          s locals = (s)localList.get(i1);
          if ((!(locals instanceof bh)) || (!((bh)locals).a().equals(a() + ":")))
            continue;
          ba.a(this, ct.a(1588, a()), ct.a(94), 0);
          this.J.grabFocus();
          return false;
        }
      return true;
    }
    return false;
  }

  static bb a(ce paramce)
  {
    return paramce.n;
  }

  static JTextField b(ce paramce)
  {
    return paramce.h;
  }

  static bb c(ce paramce)
  {
    return paramce.v;
  }

  static void d(ce paramce)
  {
    paramce.a();
  }

  static JTextField e(ce paramce)
  {
    return paramce.J;
  }

  static void f(ce paramce)
  {
    paramce.q();
  }

  static boolean a(ce paramce, boolean paramBoolean)
  {
    return paramce.u = paramBoolean;
  }

  static com.zend.ide.p.x h(ce paramce)
  {
    return paramce.q;
  }

  static com.zend.ide.p.x g(ce paramce)
  {
    return paramce.r;
  }

  static void i(ce paramce)
  {
    paramce.c();
  }

  static com.zend.ide.p.x j(ce paramce)
  {
    return paramce.s;
  }

  static JTextField k(ce paramce)
  {
    return paramce.f;
  }

  static JPasswordField l(ce paramce)
  {
    return paramce.m;
  }

  static boolean m(ce paramce)
  {
    return paramce.t();
  }

  static void n(ce paramce)
  {
    paramce.r();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.ce
 * JD-Core Version:    0.6.0
 */