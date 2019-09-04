package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.a.h;
import com.zend.ide.f.zc.b.c;
import com.zend.ide.f.zc.b.j;
import com.zend.ide.f.zc.b.l;
import com.zend.ide.l.eb;
import com.zend.ide.util.cl;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class t extends a
{
  public t()
  {
    super("javaBridge", c.class);
  }

  public e e()
  {
    e locale = new e();
    eb localeb = (eb)c();
    c localc = localeb.b();
    j localj = localeb.a();
    locale.a("JRE_Name", localj.d());
    List localList = localc.a();
    locale.a(localList);
    return locale;
  }

  public Object a(e parame)
  {
    String str = parame.a("JRE_Name");
    j localj = l.a(str);
    if (localj == null)
    {
      localj = l.b();
      l.f();
    }
    List localList = parame.b();
    c localc = a(localj, localList);
    eb localeb = new eb();
    localeb.a(localj);
    localeb.a(localc);
    return localeb;
  }

  private c a(j paramj, List paramList)
  {
    c localc = new c("JavaBuildPath");
    localc.a(0, paramj);
    if (paramList == null)
      return localc;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    for (int i = 0; i < paramList.size(); i++)
    {
      localObject = ((h)paramList.get(i)).b().toString();
      String str = ((String)localObject).toLowerCase();
      if ((str.endsWith(".jar")) || (str.endsWith(".zip")))
      {
        localArrayList2.add(new File((String)localObject));
      }
      else
      {
        File localFile = new File((String)localObject);
        if (!localFile.isDirectory())
          continue;
        localArrayList1.add(localFile);
      }
    }
    File[] arrayOfFile = new File[localArrayList1.size()];
    Object localObject = new File[localArrayList2.size()];
    localArrayList1.toArray(arrayOfFile);
    localArrayList2.toArray(localObject);
    try
    {
      localc.a(arrayOfFile);
    }
    catch (IOException localIOException1)
    {
      cl.a(localIOException1);
    }
    try
    {
      localc.b(localObject);
    }
    catch (IOException localIOException2)
    {
      cl.a(localIOException2);
    }
    return (c)localc;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.t
 * JD-Core Version:    0.6.0
 */