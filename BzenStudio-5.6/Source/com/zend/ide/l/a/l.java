package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.zend.ide.l.be;
import com.zend.ide.l.d;
import com.zend.ide.u.f;
import com.zend.ide.u.i;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class l extends a
{
  public l()
  {
    super("project_roots", be.class);
  }

  public Object a(e parame)
  {
    List localList = parame.b();
    File[] arrayOfFile;
    if (localList == null)
    {
      arrayOfFile = new File[0];
    }
    else
    {
      localObject = new ArrayList();
      arrayOfFile = new File[localList.size()];
      for (int i = 0; i < localList.size(); i++)
      {
        com.a.h localh = (com.a.h)localList.get(i);
        File localFile = (File)localh.b();
        if (localFile == null)
          continue;
        if (((localFile instanceof f)) && (((f)localFile).c().equals(i.a())))
          ((List)localObject).add(localFile);
        else
          ((List)localObject).add(com.zend.ide.j.h.m.g(localFile.getPath()));
      }
      arrayOfFile = new File[((List)localObject).size()];
      arrayOfFile = (File[])((List)localObject).toArray(arrayOfFile);
    }
    Object localObject = new be();
    d locald = new d("Project");
    locald.c(arrayOfFile);
    ((be)localObject).a(locald);
    return localObject;
  }

  public e e()
  {
    e locale = new e();
    ArrayList localArrayList = new ArrayList();
    be localbe = (be)c();
    d locald = (d)localbe.b();
    File[] arrayOfFile = locald.b();
    for (int i = 0; i < arrayOfFile.length; i++)
    {
      File localFile = arrayOfFile[i];
      if (((localFile instanceof f)) && (((f)localFile).c().equals(i.a())))
        localArrayList.add(localFile);
      else
        localArrayList.add(com.zend.ide.j.h.m.g(localFile.getPath()));
    }
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.l
 * JD-Core Version:    0.6.0
 */