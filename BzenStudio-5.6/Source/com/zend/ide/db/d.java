package com.zend.ide.db;

import com.zend.ide.util.a.b;
import com.zend.ide.util.dj;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class d
  implements ActionListener
{
  final x a;

  d(x paramx)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      if (x.a(this.a))
        this.a.dispose();
    }
    catch (dj localdj)
    {
      b.a(localdj);
      return;
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.d
 * JD-Core Version:    0.6.0
 */