package com.zend.ide.hb;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SwingUtilities;

class b extends WindowAdapter
{
  final pb a;

  b(pb parampb)
  {
  }

  public void windowClosing(WindowEvent paramWindowEvent)
  {
    this.a.d();
    pb.f(this.a).a(-1);
  }

  public void windowGainedFocus(WindowEvent paramWindowEvent)
  {
    SwingUtilities.invokeLater(new n(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.b
 * JD-Core Version:    0.6.0
 */