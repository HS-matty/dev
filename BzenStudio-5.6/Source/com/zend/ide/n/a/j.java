package com.zend.ide.n.a;

import com.zend.ide.j.h;
import com.zend.ide.n.dz;
import com.zend.ide.v.x;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.swing.text.Document;

public class j extends x
{
  final b b;

  protected j(b paramb)
  {
  }

  public void a(dz paramdz, boolean paramBoolean)
  {
    if (!paramBoolean)
      return;
    String str = paramdz.k();
    paramdz.getDocument().putProperty(this.b.c(), null);
    Iterator localIterator = this.b.b(str).iterator();
    while (localIterator.hasNext())
    {
      localObject = (e)localIterator.next();
      this.b.d((e)localObject);
    }
    Object localObject = h.m.g(str);
    if (!((File)localObject).exists())
    {
      List localList = this.b.b(str);
      while (!localList.isEmpty())
      {
        e locale = (e)localList.get(localList.size() - 1);
        this.b.b(locale);
      }
    }
  }

  public void b(dz paramdz, boolean paramBoolean)
  {
    String str = paramdz.k();
    if (paramBoolean)
      paramdz.getDocument().putProperty(this.b.c(), this.b);
    Iterator localIterator = this.b.b(str).iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      this.b.a(locale, paramBoolean);
    }
  }

  public void a(String paramString1, String paramString2)
  {
    k localk = (k)this.b.b(paramString1);
    localk.a(paramString2);
    Collections.sort(b.a(this.b));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.a.j
 * JD-Core Version:    0.6.0
 */