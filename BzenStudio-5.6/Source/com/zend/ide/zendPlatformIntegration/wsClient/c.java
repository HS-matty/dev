package com.zend.ide.zendPlatformIntegration.wsClient;

import javax.xml.soap.MimeHeaders;
import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

class c extends Call
{
  final d a;

  public c(d paramd, Service paramService)
  {
    super(paramService);
  }

  public void invoke()
    throws AxisFault
  {
    String str = a();
    if (str != null)
    {
      MessageContext localMessageContext = super.getMessageContext();
      Message localMessage = localMessageContext.getRequestMessage();
      MimeHeaders localMimeHeaders = localMessage.getMimeHeaders();
      localMimeHeaders.addHeader("Cookie", str);
    }
    super.invoke();
  }

  private String a()
  {
    if (d.a(this.a) == null)
      return null;
    for (int i = 0; i < d.a(this.a).length; i++)
    {
      String str1 = d.a(this.a)[i];
      if ((str1 == null) || (str1.indexOf("central_sess_name") == -1))
        continue;
      String[] arrayOfString = str1.split(";");
      for (int j = 0; j < arrayOfString.length; j++)
      {
        String str2 = arrayOfString[j];
        if ((str2 != null) && (str2.startsWith("central_sess_name")))
          return str2;
      }
      return null;
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.wsClient.c
 * JD-Core Version:    0.6.0
 */