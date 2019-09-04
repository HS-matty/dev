package com.zend.ide.n.td;

import java.awt.Color;
import java.awt.Font;

public class w
  implements ob
{
  protected static char[] a = { '.', '.', '.' };
  protected static Color b = new Color(133, 133, 133);
  protected static Color c = new Color(230, 230, 230);
  private char[] d;
  private Font e;
  private Color f;
  private Color g;

  public w()
  {
    this(a, null, c, b);
  }

  public w(char[] paramArrayOfChar, Font paramFont, Color paramColor1, Color paramColor2)
  {
    if ((paramArrayOfChar == null) || (paramArrayOfChar.length == 0))
      throw new IllegalArgumentException("The fold must have a valid mark");
    this.d = paramArrayOfChar;
    this.e = paramFont;
    this.f = paramColor1;
    this.g = paramColor2;
  }

  public Font a()
  {
    return this.e;
  }

  public char[] b()
  {
    return this.d;
  }

  public int c()
  {
    return this.d.length;
  }

  public Color d()
  {
    return this.f;
  }

  public Color e()
  {
    return this.g;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.w
 * JD-Core Version:    0.6.0
 */