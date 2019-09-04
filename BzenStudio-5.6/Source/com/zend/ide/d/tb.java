package com.zend.ide.d;

import com.zend.ide.util.cm;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

class tb
  implements FocusListener
{
  final pd a;

  public tb(pd parampd)
  {
  }

  public void focusLost(FocusEvent paramFocusEvent)
  {
    Component localComponent = paramFocusEvent.getComponent();
    if ((localComponent instanceof JTextField))
    {
      String str = ((JTextField)localComponent).getText();
      pd.a(this.a).a(str);
    }
  }

  public void focusGained(FocusEvent paramFocusEvent)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.tb
 * JD-Core Version:    0.6.0
 */