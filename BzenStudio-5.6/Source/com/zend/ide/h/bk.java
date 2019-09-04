package com.zend.ide.h;

import com.zend.ide.j.h;
import com.zend.ide.util.et;
import java.awt.Component;
import java.io.File;
import javax.swing.Icon;
import javax.swing.JTree;
import javax.swing.text.JTextComponent;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellEditor;

public class bk extends et
{
  protected bg b = null;
  final be c;

  public bk(be parambe)
  {
    super(parambe);
  }

  public Component getTreeCellEditorComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    this.b = ((bg)paramObject);
    String str = ((File)this.b.getUserObject()).getName();
    Component localComponent = super.getTreeCellEditorComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt);
    if ((this.editingComponent != null) && ((this.editingComponent instanceof JTextComponent)))
    {
      JTextComponent localJTextComponent = (JTextComponent)this.editingComponent;
      localJTextComponent.setText(str);
      localJTextComponent.selectAll();
    }
    return localComponent;
  }

  public Object getCellEditorValue()
  {
    String str1 = (String)this.realEditor.getCellEditorValue();
    String str2 = this.b.toString();
    File localFile1 = (File)this.b.getUserObject();
    File localFile2 = localFile1;
    if ((!str1.equals(str2)) && (!str1.equals("")))
    {
      String str3 = localFile1.getParent();
      localFile2 = h.m.a(str3, str1);
    }
    return localFile2;
  }

  protected void determineOffset(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    Icon localIcon = ((bl)this.renderer).a((be)paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3);
    this.renderer.setClosedIcon(localIcon);
    this.renderer.setOpenIcon(localIcon);
    this.renderer.setDisabledIcon(localIcon);
    this.renderer.setLeafIcon(localIcon);
    super.determineOffset(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.bk
 * JD-Core Version:    0.6.0
 */