package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.a.h;
import com.zend.ide.u.db;
import com.zend.ide.util.bh;
import com.zend.ide.v.p;
import java.util.List;

public class i extends a
{
  public i()
  {
    super("editor", p.class);
  }

  public Object a(e parame)
  {
    p localp = new p();
    localp.a(Boolean.valueOf(parame.a("clone")).booleanValue());
    String str1 = parame.a("fileName");
    if (!str1.equals(""))
      localp.a(db.a(str1));
    str1 = parame.a("encoding");
    if (!str1.equals(""))
      localp.a(new bh(str1));
    str1 = parame.a("caretPosition");
    if (!str1.equals(""))
      localp.a(Integer.valueOf(str1).intValue());
    List localList = parame.b();
    for (int i = 0; (localList != null) && (i < localList.size()); i++)
    {
      h localh = (h)localList.get(i);
      String str2 = localh.c();
      if (str2.equals("fileName"))
      {
        localp.a((String)localh.b());
      }
      else if (str2.equals("encoding"))
      {
        localp.a((bh)localh.b());
      }
      else
      {
        if (!str2.equals("caretPosition"))
          continue;
        localp.a(((Integer)localh.b()).intValue());
      }
    }
    return localp;
  }

  public e e()
  {
    p localp = (p)c();
    e locale = new e();
    locale.a("fileName", "" + localp.e());
    locale.a("caretPosition", "" + localp.c());
    locale.a("clone", "" + localp.d());
    locale.a("encoding", "" + localp.b().toString());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.i
 * JD-Core Version:    0.6.0
 */