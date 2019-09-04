package com.zend.ide.s;

import com.zend.ide.util.cl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

class r
  implements ActionListener
{
  private Timer a = new Timer(0, this);
  private boolean b;
  private boolean c = false;
  private int d;
  private int e;
  private m f;
  final o g;

  public r(o paramo)
  {
  }

  public void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, m paramm)
  {
    a();
    this.b = paramBoolean;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramm;
    this.a.setInitialDelay(paramInt1);
    this.c = false;
    this.a.start();
  }

  public void a()
  {
    if (!this.c)
    {
      this.c = true;
      this.a.stop();
    }
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      c();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    o.a(this.g).a();
  }

  private void c()
  {
    if (this.c)
      return;
    z localz = this.f.a(this.e, this.d, this.b);
    if ((!this.b) && ((localz == null) || (localz.r() == null) || (localz.r().length >= this.f.b())))
      return;
    if (this.c)
      return;
    this.g.a(localz);
    if (this.c)
      return;
    this.g.a(this.b);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.r
 * JD-Core Version:    0.6.0
 */