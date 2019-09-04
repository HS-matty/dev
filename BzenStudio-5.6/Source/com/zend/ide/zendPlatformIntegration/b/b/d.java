package com.zend.ide.zendPlatformIntegration.b.b;

import com.zend.ide.zendPlatformIntegration.wsClient.a;
import com.zend.ide.zendPlatformIntegration.wsClient.b;
import java.rmi.RemoteException;
import org.apache.axis.AxisFault;

public class d extends c
{
  private String c;
  private com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c[] d;

  public d(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.c = paramString2;
  }

  public int a(b paramb)
    throws AxisFault, a, RemoteException
  {
    this.d = ((com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c[])(com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c[])paramb.a(this.c));
    return 0;
  }

  public Object b()
  {
    return this.d;
  }

  public void a()
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.b.b.d
 * JD-Core Version:    0.6.0
 */