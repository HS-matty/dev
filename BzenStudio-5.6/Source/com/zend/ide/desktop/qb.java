package com.zend.ide.desktop;

import com.zend.ide.l.v;
import java.io.File;
import javax.swing.JFrame;

public class qb extends ob
{
  final cj f;

  public qb(cj paramcj)
  {
    super(paramcj, null);
  }

  public void run()
  {
    synchronized (this.f)
    {
      if (b())
        c();
      else
        a();
      this.f.o.setVisible(true);
      this.f.o.setState(0);
    }
  }

  private boolean b()
  {
    return this.b.getPath().endsWith("zpj");
  }

  private void c()
  {
    this.f.l().a(this.b);
    this.f.Y();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.qb
 * JD-Core Version:    0.6.0
 */