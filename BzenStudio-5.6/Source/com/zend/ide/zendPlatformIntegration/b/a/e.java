package com.zend.ide.zendPlatformIntegration.b.a;

import com.zend.ide.util.ct;
import com.zend.ide.zendPlatformIntegration.b.c;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class e extends a
{
  public e()
  {
    this.b = ct.a(1873);
  }

  public int compare(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null))
      return 0;
    int i = 0;
    try
    {
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss", Locale.ENGLISH);
      String str1 = (String)paramObject1;
      Date localDate1 = localSimpleDateFormat.parse(str1);
      String str2 = (String)paramObject2;
      Date localDate2 = localSimpleDateFormat.parse(str2);
      if (localDate1.before(localDate2))
        i = -1;
      else if (localDate1.after(localDate2))
        i = 1;
    }
    catch (ParseException localParseException)
    {
      return 0;
    }
    return i;
  }

  public String a()
  {
    return ct.a(1957);
  }

  public String b()
  {
    return "first_occurence";
  }

  public int c()
  {
    return 125;
  }

  public String a(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof c)))
      return "";
    c localc = (c)paramObject;
    return localc.f();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.b.a.e
 * JD-Core Version:    0.6.0
 */