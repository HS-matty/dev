package com.zend.ide.n.td.a;

import com.zend.ide.n.gx;
import java.awt.Container;

class c
  implements Runnable
{
  final gx a;
  final s b;

  c(s params, gx paramgx)
  {
  }

  public void run()
  {
    Container localContainer = this.a.getTopLevelAncestor();
    if (localContainer != null)
      localContainer.repaint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.a.c
 * JD-Core Version:    0.6.0
 */