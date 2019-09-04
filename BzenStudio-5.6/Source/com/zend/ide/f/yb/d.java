package com.zend.ide.f.yb;

import com.zend.ide.b.m;
import com.zend.ide.desktop.bl;
import com.zend.ide.f.cd;
import com.zend.ide.f.cl;
import com.zend.ide.f.di;
import com.zend.ide.f.ed;
import com.zend.ide.m.ab;
import com.zend.ide.m.bf;
import com.zend.ide.m.bh;
import com.zend.ide.m.bi;
import com.zend.ide.m.i;
import com.zend.ide.m.t;
import com.zend.ide.m.v;
import com.zend.ide.m.y;
import com.zend.ide.util.bc;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class d
{
  private e a = new e();
  private HashMap c = new HashMap();
  private static d b;

  public static d a()
  {
    if (b == null)
      b = new d();
    return b;
  }

  public v a(String paramString, File paramFile, m paramm)
    throws ParserConfigurationException, SAXException, IOException
  {
    v localv = f.a().a(paramString);
    if (localv != null)
      return localv;
    if (this.c.get(paramString) != null)
      return null;
    bc localbc;
    if (paramFile == null)
      localbc = bl.a().a(paramString);
    else
      localbc = bl.a().a(paramString, paramFile);
    URL localURL = a(paramString);
    if (localURL != null)
    {
      URLConnection localURLConnection = localURL.openConnection();
      localURLConnection.setConnectTimeout(1000);
      localbc.a = paramString;
      localbc.b = localURLConnection.getInputStream();
      localv = a(localbc, paramFile, paramm);
      f.a().a(paramString, localv);
      return localv;
    }
    if (localbc.b != null)
      return a(localbc, paramFile, paramm);
    return null;
  }

  private URL a(String paramString)
  {
    if ((!paramString.startsWith("http://")) && (!paramString.startsWith("https://")))
      return null;
    int i = paramString.lastIndexOf('.');
    if (i == -1)
      return null;
    String str = paramString.substring(i + 1);
    if ((!str.equalsIgnoreCase("wsdl")) && (!str.equalsIgnoreCase("xml")))
      return null;
    URL localURL;
    try
    {
      localURL = new URL(paramString);
    }
    catch (MalformedURLException localMalformedURLException)
    {
      this.c.put(paramString, paramString);
      return null;
    }
    return localURL;
  }

  private v a(bc parambc, File paramFile, m paramm)
    throws ParserConfigurationException, SAXException, IOException
  {
    SAXParser localSAXParser = SAXParserFactory.newInstance().newSAXParser();
    if (parambc.b == null)
      return null;
    this.a.m();
    this.a.a(parambc.a);
    localSAXParser.parse(parambc.b, this.a);
    if (this.a.l())
      return null;
    return a(paramm, parambc.a);
  }

  private v a(m paramm, String paramString)
  {
    ArrayList localArrayList1 = this.a.j();
    ArrayList localArrayList2 = this.a.o();
    String str1 = this.a.i();
    bi[] arrayOfbi = null;
    Object localObject1 = null;
    int i = localArrayList1.size();
    if ((str1 == null) || (str1.equals("")))
    {
      int j = paramString.lastIndexOf(File.separator);
      if (j == -1)
      {
        if (paramString.indexOf("://") != -1)
          j = paramString.lastIndexOf('/');
        if (j == -1)
          j = 0;
      }
      if (paramString.endsWith(".wsdl"))
        str1 = paramString.substring(j + 1, paramString.length() - 5);
      else
        str1 = paramString.substring(j + 1);
    }
    i locali = new i("", "", new com.zend.ide.m.f[0], 0);
    y localy = di.a("SoapClient", paramm);
    ab[] arrayOfab = g.k();
    t localt = di.a(str1, 0, locali, paramm, localy, di.h, di.g, di.j, di.c, arrayOfab, paramString);
    ArrayList localArrayList3 = new ArrayList();
    HashMap localHashMap = a(paramm, this.a.k());
    paramm = di.a(paramString, 0, 0, 0, 0);
    for (int k = 0; k < i; k++)
    {
      b localb = (b)localArrayList1.get(k);
      String str2 = localb.c();
      String str3 = localb.a();
      arrayOfbi = (bi[])(bi[])localHashMap.get(str3);
      if (arrayOfbi == null)
        continue;
      String str4 = localb.b();
      String str5 = "void";
      com.zend.ide.m.f[] arrayOff = new com.zend.ide.m.f[0];
      if (str4 != null)
      {
        localObject2 = (bi[])(bi[])localHashMap.get(str4);
        if (localObject2 == null)
          continue;
        if (localObject2.length != 0)
        {
          localObject1 = localObject2[0];
          str5 = localObject1.g();
          com.zend.ide.m.f localf = new com.zend.ide.m.f(6, str5);
          arrayOff = new com.zend.ide.m.f[] { localf };
        }
      }
      locali = new i(((String)localArrayList2.get(k)).trim(), "", arrayOff, 0);
      Object localObject2 = di.a(str2, 0, locali, paramm, arrayOfbi, str5);
      ((cl)localObject2).a(localt);
      localArrayList3.add(localObject2);
    }
    bh[] arrayOfbh = new bh[localArrayList3.size()];
    arrayOfbh = (bh[])(bh[])localArrayList3.toArray(arrayOfbh);
    Arrays.sort(arrayOfbh);
    ((cd)localt).a(arrayOfbh);
    for (int m = 0; m < arrayOfab.length; m++)
      ((ed)arrayOfab[m]).a(localt);
    return (v)localt;
  }

  private HashMap a(m paramm, ArrayList paramArrayList)
  {
    int i = paramArrayList.size();
    HashMap localHashMap = new HashMap();
    for (int j = 0; j < i; j++)
    {
      a locala = (a)paramArrayList.get(j);
      ArrayList localArrayList1 = locala.a();
      ArrayList localArrayList2 = locala.b();
      int k = localArrayList1.size();
      bi[] arrayOfbi = new bi[k];
      for (int m = 0; m < k; m++)
      {
        bi localbi = di.a((String)localArrayList1.get(m), paramm, false, false, (String)localArrayList2.get(m), null);
        arrayOfbi[m] = localbi;
      }
      localHashMap.put(locala.c(), arrayOfbi);
    }
    return localHashMap;
  }

  public void a(t paramt)
  {
    String str = paramt.c();
    f.a().a(str, null);
  }

  public void a(bf parambf)
  {
    this.c.clear();
    v[] arrayOfv = parambf.a();
    for (int i = 0; i < arrayOfv.length; i++)
    {
      t localt = (t)arrayOfv[i];
      a(localt);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.yb.d
 * JD-Core Version:    0.6.0
 */