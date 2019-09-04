package com.zend.ide.d;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

class cn
  implements ItemListener
{
  final de a;

  private cn(de paramde)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    Font localFont1 = this.a.c().d();
    String str = (String)de.a(this.a).getSelectedItem();
    if ((str != null) && (!str.equals(this.a.c().d().getFontName())))
    {
      if (str.indexOf(".plain") != -1)
        str = str.substring(0, str.indexOf(".plain"));
      Font localFont2 = new Font(str, localFont1.getStyle(), localFont1.getSize());
      this.a.c().a(localFont2);
      this.a.b.a(localFont2);
    }
  }

  cn(de paramde, cm paramcm)
  {
    this(paramde);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.cn
 * JD-Core Version:    0.6.0
 */