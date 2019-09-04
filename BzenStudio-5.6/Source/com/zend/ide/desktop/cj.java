package com.zend.ide.desktop;

import com.apple.mrj.MRJAboutHandler;
import com.apple.mrj.MRJApplicationUtils;
import com.apple.mrj.MRJOpenDocumentHandler;
import com.apple.mrj.MRJPrefsHandler;
import com.apple.mrj.MRJQuitHandler;
import com.zend.ide.d.bg;
import com.zend.ide.fb.q;
import com.zend.ide.h.bf;
import com.zend.ide.hb.ab;
import com.zend.ide.hb.fc;
import com.zend.ide.n.ck;
import com.zend.ide.o.fk;
import com.zend.ide.o.fn;
import com.zend.ide.o.fp;
import com.zend.ide.o.fx;
import com.zend.ide.o.n.o;
import com.zend.ide.p.ba;
import com.zend.ide.p.cd;
import com.zend.ide.r.p;
import com.zend.ide.util.bn;
import com.zend.ide.util.bv;
import com.zend.ide.util.ch;
import com.zend.ide.util.cl;
import com.zend.ide.util.dr;
import com.zend.ide.zendPlatformIntegration.a.hb;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.KeyboardFocusManager;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.tree.TreePath;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import sun.awt.shell.ShellFolder;

