package com.zend.ide.f.b;

import com.zend.ide.f.bt;
import com.zend.ide.f.dd;
import com.zend.ide.f.s;
import com.zend.ide.m.bf;
import com.zend.ide.m.v;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class o extends n
{
  public static final String j = ct.a(1579);
  private static final ImageIcon k = cv.b("classbrowser/phpconstantdata.gif");

  public o(int paramInt, s params)
  {
    super(j, true);
    this.h = paramInt;
    this.i = params;
  }

  public String toString()
  {
    return j;
  }

  public Object d()
  {
    switch (this.h)
    {
    case 0:
      bf localbf = (bf)((g)getParent()).getUserObject();
      v[] arrayOfv = localbf.a();
      dd.a(arrayOfv);
      return arrayOfv;
    case 1:
      return this.i.g().a();
    }
    return null;
  }

  public Icon e()
  {
    return k;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.o
 * JD-Core Version:    0.6.0
 */