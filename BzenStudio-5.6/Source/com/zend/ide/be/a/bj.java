package com.zend.ide.be.a;

import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.MenuSelectionManager;

class bj extends JFrame
{
  public bj()
  {
    setName("ApplicationFrame");
  }

  protected void processWindowEvent(WindowEvent paramWindowEvent)
  {
    super.processWindowEvent(paramWindowEvent);
    if (paramWindowEvent.getID() == 205)
    {
      MenuSelectionManager localMenuSelectionManager = MenuSelectionManager.defaultManager();
      if (localMenuSelectionManager.getSelectedPath().length != 0)
        localMenuSelectionManager.clearSelectedPath();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bj
 * JD-Core Version:    0.6.0
 */