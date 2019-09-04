package com.zend.ide.hb;

public class e
  implements Cloneable
{
  public String a;
  public boolean b = false;
  public boolean c = false;
  public boolean d = true;
  public boolean e = true;
  public boolean f = false;
  public boolean g = false;

  public Object clone()
  {
    try
    {
      e locale = (e)super.clone();
      return locale;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    throw new InternalError();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.e
 * JD-Core Version:    0.6.0
 */