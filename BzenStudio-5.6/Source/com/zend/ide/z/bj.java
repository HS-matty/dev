package com.zend.ide.z;

import com.zend.ide.p.eb;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

abstract class bj extends JPanel
{
  n a;
  n[] e;
  eb b;
  DefaultTableModel c;
  protected boolean f = false;
  protected boolean g = false;
  final bi d;

  public bj(bi parambi)
  {
    super(new BorderLayout());
  }

  public eb a()
  {
    return this.b;
  }

  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  protected void c()
  {
    if ((this.g) && (this.e != null))
    {
      d();
      for (int i = 0; i < this.e.length; i++)
      {
        if (this.e[i] == null)
          continue;
        a(this.e[i].c());
      }
    }
    else if (this.a != null)
    {
      d();
      a(this.a.c());
    }
  }

  public void a(n paramn)
  {
    this.a = paramn;
    c();
  }

  public void a(n[] paramArrayOfn)
  {
    this.e = paramArrayOfn;
    c();
  }

  public void e()
  {
    c();
  }

  public abstract void a(r[] paramArrayOfr);

  protected abstract void d();
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bj
 * JD-Core Version:    0.6.0
 */