package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.a.h;
import com.zend.ide.l.i;
import com.zend.ide.l.l;
import com.zend.ide.util.bh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class m extends a
{
  private String d;
  private bh e;

  public m()
  {
    super("project", i.class);
  }

  public void a(e parame)
  {
    this.d = parame.a("version");
    String str = parame.a("encoding");
    if ((str != null) && (!str.equals("")))
      this.e = new bh(str);
    com.zend.ide.u.db.a = this.d;
  }

  public Object a(e parame)
  {
    i locali = new i();
    locali.c(this.d);
    locali.a(this.e);
    List localList = parame.b();
    for (int i = 0; (localList != null) && (i < localList.size()); i++)
    {
      h localh = (h)localList.get(i);
      locali.a((l)localh.b());
    }
    return locali;
  }

  public e e()
  {
    e locale = new e();
    ArrayList localArrayList = new ArrayList();
    String str = "5.5";
    locale.a("version", str);
    i locali = (i)c();
    bh localbh = locali.b();
    if (localbh != null)
      locale.a("encoding", localbh.toString());
    Iterator localIterator = locali.d().values().iterator();
    while (localIterator.hasNext())
      localArrayList.add(localIterator.next());
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.m
 * JD-Core Version:    0.6.0
 */