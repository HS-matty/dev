package com.zend.ide.d;

import com.zend.ide.p.a.d;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.ck;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.a;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class rd extends JPanel
  implements a, cu, bn
{
  private JLabel a;
  private JTextField b;
  private JCheckBox c;
  private JCheckBox d;
  private JLabel e;
  private JRadioButton f;
  private JRadioButton g;
  private JRadioButton h;
  private ButtonGroup i;
  private JCheckBox j;
  private JCheckBox k;
  private JTextField l;
  private JCheckBox m;
  private JCheckBox n;
  private JCheckBox o;
  private JCheckBox p;
  private JCheckBox q;
  private JCheckBox r;
  private JCheckBox s;
  private JCheckBox t;
  private JCheckBox u;
  private JCheckBox v;
  private JCheckBox w;
  private JCheckBox x;
  private JLabel y;
  private JTextField z;
  private JCheckBox A;
  private JLabel B;
  private JCheckBox C;
  private JCheckBox D;
  private JCheckBox E;
  private JCheckBox F;
  private JCheckBox G;
  private JCheckBox H;
  private bb I;
  private String J = "propertyEditor";
  private bt K;

  public rd()
  {
    a();
    this.I = new nc(this, null);
    nc.a((nc)this.I);
    this.K = new bt(this);
    g();
  }

  private void a()
  {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    JPanel localJPanel1 = new JPanel();
    localJPanel1.setLayout(new GridLayout(1, 1));
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(b(), "Center");
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    localJPanel3.add(c(), "Center");
    JPanel localJPanel4 = new JPanel(new BorderLayout());
    localJPanel4.add(d(), "Center");
    JPanel localJPanel5 = new JPanel(new BorderLayout());
    localJPanel5.add(e(), "Center");
    JPanel localJPanel6 = new JPanel(new BorderLayout());
    localJPanel6.add(localJPanel2, "North");
    localJPanel6.add(localJPanel3, "Center");
    JPanel localJPanel7 = new JPanel(new BorderLayout());
    localJPanel7.add(localJPanel4, "North");
    localJPanel7.add(localJPanel5, "Center");
    localJPanel1.add(localJPanel6);
    localJPanel1.add(localJPanel7);
    add(localJPanel1, "Center");
  }

  private JPanel b()
  {
    JPanel localJPanel1 = new JPanel();
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1766)));
    BoxLayout localBoxLayout = new BoxLayout(localJPanel1, 1);
    localJPanel1.setAlignmentX(0.0F);
    localJPanel1.setLayout(localBoxLayout);
    this.a = new JLabel(ct.a(12));
    this.b = new cb(new d(100), "", 4);
    this.c = new JCheckBox(ct.a(13));
    this.d = new JCheckBox(ct.a(19));
    this.e = new JLabel(ct.a(657) + ":");
    this.f = new JRadioButton(ct.a(659));
    this.f.setActionCommand(ct.a(659));
    this.g = new JRadioButton(ct.a(660));
    this.g.setActionCommand(ct.a(660));
    this.h = new JRadioButton(ct.a(661));
    this.h.setActionCommand(ct.a(661));
    this.i = new ButtonGroup();
    this.i.add(this.f);
    this.i.add(this.g);
    this.i.add(this.h);
    this.j = new JCheckBox(ct.a(1701));
    this.k = new JCheckBox(ct.a(1767));
    this.l = new cb(new d(1000), "", 4);
    this.G = new JCheckBox(ct.a(500));
    this.H = new JCheckBox(ct.a(849));
    this.H.setBorder(BorderFactory.createEmptyBorder(4, 22, 4, 4));
    this.G.addActionListener(new vb(this));
    this.k.addActionListener(new wb(this));
    this.a.setAlignmentX(0.0F);
    this.b.setAlignmentX(0.0F);
    this.c.setAlignmentX(0.0F);
    this.d.setAlignmentX(0.0F);
    this.e.setAlignmentX(0.0F);
    this.f.setAlignmentX(0.0F);
    this.g.setAlignmentX(0.0F);
    this.h.setAlignmentX(0.0F);
    this.j.setAlignmentX(0.0F);
    this.k.setAlignmentX(0.0F);
    this.l.setAlignmentX(0.0F);
    this.G.setAlignmentX(0.0F);
    this.H.setAlignmentX(0.0F);
    JPanel localJPanel2 = new JPanel();
    localJPanel2.setMaximumSize(new Dimension(2147483647, this.b.getPreferredSize().height));
    localJPanel2.setAlignmentX(0.0F);
    localJPanel2.setLayout(new FlowLayout(0, 0, 0));
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
    localJPanel2.add(this.a);
    localJPanel2.add(this.b);
    JPanel localJPanel3 = new JPanel(new FlowLayout(0));
    localJPanel3.setMaximumSize(new Dimension(2147483647, this.b.getPreferredSize().height));
    localJPanel3.setAlignmentX(0.0F);
    localJPanel3.setLayout(new FlowLayout(0, 0, 0));
    localJPanel3.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    this.k.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    this.k.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
    localJPanel3.add(this.k);
    localJPanel3.add(this.l);
    localJPanel1.add(localJPanel2);
    localJPanel1.add(this.c);
    localJPanel1.add(this.d);
    localJPanel1.add(this.G);
    localJPanel1.add(this.H);
    localJPanel1.add(this.j);
    localJPanel1.add(localJPanel3);
    Border localBorder = BorderFactory.createEmptyBorder(4, 22, 4, 4);
    this.f.setBorder(localBorder);
    this.g.setBorder(localBorder);
    this.h.setBorder(localBorder);
    this.e.setBorder(BorderFactory.createEmptyBorder(5, 5, 0, 0));
    localJPanel1.add(this.e);
    localJPanel1.add(this.f);
    localJPanel1.add(this.g);
    localJPanel1.add(this.h);
    return localJPanel1;
  }

  private JPanel c()
  {
    JPanel localJPanel = new JPanel();
    localJPanel.setBorder(BorderFactory.createTitledBorder(ct.a(1768)));
    BoxLayout localBoxLayout = new BoxLayout(localJPanel, 1);
    localJPanel.setAlignmentX(0.0F);
    localJPanel.setLayout(localBoxLayout);
    this.m = new JCheckBox(ct.a(1008));
    this.n = new JCheckBox(ct.a(1693));
    this.o = new JCheckBox(ct.a(1695));
    this.p = new JCheckBox(ct.a(1694));
    this.q = new JCheckBox(ct.a(1696));
    this.r = new JCheckBox(ct.a(1717));
    this.s = new JCheckBox(ct.a(1700));
    localJPanel.add(this.m);
    localJPanel.add(this.n);
    localJPanel.add(this.o);
    localJPanel.add(this.p);
    localJPanel.add(this.q);
    localJPanel.add(this.r);
    localJPanel.add(this.s);
    return localJPanel;
  }

  private JPanel d()
  {
    JPanel localJPanel1 = new JPanel();
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1769)));
    localJPanel1.setAlignmentX(0.0F);
    BoxLayout localBoxLayout = new BoxLayout(localJPanel1, 1);
    localJPanel1.setAlignmentX(0.0F);
    localJPanel1.setLayout(localBoxLayout);
    this.t = new JCheckBox(ct.a(503));
    this.u = new JCheckBox(ct.a(541));
    this.v = new JCheckBox(ct.a(525));
    this.w = new JCheckBox(ct.a(554));
    this.x = new JCheckBox(ct.a(1005));
    this.y = new JLabel(ct.a(1133));
    this.z = new cb(new d(), "", 4);
    this.x.addActionListener(new xb(this));
    this.t.setAlignmentX(0.0F);
    this.u.setAlignmentX(0.0F);
    this.v.setAlignmentX(0.0F);
    this.w.setAlignmentX(0.0F);
    this.x.setAlignmentX(0.0F);
    this.z.setAlignmentX(0.0F);
    this.y.setAlignmentX(0.0F);
    JPanel localJPanel2 = new JPanel(new FlowLayout(0));
    localJPanel2.setMaximumSize(new Dimension(2147483647, this.z.getPreferredSize().height));
    localJPanel2.setAlignmentX(0.0F);
    localJPanel2.setLayout(new FlowLayout(0, 0, 0));
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(0, 22, 5, 0));
    this.y.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
    localJPanel2.add(this.y);
    localJPanel2.add(this.z);
    localJPanel1.add(this.t);
    localJPanel1.add(this.u);
    localJPanel1.add(this.v);
    localJPanel1.add(this.w);
    localJPanel1.add(this.x);
    localJPanel1.add(localJPanel2);
    return localJPanel1;
  }

  private JPanel e()
  {
    JPanel localJPanel = new JPanel();
    localJPanel.setBorder(BorderFactory.createTitledBorder(' ' + ct.a(1770)));
    BoxLayout localBoxLayout = new BoxLayout(localJPanel, 1);
    localJPanel.setAlignmentX(0.0F);
    localJPanel.setLayout(localBoxLayout);
    this.A = new JCheckBox(ct.a(1771));
    this.B = new JLabel(ct.a(1772));
    this.C = new JCheckBox(ct.a(1773));
    this.D = new JCheckBox(ct.a(1774));
    this.E = new JCheckBox(ct.a(1641));
    this.F = new JCheckBox(ct.a(1775));
    this.A.addActionListener(new yb(this));
    this.B.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    Border localBorder = BorderFactory.createEmptyBorder(4, 22, 4, 4);
    this.C.setBorder(localBorder);
    this.D.setBorder(localBorder);
    this.E.setBorder(localBorder);
    this.F.setBorder(localBorder);
    localJPanel.add(this.A);
    localJPanel.add(Box.createRigidArea(new Dimension(0, 10)));
    localJPanel.add(this.B);
    localJPanel.add(this.C);
    localJPanel.add(this.D);
    localJPanel.add(this.E);
    localJPanel.add(this.F);
    return localJPanel;
  }

  private void g()
  {
    this.l.setEnabled(this.k.isSelected());
    boolean bool = this.x.isSelected();
    this.y.setEnabled(bool);
    this.z.setEnabled(bool);
    bool = this.A.isSelected();
    this.B.setEnabled(bool);
    this.C.setEnabled(bool);
    this.D.setEnabled(bool);
    this.E.setEnabled(bool);
    this.F.setEnabled(bool);
    this.H.setEnabled(this.G.isSelected());
  }

  private static Integer a(JTextField paramJTextField)
  {
    String str = paramJTextField.getText();
    try
    {
      return new Integer(str);
    }
    catch (Exception localException)
    {
    }
    return new Integer(0);
  }

  public void d()
  {
    b.a("editing.tabSize").a(a(this.b));
    b.a("editing.tabAsSpaces").a(new Boolean(this.c.isSelected()));
    b.a("editing.autoIndent").a(new Boolean(this.d.isSelected()));
    b.a("editing.lineEnding").a(new ck(this.i.getSelection().getActionCommand()));
    b.a("editing.stripSpaces").a(new Boolean(this.j.isSelected()));
    b.a("editing.lineWrap").a(new Boolean(this.G.isSelected()));
    b.a("editing.wordWrap").a(new Boolean(this.H.isSelected()));
    b.a("editing.showPrintMargin").a(new Boolean(this.k.isSelected()));
    b.a("editing.printMarginColumn").a(a(this.l));
    b.a("editing.smartHome").a(new Boolean(this.m.isSelected()));
    b.a("editing.bracketPairInsertion").a(new Boolean(this.n.isSelected()));
    b.a("editing.curlyPairInsertion").a(new Boolean(this.o.isSelected()));
    b.a("editing.quotePairInsertion").a(new Boolean(this.p.isSelected()));
    b.a("editing.htmlClosingTagInsertion").a(new Boolean(this.q.isSelected()));
    b.a("editing.docBlocInsertion").a(new Boolean(this.r.isSelected()));
    b.a("editing.generateStub").a(new Boolean(this.s.isSelected()));
    b.a("editing.bracketMatchingEnabled").a(new Boolean(this.t.isSelected()));
    b.a("editing.quoteMatchingEnabled").a(new Boolean(this.u.isSelected()));
    b.a("editing.currentLineHighlightingEnabled").a(new Boolean(this.v.isSelected()));
    b.a("editnig.matchingBracketLineTooltip").a(new Boolean(this.w.isSelected()));
    b.a("editing.realTimeError").a(new Boolean(this.x.isSelected()));
    b.a("editing.maxRealTimeErrors").a(a(this.z));
    b.a("editing.foldingEnabled").a(new Boolean(this.A.isSelected()));
    b.a("editing.foldingNonPHP").a(new Boolean(this.C.isSelected()));
    b.a("editing.foldingDocBlocks").a(new Boolean(this.D.isSelected()));
    b.a("editing.foldingClasses").a(new Boolean(this.E.isSelected()));
    b.a("editing.foldingFunctions").a(new Boolean(this.F.isSelected()));
    f();
  }

  public void f()
  {
    this.b.setText(b.a("editing.tabSize").c().toString());
    this.c.setSelected(((Boolean)b.a("editing.tabAsSpaces").c()).booleanValue());
    this.d.setSelected(((Boolean)b.a("editing.autoIndent").c()).booleanValue());
    String str = b.a("editing.lineEnding").c().toString();
    this.i.setSelected(str.equals(ct.a(660)) ? this.g.getModel() : str.equals(ct.a(659)) ? this.f.getModel() : this.h.getModel(), true);
    this.j.setSelected(((Boolean)b.a("editing.stripSpaces").c()).booleanValue());
    this.G.setSelected(((Boolean)b.a("editing.lineWrap").c()).booleanValue());
    this.H.setSelected(((Boolean)b.a("editing.wordWrap").c()).booleanValue());
    this.k.setSelected(((Boolean)b.a("editing.showPrintMargin").c()).booleanValue());
    this.l.setText(b.a("editing.printMarginColumn").c().toString());
    this.m.setSelected(((Boolean)b.a("editing.smartHome").c()).booleanValue());
    this.n.setSelected(((Boolean)b.a("editing.bracketPairInsertion").c()).booleanValue());
    this.o.setSelected(((Boolean)b.a("editing.curlyPairInsertion").c()).booleanValue());
    this.p.setSelected(((Boolean)b.a("editing.quotePairInsertion").c()).booleanValue());
    this.q.setSelected(((Boolean)b.a("editing.htmlClosingTagInsertion").c()).booleanValue());
    this.r.setSelected(((Boolean)b.a("editing.docBlocInsertion").c()).booleanValue());
    this.s.setSelected(((Boolean)b.a("editing.generateStub").c()).booleanValue());
    this.t.setSelected(((Boolean)b.a("editing.bracketMatchingEnabled").c()).booleanValue());
    this.u.setSelected(((Boolean)b.a("editing.quoteMatchingEnabled").c()).booleanValue());
    this.v.setSelected(((Boolean)b.a("editing.currentLineHighlightingEnabled").c()).booleanValue());
    this.w.setSelected(((Boolean)b.a("editnig.matchingBracketLineTooltip").c()).booleanValue());
    this.x.setSelected(((Boolean)b.a("editing.realTimeError").c()).booleanValue());
    this.z.setText(b.a("editing.maxRealTimeErrors").c().toString());
    this.A.setSelected(((Boolean)b.a("editing.foldingEnabled").c()).booleanValue());
    this.C.setSelected(((Boolean)b.a("editing.foldingNonPHP").c()).booleanValue());
    this.D.setSelected(((Boolean)b.a("editing.foldingDocBlocks").c()).booleanValue());
    this.E.setSelected(((Boolean)b.a("editing.foldingClasses").c()).booleanValue());
    this.F.setSelected(((Boolean)b.a("editing.foldingFunctions").c()).booleanValue());
    g();
  }

  private void h()
  {
    this.b.setText(b.a("editing.tabSize").b().toString());
    this.c.setSelected(((Boolean)b.a("editing.tabAsSpaces").b()).booleanValue());
    this.d.setSelected(((Boolean)b.a("editing.autoIndent").b()).booleanValue());
    String str = b.a("editing.lineEnding").b().toString();
    this.i.setSelected(str.equals(ct.a(660)) ? this.g.getModel() : str.equals(ct.a(659)) ? this.f.getModel() : this.h.getModel(), true);
    this.j.setSelected(((Boolean)b.a("editing.stripSpaces").b()).booleanValue());
    this.G.setSelected(((Boolean)b.a("editing.lineWrap").b()).booleanValue());
    this.H.setSelected(((Boolean)b.a("editing.wordWrap").b()).booleanValue());
    this.k.setSelected(((Boolean)b.a("editing.showPrintMargin").b()).booleanValue());
    this.l.setText(b.a("editing.printMarginColumn").b().toString());
    this.m.setSelected(((Boolean)b.a("editing.smartHome").b()).booleanValue());
    this.n.setSelected(((Boolean)b.a("editing.bracketPairInsertion").b()).booleanValue());
    this.o.setSelected(((Boolean)b.a("editing.curlyPairInsertion").b()).booleanValue());
    this.p.setSelected(((Boolean)b.a("editing.quotePairInsertion").b()).booleanValue());
    this.q.setSelected(((Boolean)b.a("editing.htmlClosingTagInsertion").b()).booleanValue());
    this.r.setSelected(((Boolean)b.a("editing.docBlocInsertion").b()).booleanValue());
    this.s.setSelected(((Boolean)b.a("editing.generateStub").b()).booleanValue());
    this.t.setSelected(((Boolean)b.a("editing.bracketMatchingEnabled").b()).booleanValue());
    this.u.setSelected(((Boolean)b.a("editing.quoteMatchingEnabled").b()).booleanValue());
    this.v.setSelected(((Boolean)b.a("editing.currentLineHighlightingEnabled").b()).booleanValue());
    this.w.setSelected(((Boolean)b.a("editnig.matchingBracketLineTooltip").b()).booleanValue());
    this.x.setSelected(((Boolean)b.a("editing.realTimeError").b()).booleanValue());
    this.z.setText(((Integer)b.a("editing.maxRealTimeErrors").b()).toString());
    this.A.setSelected(((Boolean)b.a("editing.foldingEnabled").b()).booleanValue());
    this.C.setSelected(((Boolean)b.a("editing.foldingNonPHP").b()).booleanValue());
    this.D.setSelected(((Boolean)b.a("editing.foldingDocBlocks").b()).booleanValue());
    this.E.setSelected(((Boolean)b.a("editing.foldingClasses").b()).booleanValue());
    this.F.setSelected(((Boolean)b.a("editing.foldingFunctions").b()).booleanValue());
    g();
  }

  public void a(String paramString)
  {
  }

  public void e()
  {
  }

  public JComponent c()
  {
    return this;
  }

  public boolean d(boolean paramBoolean)
  {
    return this.K.d(paramBoolean);
  }

  public bb q()
  {
    return this.I;
  }

  public void d(String paramString)
  {
    this.J = paramString;
  }

  public String r()
  {
    return this.J;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public void a(bn parambn)
  {
    this.I.a(parambn.q());
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public bs t()
  {
    return this.K;
  }

  static JCheckBox a(rd paramrd)
  {
    return paramrd.G;
  }

  static JCheckBox b(rd paramrd)
  {
    return paramrd.H;
  }

  static JCheckBox c(rd paramrd)
  {
    return paramrd.k;
  }

  static JTextField d(rd paramrd)
  {
    return paramrd.l;
  }

  static JCheckBox e(rd paramrd)
  {
    return paramrd.x;
  }

  static JLabel f(rd paramrd)
  {
    return paramrd.y;
  }

  static JTextField g(rd paramrd)
  {
    return paramrd.z;
  }

  static JCheckBox h(rd paramrd)
  {
    return paramrd.A;
  }

  static JLabel i(rd paramrd)
  {
    return paramrd.B;
  }

  static JCheckBox j(rd paramrd)
  {
    return paramrd.C;
  }

  static JCheckBox k(rd paramrd)
  {
    return paramrd.D;
  }

  static JCheckBox l(rd paramrd)
  {
    return paramrd.E;
  }

  static JCheckBox m(rd paramrd)
  {
    return paramrd.F;
  }

  static void n(rd paramrd)
  {
    paramrd.h();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.rd
 * JD-Core Version:    0.6.0
 */