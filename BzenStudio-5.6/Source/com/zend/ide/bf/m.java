package com.zend.ide.bf;

import com.zend.ide.bf.b.a;
import com.zend.ide.bf.b.f;
import com.zend.ide.n.bu;
import com.zend.ide.n.bw;
import com.zend.ide.util.cl;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.Keymap;
import javax.swing.text.Segment;

public class m
{
  private static m a;
  private static final Pattern j = Pattern.compile("\\$\\{[^\\}]+\\}");
  private static final KeyStroke m = KeyStroke.getKeyStroke(27, 0);
  private static final DefaultHighlighter.DefaultHighlightPainter n = new bc(null);
  private com.zend.ide.s.o k;
  private bu e;
  private bw i;
  private ArrayList b = new ArrayList(4);
  private Hashtable c = new Hashtable(2);
  private int d = -1;
  private o f = new o(this, null);
  private boolean g = false;
  private boolean h = false;
  private int o = -1;

  public static synchronized m b()
  {
    if (a == null)
      a = new m();
    return a;
  }

  public void a(com.zend.ide.s.o paramo)
  {
    this.k = paramo;
  }

  public void a(bw parambw, d paramd, int paramInt)
  {
    if (parambw == null)
      return;
    if (d())
      e();
    this.i = parambw;
    a(parambw);
    String str = b(parambw, paramd, paramInt);
    this.g = true;
    try
    {
      parambw.getDocument().insertString(paramInt, str, null);
      f();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    this.g = false;
  }

  public boolean d()
  {
    return this.h;
  }

  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, p paramp)
  {
    AbstractDocument localAbstractDocument = (AbstractDocument)c().getDocument();
    if (paramp == null)
    {
      boolean bool = a(paramInt1);
      this.g = true;
      try
      {
        localAbstractDocument.insertString(paramInt1, paramString, null);
      }
      catch (BadLocationException localBadLocationException2)
      {
        cl.a(localBadLocationException2);
      }
      this.g = false;
      if (!bool)
        e();
      paramp = i();
    }
    paramp.d = (paramInt3 > 0 ? paramp.d - paramInt3 + paramString.length() : paramp.d + paramString.length());
    a(paramp.b, paramp.b + paramp.d);
    if (paramInt4 < 0)
      paramInt4 = paramInt1 - paramp.b;
    BadLocationException localBadLocationException1 = paramInt2 - paramInt3;
    localBadLocationException2 = localBadLocationException1;
    this.g = true;
    try
    {
      for (int i1 = this.o + 1; i1 < this.b.size(); i1++)
      {
        p localp = (p)this.b.get(i1);
        localp.b += localBadLocationException1;
        if (!paramp.a.equals(localp.a))
          continue;
        localAbstractDocument.replace(localp.b + paramInt4, paramInt3, paramString, null);
        localp.d = paramp.d;
        localBadLocationException1 += localBadLocationException2;
      }
    }
    catch (BadLocationException localBadLocationException3)
    {
      cl.a(localBadLocationException3);
    }
    this.g = false;
  }

