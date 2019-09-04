package com.zend.ide.desktop;

import com.zend.ide.util.a.b;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class dg extends AbstractAction
{
  String a;
  final z b;

  dg(z paramz, String paramString)
  {
    this.a = paramString;
    putValue("Name", paramString);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      this.b.f.a(this.a, null, -1);
      this.b.f.Y();
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.dg
 * JD-Core Version:    0.6.0
 */