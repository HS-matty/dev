package com.zend.ide.n;

import com.zend.ide.n.td.bc;
import com.zend.ide.n.td.jb;
import com.zend.ide.p.cd;
import com.zend.ide.util.bp;
import com.zend.ide.util.cl;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseWheelListener;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class dm extends dl
{
  private boolean h = bc.b();
  private JPanel d = new JPanel();
  private gz c;
  private JScrollPane e;
  protected gv g;
  protected mg i;
  private gs k;
  private iz f;
  private f j;
  private e l;

  public dm()
  {
    this.d.setFocusable(false);
    this.d.setLayout(new BorderLayout());
    a();
    this.c = new ik(null);
    a(this.c);
    bp.a(this.c);
    this.e = new cd(this.c.c());
    this.e.setFocusable(false);
    try
    {
      MouseWheelListener localMouseWheelListener = this.e.getMouseWheelListeners()[0];
      this.e.removeMouseWheelListener(localMouseWheelListener);
      this.e.addMouseWheelListener(new iq(this, localMouseWheelListener));
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    this.k = new gs(this, null);
    this.g = new gv(this.c);
    this.f = new iz(this);
    if (this.h)
    {
      JPanel localJPanel = new JPanel(new BorderLayout());
      this.i = new mg(this.c, this.k);
      localJPanel.add(this.g, "Center");
      localJPanel.add(this.i, "East");
      this.e.setRowHeaderView(localJPanel);
      this.c.a().a(this.f);
    }
    else
    {
      this.e.setRowHeaderView(this.g);
    }
    C().addMouseListener(this.k);
    this.d.add(this.e, "Center");
    this.d.add(this.f, "East");
    if (this.i != null)
      this.i.getParent().addMouseWheelListener(new lf(this, null));
  }

  private void a()
  {
    this.j = new f();
    this.j.a("editing.foldingEnabled", new kf(this));
    this.l = new e(this.j);
    this.l.a("editing.foldingEnabled");
  }

  public void d(boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean)
    {
      if (this.i == null)
      {
        localObject = new JPanel(new BorderLayout());
        this.i = new mg(this.c, this.k);
        ((JPanel)localObject).add(this.g, "Center");
        ((JPanel)localObject).add(this.i, "East");
        this.e.setRowHeaderView((Component)localObject);
        this.i.getParent().addMouseWheelListener(new lf(this, null));
        this.c.a().b(this.f);
        this.c.a().a(this.f);
      }
    }
    else if (this.i != null)
    {
      this.e.setRowHeaderView(this.g);
      this.i = null;
      localObject = this.c.a();
      if (localObject != null)
        ((jb)localObject).b(this.f);
    }
  }

  public void a(boolean paramBoolean)
  {
    if (this.f.isVisible() == paramBoolean)
      return;
    if (this.h)
      if (paramBoolean)
      {
        this.c.a().b(this.f);
        this.c.a().a(this.f);
      }
      else
      {
        jb localjb = this.c.a();
        if (localjb != null)
          localjb.b(this.f);
      }
    this.f.setVisible(paramBoolean);
    this.d.validate();
  }

  public dz[] c(String paramString)
  {
    if (paramString.equals(k()))
      return new dz[] { this };
    return null;
  }

  public dz a(String paramString)
  {
    return paramString.equals(k()) ? this : null;
  }

  private JComponent C()
  {
    return this.g;
  }

  public JComponent c()
  {
    return this.d;
  }

  public void grabFocus()
  {
    this.d.grabFocus();
    this.e.grabFocus();
    super.grabFocus();
  }

  public void repaint()
  {
    this.d.repaint();
  }

  public void a(String paramString, is paramis, int paramInt)
  {
    if (k().equals(paramString))
      this.f.a(paramis);
  }

  public void a(String paramString, is paramis)
  {
    if (k().equals(paramString))
      this.f.b(paramis);
  }

  public JScrollPane o()
  {
    return this.e;
  }

  public bw a()
  {
    return this.c;
  }

  static gz a(dm paramdm)
  {
    return paramdm.c;
  }

  static boolean a(dm paramdm, boolean paramBoolean)
  {
    return paramdm.h = paramBoolean;
  }

  static boolean a(dm paramdm)
  {
    return paramdm.h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.dm
 * JD-Core Version:    0.6.0
 */