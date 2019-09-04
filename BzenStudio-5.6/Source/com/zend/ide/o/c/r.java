package com.zend.ide.o.c;

import com.zend.ide.o.a;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JTree;
import javax.swing.text.JTextComponent;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;

class r extends DefaultTreeCellEditor
{
  final bq a;

  public r(bq parambq)
  {
    super(parambq, (DefaultTreeCellRenderer)parambq.getCellRenderer());
  }

  public Component getTreeCellEditorComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    Component localComponent = super.getTreeCellEditorComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt);
    if ((this.editingComponent != null) && ((this.editingComponent instanceof JTextComponent)))
    {
      o localo = (o)this.a.getLastSelectedPathComponent();
      a locala = (a)localo.getUserObject();
      String str = locala.c();
      JTextComponent localJTextComponent = (JTextComponent)this.editingComponent;
      localJTextComponent.setText(str);
      localJTextComponent.selectAll();
    }
    return localComponent;
  }

  public boolean stopCellEditing()
  {
    boolean bool = super.stopCellEditing();
    return bool;
  }

  protected void determineOffset(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    if (this.renderer != null)
    {
      m localm = (m)this.a.getLastSelectedPathComponent();
      if (localm != null)
        this.editingIcon = localm.e();
      if (this.editingIcon != null)
        this.offset = (this.renderer.getIconTextGap() + this.editingIcon.getIconWidth());
      else
        this.offset = this.renderer.getIconTextGap();
    }
    else
    {
      this.editingIcon = null;
      this.offset = 0;
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.r
 * JD-Core Version:    0.6.0
 */