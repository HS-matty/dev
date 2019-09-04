package com.zend.ide.hb;

import com.zend.ide.util.cl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

class dc
  implements ActionListener
{
  private Timer a = new Timer(0, this);
  private boolean b = false;
  private String c;
  final rb d;

  public dc(rb paramrb)
  {
  }

  public void a(int paramInt, String paramString)
  {
    a();
    this.c = paramString;
    this.a.setInitialDelay(paramInt);
    this.b = false;
    this.a.start();
  }

  public void a()
  {
    if (!this.b)
    {
      this.b = true;
      this.a.stop();
    }
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      if (this.b)
        return;
      SwingUtilities.invokeLater(new ec(this));
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    rb.f(this.d).a();
  }

  static String a(dc paramdc)
  {
    return paramdc.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.dc
 * JD-Core Version:    0.6.0
 */