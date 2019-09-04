package com.zend.ide.be.a;

import com.zend.ide.be.d;
import com.zend.ide.be.i;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class bb extends AbstractAction
{
  private d a;
  private String b;
  private int c;

  public bb(d paramd, String paramString, int paramInt)
  {
    super("moveAction");
    this.a = paramd;
    this.b = paramString;
    this.c = paramInt;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    i locali = this.a.b(this.b);
    locali.c = this.c;
    locali.e = -1;
    this.a.a(this.b, locali);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bb
 * JD-Core Version:    0.6.0
 */