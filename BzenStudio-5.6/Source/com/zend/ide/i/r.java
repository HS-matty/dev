package com.zend.ide.i;

import com.zend.ide.p.bb;
import com.zend.ide.p.x;
import com.zend.ide.util.ct;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.Frame;

public class r extends p
{
  public r()
  {
    setTitle(ct.a(147));
  }

  public r(Frame paramFrame)
  {
    super(paramFrame);
    setTitle(ct.a(147));
  }

  public String e()
  {
    String str1 = f();
    int i = str1.lastIndexOf('#');
    int j = str1.lastIndexOf('?');
    String str2 = "";
    if (i != -1)
    {
      str2 = (j != -1) && (j > i) ? str1.substring(i, j) : str1.substring(i);
      str1 = (j != -1) && (j > i) ? str1.substring(0, i) + str1.substring(j) : str1.substring(0, i);
    }
    StringBuffer localStringBuffer = new StringBuffer(str1);
    char c = localStringBuffer.toString().indexOf('?') == -1 ? '?' : '&';
    localStringBuffer.append(c);
    localStringBuffer.append(q());
    Boolean localBoolean = (Boolean)b.a("debugging.firstLineBreakpoint").c();
    if (localBoolean.booleanValue())
      localStringBuffer.append("&debug_stop=1");
    localStringBuffer.append("&debug_url=1");
    if (this.g.isSelected())
    {
      localStringBuffer.append("&debug_new_session=1");
    }
    else if (this.h.isSelected())
    {
      localStringBuffer.append("&debug_start_session=1");
    }
    else if (j())
    {
      localStringBuffer.append("&debug_start_url=" + g());
      if (this.j.isSelected())
        localStringBuffer.append("&debug_cont_session=1");
    }
    if (!s())
      localStringBuffer.append("&no_remote=1");
    localStringBuffer.append(str2);
    return localStringBuffer.toString();
  }

  protected String r()
  {
    return "DEBUG_URL";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.r
 * JD-Core Version:    0.6.0
 */