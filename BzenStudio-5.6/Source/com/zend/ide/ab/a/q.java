package com.zend.ide.ab.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Timer;

class q extends AbstractAction
{
  final t a;

  q(t paramt, String paramString)
  {
    super(paramString);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (d.a(this.a.h) - 65536L >= 0L)
    {
      d.b(this.a.h, 65536L);
      d.b(this.a.h).restart();
    }
    else
    {
      d.c(this.a.h, d.a(this.a.h) - t.a(this.a));
    }
    t.a(this.a, Math.max(t.a(this.a) - 65536L, 0L));
    this.a.repaint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ab.a.q
 * JD-Core Version:    0.6.0
 */