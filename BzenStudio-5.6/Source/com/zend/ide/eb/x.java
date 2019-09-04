package com.zend.ide.eb;

import com.zend.ide.util.cl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class x
  implements ActionListener
{
  final k a;

  x(k paramk)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      new Thread(new y(this)).start();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.x
 * JD-Core Version:    0.6.0
 */