public class cj extends com.zend.ide.util.s
  implements bn, com.zend.ide.util.r, com.zend.ide.util.cu, MRJOpenDocumentHandler, MRJAboutHandler, MRJQuitHandler, MRJPrefsHandler
{
  private dz g;
  private fk h;
  private com.zend.ide.n.bw R;
  public fx S;
  private com.zend.ide.k.c i;
  private bn j = null;
  private com.zend.ide.util.bs k = new com.zend.ide.util.bs(this);
  private com.zend.ide.j.u m;
  private com.zend.ide.h.e n;
  public JFrame o;
  private String p = new File(com.zend.ide.util.cv.d()).getPath();
  private static String q = com.zend.ide.util.bi.a("CONF_FILE", "defaultconf.conf");
  private boolean r = true;
  private Object s;
  public static final String t = "examples/debugdemo/" + com.zend.ide.util.ct.a(437);
  static ea v;
  private z w;
  private bb x;
  private be y;
  private cf B;
  private bw C;
  private com.zend.ide.f.bp D;
  private ab f;
  private com.zend.ide.e.c F;
  private com.zend.ide.desktop.e.e T;
  private static cj Y;
  private fb Q;
  private com.zend.ide.w.l l;
  private com.zend.ide.desktop.e.a u;
  com.zend.ide.desktop.a.b O;
  private PropertyChangeListener G = new x(this, null);
  private PropertyChangeListener z = new bc(this, null);
  private PropertyChangeListener X = new et(this, null);
  private PropertyChangeListener E = new nc(this, null);
  private PropertyChangeListener K = new oc(this, null);
  private com.zend.ide.y.e H;
  private boolean I = false;
  public static bx J;
  ec P = new ec(this);
  boolean L = false;
  private Object U = new v(this);
  co M;
  private ArrayList A;

  static cj h()
  {
    if (Y == null)
      Y = new cj();
    return Y;
  }

  cj()
  {
    com.zend.ide.util.c.e.b().a(-1, new rb(this));
    com.zend.ide.util.c.e.b().a(0, new qb(this));
    com.zend.ide.util.c.e.b().a(2, new pb(this));
    com.zend.ide.util.c.e.b().a(3, new nb(this));
    V();
  }

  public synchronized void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    cl.a(paramBoolean2);
    com.zend.ide.p.e.f.h().e();
    this.Q = new fb();
    com.zend.ide.bd.c.a(this.Q);
    com.zend.ide.util.f.a locala = com.zend.ide.util.f.a.a;
    locala.b();
    com.zend.ide.util.f.f localf = locala.c();
    if (localf.a())
      System.exit(0);
    locala.a(new n(this));
    if ((!localf.b()) || (localf.f()) || (localf.g()))
    {
      com.zend.ide.util.dd.g();
      com.zend.ide.util.dd.c();
    }
    v = new ea();
    v.a(com.zend.ide.util.ct.a(442));
    v.a(com.zend.ide.util.ct.a(438));
    this.o = this.Q.h();
    this.o.setIconImage(com.zend.ide.util.cv.b("application32.gif").getImage());
    this.R = X();
    this.S = new fx(this.R);
    this.h = this.S.c();
    this.h.a(this);
    B();
    v.a(com.zend.ide.util.ct.a(439));
    this.D = com.zend.ide.f.bp.d();
    ToolTipManager.sharedInstance().setDismissDelay(60000);
    this.y = new be(l(), X(), this.D);
    new com.zend.ide.desktop.e.h(this);
    new com.zend.ide.gb.i(this);
    new com.zend.ide.hb.r(this);
    new fc(this);
    this.M = new co(this);
    this.g = new dz(this.Q.c());
    this.g.a(this);
    this.g.c(this);
    com.zend.ide.w.l.a(this);
    this.l = com.zend.ide.w.l.a();
    com.zend.ide.be.d locald = this.Q.c();
    com.zend.ide.be.i locali = new com.zend.ide.be.i(4);
    locali.a = true;
    com.zend.ide.be.l locall = locald.a(com.zend.ide.util.ct.a(1216), null, null, false, locali);
    locall.a(com.zend.ide.v.d.o, com.zend.ide.util.cv.b("editor_icon.gif"), X().c(), null, "EDITOR");
    locald.a("EditorComponent", locall);
    locall.a("hideAction");
    cl.a(" - opening (" + b() + ")");
    this.o.setDefaultCloseOperation(0);
    this.o.addWindowListener(new i(this));
    bl.a().a(l());
    bl.a().a(X());
    this.C = new bw(X());
    v.a(com.zend.ide.util.ct.a(440));
    f();
    v.a(com.zend.ide.util.ct.a(441));
    K();
    g();
    new com.zend.ide.desktop.d.a(this);
    new com.zend.ide.desktop.sb.a(this);
    d();
    b(paramBoolean1);
    if (!com.zend.ide.util.dd.b())
      try
      {
        synchronized (this)
        {
          wait();
        }
      }
      catch (Exception localException1)
      {
      }
    new br(X(), paramBoolean2);
    Runtime.getRuntime().addShutdownHook(new Thread(new r(this)));
    if (com.zend.ide.util.cr.c() == 3)
    {
      MRJApplicationUtils.registerOpenDocumentHandler(this);
      MRJApplicationUtils.registerAboutHandler(this);
      MRJApplicationUtils.registerQuitHandler(this);
      MRJApplicationUtils.registerPrefsHandler(this);
    }
    a();
    this.o.setVisible(true);
    com.zend.ide.util.bi.e = true;
    v.setVisible(false);
    v.dispose();
    o.a().b();
    com.zend.ide.o.n.f.a().a();
    if (this.s != null)
      try
      {
        l().c(this.s);
      }
      catch (Exception localException2)
      {
        cl.a(localException2);
        ba.a(this.Q.h(), com.zend.ide.util.ct.a(718), com.zend.ide.util.ct.a(94), 0);
        l().c(null);
      }
    if (X().e() == null)
      Z();
    h();
    Y();
    com.zend.ide.util.mc.a();
    bf();
    O();
    b();
    com.zend.ide.v.r.b().a((com.zend.ide.v.d)this.R);
    this.R.a().a(new com.zend.ide.m.m(this.R));
    this.R.a().a(new sc());
  }

  public com.zend.ide.w.l a()
  {
    return this.l;
  }

  public JMenu a(String paramString)
  {
    return this.g.b(paramString);
  }

  public String b()
  {
    String str;
    if (com.zend.ide.util.f.a.a.a())
      str = " Version";
    else
      str = "Version 5.5.1";
    return str;
  }

  private void a()
  {
    String str = com.zend.ide.util.bi.a("FIRST_TIME_LOADING");
    if ((str == null) || (!str.equals("TRUE")))
      return;
    com.zend.ide.util.bi.b("FIRST_TIME_LOADING", null);
    Object localObject2;
    if ((com.zend.ide.util.bi.a("PHP_MANUAL_PATH") != null) && (!com.zend.ide.util.bi.a("PHP_MANUAL_PATH").equals("")))
    {
      localObject1 = new File(com.zend.ide.util.bi.a("PHP_MANUAL_PATH")).getAbsolutePath();
      localObject1 = com.zend.ide.j.t.a((String)localObject1);
      com.zend.ide.y.b.a("editing.manualUrl").a(new com.zend.ide.util.cm("file:///" + (String)localObject1 + "/", true));
    }
    else
    {
      localObject1 = (com.zend.ide.util.cm)com.zend.ide.y.b.a("editing.manualUrl").c();
      localObject2 = null;
      try
      {
        localObject2 = new URL(((com.zend.ide.util.cm)localObject1).toString());
        File localFile = com.zend.ide.j.h.m.g(((URL)localObject2).getFile());
        if ((((com.zend.ide.util.cm)localObject1).b()) && (!localFile.exists()))
          com.zend.ide.y.b.a("editing.manualUrl").a();
      }
      catch (MalformedURLException localMalformedURLException)
      {
        cl.a(localMalformedURLException);
      }
    }
    if (com.zend.ide.util.cr.c() == 3)
    {
      localObject1 = (String)com.zend.ide.y.b.a("browser.commandLine").c();
      localObject2 = com.zend.ide.j.h.m.g((String)localObject1);
      if ((((String)localObject1).equals("./runExplorer.sh")) && (!((File)localObject2).exists()))
        com.zend.ide.y.b.a("browser.commandLine").a();
    }
    com.zend.ide.y.b.a("application.showTipsDialog").a();
    Object localObject1 = com.zend.ide.util.bi.a("SERVER_HOST");
    if ((localObject1 != null) && (!((String)localObject1).equals("")) && (!((String)localObject1).equals("\"\"")))
    {
      localObject1 = ((String)localObject1).substring(1, ((String)localObject1).length() - 1);
      com.zend.ide.util.bi.b("SERVER_HOST", "");
      if (((String)localObject1).indexOf("http://") == -1)
        localObject1 = "http://" + (String)localObject1;
      try
      {
        localObject2 = new bv((String)localObject1 + "/");
        com.zend.ide.y.b.a("debugging.serverHost").a(localObject2);
        com.zend.ide.y.b.a("debugging.localDebugging").a(Boolean.TRUE);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
    com.zend.ide.y.b.a("desktop.phpVersion").a();
    com.zend.ide.y.b.a("cvs.cvsCommandLine").a();
    com.zend.ide.y.b.a("svn.svnCommandLine").a();
  }

  public com.zend.ide.util.bs t()
  {
    return this.k;
  }

  private void g()
  {
    this.R.a(new eo());
  }

  private void b()
  {
    com.zend.ide.util.c.h.c().a(new s(this), true);
  }

  private void d()
  {
    if (this.O == null)
      this.O = new com.zend.ide.desktop.a.b(this.S.c(), this.S.a(), (com.zend.ide.l.g)l());
    l().a(this.O);
    l().a(new com.zend.ide.desktop.a.h(X()));
    l().a(new com.zend.ide.desktop.a.a(X()));
    l().a(this.l);
    l().a(new com.zend.ide.desktop.a.k((com.zend.ide.l.g)l()));
  }

  public void p()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (l().e())
    {
      str1 = l().f().b();
      localStringBuffer.append(str1);
      localStringBuffer.append(" - ");
    }
    localStringBuffer.append("Zend Development Environment");
    String str1 = X().k();
    if (str1 != null)
    {
      localStringBuffer.append(" - ");
      String str2 = X().l() ? "*" : "";
      localStringBuffer.append("[" + str1 + str2 + "]");
    }
    this.o.setTitle(localStringBuffer.toString());
  }

  protected void f()
  {
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.H = new com.zend.ide.y.e(localf);
    localf.a("desktop.language", this.G);
    this.H.a("desktop.language");
    localf.a("desktop.font", this.z);
    this.H.a("desktop.font");
    localf.a("completion.xhtmlTagStyle", this.K);
    this.H.a("completion.xhtmlTagStyle");
    if (com.zend.ide.p.e.f.g())
    {
      localf.a("desktop.laf", this.X);
      this.H.a("desktop.laf");
    }
    localf.a("desktop.antialiasing", this.E);
    this.H.a("desktop.antialiasing");
  }

  private void h(String paramString)
  {
    int i1 = ba.a(P(), com.zend.ide.util.ct.a(431), paramString, 0, 3);
    if (i1 == 0)
    {
      this.I = true;
      c(false);
    }
  }

  public com.zend.ide.util.bb q()
  {
    return this;
  }

  private void c()
  {
    this.T.e();
  }

  private void bb()
  {
    Object localObject1 = k();
    if (localObject1 != null)
    {
      File localFile1 = new File(this.p, "ftp");
      Object localObject2;
      if (!localFile1.exists())
      {
        localFile1.mkdirs();
      }
      else
      {
        localObject2 = localFile1.listFiles();
        for (int i1 = 0; i1 < localObject2.length; i1++)
          localObject2[i1].delete();
      }
      ListIterator localListIterator = ((ArrayList)localObject1).listIterator();
      while (localListIterator.hasNext())
      {
        com.zend.ide.u.cm localcm = ((com.zend.ide.u.bh)localListIterator.next()).D();
        File localFile2 = new File(localFile1, a(localcm));
        localObject2 = localFile2.getPath();
        try
        {
          com.a.f.a((String)localObject2, localcm);
        }
        catch (IOException localIOException)
        {
          cl.a(localIOException);
        }
      }
    }
  }

  private String a(com.zend.ide.u.cm paramcm)
  {
    String str = paramcm.a();
    if (str.endsWith(":"))
      str = str.substring(0, str.indexOf(":"));
    return str + ".xml";
  }

  public void j()
  {
    ObjectOutputStream localObjectOutputStream = null;
    try
    {
      bb();
      c();
      File localFile = new File(this.p, q);
      if (!localFile.getParentFile().exists())
        localFile.getParentFile().mkdirs();
      if (ch.d())
        ch.c();
      localObjectOutputStream = new ObjectOutputStream(new FileOutputStream(localFile));
      Object localObject1 = s();
      localObjectOutputStream.writeObject(localObject1);
      localObjectOutputStream.flush();
    }
    catch (Exception localException3)
    {
      cl.a(localException2);
    }
    finally
    {
      if (localObjectOutputStream != null)
        try
        {
          localObjectOutputStream.close();
        }
        catch (Exception localException4)
        {
        }
    }
  }

  private void bc()
  {
    File localFile1 = new File(this.p, "ftp");
    if (localFile1.exists())
    {
      File[] arrayOfFile = localFile1.listFiles();
      if ((arrayOfFile != null) && (arrayOfFile.length > 0))
      {
        Vector localVector = new Vector(arrayOfFile.length);
        for (int i1 = 0; i1 < arrayOfFile.length; i1++)
        {
          File localFile2 = arrayOfFile[i1];
          try
          {
            com.zend.ide.u.cm localcm = (com.zend.ide.u.cm)com.a.f.a(localFile2.getPath());
            com.zend.ide.u.k localk = new com.zend.ide.u.k();
            localk.a(localcm);
            localk.E();
            localVector.add(localk);
          }
          catch (SAXException localSAXException)
          {
            cl.a(localSAXException);
          }
          catch (ParserConfigurationException localParserConfigurationException)
          {
            cl.a(localParserConfigurationException);
          }
          catch (IOException localIOException)
          {
            cl.a(localIOException);
          }
          catch (com.zend.ide.util.dj localdj)
          {
            cl.a("Initializing FTP: " + localdj.getMessage());
          }
        }
        a(localVector);
      }
    }
  }

  public void b(boolean paramBoolean)
  {
    if (!paramBoolean)
      this.r = false;
    bc();
    FileInputStream localFileInputStream = null;
    try
    {
      File localFile = new File(this.p, q);
      localFileInputStream = new FileInputStream(localFile);
      ObjectInputStream localObjectInputStream = new ObjectInputStream(localFileInputStream);
      c(localObjectInputStream.readObject());
    }
    catch (FileNotFoundException localException2)
    {
      l().c(null);
    }
    catch (ClassNotFoundException localException3)
    {
      l().c(null);
    }
    catch (Exception localException5)
    {
      cl.a(localException4);
    }
    finally
    {
      if (localFileInputStream != null)
        try
        {
          localFileInputStream.close();
        }
        catch (Exception localException6)
        {
        }
    }
  }

  private Object k()
  {
    return com.zend.ide.j.h.m.f();
  }

  private void a(Object paramObject)
  {
    com.zend.ide.j.h.m.a(paramObject);
  }

  public Object s()
  {
    Object localObject1 = this.Q.c().f();
    Object localObject2 = l().s();
    Object localObject3 = this.w.b();
    Object localObject4 = this.x.b();
    Object localObject5 = N().r();
    String str1 = com.zend.ide.n.br.b();
    String str2 = com.zend.ide.n.br.d();
    Object localObject6 = this.u.b();
    return new Object[] { localObject1, localObject2, localObject3, localObject4, localObject5, str1, str2, localObject6 };
  }

  public void c(Object paramObject)
  {
    Object[] arrayOfObject = (Object[])(Object[])paramObject;
    if (arrayOfObject.length >= 8)
      this.u.a(arrayOfObject[7]);
    if (arrayOfObject.length >= 7)
      com.zend.ide.n.br.b((String)arrayOfObject[6]);
    if (arrayOfObject.length >= 6)
      com.zend.ide.n.br.a((String)arrayOfObject[5]);
    if (arrayOfObject.length >= 5)
      N().a(arrayOfObject[4]);
    if (arrayOfObject.length >= 4)
      this.x.a(arrayOfObject[3]);
    if (arrayOfObject.length >= 3)
      this.w.a(arrayOfObject[2]);
    this.Q.c().a(arrayOfObject[0]);
    if (this.r)
    {
      this.s = arrayOfObject[1];
      if ((this.s == null) || (((Object[])(Object[])this.s)[0] == null))
      {
        l().c(this.s);
        this.s = null;
      }
    }
    else
    {
      l().c(null);
    }
  }

  public com.zend.ide.l.v l()
  {
    if (J == null)
      J = new bx(this);
    return J.f();
  }

  public com.zend.ide.j.u u()
  {
    if (this.m == null)
      this.m = x();
    return this.m;
  }

  public com.zend.ide.h.e v()
  {
    if (this.n == null)
      this.n = y();
    return this.n;
  }

  public com.zend.ide.j.u x()
  {
    com.zend.ide.j.h localh = com.zend.ide.j.h.m;
    com.zend.ide.j.m localm = new com.zend.ide.j.m(localh.c(), com.zend.ide.j.m.m, localh);
    localm.a(this.P);
    return localm;
  }

  public com.zend.ide.h.e y()
  {
    bf localbf = new bf(u());
    localbf.putClientProperty("help_file", "zend_ide_helpfiles_and_project_management.htm");
    com.zend.ide.bc.a.a(localbf, "FILE_SYSTEM");
    com.zend.ide.util.bp.a(localbf);
    localbf.d("projectsTab");
    com.zend.ide.u.bs localbs = new com.zend.ide.u.bs(new t(this, new com.zend.ide.h.bs(localbf, true)));
    localbs.d("filesystem");
    localbs.a(new w(this, null));
    TreePath localTreePath = localbf.getPathForRow(0);
    localbf.expandPath(localTreePath);
    return localbs;
  }

  private com.zend.ide.k.c z()
  {
    if (this.i == null)
      this.i = A();
    return this.i;
  }

  private com.zend.ide.k.c A()
  {
    this.i = this.Q.f();
    this.i.c().setName("messagesComponent");
    com.zend.ide.util.bp.a(this.i);
    this.i.a(this);
    this.i.q().a(this);
    fn localfn = this.h.E();
    this.i.a(localfn, "DEBUG_MESSAGES");
    return this.i;
  }

  private void h()
  {
    k();
    i();
  }

  private void i()
  {
    if (com.zend.ide.util.f.a.a.b())
      com.zend.ide.y.b.a("debugging.localDebugging").a(new Boolean(false));
  }

  private void k()
  {
    if (com.zend.ide.util.f.a.a.b())
      new Thread(new dt(this)).start();
  }

  protected void K()
  {
    com.zend.ide.u.bs localbs = (com.zend.ide.u.bs)v();
    com.zend.ide.h.r localr = (com.zend.ide.h.r)localbs.f();
    com.zend.ide.h.e locale = localr.f();
    ActionMap localActionMap1 = this.h.C();
    ActionMap localActionMap2 = locale.n().getActionMap();
    ActionMap localActionMap3 = z().c().getActionMap();
    ActionMap localActionMap4 = this.h.D().getActionMap();
    ImageIcon localImageIcon = com.zend.ide.util.cv.b("platform_window.gif");
    com.zend.ide.be.i locali = new com.zend.ide.be.i(true, false, 1, 1.0D, 0, new Rectangle(150, 150, 200, 300));
    com.zend.ide.be.d locald = this.Q.c();
    com.zend.ide.be.l locall = locald.a(com.zend.ide.util.ct.a(1919), localImageIcon, null, false, locali);
    locald.a("PlatformEvents", locall);
    hb localhb = new hb(locall, this.R);
    ActionMap localActionMap5 = localhb.j();
    com.zend.ide.util.s locals1 = (com.zend.ide.util.s)this.h.E().q();
    com.zend.ide.util.s locals2 = (com.zend.ide.util.s)locale.q();
    com.zend.ide.util.s locals3 = (com.zend.ide.util.s)l().q();
    com.zend.ide.util.s locals4 = (com.zend.ide.util.s)X().q();
    this.u = new com.zend.ide.desktop.e.a(this);
    this.T = new com.zend.ide.desktop.e.e(this);
    this.w = new z(this, (ck)com.zend.ide.a.b.a(X(), "RecentFilesManagerTool"));
    this.x = new bb(this);
    this.B = new cf(this);
    Object localObject1 = localActionMap4.get(com.zend.ide.g.m.k);
    a("keys.showInBrowser", (Action)localObject1, "default", false);
    localObject1 = locals4.a("keys.openDocument");
    a("keys.openDocument", (Action)localObject1, "default", false);
    localObject1 = locals4.a("keys.saveFile");
    a("keys.saveFile", (Action)localObject1, "default", false);
    localObject1 = locals4.a("keys.saveAll");
    a("keys.saveAll", (Action)localObject1, "default", false);
    localObject1 = locals4.a("keys.saveAs");
    a("keys.saveAs", (Action)localObject1, "default", false);
    localObject1 = locals4.a("keys.newDocument");
    a("keys.newDocument", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("OpenDebugWindowAction");
    a("keys.showDebugWindow", (Action)localObject1, "default", false);
    localObject1 = localActionMap5.get("OpenZendPlatformWindowAction");
    a("keys.showZendPlatformWindow", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("ToggleOutputAreaAction");
    a("keys.toggleOutputArea", (Action)localObject1, "default", false);
    localObject1 = localActionMap3.get("openNextEntryActionKey");
    a("keys.openNextEntry", (Action)localObject1, "default", false);
    localObject1 = new dl(this);
    a("keys.toggleDebugMessagesArea", (Action)localObject1, "default", false);
    localObject1 = new fd(this);
    a("keys.toggleInspectorsWindow", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("testServerConnectionAction");
    a("keys.serverConnection", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("debugURLAction");
    a("keys.debugURL", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("profileURLAction");
    a("keys.profileURL", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("FinishDebugAction");
    a("keys.finishDebugger", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("PauseAction");
    a("keys.pauseDebugger", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("StepOutAction");
    a("keys.stepOut", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("StepIntoAction");
    a("keys.stepInto", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("StepOverAction");
    a("keys.stepOver", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("AddWatchAction");
    a("keys.addWatch", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("RemoveAllBreakpointsAction");
    a("keys.removeAllBreakpoints", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("GoAction");
    a("keys.go", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("RunAction");
    a("keys.run", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("GoToCursorAction");
    a("keys.gotoCursor", (Action)localObject1, "default", false);
    localObject1 = localActionMap1.get("tunnelingDialogAction");
    a("keys.showTunnelingOptions", (Action)localObject1, "default", false);
    localObject1 = localbs.q().a("keys.addFTPServer");
    a("keys.addFTPServer", (Action)localObject1, "default", false);
    localObject1 = new cv(this);
    a("keys.exitApplication", (Action)localObject1, "default", false);
    localObject1 = new cy(this);
    a("keys.openCustomizationTool", (Action)localObject1, "default", false);
    localObject1 = new dj(this, false, 1);
    ei localei = new ei(this, null);
    eq localeq = new eq(this, null);
    dr localdr1 = new dr(this, new dj(this, true, 1), localei);
    dr localdr2 = new dr(this, new dj(this, true, 2), localeq);
    localei.b(localdr1);
    localeq.b(localdr2);
    localActionMap2.put("SearchFileSystemAction", localdr1);
    locals2.a(localei);
    locals2.a("keys.findInFiles", localdr1, "directory", true);
    locals2.a("keys.findInFiles", localdr1, "root", true);
    locals3.a("keys.findInFiles", localdr2, "directory", true);
    locals3.a("keys.findInFiles", localdr2, "root", true);
    a("keys.findInFiles", (Action)localObject1, "default", false);
    localObject1 = new dc(this);
    a("keys.openHelpTicket", (Action)localObject1, "default", false);
    localObject1 = new df(this);
    a("Keys.rebuildCodeCompletionDB", (Action)localObject1, "default", false);
    localObject1 = new cr(this);
    a("keys.about", (Action)localObject1, "default", false);
    localObject1 = new da(this);
    a("keys.showExplorer", (Action)localObject1, "default", false);
    localObject1 = new ct(this, true);
    a("keys.configureDebugServer", (Action)localObject1, "default", false);
    localObject1 = new db(this);
    a("keys.feedbackForm", (Action)localObject1, "default", false);
    localObject1 = new di(this);
    a("keys.registery", (Action)localObject1, "default", false);
    localObject1 = new cw(this);
    a("keys.openAcceleratorPage", (Action)localObject1, "default", false);
    localObject1 = new cz(this);
    a("keys.openEncoderPage", (Action)localObject1, "default", false);
    localObject1 = new dd(this);
    a("keys.openTipOfTheDayPage", (Action)localObject1, "default", false);
    localObject1 = new eb(this);
    a("keys.openAutoUpdateDialog", (Action)localObject1, "default", false);
    localObject1 = new cu(this);
    locals1.a("keys.customizeDebugMessages", (Action)localObject1, "debug_messages", true);
    a("keys.customizeDebugMessages", (Action)localObject1, "debug_messages", false);
    localObject1 = new e(this);
    a("keys.openUserGuide", (Action)localObject1, "default", false);
    localObject1 = new u(this);
    a("help.CSH", (Action)localObject1, "default", false);
    localObject1 = new uc(this);
    a("keys.proxySettings", (Action)localObject1, "default", false);
    KeyStroke localKeyStroke1 = KeyStroke.getKeyStroke(27, 0);
    c().getActionMap().put("CloseWindowsAction", new cs(this));
    c().getInputMap(2).put(localKeyStroke1, "CloseWindowsAction");
    c().getInputMap(0).put(localKeyStroke1, "cancel");
    KeyStroke localKeyStroke2 = KeyStroke.getKeyStroke(27, 1);
    c().getActionMap().put("ShowWindowsAction", new f(this));
    c().getInputMap(2).put(localKeyStroke2, "ShowWindowsAction");
    Object localObject2 = null;
    locali = new com.zend.ide.be.i(true, false, 2, 1.0D, 0, new Rectangle(100, 100, 200, 300));
    localImageIcon = new ImageIcon(com.zend.ide.util.n.c().b("keys.toggleOutputArea"));
    localObject2 = locald.a(com.zend.ide.util.ct.a(1217), localImageIcon, null, this.h.D(), false, locali, "DEBUG_OUTPUT_WINDOW");
    locald.a("DebugOutput", (com.zend.ide.be.h)localObject2);
    boolean bool = q.d();
    if (bool)
    {
      this.h.D().a(bool);
      localObject3 = new ButtonGroup();
      localObject4 = this.h.D().b();
      JToggleButton localJToggleButton = new JToggleButton(com.zend.ide.util.ct.a(1698), (Icon)((Action)localObject4).getValue("SmallIcon"));
      localJToggleButton.addActionListener((ActionListener)localObject4);
      localJToggleButton.setToolTipText((String)((Action)localObject4).getValue("Name"));
      ((Action)localObject4).putValue("Name", null);
      localJToggleButton.setPreferredSize(new Dimension(24, 22));
      ((com.zend.ide.be.h)localObject2).a("HTMLOutput", localJToggleButton);
      ((ButtonGroup)localObject3).add(localJToggleButton);
      ((ButtonGroup)localObject3).setSelected(localJToggleButton.getModel(), true);
      com.zend.ide.bc.a.a(localJToggleButton, "DEBUG_OUTPUT_WINDOW");
      localObject4 = this.h.D().c();
      localJToggleButton = new JToggleButton(com.zend.ide.util.ct.a(238), (Icon)((Action)localObject4).getValue("SmallIcon"));
      localJToggleButton.addActionListener((ActionListener)localObject4);
      localJToggleButton.setToolTipText((String)((Action)localObject4).getValue("Name"));
      ((Action)localObject4).putValue("Name", null);
      localJToggleButton.setPreferredSize(new Dimension(24, 22));
      ((com.zend.ide.be.h)localObject2).a("BrowserOutput", localJToggleButton);
      ((ButtonGroup)localObject3).add(localJToggleButton);
      com.zend.ide.bc.a.a(localJToggleButton, "DEBUG_OUTPUT_WINDOW");
    }
    locali = new com.zend.ide.be.i(true, false, 1, 1.0D, 1, new Rectangle(200, 200, 200, 300));
    localImageIcon = new ImageIcon(com.zend.ide.util.n.c().b("keys.showDebugWindow"));
    localObject2 = locald.a(com.zend.ide.util.ct.a(1219), localImageIcon, null, false, locali);
    locald.a("DebugWindow", (com.zend.ide.be.h)localObject2);
    Object localObject3 = this.h.bn();
    localImageIcon = com.zend.ide.util.cv.b("variableview.gif");
    Object localObject4 = new cd(((com.zend.ide.o.bx)localObject3).e());
    ((com.zend.ide.be.l)localObject2).a(com.zend.ide.util.ct.a(102), localImageIcon, (Component)localObject4, null, "VARIABLES");
    localImageIcon = com.zend.ide.util.cv.b("watchview.gif");
    localObject4 = new cd(((com.zend.ide.o.bx)localObject3).d());
    ((com.zend.ide.be.l)localObject2).a(com.zend.ide.util.ct.a(101), localImageIcon, (Component)localObject4, null, "WATCHES");
    localImageIcon = com.zend.ide.util.cv.b("stack.gif");
    localObject4 = new cd(((com.zend.ide.o.bx)localObject3).a());
    ((com.zend.ide.be.l)localObject2).a(com.zend.ide.util.ct.a(100), localImageIcon, (Component)localObject4, null, "STACK");
    localImageIcon = com.zend.ide.util.cv.b("breakpointsview.gif");
    localObject4 = new cd(((com.zend.ide.o.bx)localObject3).b());
    ((com.zend.ide.be.l)localObject2).a(com.zend.ide.util.ct.a(99), localImageIcon, (Component)localObject4, null, "BREAKPOINTS");
    localImageIcon = com.zend.ide.util.cv.b("outputbufferview.gif");
    localObject4 = ((com.zend.ide.o.bx)localObject3).f();
    ((com.zend.ide.be.l)localObject2).a(com.zend.ide.util.ct.a(449), localImageIcon, (Component)localObject4, null, "OUTPUT_BUFFER");
  }

  public void c(boolean paramBoolean)
  {
    if (this.L)
      return;
    if (d(paramBoolean))
    {
      if (this.I)
        L();
      this.L = true;
      cl.a(" - closing (" + b() + ")");
      if (!paramBoolean)
        System.exit(0);
    }
  }

  private void L()
  {
    try
    {
      String str1 = "";
      if (com.zend.ide.util.cr.c() == 3)
        str1 = "-ignoreOtherIDE";
      String str2 = com.zend.ide.util.bi.a("OS_SYSTEM_ROOT", "");
      String[] arrayOfString = { "SystemRoot=" + str2, str1 };
      String str3 = com.zend.ide.util.bi.a("EXEC_FILE");
      Process localProcess;
      if (com.zend.ide.util.cr.c() == 1)
        localProcess = Runtime.getRuntime().exec(str3, arrayOfString);
      else
        localProcess = Runtime.getRuntime().exec(str3);
      y localy = new y(localProcess);
      new Thread(localy).start();
    }
    catch (Exception localException)
    {
      JOptionPane.showMessageDialog(this.o, com.zend.ide.util.ct.a(443), com.zend.ide.util.ct.a(444), 0);
    }
  }

  private void M()
  {
    if (this.Q.h() != null)
      this.F = new com.zend.ide.e.c(this.Q.h());
    else
      this.F = new com.zend.ide.e.c(new JFrame());
    this.F.a(new bd(this, null));
  }

  public com.zend.ide.e.c N()
  {
    if (this.F == null)
      M();
    return this.F;
  }

  public void bf()
  {
    boolean bool = ((Boolean)com.zend.ide.y.b.a("application.showUpdateDialog").c()).booleanValue();
    if (bool)
    {
      com.zend.ide.i.x localx = new com.zend.ide.i.x(this.Q.h());
      localx.f();
    }
  }

  public void O()
  {
    boolean bool = ((Boolean)com.zend.ide.y.b.a("application.showTipsDialog").c()).booleanValue();
    if (bool)
    {
      com.zend.ide.e.c localc = N();
      localc.g();
    }
  }

  public bg P()
  {
    synchronized (this.U)
    {
      if (this.j == null)
      {
        this.j = new bg();
        com.zend.ide.util.bp.a(this.j);
        this.j.a(this);
        this.Q.a((bg)this.j);
      }
    }
    return (bg)this.j;
  }

  public void Q()
  {
    bg localbg = P();
    localbg.f();
    localbg.setVisible(true);
    this.Q.h().validate();
  }

  public void a(int paramInt)
  {
    bg localbg = P();
    localbg.f();
    localbg.a(paramInt);
    localbg.setVisible(true);
    this.Q.h().validate();
  }

  public void a(String paramString1, String paramString2)
  {
    if (this.M == null)
      this.M = new co(this);
    this.M.a(paramString1, paramString2);
  }

  public void R()
  {
    com.zend.ide.be.d locald = this.Q.c();
    locald.a("FileManagerWindowID", !locald.c("FileManagerWindowID"));
  }

  public boolean S()
  {
    com.zend.ide.be.d locald = this.Q.c();
    return locald.c("MessageComponent");
  }

  public boolean a()
  {
    return this.h.d();
  }

  public void e(boolean paramBoolean)
  {
    if (paramBoolean == S())
      return;
    com.zend.ide.be.d locald = this.Q.c();
    locald.a("MessageComponent", paramBoolean);
  }

  public boolean E()
  {
    com.zend.ide.be.d locald = this.Q.c();
    return locald.c(com.zend.ide.util.ct.a(1222));
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean == E())
      return;
    com.zend.ide.be.d locald = this.Q.c();
    locald.a(com.zend.ide.util.ct.a(1222), paramBoolean);
  }

  public boolean d(boolean paramBoolean)
  {
    boolean bool1 = true;
    if (!paramBoolean)
    {
      if (!l().d(paramBoolean))
        return false;
      boolean bool2 = l().e();
      if (bool2)
        bool1 = this.h.d(true);
      else
        bool1 = this.h.d(false);
    }
    if (bool1)
    {
      try
      {
        com.zend.ide.y.b.a("debugging.tunnelRandomPort", new Integer(-1));
        com.zend.ide.y.b.d();
        p.e().i();
        com.zend.ide.bf.r.b().f();
        if (com.zend.ide.eb.j.a())
          com.zend.ide.eb.j.a().e();
        if (com.zend.ide.bc.c.b())
          com.zend.ide.bc.c.a().e();
        if (l().f() != null)
          com.zend.ide.util.b.e.a().b(l().f().c());
      }
      catch (Exception localException1)
      {
        cl.a(localException1);
      }
      try
      {
        j();
      }
      catch (Exception localException2)
      {
        cl.a(localException2);
      }
    }
    return bool1;
  }

  public JComponent c()
  {
    return this.o.getRootPane();
  }

  public void d(String paramString)
  {
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public String r()
  {
    return null;
  }

  public void a(bn parambn)
  {
  }

  private static void V()
  {
    com.zend.ide.desktop.b.b localb = new com.zend.ide.desktop.b.b();
    localb.a(new com.zend.ide.desktop.b.f());
    localb.a(new com.zend.ide.desktop.b.a());
    localb.a(new com.zend.ide.desktop.b.j());
    localb.a(new com.zend.ide.desktop.b.l());
    localb.j().a(com.zend.ide.desktop.b.n.d, -1);
    localb.j().a(com.zend.ide.desktop.b.e.e, 0);
    localb.j().a(com.zend.ide.desktop.b.d.e, 2);
    localb.j().a(com.zend.ide.desktop.b.m.d, 3);
    localb.a();
  }

  public ab l()
  {
    if (this.f == null)
      this.f = new ab(this.Q.h());
    return this.f;
  }

  public com.zend.ide.n.bw X()
  {
    if (this.R == null)
    {
      this.R = new com.zend.ide.v.d();
      com.zend.ide.util.bp.a(this.R);
      this.R.c().setName("editorComponent");
    }
    return this.R;
  }

  public boolean a(String paramString, com.zend.ide.util.bh parambh, int paramInt)
  {
    boolean bool = false;
    try
    {
      if (a(paramString))
      {
        Boolean localBoolean = (Boolean)com.zend.ide.y.b.a("desktop.internalBrowser");
        if (localBoolean == null)
          localBoolean = Boolean.valueOf(false);
        com.zend.ide.bd.c.b().e().a(paramString, localBoolean.booleanValue());
        return true;
      }
      bool = X().a(paramString, parambh, paramInt);
    }
    catch (com.zend.ide.util.dj localdj)
    {
      com.zend.ide.util.a.b.a(localdj);
    }
    return bool;
  }

  private boolean a(String paramString)
  {
    if ((!paramString.startsWith("http://")) && (!paramString.startsWith("https://")))
      return false;
    try
    {
      URL localURL = new URL(paramString);
    }
    catch (MalformedURLException localMalformedURLException)
    {
      return false;
    }
    return true;
  }

  public void a(String paramString, int paramInt)
  {
    g(paramString);
    X().a(paramString, null, -1);
    SwingUtilities.invokeLater(new cq(this, paramInt));
  }

  public void Y()
  {
    SwingUtilities.invokeLater(new cc(this));
  }

  public void Z()
  {
    X().f();
  }

  public void g(String paramString)
  {
    com.zend.ide.j.s locals = com.zend.ide.j.h.m.h(paramString);
    if ((locals instanceof com.zend.ide.u.bh))
    {
      com.zend.ide.u.bh localbh = (com.zend.ide.u.bh)locals;
      if (!localbh.v().h())
        try
        {
          com.zend.ide.u.bd.a(this.o, localbh, false, false, null);
        }
        catch (Exception localException)
        {
        }
    }
  }

  private void B()
  {
    ee localee1 = new ee(this, "The People Behind the Scenes", "com/zend/ide/util/ab.sh");
    ee localee2 = new ee(this, "Zend Studio Team", "com/zend/ide/util/ac.sh");
    JComponent localJComponent = (JComponent)this.o.getContentPane();
    localJComponent.getActionMap().put("ShowZendImageDialogAction", localee1);
    localJComponent.getActionMap().put("ShowTeamImageDialogAction", localee2);
    KeyStroke localKeyStroke1 = KeyStroke.getKeyStroke(90, 3);
    localJComponent.getInputMap(1).put(localKeyStroke1, "ShowZendImageDialogAction");
    KeyStroke localKeyStroke2 = KeyStroke.getKeyStroke(84, 3);
    localJComponent.getInputMap(1).put(localKeyStroke2, "ShowTeamImageDialogAction");
  }

  private boolean a(File paramFile)
  {
    if (((paramFile instanceof ShellFolder)) && (com.zend.ide.util.cr.c() == 1))
    {
      String str = ((ShellFolder)paramFile).getDisplayName();
      return (str.equals("My Computer")) || (str.equals("My Network Places")) || (str.equals("Entire Network"));
    }
    return false;
  }

  public void handleOpenFile(File paramFile)
  {
    a(paramFile.getPath(), null, 0);
  }

  public void handleQuit()
  {
    c(false);
  }

  public void handlePrefs()
  {
    Q();
  }

  public void handleAbout()
  {
    du localdu = new du(this.o);
    localdu.setVisible(true);
  }

  static void a(cj paramcj)
  {
    paramcj.h();
  }

  static void a(cj paramcj, String paramString)
  {
    paramcj.h(paramString);
  }

  static fb a(cj paramcj)
  {
    return paramcj.Q;
  }

  static String b(cj paramcj)
  {
    return paramcj.p;
  }

  static String a(cj paramcj, com.zend.ide.u.cm paramcm)
  {
    return paramcj.a(paramcm);
  }

  static com.zend.ide.desktop.e.e c(cj paramcj)
  {
    return paramcj.T;
  }

  static fk d(cj paramcj)
  {
    return paramcj.h;
  }

  static ArrayList a(cj paramcj, ArrayList paramArrayList)
  {
    return paramcj.A = paramArrayList;
  }

  static ArrayList e(cj paramcj)
  {
    return paramcj.A;
  }

  static com.zend.ide.n.bw f(cj paramcj)
  {
    return paramcj.R;
  }

  static be g(cj paramcj)
  {
    return paramcj.y;
  }

  static com.zend.ide.h.e h(cj paramcj)
  {
    return paramcj.n;
  }

  static dz i(cj paramcj)
  {
    return paramcj.g;
  }

  static z j(cj paramcj)
  {
    return paramcj.w;
  }

  static com.zend.ide.e.c k(cj paramcj)
  {
    return paramcj.F;
  }

  static boolean a(cj paramcj, File paramFile)
  {
    return paramcj.a(paramFile);
  }

  static
  {
    mc localmc = new mc();
    KeyboardFocusManager.setCurrentKeyboardFocusManager(localmc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.cj
 * JD-Core Version:    0.6.0
 */