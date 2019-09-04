package com.zend.ide.m;

import com.zend.ide.b.m;
import com.zend.ide.n.bw;
import com.zend.ide.util.cl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;

public class o
{
  public static void a(com.zend.ide.b.d paramd, bw parambw, boolean paramBoolean)
  {
    a(paramd, parambw, null, b(paramd, parambw), paramBoolean);
  }

  public static void a(com.zend.ide.b.d paramd, bw parambw, String paramString, int paramInt, boolean paramBoolean)
  {
    try
    {
      parambw.a(paramd.f().c(), null, -1);
      g localg = a(paramd);
      if (paramString != null)
        localg.a(paramString);
      a(parambw, localg, paramInt, paramBoolean);
      parambw.grabFocus();
      int i = localg.a().length();
      int j = paramInt + h.a(parambw, localg, paramInt, paramBoolean);
      if (paramString != null)
        parambw.setCaretPosition(j + i);
      else
        SwingUtilities.invokeLater(new p(parambw, j, i));
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  private static int b(com.zend.ide.b.d paramd, bw parambw)
  {
    if ((paramd instanceof bf))
    {
      d[] arrayOfd = ((bf)paramd).a();
      return arrayOfd.length > 0 ? arrayOfd[0].a().e() : -1;
    }
    if ((paramd instanceof bd))
      try
      {
        int i = paramd.f().d();
        String str = h.b(parambw, i);
        return i - str.length();
      }
      catch (Exception localException)
      {
        return paramd.f().d();
      }
    return paramd.f().d();
  }

  private static g a(com.zend.ide.b.d paramd)
  {
    if ((paramd instanceof bh))
      return a((bh)paramd);
    if ((paramd instanceof v))
      return a();
    if ((paramd instanceof bf))
      return b();
    if ((paramd instanceof z))
      return c();
    if ((paramd instanceof x))
      return a((x)paramd);
    if ((paramd instanceof bd))
      return d();
    if ((paramd instanceof r))
      return f();
    if ((paramd instanceof c))
      return e();
    return null;
  }

  private static g a(bh parambh)
  {
    bi[] arrayOfbi = parambh.c();
    ArrayList localArrayList = new ArrayList(arrayOfbi.length + 1);
    for (int i = 0; i < arrayOfbi.length; i++)
    {
      localObject = '$' + arrayOfbi[i].a();
      if (arrayOfbi[i].g() != null)
        localObject = arrayOfbi[i].g() + ' ' + (String)localObject;
      else
        localObject = "unknown_type " + (String)localObject;
      f localf = new f(7, (String)localObject);
      localArrayList.add(localf);
    }
    String str = parambh.d();
    if (str == null)
    {
      str = "unknown";
    }
    else if (!str.equals("void"))
    {
      localObject = new f(6, str);
      localArrayList.add(localObject);
    }
    Object localObject = new j[localArrayList.size()];
    localArrayList.toArray(localObject);
    return (g)new i(null, null, localObject, 2);
  }

  private static g a()
  {
    return new i(null, null, null, 1);
  }

  private static g b()
  {
    f localf1 = new f(13, "defaultPackage");
    f localf2 = new f(1, System.getProperty("user.name"));
    j[] arrayOfj = { localf2, localf1 };
    return new i(null, null, arrayOfj, 0);
  }

  private static g a(x paramx)
  {
    f localf = null;
    int i = 3;
    if (paramx.i())
    {
      localf = new f(4, paramx.a());
      i = 4;
    }
    j[] arrayOfj = null;
    if (localf != null)
      arrayOfj = new j[] { localf };
    return new i(null, null, arrayOfj, i);
  }

  private static g c()
  {
    int i = 9;
    f localf = new f(12, "unknown_type");
    j[] arrayOfj = { localf };
    return new i(null, null, arrayOfj, i);
  }

  private static g d()
  {
    return new i(null, null, null, 5);
  }

  private static g e()
  {
    return new i(null, null, null, 5);
  }

  private static g f()
  {
    return new i(null, null, null, 7);
  }

  private static void a(bw parambw, g paramg, int paramInt, boolean paramBoolean)
  {
    h.a().b(parambw, paramg, paramInt, paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.m.o
 * JD-Core Version:    0.6.0
 */