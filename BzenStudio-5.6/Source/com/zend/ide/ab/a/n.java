package com.zend.ide.ab.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Timer;

class n extends AbstractAction
{
  final t a;

  n(t paramt, String paramString)
  {
    super(paramString);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (d.a(this.a.h) + this.a.c() * 16 < d.d(this.a.h))
    {
      d.a(this.a.h, this.a.c() * 16);
      d.b(this.a.h).restart();
    }
    long l = Math.min(t.a(this.a) + this.a.c() * 16, ((d.d(this.a.h) + 15L) / 16L - this.a.c()) * 16L);
    l = Math.max(l, 0L);
    t.a(this.a, l);
    this.a.repaint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ab.a.n
 * JD-Core Version:    0.6.0
 */