package com.zend.ide.y.a;

import com.a.a.a;
import com.a.b;
import com.a.e;
import com.zend.ide.y.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.KeyStroke;

public class d extends a
{
  public d()
  {
    super("keyMapProperty", com.zend.ide.y.h.class);
  }

  public Object a(e parame)
  {
    String str1 = parame.a("id");
    String str2 = parame.a("name");
    int i = Integer.valueOf(parame.a("displayKey")).intValue();
    if (g.a(str1) == null)
      return null;
    KeyStroke[] arrayOfKeyStroke1 = null;
    KeyStroke[] arrayOfKeyStroke2 = null;
    List localList = parame.b();
    for (int j = 0; (localList != null) && (j < localList.size()); j++)
    {
      com.a.h localh1 = (com.a.h)localList.get(j);
      if (localh1.c().equals("values"))
      {
        arrayOfKeyStroke1 = (KeyStroke[])(KeyStroke[])localh1.b();
      }
      else
      {
        if (!localh1.c().equals("initialvalues"))
          continue;
        arrayOfKeyStroke2 = (KeyStroke[])(KeyStroke[])localh1.b();
      }
    }
    g tmp151_148 = g.i();
    tmp151_148.getClass();
    com.zend.ide.y.h localh = new com.zend.ide.y.h(tmp151_148, str1, str2, i, new Vector(Arrays.asList(arrayOfKeyStroke2)));
    localh.a(new Vector(Arrays.asList(arrayOfKeyStroke1)));
    return localh;
  }

  public e e()
  {
    e locale = new e();
    com.zend.ide.y.h localh = (com.zend.ide.y.h)c();
    locale.a("id", localh.h().toString());
    locale.a("name", localh.e().toString());
    locale.a("displayKey", "" + localh.g());
    ArrayList localArrayList = new ArrayList();
    KeyStroke[] arrayOfKeyStroke = new KeyStroke[((Vector)localh.c()).size()];
    ((Vector)localh.c()).toArray(arrayOfKeyStroke);
    com.a.d locald = b.a("values");
    locald.a(arrayOfKeyStroke);
    localArrayList.add(locald);
    arrayOfKeyStroke = new KeyStroke[((Vector)localh.b()).size()];
    ((Vector)localh.b()).toArray(arrayOfKeyStroke);
    locald = b.a("initialvalues");
    locald.a(arrayOfKeyStroke);
    localArrayList.add(locald);
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.a.d
 * JD-Core Version:    0.6.0
 */