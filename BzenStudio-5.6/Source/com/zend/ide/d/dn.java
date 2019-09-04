package com.zend.ide.d;

import com.zend.ide.n.gz;
import com.zend.ide.n.hl;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.w.a.t;
import com.zend.ide.w.b.bs;
import com.zend.ide.w.b.h;
import com.zend.ide.w.b.j;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.Reader;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.text.DefaultCaret;

public class dn extends dm
{
  private bs c;
  private Reader d;
  private String e;
  private dt f;
  private JPanel g;
  private boolean h;

  public dn(dc paramdc, Reader paramReader, String paramString, ArrayList paramArrayList)
  {
    super(paramdc, paramArrayList);
    this.d = paramReader;
    this.e = paramString;
    g();
  }

  public void h()
  {
    if (this.c == null)
      return;
    this.c.repaint();
  }

  protected void k()
  {
    cg localcg = j();
    if (localcg != null)
    {
      String str = localcg.b();
      co localco = c();
      this.f.setBackground(localco.b(str));
      if (this.c != null)
      {
        this.c.e().a(localco.n());
        this.c.e().c(localco.o());
        this.c.e().b(localco.p());
      }
    }
  }

  protected void a(hl paramhl)
  {
    if (this.c != null)
    {
      ((gz)this.c.c()).a(paramhl);
      ((gz)this.c.d()).a(paramhl);
    }
  }

  protected void a(Font paramFont)
  {
    if (this.c != null)
    {
      ((gz)this.c.c()).setFont(paramFont);
      ((gz)this.c.d()).setFont(paramFont);
    }
  }

  protected void a(Color paramColor)
  {
    if (this.c != null)
    {
      ((gz)this.c.c()).setBackground(paramColor);
      ((gz)this.c.d()).setBackground(paramColor);
    }
  }

  protected void b(Color paramColor)
  {
  }

  protected JPanel f()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout(0, 0));
    localJPanel1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(ct.a(1304)), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    z localz = new z(ct.a(1169));
    this.f = new dt(this);
    this.f.addMouseListener(new dl(this, null));
    this.f.setOpaque(true);
    this.f.setPreferredSize(new Dimension(60, 25));
    JPanel localJPanel2 = new JPanel(new FlowLayout(1, 5, 5));
    localJPanel2.add(localz);
    localJPanel2.add(this.f);
    localJPanel1.add(localJPanel2, "Center");
    return localJPanel1;
  }

  protected JPanel i()
  {
    JPanel localJPanel = new JPanel(new BorderLayout());
    localJPanel.setBorder(BorderFactory.createTitledBorder(ct.a(1161)));
    this.g = localJPanel;
    return localJPanel;
  }

  private void g()
  {
    this.c = new bs();
    gz localgz1 = (gz)this.c.c();
    gz localgz2 = (gz)this.c.d();
    localgz1.d("No Context");
    localgz2.d("No Context");
    localgz1.setCaret(new DefaultCaret());
    localgz2.setCaret(new DefaultCaret());
    localgz1.addMouseMotionListener(new df(this, null));
    localgz2.addMouseMotionListener(new dg(this, null));
    localgz1.addMouseListener(new cj(this, null));
    localgz2.addMouseListener(new cw(this, null));
    JPanel localJPanel = this.c.b();
    localJPanel.setPreferredSize(new Dimension(450, 200));
    this.g.add(localJPanel, "Center");
  }

  private cg j()
  {
    return (cg)this.a.getSelectedValue();
  }

  public void repaint()
  {
    super.repaint();
    if ((isShowing()) && (!this.h))
    {
      this.h = true;
      this.c.a(new t(), this.d, this.e, null, false);
    }
  }

  private int a(j paramj)
  {
    int i = -1;
    if (paramj != null)
      switch (paramj.f())
      {
      case 1:
        i = 0;
        break;
      case 0:
        i = 1;
        break;
      case 2:
        i = 2;
      }
    return i;
  }

  static cg a(dn paramdn)
  {
    return paramdn.j();
  }

  static bs b(dn paramdn)
  {
    return paramdn.c;
  }

  static int a(dn paramdn, j paramj)
  {
    return paramdn.a(paramj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.dn
 * JD-Core Version:    0.6.0
 */