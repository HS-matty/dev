package com.zend.ide.j;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

public abstract interface s extends u, Serializable
{
  public static final long serialVersionUID = -8630893772911732576L;

  public abstract char a();

  public abstract String a(String paramString);

  public abstract int b(String paramString);

  public abstract boolean a(File paramFile);

  public abstract String b(File paramFile);

  public abstract String c(String paramString)
    throws IOException;

  public abstract String d(String paramString);

  public abstract int c(File paramFile);

  public abstract boolean a(File paramFile, boolean paramBoolean);

  public abstract long d(File paramFile);

  public abstract long e(File paramFile);

  public abstract boolean e(String paramString)
    throws IOException;

  public abstract File a(String paramString, int paramInt);

  public abstract InputStream f(String paramString)
    throws IOException;

  public abstract InputStream f(File paramFile)
    throws IOException;

  public abstract OutputStream b(File paramFile, boolean paramBoolean)
    throws IOException;

  public abstract boolean g(File paramFile);

  public abstract boolean c(File paramFile, boolean paramBoolean);

  public abstract boolean h(File paramFile);

  public abstract String[] i(File paramFile);

  public abstract boolean j(File paramFile);

  public abstract boolean a(File paramFile1, File paramFile2, boolean paramBoolean);

  public abstract boolean a(File paramFile, long paramLong);

  public abstract boolean k(File paramFile);

  public abstract File[] b();

  public abstract int a(File paramFile1, File paramFile2);

  public abstract int l(File paramFile);

  public abstract boolean a(String paramString);
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.s
 * JD-Core Version:    0.6.0
 */