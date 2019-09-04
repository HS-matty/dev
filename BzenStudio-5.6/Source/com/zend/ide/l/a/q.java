package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.zend.ide.w.c.f;

public class q extends a
{
  public q()
  {
    super("SubversionCommand", f.class);
  }

  public Object a(e parame)
  {
    f localf = f.a(parame.a("commandType"));
    String str = parame.a("quietMode");
    if (!str.equals(""))
      localf.c(Boolean.valueOf(str).booleanValue());
    str = parame.a("forceOperation");
    if (!str.equals(""))
      localf.e(Boolean.valueOf(str).booleanValue());
    str = parame.a("nonRecursive");
    if (!str.equals(""))
      localf.a(Boolean.valueOf(str).booleanValue());
    str = parame.a("verbose");
    if (!str.equals(""))
      localf.b(Boolean.valueOf(str).booleanValue());
    str = parame.a("extraUpdateInfo");
    if (!str.equals(""))
      localf.i(Boolean.valueOf(str).booleanValue());
    str = parame.a("ignoreSpaces");
    if (!str.equals(""))
      localf.f(Boolean.valueOf(str).booleanValue());
    str = parame.a("useGNUDiff");
    if (!str.equals(""))
    {
      localf.d(Boolean.valueOf(str).booleanValue());
      str = parame.a("ignoreWhiteSpaces");
      if (!str.equals(""))
        localf.f(Boolean.valueOf(str).booleanValue());
      str = parame.a("ignoreBlankLines");
      if (!str.equals(""))
        localf.g(Boolean.valueOf(str).booleanValue());
      str = parame.a("ignoreCase");
      if (!str.equals(""))
        localf.h(Boolean.valueOf(str).booleanValue());
      str = parame.a("GNUDiffAdditionalOptions");
      if (!str.equals(""))
        localf.b(str.toString());
    }
    return localf;
  }

  public e e()
  {
    f localf = (f)c();
    e locale = new e();
    locale.a("commandType", localf.a());
    if (localf.d())
      locale.a("quietMode", "" + localf.d());
    if (localf.g())
      locale.a("forceOperation", "" + localf.g());
    if (localf.b())
      locale.a("nonRecursive", "" + localf.b());
    if (localf.c())
      locale.a("verbose", "" + localf.c());
    if (localf.r())
      locale.a("extraUpdateInfo", "" + localf.r());
    if (localf.h())
      locale.a("ignoreSpaces", "" + localf.h());
    if (localf.e())
    {
      locale.a("useGNUDiff", "" + localf.e());
      if (localf.h())
        locale.a("ignoreWhiteSpaces", "" + localf.h());
      if (localf.i())
        locale.a("ignoreBlankLines", "" + localf.i());
      if (localf.j())
        locale.a("ignoreCase", "" + localf.j());
      if (localf.f() != null)
        locale.a("GNUDiffAdditionalOptions", "" + localf.f());
    }
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.q
 * JD-Core Version:    0.6.0
 */