package com.zend.ide.w.c.a;

import com.zend.ide.p.x;
import com.zend.ide.y.b;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class c
  implements ItemListener
{
  final gb a;

  c(gb paramgb)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    b.a("svn.showAddDialog").a(Boolean.valueOf(!((x)paramItemEvent.getSource()).isSelected()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.c
 * JD-Core Version:    0.6.0
 */