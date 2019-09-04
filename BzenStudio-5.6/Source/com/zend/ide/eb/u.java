package com.zend.ide.eb;

import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class u extends DefaultHandler
{
  String a;
  String b;
  final j c;

  u(j paramj)
  {
  }

  public void startDocument()
    throws SAXException
  {
  }

  public void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
    throws SAXException
  {
    if (paramString3.equals("category"))
    {
      this.a = paramAttributes.getValue("name");
      j.a(this.c).put(this.a, new HashMap());
      return;
    }
    if (paramString3.equals("sub_category"))
    {
      this.b = paramAttributes.getValue("name");
      ((HashMap)j.a(this.c).get(this.a)).put(this.b, null);
      return;
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.u
 * JD-Core Version:    0.6.0
 */