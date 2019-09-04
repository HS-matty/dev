package com.zend.ide.n;

import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class bq
  implements el
{
  public String a(MouseEvent paramMouseEvent)
  {
    JComponent localJComponent = (JComponent)paramMouseEvent.getComponent();
    return (String)localJComponent.getClientProperty("ToolTipText");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.bq
 * JD-Core Version:    0.6.0
 */