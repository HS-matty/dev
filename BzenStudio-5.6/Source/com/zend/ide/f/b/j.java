package com.zend.ide.f.b;

import com.zend.ide.f.bm;
import com.zend.ide.f.bt;
import com.zend.ide.f.dd;
import com.zend.ide.f.s;
import com.zend.ide.m.bd;
import com.zend.ide.m.bf;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class j extends n
{
  public static final String k = ct.a(1014);
  private static final ImageIcon l = cv.b("classbrowser/phpconstantdata.gif");

  public j(int paramInt, s params)
  {
    super(k, true);
    this.h = paramInt;
    this.i = params;
  }

  public String toString()
  {
    return k;
  }

  public Object d()
  {
    switch (this.h)
    {
    case 0:
      bf localbf = (bf)((g)getParent()).getUserObject();
      bd[] arrayOfbd = localbf.k();
      dd.a(arrayOfbd);
      return arrayOfbd;
    case 1:
      return this.i.g().f();
    case 2:
      return bm.g();
    }
    return null;
  }

  public Icon e()
  {
    return l;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.j
 * JD-Core Version:    0.6.0
 */