package com.zend.ide.w.a;

import com.zend.ide.p.x;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class s
  implements ItemListener
{
  final bt a;

  s(bt parambt)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    b.a("cvs.showDiffDialog").a(new Boolean(!((x)paramItemEvent.getSource()).isSelected()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.s
 * JD-Core Version:    0.6.0
 */