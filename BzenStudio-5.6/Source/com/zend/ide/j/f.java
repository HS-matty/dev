package com.zend.ide.j;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public abstract class f extends e
  implements s
{
  private static Map i;

  protected f()
  {
    super("");
  }

  protected f(String paramString)
  {
    super(paramString);
  }

  public synchronized boolean a(File paramFile)
  {
    return o(paramFile.getPath());
  }

  public synchronized boolean o(String paramString)
  {
    File[] arrayOfFile = b();
    for (int j = 0; j < arrayOfFile.length; j++)
      if (paramString.startsWith(arrayOfFile[j].getPath()))
        return true;
    return false;
  }

  public String c(String paramString)
    throws IOException
  {
    Stack localStack = new Stack();
    char c = d();
    paramString = d(paramString);
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString, String.valueOf(c));
    while (localStringTokenizer.hasMoreTokens())
    {
      localObject = localStringTokenizer.nextToken();
      if ((((String)localObject).equals("..")) && (localStack.size() > 1))
        localStack.pop();
      if ((!((String)localObject).equals(".")) && (!((String)localObject).equals("..")) && (!((String)localObject).equals("")))
        localStack.push(localObject);
    }
    Object localObject = new StringBuffer(paramString.length() * 2);
    String str = (String)localStack.get(0);
    ((StringBuffer)localObject).append(str);
    for (int j = 1; j < localStack.size(); j++)
    {
      ((StringBuffer)localObject).append(c);
      str = (String)localStack.get(j);
      ((StringBuffer)localObject).append(str);
    }
    paramString = ((StringBuffer)localObject).toString();
    return (String)paramString;
  }

  public abstract File a(String paramString, int paramInt);

  public abstract File g(String paramString);

  public abstract File a(File paramFile, String paramString);

  public abstract File a(String paramString1, String paramString2);

  public int a(File paramFile1, File paramFile2)
  {
    String str1 = paramFile1.getAbsolutePath();
    String str2 = paramFile2.getAbsolutePath();
    return str1.compareTo(str2);
  }

  public void b(String paramString1, String paramString2)
    throws IOException
  {
    if (i == null)
      i = new HashMap(4);
    if (i.containsKey(paramString1))
      throw new IOException((String)i.get(paramString1));
    i.put(paramString1, paramString2);
  }

  public boolean p(String paramString)
  {
    if (i == null)
      return false;
    return i.containsKey(paramString);
  }

  public String q(String paramString)
  {
    return (String)i.get(paramString);
  }

  public void r(String paramString)
  {
    if (i == null)
      return;
    i.remove(paramString);
  }

  public boolean a(String paramString)
  {
    File[] arrayOfFile = b();
    for (int j = 0; j < arrayOfFile.length; j++)
      if (paramString.startsWith(arrayOfFile[j].getPath()))
        return true;
    return false;
  }

  public boolean p(File paramFile)
  {
    return g(paramFile.getPath()).exists();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.f
 * JD-Core Version:    0.6.0
 */