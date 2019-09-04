package com.a.a;

import com.a.e;
import java.awt.Rectangle;

public class n extends a
{
  public n()
  {
    super("Rectangle", Rectangle.class);
  }

  public Object a(e parame)
  {
    int i = Integer.parseInt(parame.a("x"));
    int j = Integer.parseInt(parame.a("y"));
    int k = Integer.parseInt(parame.a("width"));
    int m = Integer.parseInt(parame.a("hight"));
    return new Rectangle(i, j, k, m);
  }

  public e e()
  {
    Rectangle localRectangle = (Rectangle)c();
    e locale = new e();
    locale.a("x", String.valueOf((int)localRectangle.getX()));
    locale.a("y", String.valueOf((int)localRectangle.getY()));
    locale.a("width", String.valueOf((int)localRectangle.getWidth()));
    locale.a("hight", String.valueOf((int)localRectangle.getHeight()));
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.a.a.n
 * JD-Core Version:    0.6.0
 */