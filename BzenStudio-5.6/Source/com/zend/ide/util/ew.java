package com.zend.ide.util;

import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;

public class ew
{
  public static String b()
  {
    return "&debug_host=" + a();
  }

  public static String a()
  {
    String str = "";
    boolean bool = ((Boolean)b.a("debugging.useDefaultClientIP").c()).booleanValue();
    Object localObject1;
    if (!bool)
    {
      localObject1 = b.a("debugging.customizedClientIP").c().toString();
      str = str + (String)localObject1;
      return str;
    }
    try
    {
      localObject1 = new ArrayList();
      ArrayList localArrayList = new ArrayList();
      Enumeration localEnumeration = NetworkInterface.getNetworkInterfaces();
      Object localObject2;
      Object localObject3;
      while (localEnumeration.hasMoreElements())
      {
        NetworkInterface localNetworkInterface = (NetworkInterface)localEnumeration.nextElement();
        localObject2 = localNetworkInterface.getName();
        localObject3 = localNetworkInterface.getInetAddresses();
        while (((Enumeration)localObject3).hasMoreElements())
        {
          InetAddress localInetAddress = (InetAddress)((Enumeration)localObject3).nextElement();
          if ((localInetAddress instanceof Inet6Address))
            continue;
          if ((((String)localObject2).equalsIgnoreCase("lo")) || (((String)localObject2).equalsIgnoreCase("localhost")))
            ((ArrayList)localObject1).add(localInetAddress);
          else
            localArrayList.add(localInetAddress);
        }
      }
      localArrayList.addAll((Collection)localObject1);
      if (localArrayList.size() > 0)
      {
        for (int i = 0; i < localArrayList.size(); i++)
        {
          if (i > 0)
            str = str + "%2C";
          localObject2 = (InetAddress)localArrayList.get(i);
          localObject3 = ((InetAddress)localObject2).toString();
          if (((String)localObject3).startsWith("/"))
            localObject3 = ((String)localObject3).substring(1);
          str = str + (String)localObject3;
        }
        return str;
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return (String)(String)(String)"";
  }

  public static String c()
  {
    String str = (String)b.a("debugging.tunnelReturnHost");
    if ((str == null) || (str.equals("")))
      str = "localhost";
    return str;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.ew
 * JD-Core Version:    0.6.0
 */