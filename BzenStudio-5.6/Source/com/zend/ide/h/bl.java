package com.zend.ide.h;

import com.zend.ide.util.es;
import java.awt.Component;
import java.io.File;
import javax.swing.Icon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeNode;

public class bl extends DefaultTreeCellRenderer
{
  public Icon a(be parambe, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (!(paramObject instanceof TreeNode))
      return null;
    bg localbg = (bg)paramObject;
    return localbg.b(paramBoolean2);
  }

  public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4)
  {
    es locales = (es)paramObject;
    Object localObject = locales.getUserObject();
    if ((localObject instanceof File))
    {
      Icon localIcon = a((be)paramJTree, locales, paramBoolean1, paramBoolean2, paramBoolean3);
      setClosedIcon(localIcon);
      setOpenIcon(localIcon);
      setDisabledIcon(localIcon);
      setLeafIcon(localIcon);
    }
    return super.getTreeCellRendererComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.bl
 * JD-Core Version:    0.6.0
 */