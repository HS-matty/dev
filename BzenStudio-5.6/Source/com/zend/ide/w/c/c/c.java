package com.zend.ide.w.c.c;

import com.zend.ide.w.c.h;
import com.zend.ide.w.c.i;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class c
{
  private String a;

  public c(String paramString)
  {
    this.a = paramString;
  }

  public h a()
    throws IOException, IllegalArgumentException
  {
    BufferedReader localBufferedReader = null;
    try
    {
      h localh1 = new h();
      localBufferedReader = new BufferedReader(new FileReader(this.a));
      String str = localBufferedReader.readLine();
      if (Integer.parseInt(str) < 7)
        throw new IllegalArgumentException("Wrong SVN entries version. Found version " + str + ", while version 7 and beyond was expected.");
      i locali;
      do
      {
        locali = a(localBufferedReader);
        if (locali == null)
          continue;
        localh1.a(locali);
      }
      while (locali != null);
      h localh2 = localh1;
      return localh2;
    }
    finally
    {
      if (localBufferedReader != null)
        localBufferedReader.close();
    }
    throw localObject;
  }

  private i a(BufferedReader paramBufferedReader)
    throws IOException
  {
    String str1 = paramBufferedReader.readLine();
    String str2 = paramBufferedReader.readLine();
    if ((str2 == null) || (str1 == null))
      return null;
    i locali = new i();
    locali.a("name", str1.trim());
    locali.a("kind", str2.trim());
    int i = 2;
    String str3 = null;
    while ((str3 = paramBufferedReader.readLine()) != null)
    {
      if (str3.length() > 0)
      {
        if (str3.charAt(0) == '\f')
          break;
        switch (i)
        {
        case 5:
          locali.a("schedule", str3.trim());
          break;
        case 6:
          locali.a("text-time", str3.trim());
          break;
        case 16:
          locali.a("conflict-wrk", str3.trim());
        }
      }
      i++;
    }
    return locali;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.c.c
 * JD-Core Version:    0.6.0
 */