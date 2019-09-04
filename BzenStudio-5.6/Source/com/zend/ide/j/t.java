package com.zend.ide.j;

import com.zend.ide.bd.c;
import com.zend.ide.u.bd;
import com.zend.ide.u.bh;
import com.zend.ide.u.bi;
import com.zend.ide.util.a.b;
import com.zend.ide.util.bk;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.dj;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;

public final class t
{
  private static int a = 0;
  private static bk b = new ba(1000L);

  public static int c()
  {
    return a;
  }

  public static boolean a(File paramFile1, File paramFile2, JComponent paramJComponent)
  {
    try
    {
      if (!paramFile1.getName().equals(paramFile2.getName()))
      {
        if (h.m.a(paramFile1, paramFile2, true))
          return true;
        com.zend.ide.p.ba.a(paramJComponent.getTopLevelAncestor(), ct.a(720, paramFile1.getAbsolutePath()), ct.a(280), 0);
      }
    }
    catch (dj localdj)
    {
      b.a(localdj);
    }
    return false;
  }

  public static boolean a(File[] paramArrayOfFile, ClipboardOwner paramClipboardOwner)
  {
    boolean bool = false;
    try
    {
      bool = c(paramArrayOfFile, paramClipboardOwner);
      if (bool)
        a = 1;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return bool;
  }

  public static boolean b(File[] paramArrayOfFile, ClipboardOwner paramClipboardOwner)
  {
    boolean bool = false;
    try
    {
      bool = c(paramArrayOfFile, paramClipboardOwner);
      if (bool)
        a = 2;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return bool;
  }

  private static boolean c(File[] paramArrayOfFile, ClipboardOwner paramClipboardOwner)
  {
    Transferable localTransferable = a(paramArrayOfFile);
    if (localTransferable == null)
      return false;
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(localTransferable, paramClipboardOwner);
    return true;
  }

  public static boolean a(File paramFile, ClipboardOwner paramClipboardOwner)
  {
    List localList = a(paramClipboardOwner);
    if (localList == null)
      return false;
    boolean bool = a(paramFile, localList, a, (JComponent)paramClipboardOwner);
    if ((bool) && (a == 2))
      a = 0;
    return bool;
  }

  public static boolean a(File paramFile, List paramList, int paramInt, JComponent paramJComponent)
  {
    boolean bool = true;
    for (int i = 0; (bool) && (i < paramList.size()); i++)
      bool = a(paramFile, (File)paramList.get(i), paramInt, paramJComponent);
    return bool;
  }

  private static boolean a(File paramFile1, File paramFile2, int paramInt, JComponent paramJComponent)
  {
    if ((paramFile1.getPath().equals(paramFile2.getParentFile().getPath())) && (paramInt == 2))
      throw new dj(ct.a(1030), ct.a(1031, paramFile2.getPath()), "");
    if (paramFile1.getPath().startsWith(paramFile2.getPath()))
      return false;
    if (!paramFile1.canWrite())
      throw new dj(ct.a(854), ct.a(855, paramFile1.getPath()), "");
    switch (paramInt)
    {
    case 2:
      File localFile = h.m.a(paramFile1, paramFile2.getName());
      boolean bool = h.m.a(paramFile2, localFile, true);
      return bool;
    case 1:
      return b(paramFile2, paramFile1, paramJComponent);
    }
    return false;
  }

  public static void a(File[] paramArrayOfFile, boolean paramBoolean, Component paramComponent)
  {
    if (paramArrayOfFile == null)
      return;
    if (paramBoolean)
    {
      String str;
      if (paramArrayOfFile.length > 1)
        str = ct.a(1381, ct.a(182, "" + paramArrayOfFile.length));
      else
        str = ct.a(1381, "'" + paramArrayOfFile[0].getName() + "'");
      int j = com.zend.ide.p.ba.a(paramComponent, str, ct.a(184), 0, 3);
      if (j != 0)
        return;
    }
    for (int i = 0; i < paramArrayOfFile.length; i++)
      a(paramArrayOfFile[i], true);
  }

  private static void a(String paramString, JComponent paramJComponent)
  {
    s locals = h.m.h(paramString);
    if ((locals instanceof bh))
    {
      bh localbh = (bh)locals;
      if (!localbh.v().h())
        try
        {
          bd.a((JFrame)paramJComponent.getTopLevelAncestor(), localbh, false, false, null);
        }
        catch (Exception localException)
        {
        }
    }
  }

  public static boolean b(File paramFile1, File paramFile2, JComponent paramJComponent)
  {
    a(paramFile1.getPath(), paramJComponent);
    a(paramFile2.getPath(), paramJComponent);
    if (paramFile2 == null)
      return false;
    File localFile = h.m.a(paramFile2, paramFile1.getName());
    if (localFile.exists())
    {
      if (((localFile.isDirectory()) && (paramFile1.isFile())) || ((paramFile1.isDirectory()) && (localFile.isFile())))
        throw new dj(ct.a(1303, paramFile1.getName()), ct.a(94), 0);
      if (localFile.getParent().equals(paramFile1.getParent()))
      {
        localFile = a(paramFile2, localFile);
      }
      else
      {
        i = com.zend.ide.p.ba.b(c.b().h(), ct.a(1927, paramFile1.getName()), "Confirm File Replace", 0);
        if (i == 1)
          return false;
      }
    }
    int i = 1;
    boolean bool1;
    try
    {
      Object localObject1;
      if (paramFile1.isDirectory())
      {
        localFile.mkdir();
        localObject1 = d(paramFile1);
        if (localObject1 != null)
          for (int j = 0; (i != 0) && (j < localObject1.length); j++)
            bool1 = b(localObject1[j], localFile, paramJComponent);
      }
      else
      {
        localFile.getParentFile().mkdirs();
        try
        {
          localObject1 = h.m.f(paramFile1);
        }
        catch (Exception localException)
        {
          throw new dj(ct.a(871), ct.a(94), 0);
        }
        OutputStream localOutputStream = null;
        int k = 0;
        boolean bool2 = localFile.exists();
        try
        {
          localOutputStream = h.m.b(localFile, false);
          byte[] arrayOfByte = new byte[2048];
          int m;
          while ((m = ((InputStream)localObject1).read(arrayOfByte)) != -1)
            localOutputStream.write(arrayOfByte, 0, m);
          k = 1;
        }
        finally
        {
          if (localObject1 != null)
            try
            {
              ((InputStream)localObject1).close();
            }
            catch (IOException localIOException4)
            {
            }
          if (localOutputStream != null)
            try
            {
              localOutputStream.close();
            }
            catch (IOException localIOException5)
            {
            }
          if (k != 0)
          {
            if (bool2)
              h.m.s(localFile);
            else
              h.m.r(localFile);
            if (!paramFile1.canWrite())
              localFile.setReadOnly();
          }
        }
      }
    }
    catch (IOException localIOException1)
    {
      cl.a(localIOException1);
      bool1 = false;
    }
    return bool1;
  }

  public static boolean a(File paramFile, boolean paramBoolean)
  {
    File[] arrayOfFile = d(paramFile);
    if ((arrayOfFile != null) && (arrayOfFile.length > 0))
    {
      ArrayList localArrayList1 = new ArrayList(arrayOfFile.length / 5);
      ArrayList localArrayList2 = new ArrayList(arrayOfFile.length);
      for (int i = 0; i < arrayOfFile.length; i++)
        if (arrayOfFile[i].isDirectory())
          localArrayList1.add(arrayOfFile[i]);
        else
          localArrayList2.add(arrayOfFile[i]);
      i = 0;
      int j = localArrayList1.size();
      while (i < j)
      {
        if (!a((File)localArrayList1.get(i), paramBoolean))
          return false;
        i++;
      }
      i = 0;
      j = localArrayList2.size();
      while (i < j)
      {
        if (!a((File)localArrayList2.get(i), paramBoolean))
          return false;
        i++;
      }
    }
    return h.m.c(paramFile, paramBoolean);
  }

  public static File a(File paramFile, String paramString)
  {
    if (paramFile == null)
      return null;
    paramString = (paramString == null) || (paramString.equals("")) ? "NewFile" : paramString;
    File localFile = h.m.a(paramFile, paramString);
    if (localFile.exists())
      localFile = a(paramFile, localFile);
    try
    {
      if (!localFile.createNewFile())
        return null;
    }
    catch (IOException localIOException)
    {
      throw new dj(ct.a(177), ct.a(178, paramFile.getPath()), "");
    }
    return localFile;
  }

  public static File b(File paramFile, String paramString)
  {
    if (paramFile == null)
      return null;
    paramString = (paramString == null) || (paramString.equals("")) ? "NewFolder" : paramString;
    File localFile = h.m.a(paramFile, paramString);
    if (localFile.exists())
      localFile = a(paramFile, localFile);
    if (!localFile.mkdir())
      throw new dj(ct.a(179), ct.a(180, paramFile.getPath()), "");
    return localFile;
  }

  private static File[] d(File paramFile)
  {
    File[] arrayOfFile = null;
    if (!paramFile.isFile())
    {
      arrayOfFile = paramFile.listFiles();
      if ((arrayOfFile != null) && (arrayOfFile.length > 0))
        try
        {
          String str1 = paramFile.getCanonicalPath();
          String str2 = arrayOfFile[0].getCanonicalPath() + h.m.A(paramFile).d();
          if (!str2.startsWith(str1))
            return null;
        }
        catch (IOException localIOException)
        {
          cl.a(localIOException);
        }
    }
    return arrayOfFile;
  }

  private static File a(File paramFile1, File paramFile2)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    File localFile = paramFile2;
    int i = 1;
    while (localFile.exists())
    {
      i++;
      String str = paramFile2.getName();
      if (paramFile2.isFile())
      {
        int j = str.lastIndexOf(".");
        if (j == -1)
        {
          localStringBuffer.append(str);
          localStringBuffer.append("(");
          localStringBuffer.append(i);
          localStringBuffer.append(")");
        }
        else
        {
          localStringBuffer.append(str.substring(0, j));
          localStringBuffer.append("(");
          localStringBuffer.append(i);
          localStringBuffer.append(")");
          localStringBuffer.append(str.substring(j));
        }
      }
      else
      {
        localStringBuffer.append(str);
        localStringBuffer.append("(");
        localStringBuffer.append(i);
        localStringBuffer.append(")");
      }
      str = localStringBuffer.toString();
      localFile = h.m.a(paramFile1, str);
      localStringBuffer.delete(0, localStringBuffer.length());
    }
    return localFile;
  }

  private static List a(ClipboardOwner paramClipboardOwner)
  {
    try
    {
      Transferable localTransferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(paramClipboardOwner);
      if (localTransferable.isDataFlavorSupported(DataFlavor.javaFileListFlavor))
        return (List)localTransferable.getTransferData(DataFlavor.javaFileListFlavor);
    }
    catch (UnsupportedFlavorException localUnsupportedFlavorException)
    {
      cl.a(localUnsupportedFlavorException);
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
    return null;
  }

  public static Transferable e(File paramFile)
  {
    if ((paramFile == null) || (f(paramFile)))
      return null;
    return new z(paramFile);
  }

  private static Transferable a(File[] paramArrayOfFile)
  {
    if ((paramArrayOfFile == null) || (paramArrayOfFile.length == 0))
      return null;
    for (int i = 0; i < paramArrayOfFile.length; i++)
      if ((paramArrayOfFile[i] == null) || (f(paramArrayOfFile[i])))
        return null;
    return new z(paramArrayOfFile);
  }

  public static boolean f(File paramFile)
  {
    if (paramFile == null)
      return false;
    List localList = b();
    if (localList == null)
    {
      cl.a("Unexpected null at : FileSystemUtilities");
      return false;
    }
    return localList.contains(paramFile);
  }

  private static List b()
  {
    return (List)b.a(null);
  }

  public static String a(String paramString)
  {
    paramString = paramString.replaceAll("/[.]/", "/");
    paramString = paramString.replaceAll("\\\\[.]\\\\", "\\\\");
    if (paramString.endsWith("/."))
      paramString = paramString.substring(0, paramString.length() - 2);
    if (paramString.endsWith("\\\\."))
      paramString = paramString.substring(0, paramString.length() - 2);
    paramString = paramString.replaceAll("/[^/]+/[.][.]/", "/");
    paramString = paramString.replaceAll("\\\\[^\\\\]+\\\\[.][.]\\\\", "\\\\");
    if (paramString.endsWith("/.."))
    {
      paramString = paramString.substring(0, paramString.length() - 3);
      paramString = paramString.substring(0, paramString.lastIndexOf("/"));
    }
    if (paramString.endsWith("\\\\.."))
    {
      paramString = paramString.substring(0, paramString.length() - 3);
      paramString = paramString.substring(0, paramString.lastIndexOf("\\\\"));
    }
    return paramString;
  }

  public static boolean a(u paramu, File paramFile)
  {
    return a(paramu, paramFile.getPath(), true);
  }

  public static boolean a(u paramu, String paramString, File paramFile)
  {
    if (a(paramu, paramString, false))
      return true;
    if (paramFile == null)
      return false;
    File localFile = paramu.a(paramFile, paramString);
    try
    {
      localFile = localFile.getCanonicalFile();
    }
    catch (IOException localIOException)
    {
    }
    if (paramu.m(localFile))
      return true;
    if (!localFile.exists())
      return false;
    return a(paramu, localFile.getPath(), true);
  }

  private static boolean a(u paramu, String paramString, boolean paramBoolean)
  {
    File[] arrayOfFile = paramu.b();
    if (arrayOfFile.length == 0)
      return false;
    paramString = paramString.trim();
    File localFile1 = h.m.g(paramString);
    String str1 = paramString;
    if ((str1.startsWith("./")) || (str1.startsWith(".\\")))
      str1 = str1.substring(2);
    for (int i = 0; i < arrayOfFile.length; i++)
    {
      File localFile2 = arrayOfFile[i];
      try
      {
        String str2 = localFile2.getCanonicalPath();
        if (str2.endsWith(str1))
          return true;
        File localFile3 = paramBoolean ? localFile1 : h.m.a(localFile2, paramString);
        if (localFile2.isDirectory())
        {
          if ((localFile3.exists()) && (localFile3.getCanonicalPath().startsWith(str2 + h.m.A(localFile2).d())))
            return true;
        }
        else if ((localFile2.isFile()) && (localFile3.getCanonicalPath().equals(str2)))
          return true;
      }
      catch (Exception localException)
      {
      }
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.t
 * JD-Core Version:    0.6.0
 */