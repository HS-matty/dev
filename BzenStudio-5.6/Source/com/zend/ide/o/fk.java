package com.zend.ide.o;

import com.zend.ide.be.d;
import com.zend.ide.n.el;
import com.zend.ide.p.ba;
import com.zend.ide.util.bb;
import com.zend.ide.util.c.h;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import com.zend.ide.util.f.a;
import com.zend.ide.y.b;
import com.zend.ide.y.e;
import java.awt.Component;
import java.awt.Frame;
import java.beans.PropertyChangeListener;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.FocusManager;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class fk extends x
  implements ch, bi, com.zend.ide.util.bn, cu
{
  private el b;
  private dk i;
  private r q = new r(this);
  private di H = null;
  private int u = -1;
  private bc g = new bc();
  private com.zend.ide.util.bs h;
  private int k = -1;
  private String l = null;
  private String m = null;
  boolean L;
  private int R = 0;
  private String p = "Server IP";
  private String r = ((File)b.a("debugging.tempFilesLocation").c()).getPath();
  private dp s;
  private String t = "textComponent";
  private e w;
  private co x;
  public static int y = 0;
  public static int z = 1;
  private int A = y;
  private boolean C = false;
  private fp E;
  private fn F;
  private bx S;
  private bn I = new bn();
  private com.zend.ide.o.c.g J;
  private PropertyChangeListener K = new p(this, null);
  private PropertyChangeListener M = new v(this, null);
  private PropertyChangeListener G = new bp(this, null);
  private PropertyChangeListener N = new o(this, null);
  private w O;
  private y P;
  private cg Q;
  private u B;
  private com.zend.ide.util.c.f bg;
  private ft bh;
  private ck U;
  private boolean v = false;
  private boolean T = ((Boolean)b.a("debugging.grabFocusOnDebugSession").c()).booleanValue();
  private boolean V = ((Boolean)b.a("debugging.autoOpenDebugWindow").c()).booleanValue();
  private boolean W = ((Boolean)b.a("debugging.autoOpenDebugMessagesWindow").c()).booleanValue();
  private boolean X = ((Boolean)b.a("debugging.autoOpenOutputWindow").c()).booleanValue();
  private s Y = new s(this);
  private dj Z;
  private String bb = "";
  private com.zend.ide.y.i ba;
  t bc = new t(this);
  private com.zend.ide.i.r D;

  public fk(com.zend.ide.n.bw parambw, de paramde)
  {
    super(parambw, paramde);
    this.f = parambw;
    this.e = paramde;
    this.b = new db(this);
    this.f.a(this.b);
    this.i = new dk(this);
    this.h = this.f.t();
    this.O = new w(this);
    this.P = new y(this, null);
    this.Q = this.O;
    this.x = new co();
    this.i.a(this.q);
    o();
    this.s = new dp(this);
    this.s.b();
    k();
    super.A();
    c();
    this.Z = new dj(this, bd());
    i();
    this.U = new ck(this);
    this.B = new u(this, null);
    this.j = h.c().b(this.B);
    this.bh = new ft(this, null);
    this.bg = h.c().b(this.bh);
    bd().a(this.Y);
  }

  protected void i()
  {
    this.ba = new com.zend.ide.y.i(this.f.c());
    this.ba.a("debugging.serverConnection", "testServerConnectionAction");
    this.ba.a("debugging.debugURL", "debugURLAction");
    this.ba.a("debugging.toggleBreakpoint", "ToggleBreakpointAction");
    this.ba.a("debugging.stepOver", "StepOverAction");
    this.ba.a("debugging.stepInto", "StepIntoAction");
    this.ba.a("debugging.stepOut", "StepOutAction");
    this.ba.a("debugging.go", "GoAction");
    this.ba.a("debugging.finishDebugger", "StopDebugAction");
    this.ba.a("debugging.gotoCursor", "GoToCursorAction");
    this.ba.a("debugging.run", "RunAction");
    this.ba.a("debugging.addWatch", "AddWatchAction");
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.w = new e(localf);
    localf.a("highlighting.breakpointColor", this.K);
    localf.a("debugging.dummyFile", this.M);
    localf.a("debugging.grabFocusOnDebugSession", this.G);
    localf.a("debugging.autoOpenDebugWindow", this.N);
    localf.a("debugging.autoOpenDebugMessagesWindow", this.N);
    localf.a("debugging.autoOpenOutputWindow", this.N);
    this.w.a("highlighting.breakpointColor");
    this.w.a("debugging.dummyFile");
    this.w.a("debugging.grabFocusOnDebugSession");
    this.w.a("debugging.autoOpenDebugWindow");
    this.w.a("debugging.autoOpenDebugMessagesWindow");
    this.w.a("debugging.autoOpenOutputWindow");
  }

  private void k()
  {
    this.E = D();
    this.E.setName("Debug Output");
    this.J = new com.zend.ide.o.c.g(this);
  }

  public ab a()
  {
    return this.J;
  }

  public void n()
  {
    f(false);
    this.U.c();
  }

  protected void o()
  {
    ActionMap localActionMap = C();
    Object localObject = new eu(this);
    localActionMap.put("OpenDebugWindowAction", (Action)localObject);
    localObject = new ep(this);
    localActionMap.put("AddWatchAction", (Action)localObject);
    localObject = new fc(this);
    localActionMap.put("ToggleBreakpointAction", (Action)localObject);
    localObject = new eo(this);
    localActionMap.put("AddNewBreakpointAction", (Action)localObject);
    localObject = new fa(this);
    localActionMap.put("StepOverAction", (Action)localObject);
    localObject = new ey(this);
    localActionMap.put("StepIntoAction", (Action)localObject);
    localObject = new ez(this);
    localActionMap.put("StepOutAction", (Action)localObject);
    localObject = new er(this);
    localObject = new com.zend.ide.util.a.f((Action)localObject);
    localActionMap.put("GoAction", (Action)localObject);
    localObject = new fb(this);
    localActionMap.put("StopDebugAction", (Action)localObject);
    localObject = new ex(this);
    localObject = new com.zend.ide.util.a.f((Action)localObject);
    localActionMap.put("RunAction", (Action)localObject);
    localObject = new fd(this);
    localActionMap.put("ToggleOutputAreaAction", (Action)localObject);
    localObject = new es(this);
    localObject = new com.zend.ide.util.a.f((Action)localObject);
    localActionMap.put("GoToCursorAction", (Action)localObject);
    localObject = new ev(this);
    localActionMap.put("PauseAction", (Action)localObject);
    localObject = new eq(this);
    localActionMap.put("FinishDebugAction", (Action)localObject);
    localObject = new ew(this);
    localActionMap.put("RemoveAllBreakpointsAction", (Action)localObject);
    localObject = new gg(this);
    localActionMap.put("debugURLAction", (Action)localObject);
    localObject = new gk(this);
    localActionMap.put("testServerConnectionAction", (Action)localObject);
    localObject = new com.zend.ide.util.f.i(new qb(this));
    localActionMap.put("tunnelingDialogAction", (Action)localObject);
  }

  public dk p()
  {
    return this.i;
  }

  public bc u()
  {
    return this.g;
  }

  public void d(String paramString)
  {
    this.h.d(paramString);
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public String r()
  {
    return this.t;
  }

  public com.zend.ide.util.bs t()
  {
    return this.f.t();
  }

  public void a(com.zend.ide.util.bn parambn)
  {
    this.s.a(parambn.q());
  }

  public int w()
  {
    if (this.R == 0)
      return this.e.j();
    return this.R;
  }

  public void a(int paramInt)
  {
    this.R = paramInt;
    this.e.b(paramInt);
  }

  public void a(boolean paramBoolean)
  {
    this.L = paramBoolean;
    if (this.L)
      this.Q = this.P;
    else
      this.Q = this.O;
  }

  public boolean x()
  {
    return this.L;
  }

  public String y()
  {
    return this.p;
  }

  public void e(String paramString)
  {
    this.p = paramString;
  }

  public void a(URL paramURL)
  {
    e(paramURL.toString());
  }

  public void g(String paramString)
  {
    this.r = paramString;
  }

  public String B()
  {
    return this.r;
  }

  protected void d(int paramInt)
  {
    this.e.c(paramInt);
  }

  public fp D()
  {
    if (this.E == null)
    {
      this.E = new fp(this);
      this.E.a(this);
    }
    return this.E;
  }

  public fn E()
  {
    if (this.F == null)
      this.F = new fn(this);
    return this.F;
  }

  public bx bn()
  {
    if (this.S == null)
      this.S = new bx(this);
    return this.S;
  }

  public InputStream b(String paramString1, int paramInt, String paramString2)
  {
    ByteArrayInputStream localByteArrayInputStream = null;
    if (d())
    {
      byte[] arrayOfByte = this.e.a(paramString1);
      if ((arrayOfByte != null) && (arrayOfByte.length > 0))
        localByteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      if ((localByteArrayInputStream != null) && (bd().a(paramString1, null, localByteArrayInputStream)))
        bd().a(paramInt, true);
    }
    else if (!this.bb.equals(""))
    {
      a(paramString1, paramInt, this.bb, w());
    }
    return localByteArrayInputStream;
  }

  public void G()
  {
    String str = bd().getSelectedText();
    if (str == null)
      str = "";
    k(str);
    bd().grabFocus();
  }

  public boolean k(String paramString)
  {
    String str = (String)ba.a(c(), ct.a(119), ct.a(118), 1, null, null, paramString);
    return this.g.a(str);
  }

  public Collection l()
  {
    return this.g.b();
  }

  public boolean H()
  {
    return com.zend.ide.bd.c.b().c().c("DebugOutput");
  }

  public void b(boolean paramBoolean)
  {
    if (paramBoolean == H())
      return;
    com.zend.ide.bd.c.b().c().a("DebugOutput", paramBoolean);
    bd().grabFocus();
  }

  public boolean I()
  {
    return com.zend.ide.bd.c.b().c().c("DebugWindow");
  }

  public void c(boolean paramBoolean)
  {
    if (paramBoolean == I())
      return;
    com.zend.ide.bd.c.b().c().a("DebugWindow", paramBoolean);
    bd().grabFocus();
  }

  private void e(boolean paramBoolean)
  {
    com.zend.ide.bd.c localc = com.zend.ide.bd.c.b();
    localc.f().c(E());
    localc.c().a("MessageComponent", paramBoolean);
  }

  public boolean a(di paramdi, bk parambk)
  {
    return this.e.a(paramdi, parambk);
  }

  public boolean a(String paramString, int paramInt, bk parambk)
  {
    return this.e.a(paramString, paramInt, parambk);
  }

  public boolean a(int paramInt, bl parambl)
  {
    return this.e.a(paramInt, parambl);
  }

  public boolean a(bu parambu)
  {
    return this.e.a(parambu);
  }

  public boolean a(bw parambw)
  {
    return this.e.a(parambw);
  }

  public boolean a(bv parambv)
  {
    return this.e.a(parambv);
  }

  public String a(String paramString, int paramInt, String[] paramArrayOfString)
  {
    try
    {
      return this.e.a(paramString, paramInt, paramArrayOfString);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
    return null;
  }

  public ib b()
  {
    return this.e.a();
  }

  public String a(int paramInt1, String paramString, int paramInt2, String[] paramArrayOfString)
  {
    return this.e.a(paramInt1, paramString, paramInt2, paramArrayOfString);
  }

  public void K()
  {
    b(bd().a());
  }

  public void b(int paramInt)
  {
    String str = bg();
    di localdi = this.i.b(str, paramInt);
    if (localdi != null)
      b(localdi);
    else
      c(str, paramInt);
  }

  public void c(String paramString, int paramInt)
  {
    a(new di(paramString, paramInt));
  }

  public void a(di paramdi)
  {
    this.i.b(paramdi);
  }

  public boolean b(di paramdi)
  {
    int j = 0;
    if (paramdi != null)
    {
      this.i.a(paramdi);
      j = 1;
    }
    return j;
  }

  public boolean d()
  {
    return (this.v) && (this.e.d());
  }

  public void L()
  {
    this.v = false;
    bi();
    this.e.f();
    f();
    c(y);
    if (this.o)
      this.e.a(this.R);
  }

  public boolean a(String paramString1, String paramString2, int paramInt, String[] paramArrayOfString)
  {
    return this.e.a(paramString1, paramString2, paramInt, paramArrayOfString);
  }

  public boolean M()
  {
    return a(this.I);
  }

  public boolean a(bs parambs)
  {
    return this.e.a(parambs);
  }

  public boolean N()
  {
    T();
    c(y);
    boolean bool;
    if (d())
      bool = a(this.I);
    else
      bool = this.Q.b();
    return bool;
  }

  public boolean a(br parambr)
  {
    return this.e.a(parambr);
  }

  public boolean O()
  {
    T();
    c(z);
    boolean bool;
    if (d())
    {
      this.e.e();
      bool = a(this.I);
    }
    else
    {
      bool = this.Q.b();
    }
    return bool;
  }

  public boolean P()
  {
    T();
    String str1 = bg();
    int j = bd().d();
    di localdi = new di(str1, j);
    localdi.d(1);
    if (d())
    {
      String str2 = p(localdi.j());
      if (str2 == null)
        a(localdi, this.bc);
      else
        a(str2, localdi.b(), this.bc);
    }
    else
    {
      this.H = localdi;
    }
    return N();
  }

  public void a(ch paramch)
  {
    this.x.a(paramch);
  }

  protected void c(int paramInt)
  {
    this.A = paramInt;
  }

  protected int R()
  {
    return this.A;
  }

  private String f(String paramString, int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer(this.p);
    try
    {
      localStringBuffer.append(this.p.endsWith("/") ? "" : "/");
      localStringBuffer.append(paramString);
      if (paramString.indexOf('?') == -1)
        localStringBuffer.append('?');
      else
        localStringBuffer.append('&');
      localStringBuffer.append(com.zend.ide.util.ex.b(paramInt, this.o));
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return localStringBuffer.toString().trim();
  }

  public boolean a(gc paramgc)
  {
    return this.e.a(paramgc);
  }

  public void S()
  {
    if (!d())
      this.e.a(this.R);
  }

  private void T()
  {
    d(null, -1);
  }

  private void d(String paramString, int paramInt)
  {
    this.l = paramString;
    this.m = null;
    this.k = paramInt;
    this.Z.k();
  }

  public int U()
  {
    return this.k;
  }

  public String V()
  {
    return this.l;
  }

  public String W()
  {
    return this.m;
  }

  public void X()
  {
    j localj = new j();
    localj.b();
    di localdi = localj.e();
    if (localdi != null)
      a(localdi);
  }

  public boolean Y()
  {
    this.i.b();
    return true;
  }

  public boolean Z()
  {
    T();
    int j = 0;
    if (d())
      a(this.I);
    return j;
  }

  public boolean ba()
  {
    T();
    int j = 0;
    if (d())
      a(this.I);
    return j;
  }

  public boolean bb()
  {
    T();
    int j = 0;
    if (d())
      a(this.I);
    return j;
  }

  private void bc()
  {
    if (R() == y)
    {
      dk localdk = this.i;
      Iterator localIterator = localdk.m().iterator();
      while (localIterator.hasNext())
      {
        di localdi = (di)localIterator.next();
        if (localdi.i())
          a(localdi, new q(this));
      }
    }
    if (this.H != null)
    {
      a(this.H, this.bc);
      this.H = null;
    }
  }

  public void a()
  {
  }

  public void bk()
  {
    c(ct.a(96), ct.a(97));
  }

  private void c(String paramString1, String paramString2)
  {
    Frame localFrame = JOptionPane.getRootFrame();
    localFrame.setIconImage(cv.a("noticemsg16.gif"));
    if (bl().isVisible())
      bl().setVisible(false);
    ba.a(com.zend.ide.bd.c.b().h(), paramString1, paramString2, -1, 2);
  }

  public void b()
  {
    be();
    S();
  }

  protected void a(String paramString1, String paramString2)
  {
    if (R() == y)
    {
      Collection localCollection = this.i.c(paramString2);
      Iterator localIterator = localCollection.iterator();
      while (localIterator.hasNext())
      {
        di localdi = (di)localIterator.next();
        a(paramString1, localdi.b(), this.I);
      }
    }
  }

  public String p(String paramString)
  {
    if ((paramString == null) || (!this.c.containsValue(paramString)))
      return null;
    Enumeration localEnumeration = this.c.keys();
    while (localEnumeration.hasMoreElements())
    {
      String str = (String)localEnumeration.nextElement();
      if (paramString.equals(this.c.get(str)))
        return str;
    }
    return null;
  }

  public void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.j.d();
    this.bg.d();
    bl().setVisible(false);
    if (((paramString4.length() > 0) || (paramString3.indexOf("debug_url=1") != -1)) && (a.a.b()))
    {
      L();
      return;
    }
    n();
    this.v = true;
    this.n = true;
    bc();
    if (this.V)
      c(true);
    if (this.W)
      e(true);
    if (this.X)
      b(true);
    s(paramString4);
    d(paramString3, paramString4);
    a(this.I);
    this.x.a(paramString1, paramString2, paramString3, paramString4);
  }

  public void s(String paramString)
  {
    String str1 = "original_url=";
    String str2 = "";
    if (paramString.indexOf(str1) != -1)
      str2 = paramString.substring(paramString.indexOf(str1) + str1.length());
    if (!str2.equals(""))
      this.bb = str2;
  }

  public void a(String paramString, int paramInt)
  {
    f(true);
    if (i(paramString))
    {
      be();
      return;
    }
    if (this.u != -1)
    {
      a(this.u, this.I);
      this.u = -1;
    }
    d(paramString, paramInt);
    com.zend.ide.p.bx.a(new m(this));
    this.J.a();
    this.x.a(paramString, paramInt);
    bd().repaint();
  }

  public void e()
  {
    this.J.a();
    this.x.b();
  }

  public void a(String paramString)
  {
    this.x.a(paramString);
  }

  public void b(String paramString)
  {
    this.x.b(paramString);
  }

  public void bi()
  {
    this.e.k();
  }

  public void f()
  {
    T();
    this.d = null;
    this.x.d();
    this.bg.d();
  }

  private void be()
  {
    L();
    f(false);
  }

  private int bf()
  {
    String str1 = ct.a(104);
    String str2 = "";
    Frame localFrame = JOptionPane.getRootFrame();
    localFrame.setIconImage(cv.a("conproblems16.gif"));
    int j = ba.a(com.zend.ide.bd.c.b().h(), str1, str2, 0, 2);
    return j;
  }

  public void g()
  {
    int j = bf();
    if (j == 1)
    {
      be();
      this.x.c();
    }
  }

  public void b(bh parambh)
  {
    this.x.a(parambh);
  }

  public void a(bh parambh)
  {
    this.x.b(parambh);
  }

  private static void b(String paramString1, String paramString2)
  {
    Object localObject = FocusManager.getCurrentManager().getFocusedWindow();
    if (localObject == null)
      localObject = com.zend.ide.bd.c.b().h();
    ba.a((Component)localObject, paramString1, paramString2, -1, 2);
  }

  public void h()
  {
    String str = ct.a(105, "" + this.R);
    b(str, ct.a(107));
    be();
  }

  public boolean d(boolean paramBoolean)
  {
    return (bd().d(paramBoolean)) && (this.h.d(paramBoolean));
  }

  public Object s()
  {
    cf localcf = new cf();
    di[] arrayOfdi = new di[this.i.g()];
    this.i.k().toArray(arrayOfdi);
    localcf.a(arrayOfdi);
    String[] arrayOfString = new String[this.g.c()];
    this.g.b().toArray(arrayOfString);
    dg[] arrayOfdg = new dg[arrayOfString.length];
    for (int j = 0; j < arrayOfString.length; j++)
      arrayOfdg[j] = new dg(arrayOfString[j]);
    localcf.a(arrayOfdg);
    localcf.a(y());
    localcf.b(B());
    localcf.a(w());
    localcf.b(x());
    return localcf;
  }

  public void c(Object paramObject)
  {
    this.i.b();
    this.g.d();
    if (paramObject == null)
      return;
    if (!(paramObject instanceof cf))
    {
      this.R = ((Integer)b.a("debugging.debugPort").c()).intValue();
      a(((Boolean)b.a("debugging.localDebugging").c()).booleanValue());
      this.p = b.a("debugging.serverHost").c().toString();
      this.r = ((File)b.a("debugging.tempFilesLocation").c()).getPath();
      return;
    }
    try
    {
      cf localcf = (cf)paramObject;
      di[] arrayOfdi = localcf.i();
      for (int j = 0; j < arrayOfdi.length; j++)
        this.i.b(arrayOfdi[j]);
      dg[] arrayOfdg = localcf.b();
      for (int n = 0; n < arrayOfdg.length; n++)
        this.g.a(arrayOfdg[n].b());
      this.R = localcf.d();
      this.p = localcf.e();
      bj().a(localcf.e());
      this.r = localcf.f();
      a(localcf.g());
    }
    catch (ClassCastException localClassCastException)
    {
      cl.a(localClassCastException);
    }
  }

  public bb q()
  {
    return this.s;
  }

  public JComponent c()
  {
    return this.f.c();
  }

  private void c()
  {
    TrustManager[] arrayOfTrustManager = { new dm(this) };
    try
    {
      SSLContext localSSLContext = SSLContext.getInstance("SSL");
      localSSLContext.init(null, arrayOfTrustManager, new SecureRandom());
      HttpsURLConnection.setDefaultSSLSocketFactory(localSSLContext.getSocketFactory());
    }
    catch (Exception localException)
    {
    }
  }

  protected com.zend.ide.i.r bj()
  {
    if (this.D == null)
      this.D = new com.zend.ide.i.r(com.zend.ide.bd.c.b().h());
    return this.D;
  }

  public void r(String paramString)
  {
    if (d())
    {
      ba.a(com.zend.ide.bd.c.b().h(), ct.a(1816), ct.a(85), 1);
      return;
    }
    com.zend.ide.i.r localr = bj();
    if (localr.f().equals(""))
      localr.a(y());
    localr.a(w());
    localr.u();
    if (localr.h() == 1)
    {
      paramString = localr.e();
      c(y);
      bl().a(localr.f());
      bl().a(!localr.j());
      bl().h();
      this.bb = localr.f();
      com.zend.ide.bd.c.b().e().a(paramString, true);
      long l1 = bm() * 1000;
      if (!localr.j())
        this.j.a(l1, l1);
    }
  }

  public void j()
  {
    L();
  }

  public void f(boolean paramBoolean)
  {
    this.C = paramBoolean;
    this.s.e();
  }

  public boolean bh()
  {
    return this.C;
  }

  static dk a(fk paramfk)
  {
    return paramfk.i;
  }

  static int a(fk paramfk, int paramInt)
  {
    return paramfk.u = paramInt;
  }

  static String a(fk paramfk, String paramString)
  {
    return paramfk.m = paramString;
  }

  static dj c(fk paramfk)
  {
    return paramfk.Z;
  }

  static boolean d(fk paramfk)
  {
    return paramfk.v;
  }

  static void e(fk paramfk)
  {
    paramfk.be();
  }

  static bn b(fk paramfk)
  {
    return paramfk.I;
  }

  static boolean a(fk paramfk)
  {
    return paramfk.T;
  }

  static boolean c(fk paramfk, boolean paramBoolean)
  {
    return paramfk.T = paramBoolean;
  }

  static boolean a(fk paramfk, boolean paramBoolean)
  {
    return paramfk.W = paramBoolean;
  }

  static boolean b(fk paramfk, boolean paramBoolean)
  {
    return paramfk.V = paramBoolean;
  }

  static boolean d(fk paramfk, boolean paramBoolean)
  {
    return paramfk.X = paramBoolean;
  }

  static ck b(fk paramfk)
  {
    return paramfk.U;
  }

  static String a(fk paramfk, String paramString, int paramInt)
  {
    return paramfk.f(paramString, paramInt);
  }

  static String c(fk paramfk)
  {
    return paramfk.p;
  }

  static com.zend.ide.util.c.f d(fk paramfk)
  {
    return paramfk.bg;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.fk
 * JD-Core Version:    0.6.0
 */