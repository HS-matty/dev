package com.zend.ide.ba;

import com.zend.ide.r.d;
import com.zend.ide.util.cv;
import java.awt.Component;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

class s extends DefaultTreeCellRenderer
{
  public final ImageIcon d = cv.b("explorer/textfile.gif");
  public final ImageIcon e = cv.b("analyze16.gif");
  final o f;

  public s(o paramo)
  {
  }

  public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4)
  {
    super.getTreeCellRendererComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
    DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)paramObject;
    setIcon(a(localDefaultMutableTreeNode));
    return this;
  }

  public Icon a(DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    if ((paramDefaultMutableTreeNode instanceof q))
    {
      h localh = (h)paramDefaultMutableTreeNode.getUserObject();
      if ((localh.c()) || (localh.equals(f.e(this.f.k))))
        return null;
      String str1 = localh.b();
      int i = new File(str1).getName().lastIndexOf(".");
      String str2 = i == -1 ? "" : str1.substring(str1.lastIndexOf("."));
      if (str2.equals(""))
        return this.d;
      d locald = com.zend.ide.r.p.e().b(str2);
      if (locald != null)
        return locald.e();
    }
    else
    {
      if ((paramDefaultMutableTreeNode instanceof p))
        return this.e;
      if ((paramDefaultMutableTreeNode instanceof r))
        return null;
    }
    return this.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ba.s
 * JD-Core Version:    0.6.0
 */