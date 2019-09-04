package com.zend.ide.db;

import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import java.awt.LayoutManager;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class k extends jb
{
  final x a;

  k(x paramx, LayoutManager paramLayoutManager)
  {
    super(paramx, paramLayoutManager);
  }

  public boolean a()
  {
    String str = x.f(this.a).getText();
    if ((x.b(this.a).isSelected()) && ((str == null) || (str.equals(""))))
    {
      ba.a(this, ct.a(1409), ct.a(94), 0);
      return false;
    }
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.k
 * JD-Core Version:    0.6.0
 */