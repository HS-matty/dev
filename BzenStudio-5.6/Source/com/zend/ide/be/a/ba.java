package com.zend.ide.be.a;

import com.zend.ide.be.d;
import com.zend.ide.be.i;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;

class ba extends AbstractAction
{
  private static final Icon a = new l(null);
  private d b;
  private String c;

  public ba(d paramd, String paramString)
  {
    super("HideAction");
    this.b = paramd;
    this.c = paramString;
    putValue("SmallIcon", a);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    i locali = this.b.b(this.c);
    locali.a = false;
    this.b.a(this.c, locali);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.ba
 * JD-Core Version:    0.6.0
 */