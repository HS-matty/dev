package com.zend.ide.be.a;

import com.zend.ide.be.d;
import com.zend.ide.be.i;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class z extends AbstractAction
{
  private d a;
  private String b;

  public z(d paramd, String paramString)
  {
    super("floatAction");
    this.a = paramd;
    this.b = paramString;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    i locali = this.a.b(this.b);
    locali.b = true;
    this.a.a(this.b, locali);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.z
 * JD-Core Version:    0.6.0
 */