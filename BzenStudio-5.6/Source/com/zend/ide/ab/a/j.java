package com.zend.ide.ab.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Timer;

class j extends AbstractAction
{
  final t a;

  j(t paramt, String paramString)
  {
    super(paramString);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (d.a(this.a.h) + 16L < d.d(this.a.h))
    {
      d.a(this.a.h, 16L);
      if (d.a(this.a.h) >= t.a(this.a) + this.a.c() * 16)
        t.a(this.a, t.a(this.a) + 16L);
      this.a.repaint();
      d.b(this.a.h).restart();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ab.a.j
 * JD-Core Version:    0.6.0
 */