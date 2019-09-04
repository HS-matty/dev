package com.zend.ide.desktop.d;

import com.zend.ide.ba.h;
import com.zend.ide.n.bw;
import com.zend.ide.p.b.e;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.dj;
import com.zend.ide.y.b;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import javax.swing.AbstractAction;

class c extends AbstractAction
{
  final a a;

  public c(a parama)
  {
    super("AnalyzeEditorAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str1 = a.c(this.a).k();
    String str2 = str1;
    h localh = null;
    int i = 1;
    try
    {
      if ((!a.e(str1)) || (a.d(str1)))
      {
        String str3 = ((File)b.a("debugging.tempFilesLocation").c()).getAbsolutePath();
        File localFile = new File(str3 + File.separator + "analyzer.tmp");
        localFile.deleteOnExit();
        StringReader localStringReader = new StringReader(a.c(this.a).getText());
        str1 = localFile.getAbsolutePath();
        try
        {
          FileWriter localFileWriter = new FileWriter(str1);
          char[] arrayOfChar = new char[4096];
          int j;
          while ((j = localStringReader.read(arrayOfChar)) > 0)
            localFileWriter.write(arrayOfChar, 0, j);
          localFileWriter.close();
        }
        catch (IOException localIOException)
        {
          cl.a(localIOException);
        }
      }
      else if (a.c(this.a).l())
      {
        a.a(this.a, str1);
      }
      com.zend.ide.ba.a.a();
      com.zend.ide.p.b.f.a(a.e(this.a));
      a.f(this.a).a(ct.a(969, str1));
      a.d(this.a).d();
      localh = com.zend.ide.ba.a.a(str1);
      localh.a(str2);
    }
    catch (dj localdj)
    {
      i = 0;
      throw localdj;
    }
    finally
    {
      if (a.f(this.a) != null)
      {
        a.f(this.a).d();
        if (i != 0)
          a.a(this.a, localh);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.d.c
 * JD-Core Version:    0.6.0
 */