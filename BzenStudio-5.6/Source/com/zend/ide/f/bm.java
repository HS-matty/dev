package com.zend.ide.f;

import com.zend.ide.m.bd;
import com.zend.ide.m.bh;
import com.zend.ide.m.s;
import com.zend.ide.m.v;
import com.zend.ide.m.x;
import com.zend.ide.p.ba;
import com.zend.ide.util.bi;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import com.zend.ide.util.g;
import com.zend.ide.y.b;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Image;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class bm
{
  private static final s[] a;
  private static final s[] n;
  private static s[] o;
  private static final x[] b;
  private static final x[] c;
  private static final x[] d;
  private static bh[] f = di.c;
  private static Map g = new HashMap(3000);
  private static v[] h = di.b;
  private static Map i = new HashMap(10);
  private static bd[] j = di.e;
  private static Map p = d();
  private static boolean e;
  private static boolean k;
  private static e l;
  private static PropertyChangeListener m;
  private static PropertyChangeListener q;
  private static boolean r;

  public static void k()
  {
    com.zend.ide.util.c.h.c().a(new com.zend.ide.util.a.d(new fb()));
  }

  public static s[] b()
  {
    return o;
  }

  public static x[] c()
  {
    return b;
  }

  public static x[] d()
  {
    return c;
  }

  public static x[] e()
  {
    return d;
  }

  public static com.zend.ide.b.d[] f()
  {
    if (r)
      return bl.a(f, kd.g());
    return f;
  }

  public static com.zend.ide.b.d[] a(String paramString)
  {
    Object localObject = g.get(paramString);
    if ((localObject == null) && (!r))
      return di.a;
    return new bh[] { localObject == null ? kd.c(paramString) : (bh)localObject };
  }

  public static com.zend.ide.b.d[] b(String paramString)
  {
    return bl.a(f(), paramString);
  }

  public static void a(Component paramComponent, String paramString)
  {
    if (paramString != null)
    {
      qc localqc = (qc)p.get(paramString.toLowerCase());
      if (localqc == null)
        localqc = new qc("function." + paramString);
      String str1 = localqc.toString();
      try
      {
        new URL(str1);
      }
      catch (Exception localException)
      {
        Image localImage = cv.b("help16.gif").getImage();
        String str2 = ct.a(256, str1);
        Frame localFrame = JOptionPane.getRootFrame();
        localFrame.setIconImage(localImage);
        ba.a(paramComponent, str2, ct.a(257), -1, 0);
        return;
      }
      com.zend.ide.bd.c.b().e().a(str1, true);
    }
  }

  public static v a(String paramString)
  {
    v localv = (v)i.get(paramString);
    if (!r)
      return localv;
    return localv == null ? kd.a(paramString) : localv;
  }

  public static com.zend.ide.b.d[] j()
  {
    if (r)
      return bl.a(h, kd.e());
    return h;
  }

  public static com.zend.ide.b.d[] d(String paramString)
  {
    com.zend.ide.b.d[] arrayOfd1 = bl.a(h, paramString);
    if (r)
    {
      com.zend.ide.b.d[] arrayOfd2 = kd.b(paramString);
      return bl.a(arrayOfd1, arrayOfd2);
    }
    return arrayOfd1;
  }

  public static bd[] g()
  {
    if (r)
    {
      com.zend.ide.b.d[] arrayOfd = bl.a(j, kd.f());
      bd[] arrayOfbd = new bd[arrayOfd.length];
      System.arraycopy(arrayOfd, 0, arrayOfbd, 0, arrayOfd.length);
      return arrayOfbd;
    }
    return j;
  }

  public static com.zend.ide.b.d[] e(String paramString)
  {
    return bl.a(g(), paramString);
  }

  private static synchronized void a()
  {
    boolean bool = b.a("desktop.phpVersion").c().toString().equalsIgnoreCase("PHP5");
    if ((!e) || (k != bool))
    {
      e = true;
      k = bool;
      b(bool);
      a(bool);
    }
  }

  private static void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      o = new s[a.length + n.length];
      System.arraycopy(a, 0, o, 0, a.length);
      System.arraycopy(n, 0, o, a.length, n.length);
    }
    else
    {
      o = new s[a.length + 1];
      System.arraycopy(a, 0, o, 0, a.length);
      o[a.length] = di.a("old_function", " ", 1);
    }
    Arrays.sort(o);
  }

  private static void a(boolean paramBoolean)
  {
    String str;
    if (paramBoolean)
      str = bi.a("PHP5_FUNCTIONS_PATH", "../lib/php5/phpFunctions5.php");
    else
      str = bi.a("PHP4_FUNCTIONS_PATH", "../lib/php4/phpFunctions4.php");
    try
    {
      c();
      InputStreamReader localInputStreamReader = new InputStreamReader(com.zend.ide.j.h.m.f(new File(str).getAbsoluteFile()));
      new r().a(localInputStreamReader, str, new q(null));
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
  }

  private static void c()
  {
    f = di.c;
    g = new HashMap(3000);
    h = di.b;
    i = new HashMap(10);
    j = di.e;
  }

  private static Map d()
  {
    HashMap localHashMap = new HashMap(35);
    String[] arrayOfString = { "else", "elseif", "while", "do-while", "for", "foreach", "break", "continue", "switch", "declare" };
    for (int i1 = 0; i1 < arrayOfString.length; i1++)
      localHashMap.put(arrayOfString[i1], new qc("control-structures." + arrayOfString[i1]));
    qc localqc = new qc("language.constants.predefined");
    arrayOfString = new String[] { "__line__", "__file__", "__function__", "__class__", "__method__" };
    for (int i2 = 0; i2 < arrayOfString.length; i2++)
      localHashMap.put(arrayOfString[i2], localqc);
    localHashMap.put("final", new qc("language.oop5.final"));
    localHashMap.put("abstract", new qc("language.oop5.abstract"));
    localHashMap.put("extends", new qc("keyword.extends"));
    localHashMap.put("clone", new qc("language.oop5.cloning"));
    localHashMap.put("global", new qc("language.variables.scope"));
    localHashMap.put("if", new qc("language.control-structures", "#control-structures.if"));
    localHashMap.put("class", new qc("language.oop", "#keyword.class"));
    localHashMap.put("parent", new qc("keyword.parent"));
    localHashMap.put("function", new qc("language.functions"));
    localHashMap.put("_", new qc("function.gettext"));
    localqc = new qc("language.oop5.interfaces");
    localHashMap.put("interface", localqc);
    localHashMap.put("implements", localqc);
    localqc = new qc("language.oop5.visibility");
    localHashMap.put("public", localqc);
    localHashMap.put("private", localqc);
    localHashMap.put("protected", localqc);
    localqc = new qc("language.exceptions");
    localHashMap.put("try", localqc);
    localHashMap.put("catch", localqc);
    localHashMap.put("throw", localqc);
    localqc = new qc("migration.old-function");
    localHashMap.put("old_function", localqc);
    localHashMap.put("cfunction", localqc);
    return localHashMap;
  }

  static void b()
  {
    a();
  }

  static bh[] a(bh[] paramArrayOfbh)
  {
    f = paramArrayOfbh;
    return paramArrayOfbh;
  }

  static Map a()
  {
    return g;
  }

  static v[] a(v[] paramArrayOfv)
  {
    h = paramArrayOfv;
    return paramArrayOfv;
  }

  static Map b()
  {
    return i;
  }

  static bd[] a(bd[] paramArrayOfbd)
  {
    j = paramArrayOfbd;
    return paramArrayOfbd;
  }

  static boolean a(boolean paramBoolean)
  {
    return bm.r = paramBoolean;
  }

  static
  {
    a = new s[] { di.a("exit", "()", 1), di.a("die", "()", 1), di.a("function", " ", 1), di.a("const", " ", 1), di.a("return", " ", 1), di.a("if", " ()", 2), di.a("elseif", " ()", 2), di.a("else", " ", 1), di.a("while", " ()", 2), di.a("endwhile", ";", 1), di.a("do", " ", 1), di.a("for", " ()", 2), di.a("endfor", ";", 1), di.a("endif", ";", 1), di.a("foreach", " ()", 2), di.a("endforeach", ";", 1), di.a("declare", "()", 1), di.a("enddeclare;", ";", 1), di.a("as", " ", 1), di.a("switch", " ()", 2), di.a("endswitch", ";", 1), di.a("case", " :", 1), di.a("default", ":", 1), di.a("break", "", 0), di.a("continue", "", 0), di.a("echo", " ", 1), di.a("print", " ", 1), di.a("class", " ", 1), di.a("extends", " ", 1), di.a("new", " ", 1), di.a("var", " ", 1), di.a("eval", "()", 1), di.a("include", "()", 1), di.a("include_once", "()", 1), di.a("require", "()", 1), di.a("require_once", "()", 1), di.a("global", " ", 1), di.a("isset", "()", 1), di.a("empty", "()", 1), di.a("static", " ", 1), di.a("unset", "()", 1), di.a("list", "()", 1), di.a("array", "()", 1), di.a("parent", "::", 2), di.a("true", "", 0), di.a("false", "", 0), di.a("null", "", 0), di.a("__FILE__", "", 0), di.a("__LINE__", "", 0), di.a("__CLASS__", "", 0), di.a("__FUNCTION__", "", 0), di.a("and", " ", 1), di.a("or", " ", 1), di.a("xor", " ", 1) };
    Arrays.sort(a);
    n = new s[] { di.a("clone", " ", 1), di.a("self", "::", 2), di.a("__METHOD__", "", 0), di.a("try", " {", 2), di.a("catch", " ()", 2), di.a("throw", " ", 1), di.a("instanceof", " ", 1), di.a("interface", " ", 1), di.a("implements", " ", 1), di.a("abstract", " ", 1), di.a("final", " ", 1), di.a("private", " ", 1), di.a("protected", " ", 1), di.a("public", " ", 1), di.a("__halt_compiler", "();", 3) };
    Arrays.sort(n);
    b = new x[] { di.b("_GET", null, null), di.b("_POST", null, null), di.b("_COOKIE", null, null), di.b("_SESSION", null, null), di.b("_SERVER", null, null), di.b("_ENV", null, null), di.b("_REQUEST", null, null), di.b("_FILES", null, null), di.b("GLOBALS", null, null), di.b("HTTP_GET_VARS", null, null), di.b("HTTP_POST_VARS", null, null), di.b("HTTP_COOKIE_VARS", null, null), di.b("HTTP_SESSION_VARS", null, null), di.b("HTTP_SERVER_VARS", null, null), di.b("HTTP_ENV_VARS", null, null), di.b("HTTP_POST_FILES", null, null), di.b("this", null, null) };
    Arrays.sort(b);
    c = new x[] { di.b("DOCUMENT_ROOT", null, null), di.b("HTTP_ACCEPT", null, null), di.b("HTTP_ACCEPT_ENCODING", null, null), di.b("HTTP_ACCEPT_LANGUAGE", null, null), di.b("HTTP_CONNECTION", null, null), di.b("HTTP_HOST", null, null), di.b("HTTP_USER_AGENT", null, null), di.b("REMOTE_ADDR", null, null), di.b("SCRIPT_FILENAME", null, null), di.b("SERVER_NAME", null, null), di.b("GATEWAY_INTERFACE", null, null), di.b("REQUEST_METHOD", null, null), di.b("QUERY_STRING", null, null), di.b("REQUEST_URI", null, null), di.b("SCRIPT_NAME", null, null), di.b("PHP_SELF", null, null), di.b("PATH", null, null), di.b("REMOTE_PORT", null, null), di.b("SERVER_ADDR", null, null), di.b("SERVER_ADMIN", null, null), di.b("SERVER_PORT", null, null), di.b("SERVER_SIGNATURE", null, null), di.b("SERVER_SOFTWARE", null, null), di.b("SERVER_PROTOCOL", null, null), di.b("PATH_TRANSLATED", null, null) };
    Arrays.sort(c);
    d = new x[] { di.b("SID", null, null) };
    e = false;
    k = false;
    m = new gb(null);
    q = new zd(null);
    f localf = new f();
    l = new e(localf);
    localf.a("desktop.phpVersion", m);
    localf.a("editing.manualUrl", new pc(null));
    localf.a("desktop.includeFrameworkData", q);
    l.a("desktop.phpVersion");
    l.a("editing.manualUrl");
    l.a("desktop.includeFrameworkData");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.bm
 * JD-Core Version:    0.6.0
 */