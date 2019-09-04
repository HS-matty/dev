package com.zend.ide.x;

import com.zend.ide.b.d;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

public class j
{
  private static Hashtable a = new Hashtable(100);
  private static Hashtable b = new Hashtable(100);
  private static Hashtable c = new Hashtable(420);
  private static k[] d;
  private static o[] e;
  private static q f;
  private static e g;

  public static o[] h(String paramString)
  {
    List localList = a(paramString, e);
    o[] arrayOfo = new o[localList.size()];
    localList.toArray(arrayOfo);
    return arrayOfo;
  }

  public static k[] a(String paramString)
  {
    List localList = a(paramString, d);
    k[] arrayOfk = new k[localList.size()];
    localList.toArray(arrayOfk);
    return arrayOfk;
  }

  private static k b(String paramString)
  {
    return (k)a.get(paramString);
  }

  private static h[] c(String paramString)
  {
    k localk = b(paramString);
    return localk == null ? null : localk.c();
  }

  public static h[] a(String paramString1, String paramString2)
  {
    h[] arrayOfh1 = c(paramString1);
    if ((paramString2 == null) || (paramString2.trim().length() == 0))
      return arrayOfh1;
    List localList = a(paramString2, arrayOfh1);
    h[] arrayOfh2 = new h[localList.size()];
    localList.toArray(arrayOfh2);
    Arrays.sort(arrayOfh2);
    return arrayOfh2;
  }

  public static boolean d(String paramString)
  {
    h localh = (h)b.get(paramString);
    return (localh == null) || (localh.d());
  }

  private static l[] b(String paramString1, String paramString2)
  {
    l[] arrayOfl = null;
    k localk = b(paramString1);
    if (localk != null)
    {
      h localh = localk.a(paramString2);
      if (localh != null)
        arrayOfl = localh.c();
    }
    return arrayOfl;
  }

  public static l[] a(String paramString1, String paramString2, String paramString3)
  {
    l[] arrayOfl1 = b(paramString1, paramString2);
    if ((paramString3 == null) || (paramString3.trim().length() == 0))
      return arrayOfl1;
    List localList = a(paramString3, arrayOfl1);
    l[] arrayOfl2 = new l[localList.size()];
    localList.toArray(arrayOfl2);
    Arrays.sort(arrayOfl2);
    return arrayOfl2;
  }

