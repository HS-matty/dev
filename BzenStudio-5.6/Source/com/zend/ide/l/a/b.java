package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.a.h;
import com.zend.ide.n.co;
import com.zend.ide.u.db;
import java.io.File;
import java.util.List;

public class b extends a
{
  public b()
  {
    super("bookmark", co.class);
  }

  public Object a(e parame)
  {
    co localco = new co("", -1);
    String str1 = parame.a("fileName");
    if (!str1.equals(""))
      localco.a(db.a(str1));
    str1 = parame.a("description");
    if (!str1.equals(""))
      localco.b(str1);
    str1 = parame.a("lineNumber");
    if (!str1.equals(""))
      localco.a(Integer.valueOf(str1).intValue());
    List localList = parame.b();
    for (int i = 0; (localList != null) && (i < localList.size()); i++)
    {
      h localh = (h)localList.get(i);
      String str2 = localh.c();
      if (str2.equals("file"))
      {
        localco.a(((File)localh.b()).getPath());
      }
      else if (str2.equals("lineNumber"))
      {
        localco.a(((Integer)localh.b()).intValue() - 1);
      }
      else
      {
        if (!str2.equals("description"))
          continue;
        localco.b((String)localh.b());
      }
    }
    return localco;
  }

  public e e()
  {
    co localco = (co)c();
    e locale = new e();
    locale.a("fileName", "" + localco.j());
    locale.a("lineNumber", "" + localco.b());
    locale.a("description", "" + localco.c());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.b
 * JD-Core Version:    0.6.0
 */