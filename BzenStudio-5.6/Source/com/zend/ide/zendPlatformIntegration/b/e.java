package com.zend.ide.zendPlatformIntegration.b;

import com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b;

public class e
{
  private boolean a = false;
  private static e b = null;
  private c[] c;

  public static synchronized e a()
  {
    if (b == null)
      b = new e();
    return b;
  }

  public boolean b()
  {
    return this.a;
  }

  public c[] c()
  {
    if (this.c != null)
      return this.c;
    return new c[0];
  }

  public void a(b[] paramArrayOfb)
  {
    this.c = new c[paramArrayOfb.length];
    for (int i = 0; i < paramArrayOfb.length; i++)
      this.c[i] = new c(paramArrayOfb[i]);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.b.e
 * JD-Core Version:    0.6.0
 */