package com.zend.ide.ab.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Timer;

class k extends AbstractAction
{
  final t a;

  k(t paramt, String paramString)
  {
    super(paramString);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (d.a(this.a.h) - 16L >= 0L)
    {
      d.b(this.a.h, 16L);
      if (d.a(this.a.h) < t.a(this.a))
        t.a(this.a, t.a(this.a) - 16L);
      this.a.repaint();
      d.b(this.a.h).restart();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ab.a.k
 * JD-Core Version:    0.6.0
 */