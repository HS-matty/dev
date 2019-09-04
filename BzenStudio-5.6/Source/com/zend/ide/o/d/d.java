package com.zend.ide.o.d;

import com.zend.ide.t.p;
import com.zend.ide.util.cz;

public class d extends p
{
  private String c;

  public d()
  {
    super(2006);
  }

  public String b()
  {
    return this.c;
  }

  public void a(String paramString)
  {
    this.c = paramString;
  }

  public void a(cz paramcz)
    throws Exception
  {
    ((bl)paramcz).a(this);
  }

  public String toString()
  {
    return super.toString() + ":" + this.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.d.d
 * JD-Core Version:    0.6.0
 */