package com.zend.ide.cb.c;

import com.zend.ide.cb.a.b.db;
import com.zend.ide.cb.a.l;
import com.zend.ide.cb.a.mb;
import com.zend.ide.cb.c.f.d;
import com.zend.ide.cb.o;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.cb.s;
import com.zend.ide.cb.t;
import com.zend.ide.p.cd;
import com.zend.ide.util.c.h;
import com.zend.ide.util.cl;
import com.zend.ide.util.cr;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class w
  implements com.zend.ide.cb.k, s
{
  public static final String a = new File(cv.d()).getPath();
  private static final String b = System.getProperty("line.separator");
  private static final String[] c = new String[0];
  static com.zend.ide.util.gb g = new com.zend.ide.util.gb();
  private static String u = "HH:mm:ss";
  private com.zend.ide.cb.a.n d;
  private l e;
  private com.zend.ide.cb.u f;
  private db n;
  private com.zend.ide.cb.a.u h;
  private boolean i = System.getProperty("sqlDebug") != null;
  private static boolean j;
  private com.zend.ide.y.e k;
  private boolean o;
  private int p;
  private String q;
  private boolean r;
  private int s;
  private com.zend.ide.y.f t;
  private com.zend.ide.cb.a.kb l;
  private Color m;
  private cd v;

  public w(com.zend.ide.cb.a.kb paramkb)
  {
    j = System.getProperty("sqlAll") != null;
    this.l = paramkb;
    n();
    this.f = new com.zend.ide.cb.u();
    this.h = new com.zend.ide.cb.a.u();
    this.m = Color.white;
    i();
    this.f = new com.zend.ide.cb.u();
    this.f.a(this);
    b();
    x localx = new x(this);
    h.c().a(localx, true);
  }

  public com.zend.ide.cb.a.kb a()
  {
    return this.l;
  }

  private void b()
  {
    this.t = new com.zend.ide.y.f();
    this.t.a("sql.tabbedResults", new kb(this, null));
    this.t.a("sql.pageSize", new jb(this, null));
    this.t.a("sql.dateFormat", new hb(this, null));
    this.t.a("sql.useLimit", new lb(this, null));
    this.t.a("sql.historyLimit", new ib(this, null));
    this.k = new com.zend.ide.y.e(this.t);
    this.k.a("sql.tabbedResults");
    this.k.a("sql.pageSize");
    this.k.a("sql.dateFormat");
    this.k.a("sql.useLimit");
    this.k.a("sql.historyLimit");
  }

  public com.zend.ide.cb.a.n c()
  {
    if (this.d == null)
    {
      this.d = new com.zend.ide.cb.a.n(this);
      this.d.a(this.l.d());
      this.d.a(this.s);
      this.l.a(this.d);
      this.t.a("editing.styleManager", new ab(this, null));
      this.t.a("editing.background", new y(this, null));
      this.k.a("editing.styleManager");
      this.k.a("editing.background");
    }
    return this.d;
  }

  public l d()
  {
    if (this.e == null)
    {
      this.e = new l("MessagesComponent", this);
      this.e.a(this.l.d());
      this.l.b(this.e);
    }
    return this.e;
  }

  public com.zend.ide.cb.a.k e()
  {
    return this.h;
  }

  public com.zend.ide.cb.u f()
  {
    return this.f;
  }

  public JComponent g()
  {
    if (this.v == null)
    {
      JPanel localJPanel = new JPanel(new BorderLayout());
      JLabel localJLabel = new JLabel("  " + ct.a(273));
      localJLabel.setBackground(Color.white);
      localJPanel.add(localJLabel, "North");
      localJPanel.setBackground(Color.white);
      this.v = new cd(localJPanel);
    }
    if ((this.n != null) && (this.n.b() != null))
      this.v.setViewportView(this.n.b());
    return this.v;
  }

  public void a(com.zend.ide.cb.a.k paramk, boolean paramBoolean)
  {
    String str = paramk.d();
    if ((str == null) || (str.trim().length() == 0))
    {
      str = "SQL";
      paramk.a(str);
    }
    if (paramBoolean)
    {
      this.h.a(paramk, paramBoolean);
      this.l.a(paramk.d());
    }
    else
    {
      this.h.a(paramk, paramBoolean);
      this.l.a(paramk.d());
    }
  }

  public void h()
  {
    this.h.a();
  }

  public void a(String paramString, q paramq, com.zend.ide.cb.v paramv, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
    throws SQLException
  {
    if (this.i)
      System.out.println("Executing SQL on " + paramq + "::" + paramv + " {" + paramString + '}');
    if (paramBoolean3)
      h.c().a(new z(this, paramString, paramq, paramv, paramBoolean1, paramBoolean2), true);
    else
      a(paramString, paramq, paramv, paramBoolean1, paramBoolean2, paramBoolean4);
  }

  private void a(String paramString, q paramq, com.zend.ide.cb.v paramv, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    throws SQLException
  {
    if (paramq == null)
    {
      a(ct.a(1466), true);
      return;
    }
    o localo = paramq.m();
    int i1 = paramq.m().b(paramBoolean2);
    int i2 = paramq.m().a(paramBoolean2);
    int i3 = this.r ? a() + 1 : -1;
    try
    {
      boolean bool = localo.a(paramString, i2, i1, 0, i3);
      Object localObject;
      if (bool)
      {
        localObject = paramq.b(paramq.g());
        p localp = null;
        if (paramq.k())
          localp = ((com.zend.ide.cb.f)localObject).b(paramq.h());
        com.zend.ide.cb.a.v localv = new com.zend.ide.cb.a.v(paramq, (com.zend.ide.cb.f)localObject, localp, paramv, paramBoolean2, this);
        try
        {
          do
            localv.b(localo.b());
          while (localo.a(2));
        }
        catch (AbstractMethodError localAbstractMethodError)
        {
        }
        catch (Throwable localThrowable)
        {
        }
        a(localv, paramBoolean1);
      }
      else
      {
        localObject = " ";
        int i4 = localo.a();
        if (i4 > -1)
          if (i4 == 1)
            a(paramq, i4 + (String)localObject + ct.a(1467), true);
          else if (localo.b().a())
            a(paramq, i4 + (String)localObject + ct.a(1468), true);
          else
            a(paramq, ct.a(1557), true);
      }
    }
    catch (SQLException localSQLException)
    {
      if (paramBoolean2)
      {
        a(paramString, paramq, paramv, paramBoolean1, false, true);
      }
      else
      {
        if (paramBoolean3)
          throw localSQLException;
        a(paramq, localSQLException, true);
      }
    }
  }

  public void a(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return;
    int i1 = paramString.charAt(paramString.length() - 1);
    if ((i1 != 10) && (i1 != 13))
      paramString = paramString + b;
    d().b(paramString);
    if (paramBoolean)
    {
      a().b(true);
      a().b();
    }
  }

  public void a(q paramq, String paramString, boolean paramBoolean)
  {
    if (paramq != null)
      a(paramq.a() + " --> " + paramString, paramBoolean);
    else
      a(paramString, paramBoolean);
  }

  public void a(q paramq, com.zend.ide.cb.f paramf, p paramp)
    throws SQLException
  {
    if (paramq == null)
      return;
    String str1 = paramf != null ? paramf.a() : null;
    String str2 = paramp != null ? paramp.a() : null;
    paramq.a(str1, str2);
  }

  public void a(q paramq, com.zend.ide.cb.f paramf, p paramp, boolean paramBoolean)
  {
    if (paramBoolean)
      this.l.a(true);
    c().a(paramq, paramf, paramp);
    this.l.c();
  }

  public static void a(q paramq, String paramString, Component paramComponent)
  {
    String str = "";
    if (paramq != null)
      str = paramq.a() + ' ';
    mb.a(a(paramq, paramString), paramComponent, str + ct.a(1469), 0);
  }

  public void a(q paramq, Throwable paramThrowable, boolean paramBoolean)
  {
    if (a().a())
      a(paramq, a(paramq, paramThrowable.getMessage()), paramBoolean);
    else
      mb.a(a(paramq, paramThrowable.getMessage()), com.zend.ide.bd.c.b().h(), paramq.a() + " - " + ct.a(1486), 0);
  }

  public void b(q paramq, String paramString, boolean paramBoolean)
  {
    if (a().a())
      a(paramq, a(paramq, paramString), paramBoolean);
    else
      mb.a(a(paramq, paramString), com.zend.ide.bd.c.b().h(), paramq.a() + " - " + ct.a(1486), 0);
  }

  public static String a(q paramq, String paramString)
  {
    if (paramString == null)
      return null;
    paramString = paramString.replaceAll("java.sql.SQLException: ", "");
    paramString = paramString.replaceAll("java.net.", "");
    paramString = paramString.replaceAll("NoRouteToHostException:", "");
    paramString = paramString.replaceAll("java.lang.IllegalArgumentException:", "");
    if (paramq != null)
    {
      String str = paramq.l().j();
      int i1;
      if ("MySQL".equals(str))
      {
        i1 = paramString.indexOf("** ");
        if (i1 > 0)
          paramString = paramString.substring(0, i1 - 1);
        paramString = paramString.replaceAll("at the following location:", "");
      }
      else if ("PostgreSQL".equals(str))
      {
        i1 = paramString.indexOf("Stack");
        if (i1 > 0)
          paramString = paramString.substring(0, i1);
        if (paramString.startsWith("org.postgresql."))
        {
          i1 = paramString.indexOf(": ");
          if (i1 > 0)
            paramString = paramString.substring(i1 + 2);
        }
        paramString = paramString.replaceAll("org.postgresql.util.PSQLException:", "");
      }
      else if (("Cloudscape".equals(str)) || ("DB2".equals(str)) || ("DB2/400".equals(str)))
      {
        if (paramString.startsWith("com.ibm."))
        {
          i1 = paramString.indexOf(": ");
          if (i1 > 0)
            paramString = paramString.substring(i1 + 2);
        }
        String[] arrayOfString = paramString.split(",");
        if ((arrayOfString.length == 3) && (arrayOfString[1].trim().equals("0")) && (arrayOfString[2].trim().startsWith("is not allowed")))
          if (arrayOfString[0].equals("userid length"))
            paramString = ct.a(1811);
          else if (arrayOfString[0].equals("password length"))
            paramString = ct.a(1812);
      }
      else if ("SQLite".equals(str))
      {
        paramString = paramString.replaceAll("SQLite.Exception: ", "");
      }
    }
    return paramString;
  }

  public void a(com.zend.ide.cb.x paramx)
  {
    switch (paramx.a())
    {
    case 0:
      paramx.b().a(this);
      if (paramx.b().a(true))
        this.l.a(true);
      this.l.c(true);
      break;
    case 1:
      c().b(paramx.b());
      paramx.b().b(this);
      SwingUtilities.invokeLater(new fb(this));
    }
  }

  public void a(com.zend.ide.cb.y paramy)
  {
    c().a((q)paramy.getSource());
    if (c().c())
    {
      this.l.a(true);
      this.l.c(true);
    }
  }

  public void b(com.zend.ide.cb.y paramy)
  {
    if (this.d == null)
      return;
    c().b((q)paramy.getSource());
    if (!c().c())
    {
      this.l.a(false);
      this.l.c(false);
    }
    if (paramy.a())
      SwingUtilities.invokeLater(new nb(this, paramy));
  }

  public void c(com.zend.ide.cb.y paramy)
  {
    c().c((q)paramy.getSource());
  }

  private static void i()
  {
    t localt = t.a();
    localt.a("Oracle", new com.zend.ide.cb.c.a.b());
    localt.a("MSSQL", new com.zend.ide.cb.c.b.b());
    localt.a("PostgreSQL", new com.zend.ide.cb.c.c.b());
    if (cr.c() != 3)
      localt.a("SQLite", new d());
    localt.a("MySQL", new com.zend.ide.cb.c.d.b());
    localt.a("Cloudscape", new com.zend.ide.cb.c.e.b());
    localt.a("DB2", new com.zend.ide.cb.c.bb.a());
    localt.a("DB2/400", new com.zend.ide.cb.c.mb.a());
    if (j);
  }

  private void j()
  {
    if (!com.zend.ide.util.f.a.a.b())
      m();
  }

  public boolean k()
  {
    return this.o;
  }

  public int a()
  {
    return this.p;
  }

  public void a(Integer paramInteger)
  {
    com.zend.ide.y.b.a("sql.pageSize").a(paramInteger);
  }

  public String b()
  {
    return this.q;
  }

  public String a()
  {
    return u;
  }

  public void l()
  {
    if (this.f == null)
      return;
    File localFile1 = new File(a, "sql");
    Object localObject;
    if (!localFile1.exists())
    {
      localFile1.mkdirs();
    }
    else
    {
      localObject = localFile1.listFiles(new cb(null));
      for (int i1 = 0; i1 < localObject.length; i1++)
        localObject[i1].delete();
    }
    q[] arrayOfq = this.f.a();
    for (int i2 = 0; i2 < arrayOfq.length; i2++)
    {
      com.zend.ide.cb.e locale = new com.zend.ide.cb.e(arrayOfq[i2]);
      File localFile2 = new File(localFile1, a(locale));
      localObject = localFile2.getPath();
      try
      {
        com.a.f.a((String)localObject, locale);
      }
      catch (IOException localIOException)
      {
        cl.a(localIOException);
      }
    }
  }

  private static String a(com.zend.ide.cb.e parame)
  {
    String str = "";
    if (parame.k().length() > 0)
    {
      str = parame.k();
      str = str.replaceAll("\\\\", "_");
      str = str.replaceAll("/", "_");
      str = str.replaceAll(":", "");
    }
    return str + ".xml";
  }

  private void m()
  {
    t localt = t.a();
    File localFile1 = new File(a, "sql");
    if (localFile1.exists())
    {
      File[] arrayOfFile = localFile1.listFiles(new cb(null));
      if ((arrayOfFile != null) && (arrayOfFile.length > 0))
        for (int i1 = 0; i1 < arrayOfFile.length; i1++)
        {
          File localFile2 = arrayOfFile[i1];
          try
          {
            com.zend.ide.cb.e locale = (com.zend.ide.cb.e)com.a.f.a(localFile2.getPath());
            this.f.a(localt.a(locale));
          }
          catch (Throwable localThrowable)
          {
            cl.a(localThrowable);
          }
        }
    }
  }

  public static void n()
  {
    ArrayList localArrayList = new ArrayList();
    g.a(new File("jdbc/sqlite/").getAbsolutePath());
    File localFile = new File("jdbc");
    a(localFile, localArrayList, new gb(null));
    URL[] arrayOfURL = new URL[localArrayList.size()];
    localArrayList.toArray(arrayOfURL);
    g.a(arrayOfURL);
  }

  private static void a(File paramFile, List paramList, FileFilter paramFileFilter)
  {
    if (paramFile.isDirectory())
    {
      File[] arrayOfFile = paramFile.listFiles(paramFileFilter);
      for (int i1 = 0; i1 < arrayOfFile.length; i1++)
        a(arrayOfFile[i1], paramList, paramFileFilter);
    }
    else
    {
      try
      {
        paramList.add(paramFile.toURL());
      }
      catch (MalformedURLException localMalformedURLException)
      {
        cl.a("Error while loading drivers");
        cl.a(localMalformedURLException);
      }
    }
  }

  public void a(String paramString)
  {
    this.h.c(paramString);
  }

  public void c()
  {
    if (this.d != null)
      this.d.c();
  }

  public Action b()
  {
    return this.n.a();
  }

  public Action c()
  {
    return this.n.b();
  }

  static void a(w paramw)
  {
    paramw.j();
  }

  static db a(w paramw, db paramdb)
  {
    return paramw.n = paramdb;
  }

  static com.zend.ide.cb.u b(w paramw)
  {
    return paramw.f;
  }

  static db c(w paramw)
  {
    return paramw.n;
  }

  static cd d(w paramw)
  {
    return paramw.v;
  }

  static com.zend.ide.cb.a.kb a(w paramw)
  {
    return paramw.l;
  }

  static void a(w paramw, String paramString, q paramq, com.zend.ide.cb.v paramv, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    throws SQLException
  {
    paramw.a(paramString, paramq, paramv, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  static com.zend.ide.cb.a.n b(w paramw)
  {
    return paramw.d;
  }

  static boolean a(w paramw, boolean paramBoolean)
  {
    return paramw.o = paramBoolean;
  }

  static int a(w paramw, int paramInt)
  {
    return paramw.p = paramInt;
  }

  static String a(w paramw, String paramString)
  {
    return paramw.q = paramString;
  }

  static boolean b(w paramw, boolean paramBoolean)
  {
    return paramw.r = paramBoolean;
  }

  static int c(w paramw)
  {
    return paramw.s;
  }

  static int b(w paramw, int paramInt)
  {
    return paramw.s = paramInt;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.w
 * JD-Core Version:    0.6.0
 */