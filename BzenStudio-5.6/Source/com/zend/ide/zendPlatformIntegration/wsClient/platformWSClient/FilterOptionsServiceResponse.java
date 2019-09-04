package com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class FilterOptionsServiceResponse
  implements Serializable
{
  private c[] a;
  private boolean b;
  private String c;
  private Object d = null;
  private boolean e = false;
  private static TypeDesc f = new TypeDesc(FilterOptionsServiceResponse.class, true);

  public FilterOptionsServiceResponse()
  {
  }

  public FilterOptionsServiceResponse(c[] paramArrayOfc, boolean paramBoolean, String paramString)
  {
    this.a = paramArrayOfc;
    this.b = paramBoolean;
    this.c = paramString;
  }

  public c[] getResponse()
  {
    return this.a;
  }

  public void setResponse(c[] paramArrayOfc)
  {
    this.a = paramArrayOfc;
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
    if (!(paramObject instanceof FilterOptionsServiceResponse))
      return false;
    FilterOptionsServiceResponse localFilterOptionsServiceResponse = (FilterOptionsServiceResponse)paramObject;
    if (paramObject == null)
      return false;
    if (this == paramObject)
      return true;
    if (this.d != null)
      return this.d == paramObject;
    this.d = paramObject;
    int i = ((this.a == null) && (localFilterOptionsServiceResponse.getResponse() == null)) || ((this.a != null) && (Arrays.equals(this.a, localFilterOptionsServiceResponse.getResponse())) && (this.b == localFilterOptionsServiceResponse.isReturn_code()) && (((this.c == null) && (localFilterOptionsServiceResponse.getReturn_msg() == null)) || ((this.c != null) && (this.c.equals(localFilterOptionsServiceResponse.getReturn_msg()))))) ? 1 : 0;
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
      for (int j = 0; j < Array.getLength(getResponse()); j++)
      {
        Object localObject = Array.get(getResponse(), j);
        if ((localObject == null) || (localObject.getClass().isArray()))
          continue;
        i += localObject.hashCode();
      }
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
    f.setXmlType(new QName("urn:PlatformWS", "FilterOptionsServiceResponse"));
    ElementDesc localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("response");
    localElementDesc.setXmlName(new QName("", "response"));
    localElementDesc.setXmlType(new QName("urn:PlatformWS", "FilterOptions"));
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
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.FilterOptionsServiceResponse
 * JD-Core Version:    0.6.0
 */