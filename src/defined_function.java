import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class defined_function
{
  public static void main (String[]args) throws Exception
  {

    convert_localizablestring ("samples/messages.properties", "HINDI");
    convert_localizablestring ("samples/messages.properties", "FRENCH");
    convert_localizablestring ("samples/messages.properties", "SPANISH");
    convert_localizablestring ("samples/messages.properties", "ITALIAN");
    convert_localizablestring ("samples/messages.properties", "PORTUGUESE");
    convert_localizablestring ("samples/messages.properties", "ROMANIAN");
    convert_localizablestring ("samples/messages.properties", "SWEDISH");
    convert_localizablestring ("samples/messages.properties", "KOREAN");

  }
  public static void convert_localizablestring (String fname, String lang)
  {
    translate_string call = new translate_string ();
      try
    {
      String filepath = fname + "_" + lang;
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
      try
      {
	FileInputStream fis = new FileInputStream (fname);
	Scanner scanner = new Scanner (fis);


	System.out.
	  println
	  ("Coverting file "+ fname+" to Language ->"
	   + lang);

	while (scanner.hasNextLine ())
	  {

	    String expression = scanner.nextLine ();
	    String[]tokens = expression.split (Pattern.quote ("="));
	    out.append (tokens[0]);
	    if (tokens.length >= 2)
	      {

		out.append ("=" +
			    call.trans_string (tokens[1],
					       lang)).append ("\r\n");
	      }
	  }

	out.flush ();
	out.close ();
	scanner.close ();
      }
      catch (Exception e)
      {				//Catch exception if any
	System.err.println ("Error: " + e.getMessage ());
      }

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
