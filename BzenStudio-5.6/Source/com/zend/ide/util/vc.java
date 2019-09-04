package com.zend.ide.util;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

class vc extends Authenticator
{
  private String a;
  private String b;

  public vc(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }

  protected PasswordAuthentication getPasswordAuthentication()
  {
    return new PasswordAuthentication(this.a, this.b.toCharArray());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.vc
 * JD-Core Version:    0.6.0
 */