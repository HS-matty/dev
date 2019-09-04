package com.zend.ide.m;

import com.zend.ide.b.m;
import com.zend.ide.f.bl;
import com.zend.ide.f.s;
import com.zend.ide.f.vb;
import com.zend.ide.n.bw;
import javax.swing.text.Document;
import javax.swing.text.Element;

public final class bg
{
  public static com.zend.ide.b.d a(bf parambf, int paramInt)
  {
    if ((paramInt < 0) || (parambf == null))
      return null;
    v[] arrayOfv = parambf.c();
    v localv = null;
    Object localObject = null;
    for (int i = 0; i < arrayOfv.length; i++)
    {
      if (!a(arrayOfv[i].f(), paramInt))
        continue;
      if (localv == null)
      {
        localv = arrayOfv[i];
      }
      else
      {
        if (!a(localv.f(), arrayOfv[i].f().d()))
          continue;
        localv = arrayOfv[i];
        localObject = null;
      }
      bh[] arrayOfbh2 = arrayOfv[i].h();
      for (int k = 0; k < arrayOfbh2.length; k++)
      {
        if (!a(arrayOfbh2[k].f(), paramInt))
          continue;
        if (localObject == null)
        {
          localObject = arrayOfbh2[k];
        }
        else
        {
          if (!a(localObject.f(), arrayOfbh2[k].f().d()))
            continue;
          localObject = arrayOfbh2[k];
        }
      }
    }
    bh[] arrayOfbh1 = parambf.d();
    for (int j = 0; j < arrayOfbh1.length; j++)
    {
      if (!a(arrayOfbh1[j].f(), paramInt))
        continue;
      if (localObject == null)
      {
        localObject = arrayOfbh1[j];
      }
      else
      {
        if (!a(localObject.f(), arrayOfbh1[j].f().d()))
          continue;
        localObject = arrayOfbh1[j];
      }
    }
    if (localObject != null)
      return localObject;
    if (localv != null)
      return localv;
    return null;
  }

  public static v a(bf parambf, int paramInt)
  {
    if ((paramInt < 0) || (parambf == null))
      return null;
    v[] arrayOfv = parambf.c();
    for (int i = 0; i < arrayOfv.length; i++)
      if (a(arrayOfv[i].f(), paramInt))
        return arrayOfv[i];
    return null;
  }

  private static boolean a(m paramm, int paramInt)
  {
    return (paramInt > paramm.d()) && (paramInt <= paramm.e());
  }

  public static int a(int paramInt, bf parambf)
  {
    d[] arrayOfd = parambf.a();
    for (int i = arrayOfd.length - 1; i >= 0; i--)
      if (arrayOfd[i].a().d() < paramInt)
        return arrayOfd[i].a().d();
    return 0;
  }

  public static String a(bw parambw, String paramString, int paramInt, s params, boolean paramBoolean)
  {
    bf localbf = params.a(parambw.k());
    String str;
    if (paramString.equals("$this"))
    {
      v localv = a(localbf, paramInt);
      if (localv != null)
        str = localv.a();
      else
        str = "";
    }
    else
    {
      int i = parambw.getDocument().getDefaultRootElement().getElementIndex(paramInt) + 1;
      vb localvb = bl.a(localbf, paramInt);
      str = params.a(parambw.k(), localvb, paramString, i, paramBoolean);
    }
    return str;
  }

  public static String a(String paramString1, String paramString2, int paramInt1, int paramInt2, s params, boolean paramBoolean)
  {
    bf localbf = params.a(paramString1);
    String str;
    if (paramString2.equals("$this"))
    {
      v localv = a(localbf, paramInt1);
      if (localv != null)
        str = localv.a();
      else
        str = "";
    }
    else
    {
      int i = paramInt2 + 1;
      vb localvb = bl.a(localbf, paramInt1);
      str = params.a(paramString1, localvb, paramString2, i, paramBoolean);
    }
    return str;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.m.bg
 * JD-Core Version:    0.6.0
 */