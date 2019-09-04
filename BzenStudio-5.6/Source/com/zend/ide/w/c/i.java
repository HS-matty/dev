package com.zend.ide.w.c;

import com.zend.ide.util.cl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

public class i
{
  private HashMap a = new HashMap();
  private Date b;

  public String a()
  {
    return b("name");
  }

  public Date b()
  {
    if (this.b == null)
    {
      String str = b("text-time");
      if ((str == null) || (str.trim().equals("")))
        return null;
      try
      {
        this.b = a(str);
      }
      catch (ParseException localParseException)
      {
        cl.a(localParseException);
      }
    }
    return this.b;
  }

  public boolean c()
  {
    return b("schedule") != null;
  }

  private static Date a(String paramString)
    throws ParseException
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'S");
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    if (paramString.length() > 8)
    {
      paramString = paramString.substring(0, 23);
      return localSimpleDateFormat.parse(paramString);
    }
    return null;
  }

  public boolean d()
  {
    return b("conflict-wrk") != null;
  }

  public String b(String paramString)
  {
    return (String)this.a.get(paramString);
  }

  public void a(String paramString1, String paramString2)
  {
    this.a.put(paramString1, paramString2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.i
 * JD-Core Version:    0.6.0
 */