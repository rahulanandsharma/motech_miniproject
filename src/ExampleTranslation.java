import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
public class ExampleTranslation
{
  public static void main (String[]args) throws Exception
  {

    String inp =
      "Hello , This is a sample project as part of my Gsoc 2014 Application";
      convert_lang (inp, "HINDI", "temp/msg");
      convert_lang (inp, "FRENCH", "temp/msg");
      convert_lang (inp, "SPANISH", "temp/msg");
      convert_lang (inp, "SWEDISH", "temp/msg");
      convert_lang (inp, "ESTONIAN", "temp/msg");
      convert_lang (inp, "GERMAN", "temp/msg");
      convert_lang (inp, "ITALIAN", "temp/msg");
      convert_lang (inp, "KOREAN", "temp/msg");
      convert_lang (inp, "PORTUGUESE","temp/msg");
      convert_lang (inp, "ROMANIAN", "temp/msg");


  }
  public static void convert_lang (String input, String lang, String dirpath)
  {
   // translate_string call = new translate_string ();
      try
    {
      String filepath = dirpath + "_" + lang;
      File fileDir = new File (filepath);
      final File parent_directory = fileDir.getParentFile ();
      if (null != parent_directory)
	{
	  parent_directory.mkdirs ();
	}

      Writer out =
	new BufferedWriter (new
			    OutputStreamWriter (new
						FileOutputStream (fileDir),
						"UTF8"));
      out.append (translate_string.trans_string (input, lang)).append ("\r\n");
      out.flush ();
      out.close ();

    }
    catch (UnsupportedEncodingException e)
    {
      System.out.println (e.getMessage ());
    }
    catch (IOException e)
    {
      System.out.println (e.getMessage ());
    }
    catch (Exception e)
    {
      System.out.println (e.getMessage ());
    }

  }


}
