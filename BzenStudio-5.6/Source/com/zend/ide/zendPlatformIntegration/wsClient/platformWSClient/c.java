package com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class c
  implements Serializable
{
  private Object a;
  private Object b;
  private Object c = null;
  private boolean d = false;
  private static TypeDesc e = new TypeDesc(c.class, true);

  public c()
  {
  }

  public c(Object paramObject1, Object paramObject2)
  {
    this.a = paramObject1;
    this.b = paramObject2;
  }

  public Object getKey()
  {
    return this.a;
  }

  public void setKey(Object paramObject)
  {
    this.a = paramObject;
  }

  public Object getValue()
  {
    return this.b;
  }

  public void setValue(Object paramObject)
  {
    this.b = paramObject;
  }

  public synchronized boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c))
      return false;
    c localc = (c)paramObject;
    if (paramObject == null)
      return false;
    if (this == paramObject)
      return true;
    if (this.c != null)
      return this.c == paramObject;
    this.c = paramObject;
    int i = ((this.a == null) && (localc.getKey() == null)) || ((this.a != null) && (this.a.equals(localc.getKey())) && (((this.b == null) && (localc.getValue() == null)) || ((this.b != null) && (this.b.equals(localc.getValue()))))) ? 1 : 0;
    this.c = null;
    return i;
  }

  public synchronized int hashCode()
  {
    if (this.d)
      return 0;
    this.d = true;
    int i = 1;
    if (getKey() != null)
      i += getKey().hashCode();
    if (getValue() != null)
      i += getValue().hashCode();
    this.d = false;
    return i;
  }

  public static TypeDesc getTypeDesc()
  {
    return e;
  }

  public static Serializer getSerializer(String paramString, Class paramClass, QName paramQName)
  {
    return new BeanSerializer(paramClass, paramQName, e);
  }

  public static Deserializer getDeserializer(String paramString, Class paramClass, QName paramQName)
  {
    return new BeanDeserializer(paramClass, paramQName, e);
  }

  static
  {
    e.setXmlType(new QName("urn:PlatformWS", "FilterOptions"));
    ElementDesc localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("key");
    localElementDesc.setXmlName(new QName("", "key"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "anyType"));
    localElementDesc.setNillable(false);
    e.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("value");
    localElementDesc.setXmlName(new QName("", "value"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "anyType"));
    localElementDesc.setNillable(false);
    e.addFieldDesc(localElementDesc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c
 * JD-Core Version:    0.6.0
 */