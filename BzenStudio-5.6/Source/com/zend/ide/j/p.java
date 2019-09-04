package com.zend.ide.j;

import java.io.File;

class p
{
  File a;
  long b;
  boolean c;
  final o d;

  p(o paramo, File paramFile)
  {
    this.a = paramFile;
    this.b = paramFile.lastModified();
    this.c = paramFile.exists();
  }

  public boolean equals(Object paramObject)
  {
    File localFile;
    if ((paramObject instanceof File))
      localFile = (File)paramObject;
    else
      localFile = ((p)paramObject).a;
    return localFile.equals(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.p
 * JD-Core Version:    0.6.0
 */