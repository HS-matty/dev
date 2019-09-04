package com.zend.ide.z;

import com.zend.ide.be.l;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class bd extends AbstractAction
{
  final bo a;

  public bd(bo parambo)
  {
    super("profilerFunctionDetailsAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    j localj = bo.a(this.a).d();
    if (localj != null)
    {
      r localr = bo.b(this.a).a(localj.c());
      if (localr != null)
      {
        bo.c(this.a).e().a(localr.h());
        bo.c(this.a).d().a(localr.k());
        bo.d(this.a).b(ct.a(930));
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bd
 * JD-Core Version:    0.6.0
 */