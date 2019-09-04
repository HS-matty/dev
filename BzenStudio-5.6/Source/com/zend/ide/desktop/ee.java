package com.zend.ide.desktop;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class ee extends AbstractAction
{
  private eg a;
  private String c;
  private String d;
  final cj b;

  public ee(cj paramcj, String paramString1, String paramString2)
  {
    this.c = paramString1;
    this.d = paramString2;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if ((paramActionEvent.getModifiers() & 0x10) > 0)
    {
      if (this.a == null)
        this.a = new eg(this.b.o, this.c, this.d);
      this.a.pack();
      this.a.B();
      this.a.setVisible(true);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ee
 * JD-Core Version:    0.6.0
 */