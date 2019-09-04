package com.zend.ide.cb.a.b;

import com.zend.ide.cb.h;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class c extends cc
{
  private static final ImageIcon j = cv.b("sql/tableField.gif");
  private static final ImageIcon k = cv.b("sql/tableFieldKey.gif");

  public c(h paramh)
  {
    super(paramh, false);
  }

  public Icon e()
  {
    h localh = (h)getUserObject();
    if (localh.b())
      return k;
    return j;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.c
 * JD-Core Version:    0.6.0
 */