package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.ab;
import com.zend.ide.o.bi;
import com.zend.ide.o.hb;
import com.zend.ide.o.kb;
import java.util.HashMap;
import java.util.Map;

public class g
  implements ab
{
  private static final a[] a = new a[0];
  private bi b;
  private Map c = new HashMap();
  private Map d = new HashMap();
  private String[] e = { "get_defined_vars()" };

  public g(bi parambi)
  {
    this.b = parambi;
  }

  public String a(a parama, int paramInt)
  {
    if (!this.b.d())
      return "N";
    if ((parama instanceof kb))
      return a((kb)parama, paramInt);
    String[] arrayOfString = b(parama.a());
    return a(arrayOfString, paramInt);
  }

  public boolean a(a parama, String paramString, int paramInt)
  {
    String[] arrayOfString1 = b(parama.a());
    String[] arrayOfString2 = new String[arrayOfString1.length - 1];
    System.arraycopy(arrayOfString1, 1, arrayOfString2, 0, arrayOfString1.length - 1);
    return this.b.a(arrayOfString1[0], paramString, paramInt, arrayOfString2);
  }

  private String a(String[] paramArrayOfString, int paramInt)
  {
    String str1 = a(paramArrayOfString);
    if (this.c.containsKey(str1))
      return (String)this.c.get(str1);
    if ((paramInt == 0) && (this.d.containsKey(str1)))
      return (String)this.d.get(str1);
    String[] arrayOfString = new String[paramArrayOfString.length - 1];
    System.arraycopy(paramArrayOfString, 1, arrayOfString, 0, paramArrayOfString.length - 1);
    String str2 = this.b.a(paramArrayOfString[0], paramInt, arrayOfString);
    if (str2 != null)
    {
      if (paramInt == 1)
        this.c.put(str1, str2);
      else if (paramInt == 0)
        this.d.put(str1, str2);
    }
    else
      str2 = "N";
    return str2;
  }

  private static String a(String[] paramArrayOfString)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramArrayOfString.length * 5);
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      localStringBuffer.append(paramArrayOfString[i]);
      localStringBuffer.append(' ');
    }
    return localStringBuffer.toString();
  }

  private static String[] b(String[] paramArrayOfString)
  {
    String str = paramArrayOfString[0];
    if (str.startsWith("$GLOBALS[GLOBALS]"))
    {
      str = "$GLOBALS" + str.substring(17);
      paramArrayOfString[0] = str;
      return b(paramArrayOfString);
    }
    if (paramArrayOfString.length < 2)
      return paramArrayOfString;
    String[] arrayOfString;
    if ((paramArrayOfString[0].equals("get_defined_vars()")) && (paramArrayOfString[1].equals("GLOBALS")))
    {
      arrayOfString = new String[paramArrayOfString.length - 1];
      arrayOfString[0] = "$GLOBALS";
      System.arraycopy(paramArrayOfString, 2, arrayOfString, 1, paramArrayOfString.length - 2);
      return b(arrayOfString);
    }
    if ((paramArrayOfString[0].equals("$GLOBALS")) && (paramArrayOfString[1].equals("GLOBALS")))
    {
      arrayOfString = new String[paramArrayOfString.length - 1];
      arrayOfString[0] = paramArrayOfString[0];
      System.arraycopy(paramArrayOfString, 2, arrayOfString, 1, paramArrayOfString.length - 2);
      return b(arrayOfString);
    }
    return paramArrayOfString;
  }

  public a[] a()
  {
    String str1 = a(this.e, 1);
    hb localhb = h.a(null, str1);
    Object localObject = localhb.d();
    if (localObject == null)
      localObject = a;
    for (int i = 0; i < localObject.length; i++)
    {
      String str2 = localObject[i].c();
      if (!str2.equals("$GLOBALS"))
        continue;
      a[] arrayOfa = new a[localObject.length - 1];
      System.arraycopy(localObject, 0, arrayOfa, 0, i);
      System.arraycopy(localObject, i + 1, arrayOfa, i, localObject.length - i - 1);
      localObject = arrayOfa;
      break;
    }
    this.c.put("LOCLAS", localObject);
    return (a)localObject;
  }

  private String a(kb paramkb, int paramInt)
  {
    int i = paramkb.a();
    String[] arrayOfString1 = paramkb.a();
    String[] arrayOfString2 = new String[arrayOfString1.length - 1];
    System.arraycopy(arrayOfString1, 1, arrayOfString2, 0, arrayOfString1.length - 1);
    return this.b.a(i, arrayOfString1[0], paramInt, arrayOfString2);
  }

  public void a()
  {
    this.c.clear();
    this.d.clear();
  }

  public a a(String paramString)
  {
    return new d(paramString);
  }

  public void b(a parama, int paramInt)
  {
    String str = a(parama, paramInt);
    parama.a(h.a(parama, str));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.g
 * JD-Core Version:    0.6.0
 */