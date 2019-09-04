package com.zend.ide.desktop.e;

import com.zend.ide.db.l;
import com.zend.ide.db.o;
import com.zend.ide.util.cl;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class m extends AbstractAction
{
  final h a;

  public m(h paramh)
  {
    super("phpDoc");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      o.a().a(h.b(this.a).a(null, null));
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.m
 * JD-Core Version:    0.6.0
 */