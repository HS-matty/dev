package com.zend.ide.zendPlatformIntegration.b.a;

import com.zend.ide.util.ct;

public class c extends a
{
  public c()
  {
    this.b = ct.a(1872);
  }

  public int compare(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null))
      return 0;
    int i = Integer.parseInt((String)paramObject1);
    int j = Integer.parseInt((String)paramObject2);
    return i - j;
  }

  public String a()
  {
    return ct.a(1955);
  }

  public String b()
  {
    return "count";
  }

  public int c()
  {
    return 60;
  }

  public String a(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof com.zend.ide.zendPlatformIntegration.b.c)))
      return "";
    com.zend.ide.zendPlatformIntegration.b.c localc = (com.zend.ide.zendPlatformIntegration.b.c)paramObject;
    return localc.e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.b.a.c
 * JD-Core Version:    0.6.0
 */