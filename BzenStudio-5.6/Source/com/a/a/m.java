package com.a.a;

import com.a.e;
import com.zend.ide.j.bd;
import com.zend.ide.j.h;
import com.zend.ide.u.db;
import com.zend.ide.u.f;
import com.zend.ide.u.i;

public class m extends a
{
  public m()
  {
    super("ftpFile", f.class);
  }

  public Object a(e parame)
  {
    String str = db.a(parame.a("name"));
    Object localObject = h.m.g(str);
    if ((localObject instanceof bd))
      return localObject;
    return localObject = new f(i.a(), str);
  }

  public e e()
  {
    e locale = new e();
    locale.a("name", ((f)c()).getPath());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.a.a.m
 * JD-Core Version:    0.6.0
 */