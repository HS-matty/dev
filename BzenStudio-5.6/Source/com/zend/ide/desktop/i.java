package com.zend.ide.desktop;

import com.zend.ide.util.a.b;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class i extends WindowAdapter
{
  final cj a;

  i(cj paramcj)
  {
  }

  public void windowClosing(WindowEvent paramWindowEvent)
  {
    try
    {
      this.a.c(false);
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.i
 * JD-Core Version:    0.6.0
 */