package com.zend.ide.h;

import com.zend.ide.j.bd;
import java.io.File;
import java.util.Comparator;

public class bo
  implements Comparator
{
  private boolean a = true;

  public int compare(Object paramObject1, Object paramObject2)
  {
    String str1 = (paramObject1 instanceof File) ? a((File)paramObject1) : paramObject1.toString();
    String str2 = (paramObject2 instanceof File) ? a((File)paramObject2) : paramObject2.toString();
    String str3 = str1;
    String str4 = str2;
    str3 = str3.toUpperCase();
    str4 = str4.toUpperCase();
    int i = str3.compareTo(str4);
    if (i == 0)
    {
      str3 = str1;
      str4 = str2;
      i = str3.compareTo(str4);
    }
    return i;
  }

  public void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  private String a(File paramFile)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramFile.getName().length());
    if ((this.a) && ((paramFile instanceof bd)))
      localStringBuffer.append('2');
    else if (paramFile.isDirectory())
      localStringBuffer.append('1');
    localStringBuffer.append('a');
    String str = paramFile.getName();
    if ((str == null) || (!str.equals("")))
      localStringBuffer.append(str);
    else
      localStringBuffer.append(paramFile.getPath());
    return localStringBuffer.toString();
  }

  public boolean equals(Object paramObject)
  {
    return paramObject instanceof bo;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.bo
 * JD-Core Version:    0.6.0
 */