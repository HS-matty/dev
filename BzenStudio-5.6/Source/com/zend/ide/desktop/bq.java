package com.zend.ide.desktop;

import java.awt.event.KeyEvent;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.KeyStroke;

public class bq extends JButton
{
  public bq()
  {
    putClientProperty("hideActionText", Boolean.TRUE);
  }

  protected void configurePropertiesFromAction(Action paramAction)
  {
    if (paramAction.getValue("ShortDescription") == null)
      paramAction.putValue("ShortDescription", paramAction.getValue("Name"));
    super.configurePropertiesFromAction(paramAction);
    Icon localIcon = (Icon)paramAction.getValue("SmallIcon");
    if (localIcon == null)
      localIcon = (Icon)paramAction.getValue("big_icon");
    setIcon(localIcon);
  }

  public String getToolTipText()
  {
    String str1 = (String)getClientProperty("ToolTipText");
    if ((str1 != null) && (str1.trim().length() != 0))
    {
      KeyStroke localKeyStroke = (KeyStroke)getAction().getValue("AcceleratorKey");
      if (localKeyStroke != null)
      {
        String str2 = KeyEvent.getKeyModifiersText(localKeyStroke.getModifiers()) + " " + KeyEvent.getKeyText(localKeyStroke.getKeyCode());
        str1 = str1 + "   " + str2;
      }
    }
    return str1;
  }

  public void setMnemonic(int paramInt)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.bq
 * JD-Core Version:    0.6.0
 */