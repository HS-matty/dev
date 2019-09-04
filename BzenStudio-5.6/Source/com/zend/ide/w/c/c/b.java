package com.zend.ide.w.c.c;

import com.zend.ide.w.c.h;
import com.zend.ide.w.c.i;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class b extends DefaultHandler
{
  private h a = new h();

  public void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
    throws SAXException
  {
    if (paramString3.equals("entry"))
    {
      i locali = new i();
      int i = paramAttributes.getLength();
      for (int j = 0; j < i; j++)
        locali.a(paramAttributes.getQName(j), paramAttributes.getValue(j));
      this.a.a(locali);
    }
  }

  public h a()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.c.b
 * JD-Core Version:    0.6.0
 */