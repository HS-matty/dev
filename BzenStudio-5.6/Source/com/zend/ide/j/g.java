package com.zend.ide.j;

import com.zend.ide.util.dj;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class g extends f
  implements v
{
  private List j;
  private transient s l;

  public g()
  {
    this("CompositeFileSystem");
  }

  public g(String paramString)
  {
    super(paramString);
    c(new i());
    this.j = new ArrayList();
  }

  public Object f()
  {
    return this.j;
  }

  public void a(Object paramObject)
  {
    if (!this.j.isEmpty())
      throw new RuntimeException("filesystem is already initialized");
    Vector localVector = (Vector)paramObject;
    for (int i = 0; i < localVector.size(); i++)
      a((s)localVector.get(i));
  }

  public void a(s params)
  {
    List localList = Arrays.asList(b());
    File[] arrayOfFile = params.b();
    for (int i = 0; i < arrayOfFile.length; i++)
    {
      if (!localList.contains(arrayOfFile[i]))
        continue;
      throw new dj("could not add filesystem " + params.c() + ". file " + arrayOfFile[i] + " already included in the filesystem.");
    }
    for (i = 0; (i < this.j.size()) && (params.c().compareTo(((s)this.j.get(i)).c()) < 0); i++);
    this.j.add(i, params);
    if (!this.j.contains(params))
      throw new dj("could not add filesystem " + params.c() + ".");
    e(arrayOfFile);
    params.a(this);
  }

  public List a()
  {
    return this.j;
  }

  public void o(File paramFile)
  {
    s locals = A(paramFile);
    locals.o(paramFile);
  }

  public boolean b(s params)
  {
    params.b(this);
    boolean bool = this.j.remove(params);
    if (bool)
    {
      File[] arrayOfFile = params.b();
      f(arrayOfFile);
    }
    return bool;
  }

  public void c(s params)
  {
    if (this.l != null)
      this.l.b(this);
    this.l = params;
    params.a(this);
  }

  public char d()
  {
    return this.l.d();
  }

  public char a()
  {
    return this.l.a();
  }

  public String a(String paramString)
  {
    s locals = h(paramString);
    return locals.a(paramString);
  }

  public int b(String paramString)
  {
    s locals = h(paramString);
    return locals.b(paramString);
  }

  public String e()
  {
    return this.l.e();
  }

  public String b(File paramFile)
  {
    s locals = A(paramFile);
    return locals.b(paramFile);
  }

  public String c(String paramString)
    throws IOException
  {
    s locals = h(paramString);
    return locals.c(paramString);
  }

  public String d(String paramString)
  {
    s locals = h(paramString);
    return locals.d(paramString);
  }

  public int c(File paramFile)
  {
    s locals = A(paramFile);
    return locals.c(paramFile);
  }

  public boolean a(File paramFile, boolean paramBoolean)
  {
    s locals = A(paramFile);
    return locals.a(paramFile, paramBoolean);
  }

  public long d(File paramFile)
  {
    s locals = A(paramFile);
    return locals.d(paramFile);
  }

  public long e(File paramFile)
  {
    s locals = A(paramFile);
    return locals.e(paramFile);
  }

  public boolean e(String paramString)
    throws IOException
  {
    s locals = h(paramString);
    return locals.e(paramString);
  }

  public File a(String paramString, int paramInt)
  {
    s locals = h(paramString);
    return locals.a(paramString, paramInt);
  }

  public File g(String paramString)
  {
    s locals = h(paramString);
    return locals.g(paramString);
  }

  public File a(String paramString1, String paramString2)
  {
    s locals = h(paramString1);
    return locals.a(paramString1, paramString2);
  }

  public File a(File paramFile, String paramString)
  {
    s locals = A(paramFile);
    return locals.a(paramFile, paramString);
  }

  public InputStream f(File paramFile)
    throws IOException
  {
    s locals = A(paramFile);
    return locals.f(paramFile);
  }

  public InputStream f(String paramString)
    throws IOException
  {
    s locals = h(paramString);
    return locals.f(paramString);
  }

  public OutputStream b(File paramFile, boolean paramBoolean)
    throws IOException
  {
    s locals = A(paramFile);
    return new d(this, locals, paramFile, paramBoolean);
  }

  public OutputStream a(String paramString, boolean paramBoolean)
    throws IOException
  {
    s locals = h(paramString);
    return new d(this, locals, paramString, paramBoolean);
  }

  public boolean g(File paramFile)
  {
    s locals = A(paramFile);
    return locals.g(paramFile);
  }

  public boolean c(File paramFile, boolean paramBoolean)
  {
    s locals = A(paramFile);
    return locals.c(paramFile, paramBoolean);
  }

  public boolean h(File paramFile)
  {
    s locals = A(paramFile);
    return locals.h(paramFile);
  }

  public String[] i(File paramFile)
  {
    return A(paramFile).i(paramFile);
  }

  public boolean j(File paramFile)
  {
    return A(paramFile).j(paramFile);
  }

  public boolean a(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    return A(paramFile1).a(paramFile1, paramFile2, paramBoolean);
  }

  public boolean a(File paramFile, long paramLong)
  {
    return A(paramFile).a(paramFile, paramLong);
  }

  public boolean k(File paramFile)
  {
    return A(paramFile).k(paramFile);
  }

  public File[] b()
  {
    ArrayList localArrayList = new ArrayList();
    List localList = Arrays.asList(this.l.b());
    localArrayList.addAll(localList);
    synchronized (this.j)
    {
      int i = this.j.size();
      for (int k = 0; k < i; k++)
      {
        s locals = (s)this.j.get(k);
        localList = Arrays.asList(locals.b());
        localArrayList.addAll(localList);
      }
    }
    __x = new File[localArrayList.size()];
    localArrayList.toArray(__x);
    return (File)__x;
  }

  public File[] n(File paramFile)
  {
    return A(paramFile).n(paramFile);
  }

  public boolean p(File paramFile)
  {
    return A(paramFile).p(paramFile);
  }

  public int a(File paramFile1, File paramFile2)
  {
    return A(paramFile1).a(paramFile1, paramFile2);
  }

  public int l(File paramFile)
  {
    return A(paramFile).l(paramFile);
  }

  public void r(File paramFile)
  {
    v(paramFile);
  }

  public void c(File paramFile, boolean paramBoolean)
  {
    e(paramFile, paramBoolean);
  }

  public void c(File paramFile1, File paramFile2)
  {
    d(paramFile1, paramFile2);
  }

  public void s(File paramFile)
  {
    x(paramFile);
  }

  public void a(File[] paramArrayOfFile)
  {
    e(paramArrayOfFile);
  }

  public void t(File paramFile)
  {
    y(paramFile);
  }

  public s A(File paramFile)
  {
    if ((paramFile instanceof a))
      return ((a)paramFile).c();
    if (((paramFile instanceof b)) || (!paramFile.isAbsolute()))
      return this.l;
    return h(paramFile.getPath());
  }

  public s h(String paramString)
  {
    synchronized (this.j)
    {
      int i = this.j.size();
      for (int k = 0; k < i; k++)
      {
        s locals = (s)this.j.get(k);
        if (locals.a(paramString))
          return locals;
      }
    }
    return this.l;
  }

  public void b(File[] paramArrayOfFile)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.g
 * JD-Core Version:    0.6.0
 */