package com.zend.ide.cb.a.b;

import com.zend.ide.bd.c;
import com.zend.ide.cb.a.cd;
import com.zend.ide.cb.a.k;
import com.zend.ide.cb.a.ob;
import com.zend.ide.cb.d;
import com.zend.ide.cb.g;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.cb.u;
import com.zend.ide.cb.v;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class db
  implements k, cu
{
  private static final String b = ct.a(1348);
  private static final String c = ct.a(1347);
  private u d;
  private com.zend.ide.cb.c.w e;
  private JPopupMenu f;
  private JPopupMenu g;
  private JPopupMenu h;
  private JPopupMenu i;
  private ob j;
  private ob k;
  private ob l;
  private ob m;
  private wb n;
  private String o;
  private int p;
  private int q;
  private com.zend.ide.y.e r;
  private PropertyChangeListener s;
  private bb t;
  protected kb u;
  private HashMap v;

  public db(u paramu, com.zend.ide.cb.c.w paramw)
  {
    this.d = paramu;
    this.e = paramw;
    this.o = "treeManager";
    this.u = new kb(paramw);
    this.n = new wb(paramu);
    this.n.addMouseListener(new w(this, this.n));
    this.n.addTreeSelectionListener(new jb(this));
    this.n.getModel().addTreeModelListener(new xb(this));
    this.t = new bb(this);
    e();
    this.s = new ib(this, null);
    a();
  }

  private void a()
  {
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.r = new com.zend.ide.y.e(localf);
    localf.a("sql.basicClickBehaviour", this.s);
    localf.a("sql.tableClickBehaviour", this.s);
    this.r.a("sql.basicClickBehaviour");
    this.r.a("sql.tableClickBehaviour");
  }

  public wb b()
  {
    return this.n;
  }

  public JComponent a()
  {
    return this.n;
  }

  public void c()
  {
    this.d.c();
  }

  public void a(String paramString)
  {
    this.o = paramString;
  }

  public String d()
  {
    return this.o;
  }

  public boolean e()
  {
    return a().requestFocusInWindow();
  }

  public Action a()
  {
    return this.t.g();
  }

  public Action b()
  {
    return this.t.b();
  }

  protected u c()
  {
    return this.d;
  }

  protected com.zend.ide.cb.c.w d()
  {
    return this.e;
  }

  private void e()
  {
    this.v = new HashMap();
    InputMap localInputMap1 = this.n.getInputMap();
    ActionMap localActionMap = this.n.getActionMap();
    KeyStroke localKeyStroke = KeyStroke.getKeyStroke("ENTER");
    this.v.put("enter", localKeyStroke);
    localInputMap1.put(localKeyStroke, "triggerElement");
    localActionMap.put("triggerElement", this.t.c(localKeyStroke));
    localKeyStroke = KeyStroke.getKeyStroke("DELETE");
    this.v.put("delete", localKeyStroke);
    localInputMap1.put(localKeyStroke, "removeServer");
    localActionMap.put("removeServer", this.t.b(localKeyStroke));
    localKeyStroke = KeyStroke.getKeyStroke(10, 2);
    this.v.put("metadata", localKeyStroke);
    localActionMap.put("showMetadata", this.t.a(localKeyStroke));
    InputMap localInputMap2 = new InputMap();
    localInputMap2.setParent(localInputMap1);
    localInputMap2.put(localKeyStroke, "showMetadata");
    this.n.setInputMap(0, localInputMap2);
  }

  public void f()
  {
    q[] arrayOfq = this.d.a();
    if (a(arrayOfq))
      this.e.c();
    for (int i1 = 0; i1 < arrayOfq.length; i1++)
    {
      q localq = arrayOfq[i1];
      new Thread(new eb(this, localq)).start();
    }
  }

  private boolean a(q[] paramArrayOfq)
  {
    for (int i1 = 0; i1 < paramArrayOfq.length; i1++)
    {
      q localq = paramArrayOfq[i1];
      if (localq.l().h())
        return true;
    }
    return false;
  }

  protected void a(v paramv, boolean paramBoolean)
  {
    com.zend.ide.util.c.h.c().a(new hb(this, paramv, paramBoolean), true);
  }

  private void a(q paramq, boolean paramBoolean, MouseEvent paramMouseEvent)
  {
    if (this.j == null)
    {
      this.j = new ob(6);
      this.j.put("Refresh", this.t.d());
      this.j.put("SQL", this.t.a());
      this.j.put("Metadata", this.t.a((KeyStroke)this.v.get("metadata")));
      this.j.put("Connect", this.t.e());
      this.j.put("Remove", this.t.b((KeyStroke)this.v.get("delete")));
      this.j.put("Settings", this.t.h());
    }
    ((ab)this.j.get("Connect")).a(paramq, paramBoolean);
    ((ab)this.j.get("Remove")).a(paramq);
    ((ab)this.j.get("Settings")).a(paramq);
    if (this.f == null)
      this.f = a(this.j);
    a(this.f, paramMouseEvent);
  }

  private void a(g paramg, MouseEvent paramMouseEvent)
  {
    if (this.l == null)
    {
      this.l = new ob(3);
      this.l.put("Refresh", this.t.d());
      this.l.put("SQL", this.t.a());
      this.l.put("metadata", this.t.a((KeyStroke)this.v.get("metadata")));
    }
    if (this.h == null)
      this.h = a(this.l);
    a(this.h, paramMouseEvent);
  }

  private void b(g paramg, MouseEvent paramMouseEvent)
  {
    if (this.k == null)
    {
      this.k = new ob(4);
      this.k.put("Refresh", this.t.d());
      this.k.put("SQL", this.t.a());
      this.k.put("Metadata", this.t.a((KeyStroke)this.v.get("metadata")));
      this.k.put("Data", this.t.c());
    }
    if (this.g == null)
      this.g = a(this.k);
    a(this.g, paramMouseEvent);
  }

  private void a(MouseEvent paramMouseEvent)
  {
    if (this.m == null)
    {
      this.m = new ob(1);
      this.m.put("New", this.t.g());
      this.m.put("General", this.t.b());
    }
    if (this.i == null)
      this.i = a(this.m);
    a(this.i, paramMouseEvent);
  }

  private void a(JPopupMenu paramJPopupMenu, MouseEvent paramMouseEvent)
  {
    if (paramJPopupMenu.isVisible())
      paramJPopupMenu.setVisible(false);
    SwingUtilities.invokeLater(new fb(this, paramJPopupMenu, paramMouseEvent));
  }

  private JPopupMenu a(ob paramob)
  {
    JPopupMenu localJPopupMenu = new JPopupMenu();
    Object[] arrayOfObject = paramob.a();
    for (int i1 = 0; i1 < arrayOfObject.length; i1++)
      localJPopupMenu.add((Action)paramob.get(arrayOfObject[i1]));
    return localJPopupMenu;
  }

  public q g()
  {
    com.zend.ide.p.f.e locale = i();
    if (locale == null)
      return null;
    Object localObject = locale.getUserObject();
    if ((localObject instanceof q))
      return (q)localObject;
    return null;
  }

  protected void h()
  {
    TreePath localTreePath = this.n.getSelectionPath();
    if (localTreePath == null)
      return;
    com.zend.ide.p.f.e locale = (com.zend.ide.p.f.e)localTreePath.getLastPathComponent();
    Object localObject = locale.getUserObject();
    if ((localObject instanceof g))
    {
      g localg = (g)localObject;
      if (!localg.c().a(false))
      {
        if ((localObject instanceof q))
        {
          q localq = (q)localObject;
          a(localq, true);
        }
        return;
      }
    }
    if ((localObject instanceof v))
    {
      if (j() == 2)
        a((v)localObject, true);
      else if (j() == 1)
        this.u.a((v)localObject);
    }
    else if (k() == 1)
      if ((localObject instanceof q))
        this.u.a((q)localObject);
      else if ((localObject instanceof com.zend.ide.cb.f))
        this.u.a((com.zend.ide.cb.f)localObject);
      else if ((localObject instanceof p))
        this.u.a((p)localObject);
      else if ((localObject instanceof com.zend.ide.cb.h))
        this.u.a((com.zend.ide.cb.h)localObject);
  }

  protected void a(q paramq, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      gb localgb = new gb(this, paramq);
      new Thread(localgb).start();
    }
    else
    {
      a(paramq);
    }
  }

  private void a(q paramq)
  {
    if (paramq == null)
      return;
    try
    {
      paramq.a();
      new cb(this.n).a(paramq);
    }
    catch (d locald)
    {
      Throwable localThrowable = locald.getCause();
      if ((localThrowable != null) && ((localThrowable instanceof SQLException)) && (paramq.a((SQLException)localThrowable)))
      {
        cd localcd = new cd(c.b().h(), paramq);
        if (localcd.b() == 0)
          a(paramq);
      }
      else if (this.e.a().a())
      {
        this.e.a(paramq, com.zend.ide.cb.c.w.a(paramq, locald.getMessage()), true);
      }
      else
      {
        com.zend.ide.cb.c.w.a(paramq, locald.getMessage(), c.b().h());
      }
    }
  }

  protected void b(q paramq)
  {
    this.u.a(paramq);
  }

  protected void a(com.zend.ide.cb.f paramf)
  {
    this.u.a(paramf);
  }

  protected void a(p paramp)
  {
    this.u.a(paramp);
  }

  public void a(v paramv)
  {
    this.u.a(paramv);
  }

  public void a(com.zend.ide.cb.h paramh)
  {
    this.u.a(paramh);
  }

  protected com.zend.ide.p.f.e i()
  {
    TreePath localTreePath = this.n.getSelectionPath();
    if (localTreePath == null)
      return null;
    return (com.zend.ide.p.f.e)localTreePath.getLastPathComponent();
  }

  private void a(boolean paramBoolean)
  {
    TreePath localTreePath = this.n.getSelectionPath();
    a(localTreePath, paramBoolean);
  }

  private void a(TreePath paramTreePath, boolean paramBoolean)
  {
    if (paramTreePath == null)
      return;
    com.zend.ide.p.f.e locale = (com.zend.ide.p.f.e)paramTreePath.getLastPathComponent();
    Object localObject = locale.getUserObject();
    if ((localObject != null) && ((localObject instanceof g)))
    {
      g localg = (g)localObject;
      q localq = localg.c();
      com.zend.ide.cb.f localf = null;
      p localp = null;
      if ((localg instanceof com.zend.ide.cb.f))
      {
        localf = (com.zend.ide.cb.f)localg;
      }
      else if (localq.k())
      {
        if ((localg instanceof p))
          localp = (p)localg;
        else if ((localg instanceof v))
          localp = ((v)localg).b();
        else if ((localg instanceof com.zend.ide.cb.h))
          localp = ((com.zend.ide.cb.h)localg).a().b();
        if (localp != null)
          localf = localp.a();
      }
      else if ((localg instanceof v))
      {
        localf = ((v)localg).a();
      }
      else if ((localg instanceof com.zend.ide.cb.h))
      {
        localf = ((com.zend.ide.cb.h)localg).a().a();
      }
      this.e.a(localq, localf, localp, paramBoolean);
      SwingUtilities.invokeLater(new vb(this));
    }
    else
    {
      a(paramTreePath.getParentPath(), paramBoolean);
    }
  }

  public int j()
  {
    return this.p;
  }

  public int k()
  {
    return this.q;
  }

  public void a(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1) && (paramInt != 2))
      throw new IllegalArgumentException("Not a valid behaviour code - " + paramInt);
    this.p = paramInt;
  }

  public void b(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1))
      throw new IllegalArgumentException("Not a valid behaviour code - " + paramInt);
    this.q = paramInt;
  }

  static wb a(db paramdb)
  {
    return paramdb.n;
  }

  static void a(db paramdb, q paramq)
  {
    paramdb.a(paramq);
  }

  static com.zend.ide.cb.c.w b(db paramdb)
  {
    return paramdb.e;
  }

  static void a(db paramdb, boolean paramBoolean)
  {
    paramdb.a(paramBoolean);
  }

  static void a(db paramdb, MouseEvent paramMouseEvent)
  {
    paramdb.a(paramMouseEvent);
  }

  static void a(db paramdb, q paramq, boolean paramBoolean, MouseEvent paramMouseEvent)
  {
    paramdb.a(paramq, paramBoolean, paramMouseEvent);
  }

  static void b(db paramdb, g paramg, MouseEvent paramMouseEvent)
  {
    paramdb.b(paramg, paramMouseEvent);
  }

  static void a(db paramdb, g paramg, MouseEvent paramMouseEvent)
  {
    paramdb.a(paramg, paramMouseEvent);
  }

  static String l()
  {
    return b;
  }

  static String m()
  {
    return c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.db
 * JD-Core Version:    0.6.0
 */