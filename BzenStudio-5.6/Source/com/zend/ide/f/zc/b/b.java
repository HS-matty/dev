package com.zend.ide.f.zc.b;

import java.io.File;
import java.io.IOException;

public class b extends a
{
  public b(String paramString, File[] paramArrayOfFile)
    throws IOException
  {
    super(paramString, a(paramArrayOfFile));
  }

  private static d[] a(File[] paramArrayOfFile)
    throws IOException
  {
    int i = paramArrayOfFile == null ? 0 : paramArrayOfFile.length;
    for (int j = 0; j < i; j++)
    {
      if ((e) || (paramArrayOfFile[j].isDirectory()))
        continue;
      throw new AssertionError();
    }
    d[] arrayOfd = new d[i];
    for (int k = 0; k < i; k++)
    {
      File[] arrayOfFile = j.b(paramArrayOfFile[k]);
      d locald = h.a(null, arrayOfFile);
      arrayOfd[k] = locald;
    }
    return arrayOfd;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zc.b.b
 * JD-Core Version:    0.6.0
 */