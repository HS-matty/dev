package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.zendPlatformIntegration.b.e;
import javax.swing.JTree;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.table.AbstractTableModel;

public class mb extends AbstractTableModel
  implements TreeModelListener
{
  private static final long serialVersionUID = 1L;
  JTree a;
  fb b;

  public mb(d paramd, JTree paramJTree)
  {
    this.a = paramJTree;
    this.b = paramd;
    paramd.addTreeModelListener(this);
    paramJTree.setRootVisible(false);
    paramJTree.addTreeExpansionListener(new eb(this));
  }

  public int getColumnCount()
  {
    return this.b.a();
  }

  public String getColumnName(int paramInt)
  {
    return this.b.a(paramInt);
  }

  public Class getColumnClass(int paramInt)
  {
    return this.b.b(paramInt);
  }

  public int getRowCount()
  {
    if ((this.b == null) || (this.b.getRoot() == null))
      return 0;
    if (((e)this.b.getRoot()).b())
      return 0;
    return ((e)this.b.getRoot()).c().length;
  }

  protected Object a(int paramInt)
  {
    if ((this.b == null) || (this.b.getRoot() == null))
      return null;
    if (((e)this.b.getRoot()).b())
      return null;
    return ((e)this.b.getRoot()).c()[paramInt];
  }

  public Object getValueAt(int paramInt1, int paramInt2)
  {
    return this.b.a(a(paramInt1), paramInt2);
  }

  public boolean isCellEditable(int paramInt1, int paramInt2)
  {
    return this.b.b(a(paramInt1), paramInt2);
  }

  public void setValueAt(Object paramObject, int paramInt1, int paramInt2)
  {
    this.b.a(paramObject, a(paramInt1), paramInt2);
  }

  public void treeNodesChanged(TreeModelEvent paramTreeModelEvent)
  {
    fireTableDataChanged();
  }

  public void treeNodesInserted(TreeModelEvent paramTreeModelEvent)
  {
    fireTableDataChanged();
  }

  public void treeNodesRemoved(TreeModelEvent paramTreeModelEvent)
  {
    fireTableDataChanged();
  }

  public void treeStructureChanged(TreeModelEvent paramTreeModelEvent)
  {
    fireTableStructureChanged();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.mb
 * JD-Core Version:    0.6.0
 */