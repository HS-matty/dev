package com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient;

import java.math.BigInteger;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;
import javax.xml.namespace.QName;
import org.apache.axis.AxisFault;
import org.apache.axis.NoEndPointException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.encoding.ser.ArrayDeserializerFactory;
import org.apache.axis.encoding.ser.ArraySerializerFactory;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.apache.axis.encoding.ser.EnumDeserializerFactory;
import org.apache.axis.encoding.ser.EnumSerializerFactory;
import org.apache.axis.encoding.ser.SimpleDeserializerFactory;
import org.apache.axis.encoding.ser.SimpleListDeserializerFactory;
import org.apache.axis.encoding.ser.SimpleListSerializerFactory;
import org.apache.axis.encoding.ser.SimpleSerializerFactory;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.utils.JavaUtils;

public class e extends Stub
  implements d
{
  protected Vector a = new Vector();
  protected Vector b = new Vector();
  protected Vector c = new Vector();
  protected Vector d = new Vector();
  protected static OperationDesc[] e = new OperationDesc[27];

  private static void _initOperationDesc1()
  {
    OperationDesc localOperationDesc = new OperationDesc();
    localOperationDesc.setName("addAllowedHostOnCluster");
    ParameterDesc localParameterDesc = new ParameterDesc(new QName("", "cluster"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "host_ip"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "addAllowedHostOnClusterReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[0] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("addAllowedHostOnServer");
    localParameterDesc = new ParameterDesc(new QName("", "server"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "host_ip1"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "addAllowedHostOnServerReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[1] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("closeEvent");
    localParameterDesc = new ParameterDesc(new QName("", "event_id"), 1, new QName("http://www.w3.org/2001/XMLSchema", "integer"), BigInteger.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "closeEventReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[2] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("debugEvent");
    localParameterDesc = new ParameterDesc(new QName("", "event_id1"), 1, new QName("http://www.w3.org/2001/XMLSchema", "integer"), BigInteger.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "debugEventReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[3] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("deleteEvent");
    localParameterDesc = new ParameterDesc(new QName("", "event_id2"), 1, new QName("http://www.w3.org/2001/XMLSchema", "integer"), BigInteger.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "deleteEventReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[4] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("getAllDirectives");
    localParameterDesc = new ParameterDesc(new QName("", "server1"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "DirectiveServiceResponse"));
    localOperationDesc.setReturnClass(DirectiveServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "getAllDirectivesReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[5] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("getAllEvents");
    localParameterDesc = new ParameterDesc(new QName("", "filter_array"), 1, new QName("http://www.w3.org/2001/XMLSchema", "anyType"), Object.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "offset"), 1, new QName("http://www.w3.org/2001/XMLSchema", "integer"), BigInteger.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "num_of_rows"), 1, new QName("http://www.w3.org/2001/XMLSchema", "integer"), BigInteger.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "sort_by"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "desc_order"), 1, new QName("http://www.w3.org/2001/XMLSchema", "boolean"), Boolean.TYPE, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "EventServiceResponse"));
    localOperationDesc.setReturnClass(EventServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "getAllEventsReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[6] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("getDirective");
    localParameterDesc = new ParameterDesc(new QName("", "server2"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "name"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "DirectiveServiceResponse"));
    localOperationDesc.setReturnClass(DirectiveServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "getDirectiveReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[7] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("getEventData");
    localParameterDesc = new ParameterDesc(new QName("", "event_id3"), 1, new QName("http://www.w3.org/2001/XMLSchema", "integer"), BigInteger.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "EventServiceResponse"));
    localOperationDesc.setReturnClass(EventServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "getEventDataReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[8] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("getEventFilterAvailableOptions");
    localParameterDesc = new ParameterDesc(new QName("", "filter_name"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "FilterOptionsServiceResponse"));
    localOperationDesc.setReturnClass(FilterOptionsServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "getEventFilterAvailableOptionsReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[9] = localOperationDesc;
  }

  private static void _initOperationDesc2()
  {
    OperationDesc localOperationDesc = new OperationDesc();
    localOperationDesc.setName("getEventFilterNames");
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "getEventFilterNamesReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[10] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("getEventSortOptions");
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "getEventSortOptionsReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[11] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("getServers");
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "getServersReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[12] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("getTotalNumberOfEvents");
    ParameterDesc localParameterDesc = new ParameterDesc(new QName("", "filter_array1"), 1, new QName("http://www.w3.org/2001/XMLSchema", "anyType"), Object.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "getTotalNumberOfEventsReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[13] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("getVersion");
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "getVersionReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[14] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("ignoreEvent");
    localParameterDesc = new ParameterDesc(new QName("", "event_id4"), 1, new QName("http://www.w3.org/2001/XMLSchema", "integer"), BigInteger.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "ignoreEventReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[15] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("isHostAllowed");
    localParameterDesc = new ParameterDesc(new QName("", "server3"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "host_ip2"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "isHostAllowedReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[16] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("login");
    localParameterDesc = new ParameterDesc(new QName("", "username"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "password"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "loginReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[17] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("preserveEvent");
    localParameterDesc = new ParameterDesc(new QName("", "event_id5"), 1, new QName("http://www.w3.org/2001/XMLSchema", "integer"), BigInteger.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "preserveEventReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[18] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("profileEvent");
    localParameterDesc = new ParameterDesc(new QName("", "event_id6"), 1, new QName("http://www.w3.org/2001/XMLSchema", "integer"), BigInteger.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "profileEventReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[19] = localOperationDesc;
  }

  private static void _initOperationDesc3()
  {
    OperationDesc localOperationDesc = new OperationDesc();
    localOperationDesc.setName("removeAllowedHostFromCluster");
    ParameterDesc localParameterDesc = new ParameterDesc(new QName("", "cluster1"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "host_ip3"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "removeAllowedHostFromClusterReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[20] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("removeAllowedHostFromServer");
    localParameterDesc = new ParameterDesc(new QName("", "server4"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "host_ip4"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "removeAllowedHostFromServerReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[21] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("restartCluster");
    localParameterDesc = new ParameterDesc(new QName("", "cluster2"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "password1"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "gracefull"), 1, new QName("http://www.w3.org/2001/XMLSchema", "boolean"), Boolean.TYPE, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "restartClusterReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[22] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("restartServer");
    localParameterDesc = new ParameterDesc(new QName("", "server5"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "password2"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "gracefull1"), 1, new QName("http://www.w3.org/2001/XMLSchema", "boolean"), Boolean.TYPE, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "restartServerReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[23] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("setDirectiveOnCluster");
    localParameterDesc = new ParameterDesc(new QName("", "cluster3"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "name1"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "value"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "ini_file"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "password3"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "setDirectiveOnClusterReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[24] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("setDirectiveOnServer");
    localParameterDesc = new ParameterDesc(new QName("", "server6"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "name2"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "value1"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "ini_file1"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localParameterDesc = new ParameterDesc(new QName("", "password4"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "setDirectiveOnServerReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[25] = localOperationDesc;
    localOperationDesc = new OperationDesc();
    localOperationDesc.setName("unpreserveEvent");
    localParameterDesc = new ParameterDesc(new QName("", "event_id7"), 1, new QName("http://www.w3.org/2001/XMLSchema", "integer"), BigInteger.class, false, false);
    localOperationDesc.addParameter(localParameterDesc);
    localOperationDesc.setReturnType(new QName("urn:PlatformWS", "ServiceResponse"));
    localOperationDesc.setReturnClass(ServiceResponse.class);
    localOperationDesc.setReturnQName(new QName("", "unpreserveEventReturn"));
    localOperationDesc.setStyle(Style.RPC);
    localOperationDesc.setUse(Use.ENCODED);
    e[26] = localOperationDesc;
  }

  public e()
    throws AxisFault
  {
    this(null);
  }

  public e(URL paramURL, javax.xml.rpc.Service paramService)
    throws AxisFault
  {
    this(paramService);
    this.cachedEndpoint = paramURL;
  }

  public e(javax.xml.rpc.Service paramService)
    throws AxisFault
  {
    if (paramService == null)
      this.service = new org.apache.axis.client.Service();
    else
      this.service = paramService;
    ((org.apache.axis.client.Service)this.service).setTypeMappingVersion("1.2");
    BeanSerializerFactory localBeanSerializerFactory = BeanSerializerFactory.class;
    BeanDeserializerFactory localBeanDeserializerFactory = BeanDeserializerFactory.class;
    EnumSerializerFactory localEnumSerializerFactory = EnumSerializerFactory.class;
    EnumDeserializerFactory localEnumDeserializerFactory = EnumDeserializerFactory.class;
    ArraySerializerFactory localArraySerializerFactory = ArraySerializerFactory.class;
    ArrayDeserializerFactory localArrayDeserializerFactory = ArrayDeserializerFactory.class;
    SimpleSerializerFactory localSimpleSerializerFactory = SimpleSerializerFactory.class;
    SimpleDeserializerFactory localSimpleDeserializerFactory = SimpleDeserializerFactory.class;
    SimpleListSerializerFactory localSimpleListSerializerFactory = SimpleListSerializerFactory.class;
    SimpleListDeserializerFactory localSimpleListDeserializerFactory = SimpleListDeserializerFactory.class;
    QName localQName1 = new QName("urn:PlatformWS", "DirectiveDetails");
    this.b.add(localQName1);
    Object localObject = a.class;
    this.a.add(localObject);
    this.c.add(localBeanSerializerFactory);
    this.d.add(localBeanDeserializerFactory);
    localQName1 = new QName("urn:PlatformWS", "DirectiveDetailsArray");
    this.b.add(localQName1);
    localObject = [Lcom.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.a.class;
    this.a.add(localObject);
    localQName1 = new QName("urn:PlatformWS", "DirectiveDetails");
    QName localQName2 = null;
    this.c.add(new ArraySerializerFactory(localQName1, localQName2));
    this.d.add(new ArrayDeserializerFactory());
    localQName1 = new QName("urn:PlatformWS", "DirectiveServiceResponse");
    this.b.add(localQName1);
    localObject = DirectiveServiceResponse.class;
    this.a.add(localObject);
    this.c.add(localBeanSerializerFactory);
    this.d.add(localBeanDeserializerFactory);
    localQName1 = new QName("urn:PlatformWS", "EventDetails");
    this.b.add(localQName1);
    localObject = b.class;
    this.a.add(localObject);
    this.c.add(localBeanSerializerFactory);
    this.d.add(localBeanDeserializerFactory);
    localQName1 = new QName("urn:PlatformWS", "EventDetailsArray");
    this.b.add(localQName1);
    localObject = [Lcom.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b.class;
    this.a.add(localObject);
    localQName1 = new QName("urn:PlatformWS", "EventDetails");
    localQName2 = null;
    this.c.add(new ArraySerializerFactory(localQName1, localQName2));
    this.d.add(new ArrayDeserializerFactory());
    localQName1 = new QName("urn:PlatformWS", "EventServiceResponse");
    this.b.add(localQName1);
    localObject = EventServiceResponse.class;
    this.a.add(localObject);
    this.c.add(localBeanSerializerFactory);
    this.d.add(localBeanDeserializerFactory);
    localQName1 = new QName("urn:PlatformWS", "FilterOptions");
    this.b.add(localQName1);
    localObject = c.class;
    this.a.add(localObject);
    this.c.add(localBeanSerializerFactory);
    this.d.add(localBeanDeserializerFactory);
    localQName1 = new QName("urn:PlatformWS", "FilterOptionsArray");
    this.b.add(localQName1);
    localObject = [Lcom.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c.class;
    this.a.add(localObject);
    localQName1 = new QName("urn:PlatformWS", "FilterOptions");
    localQName2 = null;
    this.c.add(new ArraySerializerFactory(localQName1, localQName2));
    this.d.add(new ArrayDeserializerFactory());
    localQName1 = new QName("urn:PlatformWS", "FilterOptionsServiceResponse");
    this.b.add(localQName1);
    localObject = FilterOptionsServiceResponse.class;
    this.a.add(localObject);
    this.c.add(localBeanSerializerFactory);
    this.d.add(localBeanDeserializerFactory);
    localQName1 = new QName("urn:PlatformWS", "ServiceResponse");
    this.b.add(localQName1);
    localObject = ServiceResponse.class;
    this.a.add(localObject);
    this.c.add(localBeanSerializerFactory);
    this.d.add(localBeanDeserializerFactory);
  }

  protected Call createCall()
    throws RemoteException
  {
    try
    {
      Call localCall = super._createCall();
      if (this.maintainSessionSet)
        localCall.setMaintainSession(this.maintainSession);
      if (this.cachedUsername != null)
        localCall.setUsername(this.cachedUsername);
      if (this.cachedPassword != null)
        localCall.setPassword(this.cachedPassword);
      if (this.cachedEndpoint != null)
        localCall.setTargetEndpointAddress(this.cachedEndpoint);
      if (this.cachedTimeout != null)
        localCall.setTimeout(this.cachedTimeout);
      if (this.cachedPortName != null)
        localCall.setPortName(this.cachedPortName);
      Enumeration localEnumeration = this.cachedProperties.keys();
      while (localEnumeration.hasMoreElements())
      {
        String str = (String)localEnumeration.nextElement();
        localCall.setProperty(str, this.cachedProperties.get(str));
      }
      synchronized (this)
      {
        if (firstCall())
        {
          localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
          localCall.setEncodingStyle("http://schemas.xmlsoap.org/soap/encoding/");
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
              localCall.registerTypeMapping(localClass, localQName, (Class)localObject2, (Class)localObject3, false);
            }
            else
            {
              if (!(localObject1 instanceof javax.xml.rpc.encoding.SerializerFactory))
                continue;
              localObject2 = (org.apache.axis.encoding.SerializerFactory)this.c.get(i);
              localObject3 = (DeserializerFactory)this.d.get(i);
              localCall.registerTypeMapping(localClass, localQName, (org.apache.axis.encoding.SerializerFactory)localObject2, (DeserializerFactory)localObject3, false);
            }
          }
        }
      }
      return localCall;
    }
    catch (Throwable localThrowable)
    {
    }
    throw new AxisFault("Failure trying to get the Call object", localThrowable);
  }

  public ServiceResponse addAllowedHostOnCluster(String paramString1, String paramString2)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[0]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "addAllowedHostOnCluster"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramString1, paramString2 });
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

  public ServiceResponse addAllowedHostOnServer(String paramString1, String paramString2)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[1]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "addAllowedHostOnServer"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramString1, paramString2 });
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

  public ServiceResponse closeEvent(BigInteger paramBigInteger)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[2]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "closeEvent"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramBigInteger });
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

  public ServiceResponse debugEvent(BigInteger paramBigInteger)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[3]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "debugEvent"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramBigInteger });
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

  public ServiceResponse deleteEvent(BigInteger paramBigInteger)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[4]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "deleteEvent"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramBigInteger });
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

  public DirectiveServiceResponse getAllDirectives(String paramString)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[5]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "getAllDirectives"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramString });
      if ((localObject instanceof RemoteException))
        throw ((RemoteException)localObject);
      extractAttachments(localCall);
      try
      {
        return (DirectiveServiceResponse)localObject;
      }
      catch (Exception localException)
      {
        return (DirectiveServiceResponse)JavaUtils.convert(localObject, DirectiveServiceResponse.class);
      }
    }
    catch (AxisFault localAxisFault)
    {
    }
    throw localAxisFault;
  }

  public EventServiceResponse getAllEvents(Object paramObject, BigInteger paramBigInteger1, BigInteger paramBigInteger2, String paramString, boolean paramBoolean)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[6]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "getAllEvents"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramObject, paramBigInteger1, paramBigInteger2, paramString, new Boolean(paramBoolean) });
      if ((localObject instanceof RemoteException))
        throw ((RemoteException)localObject);
      extractAttachments(localCall);
      try
      {
        return (EventServiceResponse)localObject;
      }
      catch (Exception localException)
      {
        return (EventServiceResponse)JavaUtils.convert(localObject, EventServiceResponse.class);
      }
    }
    catch (AxisFault localAxisFault)
    {
    }
    throw localAxisFault;
  }

  public DirectiveServiceResponse getDirective(String paramString1, String paramString2)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[7]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "getDirective"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramString1, paramString2 });
      if ((localObject instanceof RemoteException))
        throw ((RemoteException)localObject);
      extractAttachments(localCall);
      try
      {
        return (DirectiveServiceResponse)localObject;
      }
      catch (Exception localException)
      {
        return (DirectiveServiceResponse)JavaUtils.convert(localObject, DirectiveServiceResponse.class);
      }
    }
    catch (AxisFault localAxisFault)
    {
    }
    throw localAxisFault;
  }

  public EventServiceResponse getEventData(BigInteger paramBigInteger)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[8]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "getEventData"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramBigInteger });
      if ((localObject instanceof RemoteException))
        throw ((RemoteException)localObject);
      extractAttachments(localCall);
      try
      {
        return (EventServiceResponse)localObject;
      }
      catch (Exception localException)
      {
        return (EventServiceResponse)JavaUtils.convert(localObject, EventServiceResponse.class);
      }
    }
    catch (AxisFault localAxisFault)
    {
    }
    throw localAxisFault;
  }

  public FilterOptionsServiceResponse getEventFilterAvailableOptions(String paramString)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[9]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "getEventFilterAvailableOptions"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramString });
      if ((localObject instanceof RemoteException))
        throw ((RemoteException)localObject);
      extractAttachments(localCall);
      try
      {
        return (FilterOptionsServiceResponse)localObject;
      }
      catch (Exception localException)
      {
        return (FilterOptionsServiceResponse)JavaUtils.convert(localObject, FilterOptionsServiceResponse.class);
      }
    }
    catch (AxisFault localAxisFault)
    {
    }
    throw localAxisFault;
  }

  public ServiceResponse getEventFilterNames()
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[10]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "getEventFilterNames"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[0]);
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

  public ServiceResponse getEventSortOptions()
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[11]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "getEventSortOptions"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[0]);
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

  public ServiceResponse getServers()
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[12]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "getServers"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[0]);
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

  public ServiceResponse getTotalNumberOfEvents(Object paramObject)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[13]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "getTotalNumberOfEvents"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramObject });
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

  public ServiceResponse getVersion()
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[14]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "getVersion"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[0]);
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

  public ServiceResponse ignoreEvent(BigInteger paramBigInteger)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[15]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "ignoreEvent"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramBigInteger });
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

  public ServiceResponse isHostAllowed(String paramString1, String paramString2)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[16]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "isHostAllowed"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramString1, paramString2 });
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

  public ServiceResponse login(String paramString1, String paramString2)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[17]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "login"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramString1, paramString2 });
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

  public ServiceResponse preserveEvent(BigInteger paramBigInteger)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[18]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "preserveEvent"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramBigInteger });
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

  public ServiceResponse profileEvent(BigInteger paramBigInteger)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[19]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "profileEvent"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramBigInteger });
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

  public ServiceResponse removeAllowedHostFromCluster(String paramString1, String paramString2)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[20]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "removeAllowedHostFromCluster"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramString1, paramString2 });
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

  public ServiceResponse removeAllowedHostFromServer(String paramString1, String paramString2)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[21]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "removeAllowedHostFromServer"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramString1, paramString2 });
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

  public ServiceResponse restartCluster(String paramString1, String paramString2, boolean paramBoolean)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[22]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "restartCluster"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramString1, paramString2, new Boolean(paramBoolean) });
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

  public ServiceResponse restartServer(String paramString1, String paramString2, boolean paramBoolean)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[23]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "restartServer"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramString1, paramString2, new Boolean(paramBoolean) });
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

  public ServiceResponse setDirectiveOnCluster(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[24]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "setDirectiveOnCluster"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5 });
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

  public ServiceResponse setDirectiveOnServer(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[25]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "setDirectiveOnServer"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5 });
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

  public ServiceResponse unpreserveEvent(BigInteger paramBigInteger)
    throws RemoteException
  {
    if (this.cachedEndpoint == null)
      throw new NoEndPointException();
    Call localCall = createCall();
    localCall.setOperation(e[26]);
    localCall.setUseSOAPAction(true);
    localCall.setSOAPActionURI("urn:PlatformServicesAction");
    localCall.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    localCall.setOperationName(new QName("urn:PlatformWS", "unpreserveEvent"));
    setRequestHeaders(localCall);
    setAttachments(localCall);
    try
    {
      Object localObject = localCall.invoke(new Object[] { paramBigInteger });
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

  static
  {
    _initOperationDesc1();
    _initOperationDesc2();
    _initOperationDesc3();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.e
 * JD-Core Version:    0.6.0
 */