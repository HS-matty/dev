package com.zend.ide.u;

import com.jscape.inet.ftp.FtpFileParser;
import com.jscape.inet.sftp.Sftp;
import com.jscape.inet.sftp.SftpException;
import com.jscape.inet.sftp.SftpFile;
import com.jscape.inet.sftp.events.SftpAdapter;
import com.jscape.inet.sftp.events.SftpConnectedEvent;
import com.jscape.inet.sftp.events.SftpDisconnectedEvent;
import com.jscape.inet.ssh.util.SshParameters;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;

public class ib extends SftpAdapter
  implements lb
{
  Sftp a;

  public ib(SshParameters paramSshParameters)
  {
    this.a = new Sftp(paramSshParameters);
  }

  public void a(boolean paramBoolean)
  {
    this.a.setDebug(paramBoolean);
  }

  public void a(int paramInt)
  {
  }

  public void b(boolean paramBoolean)
  {
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
    throws Exception
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
      SftpFile localSftpFile = (SftpFile)paramEnumeration.nextElement();
      if ((!localSftpFile.getFilename().equals(".")) && (!localSftpFile.getFilename().equals("./")) && (!localSftpFile.getFilename().equals("..")) && (!localSftpFile.getFilename().equals("../")))
        localArrayList.add(localSftpFile);
    }
    return localArrayList;
  }

  public ArrayList b(Enumeration paramEnumeration)
  {
    ArrayList localArrayList = new ArrayList();
    while (paramEnumeration.hasMoreElements())
      localArrayList.add(((SftpFile)paramEnumeration.nextElement()).getFilename());
    return localArrayList;
  }

  public void c(int paramInt)
  {
  }

  public void connected(SftpConnectedEvent paramSftpConnectedEvent)
  {
  }

  public void disconnected(SftpDisconnectedEvent paramSftpDisconnectedEvent)
  {
  }

  public void f()
    throws SftpException
  {
    this.a.getDirListing("ping");
  }

  public void c(boolean paramBoolean)
    throws Exception
  {
    throw new Exception("SFTP doesn't support connect(boolean)");
  }

  public String e(String paramString)
    throws Exception
  {
    throw new Exception("SFTP doesn't support issueCommand()");
  }

  public void e()
    throws Exception
  {
    throw new Exception("SFTP doesn't support login()");
  }

  public void a(FtpFileParser paramFtpFileParser)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.ib
 * JD-Core Version:    0.6.0
 */