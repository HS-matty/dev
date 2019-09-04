package com.zend.ide.util.c;

import com.zend.ide.util.a.b;
import java.awt.event.ActionEvent;
import javax.swing.Action;

class c
  implements d
{
  private ActionEvent a;
  final m b;

  public c(m paramm, ActionEvent paramActionEvent)
  {
    this.a = paramActionEvent;
  }

  public Object k()
  {
    try
    {
      this.b.d().actionPerformed(this.a);
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.c.c
 * JD-Core Version:    0.6.0
 */