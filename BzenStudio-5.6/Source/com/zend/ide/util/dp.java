package com.zend.ide.util;

import javax.swing.Action;

public class dp extends dn
{
  String b;

  public dp(Action paramAction, String paramString)
  {
    super(paramAction);
    this.b = paramString;
    b();
  }

  private void b()
  {
    o localo = n.c().a(this.b);
    Action localAction = d();
    if (localo != null)
    {
      putValue("Name", localo.g());
      putValue("ShortDescription", a("ShortDescription", localAction, localo.b()));
      putValue("SmallIcon", a("SmallIcon", localAction, localo.c()));
      Object localObject = a("MnemonicKey", localAction, localo.e());
      if (localObject != null)
        putValue("MnemonicKey", localObject);
      putValue("AcceleratorKey", a("AcceleratorKey", localAction, localo.f()));
    }
  }

  private Object a(String paramString, Action paramAction, Object paramObject)
  {
    Object localObject1 = null;
    Object localObject2 = paramAction.getValue(paramString);
    if (localObject2 != null)
      localObject1 = localObject2;
    else if (paramObject != null)
      localObject1 = paramObject;
    return localObject1;
  }

  public void a(Action paramAction)
  {
    super.a(paramAction);
    b();
  }

  public String c()
  {
    return this.b;
  }

  public void a(String paramString)
  {
    this.b = paramString;
  }

  public boolean equals(Object paramObject)
  {
    int i = 1;
    if (!(paramObject instanceof dp))
      return false;
    dp localdp = (dp)paramObject;
    Object[] arrayOfObject1 = getKeys();
    Object[] arrayOfObject2 = localdp.getKeys();
    if (arrayOfObject1.length != arrayOfObject2.length)
      return false;
    for (int j = 0; j < arrayOfObject1.length; j++)
    {
      String str = (String)arrayOfObject1[j];
      if (getValue(str).equals(localdp.getValue(str)))
        continue;
      i = 0;
    }
    return i;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.dp
 * JD-Core Version:    0.6.0
 */