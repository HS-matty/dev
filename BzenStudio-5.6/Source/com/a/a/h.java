package com.a.a;

import com.a.e;
import java.awt.Font;

public class h extends a
{
  public h()
  {
    super("font", Font.class);
  }

  public Object a(e parame)
  {
    String str = parame.a("name");
    int i = Integer.valueOf(parame.a("size")).intValue();
    int j = Integer.valueOf(parame.a("style")).intValue();
    return new Font(str, j, i);
  }

  public e e()
  {
    Font localFont = (Font)c();
    e locale = new e();
    locale.a("name", localFont.getName());
    locale.a("style", String.valueOf(localFont.getStyle()));
    locale.a("size", String.valueOf(localFont.getSize()));
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.a.a.h
 * JD-Core Version:    0.6.0
 */