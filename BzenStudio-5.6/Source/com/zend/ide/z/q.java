package com.zend.ide.z;

import com.zend.ide.p.eb;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JTable;

public class q extends AbstractAction
{
  final w a;

  public q(w paramw)
  {
    super("profilerFunctionDetailsAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    eb localeb = this.a.d().a();
    if ((localeb != null) && (localeb.getSelectedRow() != -1))
    {
      r localr = (r)localeb.getValueAt(localeb.getSelectedRow(), 0);
      w.a(this.a).a(localr.h(), localr.c() - 1, w.d(this.a).d().h());
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.q
 * JD-Core Version:    0.6.0
 */