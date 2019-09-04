package com.zend.ide.cb.b;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class c extends DefaultHandler
{
  private ArrayList a = new ArrayList(25);

  public void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
    throws SAXException
  {
    if (paramString3.equals("query"))
      try
      {
        this.a.add(URLDecoder.decode(paramAttributes.getValue("value"), "UTF-8"));
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
      }
  }

  public ArrayList a()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.b.c
 * JD-Core Version:    0.6.0
 */