package com.zend.ide.desktop;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class pb extends ob
{
  final cj f;

  public pb(cj paramcj)
  {
    super(paramcj, null);
  }

  public void run()
  {
    synchronized (this.f)
    {
      a();
      this.f.o.setVisible(true);
      this.f.o.setState(0);
    }
  }

  private void a()
  {
    boolean bool = a();
    if (bool)
      SwingUtilities.invokeLater(new p(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.pb
 * JD-Core Version:    0.6.0
 */