package com.zend.ide.cb.a;

class xd extends wd
{
  public void setValue(Object paramObject)
  {
    if (paramObject != null)
    {
      String str = paramObject.toString();
      if (str.endsWith(".0"))
        str = str.substring(0, str.length() - 2);
      setText(str);
    }
    else
    {
      setText("(null)");
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.xd
 * JD-Core Version:    0.6.0
 */