  public void a(Document paramDocument, int paramInt1, int paramInt2)
  {
    try
    {
      this.g = true;
      paramDocument.remove(paramInt1, paramInt2);
      if ((a(paramInt1 + 1)) && (a(paramInt1 + paramInt2)))
      {
        p localp1 = i();
        localp1.d -= paramInt2;
        if (localp1.d < 0)
        {
          e();
          return;
        }
        a(localp1.b, localp1.b + localp1.d);
        int i1 = paramInt1 - localp1.b;
        int i2 = paramInt2;
        int i3 = i2;
        for (int i4 = this.o + 1; i4 < this.b.size(); i4++)
        {
          p localp2 = (p)this.b.get(i4);
          localp2.b -= i2;
          if (!localp1.a.equals(localp2.a))
            continue;
          paramDocument.remove(localp2.b + i1, paramInt2);
          localp2.d = localp1.d;
          i2 += i3;
        }
      }
      else
      {
        e();
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    this.g = false;
  }

  private void a(bw parambw)
  {
    this.e = new bu(parambw, 6);
    Keymap localKeymap = parambw.e().getKeymap();
    ActionMap localActionMap = parambw.e().getActionMap();
    s locals = new s(this, localActionMap.get("delete-previous"), null);
    localActionMap.put("delete-previous", locals);
    v localv = new v(this, localActionMap.get("delete-next"), null);
    localActionMap.put("delete-next", localv);
    y localy = new y(this, localActionMap.get("insert-tab"), null);
    localActionMap.put("insert-tab", localy);
    w localw = new w(this, localActionMap.get("insert-break"), null);
    localActionMap.put("insert-break", localw);
    t localt = new t(this, localActionMap.get("backspace-tab"), null);
    localActionMap.put("backspace-tab", localt);
    x localx = new x(this, localActionMap.get("paste-from-clipboard"), null);
    localActionMap.put("paste-from-clipboard", localx);
    bd localbd = new bd(this, null);
    localActionMap.put("CloseWindowAction", localbd);
    parambw.e().getInputMap(2).put(m, "CloseWindowAction");
    localKeymap.setDefaultAction(new u(this, localKeymap.getDefaultAction(), null));
    parambw.getDocument().addDocumentListener(this.f);
  }

  private void b(bw parambw)
  {
    if (this.e == null)
      return;
    this.e = null;
    this.d = -1;
    this.o = -1;
    parambw.getDocument().removeDocumentListener(this.f);
    ActionMap localActionMap = parambw.e().getActionMap();
    Action localAction1 = ((s)localActionMap.get("delete-previous")).d();
    localActionMap.put("delete-previous", localAction1);
    Action localAction2 = ((v)localActionMap.get("delete-next")).d();
    localActionMap.put("delete-next", localAction2);
    Action localAction3 = ((y)localActionMap.get("insert-tab")).d();
    localActionMap.put("insert-tab", localAction3);
    Action localAction4 = ((w)localActionMap.get("insert-break")).d();
    localActionMap.put("insert-break", localAction4);
    Action localAction5 = ((t)localActionMap.get("backspace-tab")).d();
    localActionMap.put("backspace-tab", localAction5);
    Action localAction6 = ((x)localActionMap.get("paste-from-clipboard")).d();
    localActionMap.put("paste-from-clipboard", localAction6);
    localActionMap.remove("CloseWindowAction");
    parambw.e().getInputMap(0).remove(m);
    Keymap localKeymap = parambw.e().getKeymap();
    localKeymap.setDefaultAction(((u)localKeymap.getDefaultAction()).d());
  }

  private bw c()
  {
    return this.i;
  }

  private String b(bw parambw, d paramd, int paramInt)
  {
    this.b.clear();
    this.c.clear();
    String str1 = paramd.c();
    String str2 = c(parambw);
    str1 = a(str1, str2);
    Matcher localMatcher = j.matcher(str1);
    ArrayList localArrayList = new ArrayList(1);
    try
    {
      while (localMatcher.find())
      {
        String str3 = str1.substring(localMatcher.start(), localMatcher.end());
        Object localObject = null;
        try
        {
          localObject = r.b().c(paramd.d(), str3);
        }
        catch (Exception localException2)
        {
          cl.a(localException2);
        }
        if (localObject == null)
          if (this.c.containsKey(str3))
          {
            localObject = (f)this.c.get(str3);
          }
          else
          {
            str4 = str3.substring(2, str3.length() - 1);
            localObject = new a(str3, "", str4, true);
            this.c.put(str3, localObject);
          }
        String str4 = ((f)localObject).a(parambw, paramInt);
        p localp = new p(this, (f)localObject, localMatcher.start() + paramInt, str4.length());
        if (localArrayList.contains(localObject))
          localp.c = false;
        else
          localArrayList.add(localObject);
        this.b.add(localp);
        if (str3.equals("${END}"))
          this.d = this.b.indexOf(localp);
        str1 = str1.substring(0, localMatcher.start()) + str4 + str1.substring(localMatcher.end());
        localMatcher = j.matcher(str1.subSequence(0, str1.length()));
      }
    }
    catch (Exception localException1)
    {
      cl.a(localException1);
    }
    return (String)str1;
  }

  private static String c(bw parambw)
  {
    Element localElement = parambw.getDocument().getDefaultRootElement().getElement(parambw.d());
    int i1 = localElement.getStartOffset();
    int i2 = localElement.getEndOffset();
    Segment localSegment = new Segment();
    StringBuffer localStringBuffer = new StringBuffer(8);
    try
    {
      parambw.getDocument().getText(i1, i2 - i1, localSegment);
      for (char c1 = localSegment.first(); (Character.isWhitespace(c1)) && (c1 != '\n'); c1 = localSegment.next())
        localStringBuffer.append(c1);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
      return "";
    }
    return localStringBuffer.toString();
  }

  private static String a(String paramString1, String paramString2)
  {
    Segment localSegment = new Segment(paramString1.toCharArray(), 0, paramString1.length());
    StringBuffer localStringBuffer = new StringBuffer();
    for (char c1 = localSegment.first(); localSegment.getIndex() < localSegment.getEndIndex(); c1 = localSegment.next())
    {
      localStringBuffer.append(c1);
      if (c1 != '\n')
        continue;
      localStringBuffer.append(paramString2);
    }
    return localStringBuffer.toString();
  }

  private void a(int paramInt1, int paramInt2)
  {
    this.e.b(c().k());
    try
    {
      this.e.a(c().k(), paramInt1, paramInt2, n);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    JTextComponent localJTextComponent = c().e();
    if (localJTextComponent != null)
      localJTextComponent.repaint();
  }

  private p i()
  {
    if ((this.o >= 0) && (this.o < this.b.size()))
      return (p)this.b.get(this.o);
    return null;
  }

  private boolean a(int paramInt)
  {
    p localp = i();
    if (localp == null)
      return false;
    if ((paramInt == localp.b) || (paramInt == localp.b - 1))
      return true;
    return (paramInt >= localp.b) && (paramInt <= localp.b + localp.d);
  }

  private void e()
  {
    if (this.e != null)
      this.e.b(c().k());
    b(c());
    c().e().repaint();
    this.h = false;
    this.g = false;
  }

  private void f()
  {
    this.h = true;
    this.o += 1;
    if (this.o < this.b.size())
    {
      p localp = (p)this.b.get(this.o);
      if ((localp.a.c()) && (localp.c))
      {
        c().select(localp.b, localp.b + localp.d);
        a(localp.b, localp.b + localp.d);
      }
      else
      {
        f();
      }
    }
    else
    {
      h();
      e();
    }
  }

  private void g()
  {
    if (this.o <= 0)
      this.o = 0;
    else
      this.o -= 1;
    p localp = (p)this.b.get(this.o);
    if ((localp.a.c()) && (localp.c))
    {
      c().select(localp.b, localp.b + localp.d);
      a(localp.b, localp.b + localp.d);
    }
    else
    {
      g();
    }
  }

  private void h()
  {
    JTextComponent localJTextComponent = c().e();
    if (this.d != -1)
    {
      localJTextComponent.setCaretPosition(((p)this.b.get(this.d)).b);
      return;
    }
  }

  static boolean a(m paramm, int paramInt)
  {
    return paramm.a(paramInt);
  }

  static boolean a(m paramm, boolean paramBoolean)
  {
    return paramm.g = paramBoolean;
  }

  static p a(m paramm)
  {
    return paramm.i();
  }

  static void b(m paramm)
  {
    paramm.e();
  }

  static bw c(m paramm)
  {
    return paramm.c();
  }

  static int d(m paramm)
  {
    return paramm.o;
  }

  static ArrayList e(m paramm)
  {
    return paramm.b;
  }

  static void a(m paramm, int paramInt1, int paramInt2)
  {
    paramm.a(paramInt1, paramInt2);
  }

  static com.zend.ide.s.o f(m paramm)
  {
    return paramm.k;
  }

  static void g(m paramm)
  {
    paramm.f();
  }

  static void h(m paramm)
  {
    paramm.g();
  }

  static boolean i(m paramm)
  {
    return paramm.g;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.m
 * JD-Core Version:    0.6.0
 */