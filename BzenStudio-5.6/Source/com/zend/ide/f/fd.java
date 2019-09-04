package com.zend.ide.f;

import com.zend.ide.b.e;
import com.zend.ide.util.cz;
import java.io.File;

class fd extends e
  implements gd
{
  private String e;
  final bt f;

  public fd(bt parambt, String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
    this.e = new File(paramString1).getName();
  }

  public void a(cz paramcz)
  {
  }

  public int compareTo(Object paramObject)
  {
    return this.e.compareToIgnoreCase(((gd)paramObject).c());
  }

  public String c()
  {
    return this.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.fd
 * JD-Core Version:    0.6.0
 */