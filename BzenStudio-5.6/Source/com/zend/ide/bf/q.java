package com.zend.ide.bf;

import com.zend.ide.f.c.f;
import com.zend.ide.f.c.g;
import java.util.Hashtable;

class q
{
  public static Hashtable b()
  {
    Hashtable localHashtable1 = new Hashtable();
    Hashtable localHashtable2 = new Hashtable();
    localHashtable2.put("pr", new c("pr", "PHP", "print", "print ${expr};\n${END}", false));
    localHashtable2.put("prs", new c("prs", "PHP", "print a string", "print \"${str}\";\n${END}", false));
    localHashtable2.put("prln", new c("prln", "PHP", "print with newline", "print ${expr}.\"\\n\";\n${END}", false));
    localHashtable2.put("eco", new c("eco", "PHP", "echo a string", "echo(\"${END}\");", false));
    localHashtable2.put("prv", new c("prv", "PHP", "prints a value", "print(\"\\${VARIABLE} = \". ${VARIABLE});${END}", false));
    localHashtable2.put("prm", new c("prm", "PHP", "prints the current method name", "print(\"${CURRENT_METHOD}\");${END}", false));
    localHashtable2.put("prc", new c("prc", "PHP", "prints the current class name", "print(\"${CURRENT_CLASS}\");${END}", false));
    localHashtable2.put("itar", new c("itar", "PHP", "iterates an array", "for (${INDEX} = 0; ${INDEX} < count(${ARRAY_NAME}); ${INDEX}++) {\n\t${END}\n}", false));
    localHashtable2.put("inst", new c("inst", "PHP", "instanceof statement", "if (${VARIABLE} instanceof ${Object}) {\n\t${END}\n}", false));
    localHashtable2.put("fore", new c("fore", "PHP", "foreach statement", "foreach (${ARRAY_NAME} as ${value}) {\n\t${END}\n}", false));
    localHashtable2.put("forek", new c("forek", "PHP", "foreach with key statement", "foreach (${ARRAY_NAME} as ${key} => ${value}) {\n\t${END}\n}", false));
    localHashtable2.put("swi", new c("swi", "PHP", "switch statement", "switch (${key}) {\n\tcase ${value}:\n\t\t${END}\n\t\tbreak;\n\n\tdefault:\n\t\tbreak;\n}", false));
    localHashtable2.put("fnc", new c("fnc", "PHP", "function statement", "function ${name}()\n{\n\t${END}\n}", false));
    localHashtable2.put("cls", new c("cls", "PHP", "class statement", "class ${name} {\n\n\tfunction ${name}() {\n\t\t${END}\n\t}\n}", false));
    localHashtable2.put("if", new c("if", "PHP", "if statement", "if (${condition}) {\n\t${END}\n}", false));
    localHashtable2.put("els", new c("els", "PHP", "else statement", "else {\n\t${END}\n}", false));
    localHashtable2.put("elif", new c("elif", "PHP", "elseif statement", "elseif (${condition}) {\n\t${END}\n}", false));
    localHashtable2.put("while", new c("while", "PHP", "while loop", "while (${condition}) {\n\t${END}\n}", false));
    localHashtable2.put("itdir", new c("itdir", "PHP", "iterates a directory", "$${dirh} = opendir(${DIRNAME});\nif ($${dirh}) {\n\twhile ($dir_element = readdir($${dirh})) {\n\t\t${END}\n\t}\n\tunset($dir_element);\n\tclosedir($${dirh});\n}", false));
    localHashtable2.put("my_fr", new c("my_fr", "PHP", "mysql_fetch_row() loop", "while ($${row} = mysql_fetch_row($${query})) {\n\t${END}\n}\n", false));
    localHashtable2.put("my_fa", new c("my_fa", "PHP", "mysql_fetch_array() loop", "while ($${row} = mysql_fetch_array($${query})) {\n\t${END}\n}\n", false));
    localHashtable2.put("my_fo", new c("my_fo", "PHP", "mysql_fetch_object() loop", "while ($${row} = mysql_fetch_object($${query})) {\n\t${END}\n}\n", false));
    localHashtable2.put("my_gc", new c("my_gc", "PHP", "Trap code output", "ob_start();\n\n${END}\n\n$${CONTENTS} = ob_get_contents();\nob_end_clean();\n", false));
    localHashtable2.put("cln", new c("cln", "PHP", "Clone an object", "$${new_obj} = clone $${obj};\n${END}", false));
    localHashtable2.put("pcon", new c("pcon", "PHP", "Call parent constructor", "parent::__construct();\n${END}", false));
    localHashtable2.put("pclon", new c("pclon", "PHP", "Call parent's clone", "parent::__clone();\n${END}", false));
    localHashtable1.put("PHP", localHashtable2);
    Hashtable localHashtable3 = new Hashtable();
    localHashtable3.put("href", new c("href", "HTML", "create a hyperlink", "<a href=\"${link}\">${link text}</a> ${END}", false));
    localHashtable3.put("ihref", new c("ihref", "HTML", "create an image hyperlink", "<a href=\"${link text}\"><img src=\"image\"></a> ${END}", false));
    localHashtable3.put("form", new c("form", "HTML", "create a get form", "<form action=\"${action}\" method=\"${GET}\">\n${END}\n</form>", false));
    localHashtable3.put("formp", new c("formp", "HTML", "create a post form", "<form action=\"${action}\" method=\"${post}\" enctype=\"text/plain\">\n${END}\n</form>", false));
    localHashtable3.put("html", new c("html", "HTML", "create html page", "<html>\n<head>\n<meta http-equiv=\"Content-Language\" content=\"en\" />\n<meta name=\"GENERATOR\" content=\"Zend Studio\" />\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n<title>${title}</title>\n</head>\n<body bgcolor=\"#FFFFFF\" text=\"#000000\" link=\"#FF9966\" vlink=\"#FF9966\" alink=\"#FFCC99\">\n${END}\n</body>\n</html>", false));
    localHashtable3.put("inbu", new c("inbu", "HTML", "input by button", "<input type=\"button\" name=\"${name}\" value=\"${value}\"/>  ${END}", false));
    localHashtable3.put("inch", new c("inch", "HTML", "input by checkbox", "<input type=\"checkbox\" name=\"${name}\" value=\"${value}\"/>  ${END}", false));
    localHashtable3.put("inra", new c("inra", "HTML", "input by radio button", "<input type=\"radio\" name=\"${name}\" value=\"${value}\"/>  ${END}", false));
    localHashtable3.put("inrst", new c("inrst", "HTML", "input type reset", "<input type=\"reset\" name=\"${name}\" value=\"${value}\"/>  ${END}", false));
    localHashtable3.put("insub", new c("insub", "HTML", "input type submit", "<input type=\"submit\" name=\"${name}\" value=\"${value}\"/>  ${END}", false));
    localHashtable3.put("intxt", new c("intxt", "HTML", "input by text field", "<input type=\"text\" name=\"${name}\" value=\"${value}\"/>  ${END}", false));
    localHashtable3.put("inps", new c("inps", "HTML", "input by password field", "<input type=\"password\" name=\"${name}\" size=\"40\" maxlength=\"40\"/>  ${END}", false));
    localHashtable3.put("ol", new c("ol", "HTML", "ordered list", "<ol>\n\t<li>${item1}<br/>\n\t</li>\n\t<li>${item2}<br/>\n\t</li>\n</ol>${END}", false));
    localHashtable3.put("jscript", new c("jscript", "HTML", "javascript tag", "<script language=\"JavaScript\" type=\"text/javascript\">\n\t${END}\n</script>", false));
    localHashtable3.put("select", new c("select", "HTML", "select in form", "<select name=\"${name}\" size=\"3\">\n\t<option value=\"${value1}\">${option1}</option>\n\t<option value=\"${value2}\">${option2}</option>\n\t<option value=\"${value3}\">${option3}</option>\n</select>${END}", false));
    localHashtable3.put("style", new c("style", "HTML", "text/css style", "</style type=\"text/css\">\n\t${END}\n</style>", false));
    localHashtable3.put("table", new c("table", "HTML", "table 3 rows by 3 columns", "<table>\n\t<tr>\n\t\t<td>${position 0,0}</td><td>${position 0,1}</td><td>${position 0,2}</td>\n\t</tr>\n\t<tr>\n\t\t<td>${position 1,0}</td><td>${position 1,1}</td><td>${position 1,2}</td>\n\t</tr>\n\t<tr>\n\t\t<td>${position 2,0}</td><td>${position 2,1}</td><td>${position 2,2}</td>\n\t</tr>\n</table>${END}", false));
    localHashtable3.put("htable", new c("htable", "HTML", "table 3 rows by 3 columns with header", "<table>\n\t<tr>\n\t\t<th>${header 0}</th><th>${header 1}</th><th>${header 2}</th>\n\t</tr>\n\t<tr>\n\t\t<td>${position 0,0}</td><td>${position 0,1}</td><td>${position 0,2}</td>\n\t</tr>\n\t<tr>\n\t\t<td>${position 1,0}</td><td>${position 1,1}</td><td>${position 1,2}</td>\n\t</tr>\n\t<tr>\n\t\t<td>${position 2,0}</td><td>${position 2,1}</td><td>${position 2,2}</td>\n\t</tr>\n</table>${END}", false));
    localHashtable3.put("ta", new c("ta", "HTML", "form textarea", "<textarea name=\"${name}\" rows=\"10\" cols=\"50\" wrap=\"off\">\n\t${text}\n</textarea>${END}", false));
    localHashtable3.put("ul", new c("ul", "HTML", "bulleted list", "<ul>\n\t<li>${item 1}<br/>\n\t</li>\n\t<li>${item 2}<br/>\n\t</li>\n</ul>${END}", false));
    localHashtable1.put("HTML", localHashtable3);
    Hashtable localHashtable4 = new Hashtable();
    localHashtable1.put("PHPDoc", localHashtable4);
    localHashtable1.put("CSS", new Hashtable());
    localHashtable1.put("JavaScript", new Hashtable());
    return localHashtable1;
  }

