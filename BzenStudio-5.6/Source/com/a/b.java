package com.a;

import com.zend.ide.l.a.o;
import com.zend.ide.l.a.p;
import com.zend.ide.l.a.q;
import com.zend.ide.l.a.r;
import com.zend.ide.l.a.s;
import com.zend.ide.l.a.t;
import com.zend.ide.l.a.u;
import com.zend.ide.l.a.v;
import com.zend.ide.l.a.w;
import java.io.PrintStream;
import java.util.Hashtable;

public class b
{
  private static Hashtable a = new Hashtable();
  private static Hashtable b = new Hashtable();

  private static void a(d paramd)
  {
    a.put(paramd.d(), paramd);
    b.put(paramd.b().getName(), paramd);
  }

  public static d a(String paramString)
  {
    d locald = (d)a.get(paramString);
    if (locald == null)
      System.out.println(paramString);
    return locald;
  }

  public static d b(String paramString)
  {
    d locald = (d)b.get(paramString);
    if (locald != null)
      return locald;
    try
    {
      Class localClass1 = Class.forName(paramString);
      Class localClass2 = localClass1.getSuperclass();
      if (localClass2 != null)
        return b(localClass2.getName());
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  static
  {
    a(new com.a.a.f("background"));
    a(new com.a.a.f("underline"));
    a(new com.a.a.f("useEncoding"));
    a(new com.a.a.f("useRpcBindingStyle"));
    a(new com.a.a.f());
    a(new com.a.a.g("BGColor"));
    a(new com.a.a.g("FGColor"));
    a(new com.a.a.g());
    a(new com.a.a.c());
    a(new com.a.a.l());
    a(new com.a.a.m());
    a(new com.a.a.h());
    a(new com.a.a.n());
    a(new com.a.a.d("integer"));
    a(new com.a.a.d("port"));
    a(new com.a.a.d("lineNumber"));
    a(new com.a.a.d("caretPosition"));
    a(new com.a.a.d("token"));
    a(new com.a.a.d("fontStyle"));
    a(new com.a.a.i());
    a(new com.a.a.j());
    a(new com.a.a.e("string"));
    a(new com.a.a.e("description"));
    a(new com.a.a.e("fileName"));
    a(new com.a.a.e("debug_mode"));
    a(new com.a.a.e("serverHost"));
    a(new com.a.a.e("tempFilesLocation"));
    a(new com.a.a.e("condition"));
    a(new com.a.a.e("schemeName"));
    a(new com.a.a.e("tokensIDS"));
    a(new com.a.a.e("groupName"));
    a(new com.a.a.e("schema"));
    a(new com.a.a.e("outputFile"));
    a(new com.a.a.e("namespace"));
    a(new com.a.a.e("encodingStyle"));
    a(new com.a.a.k());
    a(new com.zend.ide.l.a.b());
    a(new com.zend.ide.y.a.b());
    a(new com.zend.ide.y.a.d());
    a(new com.zend.ide.l.a.k());
    a(new com.zend.ide.y.a.c());
    a(new com.zend.ide.y.a.f());
    a(new com.zend.ide.l.a.j());
    a(new com.zend.ide.y.a.e());
    a(new com.zend.ide.y.a.k());
    a(new com.zend.ide.l.a.d());
    a(new com.zend.ide.l.a.i());
    a(new com.zend.ide.l.a.e());
    a(new q());
    a(new com.zend.ide.l.a.n());
    a(new com.zend.ide.y.a.a());
    a(new com.zend.ide.r.a.a());
    a(new com.zend.ide.r.a.b());
    a(new com.zend.ide.l.a.m());
    a(new com.zend.ide.u.a.a());
    a(new com.zend.ide.cb.b.a());
    a(new com.zend.ide.l.a.g());
    a(new com.zend.ide.l.a.c());
    a(new com.zend.ide.l.a.l());
    a(new com.zend.ide.l.a.a());
    a(new p());
    a(new com.zend.ide.l.a.f());
    a(new r());
    a(new com.zend.ide.l.a.h());
    a(new com.zend.ide.y.a.h());
    a(new com.zend.ide.y.a.g());
    a(new com.zend.ide.y.a.i());
    a(new com.zend.ide.y.a.j());
    a(new com.zend.ide.bf.a.a());
    a(new com.zend.ide.bf.a.b());
    a(new com.zend.ide.gb.c.d());
    a(new com.zend.ide.gb.c.b());
    a(new com.zend.ide.gb.c.a());
    a(new com.zend.ide.gb.c.c());
    a(new s("ProjectViewerManager"));
    a(new o());
    a(new v());
    a(new t());
    a(new u());
    a(new w());
    a(new com.a.a.b("JREs", new v()));
    a(new com.a.a.b("classes", new com.zend.ide.gb.c.a()));
    a(new com.a.a.b("inputFiles", new com.zend.ide.gb.c.b()));
    a(new com.a.a.b("unknowenClasses", new com.zend.ide.gb.c.c()));
    a(new com.a.a.b("values", new com.a.a.i()));
    a(new com.a.a.b("initialvalues", new com.a.a.i()));
    a(new com.a.a.b("properties", new com.zend.ide.y.a.b()));
    a(new com.a.a.b("breakpoints", new com.zend.ide.l.a.d()));
    a(new com.a.a.b("openEditors", new com.zend.ide.l.a.i()));
    a(new com.a.a.b("lastArguments", new com.zend.ide.l.a.e()));
    a(new com.a.a.b("svnCmdArguments", new q()));
    a(new com.a.a.b("watches", new com.zend.ide.l.a.n()));
    a(new com.a.a.b("keyMap", new com.zend.ide.y.a.d()));
    a(new com.a.a.b("memntos", new o()));
    a(new com.a.a.b("pIncludedSevers", new w()));
    a(new com.zend.ide.y.a.l());
    a(new com.zend.ide.y.a.m());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.a.b
 * JD-Core Version:    0.6.0
 */