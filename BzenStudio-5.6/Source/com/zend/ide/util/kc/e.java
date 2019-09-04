package com.zend.ide.util.kc;

import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.table.TableCellEditor;

class e extends AbstractAction
{
  final g a;

  public e(g paramg)
  {
    super(ct.a(116));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    g.a(this.a, g.b(this.a).a());
    this.a.dispose();
    if (g.a(this.a) != null)
      g.a(this.a).stopCellEditing();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.kc.e
 * JD-Core Version:    0.6.0
 */