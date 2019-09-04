package com.zend.ide.d;

import com.zend.ide.p.ba;
import com.zend.ide.p.w;
import com.zend.ide.p.z;
import com.zend.ide.s.nb;
import com.zend.ide.s.sb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.en;
import com.zend.ide.y.a;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import com.zend.ide.y.m;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.MutableComboBoxModel;

public class dc extends JPanel
  implements a, com.zend.ide.util.cu, bn
{
  private com.zend.ide.util.bb a;
  private String b = "propertyEditor";
  private bt c;
  private ArrayList d;
  private ArrayList e;
  private ArrayList f;
  private ArrayList g;
  private ArrayList n;
  private ArrayList q;
  private ArrayList r;
  private ArrayList v;
  private JComboBox h;
  private w i;
  private w j;
  private Hashtable k;
  private co m;
  private JColorChooser l = null;
  private boolean D = false;
  private String o = "Default";
  private en p;
  private String s = "com/zend/ide/resources/GeneralExample.php";
  private String t = "com/zend/ide/resources/HTMLExample.html";
  private String y = "com/zend/ide/resources/PHPExample.php";
  private String z = "com/zend/ide/resources/JavaScriptExample.html";
  private String A = "com/zend/ide/resources/CSSExample.html";
  private String B = "com/zend/ide/resources/XMLExample.xml";
  private String C = "com/zend/ide/resources/SQLExample.sql";
  private static String u = "<HTML>\n<BODY>\n<H1>Debug Demo</H1>\n<table border=\"1\" width=\"700\">\n<tr bgcolor=\"red\">\n<th>Name</th>\n<th>Address</th>\n<th>Phone</th>\n</tr>\n<?\n echo\"this is a test\"; \n?>";
  private String w = "<?php\nfor ($i = 0; $i < 100; $i++) {\n\techo \"<br>\\n\";\n\techo \"Changed line\";\n}\necho \"Appended line\";\n?>\n";
  private String x = "3d2\n< \techo \"Deleted line\";\n5c4\n< \techo \"A line\";\n---\n> echo \"Changed line\";\n6a6\n> echo \"Appended line\";\n";

  public dc()
  {
    b();
    this.a = new cs(null);
    cs.a((cs)this.a);
    this.c = new bt(this);
  }

  private void b()
  {
    this.h = new JComboBox();
    this.k = new Hashtable();
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    l();
    h();
    add(m(), "Center");
    j();
  }

  private void h()
  {
    this.o = ((String)b.a("application.chosenScheme").c());
    this.k = ((Hashtable)m.e().clone());
    a();
    i();
    j();
  }

  private void i()
  {
    this.m = ((co)((co)this.k.get(this.o)).clone());
  }

  protected void j()
  {
    for (int i1 = 0; (this.p != null) && (i1 < this.p.getTabCount()); i1++)
    {
      dm localdm = (dm)this.p.getComponentAt(i1);
      localdm.a(this.m.c());
      localdm.a(this.m.d());
      localdm.a(this.m.e());
      localdm.b(this.m.i());
      localdm.b();
    }
  }

  public void a(Color paramColor)
  {
    for (int i1 = 0; i1 < this.p.getTabCount(); i1++)
    {
      dm localdm = (dm)this.p.getComponentAt(i1);
      localdm.a(paramColor);
      localdm.repaint();
    }
  }

  public void b(Color paramColor)
  {
    for (int i1 = 0; i1 < this.p.getTabCount(); i1++)
    {
      dm localdm = (dm)this.p.getComponentAt(i1);
      localdm.b(paramColor);
      localdm.h();
    }
  }

  public void a(Font paramFont)
  {
    for (int i1 = 0; i1 < this.p.getTabCount(); i1++)
    {
      dm localdm = (dm)this.p.getComponentAt(i1);
      localdm.a(paramFont);
      localdm.h();
    }
  }

  private void a()
  {
    this.D = true;
    try
    {
      this.h.removeAllItems();
      MutableComboBoxModel localMutableComboBoxModel = (MutableComboBoxModel)this.h.getModel();
      localMutableComboBoxModel.addElement("Default");
      localMutableComboBoxModel.addElement("Dark");
      Enumeration localEnumeration = this.k.keys();
      int i1 = 0;
      while (localEnumeration.hasMoreElements())
      {
        String str = localEnumeration.nextElement().toString();
        if (str.equals(this.o))
          i1 = 1;
        if (!m.a(str))
          localMutableComboBoxModel.addElement(str);
      }
      if (i1 == 0)
        this.o = "Default";
      this.h.setSelectedItem(this.o);
    }
    finally
    {
      this.D = false;
    }
  }

  public Color a(Component paramComponent, String paramString, Color paramColor)
    throws HeadlessException
  {
    if (this.l == null)
      this.l = new JColorChooser(paramColor != null ? paramColor : Color.white);
    else
      this.l.setColor(paramColor);
    ds localds = new ds(this.l);
    JDialog localJDialog = JColorChooser.createDialog(paramComponent, paramString, true, this.l, localds, null);
    localJDialog.setVisible(true);
    return localds.b();
  }

  private void l()
  {
    this.d = new ArrayList();
    this.d.add(new cg(com.zend.ide.util.ct.a(10), "editing.background"));
    this.d.add(new cg(com.zend.ide.util.ct.a(1201), "editing.bracketQuoteMatching"));
    this.d.add(new cg(com.zend.ide.util.ct.a(547), "editing.bracketMatchingErrorColor"));
    this.d.add(new cg(com.zend.ide.util.ct.a(528), "editing.searchInSelectedHighlightingColor"));
    this.d.add(new cg(com.zend.ide.util.ct.a(526), "editing.currentLineColor"));
    this.d.add(new cg(com.zend.ide.util.ct.a(39), "highlighting.breakpointColor"));
    this.d.add(new cg(com.zend.ide.util.ct.a(40), "highlighting.debugStepColor"));
    this.e = new ArrayList();
    this.e.add(new ci(com.zend.ide.util.ct.a(24), com.zend.ide.s.bb.e()));
    this.e.add(new ci(com.zend.ide.util.ct.a(22), com.zend.ide.s.bb.b()));
    this.e.add(new ci(com.zend.ide.util.ct.a(1337), com.zend.ide.s.bb.a()));
    this.e.add(new ci(com.zend.ide.util.ct.a(28), com.zend.ide.s.bb.j()));
    this.e.add(new ci(com.zend.ide.util.ct.a(26), com.zend.ide.s.bb.f()));
    this.e.add(new ci(com.zend.ide.util.ct.a(25), com.zend.ide.s.bb.h()));
    this.e.add(new ci(com.zend.ide.util.ct.a(27), com.zend.ide.s.bb.g()));
    this.e.add(new ci(com.zend.ide.util.ct.a(29), com.zend.ide.s.bb.i()));
    this.e.add(new ci(com.zend.ide.util.ct.a(23), com.zend.ide.s.bb.d()));
    this.f = new ArrayList();
    this.f.add(new ci(com.zend.ide.util.ct.a(31), com.zend.ide.s.bb.q()));
    this.f.add(new ci(com.zend.ide.util.ct.a(32), com.zend.ide.s.bb.r()));
    this.f.add(new ci(com.zend.ide.util.ct.a(33), com.zend.ide.s.bb.s()));
    this.f.add(new ci(com.zend.ide.util.ct.a(34), com.zend.ide.s.bb.t()));
    this.f.add(new ci(com.zend.ide.util.ct.a(35), com.zend.ide.s.bb.u()));
    this.f.add(new ci(com.zend.ide.util.ct.a(36), com.zend.ide.s.bb.v()));
    this.f.add(new ci(com.zend.ide.util.ct.a(38), com.zend.ide.s.bb.c()));
    this.f.add(new ci(com.zend.ide.util.ct.a(1215), com.zend.ide.s.bb.w()));
    this.g = new ArrayList();
    this.g.add(new ci(com.zend.ide.util.ct.a(1184), com.zend.ide.s.bb.k()));
    this.g.add(new ci(com.zend.ide.util.ct.a(1187), com.zend.ide.s.bb.o()));
    this.g.add(new ci(com.zend.ide.util.ct.a(28), com.zend.ide.s.bb.m()));
    this.g.add(new ci(com.zend.ide.util.ct.a(25), com.zend.ide.s.bb.p()));
    this.g.add(new ci(com.zend.ide.util.ct.a(27), com.zend.ide.s.bb.n()));
    this.g.add(new ci(com.zend.ide.util.ct.a(1185), com.zend.ide.s.bb.l()));
    this.v = new ArrayList(3);
    this.v.add(new cg(com.zend.ide.util.ct.a(1244), "cvsDiff.diffChange"));
    this.v.add(new cg(com.zend.ide.util.ct.a(1245), "cvsDiff.diffAppend"));
    this.v.add(new cg(com.zend.ide.util.ct.a(1246), "cvsDiff.diffDelete"));
    this.r = new ArrayList(5);
    this.r.add(new ci(com.zend.ide.util.ct.a(23), nb.c()));
    this.r.add(new ci(com.zend.ide.util.ct.a(27), nb.d()));
    this.r.add(new ci(com.zend.ide.util.ct.a(25), nb.e()));
    this.r.add(new ci(com.zend.ide.util.ct.a(28), nb.f()));
    this.r.add(new ci(com.zend.ide.util.ct.a(35), nb.b()));
    this.n = new ArrayList(6);
    this.n.add(new ci(com.zend.ide.util.ct.a(23), com.zend.ide.s.bb.B()));
    this.n.add(new ci(com.zend.ide.util.ct.a(27), com.zend.ide.s.bb.E()));
    this.n.add(new ci(com.zend.ide.util.ct.a(1354), com.zend.ide.s.bb.z()));
    this.n.add(new ci(com.zend.ide.util.ct.a(1353), com.zend.ide.s.bb.y()));
    this.n.add(new ci(com.zend.ide.util.ct.a(35), com.zend.ide.s.bb.x()));
    this.n.add(new ci(com.zend.ide.util.ct.a(1357), com.zend.ide.s.bb.A()));
    this.n.add(new ci(com.zend.ide.util.ct.a(1359), com.zend.ide.s.bb.D()));
    this.n.add(new ci(com.zend.ide.util.ct.a(28), com.zend.ide.s.bb.C()));
    this.q = new ArrayList(6);
    this.q.add(new ci(com.zend.ide.util.ct.a(1377), sb.b()));
    this.q.add(new ci(com.zend.ide.util.ct.a(1380), sb.c()));
    this.q.add(new ci(com.zend.ide.util.ct.a(1378), sb.d()));
    this.q.add(new ci(com.zend.ide.util.ct.a(1379), sb.e()));
    this.q.add(new ci(com.zend.ide.util.ct.a(35), sb.g()));
    this.q.add(new ci(com.zend.ide.util.ct.a(28), sb.h()));
    this.q.add(new ci(com.zend.ide.util.ct.a(23), sb.f()));
  }

  private JPanel m()
  {
    JPanel localJPanel = new JPanel(new BorderLayout(5, 5));
    localJPanel.add(n(), "North");
    localJPanel.add(o(), "Center");
    return localJPanel;
  }

  private JPanel n()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout(5, 0));
    JPanel localJPanel2 = new JPanel(new FlowLayout(2, 5, 0));
    z localz = new z(com.zend.ide.util.ct.a(1165));
    this.i = new w(com.zend.ide.util.ct.b(1166));
    this.j = new w(com.zend.ide.util.ct.b(279));
    this.i.addActionListener(new cu(this, null));
    this.j.addActionListener(new ct(this, null));
    this.h.addActionListener(new ch(this, null));
    localJPanel2.add(this.i);
    localJPanel2.add(this.j);
    localJPanel1.add(localz, "West");
    localJPanel1.add(this.h, "Center");
    localJPanel1.add(localJPanel2, "East");
    this.j.setEnabled(!m.a(this.h.getSelectedItem().toString()));
    return localJPanel1;
  }

  private JComponent o()
  {
    this.p = new en();
    this.p.setTabPlacement(1);
    this.p.add(com.zend.ide.util.ct.a(530), new de(this, this.s, this.d));
    this.p.add(com.zend.ide.util.ct.a(237), new dd(this, this.y, this.e));
    this.p.add(com.zend.ide.util.ct.a(238), new dd(this, this.t, this.f));
    this.p.add(com.zend.ide.util.ct.a(1186), new dd(this, this.z, this.g));
    this.p.add(com.zend.ide.util.ct.a(1358), new dd(this, this.A, this.n));
    this.p.add(com.zend.ide.util.ct.a(1376), new dd(this, this.B, this.q));
    this.p.add(com.zend.ide.util.ct.a(1349), new dd(this, this.C, this.r));
    this.p.add(com.zend.ide.util.ct.a(1251), new dn(this, new StringReader(this.w), this.x, this.v));
    return this.p;
  }

  public co p()
  {
    return this.m;
  }

  public void d()
  {
    co localco = (co)this.m.clone();
    this.k.put(localco.b(), localco);
    m.a((Hashtable)this.k.clone());
    this.o = localco.b();
    b.a("application.chosenScheme").a(this.o);
    b.a("editing.font").a(localco.d());
    b.a("editing.background").a(localco.e());
    b.a("editing.bracketQuoteMatching").a(localco.f());
    b.a("editing.bracketMatchingErrorColor").a(localco.g());
    b.a("editing.searchInSelectedHighlightingColor").a(localco.h());
    b.a("editing.currentLineColor").a(localco.i());
    b.a("highlighting.breakpointColor").a(localco.j());
    b.a("highlighting.debugStepColor").a(localco.k());
    b.a("editing.styleManager").a(m.a().c());
    b.a("cvsDiff.diffAppend").a(localco.n());
    b.a("cvsDiff.diffDelete").a(localco.p());
    b.a("cvsDiff.diffChange").a(localco.o());
  }

  public void f()
  {
    this.h.setSelectedItem(this.o);
    for (int i1 = 0; i1 < this.p.getTabCount(); i1++)
    {
      dm localdm = (dm)this.p.getComponentAt(i1);
      localdm.q();
    }
  }

  public void a(String paramString)
  {
  }

  public void e()
  {
    h();
  }

  public JComponent c()
  {
    return this;
  }

  public co e(String paramString)
  {
    return (co)this.k.get(paramString);
  }

  public boolean v()
  {
    String str = this.h.getSelectedItem().toString();
    if (str == null)
      return false;
    return m.a(str);
  }

  private void c(String paramString)
  {
    if ((paramString != null) && (!m.a(paramString)))
    {
      ((MutableComboBoxModel)this.h.getModel()).removeElement(paramString);
      this.k.remove(paramString);
    }
  }

  public String a(String paramString1, String paramString2)
  {
    int i1 = 1;
    String str = "";
    while (i1 != 0)
    {
      str = (String)ba.a(this, paramString1, com.zend.ide.util.ct.a(1171), 3, null, null, paramString2);
      paramString2 = "";
      if ((str != null) && (this.k.get(str) != null))
      {
        ba.a(this, com.zend.ide.util.ct.a(1173), com.zend.ide.util.ct.a(1171), 0);
        continue;
      }
      i1 = 0;
    }
    if (str != null)
    {
      co localco = (co)this.m.clone();
      localco.a(str);
      this.k.put(str, localco);
      ((MutableComboBoxModel)this.h.getModel()).addElement(str);
      this.h.setSelectedItem(str);
      j();
    }
    return str;
  }

  public String u()
  {
    return this.h.getSelectedItem().toString();
  }

  public boolean d(boolean paramBoolean)
  {
    return this.c.d(paramBoolean);
  }

  public com.zend.ide.util.bb q()
  {
    return this.a;
  }

  public void d(String paramString)
  {
    this.b = paramString;
  }

  public String r()
  {
    return this.b;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public void a(bn parambn)
  {
    this.a.a(parambn.q());
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
    return this.c;
  }

  public static String a()
  {
    return u;
  }

  static JComboBox a(dc paramdc)
  {
    return paramdc.h;
  }

  static boolean a(dc paramdc)
  {
    return paramdc.D;
  }

  static Hashtable b(dc paramdc)
  {
    return paramdc.k;
  }

  static co c(dc paramdc)
  {
    return paramdc.m;
  }

  static co a(dc paramdc, co paramco)
  {
    return paramdc.m = paramco;
  }

  static w d(dc paramdc)
  {
    return paramdc.j;
  }

  static void a(dc paramdc, String paramString)
  {
    paramdc.c(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.dc
 * JD-Core Version:    0.6.0
 */