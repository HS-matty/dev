package com.zend.ide.zendPlatformIntegration.b.a;

import com.zend.ide.util.ct;
import com.zend.ide.zendPlatformIntegration.b.c;

public class g extends a
{
  public g()
  {
    this.b = ct.a(1870);
  }

  public int compare(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null))
      return 0;
    int i = 0;
    int j = 0;
    i = Integer.parseInt((String)paramObject1);
    j = Integer.parseInt((String)paramObject2);
    return i - j;
  }

  public String a()
  {
    return ct.a(1959);
  }

  public String b()
  {
    return "id";
  }

  public int c()
  {
    return 50;
  }

  public String a(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof c)))
      return "";
    c localc = (c)paramObject;
    return localc.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.b.a.g
 * JD-Core Version:    0.6.0
 */