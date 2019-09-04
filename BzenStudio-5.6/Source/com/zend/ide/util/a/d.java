package com.zend.ide.util.a;

public class d
  implements com.zend.ide.util.c.d
{
  private com.zend.ide.util.c.d a;

  public d(com.zend.ide.util.c.d paramd)
  {
    this.a = paramd;
  }

  public Object k()
  {
    try
    {
      return this.a.k();
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
    return localException;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.a.d
 * JD-Core Version:    0.6.0
 */