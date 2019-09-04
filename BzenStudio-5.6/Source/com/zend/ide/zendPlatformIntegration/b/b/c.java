package com.zend.ide.zendPlatformIntegration.b.b;

import com.zend.ide.zendPlatformIntegration.wsClient.a;
import com.zend.ide.zendPlatformIntegration.wsClient.b;
import java.rmi.RemoteException;
import org.apache.axis.AxisFault;

public abstract class c
{
  protected String a = "";
  protected boolean b = false;

  public abstract void a();

  public abstract int a(b paramb)
    throws AxisFault, a, RemoteException;

  public abstract Object b();

  public String c()
  {
    return this.a;
  }

  public boolean d()
  {
    return this.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.b.b.c
 * JD-Core Version:    0.6.0
 */