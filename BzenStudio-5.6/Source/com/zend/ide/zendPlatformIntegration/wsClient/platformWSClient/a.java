package com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class a
  implements Serializable
{
  private String a;
  private String b;
  private String c;
  private String d;
  private Object e = null;
  private boolean f = false;
  private static TypeDesc g = new TypeDesc(a.class, true);

  public a()
  {
  }

  public a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
  }

  public String getCurrent_value()
  {
    return this.a;
  }

  public void setCurrent_value(String paramString)
  {
    this.a = paramString;
  }

  public String getDirective_name()
  {
    return this.b;
  }

  public void setDirective_name(String paramString)
  {
    this.b = paramString;
  }

  public String getIni_file()
  {
    return this.c;
  }

  public void setIni_file(String paramString)
  {
    this.c = paramString;
  }

  public String getLoaded_value()
  {
    return this.d;
  }

  public void setLoaded_value(String paramString)
  {
    this.d = paramString;
  }

  public synchronized boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a))
      return false;
    a locala = (a)paramObject;
    if (paramObject == null)
      return false;
    if (this == paramObject)
      return true;
    if (this.e != null)
      return this.e == paramObject;
    this.e = paramObject;
    int i = ((this.a == null) && (locala.getCurrent_value() == null)) || ((this.a != null) && (this.a.equals(locala.getCurrent_value())) && (((this.b == null) && (locala.getDirective_name() == null)) || ((this.b != null) && (this.b.equals(locala.getDirective_name())) && (((this.c == null) && (locala.getIni_file() == null)) || ((this.c != null) && (this.c.equals(locala.getIni_file())) && (((this.d == null) && (locala.getLoaded_value() == null)) || ((this.d != null) && (this.d.equals(locala.getLoaded_value()))))))))) ? 1 : 0;
    this.e = null;
    return i;
  }

  public synchronized int hashCode()
  {
    if (this.f)
      return 0;
    this.f = true;
    int i = 1;
    if (getCurrent_value() != null)
      i += getCurrent_value().hashCode();
    if (getDirective_name() != null)
      i += getDirective_name().hashCode();
    if (getIni_file() != null)
      i += getIni_file().hashCode();
    if (getLoaded_value() != null)
      i += getLoaded_value().hashCode();
    this.f = false;
    return i;
  }

  public static TypeDesc getTypeDesc()
  {
    return g;
  }

  public static Serializer getSerializer(String paramString, Class paramClass, QName paramQName)
  {
    return new BeanSerializer(paramClass, paramQName, g);
  }

  public static Deserializer getDeserializer(String paramString, Class paramClass, QName paramQName)
  {
    return new BeanDeserializer(paramClass, paramQName, g);
  }

  static
  {
    g.setXmlType(new QName("urn:PlatformWS", "DirectiveDetails"));
    ElementDesc localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("current_value");
    localElementDesc.setXmlName(new QName("", "current_value"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    g.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("directive_name");
    localElementDesc.setXmlName(new QName("", "directive_name"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    g.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("ini_file");
    localElementDesc.setXmlName(new QName("", "ini_file"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    g.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("loaded_value");
    localElementDesc.setXmlName(new QName("", "loaded_value"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    g.addFieldDesc(localElementDesc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.a
 * JD-Core Version:    0.6.0
 */