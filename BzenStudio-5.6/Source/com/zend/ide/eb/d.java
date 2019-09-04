package com.zend.ide.eb;

import com.zend.ide.p.f.e;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

class d
  implements TreeSelectionListener
{
  final k a;

  d(k paramk)
  {
  }

  public void valueChanged(TreeSelectionEvent paramTreeSelectionEvent)
  {
    k.f(this.a);
    if (paramTreeSelectionEvent.getNewLeadSelectionPath() == null)
    {
      k.d(this.a);
      return;
    }
    Object localObject = ((e)paramTreeSelectionEvent.getNewLeadSelectionPath().getLastPathComponent()).getUserObject();
    if ((localObject instanceof a))
    {
      k.b(this.a, ((a)localObject).h());
      k.a(this.a, (a)localObject);
      return;
    }
    k.b(this.a, k.a());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.d
 * JD-Core Version:    0.6.0
 */