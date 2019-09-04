package com.zend.ide.d;

import com.zend.ide.n.bf;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.Color;
import java.awt.Font;

public class cp extends co
{
  public cp()
  {
    l();
  }

  private void l()
  {
    a("Default");
    a(new bf());
    a((Color)b.a("editing.background").b());
    b((Color)b.a("editing.bracketQuoteMatching").b());
    c((Color)b.a("editing.bracketMatchingErrorColor").b());
    d((Color)b.a("editing.searchInSelectedHighlightingColor").b());
    e((Color)b.a("editing.currentLineColor").b());
    f((Color)b.a("highlighting.breakpointColor").b());
    g((Color)b.a("highlighting.debugStepColor").b());
    a((Font)b.a("editing.font").b());
    h((Color)b.a("cvsDiff.diffAppend").b());
    i((Color)b.a("cvsDiff.diffChange").b());
    j((Color)b.a("cvsDiff.diffDelete").b());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.cp
 * JD-Core Version:    0.6.0
 */