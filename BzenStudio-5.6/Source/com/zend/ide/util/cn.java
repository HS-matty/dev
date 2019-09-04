package com.zend.ide.util;

import com.zend.ide.y.b;
import com.zend.ide.y.c;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.awt.Font;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.MenuElement;

public class cn
  implements r
{
  private static cn a = new cn();
  private ArrayList b;
  private Hashtable c;
  private JPopupMenu d;
  private String e = null;
  private e f;
  private PropertyChangeListener g = new cp(this, null);
  private Font h = (Font)b.a("desktop.font").c();
  private Action i = new ec();
  private final int j = 1;
  private final int k = 2;
  private final int l = 3;
  private final int m = 4;
  private final int n = 5;
  private final int o = 6;
  private final int p = 7;
  private final int q = 9;
  private final int r = 10;
  private final int s = 11;
  private final int t = 12;
  private final int u = 13;
  private final int v = 14;
  private final int w = 15;
  private final int x = 16;
  private final int y = 17;
  private final int z = 18;
  private final int A = 20;
  private final int C = 22;
  private final int D = 23;
  private final int E = 24;
  private final int F = 25;
  private final int G = 26;
  private final int H = 27;
  private final int I = 28;
  private final int K = 30;
  private final int L = 31;
  private final int M = 32;
  private final int N = 33;
  private final int O = 34;
  private final int P = 35;
  private final int Q = 36;
  private final int J = 37;
  private final int S = 39;
  private final int T = 40;
  private final int U = 41;
  private final int R = 42;
  private final int W = 43;
  private final int X = 44;
  private final int Y = 45;
  private final int B = 46;
  private final int Z = 47;
  private final int ba = 48;
  private final int bb = 50;
  private final int cb = 51;
  private final int V = 52;
  private final int ab = 53;

  public static cn e()
  {
    return a;
  }

  protected cn()
  {
    b();
    this.d = new JPopupMenu();
    c();
    d();
  }

  private void b()
  {
    f localf = new f();
    this.f = new e(localf);
    localf.a("desktop.font", this.g);
    this.f.a("desktop.font");
  }

  public JPopupMenu a(Map paramMap)
  {
    this.d.removeAll();
    this.d.putClientProperty("maxTextWidth", null);
    this.d.putClientProperty("maxAccWidth", null);
    Iterator localIterator = this.b.iterator();
    HashMap localHashMap = new HashMap(paramMap);
    Object localObject;
    Action localAction;
    while (localIterator.hasNext())
    {
      localObject = ((cq)localIterator.next()).c();
      localAction = (Action)localHashMap.get(localObject);
      if (localAction != null)
      {
        if ((this.d.getComponentCount() > 0) && (a(this.e, (String)localObject)))
          this.d.addSeparator();
        this.e = ((String)localObject);
        a((String)localObject, localAction);
        localHashMap.remove(localObject);
      }
    }
    if (localHashMap.size() > 0)
    {
      if (this.d.getComponentCount() > 0)
        this.d.addSeparator();
      localObject = localHashMap.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        localAction = (Action)localHashMap.get(str);
        a(str, localAction);
      }
    }
    return (JPopupMenu)this.d;
  }

  private void a(String paramString, Action paramAction)
  {
    if ((paramAction instanceof dp))
      paramAction = ((dp)paramAction).d();
    dp localdp = n.a("", this.i);
    n.a(paramString, paramAction, localdp);
    o localo = n.c().a(paramString);
    JComponent localJComponent = b(paramString, paramAction);
    JMenuItem localJMenuItem = (JMenuItem)localJComponent.add(new JMenuItem(localdp));
    KeyStroke localKeyStroke = localo.f();
    if (localKeyStroke != null)
      localJMenuItem.setAccelerator(localKeyStroke);
    localJMenuItem.setFont(new Font(this.h.getFontName(), this.h.getStyle(), this.h.getSize()));
    localJMenuItem.setMnemonic(-1);
  }

  private JComponent b(String paramString, Action paramAction)
  {
    int i1 = paramString.indexOf("*");
    if (i1 == -1)
      return this.d;
    String str1 = paramString.substring(0, i1);
    dp localdp = n.a("", this.i);
    n.a(str1, paramAction, localdp);
    String str2 = (String)localdp.getValue("Name");
    MenuElement[] arrayOfMenuElement = this.d.getSubElements();
    for (int i2 = 0; i2 < arrayOfMenuElement.length; i2++)
    {
      JMenuItem localJMenuItem2 = (JMenuItem)arrayOfMenuElement[i2];
      String str3 = (String)localJMenuItem2.getAction().getValue("Name");
      if (!str2.equals(str3))
        continue;
      if ((!localJMenuItem2.isEnabled()) && (paramAction.isEnabled()))
        localJMenuItem2.setEnabled(true);
      return (JMenu)localJMenuItem2;
    }
    JMenuItem localJMenuItem1 = this.d.add(new JMenu(localdp));
    localJMenuItem1.setFont(new Font(this.h.getFontName(), this.h.getStyle(), this.h.getSize()));
    return localJMenuItem1;
  }

  public boolean a(String paramString1, String paramString2)
  {
    cq localcq1 = paramString1 == null ? null : (cq)this.c.get(paramString1);
    cq localcq2 = (cq)this.c.get(paramString2);
    return (localcq1 == null) || (localcq2 == null) || (localcq2.b() != localcq1.b());
  }

  private void c()
  {
    this.b = new ArrayList(180);
    this.b.add(new cq("keys.newDocument", 1));
    this.b.add(new cq("keys.openSelectedFile", 2));
    this.b.add(new cq("keys.openDocument", 2));
    this.b.add(new cq("keys.openDocumentFromSelectedText", 2));
    this.b.add(new cq("keys.refreshWSDLFromSelectedText", 2));
    this.b.add(new cq("keys.closeDocument", 2));
    this.b.add(new cq("keys.closeAll", 2));
    this.b.add(new cq("keys.closeOthers", 2));
    this.b.add(new cq("keys.saveFile", 3));
    this.b.add(new cq("keys.saveAs", 3));
    this.b.add(new cq("keys.saveAll", 3));
    this.b.add(new cq("keys.recentFilesMenu", 48));
    this.b.add(new cq("keys.showRecentFiles", 48));
    this.b.add(new cq("keys.newProject", 26));
    this.b.add(new cq("keys.openProject", 26));
    this.b.add(new cq("keys.saveProject", 26));
    this.b.add(new cq("keys.closeProject", 26));
    this.b.add(new cq("keys.addFTPServer", 31));
    this.b.add(new cq("keys.print", 4));
    this.b.add(new cq("keys.cut", 5));
    this.b.add(new cq("keys.copy", 5));
    this.b.add(new cq("keys.paste", 5));
    this.b.add(new cq("keys.delete", 5));
    this.b.add(new cq("keys.deleteProjectFile", 5));
    this.b.add(new cq("keys.selectAll", 41));
    this.b.add(new cq("keys.rename", 5));
    this.b.add(new cq("keys.toLowerCase", 23));
    this.b.add(new cq("keys.toUpperCase", 23));
    this.b.add(new cq("keys.duplicateSelection", 23));
    this.b.add(new cq("keys.eraseLine", 23));
    this.b.add(new cq("keys.addRemoveComment", 23));
    this.b.add(new cq("keys.addRemovePHPBlockComment", 23));
    this.b.add(new cq("keys.html*keys.boldTag", 23));
    this.b.add(new cq("keys.html*keys.italicTag", 23));
    this.b.add(new cq("keys.html*keys.heading1Tag", 23));
    this.b.add(new cq("keys.html*keys.heading2Tag", 23));
    this.b.add(new cq("keys.html*keys.heading3Tag", 23));
    this.b.add(new cq("keys.html*keys.breakTag", 23));
    this.b.add(new cq("keys.html*keys.nbspTag", 23));
    this.b.add(new cq("keys.toggleLineWrap", 39));
    this.b.add(new cq("keys.toggleBookmark", 39));
    this.b.add(new cq("keys.removeAllBookmarks", 39));
    this.b.add(new cq("keys.openBookmarksDialog", 39));
    this.b.add(new cq("keys.cloneView", 22));
    this.b.add(new cq("keys.codeSnippets", 51));
    this.b.add(new cq("keys.newCodeSnippet", 51));
    this.b.add(new cq("keys.showDebugWindow", 20));
    this.b.add(new cq("keys.showZendPlatformWindow", 20));
    this.b.add(new cq("keys.showExplorer", 20));
    this.b.add(new cq("keys.toggleDebugMessagesArea", 20));
    this.b.add(new cq("keys.toggleOutputArea", 20));
    this.b.add(new cq("keys.toggleInspectorsWindow", 20));
    this.b.add(new cq("keys.undo", 9));
    this.b.add(new cq("keys.redo", 9));
    this.b.add(new cq("keys.reformatCode", 47));
    this.b.add(new cq("keys.toggleLineWrap", 47));
    this.b.add(new cq("keys.find", 6));
    this.b.add(new cq("keys.find-next", 6));
    this.b.add(new cq("keys.find-prev", 6));
    this.b.add(new cq("keys.replace", 6));
    this.b.add(new cq("keys.findInFiles", 7));
    this.b.add(new cq("keys.gotoFile", 40));
    this.b.add(new cq("keys.gotoResource", 40));
    this.b.add(new cq("keys.gotoLine", 40));
    this.b.add(new cq("keys.findMatchingBracket", 40));
    this.b.add(new cq("keys.gotoNextBookmark", 40));
    this.b.add(new cq("keys.gotoNextProjectBookmark", 40));
    this.b.add(new cq("keys.back", 40));
    this.b.add(new cq("keys.forward", 40));
    this.b.add(new cq("keys.openNextEntry", 40));
    this.b.add(new cq("keys.toggleBreakpoint", 10));
    this.b.add(new cq("keys.removeBreakpoint", 10));
    this.b.add(new cq("keys.enableBreakpoint", 10));
    this.b.add(new cq("keys.disableBreakpoint", 10));
    this.b.add(new cq("keys.removeAllBreakpoints", 25));
    this.b.add(new cq("keys.deleteAllBreakpoints", 25));
    this.b.add(new cq("keys.enableAllBreakpoints", 25));
    this.b.add(new cq("keys.disableAllBreakpoints", 25));
    this.b.add(new cq("keys.stepOver", 11));
    this.b.add(new cq("keys.stepInto", 11));
    this.b.add(new cq("keys.stepOut", 11));
    this.b.add(new cq("keys.go", 12));
    this.b.add(new cq("keys.gotoCursor", 12));
    this.b.add(new cq("keys.run", 12));
    this.b.add(new cq("keys.finishDebugger", 13));
    this.b.add(new cq("keys.pauseDebugger", 13));
    this.b.add(new cq("keys.addWatch", 10));
    this.b.add(new cq("keys.editWatch", 10));
    this.b.add(new cq("keys.removeWatch", 10));
    this.b.add(new cq("keys.assignValue", 10));
    this.b.add(new cq("keys.removeAllWatchs", 25));
    this.b.add(new cq("keys.copyValue", 10));
    this.b.add(new cq("keys.gotoSource", 24));
    this.b.add(new cq("keys.gotoWsdlFile", 24));
    this.b.add(new cq("keys.checkIncludes", 26));
    this.b.add(new cq("keys.renameProject", 30));
    this.b.add(new cq("keys.addToProject", 28));
    this.b.add(new cq("keys.addExistingToProject", 28));
    this.b.add(new cq("keys.removeFromProject", 27));
    this.b.add(new cq("keys.removeAllFromProject", 27));
    this.b.add(new cq("keys.closeExplorerTab", 14));
    this.b.add(new cq("keys.EditFTPRootAction", 14));
    this.b.add(new cq("keys.addFTPServer", 14));
    this.b.add(new cq("keys.removeFTPServer", 14));
    this.b.add(new cq("keys.FTPRootConnection", 14));
    this.b.add(new cq("keys.refreshFolder", 14));
    this.b.add(new cq("keys.addFolder", 15));
    this.b.add(new cq("keys.addFile", 15));
    this.b.add(new cq("keys.openCustomizationTool", 35));
    this.b.add(new cq("keys.serverConnection", 16));
    this.b.add(new cq("keys.debugURL", 16));
    this.b.add(new cq("keys.profileURL", 16));
    this.b.add(new cq("keys.showTunnelingOptions", 16));
    this.b.add(new cq("Keys.rebuildCodeCompletionDB", 16));
    this.b.add(new cq("keys.codeAnalyzer", 16));
    this.b.add(new cq("keys.phpDoc", 16));
    this.b.add(new cq("keys.wsdlCreatorTool", 16));
    this.b.add(new cq("keys.showInBrowser", 16));
    this.b.add(new cq("keys.configureDebugServer", 37));
    this.b.add(new cq("keys.encodeProject", 37));
    this.b.add(new cq("keys.showProjectProperties", 30));
    this.b.add(new cq("keys.resetProperty", 17));
    this.b.add(new cq("keys.propertiesActionKey", 17));
    this.b.add(new cq("keys.resetAllProperties", 18));
    this.b.add(new cq("keys.openUserGuide", 32));
    this.b.add(new cq("keys.openTipOfTheDayPage", 32));
    this.b.add(new cq("keys.openAutoUpdateDialog", 34));
    this.b.add(new cq("keys.openHelpTicket", 34));
    this.b.add(new cq("keys.feedbackForm", 34));
    this.b.add(new cq("keys.registery", 34));
    this.b.add(new cq("keys.openEncoderPage", 36));
    this.b.add(new cq("keys.openAcceleratorPage", 36));
    this.b.add(new cq("keys.about", 33));
    this.b.add(new cq("keys.exitApplication", 23));
    this.b.add(new cq("keys.clearOutput", 23));
    this.b.add(new cq("keys.closeOutputComponent", 23));
    this.b.add(new cq("keys.saveOutputAsFile", 23));
    this.b.add(new cq("keys.clear", 23));
    this.b.add(new cq("keys.openSelectedEntry", 23));
    this.b.add(new cq("keys.cvs", 42));
    this.b.add(new cq("keys.cvs*keys.update", 42));
    this.b.add(new cq("keys.cvs*keys.commit", 42));
    this.b.add(new cq("keys.cvs*keys.add", 42));
    this.b.add(new cq("keys.cvs*keys.remove", 42));
    this.b.add(new cq("keys.cvs*keys.status", 42));
    this.b.add(new cq("keys.cvs*keys.diff", 42));
    this.b.add(new cq("keys.cvs*keys.log", 42));
    this.b.add(new cq("keys.cvs*keys.checkout", 42));
    this.b.add(new cq("keys.svn", 42));
    this.b.add(new cq("keys.svn*keys.update", 42));
    this.b.add(new cq("keys.svn*keys.commit", 42));
    this.b.add(new cq("keys.svn*keys.add", 42));
    this.b.add(new cq("keys.svn*keys.delete", 42));
    this.b.add(new cq("keys.svn*keys.revert", 42));
    this.b.add(new cq("keys.svn*keys.resolve", 42));
    this.b.add(new cq("keys.svn*keys.status", 42));
    this.b.add(new cq("keys.svn*keys.diff", 42));
    this.b.add(new cq("keys.svn*keys.log", 42));
    this.b.add(new cq("keys.svn*keys.checkout", 42));
    this.b.add(new cq("keys.profilerFunctionCall", 43));
    this.b.add(new cq("keys.profilerFunctionDeclaration", 43));
    this.b.add(new cq("keys.profilerFunctionDetails", 43));
    this.b.add(new cq("keys.profilerSortByTimeTree", 44));
    this.b.add(new cq("keys.profilerSortByOrderTree", 44));
    this.b.add(new cq("keys.profilerCollapseTree", 45));
    this.b.add(new cq("keys.profilerExpandTree", 45));
    this.b.add(new cq("keys.dock", 46));
    this.b.add(new cq("keys.float", 46));
    this.b.add(new cq("keys.moveTo*keys.moveToLeft", 46));
    this.b.add(new cq("keys.moveTo*keys.moveToRight", 46));
    this.b.add(new cq("keys.moveTo*keys.moveToUp", 46));
    this.b.add(new cq("keys.moveTo*keys.moveToDown", 46));
    this.b.add(new cq("sql.properties", 50));
    this.b.add(new cq("keys.folding", 52));
    this.b.add(new cq("keys.folding*keys.expandAllFolds", 52));
    this.b.add(new cq("keys.folding*keys.collapseAllFolds", 52));
    this.b.add(new cq("keys.folding*keys.foldNonPHP", 52));
    this.b.add(new cq("keys.folding*keys.foldClasses", 52));
    this.b.add(new cq("keys.folding*keys.foldFunctions", 52));
    this.b.add(new cq("keys.folding*keys.foldDocs", 52));
    this.b.add(new cq("keys.folding*keys.collapseInScope", 52));
    this.b.add(new cq("keys.proxySettings", 53));
  }

  private void d()
  {
    this.c = new Hashtable(210);
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      cq localcq = (cq)localIterator.next();
      this.c.put(localcq.c(), localcq);
    }
  }

  private void a(Font paramFont)
  {
    this.h = paramFont;
  }

  static void a(cn paramcn, Font paramFont)
  {
    paramcn.a(paramFont);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.cn
 * JD-Core Version:    0.6.0
 */