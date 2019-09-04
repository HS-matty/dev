package com.zend.ide.desktop;

import com.zend.ide.util.cl;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class h extends MouseAdapter
{
  final br a;

  h(br parambr)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.getClickCount() == 2)
      try
      {
        SwingUtilities.invokeLater(new ic(this));
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.h
 * JD-Core Version:    0.6.0
 */