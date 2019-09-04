package com.zend.ide.ab.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Timer;

class m extends AbstractAction
{
  final t a;

  m(t paramt, String paramString)
  {
    super(paramString);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (d.a(this.a.h) - 1L >= 0L)
    {
      d.b(this.a.h, 1L);
      if (d.a(this.a.h) < t.a(this.a))
        t.a(this.a, t.a(this.a) - 16L);
      this.a.repaint();
      d.b(this.a.h).restart();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ab.a.m
 * JD-Core Version:    0.6.0
 */