package com.zend.ide.z;

import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;

class bn extends JPanel
  implements com.zend.ide.util.bn, cu
{
  private bp a;
  private bb b;
  private bc c;
  private bd d;
  private cb e;
  private ca k;
  private ci o;
  private ch p;
  private m f;
  private h g;
  private com.zend.ide.p.x l;
  private com.zend.ide.p.x m;
  private com.zend.ide.util.bb h;
  private String i = "profilerFilesManager";
  private bt j;

  public bn(h paramh, m paramm, bd parambd)
  {
    super(new BorderLayout());
    this.f = paramm;
    this.g = paramh;
    this.c = new bc(this);
    this.b = new bb(this);
    this.d = parambd;
    this.e = new cb(this);
    this.k = new ca(this);
    this.o = new ci(this);
    this.p = new ch(this);
    this.a = new bp(paramm, this.b);
    com.zend.ide.p.cd localcd = new com.zend.ide.p.cd(this.a);
    JPanel localJPanel = new JPanel(new FlowLayout(0));
    this.l = new com.zend.ide.p.x(ct.a(1049));
    this.l.setName("fileNameCheckBox");
    this.l.setSelected(true);
    this.l.addActionListener(new cd(this));
    this.m = new com.zend.ide.p.x(ct.a(1051));
    this.m.setName("durationTimeCheckBox");
    this.m.setSelected(true);
    this.m.addActionListener(new ce(this));
    localJPanel.add(this.l);
    localJPanel.add(this.m);
    add(localcd, "Center");
    add(localJPanel, "South");
    i locali = paramm.b();
    if (locali != null)
      this.a.a(locali);
    this.h = new x(this);
    ((x)this.h).b();
    d("profilerFilesManager");
    this.j = new bt(this);
    this.j.a(this.a);
    this.a.addMouseListener(new d(this));
    setName("treePanel");
  }

  public bs t()
  {
    return this.j;
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public com.zend.ide.util.bb q()
  {
    return this.h;
  }

  public JComponent c()
  {
    return this.a;
  }

  public void d(String paramString)
  {
    this.i = paramString;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public String r()
  {
    if ((this.a != null) && (b() != null) && (b().isLeaf()))
      return "profilerLeafManager";
    if ((this.a != null) && (b() != null) && (b().getParent() != null))
      return "profilerNodeManager";
    return this.i;
  }

  public boolean d(boolean paramBoolean)
  {
    return this.j.d(paramBoolean);
  }

  public void a(com.zend.ide.util.bn parambn)
  {
    this.h.a(parambn.q());
  }

  public j d()
  {
    return this.a.c();
  }

  public DefaultMutableTreeNode b()
  {
    return this.a.b();
  }

  private void a(String paramString, int paramInt)
  {
    this.g.a(paramString, paramInt, this.f.d().h());
  }

  static com.zend.ide.util.bb a(bn parambn)
  {
    return parambn.h;
  }

  static m b(bn parambn)
  {
    return parambn.f;
  }

  static void a(bn parambn, String paramString, int paramInt)
  {
    parambn.a(paramString, paramInt);
  }

  static com.zend.ide.p.x c(bn parambn)
  {
    return parambn.l;
  }

  static bp d(bn parambn)
  {
    return parambn.a;
  }

  static com.zend.ide.p.x e(bn parambn)
  {
    return parambn.m;
  }

  static cb f(bn parambn)
  {
    return parambn.e;
  }

  static ca g(bn parambn)
  {
    return parambn.k;
  }

  static ci h(bn parambn)
  {
    return parambn.o;
  }

  static ch i(bn parambn)
  {
    return parambn.p;
  }

  static bc j(bn parambn)
  {
    return parambn.c;
  }

  static bb k(bn parambn)
  {
    return parambn.b;
  }

  static bd l(bn parambn)
  {
    return parambn.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bn
 * JD-Core Version:    0.6.0
 */