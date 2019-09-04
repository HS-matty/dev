package com.zend.ide.n;

import com.zend.ide.util.cu;
import com.zend.ide.util.s;
import com.zend.ide.y.i;
import javax.swing.ActionMap;
import javax.swing.JComponent;

public class cg extends ca
  implements cu
{
  public cg()
  {
    super("HtmlTagsTool");
  }

  protected void a(bw parambw)
  {
    s locals = (s)parambw.q();
    ActionMap localActionMap = parambw.c().getActionMap();
    gp localgp = new gp(new fg(this, "insertBoldTag", "<b>", "</b>", "<strong>", "</strong>"), b());
    localActionMap.put("insertBoldTag", localgp);
    locals.a("keys.html*keys.boldTag", localgp, "textComponent", false);
    localgp = new gp(new fg(this, "insertItalicTag", "<i>", "</i>", "<em>", "</em>"), b());
    localActionMap.put("insertItalicTag", localgp);
    locals.a("keys.html*keys.italicTag", localgp, "textComponent", false);
    localgp = new gp(new yb(this, "insertHeading1Tag", "<h1>", "</h1>"), b());
    localActionMap.put("insertHeading1Tag", localgp);
    locals.a("keys.html*keys.heading1Tag", localgp, "textComponent", false);
    localgp = new gp(new yb(this, "insertHeading2Tag", "<h2>", "</h2>"), b());
    localActionMap.put("insertHeading2Tag", localgp);
    locals.a("keys.html*keys.heading2Tag", localgp, "textComponent", false);
    localgp = new gp(new yb(this, "insertHeading3Tag", "<h3>", "</h3>"), b());
    localActionMap.put("insertHeading3Tag", localgp);
    locals.a("keys.html*keys.heading3Tag", localgp, "textComponent", false);
    localgp = new gp(new ft(this), b());
    localActionMap.put("insertBreakTag", localgp);
    locals.a("keys.html*keys.breakTag", localgp, "textComponent", false);
    localgp = new gp(new im(this), b());
    localActionMap.put("insertNbspTag", localgp);
    locals.a("keys.html*keys.nbspTag", localgp, "textComponent", false);
  }

  protected void d()
  {
    c().a("editnig.boldTag", "insertBoldTag");
    c().a("editnig.italicTag", "insertItalicTag");
    c().a("editnig.heading1Tag", "insertHeading1Tag");
    c().a("editnig.heading2Tag", "insertHeading2Tag");
    c().a("editnig.heading3Tag", "insertHeading3Tag");
    c().a("editnig.breakTag", "insertBreakTag");
    c().a("editnig.nbspTag", "insertNbspTag");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.cg
 * JD-Core Version:    0.6.0
 */