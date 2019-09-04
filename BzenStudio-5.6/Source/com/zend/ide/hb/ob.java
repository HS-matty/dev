package com.zend.ide.hb;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

class ob extends KeyAdapter
{
  final yc a;

  ob(yc paramyc)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    char c = paramKeyEvent.getKeyChar();
    if (Character.isDefined(c))
      try
      {
        wc.a(this.a.f).getDocument().insertString(wc.a(this.a.f).getDocument().getLength(), "" + c, null);
      }
      catch (BadLocationException localBadLocationException)
      {
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.ob
 * JD-Core Version:    0.6.0
 */