package com.zend.ide.w.b;

import com.zend.ide.util.cl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

class be
{
  private StringBuffer a = new StringBuffer();

  public be(Reader paramReader)
  {
    BufferedReader localBufferedReader = null;
    try
    {
      localBufferedReader = new BufferedReader(paramReader);
      String str;
      while ((str = localBufferedReader.readLine()) != null)
      {
        this.a.append(str);
        this.a.append('\n');
      }
    }
    catch (IOException localIOException3)
    {
      cl.a(localIOException2);
    }
    finally
    {
      if (localBufferedReader != null)
        try
        {
          localBufferedReader.close();
        }
        catch (IOException localIOException4)
        {
          cl.a(localIOException4);
        }
    }
  }

  public String b()
  {
    return this.a.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.be
 * JD-Core Version:    0.6.0
 */