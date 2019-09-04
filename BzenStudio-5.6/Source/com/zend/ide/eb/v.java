package com.zend.ide.eb;

import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class v extends DefaultHandler
{
  String a;
  String b;
  String c;
  String d;
  String e;
  String f;
  String g;
  boolean h;
  StringBuffer i = new StringBuffer();
  StringBuffer j = new StringBuffer();
  private String k;
  final j l;

  v(j paramj)
  {
  }

  public void startDocument()
    throws SAXException
  {
  }

  public void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
    throws SAXException
  {
    this.k = paramString3;
    if (paramString3.equals("category"))
    {
      this.a = paramAttributes.getValue("name");
      this.h = false;
      return;
    }
    if (paramString3.equals("sub_category"))
    {
      this.b = paramAttributes.getValue("name");
      return;
    }
    if (paramString3.equals(j.g))
    {
      this.a = paramString3;
      this.b = paramString3;
      this.h = true;
      j.a(this.l).put(this.a, new HashMap());
      ((HashMap)j.a(this.l).get(this.a)).put(this.b, new ArrayList(0));
      return;
    }
    if (paramString3.equals("snippet"))
    {
      this.c = paramAttributes.getValue("name");
      this.d = paramAttributes.getValue("author");
      this.e = paramAttributes.getValue("date_modified");
      this.f = paramAttributes.getValue("date_entered");
      this.g = paramAttributes.getValue("rating");
      this.i.delete(0, this.i.length());
      this.j.delete(0, this.j.length());
      return;
    }
  }

  public void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws SAXException
  {
    if (this.k.equals("description"))
    {
      this.i.append(paramArrayOfChar, paramInt1, paramInt2);
      return;
    }
    if (this.k.equals("code"))
    {
      this.j.append(paramArrayOfChar, paramInt1, paramInt2);
      return;
    }
  }

  public void endElement(String paramString1, String paramString2, String paramString3)
    throws SAXException
  {
    if (paramString3.equals("snippet"))
    {
      ArrayList localArrayList = (ArrayList)((HashMap)j.a(this.l).get(this.a)).get(this.b);
      if (localArrayList == null)
      {
        localArrayList = new ArrayList();
        ((HashMap)j.a(this.l).get(this.a)).put(this.b, localArrayList);
      }
      localArrayList.add(new a(this.c, this.i.toString(), this.j.toString(), this.h, this.d, this.g, this.e, this.f));
    }
    else if ((paramString3.equals("code")) || (paramString3.equals("description")))
    {
      this.k = "";
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.v
 * JD-Core Version:    0.6.0
 */