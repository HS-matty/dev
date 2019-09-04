package com.zend.ide.eb;

import com.zend.ide.n.bf;
import com.zend.ide.n.bw;
import com.zend.ide.n.gz;
import com.zend.ide.p.ba;
import com.zend.ide.p.w;
import com.zend.ide.util.bi;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.mc;
import com.zend.ide.util.s;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.beans.PropertyChangeListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class k extends com.zend.ide.i.n
  implements cu
{
  private static boolean c = true;
  private static boolean d = false;
  private static boolean e;
  private bw f;
  private boolean b = false;
  private boolean s = false;
  private JPanel g;
  private JPanel h;
  private JPanel i;
  private JPanel j;
  private JPanel k;
  private JPanel l;
  private com.zend.ide.p.z m;
  private JLabel n;
  private JLabel o;
  private JLabel p;
  private JLabel q;
  private w r;
  private w u;
  private w t;
  private w y;
  private com.zend.ide.p.z z;
  private com.zend.ide.p.z A;
  private gz B;
  private com.zend.ide.y.e C;
  private PropertyChangeListener D = new eb(this, null);
  private PropertyChangeListener E = new db(this, null);
  private JPanel v;
  private o w;
  private fb F;
  private l x;
  private com.zend.ide.p.b.e G;

  public k(JFrame paramJFrame, bw parambw)
  {
    super(paramJFrame);
    this.f = parambw;
    a();
  }

  private void a()
  {
    this.F = new fb(this, null);
    c();
    e();
    i();
    JSplitPane localJSplitPane = new JSplitPane();
    localJSplitPane.setOneTouchExpandable(true);
    localJSplitPane.add(this.g, "left");
    localJSplitPane.add(this.h, "right");
    getContentPane().add(localJSplitPane, "Center");
    getContentPane().add(this.l, "South");
    setTitle(ct.a(1385));
    setModal(true);
    localJSplitPane.setDividerLocation(0.4D);
    pack();
    doLayout();
    B();
    e = d;
    l();
    com.zend.ide.bc.a.a(this, "CODE_SNIPPETS_DIALOG");
    setName("SnippetsDialog");
  }

  public void j()
  {
    if ((!this.b) && (j.a().g()))
    {
      int i1 = ba.a(this, ct.a(1418), ct.a(1419), 0, 3);
      if (i1 == 0)
        k();
      else
        this.b = true;
    }
    m();
  }

  private void k()
  {
    new b(this).start();
  }

  private void m()
  {
    String str = bi.a("CODE_SNIPPETS_DB_UPDATE");
    if (j.a().g())
    {
      this.A.setText((str == null) || (str.length() == 0) ? ct.a(1424) : str);
      this.A.setForeground(Color.red);
    }
    else
    {
      this.A.setText(str);
    }
  }

  private void c()
  {
    this.g = new JPanel(new BorderLayout());
    d();
    this.g.add(this.v, "Center");
  }

  private void d()
  {
    this.v = new JPanel(new BorderLayout());
    this.w = new o(this, j());
    this.w.addTreeSelectionListener(new d(this));
    this.w.getModel().addTreeModelListener(new m(this));
    JScrollPane localJScrollPane = new JScrollPane(this.w);
    this.v.add(localJScrollPane, "Center");
  }

  private void e()
  {
    f();
    g();
    h();
    this.h = new JPanel(new BorderLayout());
    this.h.add(this.i, "North");
    this.h.add(this.j, "Center");
    this.h.add(this.k, "South");
    n();
  }

  private void f()
  {
    this.i = new JPanel(new BorderLayout(10, 10));
    this.i.setName("SnippetsPreviewTop");
    com.zend.ide.p.z localz1 = new com.zend.ide.p.z(ct.a(685));
    com.zend.ide.p.z localz2 = new com.zend.ide.p.z(ct.a(1386));
    com.zend.ide.p.z localz3 = new com.zend.ide.p.z(ct.a(1387));
    com.zend.ide.p.z localz4 = new com.zend.ide.p.z(ct.a(1388));
    com.zend.ide.p.z localz5 = new com.zend.ide.p.z(ct.a(1389));
    this.m = new com.zend.ide.p.z();
    this.n = new JLabel();
    this.o = new JLabel();
    this.p = new JLabel();
    this.q = new JLabel();
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.add(this.m, "Center");
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(this.n, "Center");
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    localJPanel3.add(this.o, "Center");
    JPanel localJPanel4 = new JPanel(new BorderLayout());
    localJPanel4.add(this.p, "Center");
    JPanel localJPanel5 = new JPanel(new BorderLayout());
    localJPanel5.add(this.q, "Center");
    Box localBox1 = new Box(1);
    localBox1.add(localz1);
    localBox1.add(localz2);
    localBox1.add(localz3);
    localBox1.add(localz4);
    localBox1.add(localz5);
    Box localBox2 = new Box(1);
    localBox2.add(localJPanel1);
    localBox2.add(localJPanel2);
    localBox2.add(localJPanel3);
    localBox2.add(localJPanel4);
    localBox2.add(localJPanel5);
    this.i.add(localBox1, "West");
    this.i.add(localBox2, "Center");
    this.i.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createCompoundBorder(this.i.getBorder(), BorderFactory.createTitledBorder(ct.a(1390)))));
  }

  private void g()
  {
    this.B = new e(this);
    ((s)this.B.q()).a("keys.cut", "textComponent", true);
    ((s)this.B.q()).a("keys.copy", "textComponent", true);
    ((s)this.B.q()).a("keys.paste", "textComponent", true);
    ((s)this.B.q()).a("keys.selectAll", "textComponent", false);
    this.B.a(false);
    this.B.setEditable(false);
    this.B.setName("SnippetsPreview");
    this.B.a(new bf());
    JScrollPane localJScrollPane = new JScrollPane(this.B);
    this.j = new JPanel(new BorderLayout());
    this.j.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createCompoundBorder(this.j.getBorder(), BorderFactory.createTitledBorder(ct.a(1342)))));
    this.j.add(localJScrollPane, "Center");
  }

  private void n()
  {
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    localf.a("editing.styleManager", this.D);
    localf.a("editing.background", this.E);
    this.C = new com.zend.ide.y.e(localf);
    this.C.a("editing.styleManager");
    this.C.a("editing.background");
  }

  private void h()
  {
    this.k = new JPanel(new FlowLayout(0));
    this.r = new w(ct.b(1391));
    this.r.addActionListener(new f(this));
    this.u = new w(ct.b(1166));
    this.u.addActionListener(new g(this));
    this.t = new w(ct.b(123));
    this.t.addActionListener(new h(this));
    this.y = new w(ct.b(678));
    this.y.addActionListener(new n(this));
    this.k.add(this.u);
    this.k.add(this.r);
    this.k.setName("SnippetsPreviewButtons");
  }

  private void i()
  {
    this.l = new JPanel(new BorderLayout());
    JPanel localJPanel1 = new JPanel(new FlowLayout(2));
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    w localw1 = new w(ct.b(1394));
    w localw2 = new w(ct.b(329));
    w localw3 = new w(ct.b(1425));
    localw2.addActionListener(new i(this));
    localw1.addActionListener(new c(this));
    localw3.addActionListener(new x(this));
    JButton localJButton = new JButton(ct.a(639));
    localJButton.addActionListener(new z(this));
    localJPanel1.add(mc.b());
    localJPanel1.add(localw3);
    localJPanel1.add(localw1);
    localJPanel1.add(localw2);
    localJPanel1.add(localJButton);
    this.z = new com.zend.ide.p.z(ct.b(1426));
    this.A = new com.zend.ide.p.z();
    localJPanel2.add(this.z, "Center");
    localJPanel2.add(this.A, "East");
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    m();
    this.l.add(localJPanel1, "East");
    this.l.add(localJPanel2, "West");
    this.l.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.DARK_GRAY));
  }

  private void a(a parama)
  {
    this.m.setText(parama.a());
    this.n.setText(parama.b());
    this.o.setText(parama.c());
    this.p.setText(parama.d());
    this.q.setText(parama.e());
    String str1 = parama.g();
    String str2 = parama.f();
    str2 = a(str2);
    this.B.setText(str1.startsWith("\n") ? "Description:\n" : "Description:\n\n");
    this.B.append(str1);
    if (!str1.endsWith("\n"))
      this.B.append("\n");
    this.B.append(str2.startsWith("\n") ? "\nCode:\n" : "\nCode:\n\n");
    this.B.append(str2);
    if (str2.endsWith("\n"))
      this.B.append("\n");
    else
      this.B.append("\n\n");
    this.B.setCaretPosition(0);
    this.w.grabFocus();
  }

  private String a(String paramString)
  {
    if ((paramString.indexOf("<?") == -1) && (paramString.indexOf("<%") == -1))
      paramString = "<?" + paramString;
    if ((paramString.indexOf("?>") == -1) && (paramString.indexOf("%>") == -1))
      paramString = paramString + "?>";
    return paramString;
  }

  private void o()
  {
    this.m.setText("");
    this.n.setText("");
    this.o.setText("");
    this.p.setText("");
    this.q.setText("");
    this.B.setText("");
    this.w.grabFocus();
  }

  private Object j()
  {
    return j.a().b();
  }

  private void a(String paramString)
  {
    k().c();
    k().a(paramString);
    k().setVisible(true);
    a locala = k().a();
    b(locala);
  }

  private void b(a parama)
  {
    if (parama != null)
    {
      j.a().a(parama);
      this.w.b();
      this.w.setSelectionRow(0);
      TreePath localTreePath = this.w.getSelectionPath();
      if ((localTreePath != null) && (!this.w.isExpanded(localTreePath)))
        this.w.expandPath(localTreePath);
      repaint();
    }
  }

  private void p()
  {
    TreePath localTreePath = this.w.getSelectionPath();
    if (localTreePath == null)
      return;
    if ((((DefaultMutableTreeNode)localTreePath.getLastPathComponent()).getUserObject() instanceof a))
    {
      a locala1 = (a)((DefaultMutableTreeNode)localTreePath.getLastPathComponent()).getUserObject();
      if (locala1.h())
      {
        k().a(locala1);
        k().setVisible(true);
        a locala2 = k().a();
        if (locala2 == null)
          return;
        j.a().a(locala1.a());
        b(locala2);
        repaint();
      }
    }
  }

  private void c(a parama)
  {
    if (parama.h())
    {
      k().a(parama);
      k().setVisible(true);
      a locala = k().a();
      if (locala == null)
        return;
      j.a().a(parama.a());
      b(locala);
      repaint();
    }
  }

  private void q()
  {
    TreePath localTreePath = this.w.getSelectionPath();
    if (localTreePath == null)
      return;
    if ((((DefaultMutableTreeNode)localTreePath.getLastPathComponent()).getUserObject() instanceof a))
    {
      a locala = (a)((DefaultMutableTreeNode)localTreePath.getLastPathComponent()).getUserObject();
      if (locala.h())
      {
        j.a().a(locala.a());
        this.w.b();
        repaint();
      }
    }
  }

  private void r()
  {
    TreePath localTreePath = this.w.getSelectionPath();
    if (localTreePath == null)
      return;
    if ((((DefaultMutableTreeNode)localTreePath.getLastPathComponent()).getUserObject() instanceof a))
    {
      a locala1 = (a)((DefaultMutableTreeNode)localTreePath.getLastPathComponent()).getUserObject();
      a locala2 = new a(locala1, true);
      SwingUtilities.invokeLater(new ib(this, locala2));
    }
  }

  private void s()
  {
    TreePath localTreePath = this.w.getSelectionPath();
    if (localTreePath == null)
      return;
    if ((((DefaultMutableTreeNode)localTreePath.getLastPathComponent()).getUserObject() instanceof a))
    {
      String str = ((a)((DefaultMutableTreeNode)localTreePath.getLastPathComponent()).getUserObject()).f();
      str = a(str);
      try
      {
        this.f.getDocument().insertString(this.f.getCaretPosition(), str, null);
      }
      catch (BadLocationException localBadLocationException)
      {
        localBadLocationException.printStackTrace();
      }
    }
    dispose();
  }

  private l k()
  {
    if (this.x == null)
      this.x = new l(this);
    return this.x;
  }

  public void b(String paramString)
  {
    setModal(false);
    setVisible(true);
    a(paramString);
    setModal(true);
  }

  public void t()
  {
    setModal(false);
    setVisible(true);
    j();
    setModal(true);
  }

  private void l()
  {
    if (this.w.getSelectionPath() == null)
    {
      a(d);
      b(false);
    }
    else
    {
      Object localObject = ((com.zend.ide.p.f.e)this.w.getSelectionPath().getLastPathComponent()).getUserObject();
      if ((localObject instanceof a))
        b(true);
      else
        b(false);
    }
  }

  private void a(boolean paramBoolean)
  {
    if (e == paramBoolean)
      return;
    if (paramBoolean == c)
    {
      this.k.removeAll();
      this.k.add(this.y);
      this.k.add(this.t);
      this.k.add(this.r);
    }
    else
    {
      this.k.removeAll();
      this.k.add(this.u);
      this.k.add(this.r);
    }
    e = paramBoolean;
    this.k.revalidate();
    this.k.validate();
    this.k.doLayout();
    this.k.repaint();
  }

  private void b(boolean paramBoolean)
  {
    this.r.setEnabled(paramBoolean);
    this.u.setEnabled(paramBoolean);
    this.t.setEnabled(paramBoolean);
    this.y.setEnabled(paramBoolean);
  }

  static boolean a(k paramk, boolean paramBoolean)
  {
    return paramk.s = paramBoolean;
  }

  static fb a(k paramk)
  {
    return paramk.F;
  }

  static com.zend.ide.p.b.e b(k paramk)
  {
    return paramk.G;
  }

  static boolean c(k paramk)
  {
    return paramk.s;
  }

  static o d(k paramk)
  {
    return paramk.w;
  }

  static void e(k paramk)
  {
    paramk.m();
  }

  static void f(k paramk)
  {
    paramk.l();
  }

  static void d(k paramk)
  {
    paramk.o();
  }

  static void b(k paramk, boolean paramBoolean)
  {
    paramk.a(paramBoolean);
  }

  static void a(k paramk, a parama)
  {
    paramk.a(parama);
  }

  static boolean a()
  {
    return d;
  }

  static void g(k paramk)
  {
    paramk.s();
  }

  static void h(k paramk)
  {
    paramk.r();
  }

  static void i(k paramk)
  {
    paramk.p();
  }

  static void j(k paramk)
  {
    paramk.q();
  }

  static void a(k paramk, String paramString)
  {
    paramk.a(paramString);
  }

  static void k(k paramk)
  {
    paramk.k();
  }

  static void b(k paramk, a parama)
  {
    paramk.c(parama);
  }

  static com.zend.ide.p.b.e a(k paramk, com.zend.ide.p.b.e parame)
  {
    return paramk.G = parame;
  }

  static gz l(k paramk)
  {
    return paramk.B;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.k
 * JD-Core Version:    0.6.0
 */