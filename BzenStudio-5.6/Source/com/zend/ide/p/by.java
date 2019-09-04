package com.zend.ide.p;

import com.zend.ide.util.cl;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

public class by extends DefaultTreeCellRenderer
{
  public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4)
  {
    super.getTreeCellRendererComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
    if ((paramObject instanceof bt))
    {
      bt localbt = (bt)paramObject;
      try
      {
        setIcon(localbt.e());
      }
      catch (Exception localException)
      {
        cl.a("Exception original type: " + localbt.e());
        cl.a(localException);
      }
      setToolTipText(localbt.g());
    }
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.by
 * JD-Core Version:    0.6.0
 */