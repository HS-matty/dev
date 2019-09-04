package com.zend.ide.b;

public abstract class e
  implements d
{
  protected String a;
  private String b;
  private boolean c;
  protected m d;

  public e(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, null);
  }

  public e(String paramString1, String paramString2, m paramm)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.d = paramm;
    this.c = (paramm != null);
  }

  public final String a()
  {
    return this.a;
  }

  public String b()
  {
    return this.b;
  }

  public final boolean e()
  {
    return this.c;
  }

  public final m f()
  {
    return this.d;
  }

  public int compareTo(Object paramObject)
  {
    if (!(paramObject instanceof d))
      return -1;
    d locald = (d)paramObject;
    String str = locald.a();
    int i = Math.min(this.a.length(), str.length());
    for (int j = 0; j < i; j++)
    {
      int k = this.a.charAt(0);
      int m = str.charAt(0);
      if (k == 95)
      {
        if (m != 95)
          return 1;
      }
      else
      {
        if (m != 95)
          break;
        return -1;
      }
    }
    j = this.a.compareToIgnoreCase(str);
    if (j != 0)
      return j;
    boolean bool = locald.e();
    if (!this.c)
    {
      if (!bool)
        return 0;
      return -1;
    }
    if (!bool)
      return 1;
    return this.d.c().compareTo(locald.f().c());
  }

  public String toString()
  {
    if (f() == null)
      return this.a;
    return this.a + " (in " + f().c() + ")";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.b.e
 * JD-Core Version:    0.6.0
 */