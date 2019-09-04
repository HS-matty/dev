package com.zend.ide.util.kc;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.table.TableCellEditor;

class a extends WindowAdapter
{
  final g a;

  a(g paramg)
  {
  }

  public void windowClosing(WindowEvent paramWindowEvent)
  {
    if (g.a(this.a) != null)
      g.a(this.a).stopCellEditing();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.kc.a
 * JD-Core Version:    0.6.0
 */