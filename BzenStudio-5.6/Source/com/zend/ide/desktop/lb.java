package com.zend.ide.desktop;

import com.zend.ide.n.dz;
import com.zend.ide.n.ho;
import com.zend.ide.n.ob;
import com.zend.ide.n.qb;
import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import com.zend.ide.util.cl;
import javax.swing.text.Document;
import javax.swing.text.Element;

class lb
  implements qb
{
  final bw a;

  private lb(bw parambw)
  {
  }

  public ob a(dz paramdz, int paramInt)
  {
    Document localDocument = paramdz.getDocument();
    String str1 = paramdz.k();
    try
    {
      int i = ((bl)((ho)localDocument).b(paramInt)).c();
      i = kc.g(i);
      if ((i != 135) && (i != 142))
        return null;
      Element localElement1 = localDocument.getDefaultRootElement();
      Element localElement2 = localElement1.getElement(localElement1.getElementIndex(paramInt));
      int j = bw.c(localDocument, paramInt, localElement2);
      int k = bw.d(localDocument, paramInt, localElement2);
      if ((j >= -1) && (k > -1))
      {
        String str2 = paramdz.getText(j, k - j);
        String str3 = bw.a(this.a, bw.b(str2), str1);
        if (str3 != null)
          return new kb(this.a, j, k, str3, str2);
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return null;
  }

  lb(bw parambw, ab paramab)
  {
    this(parambw);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.lb
 * JD-Core Version:    0.6.0
 */