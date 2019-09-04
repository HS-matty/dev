package com.zend.ide.y;

import com.a.f;
import com.zend.ide.util.cl;
import com.zend.ide.util.cu;
import com.zend.ide.util.q;
import com.zend.ide.util.r;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.swing.KeyStroke;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class g
  implements r, cu
{
  public String c = "Visual_Studio";
  public static Vector d = new Vector(20);
  private static Map e = new HashMap(100);
  private static Map f = new HashMap(3);
  private static boolean h = false;
  public static g i;
  private q j;
  private PropertyChangeSupport k = new PropertyChangeSupport(this);
  private String l = ".xml";
  private File m = null;

  public static g i()
  {
    b();
    return i;
  }

  private static void b()
  {
    if (i == null)
      i = new g();
  }

  public g()
  {
    c();
  }

  private void c()
  {
    f.put("Visual_Studio", new HashMap(100));
    f.put("Emacs", new HashMap(100));
    f.put("Mac", new HashMap(100));
    a("Visual_Studio", "phpEditorPane.delete", "delete", 279, KeyStroke.getKeyStroke(127, 0));
    a("Visual_Studio", "phpEditorPane.copy", "copy", 51, KeyStroke.getKeyStroke(67, 2));
    a("Visual_Studio", "phpEditorPane.copy", "copy", 51, KeyStroke.getKeyStroke(155, 2));
    a("Visual_Studio", "phpEditorPane.paste", "paste", 52, KeyStroke.getKeyStroke(86, 2));
    a("Visual_Studio", "phpEditorPane.paste", "paste", 52, KeyStroke.getKeyStroke(155, 1));
    a("Visual_Studio", "phpEditorPane.cut", "cut", 53, KeyStroke.getKeyStroke(88, 2));
    a("Visual_Studio", "phpEditorPane.cut", "cut", 53, KeyStroke.getKeyStroke(127, 1));
    a("Visual_Studio", "phpEditorPane.selectAll", "selectAll", 738, KeyStroke.getKeyStroke(65, 2));
    a("Visual_Studio", "phpEditorPane.beginLine", "beginLine", 852, KeyStroke.getKeyStroke(36, 0));
    a("Visual_Studio", "phpEditorPane.endLine", "endLine", 853, KeyStroke.getKeyStroke(35, 0));
    a("Visual_Studio", "phpEditorPane.undo", "undo", 54, KeyStroke.getKeyStroke(90, 2));
    a("Visual_Studio", "phpEditorPane.redo", "redo", 55, KeyStroke.getKeyStroke(89, 2));
    a("Visual_Studio", "phpEditorPane.find", "find", 56, KeyStroke.getKeyStroke(70, 2));
    a("Visual_Studio", "phpEditorPane.find-next", "findNext", 57, KeyStroke.getKeyStroke(114, 0));
    a("Visual_Studio", "phpEditorPane.find-prev", "findPrev", 887, KeyStroke.getKeyStroke(114, 1));
    a("Visual_Studio", "application.findInFiles", "findInFiles", 366, KeyStroke.getKeyStroke(70, 10));
    a("Visual_Studio", "phpEditorPane.replace", "replace", 58, KeyStroke.getKeyStroke(72, 2));
    a("Visual_Studio", "phpEditorPane.saveFile", "saveFile", 59, KeyStroke.getKeyStroke(83, 2));
    a("Visual_Studio", "phpEditorPane.saveAs", "saveAs", 60, KeyStroke.getKeyStroke(83, 3));
    a("Visual_Studio", "phpEditorPane.print", "print", 61, KeyStroke.getKeyStroke(80, 2));
    a("Visual_Studio", "phpEditorPane.eraseLine", "eraseLine", 62, KeyStroke.getKeyStroke(69, 2));
    a("Visual_Studio", "phpEditorPane.reformatCode", "reformatCodeAction", 63, KeyStroke.getKeyStroke(70, 3));
    a("Visual_Studio", "application.openNextEntry", "openNextEntry", 567, KeyStroke.getKeyStroke(115, 0));
    a("Visual_Studio", "application.closeMessageComponent", "closeMessageComponent", 1289, KeyStroke.getKeyStroke(115, 2));
    a("Visual_Studio", "editor.gotoLine", "gotoLine", 64, KeyStroke.getKeyStroke(71, 2));
    a("Visual_Studio", "completionTool.showCompletionList", "showCompletionList", 67, KeyStroke.getKeyStroke(32, 2));
    a("Visual_Studio", "completionTool.showFunctionArguments", "showParametersList", 981, KeyStroke.getKeyStroke(32, 3));
    a("Visual_Studio", "editor.functionHelpAction", "functionHelpAction", 68, KeyStroke.getKeyStroke(112, 0));
    a("Visual_Studio", "editorComponent.saveAll", "saveAll", 69, KeyStroke.getKeyStroke(83, 10));
    a("Visual_Studio", "editorComponent.openDocument", "openDocument", 70, KeyStroke.getKeyStroke(79, 2));
    a("Visual_Studio", "editorComponent.newDocument", "newDocument", 71, KeyStroke.getKeyStroke(78, 2));
    a("Visual_Studio", "editorComponent.closeDocument", "closeDocument", 72, KeyStroke.getKeyStroke(115, 2));
    a("Visual_Studio", "editorComponent.closeAll", "closeAll", 289, KeyStroke.getKeyStroke(115, 3));
    a("Visual_Studio", "project.openProject", "openProject", 77, KeyStroke.getKeyStroke(79, 3));
    a("Visual_Studio", "project.newProject", "newProject", 78, KeyStroke.getKeyStroke(78, 3));
    a("Visual_Studio", "project.saveProject", "saveProject", 79, KeyStroke.getKeyStroke(80, 3));
    a("Visual_Studio", "project.checkIncludes", "checkIncludes", 342, KeyStroke.getKeyStroke(73, 3));
    a("Visual_Studio", "project.removeFromProject", "removeFromProject", 361, KeyStroke.getKeyStroke(127, 2));
    a("Visual_Studio", "debugging.toggleBreakpoint", "toggleBreakpoint", 80, KeyStroke.getKeyStroke(120, 0));
    a("Visual_Studio", "debugging.stepOver", "stepOver", 81, KeyStroke.getKeyStroke(121, 0));
    a("Visual_Studio", "debugging.stepInto", "stepInto", 82, KeyStroke.getKeyStroke(122, 0));
    a("Visual_Studio", "debugging.stepOut", "stepOut", 83, KeyStroke.getKeyStroke(122, 1));
    a("Visual_Studio", "debugging.go", "go", 84, KeyStroke.getKeyStroke(116, 0));
    a("Visual_Studio", "debugging.finishDebugger", "stop", 339, KeyStroke.getKeyStroke(116, 1));
    a("Visual_Studio", "debugging.gotoCursor", "gotoCursor", 422, KeyStroke.getKeyStroke(121, 1));
    a("Visual_Studio", "debugging.run", "run", 421, KeyStroke.getKeyStroke(116, 2));
    a("Visual_Studio", "debugging.serverConnection", "serverConnection", 987, null);
    a("Visual_Studio", "debugging.debugURL", "debugURL", 85, KeyStroke.getKeyStroke(119, 0));
    a("Visual_Studio", "debugging.profileURL", "profileURL", 936, KeyStroke.getKeyStroke(123, 0));
    a("Visual_Studio", "debugging.addWatch", "addWatch", 86, KeyStroke.getKeyStroke(119, 1));
    a("Visual_Studio", "debugging.showInBrowser", "showInBrowser", 299, KeyStroke.getKeyStroke(66, 10));
    a("Visual_Studio", "phpEditorPane.addRemoveComment", "addRemoveCooment", 493, KeyStroke.getKeyStroke(47, 2));
    a("Visual_Studio", "phpEditorPane.addRemoveComment", "addRemoveCooment", 493, KeyStroke.getKeyStroke(111, 2));
    a("Visual_Studio", "phpEditorPane.addRemovePHPBlockComment", "addRemoveBlockCooment", 494, KeyStroke.getKeyStroke(47, 3));
    a("Visual_Studio", "phpEditorPane.addRemovePHPBlockComment", "addRemoveBlockCooment", 494, KeyStroke.getKeyStroke(111, 3));
    a("Visual_Studio", "phpEditorPane.duplicateSelection", "duplicateSelection", 501, KeyStroke.getKeyStroke(68, 2));
    a("Visual_Studio", "editnig.toLowerCase", "toLowerCase", 739, KeyStroke.getKeyStroke(76, 2));
    a("Visual_Studio", "editnig.toUpperCase", "toUpperCase", 506, KeyStroke.getKeyStroke(85, 2));
    a("Visual_Studio", "editnig.boldTag", "boldTag", 507, KeyStroke.getKeyStroke(66, 2));
    a("Visual_Studio", "editnig.italicTag", "italicTag", 508, KeyStroke.getKeyStroke(73, 8));
    a("Visual_Studio", "editnig.heading1Tag", "heading1Tag", 509, KeyStroke.getKeyStroke(49, 2));
    a("Visual_Studio", "editnig.heading2Tag", "heading2Tag", 510, KeyStroke.getKeyStroke(50, 2));
    a("Visual_Studio", "editnig.heading3Tag", "heading3Tag", 511, KeyStroke.getKeyStroke(51, 2));
    a("Visual_Studio", "editnig.breakTag", "breakTag", 513, KeyStroke.getKeyStroke(10, 2));
    a("Visual_Studio", "editnig.nbspTag", "nbspTag", 874, KeyStroke.getKeyStroke(192, 2));
    a("Visual_Studio", "editnig.findMatchingBracket", "findMatchingBracket", 514, KeyStroke.getKeyStroke(77, 2));
    a("Visual_Studio", "phpEditorPane.toggleBookmark", "toggleBookmark", 777, KeyStroke.getKeyStroke(113, 0));
    a("Visual_Studio", "phpEditorPane.gotoNextBookmark", "gotoNextBookmark", 517, KeyStroke.getKeyStroke(113, 2));
    a("Visual_Studio", "phpEditorPane.gotoNextProjectBookmark", "gotoNextProjectBookmark", 535, KeyStroke.getKeyStroke(113, 8));
    a("Visual_Studio", "phpEditorPane.removeAllBookmarks", "removeAllBookmarks", 518, KeyStroke.getKeyStroke(113, 3));
    a("Visual_Studio", "phpEditorPane.openBookmarksDialog", "openBookmarksDialog", 676, KeyStroke.getKeyStroke(77, 3));
    a("Visual_Studio", "phpEditorPane.back", "back", 655, KeyStroke.getKeyStroke(37, 8));
    a("Visual_Studio", "phpEditorPane.forward", "forward", 656, KeyStroke.getKeyStroke(39, 8));
    a("Visual_Studio", "editor.showRecentFiles", "showRecentFiles", 670, KeyStroke.getKeyStroke(82, 3));
    a("Visual_Studio", "vcs.update", "update", 584, KeyStroke.getKeyStroke(85, 8));
    a("Visual_Studio", "vcs.commit", "commit", 583, KeyStroke.getKeyStroke(67, 8));
    a("Visual_Studio", "vcs.add", "add", 587, null);
    a("Visual_Studio", "vcs.status", "status", 602, null);
    a("Visual_Studio", "vcs.diff", "diff", 612, null);
    a("Visual_Studio", "vcs.log", "log", 1788, null);
    a("Visual_Studio", "vcs.checkout", "checkout", 603, null);
    a("Visual_Studio", "codeAnalyzer", "analyzeCode", 965, KeyStroke.getKeyStroke(65, 10));
    a("Visual_Studio", "editor.toggleLineWrap", "toggleLineWrap", 1214, KeyStroke.getKeyStroke(87, 2));
    a("Visual_Studio", "editor.gotoResource", "gotoResource", 1704, KeyStroke.getKeyStroke(71, 3));
    a("Visual_Studio", "editor.gotoFile", "gotoFile", 1719, KeyStroke.getKeyStroke(71, 10));
    a("Visual_Studio", "editor.foldClasses", "foldClasses", 1786, KeyStroke.getKeyStroke(50, 3));
    a("Visual_Studio", "editor.foldDocs", "foldDocs", 1787, KeyStroke.getKeyStroke(52, 3));
    a("Visual_Studio", "editor.foldFunctions", "foldFunctions", 1785, KeyStroke.getKeyStroke(51, 3));
    a("Visual_Studio", "editor.foldNonPHP", "foldNonPHP", 1784, KeyStroke.getKeyStroke(49, 3));
    a("Visual_Studio", "editor.collapseInScope", "collapseInScope", 1796, KeyStroke.getKeyStroke(57, 3));
    a("Visual_Studio", "editor.expandAllFolds", "expandAllFolds", 1783, KeyStroke.getKeyStroke(69, 3));
    a("Visual_Studio", "editor.collapseAllFolds", "collapseAllFolds", 1795, KeyStroke.getKeyStroke(67, 3));
    a("Emacs", "phpEditorPane.delete", "delete", 279, KeyStroke.getKeyStroke(127, 0));
    a("Emacs", "phpEditorPane.copy", "copy", 51, KeyStroke.getKeyStroke(155, 2));
    a("Emacs", "phpEditorPane.paste", "paste", 52, KeyStroke.getKeyStroke(155, 1));
    a("Emacs", "phpEditorPane.cut", "cut", 53, KeyStroke.getKeyStroke(127, 1));
    a("Emacs", "phpEditorPane.selectAll", "selectAll", 738, KeyStroke.getKeyStroke(65, 10));
    a("Emacs", "phpEditorPane.beginLine", "beginLine", 852, KeyStroke.getKeyStroke(65, 2));
    a("Emacs", "phpEditorPane.endLine", "endLine", 853, KeyStroke.getKeyStroke(69, 2));
    a("Emacs", "phpEditorPane.undo", "undo", 54, KeyStroke.getKeyStroke(45, 3));
    a("Emacs", "phpEditorPane.redo", "redo", 55, KeyStroke.getKeyStroke(90, 3));
    a("Emacs", "phpEditorPane.find", "find", 56, KeyStroke.getKeyStroke(83, 10));
    a("Emacs", "phpEditorPane.find-next", "findNext", 57, KeyStroke.getKeyStroke(114, 0));
    a("Emacs", "phpEditorPane.find-prev", "findPrev", 887, KeyStroke.getKeyStroke(114, 1));
    a("Emacs", "application.findInFiles", "findInFiles", 366, KeyStroke.getKeyStroke(70, 10));
    a("Emacs", "phpEditorPane.replace", "replace", 58, KeyStroke.getKeyStroke(76, 3));
    a("Emacs", "phpEditorPane.saveFile", "saveFile", 59, KeyStroke.getKeyStroke(83, 2));
    a("Emacs", "phpEditorPane.saveAs", "saveAs", 60, KeyStroke.getKeyStroke(83, 3));
    a("Emacs", "phpEditorPane.print", "print", 61, KeyStroke.getKeyStroke(80, 8));
    a("Emacs", "phpEditorPane.eraseLine", "eraseLine", 62, KeyStroke.getKeyStroke(75, 2));
    a("Emacs", "phpEditorPane.reformatCode", "reformatCodeAction", 63, KeyStroke.getKeyStroke(70, 3));
    a("Emacs", "application.openNextEntry", "openNextEntry", 567, KeyStroke.getKeyStroke(115, 0));
    a("Emacs", "application.closeMessageComponent", "closeMessageComponent", 1289, KeyStroke.getKeyStroke(115, 2));
    a("Emacs", "editor.gotoLine", "gotoLine", 64, KeyStroke.getKeyStroke(71, 8));
    a("Emacs", "completionTool.showCompletionList", "showCompletionList", 67, KeyStroke.getKeyStroke(32, 2));
    a("Emacs", "completionTool.showFunctionArguments", "showParametersList", 981, KeyStroke.getKeyStroke(32, 3));
    a("Emacs", "editor.functionHelpAction", "functionHelpAction", 68, KeyStroke.getKeyStroke(112, 0));
    a("Emacs", "editorComponent.saveAll", "saveAll", 69, KeyStroke.getKeyStroke(65, 3));
    a("Emacs", "editorComponent.openDocument", "openDocument", 70, KeyStroke.getKeyStroke(70, 2));
    a("Emacs", "editorComponent.newDocument", "newDocument", 71, KeyStroke.getKeyStroke(78, 2));
    a("Emacs", "editorComponent.closeDocument", "closeDocument", 72, KeyStroke.getKeyStroke(115, 2));
    a("Emacs", "editorComponent.closeAll", "closeAll", 289, KeyStroke.getKeyStroke(115, 3));
    a("Emacs", "project.openProject", "openProject", 77, KeyStroke.getKeyStroke(79, 3));
    a("Emacs", "project.newProject", "newProject", 78, KeyStroke.getKeyStroke(78, 3));
    a("Emacs", "project.saveProject", "saveProject", 79, KeyStroke.getKeyStroke(80, 3));
    a("Emacs", "project.checkIncludes", "checkIncludes", 342, KeyStroke.getKeyStroke(73, 3));
    a("Emacs", "project.removeFromProject", "removeFromProject", 361, KeyStroke.getKeyStroke(127, 2));
    a("Emacs", "debugging.toggleBreakpoint", "toggleBreakpoint", 80, KeyStroke.getKeyStroke(120, 0));
    a("Emacs", "debugging.stepOver", "stepOver", 81, KeyStroke.getKeyStroke(121, 0));
    a("Emacs", "debugging.stepInto", "stepInto", 82, KeyStroke.getKeyStroke(122, 0));
    a("Emacs", "debugging.stepOut", "stepOut", 83, KeyStroke.getKeyStroke(122, 1));
    a("Emacs", "debugging.go", "go", 84, KeyStroke.getKeyStroke(116, 0));
    a("Emacs", "debugging.finishDebugger", "stop", 339, KeyStroke.getKeyStroke(116, 1));
    a("Emacs", "debugging.gotoCursor", "gotoCursor", 422, KeyStroke.getKeyStroke(121, 1));
    a("Emacs", "debugging.run", "run", 421, KeyStroke.getKeyStroke(116, 2));
    a("Emacs", "debugging.serverConnection", "serverConnection", 987, null);
    a("Emacs", "debugging.debugURL", "debugURL", 85, KeyStroke.getKeyStroke(119, 0));
    a("Emacs", "debugging.profileURL", "profileURL", 936, KeyStroke.getKeyStroke(123, 0));
    a("Emacs", "debugging.addWatch", "addWatch", 86, KeyStroke.getKeyStroke(119, 1));
    a("Emacs", "debugging.showInBrowser", "showInBrowser", 299, KeyStroke.getKeyStroke(66, 8));
    a("Emacs", "phpEditorPane.addRemoveComment", "addRemoveCooment", 493, KeyStroke.getKeyStroke(47, 2));
    a("Emacs", "phpEditorPane.addRemovePHPBlockComment", "addRemoveBlockCooment", 494, KeyStroke.getKeyStroke(47, 3));
    a("Emacs", "phpEditorPane.duplicateSelection", "duplicateSelection", 501, KeyStroke.getKeyStroke(68, 2));
    a("Emacs", "editnig.toLowerCase", "toLowerCase", 739, KeyStroke.getKeyStroke(76, 2));
    a("Emacs", "editnig.toUpperCase", "toUpperCase", 506, KeyStroke.getKeyStroke(85, 2));
    a("Emacs", "editnig.boldTag", "boldTag", 507, KeyStroke.getKeyStroke(66, 2));
    a("Emacs", "editnig.italicTag", "italicTag", 508, KeyStroke.getKeyStroke(73, 8));
    a("Emacs", "editnig.heading1Tag", "heading1Tag", 509, KeyStroke.getKeyStroke(49, 2));
    a("Emacs", "editnig.heading2Tag", "heading2Tag", 510, KeyStroke.getKeyStroke(50, 2));
    a("Emacs", "editnig.heading3Tag", "heading3Tag", 511, KeyStroke.getKeyStroke(51, 2));
    a("Emacs", "editnig.breakTag", "breakTag", 513, KeyStroke.getKeyStroke(192, 2));
    a("Emacs", "editnig.nbspTag", "nbspTag", 874, KeyStroke.getKeyStroke(52, 2));
    a("Emacs", "editnig.findMatchingBracket", "findMatchingBracket", 514, KeyStroke.getKeyStroke(77, 2));
    a("Emacs", "phpEditorPane.toggleBookmark", "toggleBookmark", 777, KeyStroke.getKeyStroke(113, 0));
    a("Emacs", "phpEditorPane.gotoNextBookmark", "gotoNextBookmark", 517, KeyStroke.getKeyStroke(113, 2));
    a("Emacs", "phpEditorPane.gotoNextProjectBookmark", "gotoNextProjectBookmark", 535, KeyStroke.getKeyStroke(113, 1));
    a("Emacs", "phpEditorPane.removeAllBookmarks", "removeAllBookmarks", 518, KeyStroke.getKeyStroke(113, 3));
    a("Emacs", "phpEditorPane.openBookmarksDialog", "openBookmarksDialog", 676, KeyStroke.getKeyStroke(77, 3));
    a("Emacs", "phpEditorPane.back", "back", 655, KeyStroke.getKeyStroke(44, 2));
    a("Emacs", "phpEditorPane.forward", "forward", 656, KeyStroke.getKeyStroke(46, 2));
    a("Emacs", "editor.showRecentFiles", "showRecentFiles", 670, KeyStroke.getKeyStroke(82, 3));
    a("Emacs", "vcs.update", "update", 584, KeyStroke.getKeyStroke(85, 8));
    a("Emacs", "vcs.commit", "commit", 583, KeyStroke.getKeyStroke(67, 8));
    a("Emacs", "vcs.add", "add", 587, null);
    a("Emacs", "vcs.status", "status", 602, null);
    a("Emacs", "vcs.diff", "diff", 612, null);
    a("Emacs", "vcs.log", "log", 1788, null);
    a("Emacs", "vcs.checkout", "checkout", 603, null);
    a("Emacs", "codeAnalyzer", "analyzeCode", 965, KeyStroke.getKeyStroke(65, 10));
    a("Emacs", "editor.toggleLineWrap", "toggleLineWrap", 1214, KeyStroke.getKeyStroke(87, 2));
    a("Emacs", "editor.gotoResource", "gotoResource", 1704, KeyStroke.getKeyStroke(71, 3));
    a("Emacs", "editor.gotoFile", "gotoFile", 1719, KeyStroke.getKeyStroke(71, 10));
    a("Emacs", "editor.foldClasses", "foldClasses", 1786, KeyStroke.getKeyStroke(50, 3));
    a("Emacs", "editor.foldDocs", "foldDocs", 1787, KeyStroke.getKeyStroke(52, 3));
    a("Emacs", "editor.foldFunctions", "foldFunctions", 1785, KeyStroke.getKeyStroke(51, 3));
    a("Emacs", "editor.foldNonPHP", "foldNonPHP", 1784, KeyStroke.getKeyStroke(49, 3));
    a("Emacs", "editor.collapseInScope", "collapseInScope", 1796, KeyStroke.getKeyStroke(57, 3));
    a("Emacs", "editor.expandAllFolds", "expandAllFolds", 1783, KeyStroke.getKeyStroke(69, 3));
    a("Emacs", "editor.collapseAllFolds", "collapseAllFolds", 1795, KeyStroke.getKeyStroke(67, 3));
    a("Mac", "phpEditorPane.delete", "delete", 279, KeyStroke.getKeyStroke(127, 0));
    a("Mac", "phpEditorPane.copy", "copy", 51, KeyStroke.getKeyStroke(67, 4));
    a("Mac", "phpEditorPane.paste", "paste", 52, KeyStroke.getKeyStroke(86, 4));
    a("Mac", "phpEditorPane.cut", "cut", 53, KeyStroke.getKeyStroke(88, 4));
    a("Mac", "phpEditorPane.selectAll", "selectAll", 738, KeyStroke.getKeyStroke(65, 4));
    a("Mac", "phpEditorPane.beginLine", "beginLine", 852, KeyStroke.getKeyStroke(36, 0));
    a("Mac", "phpEditorPane.beginLine", "beginLine", 852, KeyStroke.getKeyStroke(37, 4));
    a("Mac", "phpEditorPane.endLine", "endLine", 853, KeyStroke.getKeyStroke(35, 0));
    a("Mac", "phpEditorPane.endLine", "endLine", 853, KeyStroke.getKeyStroke(39, 4));
    a("Mac", "phpEditorPane.undo", "undo", 54, KeyStroke.getKeyStroke(90, 4));
    a("Mac", "phpEditorPane.redo", "redo", 55, KeyStroke.getKeyStroke(90, 5));
    a("Mac", "phpEditorPane.find", "find", 56, KeyStroke.getKeyStroke(70, 4));
    a("Mac", "phpEditorPane.find-next", "findNext", 57, KeyStroke.getKeyStroke(71, 4));
    a("Mac", "phpEditorPane.find-prev", "findPrev", 887, KeyStroke.getKeyStroke(71, 5));
    a("Mac", "application.findInFiles", "findInFiles", 366, KeyStroke.getKeyStroke(70, 12));
    a("Mac", "phpEditorPane.replace", "replace", 58, KeyStroke.getKeyStroke(82, 4));
    a("Mac", "phpEditorPane.saveFile", "saveFile", 59, KeyStroke.getKeyStroke(83, 4));
    a("Mac", "phpEditorPane.saveAs", "saveAs", 60, KeyStroke.getKeyStroke(83, 3));
    a("Mac", "phpEditorPane.print", "print", 61, KeyStroke.getKeyStroke(80, 2));
    a("Mac", "phpEditorPane.eraseLine", "eraseLine", 62, KeyStroke.getKeyStroke(69, 4));
    a("Mac", "phpEditorPane.reformatCode", "reformatCodeAction", 63, KeyStroke.getKeyStroke(70, 3));
    a("Mac", "application.openNextEntry", "openNextEntry", 567, KeyStroke.getKeyStroke(115, 0));
    a("Mac", "application.closeMessageComponent", "closeMessageComponent", 1289, KeyStroke.getKeyStroke(115, 2));
    a("Mac", "editor.gotoLine", "gotoLine", 64, KeyStroke.getKeyStroke(84, 10));
    a("Mac", "completionTool.showCompletionList", "showCompletionList", 67, KeyStroke.getKeyStroke(32, 2));
    a("Mac", "completionTool.showFunctionArguments", "showParametersList", 981, KeyStroke.getKeyStroke(32, 3));
    a("Mac", "editor.functionHelpAction", "functionHelpAction", 68, KeyStroke.getKeyStroke(112, 0));
    a("Mac", "editorComponent.saveAll", "saveAll", 69, KeyStroke.getKeyStroke(83, 10));
    a("Mac", "editorComponent.openDocument", "openDocument", 70, KeyStroke.getKeyStroke(79, 4));
    a("Mac", "editorComponent.newDocument", "newDocument", 71, KeyStroke.getKeyStroke(78, 4));
    a("Mac", "editorComponent.closeDocument", "closeDocument", 72, KeyStroke.getKeyStroke(115, 4));
    a("Mac", "editorComponent.closeAll", "closeAll", 289, KeyStroke.getKeyStroke(115, 5));
    a("Mac", "project.openProject", "openProject", 77, KeyStroke.getKeyStroke(79, 9));
    a("Mac", "project.newProject", "newProject", 78, KeyStroke.getKeyStroke(78, 3));
    a("Mac", "project.saveProject", "saveProject", 79, KeyStroke.getKeyStroke(80, 3));
    a("Mac", "project.checkIncludes", "checkIncludes", 342, KeyStroke.getKeyStroke(73, 3));
    a("Mac", "project.removeFromProject", "removeFromProject", 361, KeyStroke.getKeyStroke(127, 4));
    a("Mac", "debugging.toggleBreakpoint", "toggleBreakpoint", 80, KeyStroke.getKeyStroke(119, 4));
    a("Mac", "debugging.stepOver", "stepOver", 81, KeyStroke.getKeyStroke(117, 0));
    a("Mac", "debugging.stepInto", "stepInto", 82, KeyStroke.getKeyStroke(118, 0));
    a("Mac", "debugging.stepOut", "stepOut", 83, KeyStroke.getKeyStroke(118, 1));
    a("Mac", "debugging.go", "go", 84, KeyStroke.getKeyStroke(116, 0));
    a("Mac", "debugging.finishDebugger", "stop", 339, KeyStroke.getKeyStroke(116, 1));
    a("Mac", "debugging.gotoCursor", "gotoCursor", 422, KeyStroke.getKeyStroke(121, 8));
    a("Mac", "debugging.run", "run", 421, KeyStroke.getKeyStroke(116, 4));
    a("Mac", "debugging.serverConnection", "serverConnection", 987, null);
    a("Mac", "debugging.debugURL", "debugURL", 85, KeyStroke.getKeyStroke(119, 0));
    a("Mac", "debugging.profileURL", "profileURL", 936, KeyStroke.getKeyStroke(123, 0));
    a("Mac", "debugging.addWatch", "addWatch", 86, KeyStroke.getKeyStroke(119, 1));
    a("Mac", "debugging.showInBrowser", "showInBrowser", 299, KeyStroke.getKeyStroke(66, 4));
    a("Mac", "phpEditorPane.addRemoveComment", "addRemoveCooment", 493, KeyStroke.getKeyStroke(47, 2));
    a("Mac", "phpEditorPane.addRemovePHPBlockComment", "addRemoveBlockCooment", 494, KeyStroke.getKeyStroke(47, 3));
    a("Mac", "phpEditorPane.duplicateSelection", "duplicateSelection", 501, KeyStroke.getKeyStroke(68, 4));
    a("Mac", "editnig.toLowerCase", "toLowerCase", 739, KeyStroke.getKeyStroke(76, 2));
    a("Mac", "editnig.toUpperCase", "toUpperCase", 506, KeyStroke.getKeyStroke(85, 2));
    a("Mac", "editnig.boldTag", "boldTag", 507, KeyStroke.getKeyStroke(66, 2));
    a("Mac", "editnig.italicTag", "italicTag", 508, KeyStroke.getKeyStroke(73, 4));
    a("Mac", "editnig.heading1Tag", "heading1Tag", 509, KeyStroke.getKeyStroke(49, 2));
    a("Mac", "editnig.heading2Tag", "heading2Tag", 510, KeyStroke.getKeyStroke(50, 2));
    a("Mac", "editnig.heading3Tag", "heading3Tag", 511, KeyStroke.getKeyStroke(51, 2));
    a("Mac", "editnig.breakTag", "breakTag", 513, KeyStroke.getKeyStroke(10, 2));
    a("Mac", "editnig.nbspTag", "nbspTag", 874, KeyStroke.getKeyStroke(192, 2));
    a("Mac", "editnig.findMatchingBracket", "findMatchingBracket", 514, KeyStroke.getKeyStroke(77, 2));
    a("Mac", "phpEditorPane.toggleBookmark", "toggleBookmark", 777, KeyStroke.getKeyStroke(113, 0));
    a("Mac", "phpEditorPane.gotoNextBookmark", "gotoNextBookmark", 517, KeyStroke.getKeyStroke(113, 8));
    a("Mac", "phpEditorPane.gotoNextProjectBookmark", "gotoNextProjectBookmark", 535, KeyStroke.getKeyStroke(113, 1));
    a("Mac", "phpEditorPane.removeAllBookmarks", "removeAllBookmarks", 518, KeyStroke.getKeyStroke(113, 10));
    a("Mac", "phpEditorPane.openBookmarksDialog", "openBookmarksDialog", 676, KeyStroke.getKeyStroke(66, 10));
    a("Mac", "phpEditorPane.back", "back", 655, KeyStroke.getKeyStroke(44, 2));
    a("Mac", "phpEditorPane.forward", "forward", 656, KeyStroke.getKeyStroke(46, 2));
    a("Mac", "editor.showRecentFiles", "showRecentFiles", 670, KeyStroke.getKeyStroke(82, 3));
    a("Mac", "vcs.update", "update", 584, KeyStroke.getKeyStroke(85, 8));
    a("Mac", "vcs.commit", "commit", 583, KeyStroke.getKeyStroke(67, 8));
    a("Mac", "vcs.add", "add", 587, null);
    a("Mac", "vcs.status", "status", 602, null);
    a("Mac", "vcs.diff", "diff", 612, null);
    a("Mac", "vcs.log", "log", 1788, null);
    a("Mac", "vcs.checkout", "checkout", 603, null);
    a("Mac", "codeAnalyzer", "analyzeCode", 965, KeyStroke.getKeyStroke(65, 12));
    a("Mac", "editor.toggleLineWrap", "toggleLineWrap", 1214, KeyStroke.getKeyStroke(87, 2));
    a("Mac", "editor.gotoResource", "gotoResource", 1704, KeyStroke.getKeyStroke(71, 3));
    a("Mac", "editor.gotoFile", "gotoFile", 1719, KeyStroke.getKeyStroke(71, 10));
    a("Mac", "editor.foldClasses", "foldClasses", 1786, KeyStroke.getKeyStroke(50, 3));
    a("Mac", "editor.foldDocs", "foldDocs", 1787, KeyStroke.getKeyStroke(52, 3));
    a("Mac", "editor.foldFunctions", "foldFunctions", 1785, KeyStroke.getKeyStroke(51, 3));
    a("Mac", "editor.foldNonPHP", "foldNonPHP", 1784, KeyStroke.getKeyStroke(49, 3));
    a("Mac", "editor.collapseInScope", "collapseInScope", 1796, KeyStroke.getKeyStroke(57, 3));
    a("Mac", "editor.expandAllFolds", "expandAllFolds", 1783, KeyStroke.getKeyStroke(69, 3));
    a("Mac", "editor.collapseAllFolds", "collapseAllFolds", 1795, KeyStroke.getKeyStroke(67, 3));
    this.j = new q();
    a(this.j);
  }

  protected void a(String paramString1, String paramString2, String paramString3, int paramInt, Object paramObject)
  {
    if (paramObject == null)
      paramObject = new Vector();
    h localh1 = new h(this, paramString2, paramString3, paramInt, paramObject);
    if (((HashMap)f.get(paramString1)).containsKey(paramString2))
      ((h)((HashMap)f.get(paramString1)).get(paramString2)).c(paramObject);
    else
      ((HashMap)f.get(paramString1)).put(paramString2, localh1);
    if (paramString1 == "Visual_Studio")
    {
      h localh2 = new h(this, paramString2, paramString3, paramInt, paramObject);
      if (e.containsKey(paramString2))
      {
        ((h)e.get(paramString2)).c(paramObject);
      }
      else
      {
        e.put(paramString2, localh2);
        d.add(paramString2);
      }
    }
  }

  public static void d()
  {
    if (!f.containsKey(e()))
      k("Visual_Studio");
    HashMap localHashMap1 = (HashMap)f.get(e());
    HashMap localHashMap2 = (HashMap)f.get("Visual_Studio");
    Iterator localIterator = e.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      h localh = (h)localHashMap1.get(str);
      if (localh == null)
      {
        localh = (h)localHashMap2.get(str);
        localHashMap1.put(str, localh);
      }
      Object localObject = localh.c();
      ((h)e.get(str)).a(localObject);
    }
  }

  public static h a(String paramString)
  {
    return i().b(paramString);
  }

  protected h b(String paramString)
  {
    paramString = (String)a(paramString);
    if (d.indexOf(paramString) == -1)
      return null;
    if (!f.containsKey(this.c))
      return (h)(h)((HashMap)f.get("Visual_Studio")).get(paramString);
    h localh = (h)(h)((HashMap)f.get(this.c)).get(paramString);
    if (localh == null)
    {
      localh = (h)(h)((HashMap)f.get("Visual_Studio")).get(paramString);
      ((HashMap)f.get(this.c)).put(paramString, localh);
    }
    return localh;
  }

  public static String e()
  {
    return i().g();
  }

  public static void k(String paramString)
  {
    i().l(paramString);
  }

  protected void l(String paramString)
  {
    this.c = paramString;
  }

  protected String g()
  {
    return this.c;
  }

  protected void a(PropertyChangeListener paramPropertyChangeListener)
  {
    this.k.addPropertyChangeListener(paramPropertyChangeListener);
  }

  public static void c(String paramString)
  {
    i().d(paramString);
  }

  protected void d(String paramString)
  {
    b.a("application.chosenConfig").a(this.c);
    this.m = new File(paramString, "keymaps");
    if (!this.m.exists())
      this.m.mkdirs();
    Iterator localIterator = f.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      try
      {
        File localFile = new File(this.m, str + this.l);
        if (!localFile.exists())
          localFile.createNewFile();
        Collection localCollection = ((HashMap)f.get(str)).values();
        h[] arrayOfh = new h[localCollection.size()];
        localCollection.toArray(arrayOfh);
        try
        {
          f.a(localFile.getPath(), arrayOfh);
        }
        catch (IOException localIOException2)
        {
          cl.a(localIOException2);
        }
      }
      catch (IOException localIOException1)
      {
        cl.a(localIOException1);
      }
    }
  }

  public static void e(String paramString)
  {
    i().f(paramString);
  }

  protected void f(String paramString)
  {
    this.c = ((String)b.a("application.chosenConfig").c());
    h = true;
    HashMap localHashMap = null;
    this.m = new File(paramString, "keymaps");
    if ((this.m.exists()) && (this.m.listFiles() != null))
    {
      File[] arrayOfFile = this.m.listFiles();
      int n = 0;
      File localFile;
      for (int i1 = 0; i1 < arrayOfFile.length; i1++)
      {
        localFile = arrayOfFile[i1];
        if (!localFile.getName().equals(this.c + this.l))
          continue;
        n = 1;
        break;
      }
      if (n == 0)
        this.c = "Visual_Studio";
      for (i1 = 0; i1 < arrayOfFile.length; i1++)
      {
        localFile = arrayOfFile[i1];
        String str1 = localFile.getName();
        try
        {
          int i2 = str1.indexOf(this.l);
          if (i2 == -1)
            continue;
          String str2 = str1.substring(0, i2);
          try
          {
            h[] arrayOfh = (h[])(h[])f.a(localFile.getPath());
            if (!f.containsKey(str2))
              f.put(str2, localHashMap = new HashMap(20));
            for (int i3 = 0; i3 < arrayOfh.length; i3++)
            {
              h localh1 = arrayOfh[i3];
              if (localh1 == null)
                continue;
              h localh2 = (h)((HashMap)f.get(str2)).get(a(localh1.h()));
              if (localh2 != null)
                localh2.a(localh1.c());
              else
                localHashMap.put(localh1.h(), localh1);
            }
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
        }
        catch (Exception localException)
        {
          cl.a("Can not load the user settings file. The application will use the defaults.");
          cl.a(localException);
        }
      }
    }
    d();
    h = false;
  }

  public static void g(String paramString)
  {
    i().h(paramString);
  }

  protected void h(String paramString)
  {
    HashMap localHashMap = new HashMap(20);
    for (int n = 0; n < d.size(); n++)
    {
      Object localObject1 = d.get(n);
      h localh = (h)((HashMap)f.get(this.c)).get(localObject1);
      Object localObject2 = localh.h();
      String str = localh.e();
      int i1 = h.a(localh);
      Object localObject3 = localh.c();
      localHashMap.put(localObject1, new h(this, localObject2, str, i1, localObject3));
    }
    f.put(paramString, localHashMap);
    this.c = paramString;
  }

  public static void i(String paramString)
  {
    i().j(paramString);
  }

  protected void j(String paramString)
  {
    if (f.containsKey(paramString))
    {
      f.remove(paramString);
      if (this.c.equals(paramString))
        this.c = "Visual_Studio";
    }
    File localFile = new File(this.m, paramString + this.l);
    if (localFile.exists())
      localFile.delete();
    d();
  }

  public static Iterator f()
  {
    return f.keySet().iterator();
  }

  public static boolean m(String paramString)
  {
    return (paramString.equals("Visual_Studio")) || (paramString.equals("Emacs")) || (paramString.equals("Mac"));
  }

  private Object a(Object paramObject)
  {
    if (paramObject.equals("cvs.update"))
      return "vcs.update";
    if (paramObject.equals("cvs.commit"))
      return "vcs.commit";
    if (paramObject.equals("cvs.add"))
      return "vcs.add";
    if (paramObject.equals("cvs.checkout"))
      return "vcs.checkout";
    if (paramObject.equals("cvs.diff"))
      return "vcs.diff";
    if (paramObject.equals("cvs.status"))
      return "vcs.status";
    return paramObject;
  }

  static boolean h()
  {
    return h;
  }

  static PropertyChangeSupport b(g paramg)
  {
    return paramg.k;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.g
 * JD-Core Version:    0.6.0
 */