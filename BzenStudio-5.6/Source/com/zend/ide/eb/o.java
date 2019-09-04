package com.zend.ide.eb;

import com.zend.ide.p.f.d;
import javax.swing.tree.DefaultMutableTreeNode;

class o extends d
{
  final k m;

  public o(k paramk, Object paramObject)
  {
    super(paramObject);
    setName("SnippetsTree");
    setRootVisible(false);
    setShowsRootHandles(true);
    repaint();
  }

  protected DefaultMutableTreeNode b(Object paramObject)
  {
    return new r("Snippets", paramObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.o
 * JD-Core Version:    0.6.0
 */