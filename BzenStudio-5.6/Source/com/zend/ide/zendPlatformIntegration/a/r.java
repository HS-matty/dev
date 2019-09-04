package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c;

public class r
{
  private String a;
  private String b;
  private boolean c;

  public r(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramBoolean;
  }

  public r(c paramc, boolean paramBoolean)
  {
    this.a = ((String)paramc.getKey());
    this.b = ((String)paramc.getValue());
    this.c = paramBoolean;
  }

  public String a()
  {
    return this.a;
  }

  public String b()
  {
    return this.b;
  }

  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  public boolean c()
  {
    return this.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.r
 * JD-Core Version:    0.6.0
 */