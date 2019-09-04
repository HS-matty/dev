package com.zend.ide.desktop.d;

import com.zend.ide.p.x;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class h
  implements ItemListener
{
  final a a;

  h(a parama)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    b.a("application.showAnalayzerDialog").a(new Boolean(!((x)paramItemEvent.getSource()).isSelected()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.d.h
 * JD-Core Version:    0.6.0
 */