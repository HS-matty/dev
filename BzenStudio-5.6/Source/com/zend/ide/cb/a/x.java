package com.zend.ide.cb.a;

import com.zend.ide.cb.c.w;
import com.zend.ide.cb.q;
import com.zend.ide.cb.v;
import com.zend.ide.cb.z;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

public class x
  implements k
{
  private ae a;
  private pd b;
  private JScrollPane c;
  private JPanel d;
  private int e;
  private String f = "resultsPanel";
  private q g;
  private w h;
  private boolean i;
  private boolean j;

  public x(w paramw, q paramq, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.h = paramw;
    this.i = paramBoolean1;
    this.j = paramBoolean2;
    this.g = paramq;
    d();
  }

  public void a(z paramz, int paramInt, v paramv, boolean paramBoolean)
    throws SQLException
  {
    if (paramz.d())
    {
      this.e = 0;
    }
    else
    {
      int k = paramz.b();
      if (k <= 0)
        this.e = 1;
      else
        this.e = (k + 1);
    }
    this.a.a(paramz, paramInt, paramv, paramBoolean);
    this.b.u();
    this.b.a();
  }

  public boolean a()
  {
    return (this.a.b()) && (this.a.c());
  }

  public boolean a(boolean paramBoolean)
  {
    return this.a.a(paramBoolean);
  }

  public boolean b()
  {
    return this.a.d();
  }

  public boolean c()
  {
    return this.a.e();
  }

  public int b()
  {
    if (this.a == null)
      return 0;
    return this.a.getRowCount();
  }

  private void d()
  {
    this.d = new JPanel(new BorderLayout());
    this.a = new ae(this.i, this.j, this.h);
    this.b = new pd(this.h, this.g, this.a);
    this.b.a(d());
    this.c = new JScrollPane(this.b);
    this.d.add(this.c);
  }

  public void a(Color paramColor)
  {
    this.d.setBackground(paramColor);
    if ((this.b != null) && (this.c != null))
    {
      this.b.setBackground(paramColor);
      this.c.getViewport().setBackground(paramColor);
    }
  }

  public JComponent a()
  {
    return this.d;
  }

  public void c()
  {
    ae localae = new ae(this.i, this.j, this.h);
    this.e = 0;
    this.b.setModel(this.a);
    if (this.a != null)
    {
      this.a.a();
      this.a = localae;
    }
  }

  public void a(String paramString)
  {
    this.f = paramString;
    this.b.a(paramString);
  }

  public String d()
  {
    return this.f;
  }

  public boolean e()
  {
    return a().requestFocusInWindow();
  }

  public int e()
  {
    return this.e;
  }

  public void a(int paramInt)
    throws SQLException
  {
    if (this.a != null)
      this.a.a(paramInt);
  }

  public boolean d()
  {
    if (this.a != null)
      return this.a.a();
    return false;
  }

  public void a()
  {
    if (this.a != null)
      this.a.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.x
 * JD-Core Version:    0.6.0
 */