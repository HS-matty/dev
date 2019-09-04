package com.zend.ide.p.d;

import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.TransferHandler;

class br extends JList
{
  JTable a = bw.d(this.b);
  final bw b;

  br(bw parambw, ListModel paramListModel)
  {
    super(paramListModel);
  }

  public int locationToIndex(Point paramPoint)
  {
    return this.a.rowAtPoint(paramPoint);
  }

  public Rectangle getCellBounds(int paramInt1, int paramInt2)
  {
    Rectangle localRectangle1 = this.a.getCellRect(paramInt1, 0, false);
    Rectangle localRectangle2 = this.a.getCellRect(paramInt2, 0, false);
    return localRectangle1.union(localRectangle2);
  }

  public Object getSelectedValue()
  {
    return this.a.getValueAt(this.a.getSelectedRow(), 0);
  }

  public Component add(Component paramComponent)
  {
    if ((paramComponent instanceof JTextField))
      return this.a.add(paramComponent);
    return super.add(paramComponent);
  }

  public void repaint()
  {
    if (this.a != null)
      this.a.repaint();
  }

  public TransferHandler getTransferHandler()
  {
    if (this.a != null)
      return this.a.getTransferHandler();
    return super.getTransferHandler();
  }

  public void setTransferHandler(TransferHandler paramTransferHandler)
  {
    if (this.a != null)
      this.a.setTransferHandler(paramTransferHandler);
    else
      super.setTransferHandler(paramTransferHandler);
  }

  public boolean getDragEnabled()
  {
    if (this.a != null)
      return this.a.getDragEnabled();
    return super.getDragEnabled();
  }

  public void setDragEnabled(boolean paramBoolean)
  {
    if (this.a != null)
      this.a.setDragEnabled(paramBoolean);
    else
      super.setDragEnabled(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.br
 * JD-Core Version:    0.6.0
 */