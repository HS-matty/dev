package com.zend.ide.x;

import com.zend.ide.b.e;
import com.zend.ide.util.cz;

class f extends e
  implements l
{
  private f(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
  }

  public void a(cz paramcz)
  {
    ((i)paramcz).a(this);
  }

  public int compareTo(Object paramObject)
  {
    if ((paramObject instanceof f))
    {
      String str1 = a();
      String str2 = ((f)paramObject).a();
      if ((Character.digit(str1.charAt(0), 10) > 0) && (Character.digit(str2.charAt(0), 10) > 0))
      {
        int i = 0;
        int k = 0;
        int j;
        while ((j = Character.digit(str1.charAt(k++), 10)) >= 0)
          i = i * 10 + j;
        int m = 0;
        k = 0;
        while ((j = Character.digit(str2.charAt(k++), 10)) >= 0)
          m = m * 10 + j;
        return m - i;
      }
      return str1.compareToIgnoreCase(str2);
    }
    return -1;
  }

  f(String paramString1, String paramString2, m paramm)
  {
    this(paramString1, paramString2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.x.f
 * JD-Core Version:    0.6.0
 */