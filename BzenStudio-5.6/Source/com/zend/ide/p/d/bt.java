package com.zend.ide.p.d;

import java.awt.event.KeyEvent;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.TableModel;

class bt extends JTable
{
  final JFileChooser a;
  final bw b;

  bt(bw parambw, TableModel paramTableModel, JFileChooser paramJFileChooser)
  {
    super(paramTableModel);
  }

  protected boolean processKeyBinding(KeyStroke paramKeyStroke, KeyEvent paramKeyEvent, int paramInt, boolean paramBoolean)
  {
    if ((paramKeyEvent.getKeyCode() == 27) && (getCellEditor() == null))
    {
      this.a.dispatchEvent(paramKeyEvent);
      return true;
    }
    return super.processKeyBinding(paramKeyStroke, paramKeyEvent, paramInt, paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bt
 * JD-Core Version:    0.6.0
 */