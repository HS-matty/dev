package com.zend.ide.u.a;

import com.a.e;
import com.zend.ide.u.cm;
import com.zend.ide.util.ac;
import com.zend.ide.util.qb;
import com.zend.ide.util.x;

public class a extends com.a.a.a
{
  public a()
  {
    super("ftpServer", cm.class);
  }

  public Object a(e parame)
  {
    cm localcm = new cm();
    String str1 = parame.a("aliasName");
    String str2 = parame.a("hostName");
    String str3 = parame.a("userName");
    localcm.a(str2);
    localcm.b(str3);
    if ((str1 == null) || (str1.equals("")))
      str1 = str2 + "_" + str3;
    localcm.h(str1);
    String str4 = parame.a("password");
    if (!str4.equals(""))
    {
      localcm.c(str4);
    }
    else
    {
      str4 = parame.a("pass");
      if (!str4.equals(""))
      {
        String str5 = "";
        try
        {
          str5 = ac.b(str4);
        }
        catch (qb localqb)
        {
          str5 = x.b(str4, "f");
        }
        localcm.c(str5);
      }
    }
    localcm.d(parame.a("rootDirectory"));
    localcm.b(Integer.valueOf(parame.a("remotePort")).intValue());
    localcm.a(Integer.valueOf(parame.a("communicationTimeout")).intValue());
    localcm.c(Boolean.valueOf(parame.a("savePassword")).booleanValue());
    localcm.b(Boolean.valueOf(parame.a("connectOnStartup")).booleanValue());
    localcm.d(Boolean.valueOf(parame.a("anonymousLogin")).booleanValue());
    localcm.a(Boolean.valueOf(parame.a("passiveCommunication")).booleanValue());
    if ((parame.a("mode") != null) && (!parame.a("mode").equals("")))
      localcm.c(Integer.valueOf(parame.a("mode")).intValue());
    if ((parame.a("sslMethod") != null) && (!parame.a("sslMethod").equals("")))
      localcm.d(Integer.valueOf(parame.a("sslMethod")).intValue());
    if ((parame.a("sftp") != null) && (!parame.a("sftp").equals("")))
      if (Boolean.valueOf(parame.a("sftp")).booleanValue())
        localcm.c(1);
      else
        localcm.c(0);
    return localcm;
  }

  public e e()
  {
    cm localcm = (cm)c();
    boolean bool = localcm.h();
    e locale = new e();
    locale.a("aliasName", localcm.a());
    locale.a("hostName", localcm.k());
    locale.a("userName", localcm.b());
    if (bool)
      locale.a("pass", ac.a(localcm.c()));
    locale.a("rootDirectory", localcm.d());
    locale.a("remotePort", "" + localcm.j());
    locale.a("communicationTimeout", "" + localcm.e());
    locale.a("savePassword", "" + bool);
    locale.a("connectOnStartup", "" + localcm.g());
    locale.a("anonymousLogin", "" + localcm.i());
    locale.a("passiveCommunication", "" + localcm.f());
    locale.a("mode", "" + localcm.a());
    locale.a("sslMethod", "" + localcm.b());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.a.a
 * JD-Core Version:    0.6.0
 */