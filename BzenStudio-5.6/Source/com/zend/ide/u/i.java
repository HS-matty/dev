package com.zend.ide.u;

import com.jscape.inet.file.JFile;
import com.jscape.inet.ftp.FtpFile;
import com.jscape.inet.ftp.FtpFileParser;
import com.jscape.inet.ftp.NTParser;
import com.jscape.inet.ftp.UnixParser;
import com.jscape.inet.sftp.SftpException;
import com.jscape.inet.sftp.SftpFile;
import com.zend.ide.j.t;
import com.zend.ide.j.v;
import com.zend.ide.util.a.d;
import com.zend.ide.util.c.h;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.dj;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Locale;

public class i extends com.zend.ide.j.f
  implements bh, cu
{
  private static transient Hashtable k = new Hashtable(10);
  private transient Hashtable l = new Hashtable(100);
  p m = new p(this, null);
  private bi n;
  private String I;
  private String o;
  private String p;
  private boolean q = true;
  private boolean r = true;
  private boolean s = false;
  private transient String t = null;
  private int u = 21;
  private boolean v = true;
  private int w = 20;
  private String x;
  private int j;
  private int y;
  private Locale H = null;
  private String J = null;
  private static l A = new l();
  private transient ArrayList C;

  protected i()
  {
  }

  public i(bi parambi)
  {
    this();
    this.n = parambi;
    y();
  }

  private void a(i parami)
  {
    synchronized (k)
    {
      Object localObject1 = k.get(parami.c());
      if (localObject1 != null)
      {
        if (localObject1 != parami)
          throw new dj(parami.c() + ct.a(735));
        return;
      }
      k.put(parami.c(), parami);
    }
  }

  public v a()
  {
    return this.m;
  }

  public void f()
  {
    synchronized (this.n)
    {
      this.n.a(this.o, this.u);
      this.n.a(this.p, this.t);
      this.x = this.n.b();
      l(w());
      a(this);
    }
  }

  public void g()
  {
    e(false);
  }

  public void e(boolean paramBoolean)
  {
    this.n.b(paramBoolean);
  }

  public void h()
  {
    this.n.d();
  }

  public void o(File paramFile)
  {
    f localf = (f)paramFile;
    a(localf, true);
  }

  public String l()
  {
    return this.o;
  }

  public void a(String paramString)
  {
    if ((paramString != null) && (!paramString.endsWith(":")))
      paramString = paramString + ":";
    this.I = paramString;
  }

  public void i(String paramString)
  {
    this.o = paramString;
  }

  public String m()
  {
    return this.p;
  }

  public void j(String paramString)
  {
    this.p = paramString;
  }

  public String n()
  {
    return this.t;
  }

  public void k(String paramString)
  {
    this.t = paramString;
  }

  public int o()
  {
    return this.u;
  }

  public void a(int paramInt)
  {
    this.u = paramInt;
  }

  public void a(boolean paramBoolean)
  {
    this.v = paramBoolean;
    this.n.a(paramBoolean);
  }

  public boolean p()
  {
    return this.v;
  }

  public void b(int paramInt)
  {
    this.w = paramInt;
    this.n.a(paramInt);
  }

  public int q()
  {
    return this.w;
  }

  public void b(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }

  public boolean r()
  {
    return this.q;
  }

  public void c(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }

  public boolean s()
  {
    return this.r;
  }

  public String k()
  {
    return this.x;
  }

  public void h(String paramString)
  {
    this.x = paramString;
  }

  public String a()
  {
    return this.I;
  }

  public void d(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }

  public boolean t()
  {
    return this.s;
  }

  public int a()
  {
    return this.j;
  }

  public void c(int paramInt)
  {
    this.j = paramInt;
  }

  public int b()
  {
    return this.y;
  }

  public void d(int paramInt)
  {
    this.y = paramInt;
  }

  public void a(cm paramcm)
  {
    a(paramcm.a());
    i(paramcm.k());
    j(paramcm.b());
    k(paramcm.c());
    b(paramcm.h());
    c(paramcm.g());
    b(paramcm.e());
    a(paramcm.j());
    h(paramcm.d());
    d(paramcm.i());
    a(paramcm.f());
    c(paramcm.a());
    d(paramcm.b());
    this.n.a(paramcm);
  }

  public cm D()
  {
    return this.n.n();
  }

  public boolean i()
  {
    return this.n.i();
  }

  public char d()
  {
    return this.n.f();
  }

  public char a()
  {
    return this.n.g();
  }

  public bi v()
  {
    return this.n;
  }

  public String a(String paramString)
  {
    char c1 = this.n.f();
    char c2 = c1 == '\\' ? '/' : '\\';
    int i = b(paramString);
    StringBuffer localStringBuffer1 = new StringBuffer(paramString.length());
    if (i > 0)
      localStringBuffer1.append(paramString.substring(0, i));
    String str1 = paramString.substring(i);
    str1 = str1.replace(c2, c1);
    StringBuffer localStringBuffer2 = new StringBuffer(str1);
    String str2 = c1 + "" + c1;
    for (int i1 = localStringBuffer2.indexOf(str2); i1 != -1; i1 = localStringBuffer2.indexOf(str2))
      localStringBuffer2.deleteCharAt(i1);
    if ((localStringBuffer2.length() > 1) && (localStringBuffer2.charAt(localStringBuffer2.length() - 1) == c1))
      localStringBuffer2.deleteCharAt(localStringBuffer2.length() - 1);
    localStringBuffer1.append(localStringBuffer2);
    paramString = localStringBuffer1.toString();
    paramString = t.a(paramString);
    return paramString;
  }

  private String w()
  {
    if (this.J == null)
      this.J = d(this.x);
    return this.J;
  }

  public int b(String paramString)
  {
    int i = 0;
    String str = w();
    if (paramString.startsWith(str))
      i = str.length();
    return i;
  }

  public String c(String paramString1, String paramString2)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramString1.length() + paramString2.length() + 1);
    if (!paramString2.startsWith("" + d()))
    {
      localStringBuffer.append(paramString1);
      if (!paramString1.endsWith(d() + ""))
        localStringBuffer.append(d());
    }
    else
    {
      localStringBuffer.append(a());
    }
    localStringBuffer.append(paramString2);
    return localStringBuffer.toString();
  }

  public String e()
  {
    return this.n.e();
  }

  public String c(String paramString)
    throws IOException
  {
    if (paramString.equals(w()))
      return paramString;
    return super.c(paramString);
  }

  public boolean a(File paramFile)
  {
    boolean bool = o(paramFile.getPath());
    return bool;
  }

  public String b(File paramFile)
  {
    String str = d(paramFile.getPath());
    return str;
  }

  public boolean o(String paramString)
  {
    String str = w();
    boolean bool = paramString.startsWith(str);
    return bool;
  }

  public String d(String paramString)
  {
    paramString = paramString.trim();
    StringBuffer localStringBuffer = new StringBuffer(this.I.length() + this.x.length() + paramString.length() + 2);
    char c = this.n.f();
    if (!paramString.startsWith(this.I))
    {
      localStringBuffer.append(this.I);
      if ((!paramString.startsWith(c + "")) && (!paramString.equals(this.x)))
      {
        localStringBuffer.append(this.x);
        if (!this.x.endsWith(c + ""))
          localStringBuffer.append(c);
      }
    }
    localStringBuffer.append(paramString);
    if ((paramString.equals(this.x)) && (!this.x.endsWith(c + "")))
      localStringBuffer.append(c);
    return localStringBuffer.toString();
  }

  public boolean p(File paramFile)
  {
    if (!(paramFile instanceof f))
      return false;
    bh localbh = (cu)((f)paramFile).c();
    return localbh == this;
  }

  public int c(File paramFile)
  {
    if (!(paramFile instanceof f))
      throw new IllegalArgumentException("f must be an ftp file");
    f localf = (f)paramFile;
    int i = localf.h();
    if (i != -1)
      return i;
    try
    {
      a(localf, false);
      i = localf.h();
      if (i == -1)
        i = 0;
      return i;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  public boolean a(File paramFile, boolean paramBoolean)
  {
    return true;
  }

  public long d(File paramFile)
  {
    return 0L;
  }

  public long e(File paramFile)
  {
    try
    {
      f localf = (f)paramFile;
      if ((localf.i()) && (localf.f() > 0L))
        return localf.f();
      String str = u(paramFile.getPath());
      int i = this.n.f(str);
      localf.a(i);
      return i;
    }
    catch (bu localbu)
    {
    }
    return 0L;
  }

  public boolean e(String paramString)
    throws IOException
  {
    return c(paramString, true);
  }

  private boolean c(String paramString, boolean paramBoolean)
  {
    f localf1 = (f)g(paramString);
    if (localf1.exists())
      return false;
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(new byte[0]);
    paramString = u(paramString);
    this.n.a(localByteArrayInputStream, paramString, 0);
    localf1.a(3);
    f localf2 = (f)localf1.getParentFile();
    if ((localf2 != null) && (localf2.j()))
      localf2.b(localf1);
    if (paramBoolean)
      v(localf1);
    return true;
  }

  public boolean g(File paramFile)
  {
    return c(paramFile, true);
  }

  public boolean c(File paramFile, boolean paramBoolean)
  {
    try
    {
      String str = paramFile.getPath();
      try
      {
        str = c(str);
      }
      catch (Exception localException)
      {
      }
      str = u(str);
      if (paramFile.isDirectory())
        this.n.c(str);
      else
        this.n.g(str);
    }
    catch (dj localdj)
    {
      if (paramFile.isDirectory())
        throw new dj(ct.a(1024, paramFile.getPath()) + "\n" + localdj.getMessage());
      throw new dj(ct.a(747, paramFile.getPath()) + "\n" + localdj.getMessage());
    }
    f localf = (f)paramFile.getParentFile();
    if ((localf != null) && (localf.j()))
      localf.a(paramFile);
    ((f)paramFile).a(0);
    if (paramBoolean)
      w(paramFile);
    return true;
  }

  public boolean h(File paramFile)
  {
    return false;
  }

  public String[] i(File paramFile)
  {
    String[] arrayOfString = null;
    try
    {
      String str1 = u(paramFile.getPath());
      ArrayList localArrayList = this.n.e(str1);
      if (localArrayList != null)
      {
        arrayOfString = new String[localArrayList.size()];
        for (int i = 0; i < localArrayList.size(); i++)
        {
          String str2 = localArrayList.get(i).toString();
          File localFile = g(str2);
          arrayOfString[i] = localFile.getName();
        }
      }
    }
    catch (bu localbu)
    {
      return null;
    }
    return arrayOfString;
  }

  public boolean j(File paramFile)
  {
    try
    {
      String str = u(paramFile.getPath());
      this.n.b(str);
      f localf1 = (f)paramFile;
      localf1.a(5);
      f localf2 = (f)paramFile.getParentFile();
      if ((localf2 != null) && (localf2.j()))
        localf2.b(paramFile);
      v(paramFile);
      return true;
    }
    catch (bu localbu)
    {
    }
    return false;
  }

  public boolean a(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    if ((!(paramFile2 instanceof f)) || (paramFile2.exists()))
      return false;
    String str1 = u(paramFile1.getPath());
    if (!paramFile2.getPath().startsWith(w()))
      return false;
    String str2 = u(paramFile2.getPath());
    try
    {
      this.n.b(str1, str2);
    }
    catch (dj localdj)
    {
      throw new dj(ct.a(720, paramFile1.getPath()) + "\n" + localdj.getMessage());
    }
    f localf1 = (f)paramFile1;
    f localf2 = (f)paramFile2;
    localf2.a(localf1.h());
    f localf3 = (f)paramFile1.getParentFile();
    f localf4 = (f)paramFile2.getParentFile();
    if ((localf3 != null) && (localf3.j()))
      localf3.a(paramFile1);
    if ((localf4 != null) && (localf4.j()))
      localf4.b(paramFile2);
    this.l.remove(paramFile1.getAbsolutePath());
    if (paramBoolean)
      d(paramFile1, paramFile2);
    return true;
  }

  public boolean a(File paramFile, long paramLong)
  {
    return false;
  }

  public boolean k(File paramFile)
  {
    return false;
  }

  protected c t(String paramString)
  {
    return new c(this, paramString);
  }

  public boolean a(String paramString)
  {
    if (super.a(paramString))
      return true;
    int i = d();
    if (paramString.indexOf(i) != -1)
    {
      String str = paramString.substring(0, paramString.indexOf(i));
      if (str.equals(a()))
        return true;
    }
    return false;
  }

  public File[] b()
  {
    String str = k();
    if (str == null)
      return new File[0];
    Object localObject = v(str);
    if (localObject == null)
    {
      localObject = t(str);
      r((File)localObject);
    }
    return (File)new File[] { localObject };
  }

  private String u(String paramString)
  {
    paramString = d(paramString);
    String str1 = w();
    if (!paramString.equals(str1))
    {
      if ((paramString.startsWith(str1)) && (paramString.length() >= str1.length()))
      {
        paramString = paramString.substring(str1.length());
      }
      else
      {
        String str2 = a();
        if ((paramString.startsWith(str2)) && (paramString.length() >= str2.length()))
        {
          paramString = paramString.substring(str2.length());
        }
        else
        {
          paramString = "";
          cl.a("Drive path (" + str1 + ")  or Drive name (" + str2 + ") does not match path(" + paramString + ")");
        }
      }
    }
    else
      paramString = "";
    return paramString;
  }

  public InputStream f(String paramString)
    throws IOException
  {
    paramString = u(paramString);
    return this.n.h(paramString);
  }

  public OutputStream a(String paramString, boolean paramBoolean)
    throws IOException
  {
    paramString = u(paramString);
    c(paramString, false);
    return new m(this, paramString, null);
  }

  public InputStream f(File paramFile)
    throws IOException
  {
    return f(paramFile.getPath());
  }

  public OutputStream b(File paramFile, boolean paramBoolean)
    throws IOException
  {
    return a(paramFile.getPath(), paramBoolean);
  }

  private File v(String paramString)
  {
    String str = d(a(paramString));
    File localFile = (File)this.l.get(str);
    return localFile;
  }

  private void r(File paramFile)
  {
    String str = paramFile.getAbsolutePath();
    this.l.put(str, paramFile);
  }

  protected f b(String paramString, int paramInt)
  {
    f localf = new f(this, paramString, paramInt);
    return localf;
  }

  public File a(String paramString, int paramInt)
  {
    paramString = a(paramString);
    Object localObject = v(paramString);
    if (localObject == null)
    {
      localObject = b(paramString, paramInt);
      r((File)localObject);
    }
    return (File)localObject;
  }

  public File g(String paramString)
  {
    int i = b(paramString);
    File localFile = a(paramString, i);
    return localFile;
  }

  public File a(File paramFile, String paramString)
  {
    File localFile = a(paramFile.getAbsolutePath(), paramString);
    return localFile;
  }

  public File a(String paramString1, String paramString2)
  {
    String str = c(paramString1, paramString2);
    File localFile = g(str);
    return localFile;
  }

  static bh w(String paramString)
  {
    Object localObject = (cu)k.get(paramString);
    if (localObject == null)
      localObject = A;
    return (cu)localObject;
  }

  public static bh a()
  {
    return A;
  }

  public int l(File paramFile)
  {
    return paramFile.getAbsolutePath().hashCode();
  }

  public void E()
  {
    String str = w();
    l(str);
    a(this);
    c localc = new c(this, str);
    r(localc);
    if (s())
    {
      d locald = new d(new bp(this));
      com.zend.ide.util.c.f localf = h.c().b(locald);
      localf.h();
    }
    y();
  }

  private void y()
  {
    this.n.a(new cg(this));
  }

  private void G()
  {
    if (this.C == null)
      return;
    synchronized (this.C)
    {
      Iterator localIterator = this.C.iterator();
      while (localIterator.hasNext())
        ((ch)localIterator.next()).a(this);
    }
  }

  private void g(boolean paramBoolean)
  {
    if (this.C == null)
      return;
    synchronized (this.C)
    {
      Iterator localIterator = this.C.iterator();
      while (localIterator.hasNext())
        ((ch)localIterator.next()).a(this, paramBoolean);
    }
  }

  public void a(ch paramch)
  {
    if (this.C == null)
      this.C = new ArrayList(2);
    if (!this.C.contains(paramch))
      this.C.add(paramch);
  }

  public void b(ch paramch)
  {
    if (this.C == null)
      return;
    this.C.remove(paramch);
  }

  synchronized void a(f paramf, boolean paramBoolean)
  {
    String str = paramf.getPath();
    try
    {
      str = c(str);
    }
    catch (Exception localException)
    {
    }
    str = u(str);
    if (paramf.e())
      return;
    o localo = a(paramf, str);
    paramf.a(localo);
    o[] arrayOfo = localo.g;
    if ((arrayOfo == null) || (paramf.isFile()))
    {
      paramf.k();
      return;
    }
    paramf.b(arrayOfo.length);
    paramf.a(arrayOfo);
    if (!paramBoolean)
      return;
    File[] arrayOfFile = paramf.listFiles();
    if (arrayOfFile == null)
      return;
    for (int i = 0; i < arrayOfFile.length; i++)
    {
      f localf1 = (f)arrayOfFile[i];
      if (!localf1.e())
        continue;
      f localf2 = localf1.g();
      if (localf2.i())
        continue;
      a(localf2, false);
    }
  }

  private o a(f paramf, String paramString)
  {
    ArrayList localArrayList1 = this.n.a(paramString);
    o localo1 = new o();
    if (localArrayList1 == null)
    {
      localo1 = new o(paramString);
      localo1.d |= 2;
      o localo2 = b(paramf, paramString);
      if (localo2 == null)
        localo2 = localo1;
      return localo2;
    }
    int i = localArrayList1.size();
    int i1 = (paramf.i()) && (paramf.isDirectory()) ? 1 : 0;
    if (i == 0)
    {
      if (i1 != 0)
      {
        localo1.d |= 1;
        localo1.d |= 4;
        localo1.g = new o[0];
      }
      return localo1;
    }
    Object localObject1;
    o localo3;
    if (i == 1)
    {
      localObject1 = localArrayList1.get(0);
      Object localObject2;
      boolean bool;
      String str;
      if ((localObject1 instanceof FtpFile))
      {
        localObject2 = (FtpFile)localObject1;
        bool = ((FtpFile)localObject2).isDirectory();
        str = ((FtpFile)localObject2).getFilename();
        localo3 = a((FtpFile)localObject2);
      }
      else
      {
        localObject2 = (SftpFile)localObject1;
        try
        {
          bool = ((SftpFile)localObject2).isDirectory();
        }
        catch (SftpException localSftpException)
        {
          return null;
        }
        str = ((SftpFile)localObject2).getFilename();
        localo3 = a((SftpFile)localObject2);
      }
      try
      {
        if (localo3 != null)
        {
          if ((!bool) && ((!str.endsWith(paramf.getName())) || (i1 != 0)))
            bool = true;
          if (bool)
          {
            localo1.d |= 1;
            localo1.d |= 4;
            localo1.g = new o[] { localo3 };
            return localo1;
          }
          return localo3;
        }
        return null;
      }
      catch (RuntimeException localRuntimeException1)
      {
        return null;
      }
    }
    localo1.d |= 1;
    localo1.d |= 4;
    ArrayList localArrayList2 = new ArrayList();
    for (int i2 = 0; i2 < i; i2++)
    {
      localObject1 = localArrayList1.get(i2);
      Object localObject3;
      if ((localObject1 instanceof FtpFile))
      {
        localObject3 = (FtpFile)localObject1;
        localo3 = a((FtpFile)localObject3);
      }
      else
      {
        localObject3 = (SftpFile)localObject1;
        localo3 = a((SftpFile)localObject3);
      }
      try
      {
        if (localo3 != null)
          localArrayList2.add(localo3);
        else
          return null;
      }
      catch (RuntimeException localRuntimeException2)
      {
        return null;
      }
    }
    o[] arrayOfo = new o[localArrayList2.size()];
    localArrayList2.toArray(arrayOfo);
    localo1.g = arrayOfo;
    return (o)(o)localo1;
  }

  private o b(f paramf, String paramString)
  {
    int i = this.n.f();
    String str = "";
    if (paramString.lastIndexOf(i) != -1)
      str = paramString.substring(0, paramString.lastIndexOf(i));
    ArrayList localArrayList = this.n.a(str);
    if (localArrayList == null)
      return null;
    for (int i1 = 0; i1 < localArrayList.size(); i1++)
    {
      Object localObject1 = localArrayList.get(i1);
      Object localObject2;
      if ((localObject1 instanceof FtpFile))
      {
        localObject2 = (FtpFile)localObject1;
        if (((FtpFile)localObject2).getFilename().equals(paramf.getName()))
          return a((FtpFile)localObject2);
      }
      else
      {
        localObject2 = (SftpFile)localObject1;
        if (((SftpFile)localObject2).getFilename().equals(paramf.getName()))
          return a((SftpFile)localObject2);
      }
    }
    return (o)null;
  }

  private o a(FtpFile paramFtpFile)
  {
    String str1 = paramFtpFile.getFilename();
    String str2 = paramFtpFile.getLinkTarget();
    long l1 = paramFtpFile.getFilesize();
    int i = 1;
    if (paramFtpFile.isDirectory())
      i |= 4;
    else if (!paramFtpFile.isLink())
      i |= 2;
    Date localDate = null;
    FtpFileParser localFtpFileParser = paramFtpFile.getFtpFileParser();
    long l2 = 0L;
    if (this.H == null)
      this.H = a(localFtpFileParser, paramFtpFile);
    try
    {
      if ((localFtpFileParser instanceof NTParser))
        localDate = ((NTParser)localFtpFileParser).getDateTime(paramFtpFile, null, this.H);
      else if ((localFtpFileParser instanceof UnixParser))
        localDate = ((UnixParser)localFtpFileParser).getDateTime(paramFtpFile, null, this.H);
      if (localDate != null)
        l2 = localDate.getTime();
    }
    catch (ParseException localParseException)
    {
      cl.a("FTP Parser Error (" + paramFtpFile.getFilename() + "):" + localParseException.getMessage());
    }
    return new o(str1, str2, i, l1, l2);
  }

  private o a(SftpFile paramSftpFile)
  {
    try
    {
      String str1 = paramSftpFile.getFilename();
      String str2 = null;
      int i = 1;
      if (paramSftpFile.isDirectory())
        i |= 4;
      else
        try
        {
          JFile localJFile = paramSftpFile.getLinkTarget();
          if (localJFile != null)
            str2 = localJFile.getPath();
        }
        catch (Exception localException)
        {
          i |= 2;
        }
      long l1 = paramSftpFile.getFilesize();
      Date localDate = paramSftpFile.getDate();
      long l2 = localDate.getTime();
      return new o(str1, str2, i, l1, l2);
    }
    catch (SftpException localSftpException)
    {
      cl.a(localSftpException);
    }
    return null;
  }

  private Locale a(FtpFileParser paramFtpFileParser, FtpFile paramFtpFile)
  {
    Locale localLocale = null;
    z localz = new z(this, paramFtpFileParser);
    try
    {
      localz.a(paramFtpFile, null, Locale.US);
      localLocale = Locale.US;
    }
    catch (ParseException localParseException1)
    {
      try
      {
        localz.a(paramFtpFile, null, Locale.GERMAN);
        localLocale = Locale.GERMAN;
      }
      catch (ParseException localParseException2)
      {
        try
        {
          localz.a(paramFtpFile, null, Locale.FRENCH);
          localLocale = Locale.FRENCH;
        }
        catch (ParseException localParseException3)
        {
          try
          {
            localz.a(paramFtpFile, null, Locale.JAPANESE);
            localLocale = Locale.JAPANESE;
          }
          catch (ParseException localParseException4)
          {
            try
            {
              localz.a(paramFtpFile, null, Locale.CHINESE);
              localLocale = Locale.CHINESE;
            }
            catch (ParseException localParseException5)
            {
            }
          }
        }
      }
    }
    return localLocale;
  }

  static Hashtable B()
  {
    return k;
  }

  static Hashtable a(i parami)
  {
    return parami.l;
  }

  static void b(i parami)
  {
    parami.G();
  }

  static void a(i parami, boolean paramBoolean)
  {
    parami.g(paramBoolean);
  }

  static bi c(i parami)
  {
    return parami.n;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.i
 * JD-Core Version:    0.6.0
 */