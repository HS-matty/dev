package com.zend.ide.f.b;

import com.zend.ide.b.m;
import com.zend.ide.f.s;
import com.zend.ide.m.r;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class i extends b
{
  private static final ImageIcon m = cv.b("explorer/phpfile.gif");

  public i(r paramr, s params)
  {
    super(params, paramr, false);
  }

  public Icon e()
  {
    return m;
  }

  public String f()
  {
    return "includeFileDataContext";
  }

  public String g()
  {
    r localr = (r)this.userObject;
    String str1 = toString();
    String str2 = localr.b();
    if (localr.e())
      str1 = str1 + "\n" + localr.f().c();
    if ((localr.b() != null) && (!localr.b().equals("")) && (!localr.b().equals(ct.a(558))))
      str1 = str1 + "\n" + str2;
    return str1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.i
 * JD-Core Version:    0.6.0
 */