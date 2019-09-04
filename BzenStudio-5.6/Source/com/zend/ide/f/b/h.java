package com.zend.ide.f.b;

import com.zend.ide.b.m;
import com.zend.ide.f.s;
import com.zend.ide.m.a;
import com.zend.ide.m.bh;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class h extends b
{
  private static final ImageIcon m = cv.b("classbrowser/phpfunctiondata.gif");

  public h(bh parambh, s params)
  {
    super(params, parambh, false);
  }

  public String toString()
  {
    bh localbh = (bh)this.userObject;
    return a.c().a(localbh);
  }

  public String g()
  {
    bh localbh = (bh)this.userObject;
    String str1 = toString();
    String str2 = localbh.b();
    if (localbh.e())
      str1 = str1 + "\n" + localbh.f().c();
    if ((localbh.b() != null) && (!localbh.b().equals("")) && (!localbh.b().equals(ct.a(558))))
      str1 = str1 + "\n" + str2;
    return str1;
  }

  public Icon e()
  {
    return m;
  }

  public String f()
  {
    return "functionDataContext";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.h
 * JD-Core Version:    0.6.0
 */