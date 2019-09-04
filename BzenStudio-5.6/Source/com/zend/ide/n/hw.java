package com.zend.ide.n;

import com.zend.ide.util.cr;
import java.awt.event.ActionEvent;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

class hw extends TextAction
{
  boolean a = cr.c() == 3;

  public hw()
  {
    super("default-typed");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = getTextComponent(paramActionEvent);
    if ((localJTextComponent != null) && (paramActionEvent != null))
    {
      if ((!localJTextComponent.isEditable()) || (!localJTextComponent.isEnabled()))
        return;
      String str = paramActionEvent.getActionCommand();
      int i = paramActionEvent.getModifiers();
      if ((str != null) && (str.length() > 0) && ((this.a) || ((i & 0x8) == (i & 0x2))) && ((i & 0x2) == (i & 0x4)))
      {
        int j = str.charAt(0);
        if ((j >= 32) && (j != 127) && (j != 255))
          ((gz)localJTextComponent).A().a((gz)localJTextComponent, str);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hw
 * JD-Core Version:    0.6.0
 */