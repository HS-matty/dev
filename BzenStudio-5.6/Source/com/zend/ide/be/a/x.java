package com.zend.ide.be.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;

class x extends AbstractAction
{
  private static final Icon a = new d(null);
  private com.zend.ide.be.d b;
  private String c;

  public x(com.zend.ide.be.d paramd, String paramString)
  {
    super("CloseAction");
    this.b = paramd;
    this.c = paramString;
    putValue("SmallIcon", a);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      this.b.a(this.c);
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.x
 * JD-Core Version:    0.6.0
 */