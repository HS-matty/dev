package com.zend.ide.util.kc;

import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.table.TableCellEditor;

class d extends AbstractAction
{
  final g a;

  public d(g paramg)
  {
    super(ct.a(117));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    g.a(this.a, null);
    this.a.dispose();
    if (g.a(this.a) != null)
      g.a(this.a).stopCellEditing();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.kc.d
 * JD-Core Version:    0.6.0
 */