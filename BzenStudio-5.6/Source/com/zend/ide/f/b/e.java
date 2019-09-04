package com.zend.ide.f.b;

import com.zend.ide.b.m;
import com.zend.ide.f.s;
import com.zend.ide.m.bj;
import com.zend.ide.m.z;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class e extends b
{
  private static final ImageIcon m = cv.b("classbrowser/phpuservardata.gif");

  public e(z paramz, s params)
  {
    super(params, paramz, false);
  }

  public String toString()
  {
    z localz = (z)this.userObject;
    String str1 = bj.a(localz.d());
    String str2 = localz.c();
    StringBuffer localStringBuffer = new StringBuffer();
    if ((str1 != null) && (str1.length() > 0))
    {
      localStringBuffer.append(str1);
      localStringBuffer.append(" ");
    }
    localStringBuffer.append(localz.a());
    if ((str2 != null) && (str2.length() > 0))
    {
      localStringBuffer.append(" ");
      localStringBuffer.append(str2);
    }
    return localStringBuffer.toString();
  }

  public Icon e()
  {
    return m;
  }

  public String f()
  {
    return "variableDataContext";
  }

  public String g()
  {
    z localz = (z)this.userObject;
    String str1 = toString();
    String str2 = localz.b();
    if (localz.e())
      str1 = str1 + "\n" + localz.f().c();
    if ((localz.b() != null) && (!localz.b().equals("")) && (!localz.b().equals(ct.a(558))))
      str1 = str1 + "\n" + str2;
    return str1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.e
 * JD-Core Version:    0.6.0
 */