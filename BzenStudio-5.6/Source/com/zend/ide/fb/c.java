package com.zend.ide.fb;

import com.jniwrapper.util.FlagSet;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.MessageFormat;
import javax.swing.JTextField;

class c extends KeyAdapter
{
  final db a;
  final gb b;

  c(gb paramgb, db paramdb)
  {
  }

  public void keyTyped(KeyEvent paramKeyEvent)
  {
    String str1 = gb.b(this.b).getText();
    FlagSet localFlagSet = new FlagSet(paramKeyEvent.getModifiersEx());
    if (paramKeyEvent.getKeyChar() == '\n')
    {
      String str2;
      if (localFlagSet.contains(128L))
      {
        str2 = MessageFormat.format("http://www.{0}.com", new Object[] { str1 });
        gb.b(this.b).setText(str2);
        gb.b(this.b).postActionEvent();
      }
      else if (!str1.toLowerCase().startsWith("http://"))
      {
        str2 = str1;
        gb.b(this.b).setText(str2);
        gb.b(this.b).postActionEvent();
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.c
 * JD-Core Version:    0.6.0
 */