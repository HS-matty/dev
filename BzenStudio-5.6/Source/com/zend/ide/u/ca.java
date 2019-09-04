package com.zend.ide.u;

import com.zend.ide.j.h;
import com.zend.ide.util.a.b;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

public class ca extends AbstractAction
{
  final bs a;

  public ca(bs parambs)
  {
    super("RemoveFTPServerAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File localFile = this.a.x();
    bh localbh = (bh)h.m.A(localFile);
    try
    {
      if (localbh.i())
        localbh.e(true);
    }
    catch (bu localbu)
    {
    }
    catch (RuntimeException localRuntimeException)
    {
      b.a(localRuntimeException);
    }
    h.m.b(localbh);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.ca
 * JD-Core Version:    0.6.0
 */