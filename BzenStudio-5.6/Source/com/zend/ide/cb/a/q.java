package com.zend.ide.cb.a;

import com.zend.ide.cb.o;
import java.text.SimpleDateFormat;
import java.util.Date;

public class q
{
  private SimpleDateFormat a;
  private boolean b;
  private String c;

  public q(String paramString)
  {
    this.b = ((paramString != null) && (!paramString.trim().equals("")));
    this.a = new SimpleDateFormat(paramString);
    this.c = paramString;
  }

  public void a(String paramString)
  {
    this.b = ((paramString != null) && (!paramString.trim().equals("")));
    this.a.applyPattern(paramString);
    this.c = paramString;
  }

  public String a(Object paramObject, com.zend.ide.cb.q paramq)
  {
    if (!this.b)
    {
      if ((paramObject instanceof Date))
        return ((Date)paramObject).getTime() + "";
      return paramObject != null ? paramObject.toString() : "(null)";
    }
    String str = "";
    try
    {
      str = this.a.format(paramObject);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      long l = Long.parseLong(paramObject.toString());
      if ((paramq != null) && (!paramq.m().a()))
        l *= 1000L;
      str = this.a.format(new Long(l));
    }
    return str;
  }

  public String a()
  {
    return this.c != null ? this.c : "";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.q
 * JD-Core Version:    0.6.0
 */