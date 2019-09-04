package com.a.a;

import com.a.e;
import java.util.Locale;

public class j extends a
{
  public j()
  {
    super("locale", Locale.class);
  }

  public Object a(e parame)
  {
    String str1 = parame.a("language");
    String str2 = parame.a("country");
    String str3 = parame.a("variant");
    return new Locale(str1, str2, str3);
  }

  public e e()
  {
    Locale localLocale = (Locale)c();
    e locale = new e();
    locale.a("language", localLocale.getLanguage());
    locale.a("country", localLocale.getCountry());
    locale.a("variant", localLocale.getVariant());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.a.a.j
 * JD-Core Version:    0.6.0
 */