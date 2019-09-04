package com.zend.ide.p.d;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.EventObject;
import javax.swing.DefaultCellEditor;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JTextField;

class x extends DefaultCellEditor
{
  final JTextField a;
  final JFileChooser b;
  final bw c;

  x(bw parambw, JTextField paramJTextField1, JTextField paramJTextField2, JFileChooser paramJFileChooser)
  {
    super(paramJTextField1);
  }

  public boolean isCellEditable(EventObject paramEventObject)
  {
    if ((paramEventObject instanceof MouseEvent))
    {
      MouseEvent localMouseEvent = (MouseEvent)paramEventObject;
      int i = bw.d(this.c).rowAtPoint(localMouseEvent.getPoint());
      return (localMouseEvent.getClickCount() == 1) && (bw.d(this.c).isRowSelected(i));
    }
    return super.isCellEditable(paramEventObject);
  }

  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    Component localComponent = super.getTableCellEditorComponent(paramJTable, paramObject, paramBoolean, paramInt1, paramInt2);
    if ((paramObject instanceof File))
    {
      this.a.setText(this.b.getName((File)paramObject));
      this.a.requestFocus();
      this.a.selectAll();
    }
    return localComponent;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.x
 * JD-Core Version:    0.6.0
 */