package com.zend.ide.w.c;

import com.zend.ide.w.c.b.f;
import com.zend.ide.w.c.b.g;
import com.zend.ide.w.c.b.h;
import com.zend.ide.w.c.b.i;
import com.zend.ide.w.c.b.j;
import com.zend.ide.w.c.b.k;
import com.zend.ide.w.c.b.l;
import com.zend.ide.w.c.b.m;
import com.zend.ide.w.c.b.n;
import com.zend.ide.w.c.b.o;
import com.zend.ide.w.c.b.p;
import com.zend.ide.w.c.b.q;
import com.zend.ide.w.c.b.r;
import com.zend.ide.w.c.b.s;
import com.zend.ide.w.c.b.t;
import com.zend.ide.w.c.b.u;
import com.zend.ide.w.c.b.v;
import com.zend.ide.w.c.b.w;
import com.zend.ide.w.c.b.z;
import java.util.Map;

public class e
{
  public static z a(d paramd, String paramString, Map paramMap)
  {
    z localz = a(paramd, paramString);
    if (paramMap != null)
      localz.a(paramMap);
    return localz;
  }

  private static z a(d paramd, String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Invalid Subversion Command Name - 'null'");
    if (paramString.equals("Update"))
      return new z(new w(paramd), "Update");
    if (paramString.equals("Commit"))
      return new z(new i(paramd), "Commit");
    if (paramString.equals("Add"))
      return new z(new com.zend.ide.w.c.b.e(paramd), "Add");
    if (paramString.equals("Delete"))
      return new z(new k(paramd), "Delete");
    if (paramString.equals("Diff"))
      return new z(new l(paramd), "Diff");
    if (paramString.equals("Checkout"))
      return new z(new g(paramd), "Checkout");
    if (paramString.equals("Revert"))
      return new z(new t(paramd), "Revert");
    if (paramString.equals("Status"))
      return new z(new u(paramd), "Status");
    if (paramString.equals("Import"))
      return new z(new m(paramd), "Import");
    if (paramString.equals("Cat"))
      return new z(new f(paramd), "Cat");
    if (paramString.equals("Cleanup"))
      return new z(new h(paramd), "Cleanup");
    if (paramString.equals("Copy"))
      return new z(new j(paramd), "Copy");
    if (paramString.equals("Info"))
      return new z(new n(paramd), "Info");
    if (paramString.equals("Log"))
      return new z(new o(paramd), "Log");
    if (paramString.equals("Merge"))
      return new z(new p(paramd), "Merge");
    if (paramString.equals("Mkdir"))
      return new z(new q(paramd), "Mkdir");
    if (paramString.equals("Move"))
      return new z(new r(paramd), "Move");
    if (paramString.equals("Resolve"))
      return new z(new s(paramd), "Resolve");
    if (paramString.equals("Switch"))
      return new z(new v(paramd), "Switch");
    throw new IllegalArgumentException("No Such Subversion Command - " + paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.e
 * JD-Core Version:    0.6.0
 */