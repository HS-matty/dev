package com.zend.ide.l;

import com.zend.ide.util.a.b;
import com.zend.ide.util.dj;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class p
  implements ActionListener
{
  final bw a;

  p(bw parambw)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      if (bw.c(this.a))
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
 * Qualified Name:     com.zend.ide.l.p
 * JD-Core Version:    0.6.0
 */