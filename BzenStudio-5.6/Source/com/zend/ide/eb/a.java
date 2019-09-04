package com.zend.ide.eb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.text.DateFormatter;

public class a
  implements Comparable
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private boolean h;

  public a(String paramString)
  {
    this.a = paramString;
    try
    {
      this.c = new DateFormatter(new SimpleDateFormat("M/d/yy")).valueToString(new Date());
    }
    catch (ParseException localParseException)
    {
    }
  }

  public a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    this(paramString1);
    this.f = paramString2;
    this.g = paramString3;
    this.h = paramBoolean;
  }

  public a(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    this(paramString1, paramString2, paramString3, paramBoolean);
    this.b = paramString4;
    try
    {
      this.c = new DateFormatter(new SimpleDateFormat("M/d/yy")).valueToString(new Date());
      this.d = new DateFormatter(new SimpleDateFormat("M/d/yy")).valueToString(new Date());
    }
    catch (ParseException localParseException)
    {
    }
  }

  public a(String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this(paramString1, paramString2, paramString3, paramBoolean);
    this.b = paramString4;
    this.e = paramString5;
    this.d = paramString6;
    this.c = paramString7;
  }

  public a(a parama, boolean paramBoolean)
  {
    this(parama.a, parama.f, parama.g, paramBoolean, parama.b(), parama.e(), null, null);
    try
    {
      this.c = new DateFormatter(new SimpleDateFormat("M/d/yy")).valueToString(new Date());
      this.d = new DateFormatter(new SimpleDateFormat("M/d/yy")).valueToString(new Date());
    }
    catch (ParseException localParseException)
    {
    }
  }

  public String a()
  {
    return this.a;
  }

  public String b()
  {
    return this.b;
  }

  public String c()
  {
    return this.c;
  }

  public String d()
  {
    return this.d;
  }

  public String e()
  {
    if (this.e == null)
      return "none";
    return this.e;
  }

  public String f()
  {
    return this.g;
  }

  public String g()
  {
    return this.f;
  }

  public boolean h()
  {
    return this.h;
  }

  public int compareTo(Object paramObject)
  {
    try
    {
      a locala = (a)paramObject;
      return a().compareToIgnoreCase(locala.a());
    }
    catch (Exception localException)
    {
    }
    return -1;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a))
      return false;
    return (((a)paramObject).a().equals(a())) && (((a)paramObject).g().equals(g())) && (((a)paramObject).f().equals(f()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.a
 * JD-Core Version:    0.6.0
 */