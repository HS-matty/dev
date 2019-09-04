package com.zend.ide.d;

import com.zend.ide.p.x;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class bb
  implements ItemListener
{
  final od a;

  bb(od paramod)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    boolean bool = od.c(this.a).isSelected();
    od.d(this.a).setEnabled(!bool);
    od.d(this.a).setSelected(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bb
 * JD-Core Version:    0.6.0
 */