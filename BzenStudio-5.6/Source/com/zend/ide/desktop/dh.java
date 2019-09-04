package com.zend.ide.desktop;

import com.zend.ide.l.v;
import com.zend.ide.util.a.b;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class dh extends AbstractAction
{
  String a;
  final bb b;

  dh(bb parambb, String paramString)
  {
    this.a = paramString;
    putValue("Name", paramString);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      this.b.f.l().a(this.a);
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.dh
 * JD-Core Version:    0.6.0
 */