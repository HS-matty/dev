package com.zend.ide.n;

import com.zend.ide.be.k;
import com.zend.ide.j.h;
import com.zend.ide.p.ba;
import com.zend.ide.p.d.bp;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.r.p;
import com.zend.ide.r.y;
import com.zend.ide.util.ab;
import com.zend.ide.util.bh;
import com.zend.ide.util.cl;
import com.zend.ide.util.cr;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.dj;
import com.zend.ide.v.r;
import java.awt.BorderLayout;
import java.io.CharConversionException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.Document;

public class br
  implements cu
{
  private static boolean l = (System.getProperty("jp") != null) && (ct.a(new Locale("ja", "")));
  private static bp a;
  private static String b;
  private static bp c;
  private static String d;
  private static ArrayList f = new ArrayList();
  private static DefaultEditorKit e;
  private static Pattern g = Pattern.compile("network path", 2);
  private static Pattern h = Pattern.compile("write protected", 2);
  private static Pattern i = Pattern.compile("space", 2);
  private static Pattern j = Pattern.compile("parameter", 2);
  private static Pattern k = Pattern.compile("Access", 2);

  public static synchronized bp f()
  {
    if (a == null)
    {
      a = new bp();
      if ((b != null) && (!b.equals("")))
      {
        a.setCurrentDirectory(h.m.g(b));
        b = null;
      }
    }
    return a;
  }

  public static String b()
  {
    String str = "";
    if (b != null)
      str = b;
    else if (a != null)
      str = a.getCurrentDirectory().getAbsolutePath();
    return str;
  }

  public static void a(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
      return;
    if (a != null)
      a.setCurrentDirectory(h.m.g(paramString));
    b = paramString;
  }

  public static synchronized bp c()
  {
    if (c == null)
    {
      c = new bp();
      c.setMultiSelectionEnabled(true);
      c.setDialogTitle(ct.a(70));
      if ((d != null) && (!d.equals("")))
      {
        c.setCurrentDirectory(h.m.g(d));
        d = null;
      }
    }
    return c;
  }

  public static String d()
  {
    String str = "";
    if (d != null)
      str = d;
    else if (c != null)
      str = c.getCurrentDirectory().getAbsolutePath();
    return str;
  }

  public static void b(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
      return;
    if (c != null)
      c.setCurrentDirectory(h.m.g(paramString));
    d = paramString;
  }

  public static int a(dz paramdz)
  {
    Document localDocument = paramdz.getDocument();
    synchronized (f)
    {
      if (f.contains(localDocument))
        return 1;
      f.add(localDocument);
    }
    try
    {
      int m = c(paramdz);
      return m;
    }
    finally
    {
      synchronized (f)
      {
        f.remove(localDocument);
      }
    }
    throw localObject3;
  }

  public static int b(dz paramdz)
  {
    Document localDocument = paramdz.getDocument();
    synchronized (f)
    {
      if (f.contains(localDocument))
        return 1;
      f.add(localDocument);
    }
    try
    {
      int m = d(paramdz);
      return m;
    }
    finally
    {
      synchronized (f)
      {
        f.remove(localDocument);
      }
    }
    throw localObject3;
  }

  private static int c(dz paramdz)
  {
    String str = paramdz.k();
    if (str == null)
      return d(paramdz);
    File localFile = h.m.g(str);
    if (!localFile.exists())
      return d(paramdz);
    if (!localFile.canWrite())
    {
      a(localFile);
      return 0;
    }
    int m = 0;
    try
    {
      a(paramdz, localFile);
      m = 1;
    }
    catch (dj localdj)
    {
      com.zend.ide.util.a.b.a(localdj);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      a(localFile, paramdz.n());
    }
    catch (Exception localException)
    {
      b(localFile);
    }
    return m;
  }

  private static int d(dz paramdz)
  {
    bp localbp = f();
    String str1 = paramdz.k();
    File localFile1 = h.m.g(str1);
    bh localbh1 = bh.a();
    localbp.a(localbh1);
    localbp.setSelectedFile(localFile1);
    if (localFile1.exists())
      localbp.a(paramdz.n());
    localbp.setDialogTitle(ct.a(682) + " - " + str1);
    int m = -1;
    try
    {
      m = localbp.showSaveDialog(a());
    }
    catch (Exception localException1)
    {
      cl.a(localException1);
    }
    if (m != 0)
      return 0;
    File localFile2 = localbp.getSelectedFile();
    bh localbh2 = localbp.c();
    paramdz.a(localbh2);
    try
    {
      localFile2 = localFile2.getCanonicalFile();
    }
    catch (Exception localException2)
    {
    }
    String str2 = localFile2.getPath();
    boolean bool = localFile2.exists();
    if (h.m.p(str2))
      if (str2.equals(paramdz.k()))
      {
        if (bool)
          return c(paramdz);
        h.m.r(str2);
      }
      else
      {
        String str3 = h.m.q(str2);
        c(str3);
        return -1;
      }
    if ((bool) && (!localFile2.canWrite()))
    {
      a(localFile2);
      return 0;
    }
    try
    {
      a(paramdz, localFile2);
      return 1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      a(localFile2, paramdz.n());
      if ((!bool) && (localFile2.exists()))
        h.m.g(localFile2);
    }
    catch (CharConversionException localCharConversionException)
    {
      a(localFile2, paramdz.n());
      return -1;
    }
    catch (IOException localIOException)
    {
      a(localFile2.getAbsolutePath(), localIOException.getMessage());
      return -1;
    }
    catch (dj localdj)
    {
      throw localdj;
    }
    catch (Exception localException3)
    {
      cl.a(localException3);
      throw new dj(ct.a(252, localFile2.getPath()), localException3);
    }
    return 0;
  }

  private static void a(dz paramdz, File paramFile)
    throws IOException, BadLocationException
  {
    String str = ct.a(1199, paramFile.getAbsolutePath());
    f(str);
    try
    {
      b(paramdz, paramFile);
    }
    finally
    {
      g(str);
    }
  }

  private static void b(dz paramdz, File paramFile)
    throws IOException, BadLocationException
  {
    int m = 0;
    boolean bool = paramFile.exists();
    bh localbh = paramdz.n();
    if (!bh.a(localbh))
      throw new UnsupportedEncodingException();
    ho localho = (ho)paramdz.getDocument();
    String str1 = com.zend.ide.y.b.a("editing.lineEnding").c().toString();
    String str2 = (String)localho.getProperty("__EndOfLine__");
    if (str1.equals(ct.a(659)))
      str2 = "\r\n";
    else if (str1.equals(ct.a(660)))
      str2 = "\n";
    localho.putProperty("__EndOfLine__", str2);
    DefaultEditorKit localDefaultEditorKit = e();
    OutputStream localOutputStream = null;
    int n = 0;
    h localh = h.m;
    File localFile = (bool) && (m != 0) ? localh.g(paramFile.getAbsolutePath() + System.currentTimeMillis()) : paramFile;
    try
    {
      localho.a(false);
      r.b().a(paramdz);
      localOutputStream = localh.b(localFile, false);
      Object localObject1;
      if (localbh.equals(bh.a))
        localObject1 = new OutputStreamWriter(localOutputStream);
      else if (l)
        localObject1 = new ue(localOutputStream, localbh.c());
      else
        localObject1 = new OutputStreamWriter(localOutputStream, localbh.c());
      localDefaultEditorKit.write((Writer)localObject1, localho, 0, localho.getLength());
      n = 1;
    }
    finally
    {
      try
      {
        if (localOutputStream != null)
          localOutputStream.close();
      }
      catch (IOException localIOException)
      {
        cl.a(localIOException);
      }
      if (n != 0)
      {
        if (bool)
        {
          if (m != 0)
          {
            localh.c(paramFile, false);
            localh.a(localFile, paramFile, false);
          }
          localh.s(paramFile);
        }
        else
        {
          localh.r(paramFile);
        }
        localho.b(paramFile.getPath());
        localho.c(false);
        a(localho);
      }
      else if (m != 0)
      {
        if (bool)
          localh.c(localFile, false);
        else
          localh.c(paramFile, false);
      }
      localho.a(true);
    }
  }

  private static void a(ho paramho)
  {
    File localFile = h.m.g(paramho.k());
    long l1 = localFile.lastModified();
    paramho.putProperty("lastModified", new Long(l1));
  }

  private static void a(dz paramdz)
  {
    File localFile = h.m.g(paramdz.k());
    long l1 = localFile.lastModified();
    paramdz.getDocument().putProperty("lastModified", new Long(l1));
  }

  public static void b(dz paramdz)
  {
    InputStream localInputStream = null;
    try
    {
      File localFile = h.m.g(paramdz.k());
      localInputStream = h.m.f(localFile);
      a(paramdz, localInputStream);
      localInputStream.close();
    }
    catch (Exception localIOException2)
    {
      cl.a(localException);
    }
    finally
    {
      if (localInputStream != null)
        try
        {
          localInputStream.close();
        }
        catch (IOException localIOException3)
        {
        }
    }
  }

  private static void a(dz paramdz, InputStream paramInputStream, String paramString)
    throws IOException
  {
    if ((paramdz.k() == null) || (!paramdz.k().equals(paramString)))
      paramdz.b(paramString);
    a(paramdz, paramInputStream);
  }

  private static void a(dz paramdz, InputStream paramInputStream)
    throws IOException
  {
    String str1 = paramdz.k();
    String str2 = ct.a(1198, str1);
    f(str2);
    Document localDocument = paramdz.getDocument();
    ((ho)localDocument).g = true;
    ((ho)localDocument).a().e();
    try
    {
      if (paramInputStream != null)
      {
        localDocument.remove(0, localDocument.getLength());
        Object localObject1;
        if (paramdz.n().equals(bh.a))
          localObject1 = new InputStreamReader(paramInputStream);
        else if (l)
          localObject1 = new te(paramInputStream, paramdz.n().c());
        else
          localObject1 = new InputStreamReader(paramInputStream, paramdz.n().c());
        a((Reader)localObject1, localDocument);
        ((InputStreamReader)localObject1).close();
        paramdz.c(false);
      }
    }
    catch (BadLocationException localException2)
    {
    }
    finally
    {
      try
      {
        ((ho)localDocument).a().d();
        ((ho)localDocument).a().c();
      }
      catch (Exception localException3)
      {
        cl.a(localException3);
      }
      ((ho)localDocument).g = false;
      a(paramdz);
      g(str2);
    }
  }

  private static void a(Reader paramReader, Document paramDocument)
    throws IOException, BadLocationException
  {
    int m = 0;
    char[] arrayOfChar = new char[4096];
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int n;
    while ((n = paramReader.read(arrayOfChar, 0, arrayOfChar.length)) != -1)
    {
      StringBuffer localStringBuffer = new StringBuffer(4096);
      int i4 = 0;
      for (int i5 = 0; i5 < n; i5++)
        switch (arrayOfChar[i5])
        {
        case '\r':
          if (i1 != 0)
          {
            i3 = 1;
            if (i5 == 0)
            {
              localStringBuffer.append("\n");
              m++;
            }
            else
            {
              arrayOfChar[(i5 - 1)] = '\n';
            }
          }
          else
          {
            i1 = 1;
          }
          break;
        case '\n':
          if (i1 == 0)
            continue;
          if (i5 > i4 + 1)
          {
            localStringBuffer.append(arrayOfChar, i4, i5 - i4 - 1);
            m += i5 - i4 - 1;
          }
          i1 = 0;
          i4 = i5;
          i2 = 1;
          break;
        default:
          if (i1 == 0)
            continue;
          i3 = 1;
          if (i5 == 0)
          {
            localStringBuffer.append("\n");
            m++;
          }
          else
          {
            arrayOfChar[(i5 - 1)] = '\n';
          }
          i1 = 0;
        }
      if (i4 < n)
        if (i1 != 0)
        {
          if (i4 < n - 1)
          {
            localStringBuffer.append(arrayOfChar, i4, n - i4 - 1);
            m += n - i4 - 1;
          }
        }
        else
        {
          localStringBuffer.append(arrayOfChar, i4, n - i4);
          m += n - i4;
        }
      paramDocument.insertString(paramDocument.getLength(), localStringBuffer.toString(), null);
    }
    if (i1 != 0)
    {
      paramDocument.insertString(m, "\n", null);
      i3 = 1;
    }
    if (i2 != 0)
      paramDocument.putProperty("__EndOfLine__", "\r\n");
    else if (i3 != 0)
      paramDocument.putProperty("__EndOfLine__", "\r");
    else
      paramDocument.putProperty("__EndOfLine__", "\n");
  }

  private static final DefaultEditorKit e()
  {
    if (e == null)
      e = new DefaultEditorKit();
    return e;
  }

  public static boolean a(dz paramdz, String paramString, bh parambh)
  {
    File localFile = new File(paramString);
    InputStream localInputStream = null;
    try
    {
      localInputStream = h.m.f(paramString);
      com.zend.ide.r.d locald = p.e().a(localFile);
      int m;
      if (locald == null)
      {
        m = localFile.getName().lastIndexOf('.');
        String str = m == -1 ? "" : localFile.getName().substring(m + 1);
        boolean bool = p.a().a(str);
        if (!bool)
        {
          int i2 = 0;
          return i2;
        }
        locald = p.e().b(str);
      }
      int i1;
      if (locald.i())
        try
        {
          if ((locald.c()) && (!a(locald, paramString)))
          {
            m = 0;
            if (localInputStream != null)
              try
              {
                localInputStream.close();
              }
              catch (Exception localException2)
              {
              }
            return m;
          }
          if (locald.b() != 0)
          {
            a(locald, paramString, false);
            m = 0;
            if (localInputStream != null)
              try
              {
                localInputStream.close();
              }
              catch (Exception localException3)
              {
              }
            return m;
          }
        }
        catch (IOException localIOException2)
        {
          ba.a(a(), localIOException2.getMessage(), ct.a(94), -1, 0);
          i1 = 0;
          if (localInputStream != null)
            try
            {
              localInputStream.close();
            }
            catch (Exception localException7)
            {
            }
          return i1;
        }
      if (ab.a(paramString, localInputStream))
      {
        n = ba.b(com.zend.ide.bd.c.b().h(), ct.a(1307, paramString), ct.a(1308), 0);
        if (n == 1)
        {
          i1 = 0;
          return i1;
        }
      }
      if (!a(paramdz, paramString, parambh, localInputStream))
      {
        n = 0;
        return n;
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      if (localFile.exists())
        h(paramString);
      else
        e(paramString);
      n = 0;
      return n;
    }
    catch (IOException localIOException1)
    {
      cl.a(localIOException1);
      d(paramString);
      int n = 0;
      return n;
    }
    finally
    {
      if (localInputStream != null)
        try
        {
          localInputStream.close();
        }
        catch (Exception localException10)
        {
        }
    }
    return true;
  }

  private static boolean a(com.zend.ide.r.d paramd, String paramString)
    throws IOException
  {
    String str1 = new File(paramString).getName();
    String str2 = ct.a(1729, str1, paramd.b());
    ba localba = new ba(str2, 3, 2);
    lg locallg = new lg();
    locallg.a(paramd.a());
    z localz = new z(ct.a(1726));
    x localx = new x(ct.a(1730));
    localx.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 5));
    JPanel localJPanel1 = new JPanel(new BorderLayout(5, 5));
    localJPanel1.add(localz, "West");
    localJPanel1.add(locallg, "Center");
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(localJPanel1, "North");
    localJPanel2.add(localx, "South");
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(5, 50, 5, 5));
    localba.add(localJPanel2, 1);
    JDialog localJDialog = localba.createDialog(com.zend.ide.bd.c.b().h(), ct.a(1728));
    localx.setSelected(true);
    localba.setMessage(str2);
    localJDialog.setVisible(true);
    Object localObject1 = localba.getValue();
    if ((localObject1 != null) && ((localObject1 instanceof Integer)))
    {
      int m = ((Integer)localObject1).intValue();
      if (m == 0)
      {
        if (localx.isSelected())
        {
          paramd.e(false);
          paramd.a(locallg.getSelectedItem().equals(lg.b) ? 1 : 2);
          paramd.a(paramd.b() == 2 ? (String)locallg.getSelectedItem() : "");
        }
        if (!locallg.getSelectedItem().equals("Zend Studio"))
        {
          Object localObject2 = locallg.getSelectedItem();
          if (localObject2.equals(lg.b))
          {
            a(paramd, paramString, localObject2.equals(lg.b));
            return false;
          }
          b(paramString, (String)localObject2);
          return false;
        }
        paramd.a(0);
        paramd.a("");
        return true;
      }
    }
    return false;
  }

  private static void b(String paramString1, String paramString2)
    throws IOException
  {
    paramString1 = paramString1.indexOf(" ") != -1 ? "\"" + paramString1 + "\"" : paramString1;
    paramString2 = paramString2 + " " + paramString1;
    try
    {
      Runtime.getRuntime().exec(paramString2);
    }
    catch (IOException localIOException)
    {
      throw new IOException(ct.a(1790, paramString2));
    }
  }

  private static void a(com.zend.ide.r.d paramd, String paramString, boolean paramBoolean)
    throws IOException
  {
    String str;
    if (paramBoolean)
    {
      str = cr.b();
      str = str + " " + cr.a(paramString);
    }
    else
    {
      str = paramd.a();
      if ((str == null) || (str.length() == 0))
      {
        str = cr.b();
        str = str + " " + cr.a(paramString);
      }
      else
      {
        paramString = paramString.indexOf(" ") != -1 ? "\"" + paramString + "\"" : paramString;
        str = str + " " + paramString;
      }
    }
    try
    {
      Runtime.getRuntime().exec(str);
    }
    catch (IOException localIOException)
    {
      throw new IOException(ct.a(1790, str));
    }
  }

  public static final String c(String paramString)
  {
    try
    {
      File localFile = h.m.g(paramString);
      if (localFile.exists())
        paramString = localFile.getCanonicalPath();
    }
    catch (IOException localIOException)
    {
    }
    return paramString;
  }

  public static boolean a(dz paramdz, String paramString, bh parambh, InputStream paramInputStream)
  {
    paramdz.b(paramString);
    if (parambh != null)
      paramdz.a(parambh);
    if (paramInputStream != null)
      try
      {
        a(paramdz, paramInputStream, paramString);
        paramInputStream.close();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        a(paramdz.k(), paramdz.n());
        return false;
      }
      catch (CharConversionException localCharConversionException)
      {
        a(paramdz.k(), paramdz.n());
        return false;
      }
      catch (IOException localIOException)
      {
        d(paramdz.k());
        return false;
      }
    return true;
  }

  private static void c(String paramString)
  {
    String str = ct.a(251, paramString);
    JOptionPane.showMessageDialog(a(), str, ct.a(150), 0);
  }

  private static void a(String paramString1, String paramString2)
  {
    String str1 = "";
    if (paramString2 != null)
      if (k.matcher(paramString2).find())
        str1 = ct.a(250);
      else if (g.matcher(paramString2).find())
        str1 = ct.a(1446);
      else if (i.matcher(paramString2).find())
        str1 = ct.a(1448);
      else if (h.matcher(paramString2).find())
        str1 = ct.a(1447);
      else if (j.matcher(paramString2).find())
        str1 = ct.a(1449);
    String str2 = ct.a(1445, paramString1);
    String[] arrayOfString = { str2, str1 };
    JOptionPane.showMessageDialog(a(), arrayOfString, ct.a(150), 0);
  }

  private static void a(File paramFile, bh parambh)
  {
    String str = ct.a(445, paramFile.getPath(), parambh.toString());
    ba.a(a(), str, ct.a(462), -1, 0);
  }

  private static void a(File paramFile)
  {
    String str = ct.a(249, paramFile.getPath());
    ba.a(a(), str, ct.a(250), -1, 0);
  }

  private static void b(File paramFile)
  {
    String str = ct.a(1197, paramFile.getPath());
    ba.a(a(), str, ct.a(94), -1, 0);
  }

  private static void a(String paramString, bh parambh)
  {
    String str = ct.a(425, paramString, parambh.toString());
    ba.a(a(), str, ct.a(462), -1, 0);
  }

  private static void d(String paramString)
  {
    String str = ct.a(155, paramString);
    ba.a(a(), str, ct.a(156), -1, 0);
  }

  private static void e(String paramString)
  {
    String str = ct.a(1301, paramString);
    ba.a(a(), str, ct.a(94), -1, 0);
  }

  private static void h(String paramString)
  {
    ba.a(a(), ct.a(1438, paramString), ct.a(863), 2);
  }

  private static JFrame a()
  {
    return com.zend.ide.bd.c.b().c().b();
  }

  private static void f(String paramString)
  {
    com.zend.ide.bd.c.b().d().a(paramString);
  }

  private static void g(String paramString)
  {
    com.zend.ide.bd.c.b().d().b(paramString);
  }

  static bp a()
  {
    return c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.br
 * JD-Core Version:    0.6.0
 */