package com.zend.ide.o;

import com.zend.ide.bc.a;
import com.zend.ide.bd.c;
import com.zend.ide.g.n;
import com.zend.ide.j.h;
import com.zend.ide.n.gx;
import com.zend.ide.p.ba;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.Document;

class ac extends n
  implements fl
{
  protected StringBuffer l = new StringBuffer();
  final fp m;

  public ac(fp paramfp)
  {
    a.a(this.a, "DEBUG_OUTPUT_WINDOW");
  }

  public void a(String paramString)
  {
    this.l.append(paramString);
  }

  public String a()
  {
    return this.a.getText();
  }

  public void e()
  {
    super.e();
    this.l.setLength(0);
  }

  public void a(boolean paramBoolean)
  {
    try
    {
      if (paramBoolean)
        this.a.getDocument().insertString(0, this.l.toString(), null);
      else
        this.a.getDocument().remove(0, this.l.length());
    }
    catch (Exception localException)
    {
    }
  }

  public void f()
  {
    Document localDocument = this.a.getDocument();
    int i = localDocument.getLength();
    int j = 0;
    if (this.m.o())
    {
      j = this.l.length();
      if (j > i)
        j = i;
    }
    try
    {
      String str = localDocument.getText(j, localDocument.getLength() - j);
      boolean bool = a(str);
      StringReader localStringReader = new StringReader(str);
      File localFile = h.m.g(this.m.l.B());
      if (!localFile.exists())
      {
        ba.a(c.b().h(), ct.a(876, localFile.getAbsolutePath()), ct.a(94), 0);
        return;
      }
      if (localFile.isFile())
        localFile = localFile.getParentFile();
      a(localFile.getAbsolutePath(), localStringReader, bool);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public void a(String paramString, Reader paramReader, boolean paramBoolean)
    throws IOException
  {
    OutputStreamWriter localOutputStreamWriter = null;
    try
    {
      File localFile = new File(paramString + File.separator + "temp.html");
      localFile.deleteOnExit();
      String str = localFile.getPath();
      if (paramBoolean)
        localOutputStreamWriter = new OutputStreamWriter(new FileOutputStream(str), "UTF-8");
      else
        localOutputStreamWriter = new OutputStreamWriter(new FileOutputStream(str));
      char[] arrayOfChar = new char[4096];
      int i;
      while ((i = paramReader.read(arrayOfChar)) > 0)
        localOutputStreamWriter.write(arrayOfChar, 0, i);
      localOutputStreamWriter.close();
      c.b().e().a(str, true);
    }
    finally
    {
      if (localOutputStreamWriter != null)
        try
        {
          localOutputStreamWriter.close();
        }
        catch (Exception localException2)
        {
        }
    }
  }

  private boolean a(String paramString)
  {
    Matcher localMatcher1 = Pattern.compile("<HEAD>", 2).matcher(paramString);
    Matcher localMatcher2 = Pattern.compile("</HEAD>", 2).matcher(paramString);
    if (localMatcher1.find())
    {
      int i = localMatcher1.start();
      if (localMatcher2.find())
      {
        int j = localMatcher2.start();
        String str = paramString.substring(i, j);
        return Pattern.compile("UTF-8", 2).matcher(str).find();
      }
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.ac
 * JD-Core Version:    0.6.0
 */