package com.zend.ide.o;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

class dm
  implements X509TrustManager
{
  final fk a;

  dm(fk paramfk)
  {
  }

  public X509Certificate[] getAcceptedIssuers()
  {
    return null;
  }

  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
  }

  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.dm
 * JD-Core Version:    0.6.0
 */