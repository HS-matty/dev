package com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class b
  implements Serializable
{
  private String a;
  private BigInteger b;
  private Object c;
  private BigInteger d;
  private String e;
  private Object f;
  private String g;
  private BigInteger h;
  private BigInteger i;
  private String j;
  private Object k;
  private BigInteger l;
  private Object m;
  private boolean n;
  private BigInteger o;
  private String p;
  private BigInteger q;
  private String r;
  private String s;
  private BigInteger t;
  private String u;
  private BigInteger v;
  private String w;
  private String x;
  private String y;
  private String z;
  private Object A = null;
  private boolean B = false;
  private static TypeDesc C = new TypeDesc(b.class, true);

  public b()
  {
  }

  public b(String paramString1, BigInteger paramBigInteger1, Object paramObject1, BigInteger paramBigInteger2, String paramString2, Object paramObject2, String paramString3, BigInteger paramBigInteger3, BigInteger paramBigInteger4, String paramString4, Object paramObject3, BigInteger paramBigInteger5, Object paramObject4, boolean paramBoolean, BigInteger paramBigInteger6, String paramString5, BigInteger paramBigInteger7, String paramString6, String paramString7, BigInteger paramBigInteger8, String paramString8, BigInteger paramBigInteger9, String paramString9, String paramString10, String paramString11, String paramString12)
  {
    this.a = paramString1;
    this.b = paramBigInteger1;
    this.c = paramObject1;
    this.d = paramBigInteger2;
    this.e = paramString2;
    this.f = paramObject2;
    this.g = paramString3;
    this.h = paramBigInteger3;
    this.i = paramBigInteger4;
    this.j = paramString4;
    this.k = paramObject3;
    this.l = paramBigInteger5;
    this.m = paramObject4;
    this.n = paramBoolean;
    this.o = paramBigInteger6;
    this.p = paramString5;
    this.q = paramBigInteger7;
    this.r = paramString6;
    this.s = paramString7;
    this.t = paramBigInteger8;
    this.u = paramString8;
    this.v = paramBigInteger9;
    this.w = paramString9;
    this.x = paramString10;
    this.y = paramString11;
    this.z = paramString12;
  }

  public String getAggregation_hint()
  {
    return this.a;
  }

  public void setAggregation_hint(String paramString)
  {
    this.a = paramString;
  }

  public BigInteger getAvg_triggered_value()
  {
    return this.b;
  }

  public void setAvg_triggered_value(BigInteger paramBigInteger)
  {
    this.b = paramBigInteger;
  }

  public Object getBacktrace()
  {
    return this.c;
  }

  public void setBacktrace(Object paramObject)
  {
    this.c = paramObject;
  }

  public BigInteger getCpu_load()
  {
    return this.d;
  }

  public void setCpu_load(BigInteger paramBigInteger)
  {
    this.d = paramBigInteger;
  }

  public String getCustom_name()
  {
    return this.e;
  }

  public void setCustom_name(String paramString)
  {
    this.e = paramString;
  }

  public Object getData_vars()
  {
    return this.f;
  }

  public void setData_vars(Object paramObject)
  {
    this.f = paramObject;
  }

  public String getError_text()
  {
    return this.g;
  }

  public void setError_text(String paramString)
  {
    this.g = paramString;
  }

  public BigInteger getError_type()
  {
    return this.h;
  }

  public void setError_type(BigInteger paramBigInteger)
  {
    this.h = paramBigInteger;
  }

  public BigInteger getFirst_occurence()
  {
    return this.i;
  }

  public void setFirst_occurence(BigInteger paramBigInteger)
  {
    this.i = paramBigInteger;
  }

  public String getFunction_name()
  {
    return this.j;
  }

  public void setFunction_name(String paramString)
  {
    this.j = paramString;
  }

  public Object getFunction_parameters()
  {
    return this.k;
  }

  public void setFunction_parameters(Object paramObject)
  {
    this.k = paramObject;
  }

  public BigInteger getId()
  {
    return this.l;
  }

  public void setId(BigInteger paramBigInteger)
  {
    this.l = paramBigInteger;
  }

  public Object getInclude_files()
  {
    return this.m;
  }

  public void setInclude_files(Object paramObject)
  {
    this.m = paramObject;
  }

  public boolean isIs_preserved()
  {
    return this.n;
  }

  public void setIs_preserved(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }

  public BigInteger getLast_occurence()
  {
    return this.o;
  }

  public void setLast_occurence(BigInteger paramBigInteger)
  {
    this.o = paramBigInteger;
  }

  public String getLocation()
  {
    return this.p;
  }

  public void setLocation(String paramString)
  {
    this.p = paramString;
  }

  public BigInteger getNumber_of_occurences()
  {
    return this.q;
  }

  public void setNumber_of_occurences(BigInteger paramBigInteger)
  {
    this.q = paramBigInteger;
  }

  public String getSeverity()
  {
    return this.r;
  }

  public void setSeverity(String paramString)
  {
    this.r = paramString;
  }

  public String getSource_file()
  {
    return this.s;
  }

  public void setSource_file(String paramString)
  {
    this.s = paramString;
  }

  public BigInteger getSource_line()
  {
    return this.t;
  }

  public void setSource_line(BigInteger paramBigInteger)
  {
    this.t = paramBigInteger;
  }

  public String getStatus()
  {
    return this.u;
  }

  public void setStatus(String paramString)
  {
    this.u = paramString;
  }

  public BigInteger getTriggered_value()
  {
    return this.v;
  }

  public void setTriggered_value(BigInteger paramBigInteger)
  {
    this.v = paramBigInteger;
  }

  public String getType()
  {
    return this.w;
  }

  public void setType(String paramString)
  {
    this.w = paramString;
  }

  public String getUrl()
  {
    return this.x;
  }

  public void setUrl(String paramString)
  {
    this.x = paramString;
  }

  public String getUrl_schema()
  {
    return this.y;
  }

  public void setUrl_schema(String paramString)
  {
    this.y = paramString;
  }

  public String getVhost()
  {
    return this.z;
  }

  public void setVhost(String paramString)
  {
    this.z = paramString;
  }

  public synchronized boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b))
      return false;
    b localb = (b)paramObject;
    if (paramObject == null)
      return false;
    if (this == paramObject)
      return true;
    if (this.A != null)
      return this.A == paramObject;
    this.A = paramObject;
    int i1 = ((this.a == null) && (localb.getAggregation_hint() == null)) || ((this.a != null) && (this.a.equals(localb.getAggregation_hint())) && (((this.b == null) && (localb.getAvg_triggered_value() == null)) || ((this.b != null) && (this.b.equals(localb.getAvg_triggered_value())) && (((this.c == null) && (localb.getBacktrace() == null)) || ((this.c != null) && (this.c.equals(localb.getBacktrace())) && (((this.d == null) && (localb.getCpu_load() == null)) || ((this.d != null) && (this.d.equals(localb.getCpu_load())) && (((this.e == null) && (localb.getCustom_name() == null)) || ((this.e != null) && (this.e.equals(localb.getCustom_name())) && (((this.f == null) && (localb.getData_vars() == null)) || ((this.f != null) && (this.f.equals(localb.getData_vars())) && (((this.g == null) && (localb.getError_text() == null)) || ((this.g != null) && (this.g.equals(localb.getError_text())) && (((this.h == null) && (localb.getError_type() == null)) || ((this.h != null) && (this.h.equals(localb.getError_type())) && (((this.i == null) && (localb.getFirst_occurence() == null)) || ((this.i != null) && (this.i.equals(localb.getFirst_occurence())) && (((this.j == null) && (localb.getFunction_name() == null)) || ((this.j != null) && (this.j.equals(localb.getFunction_name())) && (((this.k == null) && (localb.getFunction_parameters() == null)) || ((this.k != null) && (this.k.equals(localb.getFunction_parameters())) && (((this.l == null) && (localb.getId() == null)) || ((this.l != null) && (this.l.equals(localb.getId())) && (((this.m == null) && (localb.getInclude_files() == null)) || ((this.m != null) && (this.m.equals(localb.getInclude_files())) && (this.n == localb.isIs_preserved()) && (((this.o == null) && (localb.getLast_occurence() == null)) || ((this.o != null) && (this.o.equals(localb.getLast_occurence())) && (((this.p == null) && (localb.getLocation() == null)) || ((this.p != null) && (this.p.equals(localb.getLocation())) && (((this.q == null) && (localb.getNumber_of_occurences() == null)) || ((this.q != null) && (this.q.equals(localb.getNumber_of_occurences())) && (((this.r == null) && (localb.getSeverity() == null)) || ((this.r != null) && (this.r.equals(localb.getSeverity())) && (((this.s == null) && (localb.getSource_file() == null)) || ((this.s != null) && (this.s.equals(localb.getSource_file())) && (((this.t == null) && (localb.getSource_line() == null)) || ((this.t != null) && (this.t.equals(localb.getSource_line())) && (((this.u == null) && (localb.getStatus() == null)) || ((this.u != null) && (this.u.equals(localb.getStatus())) && (((this.v == null) && (localb.getTriggered_value() == null)) || ((this.v != null) && (this.v.equals(localb.getTriggered_value())) && (((this.w == null) && (localb.getType() == null)) || ((this.w != null) && (this.w.equals(localb.getType())) && (((this.x == null) && (localb.getUrl() == null)) || ((this.x != null) && (this.x.equals(localb.getUrl())) && (((this.y == null) && (localb.getUrl_schema() == null)) || ((this.y != null) && (this.y.equals(localb.getUrl_schema())) && (((this.z == null) && (localb.getVhost() == null)) || ((this.z != null) && (this.z.equals(localb.getVhost()))))))))))))))))))))))))))))))))))))))))))))))))))) ? 1 : 0;
    this.A = null;
    return i1;
  }

  public synchronized int hashCode()
  {
    if (this.B)
      return 0;
    this.B = true;
    int i1 = 1;
    if (getAggregation_hint() != null)
      i1 += getAggregation_hint().hashCode();
    if (getAvg_triggered_value() != null)
      i1 += getAvg_triggered_value().hashCode();
    if (getBacktrace() != null)
      i1 += getBacktrace().hashCode();
    if (getCpu_load() != null)
      i1 += getCpu_load().hashCode();
    if (getCustom_name() != null)
      i1 += getCustom_name().hashCode();
    if (getData_vars() != null)
      i1 += getData_vars().hashCode();
    if (getError_text() != null)
      i1 += getError_text().hashCode();
    if (getError_type() != null)
      i1 += getError_type().hashCode();
    if (getFirst_occurence() != null)
      i1 += getFirst_occurence().hashCode();
    if (getFunction_name() != null)
      i1 += getFunction_name().hashCode();
    if (getFunction_parameters() != null)
      i1 += getFunction_parameters().hashCode();
    if (getId() != null)
      i1 += getId().hashCode();
    if (getInclude_files() != null)
      i1 += getInclude_files().hashCode();
    i1 += (isIs_preserved() ? Boolean.TRUE : Boolean.FALSE).hashCode();
    if (getLast_occurence() != null)
      i1 += getLast_occurence().hashCode();
    if (getLocation() != null)
      i1 += getLocation().hashCode();
    if (getNumber_of_occurences() != null)
      i1 += getNumber_of_occurences().hashCode();
    if (getSeverity() != null)
      i1 += getSeverity().hashCode();
    if (getSource_file() != null)
      i1 += getSource_file().hashCode();
    if (getSource_line() != null)
      i1 += getSource_line().hashCode();
    if (getStatus() != null)
      i1 += getStatus().hashCode();
    if (getTriggered_value() != null)
      i1 += getTriggered_value().hashCode();
    if (getType() != null)
      i1 += getType().hashCode();
    if (getUrl() != null)
      i1 += getUrl().hashCode();
    if (getUrl_schema() != null)
      i1 += getUrl_schema().hashCode();
    if (getVhost() != null)
      i1 += getVhost().hashCode();
    this.B = false;
    return i1;
  }

  public static TypeDesc getTypeDesc()
  {
    return C;
  }

  public static Serializer getSerializer(String paramString, Class paramClass, QName paramQName)
  {
    return new BeanSerializer(paramClass, paramQName, C);
  }

  public static Deserializer getDeserializer(String paramString, Class paramClass, QName paramQName)
  {
    return new BeanDeserializer(paramClass, paramQName, C);
  }

  static
  {
    C.setXmlType(new QName("urn:PlatformWS", "EventDetails"));
    ElementDesc localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("aggregation_hint");
    localElementDesc.setXmlName(new QName("", "aggregation_hint"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("avg_triggered_value");
    localElementDesc.setXmlName(new QName("", "avg_triggered_value"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "integer"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("backtrace");
    localElementDesc.setXmlName(new QName("", "backtrace"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "anyType"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("cpu_load");
    localElementDesc.setXmlName(new QName("", "cpu_load"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "integer"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("custom_name");
    localElementDesc.setXmlName(new QName("", "custom_name"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("data_vars");
    localElementDesc.setXmlName(new QName("", "data_vars"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "anyType"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("error_text");
    localElementDesc.setXmlName(new QName("", "error_text"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("error_type");
    localElementDesc.setXmlName(new QName("", "error_type"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "integer"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("first_occurence");
    localElementDesc.setXmlName(new QName("", "first_occurence"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "integer"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("function_name");
    localElementDesc.setXmlName(new QName("", "function_name"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("function_parameters");
    localElementDesc.setXmlName(new QName("", "function_parameters"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "anyType"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("id");
    localElementDesc.setXmlName(new QName("", "id"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "integer"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("include_files");
    localElementDesc.setXmlName(new QName("", "include_files"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "anyType"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("is_preserved");
    localElementDesc.setXmlName(new QName("", "is_preserved"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("last_occurence");
    localElementDesc.setXmlName(new QName("", "last_occurence"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "integer"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("location");
    localElementDesc.setXmlName(new QName("", "location"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("number_of_occurences");
    localElementDesc.setXmlName(new QName("", "number_of_occurences"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "integer"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("severity");
    localElementDesc.setXmlName(new QName("", "severity"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("source_file");
    localElementDesc.setXmlName(new QName("", "source_file"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("source_line");
    localElementDesc.setXmlName(new QName("", "source_line"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "integer"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("status");
    localElementDesc.setXmlName(new QName("", "status"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("triggered_value");
    localElementDesc.setXmlName(new QName("", "triggered_value"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "integer"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("type");
    localElementDesc.setXmlName(new QName("", "type"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("url");
    localElementDesc.setXmlName(new QName("", "url"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("url_schema");
    localElementDesc.setXmlName(new QName("", "url_schema"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
    localElementDesc = new ElementDesc();
    localElementDesc.setFieldName("vhost");
    localElementDesc.setXmlName(new QName("", "vhost"));
    localElementDesc.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    localElementDesc.setNillable(false);
    C.addFieldDesc(localElementDesc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b
 * JD-Core Version:    0.6.0
 */