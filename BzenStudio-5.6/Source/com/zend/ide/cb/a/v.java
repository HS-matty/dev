package com.zend.ide.cb.a;

import com.zend.ide.cb.c.w;
import com.zend.ide.cb.e;
import com.zend.ide.cb.f;
import com.zend.ide.cb.h;
import com.zend.ide.cb.n;
import com.zend.ide.cb.o;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.cb.z;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class v
  implements k
{
  private JPanel a;
  private ArrayList b;
  private hd c;
  private id d;
  private JComponent e;
  private GridBagConstraints f;
  private n g;
  private f h;
  private p i;
  private com.zend.ide.cb.v j;
  private boolean k;
  private w l;
  private q m;
  private String o;
  private rd n;
  private static ImageIcon p = cv.b("sql/tableLocked.gif");
  private static ImageIcon q = cv.b("sql/tableUnlocked.gif");
  private static ImageIcon r = cv.b("sql/tableDelete.gif");
  private static ImageIcon s = cv.b("sql/tableInsert.gif");

  public v(q paramq, f paramf, p paramp, com.zend.ide.cb.v paramv, boolean paramBoolean, w paramw)
  {
    this.m = paramq;
    this.h = paramf;
    this.i = paramp;
    this.j = paramv;
    this.k = paramBoolean;
    this.l = paramw;
    a(new ArrayList(4));
    if (this.j != null)
      this.o = paramv.a();
    else
      this.o = "";
    b();
  }

  public JComponent a()
  {
    return o();
  }

  public void c()
  {
    if (m() != null)
      for (int i1 = 0; i1 < i(); i1++)
      {
        x localx = (x)m().get(i1);
        localx.c();
      }
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
    return o().requestFocusInWindow();
  }

  public void a(n paramn)
  {
    this.g = paramn;
  }

  public void a(Color paramColor)
  {
    for (int i1 = 0; i1 < i(); i1++)
    {
      x localx = (x)m().get(i1);
      localx.a(paramColor);
    }
    k().setBackground(paramColor);
    l().setBackground(paramColor);
    n().setBackground(paramColor);
  }

  public boolean a()
  {
    return i() == 1;
  }

  private void b()
  {
    d();
    a(new hd(this));
    a(new id(this));
    a(new gd(this, new BorderLayout()));
    o().add(k(), "Center");
    o().add(l(), "North");
    o().add(n(), "South");
  }

  protected void d()
  {
    this.f = new GridBagConstraints();
    this.f.gridy = 0;
    this.f.gridx = 0;
    this.f.weightx = 1.0D;
    this.f.weighty = 1.0D;
    this.f.fill = 1;
    a(new JPanel(new GridBagLayout()));
  }

  public void a(boolean paramBoolean)
    throws SQLException
  {
    if ((this.g != null) && (m().size() > 0))
    {
      x localx = (x)m().get(0);
      o localo = this.m.m();
      int i1 = localx.e() - 1;
      if (!paramBoolean)
        a();
      z localz = null;
      try
      {
        localz = localo.a(this.g, i1, j(), true);
      }
      catch (SQLException localSQLException)
      {
        a();
        localz = localo.a(this.g, i1, j(), true);
      }
      localx.a(localz, j(), this.j, false);
      h();
    }
  }

  private void a()
    throws SQLException
  {
    if (this.j != null)
    {
      String str1 = b();
      String str2 = this.m.m().c();
      String str3 = this.m.m().d();
      String str4 = "";
      if (this.m.l().j().equals("PostgreSQL"))
      {
        String str5 = this.m.m().a();
        String str6;
        if (this.m.k())
          str6 = this.j.b().a();
        else
          str6 = this.j.a().a();
        str4 = "SELECT " + str1 + " FROM " + str2 + str6 + str3 + str5 + str2 + this.j.a() + str3;
      }
      else
      {
        str4 = "SELECT " + str1 + " FROM " + str2 + this.j.a() + str3;
      }
      this.g.a(str4);
    }
  }

  private String b()
    throws SQLException
  {
    if (this.j == null)
      return "*";
    o localo = this.j.c().m();
    if ((!this.k) || (!localo.e()))
      return "*";
    String str1 = localo.c();
    String str2 = localo.d();
    StringBuffer localStringBuffer = new StringBuffer();
    try
    {
      this.j.d();
    }
    catch (SQLException localSQLException)
    {
      if (!this.j.c().a(true))
        throw localSQLException;
    }
    h[] arrayOfh = this.j.d();
    if (arrayOfh.length == 0)
      return "*";
    for (int i1 = 0; i1 < arrayOfh.length; i1++)
    {
      localStringBuffer.append(str1);
      localStringBuffer.append(arrayOfh[i1].a());
      localStringBuffer.append(str2);
      localStringBuffer.append(", ");
    }
    if (localStringBuffer.length() > 2)
      localStringBuffer.delete(localStringBuffer.length() - 2, localStringBuffer.length());
    return localStringBuffer.toString();
  }

  public void f()
    throws SQLException
  {
    a(-1);
  }

  public void g()
    throws SQLException
  {
    a(1);
  }

  private void a(int paramInt)
    throws SQLException
  {
    if (!a())
      return;
    x localx = (x)m().get(0);
    int i1 = paramInt < 0 ? -1 : 1;
    o localo = this.m.m();
    int i2 = localx.e();
    int i3;
    if (i1 > 0)
      i3 = i2 + localx.b() - 1;
    else
      i3 = Math.max(i2 - j() - 1, 0);
    a();
    z localz = localo.a(this.g, i3, j(), false);
    localx.a(localz, j(), this.j, false);
    h();
  }

  protected void h()
  {
    if (!a())
    {
      l().c(false);
      l().b(false);
    }
    else
    {
      x localx = (x)m().get(0);
      int i1 = localx.e();
      l().c(i1 > 1);
      l().b(localx.b() >= j());
      n().a(localx.b(), i1, i1 + localx.b() - 1);
    }
  }

  public void b(n paramn)
    throws SQLException
  {
    a(paramn);
    x localx = new x(this.l, this.m, true, this.k);
    localx.a(new z(paramn.e()), j(), this.j, false);
    m().add(localx);
    k().add(localx.a(), this.f);
    this.f.gridy += 1;
    k().validate();
    o().validate();
    h();
    if (i() > 1)
    {
      l().d(false);
      n().a(ct.a(1490));
    }
    else
    {
      l().d(true);
    }
  }

  public int i()
  {
    return m().size();
  }

  public int j()
  {
    return this.l.a();
  }

  public void a(Integer paramInteger)
  {
    this.l.a(paramInteger);
  }

  public JComponent k()
  {
    return this.e;
  }

  public void a(JComponent paramJComponent)
  {
    this.e = paramJComponent;
  }

  public hd l()
  {
    return this.c;
  }

  public void a(hd paramhd)
  {
    this.c = paramhd;
  }

  public ArrayList m()
  {
    return this.b;
  }

  public void a(ArrayList paramArrayList)
  {
    this.b = paramArrayList;
  }

  public id n()
  {
    return this.d;
  }

  public void a(id paramid)
  {
    this.d = paramid;
  }

  public JPanel o()
  {
    return this.a;
  }

  public void a(JPanel paramJPanel)
  {
    this.a = paramJPanel;
  }

  static rd a(v paramv, rd paramrd)
  {
    return paramv.n = paramrd;
  }

  static rd a(v paramv)
  {
    return paramv.n;
  }

  static q b(v paramv)
  {
    return paramv.m;
  }

  static w a(v paramv)
  {
    return paramv.l;
  }

  static ImageIcon q()
  {
    return p;
  }

  static ImageIcon r()
  {
    return q;
  }

  static ImageIcon s()
  {
    return r;
  }

  static ImageIcon a()
  {
    return s;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.v
 * JD-Core Version:    0.6.0
 */