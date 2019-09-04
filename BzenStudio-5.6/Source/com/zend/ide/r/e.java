package com.zend.ide.r;

import com.zend.ide.p.d.bl;
import com.zend.ide.util.cv;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.StringTokenizer;
import javax.swing.Icon;

class e extends p
{
  protected static final ArrayList e = new ArrayList();

  public e()
  {
    a(this);
  }

  public void a(d paramd)
  {
    String str = paramd.b();
    if ((this.d.containsKey(str)) || (this.d.containsKey(str)))
      return;
    if (this.c.containsKey(str))
    {
      d locald = (d)this.c.get(str);
      paramd.e(locald.g());
      paramd.b(locald.f());
      paramd.a(locald.e());
    }
    this.d.put(str, paramd);
    b(paramd);
  }

  public d a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if ((this.c.containsKey(paramString1)) || (this.d.containsKey(paramString1)))
      return null;
    d locald = new d(paramString1, paramString2);
    if (paramBoolean)
      this.c.put(paramString1, locald);
    else
      this.d.put(paramString1, locald);
    b(locald);
    return locald;
  }

  public void b(d paramd)
  {
    this.d.remove(paramd.b());
    this.c.remove(paramd.b());
    c(paramd);
    c(paramd);
  }

  private void c(d paramd)
  {
    Enumeration localEnumeration = this.j.elements();
    while (localEnumeration.hasMoreElements())
    {
      c localc = (c)localEnumeration.nextElement();
      localc.b(paramd);
    }
  }

  public d c(String paramString)
  {
    if (paramString == null)
      return null;
    d locald = (d)this.d.get(paramString);
    if (locald == null)
      locald = (d)this.c.get(paramString);
    return locald;
  }

  public d b(String paramString)
  {
    if (paramString == null)
      return null;
    Enumeration localEnumeration = this.d.elements();
    d locald;
    while (localEnumeration.hasMoreElements())
    {
      locald = (d)localEnumeration.nextElement();
      if (locald.a(paramString))
        return locald;
    }
    localEnumeration = this.c.elements();
    while (localEnumeration.hasMoreElements())
    {
      locald = (d)localEnumeration.nextElement();
      if (locald.a(paramString))
        return locald;
    }
    return null;
  }

  public d a(File paramFile)
  {
    int i = paramFile.getName().lastIndexOf(".");
    String str;
    if (i >= 0)
      str = paramFile.getName().substring(i);
    else
      str = "";
    return b(str);
  }

  public Icon a(File paramFile)
  {
    String str1 = paramFile.getName();
    int i = str1.lastIndexOf(".");
    String str2;
    if (i >= 0)
      str2 = str1.substring(i);
    else
      str2 = "";
    Icon localIcon = (Icon)this.i.get(str2);
    if (localIcon == null)
    {
      localIcon = bl.q.getSystemIcon(paramFile);
      this.i.put(str2, localIcon);
    }
    return localIcon;
  }

  public void a(d paramd, f paramf)
  {
    d locald = paramd;
    paramd.a(paramf);
    this.d.put(paramd.b(), paramd);
    a(new bo(locald, paramd));
  }

  public void b(d paramd, f paramf)
  {
    d locald = paramd;
    paramd.b(paramf);
    this.d.put(paramd.b(), paramd);
    a(new bo(locald, paramd));
  }

  public void a(d paramd, String paramString)
  {
    a(paramd, paramString, true);
  }

  public void a(d paramd, String paramString, boolean paramBoolean)
  {
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ";");
    f localf;
    while (localStringTokenizer.hasMoreTokens())
    {
      localf = new f(localStringTokenizer.nextToken().trim(), paramBoolean);
      paramd.a(localf);
    }
    if ((paramString.equals("")) || (paramString.indexOf(";;") != -1))
    {
      localf = new f("", paramBoolean);
      paramd.a(localf);
    }
  }

  private static void a(p paramp)
  {
    File localFile1 = new File(cv.d());
    File localFile2 = new File(localFile1, "fileTypes");
    if ((localFile2.exists()) && (localFile2.listFiles() != null))
    {
      localObject = new File(localFile2, "Web Documents.xml");
      if (!((File)localObject).exists())
        b(paramp);
      return;
    }
    b(paramp);
    Object localObject = paramp.a("XML files", "XML files", true);
    a((d)localObject, false, false, true, true, null, "XMLDocument");
    paramp.a((d)localObject, "xml ; xsd ; xsl ; tld  ; dtd ; wsdl ; zpj", false);
    ((d)localObject).d(localObject.h()[0].b());
    localObject = paramp.a("JSP files", "JSP files", true);
    a((d)localObject, false, false, true, true, null, "JSPDocument");
    paramp.a((d)localObject, "jsp ; jsf ; jspf", false);
    ((d)localObject).d(localObject.h()[0].b());
    localObject = paramp.a("SQL files", "SQL files", true);
    a((d)localObject, true, false, true, true, null, "SQLDocument");
    paramp.a((d)localObject, "sql", false);
    ((d)localObject).d(localObject.h()[0].b());
    e.addAll(Arrays.asList(((d)localObject).h()));
    localObject = paramp.a("Text files", "Text files", true);
    a((d)localObject, false, false, true, true, null, "TEXTDocument");
    paramp.a((d)localObject, "txt ; bat ; sh ; log ; cmd ; cgi", false);
    ((d)localObject).d(localObject.h()[0].b());
    localObject = paramp.a("Java Sources", "Java source files", true);
    a((d)localObject, false, false, true, true, null, "JavaDocument");
    paramp.a((d)localObject, "java", false);
    ((d)localObject).d(localObject.h()[0].b());
    localObject = paramp.a("Java Classes", "Java class files", true);
    a((d)localObject, false, true, true, true, null, "");
    paramp.a((d)localObject, "class", false);
    ((d)localObject).d(localObject.h()[0].b());
    ((d)localObject).e(true);
    localObject = paramp.a("Archives", "Archive files", true);
    a((d)localObject, false, true, true, true, null, "");
    paramp.a((d)localObject, "jar ; war ; zip ; ear", false);
    ((d)localObject).d(localObject.h()[0].b());
    ((d)localObject).e(true);
  }

  private static void b(p paramp)
  {
    c localc = new c();
    localc.b("Web Documents");
    localc.c("Web Documents");
    localc.d("php");
    localc.a(true);
    d locald = paramp.c("PHP files");
    if (locald == null)
    {
      locald = paramp.a("PHP files", "PHP files", true);
      a(locald, true, false, false, true, cv.b("explorer/phpfile.gif"), "PHPDocument");
      paramp.a(locald, "php ; php3 ; php4 ; phtml ; inc ; tpl");
      locald.d(locald.h()[0].b());
      e.addAll(Arrays.asList(locald.h()));
    }
    localc.a(locald);
    locald = paramp.c("HTML files");
    if (locald == null)
    {
      locald = paramp.a("HTML files", "HTML files", true);
      a(locald, true, false, false, true, cv.b("explorer/htmlfile.gif"), "HTMLDocument");
      paramp.a(locald, "html ; htm ; shtml ; xhtml ; shtm ; sht ");
      locald.d(locald.h()[0].b());
      e.addAll(Arrays.asList(locald.h()));
    }
    localc.a(locald);
    locald = paramp.c("JavaScript files");
    if (locald == null)
    {
      locald = paramp.a("JavaScript files", "JavaScript files", true);
      a(locald, true, false, true, true, null, "JSDocument");
      paramp.a(locald, "js", false);
      locald.d(locald.h()[0].b());
      e.addAll(Arrays.asList(locald.h()));
    }
    localc.a(locald);
    locald = paramp.c("CSS files");
    if (locald == null)
    {
      locald = paramp.a("CSS files", "CSS files", true);
      a(locald, true, false, true, true, null, "CSSDocument");
      paramp.a(locald, "css", false);
      locald.d(locald.h()[0].b());
      e.addAll(Arrays.asList(locald.h()));
    }
    localc.a(locald);
    paramp.a(localc);
  }

  private static void a(d paramd, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, Icon paramIcon, String paramString)
  {
    paramd.a(paramBoolean1);
    paramd.c(paramBoolean2);
    paramd.b(paramBoolean3);
    paramd.d(paramBoolean4);
    paramd.a(paramIcon);
    paramd.e(paramString);
  }

  protected boolean a(f paramf)
  {
    return e.contains(paramf);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.e
 * JD-Core Version:    0.6.0
 */