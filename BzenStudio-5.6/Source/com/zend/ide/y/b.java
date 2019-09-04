package com.zend.ide.y;

import com.zend.ide.f.zc.b.j;
import com.zend.ide.j.t;
import com.zend.ide.n.bf;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import com.zend.ide.util.bh;
import com.zend.ide.util.bi;
import com.zend.ide.util.bv;
import com.zend.ide.util.ck;
import com.zend.ide.util.cl;
import com.zend.ide.util.cm;
import com.zend.ide.util.cr;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import com.zend.ide.util.fb;
import com.zend.ide.util.ib;
import com.zend.ide.util.jb;
import com.zend.ide.util.q;
import com.zend.ide.w.db;
import java.awt.Color;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class b
  implements com.zend.ide.util.r, cu
{
  private Map a = new HashMap(110);
  private static Map j = new HashMap(10);
  private static String c = new File(cv.d()).getPath();
  private q e;
  private boolean f = false;
  public static b g;
  private PropertyChangeSupport h = new PropertyChangeSupport(this);

  protected static b h()
  {
    b();
    return g;
  }

  private static void b()
  {
    if (g == null)
    {
      g = new b();
      e();
    }
  }

  private b()
  {
    g();
    c();
  }

  private void g()
  {
    j.put("editor_options", new ArrayList());
    j.put("debug_options", new ArrayList());
    j.put("platform_integration", new ArrayList());
    j.put("general_colors", new ArrayList());
    j.put("desktop_options", new ArrayList());
    j.put("source_control_options", new ArrayList());
    j.put("cvs_options", new ArrayList());
    j.put("svn_options", new ArrayList());
    j.put("dialogs_options", new ArrayList());
    j.put("code_completion_settings", new ArrayList());
    j.put("active_keymap", new ArrayList());
    j.put("file_filters", new ArrayList());
    j.put("sql_options", new ArrayList());
    j.put("proxy_settings", new ArrayList());
  }

  private void c()
  {
    String str1 = "Visual_Studio";
    if (cr.c() == 3)
      str1 = "Mac";
    this.e = new q();
    a(this.e);
    a("highlighting.defaultColor", "defaultColor", 37, Color.black, null);
    a("useHTTPProxy", "useHTTPProxy", 1702, new Boolean(false), "proxy_settings");
    a("HTTPProxyHost", "HTTPProxyHost", 1702, "", "proxy_settings");
    a("HTTPProxyPort", "HTTPProxyPort", 1702, new Integer(-1), "proxy_settings");
    a("HTTPProxyUser", "HTTPProxyUser", 1702, "", "proxy_settings");
    a("HTTPProxyPassword", "HTTPProxyPassword", 1702, "", "proxy_settings");
    a("useHTTPProxyAuthentication", "useHTTPProxyAuthentication", 1702, new Boolean(false), "proxy_settings");
    a("explorer.fileFilter", "fileFilter", 21, p.f().j(), "file_filters");
    o localo = p.e().a("Web Documents");
    if (localo == null)
      localo = p.f();
    a("project.projectFileFilter", "projectFileFilter", 21, localo.j(), "file_filters");
    a("application.chosenConfig", "chosenConfig", 244, str1, "active_keymap");
    a("editing.tabSize", "tabSize", 12, new Integer(4), "editor_options");
    a("editing.tabAsSpaces", "tabAsSpaces", 13, Boolean.FALSE, "editor_options");
    a("editing.smartHome", "smartHome", 1008, Boolean.TRUE, "editor_options");
    a("editing.highlightingTurnOff", "highlightingTurnOff", 18, Boolean.TRUE, "editor_options");
    a("editing.autoIndent", "autoIndent", 19, Boolean.TRUE, "editor_options");
    a("editing.bracketPairInsertion", "bracketPairInsertion", 1693, Boolean.TRUE, "editor_options");
    a("editing.curlyPairInsertion", "curlyPairInsertion", 1695, Boolean.TRUE, "editor_options");
    a("editing.quotePairInsertion", "quotePairInsertion", 1694, Boolean.TRUE, "editor_options");
    a("editing.htmlClosingTagInsertion", "htmlClosingTagInsertion", 1696, Boolean.TRUE, "editor_options");
    a("editing.docBlocInsertion", "docBlocInsertion", 1717, Boolean.TRUE, "editor_options");
    a("editing.generateStub", "generateDocStub", 1700, Boolean.TRUE, "editor_options");
    a("editing.lineEnding", "lineEnding", 657, new ck("As is"), "editor_options");
    a("editing.lineWrap", "wrapLine", 500, Boolean.FALSE, "editor_options");
    a("editing.wordWrap", "wrapWord", 849, Boolean.FALSE, "editor_options");
    a("editing.stripSpaces", "stripSpaces", 1701, Boolean.FALSE, "editor_options");
    a("editnig.matchingBracketLineTooltip", "matchingBracketLineTooltip", 554, new Boolean(true), "editor_options");
    a("editing.bracketMatchingEnabled", "bracketMatchingEnabled", 503, Boolean.TRUE, "editor_options");
    a("editing.quoteMatchingEnabled", "quoteMatchingEnabled", 541, Boolean.TRUE, "editor_options");
    a("editing.currentLineHighlightingEnabled", "currentLineHighlightingEnabled", 525, Boolean.TRUE, "editor_options");
    a("editing.realTimeError", "realTimeError", 1005, Boolean.TRUE, "editor_options");
    a("editing.maxRealTimeErrors", "maxRealTimeErrors", 1133, new Integer(10), "editor_options");
    a("editing.foldingEnabled", "foldingEnabled", 1771, new Boolean(true), "editor_options");
    a("editing.foldingNonPHP", "foldNonPHP", 1773, new Boolean(false), "editor_options");
    a("editing.foldingDocBlocks", "foldDocBlocks", 1774, new Boolean(false), "editor_options");
    a("editing.foldingClasses", "foldClasses", 1641, new Boolean(false), "editor_options");
    a("editing.foldingFunctions", "foldFunctions", 1775, new Boolean(false), "editor_options");
    a("editing.showPrintMargin", "showPrintMargin", 1767, new Boolean(false), "editor_options");
    a("editing.printMarginColumn", "printMarginColumn", 1767, new Integer(80), "editor_options");
    a("editing.styleManager", "styleManager", 1149, new bf(), "general_colors");
    a("application.chosenScheme", "chosenScheme", 1150, "Default", "general_colors");
    a("editing.font", "font", 11, cr.b(), "general_colors");
    a("editing.background", "background", 10, Color.white, "general_colors");
    a("editing.bracketQuoteMatching", "bracketQuoteMatching", 1201, new Color(102, 204, 255), "general_colors");
    a("editing.bracketMatchingErrorColor", "bracketMatchingErrorColor", 547, new Color(255, 204, 204), "general_colors");
    a("editing.searchInSelectedHighlightingColor", "searchInSelectedHighlightingColor", 528, Color.orange, "general_colors");
    a("editing.currentLineColor", "currentLineColor", 526, new Color(255, 255, 215), "general_colors");
    a("highlighting.breakpointColor", "breakpointColor", 39, new Color(255, 190, 190), "general_colors");
    a("highlighting.debugStepColor", "debugStepColor", 40, Color.cyan, "general_colors");
    a("cvsDiff.diffAppend", "diffAppend", 1245, new Color(133, 213, 250), "general_colors");
    a("cvsDiff.diffChange", "diffChange", 1244, new Color(134, 243, 168), "general_colors");
    a("cvsDiff.diffDelete", "diffDelete", 1246, new Color(245, 166, 201), "general_colors");
    a("completion.phpAutoShowCompletion", "completionPHPAutoShowCompletion", 946, Boolean.TRUE, "code_completion_settings");
    a("completion.phpShowFewerThan", "completionPHPShowFewerThan", 947, new Integer(500), "code_completion_settings");
    a("completion.phpDelay", "completionPHPDelay", 949, new Integer(0), "code_completion_settings");
    a("completion.phpAutoClassNames", "completionPHPAutoClassNames", 956, Boolean.TRUE, "code_completion_settings");
    a("completion.phpAutoVariables", "completionPHPAutoVariables", 957, Boolean.TRUE, "code_completion_settings");
    a("completion.phpAutoFunctions", "completionPHPAutoFunctions", 958, Boolean.TRUE, "code_completion_settings");
    a("completion.phpVariablesFromOtherFiles", "completionPHPVariablesFromOtherFiles", 959, Boolean.TRUE, "code_completion_settings");
    a("completion.phpObjectsFromOtherFiles", "completionPHPObjectsFromOtherFiles", 960, Boolean.TRUE, "code_completion_settings");
    a("completion.phpDisableConstants", "completionPHPDisableConstants", 961, Boolean.FALSE, "code_completion_settings");
    a("completion.phpCaseSensitiveForConstants", "caseSensitiveForConstants", 1062, Boolean.TRUE, "code_completion_settings");
    a("completion.phpAutoFunctionsArguments", "completionPHPAutoFunctionsArguments", 962, Boolean.TRUE, "code_completion_settings");
    a("completion.phpFullFunctionPrototype", "completionPHPFullFunctionPrototype", 963, Boolean.FALSE, "code_completion_settings");
    a("completion.phpStrictLanguage", "completionPHPStrictLanguage", 965, Boolean.FALSE, "code_completion_settings");
    a("completion.phpDescriptions", "completionPHPDescriptions", 964, Boolean.TRUE, "code_completion_settings");
    a("completion.phpDescriptionDelay", "completionPHPDescriptionDelay", 950, new Integer(150), "code_completion_settings");
    a("completion.phpclassNamesInGlobalsList", "CcompletionPHPclassNamesInGlobalsList", 1096, Boolean.TRUE, "code_completion_settings");
    a("completion.phpRemoveEnding", "phpRemoveEnding", 1096, Boolean.FALSE, "code_completion_settings");
    a("completion.htmlAutoShowCompletion", "completionHTMLAutoShowCompletion", 946, Boolean.TRUE, "code_completion_settings");
    a("completion.htmlShowFewerThan", "completionHTMLShowFewerThan", 947, new Integer(500), "code_completion_settings");
    a("completion.htmlDelay", "completionHTMLDelay", 949, new Integer(0), "code_completion_settings");
    a("completion.htmlAutoTags", "completionHTMLAutoTags", 951, Boolean.TRUE, "code_completion_settings");
    a("completion.htmlAutoAtributes", "completionHTMLAutoAtributes", 952, Boolean.TRUE, "code_completion_settings");
    a("completion.htmlAutoAtributesValues", "completionHTMLAutoAtributesValues", 953, Boolean.TRUE, "code_completion_settings");
    a("editing.htmlTagUppercase", "htmlTagUppercase", 954, Boolean.FALSE, "code_completion_settings");
    a("completion.htmlRemoveEnding", "htmlRemoveEnding", 954, Boolean.FALSE, "code_completion_settings");
    a("completion.xhtmlTagStyle", "useXhtmlTagStyle", 1756, Boolean.FALSE, "code_completion_settings");
    j localj = com.zend.ide.f.zc.b.h.b();
    a("javaBridge.defaultJRE", "javabridgeDefaultJRE", 1829, localj, "code_completion_settings");
    a("javaBridge.JREs", "javabridgeJREs", 1829, new j[] { localj }, "code_completion_settings");
    a("debugging.localDebugging", "remoteDebugging", 49, new Boolean(false), "debug_options");
    a("debugging.serverHost", "serverHost", 43, new bv("http://Server_Address/"), "debug_options");
    a("debugging.debugPort", "debugPort", 41, new Integer(10000), "debug_options");
    a("debugging.showHeader", "showHeader", 44, new Boolean(true), "debug_options");
    a("debugging.dummyFile", "dummyFile", 45, "dummy.php", "debug_options");
    a("debugging.tempFilesLocation", "tempFilesLocation", 658, new File(System.getProperty("user.home")), "debug_options");
    a("debugging.serverResponseTimeout", "serverResponseTimeout", 46, new Integer(10), "debug_options");
    a("debugging.firstLineBreakpoint", "firstLineBreakpoint", 731, new Boolean(true), "debug_options");
    a("debugging.variableDisplay", "variableDisplay", 48, new Boolean(false), "debug_options");
    a("debugging.useOutputEncoding", "useOutputEncoding", 1292, new Boolean(false), "debug_options");
    a("debugging.outputEncoding", "outputEncoding", 430, bh.a, "debug_options");
    a("debugging.startEndFilter", "startEndFilter", 486, new Boolean(true), "debug_options");
    a("debugging.noticesdFilter", "noticesFilter", 487, new Boolean(true), "debug_options");
    a("debugging.warningFilter", "warningFilter", 488, new Boolean(true), "debug_options");
    a("debugging.errorFilter", "errorFilter", 489, new Boolean(true), "debug_options");
    a("debugging.strictFilter", "strictFilter", 1264, new Boolean(true), "debug_options");
    a("debugging.grabFocusOnDebugSession", "grabFocusOnDebugSession", 1277, new Boolean(true), "debug_options");
    a("debugging.autoOpenDebugWindow", "autoOpenDebugWindow", 543, new Boolean(true), "debug_options");
    a("debugging.autoOpenDebugMessagesWindow", "autoOpenDebugMessagesWindow", 544, new Boolean(true), "debug_options");
    a("debugging.autoOpenOutputWindow", "autoOpenOutputWindow", 545, new Boolean(true), "debug_options");
    a("debugging.useDefaultClientIP", "useDefaultClientIP", 37, new Boolean(true), "debug_options");
    a("debugging.encryptedData", "encryptedData", 1141, new Boolean(false), "debug_options");
    a("debugging.customizedClientIP", "customizedClientIP", 1134, new String(""), "debug_options");
    a("debugging.httpServerPort", "httpServerPort", 1437, new Integer(20080), "debug_options");
    a("debugging.tunnelHost", "tunnelHost", 1428, "", "debug_options");
    a("debugging.tunnelPort", "tunnelPort", 1429, new Integer(80), "debug_options");
    a("debugging.autoConnectTunnel", "autoConnectTunnel", 1430, new Boolean(false), "debug_options");
    a("debugging.tunnelReturnHost", "tunnelReturnHost", 1431, new String(""), "debug_options");
    a("debugging.tunnelRandomPort", "tunnelRandomPort", 1431, new Integer(-1), "debug_options");
    a("debugging.fastFile", "fastFile", 242, Boolean.TRUE, "debug_options");
    a("debugging.tunnelUseAuthentication", "tunnelUseAuthentication", 1549, new Boolean(false), "debug_options");
    a("debugging.tunnelAuthUsername", "tunnelAuthUsername", 190, new String(""), "debug_options");
    a("debugging.tunnelAuthPassword", "tunnelAuthPassword", 191, new String(""), "debug_options");
    a("platform.useDefaultGUI", "platformUseDefaultGUI", 37, new Boolean(true), "platform_integration");
    a("platform.guiURL", "platformURL", 148, new String(""), "platform_integration");
    a("platform.username", "platformAuthUsername", 190, new String(""), "platform_integration");
    a("platform.password", "platformAuthPassword", 191, new String(""), "platform_integration");
    a("platform.isAutoRefresh", "platformIsAutoRefresh", 1851, new Boolean(false), "platform_integration");
    a("platform.refreshRate", "platformRefreshRate", 1852, new Integer(5), "platform_integration");
    a("platform.useLimits", "platformUseLimits", 1856, new Boolean(false), "platform_integration");
    a("platform.limitSize", "platformLimitSize", 1857, new Integer(100), "platform_integration");
    a("platform.sortingFieldIndex", "platformSortingFieldIndex", 1857, new Integer(4), "platform_integration");
    a("platform.sortingIsDesc", "platformSortingIsDesc", 1857, new Boolean(true), "platform_integration");
    a("platform.eventsFromFilterKey", "platformEventsFromFilterKey", 1893, new Integer(0), "platform_integration");
    a("platform.eventTypesFilterKey", "platformEventTypesFilterKey", 1893, new String("all"), "platform_integration");
    a("platform.statusFilterKey", "platformStatusFilterKey", 1894, new String("all"), "platform_integration");
    a("platform.severityFilterKey", "platformSeverityFilterKey", 1895, new String("all"), "platform_integration");
    a("platform.timeFilterKey", "platformTimeFilterKey", 1897, new String("0"), "platform_integration");
    a("platform.serversFilterArray", "platformServersFilterArray", 1896, new com.zend.ide.zendPlatformIntegration.a.r[0], "platform_integration");
    a("platform.serversNamesKey", "platformServersNamesKey", 1896, new String("0"), "platform_integration");
    a("platform.clustersNamesKey", "platformClustersNamesKey", 1896, new String("0"), "platform_integration");
    if (com.zend.ide.p.e.f.g())
      a("desktop.laf", "laf", 1076, Boolean.TRUE, "desktop_options");
    a("desktop.antialiasing", "antialiasing", 1826, Boolean.FALSE, "desktop_options");
    Locale localLocale = Locale.getDefault();
    if (!ct.a(localLocale))
      localLocale = ct.a[0];
    a("desktop.language", "language", 429, localLocale, "desktop_options");
    a("desktop.font", "font", 11, cv.e(), "desktop_options");
    a("editing.encoding", "encoding", 430, bh.a, "desktop_options");
    a("desktop.phpVersion", "phpVersion", 1309, new fb(a()), "desktop_options");
    a("desktop.includeFrameworkData", "includeFrameworkData", 1828, new Boolean(true), "desktop_options");
    a("editing.supportAspTags", "supportAspTags", 30, Boolean.TRUE, "desktop_options");
    if (cr.c() == 1)
      a("desktop.internalBrowser", "internalBrowser", 1675, new Boolean(true), "desktop_options");
    a("browser.commandLine", "browserCommandLine", 87, cr.d(), "desktop_options");
    a("editing.manualUrl", "manualUrl", 20, c(null), "desktop_options");
    a("encoder.encoderCommandLine", "encoderCommandLine", 523, new File(com.zend.ide.q.d.b()), "desktop_options");
    a("desktop.showHiddenFiles", "showHiddenFiles", 857, Boolean.FALSE, "desktop_options");
    a("filesystem.filesystemModificationCheckEnabled", "filesystemModificationCheckEnabled", 749, new Boolean(true), "desktop_options");
    a("filesystem.filesystemModificationCheckTime", "filesystemModificationCheckTime", 750, new Integer(1000), "desktop_options");
    a("editing.automaticFileReload", "automaticFileReload", 427, Boolean.FALSE, "desktop_options");
    a("editing.searchResultDisplaySize", "searchResultDisplaySize", 632, new Integer(1000), "desktop_options");
    a("sourceControl.tool", "sourceControlTool", 1589, "CVS", "source_control_options");
    a("vcs.statusAdded", "statusAdded", 1864, db.a("vcs.statusAdded"), "source_control_options");
    a("vcs.statusModified", "statusModified", 1865, db.a("vcs.statusModified"), "source_control_options");
    a("vcs.statusMergedWithConflicts", "statusMergedWithConflicts", 1866, db.a("vcs.statusMergedWithConflicts"), "source_control_options");
    a("vcs.statusUpToDate", "statusUpToDate", 1867, db.a("vcs.statusUpToDate"), "source_control_options");
    a("vcs.statusNotVersioned", "statusNotVersioned", 1868, db.a("vcs.statusNotVersioned"), "source_control_options");
    a("vcs.statusEnabled", "statusEnabled", 1892, new Boolean(true), "source_control_options");
    a("cvs.enableCvsIntegration", "enableCvsIntegration", 721, new Boolean(true), "cvs_options");
    File localFile1 = null;
    try
    {
      localFile1 = new File(com.zend.ide.w.a.d.c()).getCanonicalFile();
    }
    catch (IOException localIOException1)
    {
      String str2 = "./SourceControl/cvs/cvs";
      if (cr.c() == 1)
        str2 = str2 + ".exe";
      try
      {
        localFile1 = new File(str2).getCanonicalFile();
      }
      catch (IOException localIOException3)
      {
      }
    }
    a("cvs.cvsCommandLine", "cvsCommandLine", 586, localFile1, "cvs_options");
    a("cvs_rsh_env_var", "cvs_rsh_env_var", 1334, "", "cvs_options");
    a("cvs.showUpdateDialog", "showUpdateDialog", 607, new Boolean(true), "cvs_options");
    a("cvs.showCommitDialog", "showCommitDialog", 608, new Boolean(true), "cvs_options");
    a("cvs.showAddDialog", "showAddDialog", 609, new Boolean(true), "cvs_options");
    a("cvs.showStatusDialog", "showStatusDialog", 610, new Boolean(true), "cvs_options");
    a("cvs.showDiffDialog", "showDiffDialog", 611, new Boolean(true), "cvs_options");
    a("cvs.showLogDialog", "showLogDialog", 1022, new Boolean(true), "cvs_options");
    a("cvs.showVisualDiff", "showVisualDiff", 1271, new Boolean(true), "cvs_options");
    a("svn.enableSubversionIntegration", "enableSubversionIntegration", 721, new Boolean(false), "svn_options");
    File localFile2 = null;
    try
    {
      localFile2 = new File(com.zend.ide.w.c.d.b()).getCanonicalFile();
    }
    catch (IOException localIOException2)
    {
      String str3 = "./SourceControl/svn/svn";
      if (cr.c() == 1)
        str3 = str3 + ".exe";
      try
      {
        localFile2 = new File(str3).getCanonicalFile();
      }
      catch (IOException localIOException4)
      {
      }
    }
    a("svn.svnCommandLine", "svnCommandLine", 1592, localFile2, "svn_options");
    a("svn.showUpdateDialog", "showUpdateDialog", 1593, new Boolean(true), "svn_options");
    a("svn.showCommitDialog", "showCommitDialog", 1594, new Boolean(true), "svn_options");
    a("svn.showAddDialog", "showAddDialog", 1595, new Boolean(true), "svn_options");
    a("svn.showStatusDialog", "showStatusDialog", 1596, new Boolean(true), "svn_options");
    a("svn.showDiffDialog", "showDiffDialog", 1597, new Boolean(true), "svn_options");
    a("svn.showLogDialog", "showLogDialog", 1598, new Boolean(true), "svn_options");
    a("svn.showDeleteDialog", "showDeleteDialog", 1652, new Boolean(true), "svn_options");
    a("svn.showResolveDialog", "showResolveDialog", 1654, new Boolean(true), "svn_options");
    a("svn.showRevertDialog", "showRevertDialog", 1653, new Boolean(true), "svn_options");
    a("svn.showVisualDiff", "showVisualDiff", 1271, new Boolean(true), "svn_options");
    a("application.showTipsDialog", "ShowTipsDialog", 595, new Boolean(true), "dialogs_options");
    a("desktop.helpAgent", "helpAgent", 1702, new Boolean(true), "dialogs_options");
    a("application.showAnalayzerDialog", "ShowAnalayzerDialog", 1055, new Boolean(true), "dialogs_options");
    a("project.saveAsProjectDialog", "ShowSaveAsDialog", 435, new Boolean(true), "dialogs_options");
    a("application.showListDialog", "ShowListDialog", 89, new Boolean(true), "dialogs_options");
    a("application.showUpdateDialog", "ShowUpdateDialog", 990, new Boolean(true), "dialogs_options");
    a("application.showDebugConflictDialog", "showDebugConflictDialog", 1673, new Boolean(true), "dialogs_options");
    a("sql.tabbedResults", "TabbedResults", 1339, new Boolean(false), "sql_options");
    a("sql.pageSize", "PagingSize", 1338, new Integer(100), "sql_options");
    a("sql.useLimit", "UseLimit", 1340, new Boolean(true), "sql_options");
    a("sql.tableClickBehaviour", "TableClickBehaviour", 1344, new jb("Show Data"), "sql_options");
    a("sql.basicClickBehaviour", "BasicClickBehaviour", 1345, new ib("Do Nothing"), "sql_options");
    a("sql.dateFormat", "DateFormat", 1341, "yyyy/MM/dd HH:mm:ss", "sql_options");
    a("sql.historyLimit", "HistoryLimit", 1405, new Integer(100), "sql_options");
  }

  public static void d()
  {
    File localFile1 = new File(c);
    if (!localFile1.exists())
      localFile1.mkdirs();
    m.c(c);
    g.c(c);
    Set localSet = j.keySet();
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      File localFile2 = new File(localFile1, str + ".xml");
      List localList = (List)j.get(str);
      if (localList != null)
        a(localFile2, localList);
    }
  }

  public static void a(File paramFile, List paramList)
  {
    h().b(paramFile, paramList);
  }

  protected void b(File paramFile, List paramList)
  {
    try
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = a((String)localIterator.next());
        localObject2 = new k(((c)localObject1).e(), ((c)localObject1).c());
        localArrayList.add(localObject2);
      }
      Object localObject1 = new l(paramFile.getName(), localArrayList);
      Object localObject2 = paramFile.getPath();
      com.a.f.a((String)localObject2, localObject1);
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
  }

  public static void e()
  {
    Set localSet = j.keySet();
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      File localFile = new File(c, str + ".xml");
      List localList = (List)j.get(str);
      if (localList != null)
        b(localFile);
    }
    g.e(c);
    m.e(c);
  }

  public static void b(File paramFile)
  {
    h().a(paramFile);
  }

  protected void a(File paramFile)
  {
    this.f = true;
    try
    {
      String str = paramFile.getPath();
      if (!paramFile.exists())
      {
        cl.a("Properties file: " + str + " ,could not be found");
        return;
      }
      l locall = (l)com.a.f.a(str);
      k[] arrayOfk = locall.a;
      for (int i = 0; i < arrayOfk.length; i++)
      {
        k localk = arrayOfk[i];
        c localc = (c)this.a.get(localk.a);
        if (localc == null)
          continue;
        localc.a(localk.b);
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
    finally
    {
      this.f = false;
    }
  }

  public static List c(String paramString)
  {
    return h().d(paramString);
  }

  protected List d(String paramString)
  {
    return (ArrayList)j.get(paramString);
  }

  public static c a(String paramString)
  {
    return h().b(paramString);
  }

  public static Object a(String paramString)
  {
    c localc = h().b(paramString);
    if (localc != null)
      return localc.c();
    return localc;
  }

  public static Object b(String paramString)
  {
    c localc = h().b(paramString);
    if (localc != null)
      return localc.b();
    return localc;
  }

  public static void a(String paramString, Object paramObject)
  {
    c localc = h().b(paramString);
    if (localc != null)
      localc.a(paramObject);
  }

  protected c b(String paramString)
  {
    return (c)this.a.get(paramString);
  }

  public static void c(PropertyChangeListener paramPropertyChangeListener, String paramString)
  {
    h().d(paramPropertyChangeListener, paramString);
  }

  protected void d(PropertyChangeListener paramPropertyChangeListener, String paramString)
  {
    c localc = (c)this.a.get(paramString);
    if (localc == null)
    {
      h localh = g.a(paramString);
      localh.c(paramPropertyChangeListener);
    }
    else
    {
      localc.c(paramPropertyChangeListener);
    }
  }

  public static void a(PropertyChangeListener paramPropertyChangeListener, String paramString)
  {
    h().b(paramPropertyChangeListener, paramString);
  }

  protected void b(PropertyChangeListener paramPropertyChangeListener, String paramString)
  {
    c localc = (c)this.a.get(paramString);
    if (localc == null)
    {
      h localh = g.a(paramString);
      localh.a(paramPropertyChangeListener);
    }
    else
    {
      localc.a(paramPropertyChangeListener);
    }
  }

  protected void a(PropertyChangeListener paramPropertyChangeListener)
  {
    this.h.addPropertyChangeListener(paramPropertyChangeListener);
  }

  protected void a(String paramString1, String paramString2, int paramInt, Object paramObject, String paramString3)
  {
    c localc = new c(this, paramString1, paramString2, paramInt, paramObject);
    if (this.a.containsKey(paramString1))
      throw new RuntimeException("CustomizedProperty id is already used");
    this.a.put(paramString1, localc);
    if ((paramString3 != null) && (j.get(paramString3) != null))
      ((List)j.get(paramString3)).add(paramString1);
  }

  public static String a()
  {
    String str = bi.a("PHP_VERSION");
    if ((str != null) && (!str.equals("")) && (str.equalsIgnoreCase("PHP4")))
      return "PHP4";
    return "PHP5";
  }

  public static cm c(Locale paramLocale)
  {
    if ((bi.a("PHP_MANUAL_PATH") != null) && (!bi.a("PHP_MANUAL_PATH").equals("")))
    {
      String str = new File(bi.a("PHP_MANUAL_PATH")).getAbsolutePath();
      str = t.a(str);
      return new cm("file:///" + str + "/", true);
    }
    return a(paramLocale);
  }

  public static cm a(Locale paramLocale)
  {
    return new cm("http://www.php.net/manual/" + b(paramLocale) + "/", false);
  }

  private static String b(Locale paramLocale)
  {
    if (paramLocale == null)
      paramLocale = Locale.getDefault();
    String str1 = paramLocale.toString();
    if (str1.equals("pt_BR"))
      return "pt_BR";
    String[] arrayOfString = { "cs", "nl", "fi", "fr", "de", "hu", "it", "ja", "kr", "pl", "ro", "ru", "es", "tr" };
    String str2 = str1.toString().substring(0, 2);
    for (int i = 0; i < arrayOfString.length; i++)
      if (str2.equals(arrayOfString[i]))
        return arrayOfString[i];
    return "en";
  }

  static boolean a(b paramb)
  {
    return paramb.f;
  }

  static PropertyChangeSupport b(b paramb)
  {
    return paramb.h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.b
 * JD-Core Version:    0.6.0
 */