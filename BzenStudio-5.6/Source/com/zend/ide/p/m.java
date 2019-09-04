package com.zend.ide.p;

import javax.swing.Icon;

public class m
  implements k
{
  private Object a;
  private String b;
  private Icon c;

  public m(Object paramObject, Icon paramIcon)
  {
    this(paramObject, paramObject.toString(), paramIcon);
  }

  public m(Object paramObject, String paramString, Icon paramIcon)
  {
    this.a = paramObject;
    this.b = paramString;
    this.c = paramIcon;
  }

  public Object b()
  {
    return this.a;
  }

  public String toString()
  {
    return this.b;
  }

  public Icon c()
  {
    return this.c;
  }

  public boolean equals(Object paramObject)
  {
    int i = 0;
    if ((paramObject instanceof m))
    {
      m localm = (m)paramObject;
      i = (this.b.equals(localm.b)) && (this.c.equals(localm.c)) ? 1 : 0;
    }
    return i;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.m
 * JD-Core Version:    0.6.0
 */