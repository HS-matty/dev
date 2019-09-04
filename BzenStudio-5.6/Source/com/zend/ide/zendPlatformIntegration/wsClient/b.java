package com.zend.ide.zendPlatformIntegration.wsClient;

import com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.EventServiceResponse;
import com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.FilterOptionsServiceResponse;
import com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.ServiceResponse;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.HashMap;
import org.apache.axis.AxisFault;
import org.apache.axis.client.Service;

public class b
{
  private d a;
  private String b;
  private String c;

  public b(String paramString1, String paramString2, String paramString3)
    throws AxisFault, MalformedURLException
  {
    this.a = new d(new URL(paramString1), new Service());
    this.b = paramString2;
    this.c = paramString3;
  }

  public com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b[] a(HashMap paramHashMap, BigInteger paramBigInteger1, BigInteger paramBigInteger2, String paramString, boolean paramBoolean)
    throws RemoteException, a
  {
    Object localObject = paramHashMap;
    if (paramHashMap.isEmpty())
      localObject = new Object[0];
    EventServiceResponse localEventServiceResponse = this.a.getAllEvents(localObject, paramBigInteger1, paramBigInteger2, paramString, paramBoolean);
    if (localEventServiceResponse == null)
      throw new a("Platform webSrvice operation faild for unknowen reason.");
    String str = "";
    if (!localEventServiceResponse.isReturn_code())
    {
      str = localEventServiceResponse.getReturn_msg();
      ServiceResponse localServiceResponse = a();
      if (!localServiceResponse.isReturn_code())
      {
        str = str + "\nLogin: " + localEventServiceResponse.getReturn_msg();
        throw new a(str);
      }
      localEventServiceResponse = this.a.getAllEvents(localObject, paramBigInteger1, paramBigInteger2, paramString, paramBoolean);
      if (!localEventServiceResponse.isReturn_code())
        throw new a(localEventServiceResponse.getReturn_msg());
    }
    return (com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b)localEventServiceResponse.getResponse();
  }

  public Object a(String paramString)
    throws RemoteException, a
  {
    FilterOptionsServiceResponse localFilterOptionsServiceResponse = this.a.getEventFilterAvailableOptions(paramString);
    if (localFilterOptionsServiceResponse == null)
      throw new a("Platform webSrvice operation faild for unknowen reason.");
    String str = "";
    if (!localFilterOptionsServiceResponse.isReturn_code())
    {
      str = localFilterOptionsServiceResponse.getReturn_msg();
      ServiceResponse localServiceResponse = a();
      if (!localServiceResponse.isReturn_code())
      {
        str = str + "\nLogin: " + localFilterOptionsServiceResponse.getReturn_msg();
        throw new a(str);
      }
      localFilterOptionsServiceResponse = this.a.getEventFilterAvailableOptions(paramString);
      if (!localFilterOptionsServiceResponse.isReturn_code())
        throw new a(localFilterOptionsServiceResponse.getReturn_msg());
    }
    return localFilterOptionsServiceResponse.getResponse();
  }

  public int a(HashMap paramHashMap)
    throws RemoteException, a
  {
    Object localObject = paramHashMap;
    if (paramHashMap.isEmpty())
      localObject = new Object[0];
    ServiceResponse localServiceResponse1 = this.a.getTotalNumberOfEvents(localObject);
    if (localServiceResponse1 == null)
      throw new a("Platform webSrvice operation faild for unknowen reason.");
    String str = "";
    if (!localServiceResponse1.isReturn_code())
    {
      str = localServiceResponse1.getReturn_msg();
      ServiceResponse localServiceResponse2 = a();
      if (!localServiceResponse2.isReturn_code())
      {
        str = str + "\nLogin: " + localServiceResponse1.getReturn_msg();
        throw new a(str);
      }
      localServiceResponse1 = this.a.getTotalNumberOfEvents(localObject);
      if (!localServiceResponse1.isReturn_code())
        throw new a(localServiceResponse1.getReturn_msg());
    }
    return Integer.valueOf((String)localServiceResponse1.getResponse()).intValue();
  }

  private ServiceResponse a()
    throws RemoteException
  {
    ServiceResponse localServiceResponse = this.a.login(this.b, this.c);
    return localServiceResponse;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.wsClient.b
 * JD-Core Version:    0.6.0
 */