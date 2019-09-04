package com.zend.ide.hb;

import com.zend.ide.util.cl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

class oc
  implements ActionListener
{
  private Timer a = new Timer(0, this);
  private boolean b = false;
  private String c;
  final wc d;

  public oc(wc paramwc)
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
      SwingUtilities.invokeLater(new pc(this));
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    wc.g(this.d).a();
  }

  static String a(oc paramoc)
  {
    return paramoc.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.oc
 * JD-Core Version:    0.6.0
 */