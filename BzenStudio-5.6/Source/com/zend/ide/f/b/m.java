package com.zend.ide.f.b;

import com.zend.ide.f.s;
import com.zend.ide.m.c;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class m extends b
{
  private static final ImageIcon i = cv.b("classbrowser/phpconstantdata.gif");

  public m(c paramc, s params)
  {
    super(params, paramc, false);
  }

  public Icon e()
  {
    return i;
  }

  public String f()
  {
    return "classConstDataContext";
  }

  public String g()
  {
    c localc = (c)this.userObject;
    String str1 = toString();
    String str2 = localc.b();
    if (localc.e())
      str1 = str1 + '\n' + localc.f().c();
    if ((localc.b() != null) && (!localc.b().equals("")) && (!localc.b().equals(ct.a(558))))
      str1 = str1 + '\n' + str2;
    return str1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.m
 * JD-Core Version:    0.6.0
 */