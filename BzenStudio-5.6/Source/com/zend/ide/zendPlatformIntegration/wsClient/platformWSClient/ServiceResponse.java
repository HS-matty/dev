package com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ServiceResponse
  implements Serializable
{
  private Object a;
  private boolean b;
  private String c;
  private Object d = null;
  private boolean e = false;
  private static TypeDesc f = new TypeDesc(ServiceResponse.class, true);

  public ServiceResponse()
  {
  }

  public ServiceResponse(Object paramObject, boolean paramBoolean, String paramString)
  {
    this.a = paramObject;
    this.b = paramBoolean;
    this.c = paramString;
  }

  public Object getResponse()
  {
    return this.a;
  }

  public void setResponse(Object paramObject)
  {
    this.a = paramObject;
  }

  public boolean isReturn_code()
  {
    return this.b;
  }

  public void setReturn_code(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public String getReturn_msg()
  {
    return this.c;
  }

  public void setReturn_msg(String paramString)
  {
    this.c = paramString;
  }

  public synchronized boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ServiceResponse))
      return false;
    ServiceResponse localServiceResponse = (ServiceResponse)paramObject;
    if (paramObject == null)
      return false;
    if (this == paramObject)
      return true;
    if (this.d != null)
      return this.d == paramObject;
    this.d = paramObject;
    int i = ((this.a == null) && (localServiceResponse.getResponse() == null)) || ((this.a != null) && (this.a.equals(localServiceResponse.getResponse())) && (this.b == localServiceResponse.isReturn_code()) && (((this.c == null) && (localServiceResponse.getReturn_msg() == null)) || ((this.c != null) && (this.c.equals(localServiceResponse.getReturn_msg()))))) ? 1 : 0;
    this.d = null;
    return i;
  }

  public synchronized int hashCode()
  {
    if (this.e)
      return 0;
    this.e = true;
    int i = 1;
    if (getResponse() != null)
      i += getResponse().hashCode();
    i += (isReturn_code() ? Boolean.TRUE : Boolean.FALSE).hashCode();
    if (getReturn_msg() != null)
      i += getReturn_msg().hashCode();
    this.e = false;
    return i;
  }

  public static TypeDesc getTypeDesc()
  {
    return f;
  }

  public static Serializer getSerializer(String paramString, Class paramClass, QName paramQName)
  {
    return new BeanSerializer(paramClass, paramQName, f);
  }

  public static Deserializer getDeserializer(String paramString, Class paramClass, QName paramQName)
  {
    return new BeanDeserializer(paramClass, paramQName, f);
  }

  static
  {
    f.setXmlType(new QName("urn:PlatformWS", "ServiceResponse"));
    ElementDesc localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("response");
    localElementDesc.setXmlName(new QName("", "response"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "anyType"));
    localElementDesc.setNillable(false);
    f.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("return_code");
    localElementDesc.setXmlName(new QName("", "return_code"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
    localElementDesc.setNillable(false);
    f.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("return_msg");
    localElementDesc.setXmlName(new QName("", "return_msg"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    f.addFieldDesc(localElementDesc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.ServiceResponse
 * JD-Core Version:    0.6.0
 */