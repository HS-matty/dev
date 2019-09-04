package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.a.h;
import com.zend.ide.o.di;
import com.zend.ide.u.db;
import java.util.List;

public class d extends a
{
  public d()
  {
    super("breakpoint", di.class);
  }

  public Object a(e parame)
  {
    di localdi = new di();
    localdi.c(Boolean.valueOf(parame.a("enable")).booleanValue());
    String str1 = parame.a("fileName");
    if (!str1.equals(""))
      localdi.a(db.a(str1));
    str1 = parame.a("lineNumber");
    if (!str1.equals(""))
      localdi.a(Integer.valueOf(str1).intValue());
    str1 = parame.a("condition");
    if (!str1.equals(""))
      localdi.b(str1);
    List localList = parame.b();
    for (int i = 0; (localList != null) && (i < localList.size()); i++)
    {
      h localh = (h)localList.get(i);
      String str2 = localh.c();
      if (str2.equals("fileName"))
      {
        localdi.a((String)localh.b());
      }
      else if (str2.equals("lineNumber"))
      {
        localdi.a(((Integer)localh.b()).intValue() - 1);
      }
      else
      {
        if (!str2.equals("condition"))
          continue;
        localdi.b((String)localh.b());
      }
    }
    return localdi;
  }

  public e e()
  {
    di localdi = (di)c();
    e locale = new e();
    locale.a("fileName", "" + localdi.j());
    locale.a("lineNumber", "" + localdi.b());
    locale.a("enable", "" + localdi.i());
    locale.a("condition", "" + localdi.h());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.d
 * JD-Core Version:    0.6.0
 */