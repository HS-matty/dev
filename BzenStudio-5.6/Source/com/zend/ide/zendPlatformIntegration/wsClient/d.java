package com.zend.ide.zendPlatformIntegration.wsClient;

import com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.ServiceResponse;
import com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.e;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;
import javax.xml.namespace.QName;
import javax.xml.soap.MimeHeaders;
import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.NoEndPointException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.utils.JavaUtils;

public class d extends e
{
  private String[] f = null;

  public d(URL paramURL, Service paramService)
    throws AxisFault
  {
    super(paramURL, paramService);
  }

  protected Call createCall()
    throws RemoteException
  {
    try
    {
      c localc = new c(this, (Service)this.service);
      if (this.maintainSessionSet)
        localc.setMaintainSession(this.maintainSession);
      if (this.cachedUsername != null)
        localc.setUsername(this.cachedUsername);
      if (this.cachedPassword != null)
        localc.setPassword(this.cachedPassword);
      if (this.cachedEndpoint != null)
        localc.setTargetEndpointAddress(this.cachedEndpoint);
      if (this.cachedTimeout != null)
        localc.setTimeout(this.cachedTimeout);
      if (this.cachedPortName != null)
        localc.setPortName(this.cachedPortName);
      Enumeration localEnumeration = this.cachedProperties.keys();
      while (localEnumeration.hasMoreElements())
      {
        String str = (String)localEnumeration.nextElement();
        localc.setProperty(str, this.cachedProperties.get(str));
      }
      synchronized (this)
      {
        if (firstCall())
        {
          localc.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
          localc.setEncodingStyle("http://schemas.xmlsoap.org/soap/encoding/");
          for (int i = 0; i < this.c.size(); i++)
          {
            Class localClass = (Class)this.a.get(i);
            QName localQName = (QName)this.b.get(i);
            Object localObject1 = this.c.get(i);
            Object localObject2;
            Object localObject3;
            if ((localObject1 instanceof Class))
            {
              localObject2 = (Class)this.c.get(i);
              localObject3 = (Class)this.d.get(i);
              localc.registerTypeMapping(localClass, localQName, (Class)localObject2, (Class)localObject3, false);
            }
            else
            {
              if (!(localObject1 instanceof javax.xml.rpc.encoding.SerializerFactory))
                continue;
              localObject2 = (org.apache.axis.encoding.SerializerFactory)this.c.get(i);
              localObject3 = (DeserializerFactory)this.d.get(i);
              localc.registerTypeMapping(localClass, localQName, (org.apache.axis.encoding.SerializerFactory)localObject2, (DeserializerFactory)localObject3, false);
            }
          }
        }
      }
      return localc;
    }
    catch (Throwable localThrowable)
    {
    }
    throw new AxisFault("Failure trying to get the Call object", localThrowable);
  }

  public ServiceResponse login(String paramString1, String paramString2)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    this.f = null;
    Call localCall = createCall();
    localCall.setOperation(e[16]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "login"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramString1, paramString2 });
      Message localMessage = localCall.getResponseMessage();
      this.f = localMessage.getMimeHeaders().getHeader("set-cookie");
      if ((localObject instanceof RemoteException))
        throw ((RemoteException)localObject);
      extractAttachments(localCall);
      try
      {
        return (ServiceResponse)localObject;
      }
      catch (Exception localException)
      {
        return (ServiceResponse)JavaUtils.convert(localObject, ServiceResponse.class);
      }
    }
    catch (AxisFault localAxisFault)
    {
    }
    throw localAxisFault;
  }

  static String[] a(d paramd)
  {
    return paramd.f;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.wsClient.d
 * JD-Core Version:    0.6.0
 */