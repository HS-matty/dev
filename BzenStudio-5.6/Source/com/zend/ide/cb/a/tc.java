package com.zend.ide.cb.a;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;

public class tc extends JTabbedPane
  implements k
{
  private String a;
  private sc b;
  private String c;

  public tc(String paramString, sc paramsc)
  {
    this.a = paramString;
    this.b = paramsc;
    this.c = "infoTab";
    a();
  }

  private void a()
  {
    addTab(this.a, this.b.a());
  }

  public JComponent a()
  {
    return this;
  }

  public void c()
  {
    if (this.b != null)
      this.b.c();
  }

  public void a(String paramString)
  {
    this.c = paramString;
  }

  public String d()
  {
    return this.c;
  }

  public boolean e()
  {
    return requestFocusInWindow();
  }

  public void setBackground(Color paramColor)
  {
    super.setBackground(paramColor);
    if (this.b != null)
      this.b.setBackground(paramColor);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.tc
 * JD-Core Version:    0.6.0
 */