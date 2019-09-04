package com.zend.ide.cb.a.b;

import com.zend.ide.p.f.e;
import com.zend.ide.p.f.j;
import com.zend.ide.p.f.l;
import javax.swing.tree.TreePath;

class y
  implements j
{
  final wb a;

  private y(wb paramwb)
  {
  }

  public void a(l paraml)
  {
    TreePath localTreePath = paraml.getPath();
    if (localTreePath == null)
      return;
    e locale = (e)localTreePath.getLastPathComponent();
    if (locale.getChildCount() == 1)
    {
      localTreePath = new TreePath(((e)locale.getFirstChild()).getPath());
      this.a.expandPath(localTreePath);
    }
  }

  y(wb paramwb, x paramx)
  {
    this(paramwb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.y
 * JD-Core Version:    0.6.0
 */