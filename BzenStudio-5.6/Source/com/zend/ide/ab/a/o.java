package com.zend.ide.ab.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Timer;

class o extends AbstractAction
{
  final t a;

  o(t paramt, String paramString)
  {
    super(paramString);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (d.a(this.a.h) - this.a.c() * 16 >= 0L)
    {
      d.b(this.a.h, this.a.c() * 16);
      d.b(this.a.h).restart();
    }
    t.a(this.a, Math.max(t.a(this.a) - this.a.c() * 16, 0L));
    this.a.repaint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ab.a.o
 * JD-Core Version:    0.6.0
 */