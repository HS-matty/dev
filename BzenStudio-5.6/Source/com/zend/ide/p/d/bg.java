package com.zend.ide.p.d;

import com.zend.ide.r.d;
import com.zend.ide.r.p;
import com.zend.ide.util.cv;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.filechooser.FileSystemView;
import sun.awt.shell.ShellFolder;

public abstract class bg extends FileSystemView
{
  protected static final Icon a = cv.b("explorer/closedfolder16.gif");
  protected static final Icon b = cv.b("explorer/closedfolder16.gif");
  protected static final Icon d = cv.b("regfile16.gif");
  protected static final Icon e = cv.b("unknownfile16.gif");
  protected static final ImageIcon h = cv.b("explorer/rootfolder16.gif");
  protected static final ImageIcon c = cv.b("explorer/secureRootfolder16.gif");
  protected static final Icon i = UIManager.getIcon("FileView.computerIcon");
  protected static final Icon j = UIManager.getIcon("FileView.floppyDriveIcon");
  private static Hashtable l = new Hashtable();
  private static Hashtable m = new Hashtable();
  protected Hashtable n = new Hashtable();

  protected static Icon a(Object paramObject, File paramFile)
  {
    Icon localIcon = (Icon)l.get(paramObject);
    return localIcon;
  }

  protected static Icon b(Object paramObject, File paramFile)
  {
    return (Icon)m.get(paramObject);
  }

  public Object a(File paramFile, boolean paramBoolean)
  {
    String str1 = paramFile.getPath();
    Object localObject;
    if (isComputerNode(paramFile))
    {
      localObject = "ComputerNode";
    }
    else if (isFloppyDrive(paramFile))
    {
      localObject = "FloppyDrive";
    }
    else if (isDrive(paramFile))
    {
      localObject = "Drive";
    }
    else if (paramFile.isDirectory())
    {
      localObject = paramBoolean ? "openedFolder" : "closedFolder";
    }
    else
    {
      int k = str1.lastIndexOf(".");
      if (k == -1)
      {
        localObject = str1;
      }
      else
      {
        String str2 = str1.substring(k + 1);
        localObject = str2;
      }
    }
    return localObject;
  }

  protected abstract Icon c(Object paramObject, File paramFile);

  protected Icon a(File paramFile)
  {
    return super.getSystemIcon(paramFile);
  }

  protected Icon d(Object paramObject, File paramFile)
  {
    Icon localIcon = a(paramObject, paramFile);
    if (localIcon != null)
      return localIcon;
    localIcon = (Icon)this.n.get(paramObject);
    if (localIcon != null)
      return localIcon;
    if (paramFile.exists())
      localIcon = c(paramObject, paramFile);
    if (localIcon != null)
      return localIcon;
    localIcon = b(paramObject, paramFile);
    if (localIcon != null)
      this.n.put(paramObject, localIcon);
    else
      localIcon = e;
    return localIcon;
  }

  public Icon b(File paramFile, boolean paramBoolean)
  {
    if ((!isFloppyDrive(paramFile)) && (!paramFile.isDirectory()))
    {
      localObject = c(paramFile);
      if (localObject != null)
        return localObject;
    }
    Object localObject = a(paramFile, paramBoolean);
    return (Icon)d(localObject, paramFile);
  }

  public Icon getSystemIcon(File paramFile)
  {
    return b(paramFile, false);
  }

  public String getSystemTypeDescription(File paramFile)
  {
    return paramFile.getAbsolutePath();
  }

  protected Icon c(File paramFile)
  {
    d locald = p.e().a(paramFile);
    if (locald != null)
    {
      if (locald.f())
        return null;
      if (!paramFile.isFile())
        return null;
      return locald.e();
    }
    return null;
  }

  protected ShellFolder getShellFolder(File paramFile)
  {
    try
    {
      return ShellFolder.getShellFolder(paramFile);
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      return null;
    }
    catch (InternalError localInternalError)
    {
    }
    return null;
  }

  static
  {
    l.put("openedFolder", b);
    l.put("closedFolder", a);
    m.put("FloppyDrive", j);
    m.put("Drive", h);
    m.put("ComputerNode", i);
    m.put("openedFolder", b);
    m.put("closedFolder", a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bg
 * JD-Core Version:    0.6.0
 */