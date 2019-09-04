package com.zend.ide.u;

import com.zend.ide.j.u;
import com.zend.ide.p.d.bj;
import com.zend.ide.p.d.g;
import com.zend.ide.util.cv;
import java.io.File;
import javax.swing.Icon;

public class cb extends bj
{
  protected static final Icon t = cv.b("explorer/linkfile16.gif");
  protected static final Icon u = cv.b("explorer/closedlinkfolder16.gif");

  public cb(u paramu, g paramg)
  {
    super(paramu, paramg);
  }

  public Boolean isTraversable(File paramFile)
  {
    f localf = (f)paramFile;
    return Boolean.valueOf((localf.isDirectory()) || (localf.e()));
  }

  public String getSystemTypeDescription(File paramFile)
  {
    return super.getSystemTypeDescription(paramFile);
  }

  public String getSystemDisplayName(File paramFile)
  {
    f localf = (f)paramFile;
    String str = localf.getName();
    if (isFileSystemRoot(localf))
      str = localf.i;
    if (localf.e())
      str = str + " -> " + localf.d();
    return str;
  }

  public boolean isFileSystemRoot(File paramFile)
  {
    return this.p.m(paramFile);
  }

  protected Icon c(Object paramObject, File paramFile)
  {
    f localf1 = (f)paramFile;
    Icon localIcon = null;
    if (localf1.e())
    {
      f localf2 = localf1.g();
      if (localf2.isFile())
        localIcon = t;
      else
        localIcon = u;
    }
    if (localIcon == null)
      localIcon = a(paramFile);
    if (localIcon == null)
      localIcon = d;
    return new bo(localf1, localIcon);
  }

  public boolean isComputerNode(File paramFile)
  {
    return isFileSystemRoot(paramFile);
  }

  public Icon b(File paramFile, boolean paramBoolean)
  {
    Icon localIcon = c(paramFile);
    if (localIcon != null)
      return new bo((f)paramFile, localIcon);
    Object localObject = a(paramFile, paramBoolean);
    return d(localObject, paramFile);
  }

  public Object a(File paramFile, boolean paramBoolean)
  {
    return paramFile;
  }

  protected Icon a(File paramFile)
  {
    if (this.p.m(paramFile))
    {
      if ((this.p instanceof bh))
      {
        localObject = ((bh)this.p).D();
        int i = ((cm)localObject).a();
        if ((i == 2) || (i == 1))
          return c;
      }
      return h;
    }
    Object localObject = super.a(paramFile, false);
    Icon localIcon = a(localObject, paramFile);
    if (localIcon == null)
      localIcon = b(localObject, paramFile);
    return (Icon)localIcon;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.cb
 * JD-Core Version:    0.6.0
 */