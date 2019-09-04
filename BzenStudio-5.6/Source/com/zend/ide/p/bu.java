package com.zend.ide.p;

import com.zend.ide.util.bn;
import com.zend.ide.util.bt;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class bu extends bt
{
  final bw b;

  public bu(bw parambw, bn parambn)
  {
    super(parambn);
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    if (!SwingUtilities.isLeftMouseButton(paramMouseEvent))
    {
      int i = this.b.locationToIndex(paramMouseEvent.getPoint());
      if ((i != -1) && (!this.b.isSelectedIndex(i)))
        this.b.setSelectedIndex(i);
    }
    super.mousePressed(paramMouseEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bu
 * JD-Core Version:    0.6.0
 */