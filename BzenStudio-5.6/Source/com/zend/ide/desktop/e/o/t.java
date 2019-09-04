package com.zend.ide.desktop.e.o;

import com.zend.ide.util.a.b;
import com.zend.ide.util.dj;
import com.zend.ide.w.a.d;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class t extends AbstractAction
{
  final f a;

  public t(f paramf)
  {
    super("cvsCheckoutActionKey");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      f.b(this.a).d(null);
    }
    catch (dj localdj)
    {
      b.a(localdj);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.o.t
 * JD-Core Version:    0.6.0
 */