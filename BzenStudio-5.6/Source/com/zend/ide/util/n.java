package com.zend.ide.util;

import com.zend.ide.y.g;
import com.zend.ide.y.h;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

public class n
  implements r, cu
{
  private static final Icon e = cv.b("null16.gif");
  private static n a;
  private HashMap b;
  private Collection c;
  private Hashtable d = new Hashtable();

  private n()
  {
    b();
  }

  public static n c()
  {
    if (a == null)
      a = new n();
    return a;
  }

  public static void a(p paramp)
  {
    c().b(paramp);
  }

  protected void b(p paramp)
  {
    if (this.c == null)
      this.c = new ArrayList(1);
    if (!this.c.contains(paramp))
      this.c.add(paramp);
  }

  protected void a(dk paramdk)
  {
    if (this.c == null)
      return;
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      p localp = (p)localIterator.next();
      localp.a(paramdk);
    }
  }

  public o a(String paramString)
  {
    return (o)this.b.get(paramString);
  }

  public Image b(String paramString)
  {
    Icon localIcon = null;
    o localo = a(paramString);
    if (localo != null)
      localIcon = localo.c();
    if (localIcon != null)
      return ((ImageIcon)localIcon).getImage();
    return null;
  }

  public static void a(String paramString, Action paramAction, dp paramdp)
  {
    if (!paramdp.c().equals(paramString))
      paramdp.a(paramString);
    paramdp.a(paramAction);
    paramdp.setEnabled(paramAction.isEnabled());
  }

  public static dp a(String paramString, Action paramAction)
  {
    return new dp(paramAction, paramString);
  }

  private String c(String paramString)
  {
    if (this.d.containsKey(paramString))
      return (String)this.d.get(paramString);
    return paramString;
  }

  private void a(String paramString, o paramo)
  {
    this.b.put(paramString, paramo);
    int i = paramString.indexOf("*");
    if (i == -1)
      return;
    String str = paramString.substring(i + 1);
    this.d.put(str, paramString);
  }

  private void b()
  {
    this.b = new HashMap(200);
    try
    {
      KeyStroke localKeyStroke = (KeyStroke)g.a("phpEditorPane.cut").d();
      a("keys.cut", new o(ct.b(53), null, cv.b("cut16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.selectAll").d();
      a("keys.selectAll", new o(ct.b(738), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.beginLine").d();
      a("keys.beginLine", new o(ct.b(852), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.endLine").d();
      a("keys.endLine", new o(ct.b(853), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.copy").d();
      a("keys.copy", new o(ct.b(51), null, cv.b("copy16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.paste").d();
      a("keys.paste", new o(ct.b(52), null, cv.b("paste16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.delete").d();
      a("keys.delete", new o(ct.b(279), null, cv.b("null16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.deleteProjectFile", new o(ct.b(279), null, cv.b("null16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.rename", new o(ct.b(280), ct.a(280), e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.find").d();
      a("keys.find", new o(ct.b(281), null, cv.b("find16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.find-next").d();
      a("keys.find-next", new o(ct.b(57), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.find-prev").d();
      a("keys.find-prev", new o(ct.b(887), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.replace").d();
      a("keys.replace", new o(ct.b(282), null, cv.b("replace16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.eraseLine").d();
      a("keys.eraseLine", new o(ct.b(1059), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.undo").d();
      a("keys.undo", new o(ct.b(54), null, cv.b("undo16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.redo").d();
      a("keys.redo", new o(ct.b(55), null, cv.b("redo16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editor.gotoLine").d();
      a("keys.gotoLine", new o(ct.b(283), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.reformatCode").d();
      a("keys.reformatCode", new o(ct.b(63), ct.a(774), cv.b("indentcode.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editorComponent.newDocument").d();
      a("keys.newDocument", new o(ct.b(284), null, cv.b("newfile16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editorComponent.openDocument").d();
      a("keys.openDocument", new o(ct.b(285), ct.a(286), cv.b("openfile16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.openSelectedFile", new o(ct.b(70), ct.a(286), cv.b("openfile16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.gotoSource", new o(ct.b(287), null, cv.b("openfile16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.gotoWsdlFile", new o(ct.b(1753), null, cv.b("openfile16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.refreshSoapClientAction", new o(ct.a(1898), null, null, localKeyStroke));
      localKeyStroke = null;
      a("keys.addDescription", new o(ct.b(557), null, cv.b("addcomment.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.gotoSuperClass", new o(ct.b(502), ct.a(287), e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editorComponent.closeDocument").d();
      a("keys.closeDocument", new o(ct.b(288), ct.a(769), cv.b("closefile16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editorComponent.closeAll").d();
      a("keys.closeAll", new o(ct.b(289), ct.a(770), e, localKeyStroke));
      localKeyStroke = null;
      a("keys.closeOthers", new o(ct.b(1551), ct.a(1552), e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.saveFile").d();
      a("keys.saveFile", new o(ct.b(150), ct.a(290), cv.b("savefile16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editorComponent.saveAll").d();
      a("keys.saveAll", new o(ct.b(291), ct.a(292), e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.saveAs").d();
      a("keys.saveAs", new o(ct.b(293), ct.a(294), cv.b("saveas16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.print").d();
      a("keys.print", new o(ct.b(295), null, cv.b("print16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editor.showRecentFiles").d();
      a("keys.showRecentFiles", new o(ct.b(1274), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("debugging.showInBrowser").d();
      a("keys.showInBrowser", new o(ct.b(299), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("debugging.debugURL").d();
      a("keys.debugURL", new o(ct.b(300), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("debugging.serverConnection").d();
      a("keys.serverConnection", new o(ct.a(987), null, cv.b("checkserver.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("debugging.profileURL").d();
      a("keys.profileURL", new o(ct.b(937), null, cv.b("profile16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.profilerFunctionCall", new o(ct.b(938), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.profilerFunctionDeclaration", new o(ct.b(939), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.profilerFunctionDetails", new o(ct.b(940), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.profilerSortByTimeTree", new o(ct.b(941), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.profilerSortByOrderTree", new o(ct.b(1029), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.profilerExpandTree", new o(ct.b(1058), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.profilerCollapseTree", new o(ct.b(1057), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.exitApplication", new o(ct.b(301), ct.a(302), cv.b("exitapplication16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.about", new o(ct.b(303), null, cv.b("help16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.clearOutput", new o(ct.b(305), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("debugging.addWatch").d();
      a("keys.addWatch", new o(ct.b(306), null, cv.b("addWatch16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.removeAllWatchs", new o(ct.b(308), null, cv.b("null16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.removeWatch", new o(ct.b(310), null, cv.b("null16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.watchFromHere", new o(ct.b(311), null, cv.b("addWatch16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.copyValue", new o(ct.b(520), null, cv.b("copy16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.showDebugWindow", new o(ct.b(312), null, cv.b("debugwindow16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.showZendPlatformWindow", new o(ct.b(1920), null, cv.b("platform_window.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.showExplorer", new o(ct.b(314), null, cv.b("explorer/explorer16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("debugging.toggleBreakpoint").d();
      a("keys.toggleBreakpoint", new o(ct.b(315), null, cv.b("togglebreakpoint16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.removeBreakpoint", new o(ct.b(317), null, cv.b("null16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.enableBreakpoint", new o(ct.b(318), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.addGlobalCondition", new o(ct.b(743), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.disableBreakpoint", new o(ct.b(319), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.editBreakpoint", new o(ct.b(741), ct.a(321), cv.b("togglebreakpoint16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.removeAllBreakpoints", new o(ct.b(322), null, cv.b("removeallbreakpoints16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.deleteAllBreakpoints", new o(ct.b(323), null, cv.b("removeallbreakpoints16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.enableAllBreakpoints", new o(ct.b(324), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.disableAllBreakpoints", new o(ct.b(325), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.toggleOutputArea", new o(ct.b(326), null, cv.b("debug_output.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.toggleDebugMessagesArea", new o(ct.b(708), null, cv.b("togglemessageswindow16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.toggleInspectorsWindow", new o(ct.b(1255), null, cv.b("classbrowser/phpfiledata.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.closeOutputComponent", new o(ct.b(329), null, cv.b("closefile16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.saveOutputAsFile", new o(ct.b(330), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.clear", new o(ct.b(331), ct.a(332), e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("debugging.stepOut").d();
      a("keys.stepOut", new o(ct.b(333), ct.a(781), cv.b("stepout16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("debugging.stepOver").d();
      a("keys.stepOver", new o(ct.b(335), ct.a(782), cv.b("stepover16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("debugging.stepInto").d();
      a("keys.stepInto", new o(ct.b(336), ct.a(780), cv.b("stepinto16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("debugging.go").d();
      a("keys.go", new o(ct.b(84), ct.a(778), cv.b("go16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("debugging.run").d();
      a("keys.run", new o(ct.b(337), ct.a(785), cv.b("run16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("debugging.gotoCursor").d();
      a("keys.gotoCursor", new o(ct.b(338), ct.a(779), cv.b("gotocursor16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("debugging.finishDebugger").d();
      a("keys.finishDebugger", new o(ct.b(339), ct.a(783), cv.b("stopdebugger16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.pauseDebugger", new o(ct.b(340), ct.a(784), cv.b("pause16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.endDebugger", new o(ct.b(460), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("project.checkIncludes").d();
      a("keys.checkIncludes", new o(ct.b(342), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.gotoIncludeFile", new o(ct.b(536), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("project.newProject").d();
      a("keys.newProject", new o(ct.b(343), ct.a(344), cv.b("newproject16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("project.openProject").d();
      a("keys.openProject", new o(ct.b(345), ct.a(771), cv.b("openproject16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("project.saveProject").d();
      a("keys.saveProject", new o(ct.b(347), null, cv.b("saveproject16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.closeProject", new o(ct.b(348), ct.a(772), cv.b("closeproject16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.renameProject", new o(ct.b(349), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.closeExplorerTab", new o(ct.b(350), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.addFTPServer", new o(ct.b(351), ct.a(773), e, localKeyStroke));
      localKeyStroke = null;
      a("keys.EditFTPRootAction", new o(ct.b(352), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.removeFTPServer", new o(ct.b(353), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.FTPRootConnection", new o(ct.b(186), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.refreshFolder", new o(ct.b(354), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.addFolder", new o(ct.b(355), null, cv.b("explorer/closedfolder16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.addFile", new o(ct.b(356), null, cv.b("newfile16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.propertiesActionKey", new o(ct.b(357), null, cv.b("properties.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.addToProject", new o(ct.b(358), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.addExistingToProject", new o(ct.b(359), ct.a(775), e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("project.removeFromProject").d();
      a("keys.removeFromProject", new o(ct.b(361), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.removeAllFromProject", new o(ct.b(362), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.encodeProject", new o(ct.b(406), null, cv.b("encoder16.gif"), localKeyStroke));
      localKeyStroke = KeyStroke.getKeyStroke(155, 0);
      a("keys.replaceInsertOverrideMode", new o("", "", e, localKeyStroke));
      localKeyStroke = null;
      a("keys.openCustomizationTool", new o(ct.b(363), ct.a(364), cv.b("customization16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("application.findInFiles").d();
      a("keys.findInFiles", new o(ct.b(365), null, cv.b("findinfiles16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.resetProperty", new o(ct.b(367), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.viewIncludeLine", new o(ct.b(850), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.resetAllProperties", new o(ct.b(368), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("completionTool.showCompletionList").d();
      a("keys.showCompletionList", new o(ct.b(369), "", e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("completionTool.showFunctionArguments").d();
      a("keys.showFunctionArguments", new o(ct.b(981), "", e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editor.functionHelpAction").d();
      a("keys.functionHelpAction", new o(ct.b(556), ct.b(556), e, localKeyStroke));
      localKeyStroke = null;
      a("keys.assignValue", new o(ct.b(371), ct.a(372), e, localKeyStroke));
      localKeyStroke = null;
      a("keys.editWatch", new o(ct.b(373), ct.a(374), e, localKeyStroke));
      localKeyStroke = null;
      a("keys.cloneView", new o(ct.b(375), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.closeClone", new o(ct.b(381), null, cv.b("closefile16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.openUserGuide", new o(ct.b(382), ct.b(776), cv.b("help.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.openHelpTicket", new o(ct.b(383), ct.a(384), e, localKeyStroke));
      localKeyStroke = null;
      a("keys.configureDebugServer", new o(ct.b(399), ct.b(786), cv.b("platform.gif"), localKeyStroke));
      localKeyStroke = null;
      a("Keys.rebuildCodeCompletionDB", new o(ct.b(402), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.feedbackForm", new o(ct.b(472), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.registery", new o(ct.b(474), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.openEncoderPage", new o(ct.b(482), null, cv.b("encoder16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.openAcceleratorPage", new o(ct.b(484), null, cv.b("platform.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.addRemoveComment").d();
      a("keys.addRemoveComment", new o(ct.b(493), null, cv.b("addremoveComment.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.addRemovePHPBlockComment").d();
      a("keys.addRemovePHPBlockComment", new o(ct.b(494), null, cv.b("addremoveComment.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.duplicateSelection").d();
      a("keys.duplicateSelection", new o(ct.b(501), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editnig.toLowerCase").d();
      a("keys.toLowerCase", new o(ct.b(739), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editnig.toUpperCase").d();
      a("keys.toUpperCase", new o(ct.b(506), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.html", new o(ct.a(512), ct.a(512), e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editnig.boldTag").d();
      a("keys.html*keys.boldTag", new o(ct.a(507), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editnig.italicTag").d();
      a("keys.html*keys.italicTag", new o(ct.a(508), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editnig.heading1Tag").d();
      a("keys.html*keys.heading1Tag", new o(ct.a(509), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editnig.heading2Tag").d();
      a("keys.html*keys.heading2Tag", new o(ct.a(510), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editnig.heading3Tag").d();
      a("keys.html*keys.heading3Tag", new o(ct.a(511), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editnig.breakTag").d();
      a("keys.html*keys.breakTag", new o(ct.a(513), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editnig.nbspTag").d();
      a("keys.html*keys.nbspTag", new o(ct.a(874), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editnig.findMatchingBracket").d();
      a("keys.findMatchingBracket", new o(ct.b(514), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.openDocumentFromSelectedText", new o(ct.a(159), ct.a(159), e, localKeyStroke));
      localKeyStroke = null;
      a("keys.refreshWSDLFromSelectedText", new o(ct.a(1899), ct.a(1899), e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.toggleBookmark").d();
      a("keys.toggleBookmark", new o(ct.b(777), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.gotoNextBookmark").d();
      a("keys.gotoNextBookmark", new o(ct.b(517), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.gotoNextProjectBookmark").d();
      a("keys.gotoNextProjectBookmark", new o(ct.b(535), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.removeAllBookmarks").d();
      a("keys.removeAllBookmarks", new o(ct.b(518), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.openBookmarksDialog").d();
      a("keys.openBookmarksDialog", new o(ct.b(676), null, cv.b("null16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.customizeDebugMessages", new o(ct.b(546), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("application.closeMessageComponent").d();
      a("keys.closeMessageComponent", new o(ct.b(6), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.openTipOfTheDayPage", new o(ct.b(594), null, cv.b("tips.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.openAutoUpdateDialog", new o(ct.b(1000), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("application.openNextEntry").d();
      a("keys.openNextEntry", new o(ct.b(1260), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.openSelectedEntry", new o(ct.b(568), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.cvs", new o(ct.b(669), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("vcs.commit").d();
      a("keys.cvs*keys.commit", new o("Commit", null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("vcs.update").d();
      a("keys.cvs*keys.update", new o("Update", null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("vcs.add").d();
      a("keys.cvs*keys.add", new o("Add", null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("vcs.status").d();
      a("keys.cvs*keys.status", new o("Status", null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("vcs.checkout").d();
      a("keys.cvs*keys.checkout", new o("Checkout", null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("vcs.diff").d();
      a("keys.cvs*keys.diff", new o("Diff", null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("vcs.log").d();
      a("keys.cvs*keys.log", new o("Log", null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.cvs*keys.remove", new o("Remove", null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.svn", new o("Subversion", null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("vcs.commit").d();
      a("keys.svn*keys.commit", new o("Commit", null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("vcs.update").d();
      a("keys.svn*keys.update", new o("Update", null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("vcs.add").d();
      a("keys.svn*keys.add", new o("Add", null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("vcs.status").d();
      a("keys.svn*keys.status", new o("Status", null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("vcs.checkout").d();
      a("keys.svn*keys.checkout", new o("Checkout", null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("vcs.diff").d();
      a("keys.svn*keys.diff", new o("Diff", null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.svn*keys.log", new o("Log", null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.svn*keys.delete", new o("Delete", null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.svn*keys.resolve", new o("Resolve", null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.svn*keys.revert", new o("Revert", null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.back").d();
      a("keys.back", new o(ct.b(655), null, cv.b("moveleft16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("phpEditorPane.forward").d();
      a("keys.forward", new o(ct.b(656), null, cv.b("moveright16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.showProjectProperties", new o(ct.b(707), null, cv.b("projectproperties16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.showTunnelingOptions", new o(ct.b(1427), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("codeAnalyzer").d();
      a("keys.codeAnalyzer", new o(ct.b(965), null, cv.b("analyze16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("help.CSH", new o(ct.b(1230), null, cv.b("CSHhelp.gif"), localKeyStroke));
      a("keys.moveTo", new o(ct.b(1177), null, e, localKeyStroke));
      a("keys.moveTo*keys.moveToLeft", new o(ct.b(1179), null, e, localKeyStroke));
      a("keys.moveTo*keys.moveToRight", new o(ct.b(1181), null, e, localKeyStroke));
      a("keys.moveTo*keys.moveToUp", new o(ct.b(1178), null, e, localKeyStroke));
      a("keys.moveTo*keys.moveToDown", new o(ct.b(1180), null, e, localKeyStroke));
      a("keys.float", new o(ct.b(1182), null, e, localKeyStroke));
      a("keys.dock", new o(ct.b(1183), null, e, localKeyStroke));
      a("keys.closeWindow", new o(ct.b(6), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editor.toggleLineWrap").d();
      a("keys.toggleLineWrap", new o(ct.b(500), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.phpDoc", new o(ct.b(1310), null, e, localKeyStroke));
      a("sql.properties", new o(ct.b(1350), null, e, localKeyStroke));
      a("keys.codeSnippets", new o(ct.b(1383), null, e, localKeyStroke));
      a("keys.newCodeSnippet", new o(ct.b(1384), null, e, localKeyStroke));
      a("keys.wsdlCreatorTool", new o(ct.b(1647), null, cv.b("wsdlCreator_16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editor.gotoResource").d();
      a("keys.gotoResource", new o(ct.b(1703), null, cv.b("goto_phpRes_16.gif"), localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editor.gotoFile").d();
      a("keys.gotoFile", new o(ct.b(1718), null, cv.b("goto_file_16.gif"), localKeyStroke));
      localKeyStroke = null;
      a("keys.folding", new o(ct.b(1770), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editor.expandAllFolds").d();
      a("keys.folding*keys.expandAllFolds", new o(ct.b(1783), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editor.collapseAllFolds").d();
      a("keys.folding*keys.collapseAllFolds", new o(ct.b(1795), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editor.foldNonPHP").d();
      a("keys.folding*keys.foldNonPHP", new o(ct.b(1784), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editor.foldClasses").d();
      a("keys.folding*keys.foldClasses", new o(ct.b(1786), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editor.foldFunctions").d();
      a("keys.folding*keys.foldFunctions", new o(ct.b(1785), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editor.foldDocs").d();
      a("keys.folding*keys.foldDocs", new o(ct.b(1787), null, e, localKeyStroke));
      localKeyStroke = (KeyStroke)g.a("editor.collapseInScope").d();
      a("keys.folding*keys.collapseInScope", new o(ct.b(1796), null, e, localKeyStroke));
      localKeyStroke = null;
      a("keys.proxySettings", new o(ct.b(1758), null, e, localKeyStroke));
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  static String a(n paramn, String paramString)
  {
    return paramn.c(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.n
 * JD-Core Version:    0.6.0
 */