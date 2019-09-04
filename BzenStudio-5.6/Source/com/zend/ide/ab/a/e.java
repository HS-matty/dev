package com.zend.ide.ab.a;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class e
  implements AdjustmentListener
{
  final d a;

  e(d paramd)
  {
  }

  public void adjustmentValueChanged(AdjustmentEvent paramAdjustmentEvent)
  {
    int i = paramAdjustmentEvent.getValue();
    t.a(d.a(this.a), i * 16);
    d.a(this.a).repaint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ab.a.e
 * JD-Core Version:    0.6.0
 */