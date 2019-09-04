package com.zend.ide.j;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class k extends j
{
  protected List i = new ArrayList();

  public k(String paramString, u paramu)
  {
    super(paramString, paramu);
  }

  public k(String paramString, u paramu, File[] paramArrayOfFile)
  {
    this(paramString, paramu);
    this.i.addAll(Arrays.asList(paramArrayOfFile));
  }

  public File[] b()
  {
    File[] arrayOfFile = new File[this.i.size()];
    this.i.toArray(arrayOfFile);
    return arrayOfFile;
  }

  public boolean m(File paramFile)
  {
    return this.i.contains(paramFile);
  }

  public void r(File paramFile)
  {
    if (p(paramFile))
      super.r(paramFile);
  }

  public void c(File paramFile, boolean paramBoolean)
  {
    if (m(paramFile))
    {
      this.i.remove(paramFile);
      super.c(paramFile, paramBoolean);
      return;
    }
    super.c(paramFile, paramBoolean);
  }

  public void c(File paramFile1, File paramFile2)
  {
    if (m(paramFile1))
    {
      this.i.remove(paramFile1);
      this.i.add(paramFile2);
    }
    if ((p(paramFile1)) || (p(paramFile2)))
      super.c(paramFile1, paramFile2);
  }

  public void s(File paramFile)
  {
    if (p(paramFile))
      super.s(paramFile);
  }

  public void a(File[] paramArrayOfFile)
  {
  }

  public void b(File[] paramArrayOfFile)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfFile.length);
    for (int j = 0; j < paramArrayOfFile.length; j++)
    {
      if (!p(paramArrayOfFile[j]))
        continue;
      localArrayList.add(paramArrayOfFile[j]);
    }
    File[] arrayOfFile = new File[localArrayList.size()];
    localArrayList.toArray(arrayOfFile);
    if (arrayOfFile.length > 0)
    {
      this.i.removeAll(localArrayList);
      super.b(arrayOfFile);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.k
 * JD-Core Version:    0.6.0
 */