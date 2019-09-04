package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.util.w;
import javax.swing.tree.TreePath;

class k extends w
{
  final v c;

  k(v paramv)
  {
  }

  public boolean b()
  {
    if (!this.c.l.j())
      return false;
    TreePath[] arrayOfTreePath = this.c.l.getSelectionPaths();
    if (arrayOfTreePath == null)
      return false;
    for (int i = 0; i < arrayOfTreePath.length; i++)
    {
      m localm = (m)arrayOfTreePath[i].getLastPathComponent();
      a locala = (a)localm.getUserObject();
      if (locala.c().charAt(0) != '$')
        return false;
    }
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.k
 * JD-Core Version:    0.6.0
 */