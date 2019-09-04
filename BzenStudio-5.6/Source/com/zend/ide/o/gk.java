package com.zend.ide.o;

import com.zend.ide.bd.c;
import com.zend.ide.p.ba;
import com.zend.ide.util.c.f;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class gk extends AbstractAction
{
  final fk a;

  public gk(fk paramfk)
  {
    super("testServerConnectionAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int i;
    if (this.a.y().equals("http://Server_Address/"))
      i = ba.b(c.b().h(), ct.a(1273), ct.a(986), 0);
    else
      i = ba.b(c.b().h(), ct.a(985, this.a.y()), ct.a(986), 0);
    if (i == 0)
    {
      long l = this.a.bm() * 1000;
      this.a.j.a(l, l);
      this.a.bl().a(this.a.y());
      this.a.bl().h();
      this.a.c(this.a.y(), this.a.F(), x.b);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.gk
 * JD-Core Version:    0.6.0
 */