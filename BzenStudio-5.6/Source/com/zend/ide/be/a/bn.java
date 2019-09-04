package com.zend.ide.be.a;

import com.zend.ide.bc.a;
import com.zend.ide.be.i;
import com.zend.ide.be.j;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

public class bn extends bm
  implements j
{
  private JLabel h;

  public bn(String paramString1, Icon paramIcon, String paramString2, boolean paramBoolean, i parami, JComponent paramJComponent, String paramString3)
  {
    super(paramString1, paramIcon, paramString2, paramBoolean, parami, paramJComponent);
    b(true);
    this.h = new JLabel();
    a(paramIcon);
    b(paramString1);
    this.e.add(this.h, "Center");
    a.a(this.h, paramString3 != null ? paramString3 : "DEFAULT");
  }

  public void b(String paramString)
  {
    this.h.setText(paramString);
  }

  public void a(Icon paramIcon)
  {
    this.h.setIcon(paramIcon);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bn
 * JD-Core Version:    0.6.0
 */