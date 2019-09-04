package com.zend.ide.desktop;

import com.zend.ide.j.h;
import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.r.o;
import com.zend.ide.r.r;
import com.zend.ide.util.cl;
import com.zend.ide.v.x;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class ch extends x
  implements DocumentListener, r
{
  private Hashtable b = new Hashtable();
  final be c;

  private ch(be parambe)
  {
  }

  public void b(dz paramdz, boolean paramBoolean)
  {
    if (!paramBoolean)
      return;
    String str = paramdz.k();
    a(str);
  }

  public void a(dz paramdz, boolean paramBoolean)
  {
    if (!paramBoolean)
      return;
    String str = paramdz.k();
    c(str);
  }

  public void a(String paramString1, String paramString2)
  {
    c(paramString1);
    dz localdz = be.e(this.c).a(paramString2);
    if (localdz == null)
    {
      cl.a("it not suppose to happen: ClassModelManager");
      return;
    }
    a(paramString2);
  }

  public void a(String paramString, boolean paramBoolean)
  {
    if (!paramBoolean)
      ((bo)this.b.get(paramString)).e();
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    String str = ((dz)paramDocumentEvent.getDocument()).k();
    ((bo)this.b.get(str)).d();
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    String str = ((dz)paramDocumentEvent.getDocument()).k();
    ((bo)this.b.get(str)).d();
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
  }

  private void a(String paramString)
  {
    bo localbo = new bo(this.c, paramString);
    this.b.put(paramString, localbo);
    localbo.b();
    File localFile = h.m.g(paramString);
    if (!be.c(paramString))
      try
      {
        String[] arrayOfString;
        int i;
        if (be.b(localFile))
        {
          arrayOfString = be.h(this.c).c(localFile.getCanonicalPath());
          for (i = 0; i < arrayOfString.length; i++)
          {
            if (arrayOfString[i].equals(be.i(this.c)))
              continue;
            be.h(this.c).a(arrayOfString[i], localFile.getCanonicalPath());
          }
        }
        else
        {
          arrayOfString = be.a(this.c).c(localFile.getCanonicalPath());
          for (i = 0; i < arrayOfString.length; i++)
          {
            if (arrayOfString[i].equals(be.i(this.c)))
              continue;
            be.a(this.c).a(arrayOfString[i], localFile.getCanonicalPath());
          }
        }
      }
      catch (IOException localIOException)
      {
      }
    be.c(this.c, be.i(this.c), localFile);
  }

  private void c(String paramString)
  {
    bo localbo = (bo)this.b.remove(paramString);
    if (localbo != null)
      localbo.c();
    File localFile = h.m.g(paramString);
    be.b(this.c, be.i(this.c), localFile);
  }

  public void a(com.zend.ide.r.bo parambo)
  {
    String str = be.e(this.c).k();
    if (str == null)
      return;
    c(str);
    dz localdz = be.e(this.c).a(str);
    if (localdz == null)
    {
      cl.a("it not suppose to happen: ClassModelManager");
      return;
    }
    a(str);
  }

  public void a(o paramo)
  {
  }

  public void c(o paramo)
  {
  }

  ch(be parambe, bf parambf)
  {
    this(parambe);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ch
 * JD-Core Version:    0.6.0
 */