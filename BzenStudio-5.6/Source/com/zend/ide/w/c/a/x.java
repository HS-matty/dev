package com.zend.ide.w.c.a;

import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class x
  implements ItemListener
{
  final nb a;

  x(nb paramnb)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    b.a("svn.showRevertDialog").a(Boolean.valueOf(!((com.zend.ide.p.x)paramItemEvent.getSource()).isSelected()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.x
 * JD-Core Version:    0.6.0
 */