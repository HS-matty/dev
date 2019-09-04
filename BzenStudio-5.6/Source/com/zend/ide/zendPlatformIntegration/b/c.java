package com.zend.ide.zendPlatformIntegration.b;

import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.zendPlatformIntegration.a.f;
import com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class c
  implements cu
{
  private b a;
  private final String b = ct.a(1885);
  private final String c = ct.a(1884);

  public c(b paramb)
  {
    this.a = paramb;
  }

  public String a()
  {
    return this.a.getId().toString();
  }

  public String b()
  {
    int i = 0;
    String str = "N/A";
    try
    {
      i = Integer.parseInt(this.a.getSeverity());
    }
    catch (NumberFormatException localNumberFormatException)
    {
      cl.a(localNumberFormatException);
    }
    switch (i)
    {
    case 0:
      str = this.b;
      break;
    case 1:
      str = this.c;
    }
    return str;
  }

  public String c()
  {
    return (String)f.a().g.get(this.a.getStatus());
  }

  public String d()
  {
    return this.a.getType();
  }

  public String e()
  {
    return this.a.getNumber_of_occurences().toString();
  }

  public String f()
  {
    long l = this.a.getFirst_occurence().longValue();
    Date localDate = null;
    try
    {
      localDate = new Date(l * 1000L);
    }
    catch (Exception localException)
    {
      cl.a(localException);
      localDate = new Date(0L);
    }
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss", Locale.ENGLISH);
    return localSimpleDateFormat.format(localDate);
  }

  public String g()
  {
    long l = this.a.getLast_occurence().longValue();
    Date localDate = null;
    try
    {
      localDate = new Date(l * 1000L);
    }
    catch (Exception localException)
    {
      cl.a(localException);
      localDate = new Date(0L);
    }
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss", Locale.ENGLISH);
    return localSimpleDateFormat.format(localDate);
  }

  public String h()
  {
    return this.a.getLocation();
  }

  public String i()
  {
    return this.a.getVhost();
  }

  public String j()
  {
    return this.a.getUrl();
  }

  public String k()
  {
    return this.a.getSource_file();
  }

  public String l()
  {
    return this.a.getSource_line().toString();
  }

  public String m()
  {
    return this.a.getFunction_name();
  }

  public String n()
  {
    return this.a.getAggregation_hint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.b.c
 * JD-Core Version:    0.6.0
 */