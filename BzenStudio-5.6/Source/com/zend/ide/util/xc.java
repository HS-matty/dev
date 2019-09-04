package com.zend.ide.util;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.Document;

public class xc extends JTextField
{
  public void processKeyEvent(KeyEvent paramKeyEvent)
  {
    char c = paramKeyEvent.getKeyChar();
    if (((Character.isLetter(c)) && (!paramKeyEvent.isAltDown())) || ("`~!@#$%^&*()_+=\\|\"':;?/>.<, ".indexOf(c) > -1))
    {
      paramKeyEvent.consume();
      return;
    }
    if ((c == '-') && (getDocument().getLength() > 0))
      paramKeyEvent.consume();
    else
      super.processKeyEvent(paramKeyEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.xc
 * JD-Core Version:    0.6.0
 */