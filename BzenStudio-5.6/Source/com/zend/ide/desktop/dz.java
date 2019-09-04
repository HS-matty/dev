package com.zend.ide.desktop;

import com.zend.ide.be.d;
import com.zend.ide.p.e.f;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bo;
import com.zend.ide.util.bp;
import com.zend.ide.util.br;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.cn;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import com.zend.ide.util.dl;
import com.zend.ide.util.dp;
import com.zend.ide.util.ec;
import com.zend.ide.util.n;
import com.zend.ide.util.o;
import com.zend.ide.util.r;
import com.zend.ide.util.s;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.MenuElement;

public class dz
  implements r, com.zend.ide.util.bq, bo, bn, cu
{
  private Set d = new HashSet();
  private bs e;
  private s f;
  private bu a = null;
  private bn j = null;
  private Map k = null;
  private HashMap b = new HashMap();
  private ArrayList o = new ArrayList(150);
  private Hashtable p = new Hashtable(150);
  private Action s = new ec();
  private JMenuBar n;
  private HashMap c = new HashMap();
  private JToolBar g;
  private d h;

  public dz(d paramd)
  {
    this.h = paramd;
    b();
    this.g = paramd.c();
    com.zend.ide.bc.a.a(this.g, "TOOLBAR");
    this.n = paramd.d();
    com.zend.ide.bc.a.a(this.n, "TOOLBAR");
    d();
    this.f = new s();
    bp.a(this);
    this.e = new bt(this);
    c(this);
    this.a = new bu(this, null);
    n.a(this.a);
  }

  private void b()
  {
    this.d.add("textComponent");
    this.d.add("editor");
    this.d.add("outputComponent");
    this.d.add("filesystem");
    this.d.add("projectsTab");
    this.d.add("file");
    this.d.add("directory");
    this.d.add("multipleSelection");
    this.d.add("breakpointCompoent");
    this.d.add("watch");
    this.d.add("debugger");
    this.d.add("variable");
    this.d.add("debuggerWindow");
    this.d.add("debug_messages");
    this.d.add("platform_events_list");
    this.d.add("cvs_messages");
    this.d.add("find_in_files_messages");
    this.d.add("fileBrowser");
    this.d.add("classBrowser");
    this.d.add("phpFunctionsBrowser");
  }

  public bs t()
  {
    return this.e;
  }

  private void d()
  {
    a("fileMenu", ct.b(122));
    a("editMenu", ct.b(123));
    a("searchMenu", ct.b(124));
    a("goToMenu", ct.b(542));
    a("projectMenu", ct.b(125));
    a("viewMenu", ct.b(126));
    a("debugMenu", ct.b(127));
    a("toolsMenu", ct.b(128));
    a("helpMenu", ct.b(129));
    a("systemToolBar");
    a("editToolBar");
    a("searchToolBar");
    a("gotoToolBar");
    a("gotoFileToolBar");
    a("debugToolBar");
    a("externalToolsBar");
    a("addonsToolsBar");
    a("propertiesToolBar");
    a("helpToolBar");
    a("keys.newDocument", "fileMenu", "systemToolBar");
    a("keys.openDocument", "fileMenu", "systemToolBar");
    a("keys.closeDocument", "fileMenu", null);
    a("keys.closeAll", "fileMenu", null);
    a("keys.saveFile", "fileMenu", "systemToolBar");
    a("keys.saveAs", "fileMenu", null);
    a("keys.saveAll", "fileMenu", null);
    JMenu localJMenu1 = new JMenu();
    dm localdm = new dm(ct.b(671), null);
    localJMenu1.setAction(localdm);
    localJMenu1.setIcon(cv.b("null16.gif"));
    a("fileMenu", "recentProjectsMenu", localJMenu1);
    new bv(localJMenu1, null);
    JMenu localJMenu2 = new JMenu();
    localdm = new dm(ct.b(727), null);
    localJMenu2.setAction(localdm);
    localJMenu2.setIcon(cv.b("null16.gif"));
    a("fileMenu", "keys.recentFilesMenu", localJMenu2);
    new bv(localJMenu2, null);
    a("keys.showRecentFiles", "fileMenu", null);
    a("keys.openProject", "fileMenu", null);
    a("keys.closeProject", "fileMenu", null);
    a("keys.addFTPServer", "fileMenu", null);
    a("keys.print", "fileMenu", null);
    a("keys.exitApplication", "fileMenu", null);
    a("keys.cut", "editMenu", "editToolBar");
    a("keys.copy", "editMenu", "editToolBar");
    a("keys.paste", "editMenu", "editToolBar");
    a("keys.selectAll", "editMenu", null);
    a("keys.reformatCode", "editMenu", null);
    a("keys.toggleLineWrap", "editMenu", null);
    a("keys.folding*keys.foldNonPHP", "editMenu", null);
    a("keys.folding*keys.foldClasses", "editMenu", null);
    a("keys.folding*keys.foldFunctions", "editMenu", null);
    a("keys.folding*keys.foldDocs", "editMenu", null);
    a("keys.folding*keys.collapseInScope", "editMenu", null);
    a("keys.folding*keys.expandAllFolds", "editMenu", null);
    a("keys.folding*keys.collapseAllFolds", "editMenu", null);
    a("keys.undo", "editMenu", "editToolBar");
    a("keys.redo", "editMenu", "editToolBar");
    a("keys.toLowerCase", "editMenu", null);
    a("keys.toUpperCase", "editMenu", null);
    a("keys.duplicateSelection", "editMenu", null);
    a("keys.eraseLine", "editMenu", null);
    a("keys.addRemoveComment", "editMenu", null);
    a("keys.addRemovePHPBlockComment", "editMenu", null);
    a("keys.codeSnippets", "editMenu", null);
    a("keys.newCodeSnippet", "editMenu", null);
    a("keys.toggleBookmark", "editMenu", null);
    a("keys.removeAllBookmarks", "editMenu", null);
    a("keys.openBookmarksDialog", "editMenu", null);
    a("keys.html*keys.breakTag", "editMenu", null);
    a("keys.html*keys.nbspTag", "editMenu", null);
    a("keys.html*keys.boldTag", "editMenu", null);
    a("keys.html*keys.italicTag", "editMenu", null);
    a("keys.html*keys.heading1Tag", "editMenu", null);
    a("keys.html*keys.heading2Tag", "editMenu", null);
    a("keys.html*keys.heading3Tag", "editMenu", null);
    a("keys.find", "searchMenu", "searchToolBar");
    a("keys.replace", "searchMenu", "searchToolBar");
    a("keys.find-next", "searchMenu", null);
    a("keys.find-prev", "searchMenu", null);
    a("keys.findInFiles", "searchMenu", null);
    a("keys.gotoFile", "goToMenu", "gotoFileToolBar");
    a("keys.gotoResource", "goToMenu", "gotoFileToolBar");
    a("keys.gotoLine", "goToMenu", null);
    a("keys.findMatchingBracket", "goToMenu", null);
    a("keys.gotoNextBookmark", "goToMenu", null);
    a("keys.gotoNextProjectBookmark", "goToMenu", null);
    a("keys.back", "goToMenu", "gotoToolBar");
    a("keys.forward", "goToMenu", "gotoToolBar");
    a("keys.openNextEntry", "goToMenu", null);
    a("keys.newProject", "projectMenu", null);
    a("keys.openProject", "projectMenu", null);
    a("keys.saveProject", "projectMenu", null);
    a("keys.closeProject", "projectMenu", null);
    a("keys.checkIncludes", "projectMenu", null);
    a("keys.addExistingToProject", "projectMenu", null);
    a("keys.openUserGuide", "helpMenu", "helpToolBar");
    a("keys.openTipOfTheDayPage", "helpMenu", null);
    a("keys.openAutoUpdateDialog", "helpMenu", null);
    if ((!com.zend.ide.util.f.a.a.a()) && ("".equals("")))
      a("keys.openHelpTicket", "helpMenu", null);
    a("keys.feedbackForm", "helpMenu", null);
    if ("".equals(""))
      a("keys.registery", "helpMenu", null);
    a("keys.openEncoderPage", "helpMenu", null);
    a("keys.openAcceleratorPage", "helpMenu", null);
    a("keys.about", "helpMenu", null);
    a("help.CSH", null, "helpToolBar");
    a("keys.showExplorer", "viewMenu", null);
    a("keys.toggleDebugMessagesArea", "viewMenu", null);
    a("keys.showDebugWindow", "viewMenu", null);
    a("keys.showZendPlatformWindow", "viewMenu", null);
    a("keys.toggleOutputArea", "viewMenu", null);
    a("keys.toggleInspectorsWindow", "viewMenu", null);
    a("keys.openCustomizationTool", "toolsMenu", "propertiesToolBar");
    a("keys.serverConnection", "toolsMenu", null);
    a("keys.debugURL", "toolsMenu", null);
    a("keys.profileURL", "toolsMenu", null);
    a("keys.showTunnelingOptions", "toolsMenu", null);
    a("Keys.rebuildCodeCompletionDB", "toolsMenu", null);
    a("keys.proxySettings", "toolsMenu", null);
    a("keys.configureDebugServer", "toolsMenu", "externalToolsBar");
    a("keys.showProjectProperties", "projectMenu", null);
    a("keys.encodeProject", "toolsMenu", "externalToolsBar");
    a("keys.cvs*keys.update", "toolsMenu", null);
    a("keys.cvs*keys.commit", "toolsMenu", null);
    a("keys.cvs*keys.add", "toolsMenu", null);
    a("keys.cvs*keys.status", "toolsMenu", null);
    a("keys.cvs*keys.diff", "toolsMenu", null);
    a("keys.cvs*keys.log", "toolsMenu", null);
    a("keys.cvs*keys.checkout", "toolsMenu", null);
    a("keys.svn*keys.update", "toolsMenu", null);
    a("keys.svn*keys.commit", "toolsMenu", null);
    a("keys.svn*keys.add", "toolsMenu", null);
    a("keys.svn*keys.delete", "toolsMenu", null);
    a("keys.svn*keys.revert", "toolsMenu", null);
    a("keys.svn*keys.resolve", "toolsMenu", null);
    a("keys.svn*keys.status", "toolsMenu", null);
    a("keys.svn*keys.diff", "toolsMenu", null);
    a("keys.svn*keys.log", "toolsMenu", null);
    a("keys.svn*keys.checkout", "toolsMenu", null);
    a("keys.phpDoc", "toolsMenu", null);
    a("keys.wsdlCreatorTool", "toolsMenu", null);
    a("keys.toggleBreakpoint", "debugMenu", null);
    a("keys.addWatch", "debugMenu", null);
    a("keys.removeAllBreakpoints", "debugMenu", null);
    a("keys.stepOver", "debugMenu", "debugToolBar");
    a("keys.stepOut", "debugMenu", "debugToolBar");
    a("keys.stepInto", "debugMenu", "debugToolBar");
    a("keys.go", "debugMenu", "debugToolBar");
    a("keys.gotoCursor", "debugMenu", "debugToolBar");
    a("keys.run", "debugMenu", "debugToolBar");
    a("keys.serverConnection", "debugMenu", null);
    a("keys.debugURL", "debugMenu", null);
    a("keys.profileURL", "debugMenu", null);
    a("keys.showTunnelingOptions", "debugMenu", null);
    a("keys.showInBrowser", "debugMenu", null);
    a("keys.finishDebugger", "debugMenu", "debugToolBar");
    a("keys.pauseDebugger", "debugMenu", "debugToolBar");
    a("keys.codeAnalyzer", "toolsMenu", "addonsToolsBar");
    ArrayList localArrayList = (ArrayList)this.c.get("systemToolBar");
    a(localArrayList, true);
    localArrayList = (ArrayList)this.c.get("editToolBar");
    a(localArrayList, true);
    localArrayList = (ArrayList)this.c.get("searchToolBar");
    a(localArrayList, true);
    localArrayList = (ArrayList)this.c.get("gotoFileToolBar");
    a(localArrayList, true);
    localArrayList = (ArrayList)this.c.get("gotoToolBar");
    a(localArrayList, true);
    localArrayList = (ArrayList)this.c.get("debugToolBar");
    a(localArrayList, true);
    localArrayList = (ArrayList)this.c.get("addonsToolsBar");
    a(localArrayList, true);
    localArrayList = (ArrayList)this.c.get("externalToolsBar");
    a(localArrayList, true);
    localArrayList = (ArrayList)this.c.get("propertiesToolBar");
    a(localArrayList, true);
    localArrayList = (ArrayList)this.c.get("helpToolBar");
    a(localArrayList, true);
  }

  private void a(ArrayList paramArrayList, boolean paramBoolean)
  {
    Iterator localIterator = paramArrayList.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (AbstractButton)localIterator.next();
      this.g.add((Component)localObject);
    }
    if (paramBoolean)
    {
      localObject = new Dimension(2, 22);
      this.g.addSeparator((Dimension)localObject);
    }
  }

  private void a(String paramString)
  {
    this.c.put(paramString, new ArrayList());
  }

  private void a(String paramString1, String paramString2)
  {
    int i = paramString2.indexOf("&");
    boolean bool = f.h().i();
    if (i != -1)
      try
      {
        paramString2 = paramString2.substring(0, i) + paramString2.substring(i + 1, paramString2.length());
      }
      catch (Exception localException)
      {
      }
    JMenu localJMenu = new JMenu(paramString2);
    if ((i != -1) && (!bool))
      localJMenu.setMnemonic(paramString2.charAt(i));
    this.b.put(paramString1, localJMenu);
    this.n.add(localJMenu);
  }

  public JMenu b(String paramString)
  {
    return (JMenu)this.b.get(paramString);
  }

  private void a(String paramString1, String paramString2, JMenu paramJMenu)
  {
    String str1 = paramJMenu.getText();
    int i = str1.indexOf("&");
    if (i != -1)
      try
      {
        str1 = str1.substring(0, i) + str1.substring(i + 1, str1.length());
      }
      catch (Exception localException)
      {
      }
    if (i != -1)
    {
      paramJMenu.setText(str1);
      paramJMenu.setMnemonic(str1.charAt(i));
    }
    JMenu localJMenu = (JMenu)this.b.get(paramString1);
    int m = localJMenu.getItemCount();
    Object localObject = m > 0 ? localJMenu.getItem(m - 1) : null;
    String str2 = null;
    if (localObject != null)
      str2 = (String)localObject.getClientProperty("actionKey");
    if ((m > 0) && (cn.e().a(str2, paramString2)))
      localJMenu.addSeparator();
    localJMenu.add(paramJMenu);
    paramJMenu.putClientProperty("actionKey", paramString2);
    this.b.put(paramString2, paramJMenu);
  }

  private JMenu b(String paramString1, String paramString2)
  {
    JMenu localJMenu1 = (JMenu)this.b.get(paramString1);
    int i = paramString2.indexOf("*");
    if (i == -1)
      return localJMenu1;
    String str1 = paramString2.substring(0, i);
    MenuElement[] arrayOfMenuElement = localJMenu1.getSubElements()[0].getSubElements();
    for (int m = 0; m < arrayOfMenuElement.length; m++)
    {
      localObject1 = (String)((JMenuItem)arrayOfMenuElement[m]).getClientProperty("actionKey");
      if (str1.equals(localObject1))
        return (JMenu)arrayOfMenuElement[m];
    }
    JMenu localJMenu2 = new JMenu();
    Object localObject1 = n.c().a(str1);
    dp localdp = new dp(new dm(((o)localObject1).g(), null), str1);
    localJMenu2.setAction(localdp);
    new bv(localJMenu2, null);
    int i1 = localJMenu1.getItemCount();
    Object localObject2 = i1 > 0 ? localJMenu1.getItem(i1 - 1) : null;
    String str2 = null;
    if (localObject2 != null)
      str2 = (String)localObject2.getClientProperty("actionKey");
    if ((i1 > 0) && (cn.e().a(str2, paramString2)))
      localJMenu1.addSeparator();
    localJMenu1.add(localJMenu2);
    localJMenu2.putClientProperty("actionKey", str1);
    this.b.put(str1, localJMenu2);
    this.o.add(localJMenu2);
    this.p.put(localJMenu2, n.a(str1, this.s));
    return (JMenu)localJMenu2;
  }

  private void a(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1;
    Object localObject2;
    if (paramString2 != null)
    {
      localObject1 = b(paramString2, paramString1);
      localObject2 = new JMenuItem();
      int i = ((JMenu)localObject1).getItemCount();
      String str = null;
      if (i > 0)
      {
        JMenuItem localJMenuItem = ((JMenu)localObject1).getItem(i - 1);
        str = (String)localJMenuItem.getClientProperty("actionKey");
      }
      if ((i > 0) && (cn.e().a(str, paramString1)))
        ((JMenu)localObject1).addSeparator();
      ((JMenu)localObject1).add((JMenuItem)localObject2);
      ((JMenuItem)localObject2).setName(paramString1);
      ((JMenuItem)localObject2).putClientProperty("actionKey", paramString1);
      this.o.add(localObject2);
      this.p.put(localObject2, n.a(paramString1, this.s));
    }
    if (paramString3 != null)
    {
      localObject1 = (ArrayList)this.c.get(paramString3);
      localObject2 = new bq();
      ((AbstractButton)localObject2).setMargin(new Insets(1, 1, 1, 1));
      ((ArrayList)localObject1).add(localObject2);
      ((AbstractButton)localObject2).setName(paramString1);
      ((AbstractButton)localObject2).putClientProperty("actionKey", paramString1);
      this.o.add(localObject2);
      this.p.put(localObject2, n.a(paramString1, this.s));
    }
  }

  private void a(Map paramMap)
  {
    ec localec = new ec();
    Iterator localIterator = this.o.iterator();
    while (localIterator.hasNext())
    {
      AbstractButton localAbstractButton = (AbstractButton)localIterator.next();
      String str = (String)localAbstractButton.getClientProperty("actionKey");
      Object localObject = (Action)paramMap.get(str);
      if (localObject == null)
        localObject = localec;
      Action localAction = (Action)this.p.get(localAbstractButton);
      if ((localAction == null) || (!(localAction instanceof dp)))
        continue;
      dp localdp = (dp)localAction;
      if ((localObject instanceof dp))
        localObject = ((dp)localObject).d();
      n.a(str, (Action)localObject, localdp);
      if ((localAbstractButton instanceof bq))
        localdp.putValue("ShortDescription", localdp.getValue("Name"));
      if (!(localAbstractButton instanceof JMenu))
        localAbstractButton.setAction(localdp);
    }
  }

  private void b(bn parambn)
  {
    String str = parambn.r();
    b(parambn, str);
  }

  private void b(bn parambn, String paramString)
  {
    bb localbb = parambn.q();
    this.k = localbb.b(paramString);
    a(this.k);
  }

  public void a(dl paramdl)
  {
    bn localbn = paramdl.b();
    String str = localbn.r();
    if ((this.d.contains(str)) && (((localbn != this.j) && (localbn != this)) || (this.j == null)))
    {
      this.j = localbn;
      b(localbn);
    }
  }

  public void b(dl paramdl)
  {
  }

  public void a(bn parambn, String paramString)
  {
    String str = parambn.r();
    if ((this.d.contains(str)) && (parambn == this.j) && (parambn != this))
      b(parambn, paramString);
  }

  public void c(bn parambn)
  {
    parambn.t().a(this);
  }

  public void a(br parambr)
  {
    c(parambr.b());
  }

  public void c(dl paramdl)
  {
    bn localbn = paramdl.b();
    if (localbn == this.j)
    {
      this.j = null;
      b(this);
    }
    paramdl.b().t().b(this);
  }

  public boolean d(boolean paramBoolean)
  {
    return this.e.d(paramBoolean);
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public bb q()
  {
    return this.f;
  }

  public JComponent c()
  {
    return this.h.b().getRootPane();
  }

  public void d(String paramString)
  {
    this.e.d(paramString);
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public String r()
  {
    return this.e.r();
  }

  public void a(bn parambn)
  {
    this.f.a(parambn.q());
    b(this);
  }

  static ArrayList a(dz paramdz)
  {
    return paramdz.o;
  }

  static Action a(dz paramdz)
  {
    return paramdz.s;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.dz
 * JD-Core Version:    0.6.0
 */