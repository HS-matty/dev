package com.a.a;

import com.a.e;
import javax.swing.KeyStroke;

public class i extends a
{
  public i()
  {
    super("keyStroke", KeyStroke.class);
  }

  public Object a(e parame)
  {
    int i = Integer.valueOf(parame.a("keyCode")).intValue();
    int j = Integer.valueOf(parame.a("modifiers")).intValue();
    return KeyStroke.getKeyStroke(i, j);
  }

  public e e()
  {
    KeyStroke localKeyStroke = (KeyStroke)c();
    e locale = new e();
    locale.a("keyCode", "" + localKeyStroke.getKeyCode());
    locale.a("modifiers", "" + localKeyStroke.getModifiers());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.a.a.i
 * JD-Core Version:    0.6.0
 */