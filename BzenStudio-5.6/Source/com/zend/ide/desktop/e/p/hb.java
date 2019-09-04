package com.zend.ide.desktop.e.p;

import com.zend.ide.w.c.b.z;
import com.zend.ide.w.c.d;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

class hb extends AbstractAction
{
  protected z a;
  final c b;

  public hb(c paramc, String paramString, z paramz)
  {
    super(paramString);
    this.a = paramz;
  }

  protected void a(File[] paramArrayOfFile)
  {
    this.a.a(paramArrayOfFile);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    c.c(this.b).d();
    this.a.actionPerformed(paramActionEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.p.hb
 * JD-Core Version:    0.6.0
 */