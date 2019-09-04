package com.zend.ide.desktop;

import com.zend.ide.n.bw;
import com.zend.ide.n.ci;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class g extends MouseAdapter
{
  final br a;

  g(br parambr)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.getClickCount() == 2)
    {
      if (br.b(this.a).e() == null)
        return;
      ci.b(br.b(this.a));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.g
 * JD-Core Version:    0.6.0
 */