package com.zend.ide.ab.a;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class g
  implements ItemListener
{
  final d a;

  g(d paramd)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    if (paramItemEvent.getStateChange() == 1)
    {
      this.a.a((String)paramItemEvent.getItem());
      d.c(this.a);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ab.a.g
 * JD-Core Version:    0.6.0
 */