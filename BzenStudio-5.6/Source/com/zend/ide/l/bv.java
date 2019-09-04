package com.zend.ide.l;

import com.zend.ide.r.o;
import com.zend.ide.r.s;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.io.File;

public class bv extends s
  implements cu, o
{
  public boolean accept(File paramFile)
  {
    if (paramFile == null)
      return false;
    if (paramFile.isDirectory())
      return true;
    String str1 = paramFile.getName();
    int i = str1.lastIndexOf('.');
    if ((i < 0) || (i > str1.length() - 2))
      return false;
    String str2 = str1.substring(i).toLowerCase();
    return str2.equals(".zpj");
  }

  public String getDescription()
  {
    return ct.a(205);
  }

  public String b()
  {
    return getDescription();
  }

  public String c()
  {
    return ".zpj";
  }

  public boolean d()
  {
    return true;
  }

  public boolean a(String paramString)
  {
    return false;
  }

  public boolean a(File paramFile)
  {
    return accept(paramFile);
  }

  public boolean b(String paramString)
  {
    return a(new File(paramString));
  }

  public s j()
  {
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.bv
 * JD-Core Version:    0.6.0
 */