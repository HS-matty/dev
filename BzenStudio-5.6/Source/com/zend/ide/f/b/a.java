package com.zend.ide.f.b;

import com.zend.ide.b.d;
import com.zend.ide.f.s;
import com.zend.ide.m.ab;
import com.zend.ide.m.bd;
import com.zend.ide.m.bf;
import com.zend.ide.m.bh;
import com.zend.ide.m.t;
import com.zend.ide.m.v;
import com.zend.ide.m.z;

public class a
{
  public static b a(d paramd, s params)
  {
    if ((paramd instanceof t))
      return new r((v)paramd, params);
    if ((paramd instanceof ab))
      return new p((ab)paramd, params);
    if ((paramd instanceof v))
      return new c((v)paramd, params);
    if ((paramd instanceof bh))
      return new h((bh)paramd, params);
    if ((paramd instanceof z))
      return new e((z)paramd, params);
    if ((paramd instanceof com.zend.ide.m.c))
      return new m((com.zend.ide.m.c)paramd, params);
    if ((paramd instanceof bd))
      return new f((bd)paramd, params);
    if ((paramd instanceof com.zend.ide.m.r))
      return new i((com.zend.ide.m.r)paramd, params);
    if ((paramd instanceof bf))
      return new g((bf)paramd, params);
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.a
 * JD-Core Version:    0.6.0
 */