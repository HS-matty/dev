package com.zend.ide.f.b;

import com.zend.ide.b.m;
import com.zend.ide.f.s;
import com.zend.ide.m.bd;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class f extends b
{
  private static final ImageIcon m = cv.b("classbrowser/phpconstantdata.gif");

  public f(bd parambd, s params)
  {
    super(params, parambd, false);
  }

  public String toString()
  {
    bd localbd = (bd)this.userObject;
    String str = localbd.a() + " = " + localbd.c();
    return str;
  }

  public String g()
  {
    bd localbd = (bd)this.userObject;
    String str = localbd.a() + " = " + localbd.c();
    if (localbd.e())
      str = str + "\n" + localbd.f().c();
    if ((localbd.b() != null) && (!localbd.b().equals("")) && (!localbd.b().equals(ct.a(558))))
      str = str + "\n" + localbd.b();
    return str;
  }

  public Icon e()
  {
    return m;
  }

  public String f()
  {
    return "constantsDataContext";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.f
 * JD-Core Version:    0.6.0
 */