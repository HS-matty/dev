package com.zend.ide.cb.a;

import com.zend.ide.a.b;
import com.zend.ide.bc.a;
import com.zend.ide.bd.c;
import com.zend.ide.cb.c.w;
import com.zend.ide.cb.f;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.n.bd;
import com.zend.ide.n.dm;
import com.zend.ide.n.gz;
import com.zend.ide.n.hl;
import com.zend.ide.s.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;
import javax.swing.text.Keymap;

public class n
  implements k
{
  private dm a;
  private s b;
  private t c;
  private w e;
  private JPanel f;
  private String g;

  public n(w paramw)
  {
    this.e = paramw;
    this.g = "queryComponent";
    a();
  }

  private void a()
  {
    this.f = new JPanel(new BorderLayout());
    this.a = new dm();
    this.a.b("sqlQueryEditor.sql");
    this.a.a(false);
    b.a("SQLQueryComponent", this.a);
    this.b = new s(this, this.a);
    this.c = new t(this);
    JPanel localJPanel1 = new JPanel(new BorderLayout(10, 2));
    localJPanel1.add(this.c.a(), "East");
    JToolBar localJToolBar = new JToolBar("sqlToolbar", 1);
    localJToolBar.setRollover(true);
    localJToolBar.setFloatable(false);
    ec localec = new ec(this);
    JButton localJButton = new JButton(localec);
    localJButton.setToolTipText(ct.a(84) + "  (Ctrl+Enter)");
    localJToolBar.add(localJButton);
    this.a.e().getKeymap().addActionForKeyStroke(KeyStroke.getKeyStroke(10, 2), localec);
    localJButton = new JButton(new dc(this));
    localJButton.setToolTipText(ct.a(305));
    localJToolBar.add(localJButton);
    localJToolBar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.lightGray));
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(this.a.c());
    localJPanel2.add(localJToolBar, "East");
    localJPanel1.add(localJPanel2);
    JPanel localJPanel3 = new JPanel(new db());
    localJPanel3.add(new JPanel(), "divider");
    localJPanel3.add(localJPanel1, "top");
    localJPanel3.add(this.b.a(), "bottom");
    this.f.add(localJPanel3);
    d();
    a.a(this.a.o(), "SQL_QUERY_CONTROL");
  }

  private void d()
  {
    if ((this.a.q() instanceof com.zend.ide.util.s))
    {
      com.zend.ide.util.s locals = (com.zend.ide.util.s)this.a.q();
      qc localqc = new qc(this);
      locals.a("sql.properties", localqc, "textComponent", true);
    }
  }

  public JComponent a()
  {
    return this.f;
  }

  public void c()
  {
    this.b.c();
  }

  public void a(String paramString)
  {
    this.g = paramString;
  }

  public String d()
  {
    return this.g;
  }

  public boolean e()
  {
    this.a.grabFocus();
    return true;
  }

  public void a(q paramq)
  {
    this.c.a(paramq);
  }

  public void b(q paramq)
  {
    this.c.b(paramq);
  }

  public void c(q paramq)
  {
    this.c.c(paramq);
  }

  public void d(q paramq)
  {
    this.c.d(paramq);
  }

  public void a(q paramq, f paramf, p paramp)
  {
    if ((paramq != null) && (paramq.a(false)))
    {
      d(paramq);
      if (paramf != null)
      {
        this.c.a(paramf);
        if ((paramp != null) && (paramq.a()))
          this.c.a(paramp);
      }
    }
  }

  private void a(boolean paramBoolean)
  {
    try
    {
      this.e.a(this.c.b(), this.c.c(), this.c.d());
    }
    catch (SQLException localSQLException)
    {
      if (paramBoolean)
        mb.a(localSQLException, c.b().h(), ct.a(1486), 0);
    }
  }

  protected void b()
  {
    String str = this.a.getText();
    if ((!str.trim().equals("")) && (this.c.a()))
    {
      a(true);
      this.b.a(new r(str));
      try
      {
        this.e.a(str, this.c.b(), null, this.e.k(), false, true, false);
      }
      catch (SQLException localSQLException)
      {
      }
    }
  }

  public boolean c()
  {
    return this.c.a();
  }

  public void a(bn parambn)
  {
    if (parambn != null)
      this.a.a(parambn);
  }

  public void a(hl paramhl)
  {
    ((gz)this.a.a()).a(paramhl);
    this.a.repaint();
    bd localbd = paramhl.a(bb.bs);
    this.b.a(localbd.b());
  }

  public void a(Color paramColor)
  {
    this.b.b(paramColor);
  }

  public void a(int paramInt)
  {
    this.b.a(paramInt);
  }

  static dm a(n paramn)
  {
    return paramn.a;
  }

  static s b(n paramn)
  {
    return paramn.b;
  }

  static w c(n paramn)
  {
    return paramn.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.n
 * JD-Core Version:    0.6.0
 */