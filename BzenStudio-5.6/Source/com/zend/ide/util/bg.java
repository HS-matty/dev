package com.zend.ide.util;

import com.zend.ide.p.cb;
import com.zend.ide.p.w;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

class bg extends cb
{
  private String d;
  private String e;

  bg(String paramString1, String paramString2)
  {
    super("Configuration", "Would you like to load configuration from previous version? <br><br> - Click 'Yes' to import previous version configuration.<br> - Click 'No' to create new configuration.", BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(""), BorderFactory.createEmptyBorder(8, 8, 8, 8)));
    this.d = paramString1;
    this.e = paramString2;
  }

  protected JPanel c()
  {
    this.b = new JPanel(new FlowLayout(2));
    w localw1 = new w("&Yes");
    w localw2 = new w("&No");
    localw2.addActionListener(new xb(this));
    localw1.addActionListener(new yb(this));
    this.b.add(localw1);
    this.b.add(localw2);
    return this.b;
  }

  static String a(bg parambg)
  {
    return parambg.d;
  }

  static String b(bg parambg)
  {
    return parambg.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.bg
 * JD-Core Version:    0.6.0
 */