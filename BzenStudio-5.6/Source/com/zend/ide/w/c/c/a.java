package com.zend.ide.w.c.c;

import com.zend.ide.util.cl;
import com.zend.ide.w.c.h;
import java.io.FileReader;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class a
{
  private static boolean a = false;

  public static h a(String paramString)
    throws ParserConfigurationException, SAXException, IOException
  {
    h localh = null;
    Object localObject = null;
    if (a)
      try
      {
        localh = b(paramString);
      }
      catch (Exception localException1)
      {
        localObject = localException1;
        a = false;
        try
        {
          localh = c(paramString);
        }
        catch (Exception localException3)
        {
          localObject = localException3;
        }
      }
    else
      try
      {
        localh = c(paramString);
      }
      catch (Exception localException2)
      {
        localObject = localException2;
        a = true;
        try
        {
          localh = b(paramString);
        }
        catch (Exception localException4)
        {
          localObject = localException4;
        }
      }
    if (localh != null)
      return localh;
    cl.a(localObject);
    return new h();
  }

  private static h b(String paramString)
    throws ParserConfigurationException, SAXException, IOException
  {
    SAXParser localSAXParser = SAXParserFactory.newInstance().newSAXParser();
    b localb = new b();
    localSAXParser.parse(new InputSource(new FileReader(paramString)), localb);
    return localb.a();
  }

  private static h c(String paramString)
    throws IOException
  {
    return new c(paramString).a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.c.a
 * JD-Core Version:    0.6.0
 */