package com.zend.ide.f;

import javax.swing.tree.DefaultTreeModel;

class id
  implements Runnable
{
  final ge a;

  id(ge paramge)
  {
  }

  public void run()
  {
    ((DefaultTreeModel)this.a.a.getModel()).reload();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.id
 * JD-Core Version:    0.6.0
 */