  private static List a(String paramString, d[] paramArrayOfd)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramArrayOfd != null)
    {
      int i = paramString.length();
      for (int j = 0; j < paramArrayOfd.length; j++)
      {
        if ((paramArrayOfd[j].a().length() < i) || (!paramArrayOfd[j].a().substring(0, i).equalsIgnoreCase(paramString)))
          continue;
        localArrayList.add(paramArrayOfd[j]);
      }
    }
    return localArrayList;
  }

  private static void b()
  {
    a("?", null);
    a("?php", null);
    a("%", null);
    a("!--", null);
    l[] arrayOfl1 = { e("application/msexcel"), e("application/msword"), e("application/pdf"), e("application/postscript"), e("application/rtf"), e("application/x-zip-compressed"), e("audio/basic"), e("audio/x-aiff"), e("audio/x-mpeg"), e("audio/x-pn/realaudio"), e("audio/x-waw"), e("image/gif"), e("image/jpeg"), e("image/tiff"), e("image/x-MS-bmp"), e("image/x-photo-cd"), e("image/x-png"), e("image/x-portablebitmap"), e("image/x-portable-greymap"), e("image/x-portable-pixmap"), e("image/x-rgb"), e("text/html"), e("text/plain"), e("text/css"), e("text/javascript"), e("video/quicktime"), e("video/x-mpeg2"), e("video/x-msvideo"), e("multipart/form-data") };
    a("accept", arrayOfl1);
    a("accept", new l[] { e("ftp://"), e("http://"), e("https://") });
    l[] arrayOfl2 = { e("false"), e("true") };
    a("autostart", arrayOfl2);
    a("captionAlign", "align", new l[] { e("bottom"), e("left"), e("right"), e("top") });
    a("appletAlign", "align", new l[] { e("absmiddle"), e("bottom"), e("left"), e("middle"), e("right"), e("top") });
    a("legendAlign", "align", new l[] { e("bottom"), e("left"), e("right"), e("top") });
    a("tableAlign", "align", new l[] { e("center"), e("left"), e("right") });
    a("divAlign", "align", new l[] { e("center"), e("justify"), e("left"), e("right") });
    a("colAlign", "align", new l[] { e("center"), e("char"), e("justify"), e("left"), e("right") });
    l[] arrayOfl3 = { e("Aqua"), e("Black"), e("Blue"), e("Fuchsia"), e("Gray"), e("Green"), e("Lime"), e("Maroon"), e("Navy"), e("Olive"), e("Purple"), e("Red"), e("Teal"), e("Silver"), e("White"), e("Yellow") };
    a("alink", arrayOfl3);
    l[] arrayOfl4 = { e("absbottom"), e("absmiddle"), e("baseline"), e("bottom"), e("left"), e("middle"), e("right"), e("testtop"), e("top") };
    a("align", arrayOfl4);
    a("bgcolor", arrayOfl3);
    a("clear", new l[] { e("all"), e("left"), e("none"), e("right") });
    a("codetype", arrayOfl1);
    a("color", arrayOfl3);
    l[] arrayOfl5 = { e("console"), e("smallconsole") };
    a("controls", arrayOfl5);
    a("controller", arrayOfl2);
    a("dir", new l[] { e("ltr"), e("rtl") });
    a("enctype", arrayOfl1);
    a("frame", new l[] { e("above"), e("below"), e("border"), e("box"), e("hsides"), e("lhs"), e("rhs"), e("void"), e("vsides") });
    a("frameborder", arrayOfl1);
    a("hidden", arrayOfl2);
    a("http-equiv", new l[] { e("Description"), e("Expires"), e("Keywords"), e("PICS-Label"), e("Refresh"), e("Reply-to") });
    l[] arrayOfl6 = { e("af"), e("ar"), e("be"), e("br"), e("ca"), e("cs"), e("da"), e("de"), e("el"), e("en"), e("es"), e("et"), e("eu"), e("fa"), e("fi"), e("fo"), e("fr"), e("gd"), e("he"), e("hi"), e("hr"), e("hu"), e("id"), e("is"), e("it"), e("ja"), e("ko"), e("lt"), e("lv"), e("mk"), e("ms"), e("mt"), e("nl"), e("no"), e("pl"), e("pt"), e("rm"), e("ro"), e("ru"), e("sk"), e("sl"), e("sq"), e("sr"), e("sv"), e("sx"), e("sz"), e("th"), e("tn"), e("tr"), e("ts"), e("uk"), e("ur"), e("vi"), e("sh"), e("yi"), e("zh"), e("zu") };
    a("lang", arrayOfl6);
    a("link", arrayOfl3);
    a("loop", arrayOfl2);
    a("media", new l[] { e("all"), e("aural"), e("braille"), e("handheld"), e("print"), e("projection"), e("screen"), e("tty"), e("tv") });
    a("method", new l[] { e("GET"), e("POST") });
    l[] arrayOfl7 = { e("alternate"), e("appendix"), e("bookmark"), e("chapter"), e("contents"), e("copyright"), e("glossary"), e("help"), e("index"), e("next"), e("prev"), e("previous"), e("section"), e("start"), e("stylesheet"), e("subsection") };
    a("rel", arrayOfl7);
    a("rev", arrayOfl7);
    a("rules", new l[] { e("all"), e("colos"), e("groups"), e("none"), e("rows") });
    a("scope", new l[] { e("col"), e("colgroup"), e("row"), e("rowgroup") });
    a("scrolling", new l[] { e("auto"), e("No"), e("Yes") });
    a("shape", new l[] { e("circle"), e("default"), e("poly"), e("rect") });
    a("text", arrayOfl3);
    a("aType", "type", arrayOfl1);
    a("buttonType", "type", new l[] { e("button"), e("reset"), e("submit") });
    a("inputType", "type", new l[] { e("button"), e("checkbox"), e("file"), e("hidden"), e("image"), e("password"), e("radio"), e("reset"), e("submit"), e("text") });
    a("liType", "type", new l[] { e("1"), e("a"), e("A"), e("circle"), e("disc"), e("i"), e("I"), e("square") });
    a("linkType", "type", arrayOfl1);
    a("objectType", "type", arrayOfl1);
    a("olType", "type", new l[] { e("1"), e("a"), e("A"), e("i"), e("I") });
    a("paramType", "type", arrayOfl1);
    a("scriptType", "type", arrayOfl1);
    a("styleType", "type", arrayOfl1);
    a("ulType", "type", new l[] { e("circle"), e("disc"), e("square") });
    a("valign", new l[] { e("baseline"), e("bottom"), e("middle"), e("top") });
    a("valuetype", new l[] { e("data"), e("object"), e("ref") });
    a("vlink", arrayOfl3);
    f("checked");
    f("compact");
    f("declare");
    f("defer");
    f("disabled");
    f("ismap");
    f("multiple");
    f("nohref");
    f("noresize");
    f("noshade");
    f("nowrap");
    f("readonly");
    f("selected");
    l[] arrayOfl8 = { e("100%"), e("90%"), e("80%"), e("70%"), e("60%"), e("50%"), e("40%"), e("30%"), e("20%"), e("10%") };
    a("width", arrayOfl8);
    a("height", arrayOfl8);
    a("target", new l[] { e("_blank"), e("_parent"), e("_self"), e("_top") });
    h[] arrayOfh1 = { g("accesskey"), g("charset"), g("class"), g("coords"), g("href"), g("hreflang"), g("id"), g("lang"), g("name"), g("onblur"), g("onclick"), g("ondblclick"), g("onfocus"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("rel"), g("rev"), g("shape"), g("style"), g("tabindex"), g("target"), g("title"), g("aType") };
    a("a", arrayOfh1);
    h[] arrayOfh2 = { g("class"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("style"), g("title") };
    a("abbr", arrayOfh2);
    a("acronym", arrayOfh2);
    a("address", arrayOfh2);
    h[] arrayOfh3 = { g("appletAlign"), g("alt"), g("archive"), g("class"), g("code"), g("codebase"), g("height"), g("hspace"), g("id"), g("name"), g("object"), g("onclick"), g("style"), g("title"), g("vspace"), g("width") };
    a("applet", arrayOfh3);
    h[] arrayOfh4 = { g("accesskey"), g("alt"), g("class"), g("coords"), g("dir"), g("href"), g("id"), g("lang"), g("nohref"), g("onblur"), g("onclick"), g("ondblclick"), g("onfocus"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("shape"), g("style"), g("tabindex"), g("target"), g("title") };
    a("area", arrayOfh4);
    a("b", arrayOfh2);
    a("baseTag", new h[] { g("href"), g("onclick"), g("target") });
    a("basefont", new h[] { g("color"), g("face"), g("id"), g("onclick"), g("size") });
    a("bdo", new h[] { g("class"), g("dir"), g("id"), g("lang"), g("onclick"), g("style"), g("title") });
    a("big", arrayOfh2);
    h[] arrayOfh5 = { g("cite"), g("class"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("style"), g("title") };
    a("blockquote", arrayOfh5);
    h[] arrayOfh6 = { g("alink"), g("background"), g("bgcolor"), g("class"), g("dir"), g("id"), g("lang"), g("leftmargin"), g("link"), g("marginheight"), g("marginwidth"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onload"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("style"), g("text"), g("title"), g("topmargin"), g("vlink") };
    a("body", arrayOfh6);
    a("br", new h[] { g("class"), g("clear"), g("id"), g("onclick"), g("style"), g("title") });
    h[] arrayOfh7 = { g("accesskey"), g("class"), g("dir"), g("disabled"), g("id"), g("lang"), g("name"), g("onblur"), g("onclick"), g("ondblclick"), g("onfocus"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("style"), g("tabindex"), g("title"), g("buttonType"), g("value") };
    a("button", arrayOfh7);
    h[] arrayOfh8 = { g("captionAlign"), g("class"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("style"), g("title") };
    a("caption", arrayOfh8);
    a("center", arrayOfh2);
    a("cite", arrayOfh2);
    a("code", arrayOfh2);
    h[] arrayOfh9 = { g("colAlign"), g("char"), g("charoff"), g("class"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("span"), g("style"), g("title"), g("valign"), g("width") };
    a("col", arrayOfh9);
    a("colgroup", arrayOfh9);
    a("dd", arrayOfh2);
    h[] arrayOfh10 = { g("cite"), g("class"), g("datetime"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("style"), g("title") };
    a("del", arrayOfh10);
    a("dfn", arrayOfh2);
    a("dir", arrayOfh2);
    h[] arrayOfh11 = { g("divAlign"), g("class"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("style"), g("title") };
    a("div", arrayOfh11);
    h[] arrayOfh12 = { g("class"), g("compact"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("style"), g("title") };
    a("dl", arrayOfh12);
    a("dt", arrayOfh2);
    a("em", arrayOfh2);
    a("fieldset", arrayOfh2);
    h[] arrayOfh13 = { g("align"), g("autostart"), g("controller"), g("controls"), g("endtime"), g("height"), g("hidden"), g("href"), g("loop"), g("mastersound"), g("name"), g("playcount"), g("pluginspage"), g("pluginurl"), g("starttime"), g("src"), g("target"), g("volume"), g("width") };
    a("embed", arrayOfh13);
    h[] arrayOfh14 = { g("class"), g("color"), g("dir"), g("face"), g("id"), g("lang"), g("onclick"), g("size"), g("style"), g("title") };
    a("font", arrayOfh14);
    h[] arrayOfh15 = { g("accept-charset"), g("action"), g("class"), g("dir"), g("enctype"), g("id"), g("lang"), g("method"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onreset"), g("onsubmit"), g("style"), g("target"), g("title") };
    a("form", arrayOfh15);
    h[] arrayOfh16 = { g("class"), g("frameborder"), g("id"), g("longdesc"), g("marginheight"), g("marginwidth"), g("name"), g("noresize"), g("onclick"), g("scrolling"), g("src"), g("style"), g("title") };
    a("frame", arrayOfh16);
    h[] arrayOfh17 = { g("class"), g("cols"), g("id"), g("onload"), g("onunload"), g("rows"), g("style"), g("title") };
    a("frameset", arrayOfh17);
    a("head", new h[] { g("dir"), g("lang"), g("profile") });
    a("html", new h[] { g("dir"), g("lang"), g("version") });
    h[] arrayOfh18 = { g("tableAlign"), g("class"), g("id"), g("noshade"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("size"), g("style"), g("title"), g("width") };
    a("hr", arrayOfh18);
    h[] arrayOfh19 = { g("divAlign"), g("class"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("style"), g("title") };
    a("h1", arrayOfh19);
    a("h2", arrayOfh19);
    a("h3", arrayOfh19);
    a("h4", arrayOfh19);
    a("h5", arrayOfh19);
    a("h6", arrayOfh19);
    a("i", arrayOfh2);
    h[] arrayOfh20 = { g("align"), g("frameborder"), g("height"), g("hspace"), g("longdesc"), g("marginheight"), g("marginwidth"), g("name"), g("scrolling"), g("src"), g("style"), g("vspace"), g("width") };
    a("iframe", arrayOfh20);
    h[] arrayOfh21 = { g("appletAlign"), g("alt"), g("border"), g("class"), g("dir"), g("height"), g("hspace"), g("id"), g("ismap"), g("lang"), g("longdesc"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("src"), g("style"), g("title"), g("usemap"), g("vspace"), g("width") };
    a("img", arrayOfh21);
    h[] arrayOfh22 = { g("accept"), g("accesskey"), g("appletAlign"), g("checked"), g("class"), g("dir"), g("disabled"), g("id"), g("lang"), g("maxlength"), g("name"), g("onblur"), g("onchange"), g("onclick"), g("ondblclick"), g("onfocus"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("onselect"), g("readonly"), g("size"), g("src"), g("style"), g("tabindex"), g("title"), g("inputType"), g("usemap"), g("value") };
    a("input", arrayOfh22);
    h[] arrayOfh23 = { g("cite"), g("class"), g("datetime"), g("dir"), g("id"), g("lang"), g("onclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("style"), g("title") };
    a("ins", arrayOfh23);
    a("isindex", new h[] { g("class"), g("dir"), g("id"), g("lang"), g("prompt"), g("style"), g("title") });
    a("kbd", arrayOfh2);
    h[] arrayOfh24 = { g("accesskey"), g("class"), g("dir"), g("for"), g("id"), g("lang"), g("onblur"), g("onclick"), g("ondblclick"), g("onfocus"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("style"), g("title") };
    a("label", arrayOfh24);
    h[] arrayOfh25 = { g("accesskey"), g("legendAlign"), g("class"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("style"), g("type") };
    a("legend", arrayOfh25);
    h[] arrayOfh26 = { g("class"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("style"), g("title"), g("liType"), g("value") };
    a("li", arrayOfh26);
    h[] arrayOfh27 = { g("charset"), g("class"), g("dir"), g("href"), g("hreflang"), g("id"), g("lang"), g("media"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("rel"), g("rev"), g("style"), g("target"), g("title"), g("linkType") };
    a("link", arrayOfh27);
    h[] arrayOfh28 = { g("class"), g("dir"), g("id"), g("lang"), g("name"), g("language"), g("style"), g("title") };
    a("map", arrayOfh28);
    a("menu", arrayOfh2);
    a("noframes", new h[] { g("class"), g("id"), g("style"), g("title") });
    a("noscript", new h[] { g("class"), g("id"), g("style"), g("title") });
    h[] arrayOfh29 = { g("appletAlign"), g("archive"), g("border"), g("class"), g("classid"), g("codebase"), g("codetype"), g("data"), g("declare"), g("dir"), g("height"), g("hspace"), g("id"), g("lang"), g("name"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("standby"), g("style"), g("tabindex"), g("title"), g("objectType"), g("usemap"), g("vspace"), g("width") };
    a("object", arrayOfh29);
    h[] arrayOfh30 = { g("class"), g("compact"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("start"), g("style"), g("title"), g("olType") };
    a("ol", arrayOfh30);
    h[] arrayOfh31 = { g("class"), g("dir"), g("disabled"), g("id"), g("label"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("style"), g("title") };
    a("optgroup", arrayOfh31);
    h[] arrayOfh32 = { g("class"), g("dir"), g("disabled"), g("id"), g("label"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("selected"), g("style"), g("title"), g("value") };
    a("option", arrayOfh32);
    a("p", arrayOfh2);
    a("param", new h[] { g("id"), g("name"), g("paramType"), g("value"), g("valuetype") });
    h[] arrayOfh33 = { g("class"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("style"), g("title"), g("width") };
    a("pre", arrayOfh33);
    h[] arrayOfh34 = { g("cite"), g("class"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("style"), g("title") };
    a("q", arrayOfh34);
    a("s", arrayOfh2);
    a("samp", arrayOfh2);
    a("script", new h[] { g("charset"), g("defer"), g("language"), g("src"), g("scriptType") });
    h[] arrayOfh35 = { g("class"), g("dir"), g("disabled"), g("id"), g("lang"), g("multiple"), g("name"), g("onblur"), g("onchange"), g("onclick"), g("ondblclick"), g("onfocus"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("size"), g("style"), g("tabindex"), g("title") };
    a("select", arrayOfh35);
    a("samp", arrayOfh2);
    a("small", arrayOfh2);
    a("span", arrayOfh2);
    a("strike", arrayOfh2);
    a("strong", arrayOfh2);
    a("style", new h[] { g("dir"), g("lang"), g("title"), g("styleType") });
    a("sub", arrayOfh2);
    a("sup", arrayOfh2);
    h[] arrayOfh36 = { g("tableAlign"), g("background"), g("bgcolor"), g("border"), g("cellpadding"), g("cellspacing"), g("class"), g("dir"), g("frame"), g("height"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("rules"), g("style"), g("summary"), g("title"), g("width") };
    a("table", arrayOfh36);
    h[] arrayOfh37 = { g("colAlign"), g("char"), g("charoff"), g("class"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("style"), g("title"), g("valign") };
    a("tbody", arrayOfh37);
    h[] arrayOfh38 = { g("abbr"), g("colAlign"), g("axis"), g("background"), g("bgcolor"), g("char"), g("charoff"), g("class"), g("colspan"), g("dir"), g("headers"), g("height"), g("id"), g("lang"), g("nowrap"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("rowspan"), g("scope"), g("style"), g("title"), g("valign"), g("width") };
    a("td", arrayOfh38);
    h[] arrayOfh39 = { g("accesskey"), g("class"), g("cols"), g("dir"), g("disabled"), g("id"), g("lang"), g("name"), g("onblur"), g("onchange"), g("onclick"), g("ondblclick"), g("onfocus"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("onselect"), g("readonly"), g("rows"), g("style"), g("tabindex"), g("title") };
    a("textarea", arrayOfh39);
    a("tfoot", arrayOfh37);
    h[] arrayOfh40 = { g("abbr"), g("colAlign"), g("axis"), g("background"), g("bgcolor"), g("char"), g("charoff"), g("class"), g("colspan"), g("dir"), g("headers"), g("height"), g("id"), g("lang"), g("nowrap"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("rowspan"), g("scope"), g("style"), g("title"), g("valign"), g("width") };
    a("th", arrayOfh40);
    a("thead", arrayOfh37);
    a("title", new h[] { g("dir"), g("lang") });
    h[] arrayOfh41 = { g("colAlign"), g("background"), g("bgcolor"), g("char"), g("charoff"), g("class"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("style"), g("title"), g("valign") };
    a("tr", arrayOfh41);
    a("tt", arrayOfh2);
    a("u", arrayOfh2);
    h[] arrayOfh42 = { g("class"), g("compact"), g("dir"), g("id"), g("lang"), g("onclick"), g("ondblclick"), g("onkeydown"), g("onkeypress"), g("onkeyup"), g("onmousedown"), g("onmousemove"), g("onmouseout"), g("onmouseover"), g("onmouseup"), g("style"), g("title"), g("ulType") };
    a("ul", arrayOfh42);
    a("var", arrayOfh2);
    d = new k[a.size()];
    a.values().toArray(d);
    Arrays.sort(d);
    e = new o[] { c.c("&lsquo;", "left single quote"), c.c("&rsquo;", "right single quote"), c.c("&sbquo;", "single low-9 quote"), c.c("&ldquo;", "left double quote"), c.c("&rdquo;", "right double quote"), c.c("&bdquo;", "double low-9 quote"), c.c("&dagger;", "dagger"), c.c("&Dagger;", "double dagger"), c.c("&permil;", "permill sign"), c.c("&lsaquo;", "single left-pointing angle quote"), c.c("&rsaquo;", "single right-pointing angle quote"), c.c("&spades;", "black spade suit"), c.c("&clubs;", "black club suit"), c.c("&hearts;", "black heart suit"), c.c("&diams;", "black diamond suit"), c.c("&oline;", "overline, = spacing overscore"), c.c("&larr;", "leftward arrow"), c.c("&uarr;", "upward arrow"), c.c("&rarr;", "rightward arrow"), c.c("&darr;", "downward arrow"), c.c("&trade;", "trademark sign"), c.c("&quot;", "double quotation mark"), c.c("&amp;", "ampersand"), c.c("&frasl;", "slash"), c.c("&lt;", "less-than sign"), c.c("&gt;", "greater-than sign"), c.c("&ndash;", "en dash"), c.c("&mdash;", "em dash"), c.c("&nbsp;", "nonbreaking space"), c.c("&iexcl;", "inverted exclamation"), c.c("&cent;", "cent sign"), c.c("&pound;", "pound sterling"), c.c("&curren;", "general currency sign"), c.c("&yen;", "yen sign"), c.c("&brvbar;", "broken vertical bar"), c.c("&brkbar;", "broken vertical bar"), c.c("&sect;", "section sign"), c.c("&uml;", "umlaut"), c.c("&die;", "umlaut"), c.c("&copy;", "copyright"), c.c("&ordf;", "feminine ordinal"), c.c("&laquo;", "left angle quote"), c.c("&not;", "not sign"), c.c("&shy;", "soft hyphen"), c.c("&reg;", "registered trademark"), c.c("&macr;", "macron accent"), c.c("&hibar;", "macron accent"), c.c("&deg;", "degree sign"), c.c("&plusmn;", "plus or minus"), c.c("&sup2;", "superscript two"), c.c("&sup3;", "superscript three"), c.c("&acute;", "acute accent"), c.c("&micro;", "micro sign"), c.c("&para;", "paragraph sign"), c.c("&middot;", " middle dot "), c.c("&cedil;", "cedilla"), c.c("&sup1;", "superscript one"), c.c("&ordm;", "masculine ordinal"), c.c("&raquo;", "right angle quote"), c.c("&frac14;", "one-fourth"), c.c("&frac12;", "one-half"), c.c("&frac34;", "three-fourths"), c.c("&iquest;", "accent"), c.c("&Agrave;", "uppercase A, grave accent"), c.c("&Aacute;", "uppercase A, acute accent"), c.c("&Acirc;", "uppercase A, circumflex accent"), c.c("&Atilde;", "uppercase A, tilde"), c.c("&Auml;", "uppercase A, umlaut"), c.c("&Aring;", "uppercase A, ring"), c.c("&AElig;", "uppercase AE"), c.c("&Ccedil;", "uppercase C, cedilla"), c.c("&Egrave;", "uppercase E, grave accent"), c.c("&Eacute;", "uppercase E, acute accent"), c.c("&Ecirc;", "uppercase E, circumflex accent"), c.c("&Euml;", "uppercase E, umlaut"), c.c("&Igrave;", "uppercase I, grave accent"), c.c("&Iacute;", "uppercase I, acute accent"), c.c("&Icirc;", "uppercase I, circumflex accent"), c.c("&Iuml;", "uppercase I, umlaut"), c.c("&ETH;", "uppercase Eth, Icelandic"), c.c("&Ntilde;", "uppercase N, tilde"), c.c("&Ograve;", "uppercase O, grave accent"), c.c("&Oacute;", "uppercase O, acute accent"), c.c("&Ocirc;", "uppercase O, circumflex accent"), c.c("&Otilde;", "uppercase O, tilde"), c.c("&Ouml;", "uppercase O, umlaut"), c.c("&times;", "multiplication sign"), c.c("&Oslash;", "uppercase O, slash"), c.c("&Ugrave;", "uppercase U, grave accent"), c.c("&Uacute;", "uppercase U, acute accent"), c.c("&Ucirc;", "uppercase U, circumflex accent"), c.c("&Uuml;", "uppercase U, umlaut"), c.c("&Yacute;", "uppercase Y, acute accent"), c.c("&THORN;", "uppercase THORN, Icelandic"), c.c("&szlig;", "lowercase sharps, German"), c.c("&agrave;", "lowercase a, grave accent"), c.c("&aacute;", "lowercase a, acute accent"), c.c("&acirc;", "lowercase a, circumflex accent"), c.c("&atilde;", "lowercase a, tilde"), c.c("&auml;", "lowercase a, umlaut"), c.c("&aring;", "lowercase a, ring"), c.c("&aelig;", "lowercase ae"), c.c("&ccedil;", "lowercase c, cedilla"), c.c("&egrave;", "lowercase e, grave accent"), c.c("&eacute;", "lowercase e, acute accent"), c.c("&ecirc;", "lowercase e, circumflex accent"), c.c("&euml;", "lowercase e, umlaut"), c.c("&igrave;", "lowercase i, grave accent"), c.c("&iacute;", "lowercase i, acute accent"), c.c("&icirc;", "lowercase i, circumflex accent"), c.c("&iuml;", "lowercase i, umlaut"), c.c("&eth;", "lowercase eth, Icelandic"), c.c("&ntilde;", "lowercase n, tilde"), c.c("&ograve;", "lowercase o, grave accent"), c.c("&oacute;", "lowercase o, acute accent"), c.c("&ocirc;", "lowercase o, circumflex accent"), c.c("&otilde;", "lowercase o, tilde"), c.c("&ouml;", "lowercase o, umlaut"), c.c("&divide;", "division sign"), c.c("&oslash;", "lowercase o, slash"), c.c("&ugrave;", "lowercase u, grave accent"), c.c("&uacute;", "lowercase u, acute accent"), c.c("&ucirc;", "lowercase u, circumflex accent"), c.c("&uuml;", "lowercase u, umlaut"), c.c("&yacute;", "lowercase y, acute accent"), c.c("&thorn;", "lowercase thorn, Icelandic"), c.c("&yuml;", "lowercase y, umlaut") };
    Arrays.sort(e);
  }

  private static l e(String paramString)
  {
    l locall = (l)c.get(paramString);
    if (locall == null)
    {
      locall = c.b(paramString, "");
      c.put(paramString, locall);
    }
    return locall;
  }

  private static void a(String paramString1, String paramString2, l[] paramArrayOfl)
  {
    b.put(paramString1, c.a(paramString2, "", paramArrayOfl));
  }

  private static void a(String paramString, l[] paramArrayOfl)
  {
    b.put(paramString, c.a(paramString, "", paramArrayOfl));
  }

  private static void f(String paramString)
  {
    b.put(paramString, c.a(paramString, ""));
  }

  private static h g(String paramString)
  {
    h localh = (h)b.get(paramString);
    if (localh == null)
    {
      localh = c.a(paramString, "", null);
      b.put(paramString, localh);
    }
    return localh;
  }

  private static void a(String paramString, h[] paramArrayOfh)
  {
    k localk = c.a(paramString, "", paramArrayOfh);
    a.put(paramString, localk);
  }

  static l a(String paramString)
  {
    return e(paramString);
  }

  static void b(String paramString, l[] paramArrayOfl)
  {
    a(paramString, paramArrayOfl);
  }

  static h b(String paramString)
  {
    return g(paramString);
  }

  static void b(String paramString, h[] paramArrayOfh)
  {
    a(paramString, paramArrayOfh);
  }

  static
  {
    b();
    f = new q(null);
    f localf = new f();
    g = new e(localf);
    localf.a("completion.xhtmlTagStyle", f);
    g.a("completion.xhtmlTagStyle");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.x.j
 * JD-Core Version:    0.6.0
 */