package com.zend.ide.cb.a;

import com.zend.ide.bd.c;
import com.zend.ide.cb.c.w;
import com.zend.ide.cb.q;
import com.zend.ide.util.ct;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;

public class uc extends JTabbedPane
  implements k
{
  private w a;
  private q b;
  private ArrayList c;
  private String d;

  public uc(w paramw, q paramq)
  {
    this.a = paramw;
    this.b = paramq;
    this.c = new ArrayList(3);
    this.d = "serverInfo";
    a();
  }

  private void a()
  {
    sc localsc = new sc("statusTable", this.a);
    try
    {
      localsc.a(this.b.d(), this.b, false, true);
      addTab(ct.a(1500), localsc);
      this.c.add(localsc);
    }
    catch (SQLException localSQLException1)
    {
      a(localSQLException1);
    }
    localsc = new sc("variablesTable", this.a);
    try
    {
      localsc.a(this.b.e(), this.b, false, true);
      addTab(ct.a(1501), localsc);
      this.c.add(localsc);
    }
    catch (SQLException localSQLException2)
    {
      a(localSQLException2);
    }
    localsc = new sc("processTable", this.a);
    try
    {
      localsc.a(this.b.f(), this.b, false, true);
      addTab(ct.a(1502), localsc);
      this.c.add(localsc);
    }
    catch (SQLException localSQLException3)
    {
      a(localSQLException3);
    }
  }

  private void a(SQLException paramSQLException)
  {
    if (this.b.a(true))
      this.a.a(this.b, paramSQLException, true);
    else
      w.a(this.b, w.a(this.b, paramSQLException.getMessage()), c.b().h());
  }

  public JComponent a()
  {
    return this;
  }

  public void c()
  {
    for (int i = 0; i < this.c.size(); i++)
      ((sc)this.c.get(i)).c();
  }

  public void a(String paramString)
  {
    this.d = paramString;
  }

  public String d()
  {
    return this.d;
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
        ((sc)this.c.get(i)).setBackground(paramColor);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.uc
 * JD-Core Version:    0.6.0
 */