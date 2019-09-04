package com.zend.ide.util.c;

import com.zend.ide.util.cl;

public class e
{
  private com.zend.ide.util.d.a a = new com.zend.ide.util.d.a();
  private static e b = new e();

  public static e b()
  {
    return b;
  }

  public void a(int paramInt, a parama)
  {
    this.a.a(paramInt, parama);
  }

  public a a(int paramInt)
  {
    a locala1 = null;
    a locala2 = (a)this.a.b(paramInt);
    try
    {
      locala1 = (a)locala2.clone();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return locala1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.c.e
 * JD-Core Version:    0.6.0
 */