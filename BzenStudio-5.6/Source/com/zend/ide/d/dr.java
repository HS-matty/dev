package com.zend.ide.d;

import com.zend.ide.p.x;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public abstract class dr extends MouseAdapter
{
  final dm a;

  protected dr(dm paramdm)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (((Component)paramMouseEvent.getSource()).isEnabled())
    {
      if (this.a.d())
      {
        String str = this.a.r();
        if ((paramMouseEvent.getSource() instanceof x))
        {
          x localx = (x)paramMouseEvent.getSource();
          localx.setSelected(!localx.isSelected());
        }
        if (str == null)
          return;
      }
      a(paramMouseEvent);
    }
  }

  public abstract void a(MouseEvent paramMouseEvent);
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.dr
 * JD-Core Version:    0.6.0
 */