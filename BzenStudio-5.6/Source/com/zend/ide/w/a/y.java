package com.zend.ide.w.a;

import com.zend.ide.p.x;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class y
  implements ItemListener
{
  final bv a;

  y(bv parambv)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    b.a("cvs.showStatusDialog").a(new Boolean(!((x)paramItemEvent.getSource()).isSelected()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.y
 * JD-Core Version:    0.6.0
 */