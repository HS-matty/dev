package com.zend.ide.r.a;

import com.a.e;
import com.zend.ide.r.d;
import com.zend.ide.r.f;
import com.zend.ide.r.p;
import com.zend.ide.util.cv;

public class a extends com.a.a.a
{
  public a()
  {
    super("fileType", d.class);
  }

  public Object a(e parame)
  {
    String str1 = parame.a("name");
    String str2 = parame.a("description");
    d locald = new d(str1, str2);
    if (str1.equals("PHP files"))
    {
      locald.a(cv.b("explorer/phpfile.gif"));
      locald.e("PHPDocument");
      locald.b(false);
      locald.d(false);
    }
    if (str1.equals("HTML files"))
    {
      locald.a(cv.b("explorer/htmlfile.gif"));
      locald.e("HTMLDocument");
      locald.b(false);
      locald.d(false);
    }
    if (str1.equals("Web Documents"))
      locald.a(true);
    String str3 = parame.a("defaultExtension");
    locald.d(str3);
    str3 = parame.a("extensions");
    p.e().a(locald, str3);
    str3 = parame.a("binary");
    if (!str3.equals(""))
      p.b(locald, Boolean.valueOf(str3).booleanValue());
    str3 = parame.a("openExternally");
    if ((str3 != null) && (!str3.equals("")))
      locald.a(Integer.valueOf(str3).intValue());
    else
      locald.a(0);
    str3 = parame.a("openWithCommand");
    if ((str3 != null) && (!str3.equals("")))
      locald.a(str3);
    else
      locald.a("");
    str3 = parame.a("askBeforeOpenning");
    if ((str3 != null) && (!str3.equals("")))
      locald.e(Boolean.valueOf(str3).booleanValue());
    else
      locald.e(true);
    return locald;
  }

  private String i()
  {
    f[] arrayOff = ((d)c()).h();
    String str = "";
    for (int i = 0; i < arrayOff.length; i++)
    {
      f localf = arrayOff[i];
      str = str + localf.b() + ";";
    }
    return str;
  }

  public e e()
  {
    d locald = (d)c();
    e locale = new e();
    locale.a("name", locald.b());
    String str = locald.getDescription();
    if (str != null)
      locale.a("description", str);
    str = locald.c();
    locale.a("defaultExtension", str == null ? "" : str);
    str = i();
    locale.a("extensions", str == null ? "" : str);
    locale.a("binary", "" + locald.i());
    locale.a("openExternally", "" + locald.b());
    locale.a("openWithCommand", "" + locald.a());
    locale.a("askBeforeOpenning", "" + locald.c());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.a.a
 * JD-Core Version:    0.6.0
 */