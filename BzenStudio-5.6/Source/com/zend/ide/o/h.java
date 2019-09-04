package com.zend.ide.o;

import com.zend.ide.util.cl;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SwingUtilities;

class h extends WindowAdapter
{
  final fi a;

  private h(fi paramfi)
  {
  }

  public void windowIconified(WindowEvent paramWindowEvent)
  {
    this.a.setVisible(false);
  }

  public void windowDeactivated(WindowEvent paramWindowEvent)
  {
    if (this.a.e)
    {
      this.a.e = false;
      SwingUtilities.invokeLater(new nb(this));
    }
  }

  private void a(int paramInt)
  {
    synchronized (this)
    {
      try
      {
        wait(paramInt);
      }
      catch (InterruptedException localInterruptedException)
      {
        cl.a(localInterruptedException);
      }
    }
  }

  h(fi paramfi, be parambe)
  {
    this(paramfi);
  }

  static void a(h paramh, int paramInt)
  {
    paramh.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.h
 * JD-Core Version:    0.6.0
 */