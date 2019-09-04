package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.bc;
import com.zend.ide.p.f.g;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

class s extends g
{
  final bq b;

  public s(bq parambq, TreeNode paramTreeNode)
  {
    super(parambq, paramTreeNode);
  }

  public void valueForPathChanged(TreePath paramTreePath, Object paramObject)
  {
    o localo = (o)this.b.getLastSelectedPathComponent();
    if (localo != null)
    {
      a locala = (a)localo.getUserObject();
      String str = locala.c();
      if ((paramObject == null) || (paramObject.equals("")) || (paramObject.equals(str)))
        return;
      bq.a(this.b).a(str, (String)paramObject);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.s
 * JD-Core Version:    0.6.0
 */