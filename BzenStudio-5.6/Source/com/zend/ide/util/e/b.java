package com.zend.ide.util.e;

import java.awt.datatransfer.DataFlavor;

public class b
{
  public int a;
  protected DataFlavor b;
  protected String c;

  b(int paramInt, DataFlavor paramDataFlavor, String paramString)
  {
    this.b = paramDataFlavor;
    this.a = paramInt;
    this.c = paramString;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b))
      return false;
    b localb = (b)paramObject;
    return (localb.a == this.a) && (localb.b.equals(this.b)) && (localb.c.equals(this.c));
  }

  public int hashCode()
  {
    return this.b.hashCode() + this.a + this.c.hashCode();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.e.b
 * JD-Core Version:    0.6.0
 */