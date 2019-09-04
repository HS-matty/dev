package com.zend.ide.l;

import com.zend.ide.h.br;
import com.zend.ide.h.e;
import com.zend.ide.j.h;
import com.zend.ide.j.s;
import com.zend.ide.p.d.bp;
import com.zend.ide.u.bh;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bt;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.i;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import sun.awt.shell.ShellFolder;

public class g extends f
  implements cu, k
{
  private bk j;
  private br h;
  private bx k;
  private bt l;
  private bf m;
  private String n = "";
  private JPanel q;
  private JPanel o;
  private JComponent i;
  private JLabel p;
  private i r;

  public g()
  {
    d("projectsTab");
    d("TabbedPaneContext");
    x();
    A();
    a(this);
    y();
  }

  private void x()
  {
    this.o = new JPanel(new BorderLayout());
    com.zend.ide.bc.a.a(this.o, "PROJECT");
    this.q = new JPanel();
    this.q.addMouseListener(new b(this));
    com.zend.ide.bc.a.a(this.q, "PROJECT");
    this.i = new JMenuBar();
    this.i.setLayout(new BorderLayout());
    com.zend.ide.bc.a.a(this.i, "PROJECT");
    this.p = new JLabel();
    this.p.setBorder(BorderFactory.createEmptyBorder());
    this.i.add(this.p, "West");
    this.i.setPreferredSize(new Dimension(200, 22));
    this.i.setBorder(BorderFactory.createEmptyBorder());
    this.o.add(this.q, "Center");
    c(null);
    this.l = new bt(this);
    this.l.a(this.q);
    y localy = new y(this);
    a(localy);
    this.q.putClientProperty("help_file", "zend_ide_helpfiles_and_project_management.htm");
    this.o.putClientProperty("help_file", "zend_ide_helpfiles_and_project_management.htm");
  }

  private void B()
  {
    this.h = new j(this, new com.zend.ide.h.bs(this.j, true));
    this.h.a(this);
  }

  private void c(u paramu)
  {
    String str = ct.a(209);
    if (paramu != null)
      str = ct.a(210, paramu.b());
    this.p.setText(str);
    this.o.repaint();
  }

  public com.zend.ide.util.bs t()
  {
    return this.l;
  }

  public e h()
  {
    return this.j == null ? null : (e)this.j.n();
  }

  private void y()
  {
    this.r = new i(c());
    this.r.a("project.openProject", "OpenProjectAction", 2);
    this.r.a("project.newProject", "NewProjectAction", 2);
    this.r.a("project.saveProject", "SaveProjectAction", 2);
    this.r.a("project.checkIncludes", "CheckIncludesAction", 2);
    this.r.a("project.removeFromProject", "RemoveFromProjectAction", 2);
  }

  public JComponent a()
  {
    return this.i;
  }

  public Object m()
  {
    be localbe = new be();
    if (f() != null)
      localbe.a(g());
    return localbe;
  }

  public void a(Object paramObject)
  {
    be localbe = (be)paramObject;
    com.zend.ide.j.y localy = localbe.b();
    if (localy == null)
      return;
    File[] arrayOfFile = localy.b();
    for (int i1 = 0; i1 < arrayOfFile.length; i1++)
    {
      Object localObject = arrayOfFile[i1];
      if ((localObject instanceof com.zend.ide.j.a))
        continue;
      try
      {
        localObject = ShellFolder.getShellFolder((File)localObject);
        arrayOfFile[i1] = localObject;
      }
      catch (Exception localException)
      {
      }
    }
    d locald = new d("project");
    locald.c(arrayOfFile);
    a(locald);
  }

  public boolean b(Object paramObject)
  {
    return false;
  }

  public Object b()
  {
    return "project_roots";
  }

  public boolean a(boolean paramBoolean)
  {
    return true;
  }

  public Object d()
  {
    return new be();
  }

  public void a(bh parambh)
  {
    File[] arrayOfFile = g().b();
    for (int i1 = 0; i1 < arrayOfFile.length; i1++)
    {
      File localFile = arrayOfFile[i1];
      s locals = h.m.A(localFile);
      if (locals != parambh)
        continue;
      g().b(localFile);
    }
  }

  public boolean d(boolean paramBoolean)
  {
    if (e())
      return n();
    if (a(this.e))
      return b(true);
    return true;
  }

  public bb q()
  {
    return this.m;
  }

  public JComponent c()
  {
    return this.o;
  }

  public void d(String paramString)
  {
    this.n = paramString;
  }

  public String r()
  {
    return this.n;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public void a(bn parambn)
  {
    q().a(parambn.q());
  }

  public Object s()
  {
    String str = null;
    if (f() != null)
      str = f().c();
    File localFile = v().getCurrentDirectory();
    return new Object[] { str, localFile };
  }

  public void c(Object paramObject)
  {
    if (paramObject == null)
    {
      p();
      return;
    }
    String str = (String)((Object[])(Object[])paramObject)[0];
    if (str != null)
      a(str);
    else
      p();
    v().setCurrentDirectory((File)((Object[])(Object[])paramObject)[1]);
  }

  public void a(w paramw)
  {
    i().a(paramw);
  }

  private bf z()
  {
    return new bf(this);
  }

  private void A()
  {
    this.m = z();
    this.m.b();
  }

  static JPanel a(g paramg)
  {
    return paramg.q;
  }

  static void a(g paramg, u paramu)
  {
    paramg.c(paramu);
  }

  static bk a(g paramg, bk parambk)
  {
    return paramg.j = parambk;
  }

  static bk a(g paramg)
  {
    return paramg.j;
  }

  static void b(g paramg)
  {
    paramg.B();
  }

  static JPanel c(g paramg)
  {
    return paramg.o;
  }

  static br d(g paramg)
  {
    return paramg.h;
  }

  static bx e(g paramg)
  {
    return paramg.k;
  }

  static bx a(g paramg, bx parambx)
  {
    return paramg.k = parambx;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.g
 * JD-Core Version:    0.6.0
 */