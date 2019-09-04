package com.zend.ide.zendPlatformIntegration.b.a;

import com.zend.ide.util.ct;
import com.zend.ide.zendPlatformIntegration.b.c;

public class f extends a
{
  public f()
  {
    this.b = ct.a(1880);
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
    return ct.a(1958);
  }

  public String b()
  {
    return "function_name";
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
    return localc.m();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.b.a.f
 * JD-Core Version:    0.6.0
 */