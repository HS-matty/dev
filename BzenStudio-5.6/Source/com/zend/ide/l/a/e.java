package com.zend.ide.l.a;

import com.a.a.a;
import com.zend.ide.w.a.l;

public class e extends a
{
  public e()
  {
    super("CVSCommand", l.class);
  }

  public Object a(com.a.e parame)
  {
    l locall = l.a(parame.a("commandType"));
    String str = parame.a("quietMode");
    if (!str.equals(""))
      locall.f(Boolean.valueOf(str).booleanValue());
    str = parame.a("nonRecursive");
    if (!str.equals(""))
      locall.a(Boolean.valueOf(str).booleanValue());
    str = parame.a("verbose");
    if (!str.equals(""))
      locall.b(Boolean.valueOf(str).booleanValue());
    str = parame.a("pruneDirectories");
    if (!str.equals(""))
      locall.c(Boolean.valueOf(str).booleanValue());
    str = parame.a("createDirectories");
    if (!str.equals(""))
      locall.d(Boolean.valueOf(str).booleanValue());
    str = parame.a("resetStickyTag");
    if (!str.equals(""))
      locall.e(Boolean.valueOf(str).booleanValue());
    str = parame.a("addAsBinary");
    if (!str.equals(""))
      locall.g(Boolean.valueOf(str).booleanValue());
    str = parame.a("ignoreSpaces");
    if (!str.equals(""))
      locall.h(Boolean.valueOf(str).booleanValue());
    return locall;
  }

  public com.a.e e()
  {
    l locall = (l)c();
    com.a.e locale = new com.a.e();
    locale.a("commandType", locall.q());
    if (locall.g())
      locale.a("quietMode", "" + locall.g());
    if (locall.b())
      locale.a("nonRecursive", "" + locall.b());
    if (locall.c())
      locale.a("verbose", "" + locall.c());
    if (locall.d())
      locale.a("pruneDirectories", "" + locall.d());
    if (locall.e())
      locale.a("createDirectories", "" + locall.e());
    if (locall.f())
      locale.a("resetStickyTag", "" + locall.f());
    if (locall.h())
      locale.a("addAsBinary", "" + locall.h());
    if (locall.i())
      locale.a("ignoreSpaces", "" + locall.i());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.e
 * JD-Core Version:    0.6.0
 */