package com.zend.ide.d;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

class bo extends KeyAdapter
{
  final de a;

  private bo(de paramde)
  {
  }

  public void keyReleased(KeyEvent paramKeyEvent)
  {
    String str = de.c(this.a).getText();
    if (!str.equals(""))
    {
      int i = Integer.parseInt(de.c(this.a).getText());
      if (i == 0)
      {
        de.c(this.a).setText("");
        return;
      }
      Font localFont1 = this.a.c().d();
      Font localFont2 = new Font(localFont1.getName(), localFont1.getStyle(), i);
      this.a.c().a(localFont2);
      this.a.b.a(localFont2);
    }
  }

  bo(de paramde, cm paramcm)
  {
    this(paramde);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bo
 * JD-Core Version:    0.6.0
 */