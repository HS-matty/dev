package com.zend.ide.zendPlatformIntegration.b.a;

import com.zend.ide.util.ct;
import com.zend.ide.zendPlatformIntegration.b.c;

public class o extends a
{
  public o()
  {
    this.b = ct.a(1876);
  }

  public int compare(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null))
      return 0;
    String str1 = (String)paramObject1;
    String str2 = (String)paramObject2;
    return str1.compareTo(str2);
  }

  public String a()
  {
    return ct.a(1967);
  }

  public String b()
  {
    return "vhost";
  }

  public int c()
  {
    return 100;
  }

  public String a(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof c)))
      return "";
    c localc = (c)paramObject;
    return localc.i();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.b.a.o
 * JD-Core Version:    0.6.0
 */