package com.zend.ide.p;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JLabel;

public class bj extends JLabel
{
  private ArrayList c;
  private ArrayList d;
  private ArrayList e;

  public String getUIClassID()
  {
    return "FontsLabelUI";
  }

  public void setText(String paramString)
  {
    o();
    b(paramString, null, null);
    super.setText(paramString);
  }

  public void a(String paramString, Font paramFont, Color paramColor)
  {
    b(paramString, paramFont, paramColor);
    super.setText(getText() + paramString);
  }

  private void b(String paramString, Font paramFont, Color paramColor)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      this.c.add(paramString);
      this.d.add(paramColor);
      this.e.add(paramFont);
    }
  }

  public void o()
  {
    if (this.c == null)
    {
      this.c = new ArrayList();
      this.d = new ArrayList();
      this.e = new ArrayList();
    }
    this.c.clear();
    this.d.clear();
    this.e.clear();
    super.setText("");
  }

  public ArrayList b()
  {
    return this.c;
  }

  public ArrayList c()
  {
    return this.d;
  }

  public ArrayList d()
  {
    return this.e;
  }

  public int e()
  {
    Icon localIcon = getIcon();
    if (localIcon != null)
      return localIcon.getIconWidth() + getIconTextGap();
    return 0;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bj
 * JD-Core Version:    0.6.0
 */