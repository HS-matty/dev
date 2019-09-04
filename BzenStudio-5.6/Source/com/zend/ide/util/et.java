package com.zend.ide.util;

import java.awt.Component;
import javax.swing.JTree;
import javax.swing.text.JTextComponent;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;

public class et extends DefaultTreeCellEditor
{
  final eo a;

  public et(eo parameo)
  {
    super(parameo, (DefaultTreeCellRenderer)parameo.getCellRenderer());
  }

  public Component getTreeCellEditorComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    Component localComponent = super.getTreeCellEditorComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt);
    if ((this.editingComponent != null) && ((this.editingComponent instanceof JTextComponent)))
    {
      JTextComponent localJTextComponent = (JTextComponent)this.editingComponent;
      localJTextComponent.selectAll();
    }
    return localComponent;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.et
 * JD-Core Version:    0.6.0
 */