  public static Hashtable d()
  {
    Hashtable localHashtable1 = new Hashtable();
    Hashtable localHashtable2 = new Hashtable();
    Hashtable localHashtable3 = new Hashtable();
    Hashtable localHashtable4 = new Hashtable();
    Hashtable localHashtable5 = new Hashtable();
    Hashtable localHashtable6 = new Hashtable();
    localHashtable1.put("PHP", localHashtable2);
    localHashtable1.put("HTML", localHashtable3);
    localHashtable1.put("PHPDoc", localHashtable4);
    localHashtable1.put("JavaScript", localHashtable5);
    localHashtable1.put("CSS", localHashtable6);
    return localHashtable1;
  }

  public static Hashtable c()
  {
    Hashtable localHashtable1 = new Hashtable();
    Hashtable localHashtable2 = new Hashtable();
    Hashtable localHashtable3 = new Hashtable();
    Hashtable localHashtable4 = new Hashtable();
    Hashtable localHashtable5 = new Hashtable();
    Hashtable localHashtable6 = new Hashtable();
    localHashtable4.put("${USER}", new com.zend.ide.bf.b.d("${USER}", "insert the user name", "", false));
    localHashtable4.put("${DATE}", new com.zend.ide.bf.b.b("${DATE}", "insert the current date", "", false));
    localHashtable4.put("${YEAR}", new com.zend.ide.bf.b.e("${YEAR}", "insert the current year", "", false));
    localHashtable4.put("${TIME}", new com.zend.ide.bf.b.c("${TIME}", "insert the current time", "", false));
    localHashtable4.put("${END}", new com.zend.ide.bf.b.a("${END}", "the position of the caret at the end of editing", "", false));
    localHashtable4.put("${FILE_NAME}", new f("${FILE_NAME}", "the current edited file", "", false));
    localHashtable4.put("${FILE_PATH}", new g("${FILE_PATH}", "the current edited file path", "", false));
    localHashtable1.put("${INDEX}", new com.zend.ide.f.c.c("${INDEX}", "suggests an index variable name", "$i", true));
    localHashtable1.put("${ARRAY_NAME}", new com.zend.ide.f.c.a("${ARRAY_NAME}", "suggests an array name", "$array", true));
    localHashtable1.put("${VARIABLE}", new com.zend.ide.f.c.e("${VARIABLE}", "suggests a varible name", "$variable", true));
    localHashtable1.put("${CURRENT_CLASS}", new com.zend.ide.f.c.b("${CURRENT_CLASS}", "returns the current class name", "current class", false));
    localHashtable1.put("${CURRENT_METHOD}", new com.zend.ide.f.c.d("${CURRENT_METHOD}", "returns the current method name", "current method", false));
    Hashtable localHashtable7 = new Hashtable();
    localHashtable7.put("HTML", localHashtable3);
    localHashtable7.put("PHP", localHashtable1);
    localHashtable7.put("PHPDoc", localHashtable2);
    localHashtable7.put("CSS", localHashtable5);
    localHashtable7.put("JavaScript", localHashtable6);
    localHashtable7.put("general", localHashtable4);
    return localHashtable7;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.q
 * JD-Core Version:    0.6.0
 */