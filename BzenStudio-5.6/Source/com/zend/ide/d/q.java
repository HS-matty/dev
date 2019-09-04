package com.zend.ide.d;

import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class q extends AbstractAction
{
  final bg a;

  public q(bg parambg)
  {
    super(ct.a(116));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      bg.c(this.a);
    }
    catch (RuntimeException localRuntimeException)
    {
      throw localRuntimeException;
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.q
 * JD-Core Version:    0.6.0
 */