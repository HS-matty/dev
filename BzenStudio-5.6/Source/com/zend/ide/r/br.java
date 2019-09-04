package com.zend.ide.r;

import com.zend.ide.p.x;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class br
  implements ItemListener
{
  final bp a;

  br(bp parambp)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    boolean bool = bp.a(this.a).isSelected();
    bp.a(this.a, bool);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.br
 * JD-Core Version:    0.6.0
 */