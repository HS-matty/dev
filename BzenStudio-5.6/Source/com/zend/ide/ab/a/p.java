package com.zend.ide.ab.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Timer;

class p extends AbstractAction
{
  final t a;

  p(t paramt, String paramString)
  {
    super(paramString);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    long l = Math.min(t.a(this.a) + 65536L, ((d.d(this.a.h) + 15L) / 16L - this.a.c()) * 16L);
    if (d.a(this.a.h) + 65536L < d.d(this.a.h))
    {
      d.a(this.a.h, 65536L);
      d.b(this.a.h).restart();
    }
    else
    {
      d.c(this.a.h, l + (d.a(this.a.h) - t.a(this.a)));
    }
    l = Math.max(l, 0L);
    t.a(this.a, l);
    this.a.repaint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ab.a.p
 * JD-Core Version:    0.6.0
 */