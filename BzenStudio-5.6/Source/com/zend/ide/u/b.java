package com.zend.ide.u;

import com.jscape.inet.ftp.FtpException;
import com.jscape.inet.ftp.UnixParser;
import com.jscape.inet.sftp.SftpException;
import com.jscape.inet.ssh.util.SshParameters;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.dj;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.StringTokenizer;

public class b
  implements bi, cu
{
  private String B;
  private String a;
  private String b;
  private String c;
  private String d;
  private int e = 21;
  private int f = 30;
  private boolean g = true;
  private char h = '/';
  private char i = ':';
  private int k = 0;
  private boolean l = false;
  private lb j;
  private int m;
  private int n;
  private f x;
  private PropertyChangeListener y;
  private e z;
  private boolean A = false;
  private v s = new v(this, null);
  private cm t;
  private transient ArrayList u;

  public b()
  {
    p();
  }

  private void p()
  {
    this.x = new f();
    this.y = new ba(this, null);
    this.z = new e(this.x);
    this.x.a("desktop.showHiddenFiles", this.y);
    this.z.a("desktop.showHiddenFiles");
  }

  public void a(cm paramcm)
  {
    this.t = paramcm;
    this.B = paramcm.a();
    this.a = paramcm.k();
    this.b = paramcm.b();
    this.c = paramcm.c();
    this.d = paramcm.d();
    this.e = paramcm.j();
    this.f = paramcm.e();
    this.g = paramcm.f();
    this.m = paramcm.a();
    this.n = paramcm.b();
  }

  public cm n()
  {
    if (this.t == null)
      this.t = new cm();
    this.t.h(this.B);
    this.t.a(this.a);
    this.t.b(this.b);
    this.t.c(this.c);
    this.t.d(this.d);
    this.t.b(this.e);
    this.t.a(this.f);
    this.t.a(this.g);
    this.t.c(this.m);
    this.t.d(this.n);
    return this.t;
  }

  private void j()
  {
    d(this.a);
  }

  public void a(String paramString, int paramInt)
  {
    d(paramString);
  }

  public void d(String paramString)
  {
    if ((this.c == null) || (this.c.trim().equals("")))
    {
      this.k = 0;
      throw new dj(ct.a(198));
    }
    this.k = 2;
    switch (this.m)
    {
    case 1:
      SshParameters localSshParameters = new SshParameters(paramString, this.e, this.b, this.c);
      this.j = new ib(localSshParameters);
      break;
    case 2:
      this.j = new hb(this.a, this.b, this.c);
      break;
    default:
      this.j = new gb(this.a, this.b, this.c);
    }
    this.j.a(System.getProperty("ftpDebug") != null);
    this.j.a(this.e);
    this.j.b(this.g);
    this.j.c(this.n);
    this.j.b(this.f * 1000);
  }

  private void k()
  {
    a(this.b, this.c);
  }

  public void a(String paramString1, String paramString2)
  {
    if (this.j == null)
      j();
    try
    {
      synchronized (this.j)
      {
        if (this.m != 1)
        {
          this.j.c(false);
          a();
          this.j.e();
        }
        else
        {
          this.j.a();
        }
        this.j.d(true);
        if ((this.d != null) && (!this.d.trim().equals("")))
          j(this.d);
        this.d = b();
        this.b = paramString1;
        this.c = paramString2;
        v.a(this.s);
        m();
        this.k = 1;
      }
    }
    catch (FtpException localFtpException)
    {
      throw a(localFtpException);
    }
    catch (SftpException localSftpException)
    {
      throw a(localSftpException);
    }
    catch (Exception localException)
    {
      throw a(null);
    }
  }

  private void a()
    throws Exception
  {
    String str1 = this.j.e("SYST");
    StringTokenizer localStringTokenizer = new StringTokenizer(str1);
    localStringTokenizer.nextToken();
    String str2 = localStringTokenizer.nextToken();
    if (str2.equalsIgnoreCase("OS/400"))
      try
      {
        String str3 = this.j.e("stat");
        BufferedReader localBufferedReader = new BufferedReader(new StringReader(str3));
        localBufferedReader.readLine();
        String str4 = localBufferedReader.readLine();
        String[] arrayOfString = str4.split(" ");
        int i1 = arrayOfString[3].charAt(0);
        if (i1 == 49)
          this.j.a(new UnixParser());
      }
      catch (Exception localException)
      {
      }
  }

  public String b()
  {
    try
    {
      synchronized (this.j)
      {
        this.k = 2;
        String str = this.j.b();
        this.k = 1;
        return str;
      }
    }
    catch (FtpException localFtpException)
    {
      throw a(localFtpException);
    }
    catch (SftpException localSftpException)
    {
      throw a(localSftpException);
    }
    catch (Exception localException)
    {
    }
    throw a(null);
  }

  public void j(String paramString)
  {
    try
    {
      synchronized (this.j)
      {
        this.k = 2;
        this.j.a(paramString);
        this.k = 1;
      }
    }
    catch (FtpException localFtpException)
    {
      throw a(localFtpException);
    }
    catch (SftpException localSftpException)
    {
      throw a(localSftpException);
    }
    catch (Exception localException)
    {
      throw a(null);
    }
  }

  public String b(String paramString)
  {
    try
    {
      synchronized (this.j)
      {
        this.k = 2;
        this.j.b(paramString);
        this.k = 1;
      }
    }
    catch (FtpException localFtpException)
    {
      throw a(localFtpException);
    }
    catch (SftpException localSftpException)
    {
      throw a(localSftpException);
    }
    catch (Exception localException)
    {
      throw a(null);
    }
    return paramString;
  }

  public void c(String paramString)
  {
    try
    {
      if (this.k == 0)
        k();
      if (h())
        synchronized (this.j)
        {
          this.k = 2;
          this.j.c(paramString);
          this.k = 1;
        }
    }
    catch (FtpException localFtpException)
    {
      throw a(localFtpException);
    }
    catch (SftpException localSftpException)
    {
      throw a(localSftpException);
    }
    catch (Exception localException)
    {
      throw a(null);
    }
  }

  public ArrayList a(String paramString)
  {
    String str1 = a(paramString);
    try
    {
      if (this.k == 0)
        k();
      if (h())
        synchronized (this.j)
        {
          this.k = 2;
          Enumeration localEnumeration = null;
          try
          {
            this.j.a(str1);
            if ((this.m != 1) && (this.A))
              localEnumeration = this.j.d("-a");
            else
              localEnumeration = this.j.c();
          }
          catch (Exception localException2)
          {
            String str2 = localException2.getMessage();
            if ((str2 != null) && (str2.startsWith("550  Path does not exist: -a")))
              localEnumeration = this.j.c();
            else
              throw localException2;
          }
          finally
          {
            this.j.a(this.d);
          }
          this.k = 1;
          return this.j.a(localEnumeration);
        }
      return null;
    }
    catch (FtpException localFtpException)
    {
      return null;
    }
    catch (SftpException localSftpException)
    {
      return null;
    }
    catch (Exception localException1)
    {
    }
    throw a(localException1);
  }

  public ArrayList e(String paramString)
  {
    try
    {
      synchronized (this.j)
      {
        this.k = 2;
        Enumeration localEnumeration = this.j.c();
        this.k = 1;
        return this.j.b(localEnumeration);
      }
    }
    catch (FtpException localFtpException)
    {
      throw a(localFtpException);
    }
    catch (SftpException localSftpException)
    {
      throw a(localSftpException);
    }
    catch (Exception localException)
    {
    }
    throw a(null);
  }

  public void a(InputStream paramInputStream, String paramString, int paramInt)
  {
    try
    {
      synchronized (this.j)
      {
        this.k = 2;
        OutputStream localOutputStream = i(paramString);
        byte[] arrayOfByte = new byte[100];
        int i1;
        while ((i1 = paramInputStream.read(arrayOfByte)) != -1)
          localOutputStream.write(arrayOfByte, 0, i1);
        localOutputStream.flush();
        localOutputStream.close();
        this.k = 1;
      }
    }
    catch (IOException localIOException)
    {
      throw a(localIOException);
    }
  }

  public int f(String paramString)
  {
    int i1;
    try
    {
      synchronized (this.j)
      {
        this.k = 2;
        i1 = (int)this.j.f(paramString);
        this.k = 1;
      }
    }
    catch (FtpException localFtpException)
    {
      throw a(localFtpException);
    }
    catch (SftpException localSftpException)
    {
      throw a(localSftpException);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      return 0;
    }
    catch (Exception localException)
    {
      throw a(null);
    }
    return i1;
  }

  public void b(String paramString1, String paramString2)
  {
    try
    {
      synchronized (this.j)
      {
        this.k = 2;
        this.j.a(paramString1, paramString2);
        this.k = 1;
      }
    }
    catch (FtpException localFtpException)
    {
      throw a(localFtpException);
    }
    catch (SftpException localSftpException)
    {
      throw a(localSftpException);
    }
    catch (Exception localException)
    {
      throw a(null);
    }
  }

  public void g(String paramString)
  {
    try
    {
      if (this.k == 0)
        k();
      if (h())
        synchronized (this.j)
        {
          this.k = 2;
          this.j.g(paramString);
          this.k = 1;
        }
    }
    catch (FtpException localFtpException)
    {
      throw a(localFtpException);
    }
    catch (SftpException localSftpException)
    {
      throw a(localSftpException);
    }
    catch (Exception localException)
    {
      throw a(null);
    }
  }

  public void b(boolean paramBoolean)
  {
    this.k = 0;
    this.l = false;
    com.zend.ide.util.c.h.c().a(new u(this, paramBoolean));
  }

  public void d()
  {
    this.k = 0;
    this.l = true;
  }

  public String e()
  {
    return this.d;
  }

  public char f()
  {
    return this.h;
  }

  public char g()
  {
    return this.i;
  }

  public InputStream h(String paramString)
    throws IOException
  {
    try
    {
      return new g(this, this.j, paramString, null);
    }
    catch (Exception localException)
    {
    }
    throw a(localException);
  }

  public OutputStream i(String paramString)
    throws IOException
  {
    try
    {
      return new h(this, this.j, paramString, null);
    }
    catch (Exception localException)
    {
    }
    throw a(localException);
  }

  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public void a(int paramInt)
  {
    this.f = paramInt;
  }

  public boolean h()
  {
    try
    {
      synchronized (this.j)
      {
        this.j.f();
      }
      return i();
    }
    catch (Exception localException1)
    {
      try
      {
        b(false);
      }
      catch (Exception localException2)
      {
      }
    }
    return false;
  }

  public boolean i()
  {
    return (this.k == 1) || (this.k == 2);
  }

  public void a(ci paramci)
  {
    if (this.u == null)
      this.u = new ArrayList(2);
    if (!this.u.contains(paramci))
      this.u.add(paramci);
  }

  private String a(String paramString)
  {
    if (!paramString.startsWith(f() + ""))
      return this.d + this.h + paramString;
    return paramString;
  }

  private RuntimeException a(Exception paramException)
    throws RuntimeException
  {
    if (!h())
    {
      this.k = 0;
      this.s.c();
      o();
    }
    Exception localException = null;
    if ((paramException != null) && ((paramException instanceof FtpException)))
      localException = ((FtpException)paramException).getException();
    String str = paramException == null ? "" : paramException.getMessage();
    if ((str == null) || (str.equals("")))
      str = ct.a(185);
    Object localObject;
    if (this.l)
    {
      localObject = new bt(this.a);
      this.l = false;
    }
    else if ((str.indexOf("Channel open failure") != -1) || ((localException != null) && ((localException instanceof UnknownHostException))))
    {
      localObject = new dj(ct.a(94), ct.a(185) + this.a, null);
    }
    else
    {
      localObject = new dj(ct.a(94), ct.a(1444) + " (" + this.a + "): " + str, null);
    }
    return (RuntimeException)localObject;
  }

  private void m()
  {
    if (this.u == null)
      return;
    synchronized (this.u)
    {
      Iterator localIterator = this.u.iterator();
      while (localIterator.hasNext())
        ((ci)localIterator.next()).a();
    }
  }

  private void o()
  {
    c(false);
  }

  private void c(boolean paramBoolean)
  {
    if (this.u == null)
      return;
    synchronized (this.u)
    {
      Iterator localIterator = this.u.iterator();
      while (localIterator.hasNext())
        ((ci)localIterator.next()).a(paramBoolean);
    }
  }

  static lb a(b paramb)
  {
    return paramb.j;
  }

  static v a(b paramb)
  {
    return paramb.s;
  }

  static void a(b paramb, boolean paramBoolean)
  {
    paramb.c(paramBoolean);
  }

  static int d(b paramb)
  {
    return paramb.k;
  }

  static void c(b paramb)
  {
    paramb.k();
  }

  static String a(b paramb, String paramString)
  {
    return paramb.a(paramString);
  }

  static RuntimeException a(b paramb, Exception paramException)
    throws RuntimeException
  {
    return paramb.a(paramException);
  }

  static boolean a(b paramb, boolean paramBoolean)
  {
    return paramb.A = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.b
 * JD-Core Version:    0.6.0
 */