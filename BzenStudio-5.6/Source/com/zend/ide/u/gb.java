package com.zend.ide.u;

import com.jscape.inet.ftp.Ftp;
import com.jscape.inet.ftp.FtpAdapter;
import com.jscape.inet.ftp.FtpConnectedEvent;
import com.jscape.inet.ftp.FtpDisconnectedEvent;
import com.jscape.inet.ftp.FtpException;
import com.jscape.inet.ftp.FtpFile;
import com.jscape.inet.ftp.FtpFileParser;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;

public class gb extends FtpAdapter
  implements lb
{
  Ftp a;
  private String[] b = { "noop", "REST 0", "pwd" };
  private int c = 0;

  public gb(String paramString1, String paramString2, String paramString3)
  {
    this.a = new Ftp(paramString1, paramString2, paramString3);
  }

  public void a(boolean paramBoolean)
  {
    this.a.setDebug(paramBoolean);
  }

  public void a(int paramInt)
  {
    this.a.setPort(paramInt);
  }

  public void b(boolean paramBoolean)
  {
    this.a.setPassive(paramBoolean);
  }

  public void b(int paramInt)
  {
    this.a.setTimeout(paramInt);
  }

  public void a()
    throws Exception
  {
    this.a.connect();
  }

  public void d(boolean paramBoolean)
  {
    this.a.setAuto(paramBoolean);
  }

  public String b()
    throws Exception
  {
    return this.a.getDir();
  }

  public void a(String paramString)
    throws Exception
  {
    this.a.setDir(paramString);
  }

  public void b(String paramString)
    throws Exception
  {
    this.a.makeDir(paramString);
  }

  public void c(String paramString)
    throws Exception
  {
    this.a.deleteDir(paramString);
  }

  public Enumeration c()
    throws Exception
  {
    return this.a.getDirListing();
  }

  public Enumeration d(String paramString)
    throws Exception
  {
    return this.a.getDirListing(paramString);
  }

  public void a(OutputStream paramOutputStream, String paramString)
    throws Exception
  {
    this.a.download(paramOutputStream, paramString);
  }

  public void a(byte[] paramArrayOfByte, String paramString)
    throws Exception
  {
    this.a.upload(paramArrayOfByte, paramString);
  }

  public long f(String paramString)
    throws Exception
  {
    return this.a.getFilesize(paramString);
  }

  public void a(String paramString1, String paramString2)
    throws Exception
  {
    this.a.renameFile(paramString1, paramString2);
  }

  public void g(String paramString)
    throws Exception
  {
    this.a.deleteFile(paramString);
  }

  public void d()
    throws Exception
  {
    this.a.disconnect();
  }

  public ArrayList a(Enumeration paramEnumeration)
  {
    ArrayList localArrayList = new ArrayList();
    while (paramEnumeration.hasMoreElements())
    {
      FtpFile localFtpFile = (FtpFile)paramEnumeration.nextElement();
      if ((!localFtpFile.getFilename().equals(".")) && (!localFtpFile.getFilename().equals("./")) && (!localFtpFile.getFilename().equals("..")) && (!localFtpFile.getFilename().equals("../")))
        localArrayList.add(localFtpFile);
    }
    return localArrayList;
  }

  public ArrayList b(Enumeration paramEnumeration)
  {
    ArrayList localArrayList = new ArrayList();
    while (paramEnumeration.hasMoreElements())
      localArrayList.add(((FtpFile)paramEnumeration.nextElement()).getFilename());
    return localArrayList;
  }

  public void c(int paramInt)
  {
  }

  public void connected(FtpConnectedEvent paramFtpConnectedEvent)
  {
  }

  public void disconnected(FtpDisconnectedEvent paramFtpDisconnectedEvent)
  {
  }

  public void f()
    throws FtpException
  {
    this.a.issueCommand(this.b[(this.c++ % 3)]);
  }

  public void c(boolean paramBoolean)
    throws Exception
  {
    this.a.connect(paramBoolean);
  }

  public String e(String paramString)
    throws Exception
  {
    return this.a.issueCommand(paramString);
  }

  public void e()
    throws Exception
  {
    this.a.login();
  }

  public void a(FtpFileParser paramFtpFileParser)
  {
    this.a.setFtpFileParser(paramFtpFileParser);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.gb
 * JD-Core Version:    0.6.0
 */