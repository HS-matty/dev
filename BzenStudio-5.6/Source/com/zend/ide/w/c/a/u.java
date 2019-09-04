package com.zend.ide.w.c.a;

import com.zend.ide.p.x;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class u
  implements ItemListener
{
  final mb a;

  u(mb parammb)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    b.a("svn.showResolveDialog").a(Boolean.valueOf(!((x)paramItemEvent.getSource()).isSelected()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.u
 * JD-Core Version:    0.6.0
 */