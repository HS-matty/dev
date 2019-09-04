package com.zend.ide.d;

import com.zend.ide.util.ct;
import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class p extends AbstractAction
{
  final bg a;

  public p(bg parambg)
  {
    super(ct.b(130));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      bg.d(this.a);
      this.a.getOwner().repaint();
    }
    catch (RuntimeException localRuntimeException)
    {
      throw localRuntimeException;
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.p
 * JD-Core Version:    0.6.0
 */