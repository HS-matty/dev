package com.zend.ide.cb.a;

import com.zend.ide.cb.c.w;
import com.zend.ide.cb.q;
import com.zend.ide.cb.z;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class sc extends JPanel
  implements k
{
  private String a;
  private w b;
  private ArrayList c;
  private GridBagConstraints d;

  public sc(String paramString, w paramw)
  {
    this.a = paramString;
    this.b = paramw;
    this.c = new ArrayList();
    a();
  }

  public sc(w paramw)
  {
    this("infoPanel", paramw);
  }

  public void a(ResultSet paramResultSet, q paramq)
    throws SQLException
  {
    if (paramResultSet != null)
      a(paramResultSet, paramq, false, false);
  }

  public void a(ResultSet paramResultSet, q paramq, boolean paramBoolean1, boolean paramBoolean2)
    throws SQLException
  {
    b();
    if (paramResultSet == null)
      return;
    x localx = new x(this.b, paramq, true, false);
    localx.a(d());
    localx.a(new z(paramResultSet), 2147483647, null, paramBoolean1);
    Statement localStatement = null;
    if (paramResultSet != null)
    {
      if (!localx.d())
        localx.a(2147483647);
      try
      {
        localStatement = paramResultSet.getStatement();
      }
      catch (Throwable localThrowable1)
      {
      }
      localx.a();
    }
    this.c.add(localx);
    if ((paramBoolean2) && (localStatement != null))
      try
      {
        if (localStatement != null)
          try
          {
            while (localStatement.getMoreResults(2))
            {
              localx = new x(this.b, paramq, true, false);
              localx.a(d());
              localx.a(getBackground());
              localx.a(new z(localStatement.getResultSet()), 2147483647, null, paramBoolean1);
              this.c.add(localx);
              if ((!paramBoolean1) || (localx.d()))
                continue;
              localx.a(2147483647);
            }
          }
          catch (Throwable localThrowable2)
          {
            if ((!paramBoolean1) && (!localx.d()))
              localx.a(2147483647);
            while (localStatement.getMoreResults())
            {
              localx = new x(this.b, paramq, true, false);
              localx.a(d());
              localx.a(getBackground());
              localx.a(new z(localStatement.getResultSet()), 2147483647, null, paramBoolean1);
              this.c.add(localx);
              if (localx.d())
                continue;
              localx.a(2147483647);
            }
          }
      }
      catch (SQLException localSQLException)
      {
      }
    for (int i = 0; i < this.c.size(); i++)
    {
      add(((x)this.c.get(i)).a(), this.d);
      this.d.gridy += 1;
    }
  }

  private void a()
  {
    this.d = new GridBagConstraints();
    this.d.gridy = 0;
    this.d.gridx = 0;
    this.d.weightx = 1.0D;
    this.d.weighty = 1.0D;
    this.d.fill = 1;
    setLayout(new GridBagLayout());
  }

  public JComponent a()
  {
    return this;
  }

  public void c()
  {
    for (int i = 0; i < this.c.size(); i++)
      ((x)this.c.get(i)).c();
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public String d()
  {
    return this.a;
  }

  public boolean e()
  {
    return requestFocusInWindow();
  }

  public void setBackground(Color paramColor)
  {
    super.setBackground(paramColor);
    if (this.c != null)
      for (int i = 0; i < this.c.size(); i++)
        ((x)this.c.get(i)).a(paramColor);
  }

  public void b()
  {
    c();
    this.c.clear();
    removeAll();
    validate();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.sc
 * JD-Core Version:    0.6.0
 */