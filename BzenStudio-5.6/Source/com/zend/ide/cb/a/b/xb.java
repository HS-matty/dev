package com.zend.ide.cb.a.b;

import com.zend.ide.cb.q;
import com.zend.ide.p.f.e;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;

public class xb
  implements TreeModelListener
{
  private db a;

  public xb(db paramdb)
  {
    this.a = paramdb;
  }

  public void treeNodesChanged(TreeModelEvent paramTreeModelEvent)
  {
  }

  public void treeNodesInserted(TreeModelEvent paramTreeModelEvent)
  {
    Object[] arrayOfObject = paramTreeModelEvent.getChildren();
    if (arrayOfObject.length == 1)
    {
      Object localObject = ((e)arrayOfObject[0]).getUserObject();
      if ((localObject instanceof q))
        SwingUtilities.invokeLater(new yb(this, arrayOfObject, localObject));
    }
  }

  public void treeNodesRemoved(TreeModelEvent paramTreeModelEvent)
  {
  }

  public void treeStructureChanged(TreeModelEvent paramTreeModelEvent)
  {
  }

  static db a(xb paramxb)
  {
    return paramxb.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.xb
 * JD-Core Version:    0.6.0
 */