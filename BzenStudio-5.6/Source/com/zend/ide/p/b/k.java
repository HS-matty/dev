package com.zend.ide.p.b;

import com.zend.ide.i.n;
import com.zend.ide.p.w;
import com.zend.ide.p.z;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class k extends n
  implements cu
{
  private c c;
  private z d;
  private i e = new i(this);
  private j f = new j(this);
  private w g;
  private w h;
  private JPanel i;
  boolean j = false;
  boolean k = false;
  long l = 0L;

  public k()
  {
    super(com.zend.ide.bd.c.b().h());
    setDefaultCloseOperation(0);
    c();
    setResizable(true);
    B();
  }

  protected void b()
  {
  }

  public void a(c paramc)
  {
    this.c = paramc;
    setTitle(this.c.j());
    a(this.c.e());
    b(this.c.c());
    this.d.setAlignmentX(paramc.f());
    this.d.setText(paramc.a());
    doLayout();
    validate();
    pack();
    setSize(450, getPreferredSize().height);
    B();
  }

  public void b(String paramString)
  {
    this.e.putValue("Name", paramString);
  }

  private void c()
  {
    setModal(true);
    JPanel localJPanel = new JPanel();
    localJPanel.setBorder(BorderFactory.createEtchedBorder());
    localJPanel.setLayout(new BorderLayout());
    this.d = new z();
    this.d.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
    this.d.setPreferredSize(new Dimension(300, 60));
    localJPanel.add(this.d, "Center");
    this.i = new JPanel();
    this.i.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.i.setLayout(new BorderLayout(5, 5));
    this.h = new w();
    this.h.setAction(this.e);
    b(true);
    this.g = new w();
    this.g.setAction(this.f);
    a(true);
    localJPanel.add(this.i, "East");
    getContentPane().add(localJPanel);
  }

  private void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (!this.j)
      {
        this.i.add(this.g, "South");
        this.j = true;
      }
    }
    else if (this.j)
    {
      this.i.remove(this.g);
      this.j = false;
    }
  }

  private void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (!this.k)
      {
        this.i.add(this.h, "Center");
        this.k = true;
      }
    }
    else if (this.k)
    {
      this.i.remove(this.h);
      this.k = false;
    }
  }

  public void a(String paramString)
  {
    long l1 = System.currentTimeMillis();
    if (l1 - this.l < 200L)
      return;
    this.l = l1;
    SwingUtilities.invokeLater(new d(this, paramString));
  }

  static z a(k paramk)
  {
    return paramk.d;
  }

  static c b(k paramk)
  {
    return paramk.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.b.k
 * JD-Core Version:    0.6.0
 */