package com.a.a;

import com.a.e;
import com.zend.ide.util.l;
import java.awt.Color;

public class g extends a
{
  public g()
  {
    super("color", Color.class);
  }

  public g(String paramString)
  {
    super(paramString, Color.class);
  }

  public Object a(e parame)
  {
    int i = Integer.valueOf(parame.a("r")).intValue();
    if (i == -1)
      return new l();
    int j = Integer.valueOf(parame.a("g")).intValue();
    int k = Integer.valueOf(parame.a("b")).intValue();
    return new Color(i, j, k);
  }

  public e e()
  {
    Color localColor = (Color)c();
    e locale = new e();
    if (localColor == null)
    {
      locale.a("r", "-1");
    }
    else
    {
      locale.a("r", String.valueOf(localColor.getRed()));
      locale.a("g", String.valueOf(localColor.getGreen()));
      locale.a("b", String.valueOf(localColor.getBlue()));
    }
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.a.a.g
 * JD-Core Version:    0.6.0
 */