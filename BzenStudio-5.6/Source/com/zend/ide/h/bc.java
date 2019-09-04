package com.zend.ide.h;

import com.zend.ide.util.cl;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class bc extends AbstractAction
{
  final be a;

  public bc(be parambe)
  {
    super(be.j);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      bg localbg = (bg)this.a.getLastSelectedPathComponent();
      eb localeb = new eb(this, localbg);
      new Thread(localeb).start();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.bc
 * JD-Core Version:    0.6.0
 */