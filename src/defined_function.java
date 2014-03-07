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
import java.io.LineNumberReader;
import java.io.FileReader;


public class defined_function
{
  public static void main (String[]args) throws Exception
  {
String source="",initlang="",targlang="";


for(int count=0;count<args.length;count++)
  {
   if(!args[count].startsWith("-")) 
     {
          //even numbered arguments should begin with -
          System.out.println("Improper Syntax: ");
System.out.println("Invalid Number of Arguments");
System.out.println("Usage: javac defined_function [-options]  ");     
System.out.println("	where options include:");
System.out.println("-s\t Source File name");
System.out.println("-i\t Source Language ");
System.out.println("-t\t Target Language");
return ;

     }
   //if args[count]==any flag then args[count+1] contains the 
   //value for that flag
   if(args[count].equals("-s")) source=args[++count];
   if(args[count].equals("-i")) initlang=args[++count];
   if(args[count].equals("-t")) targlang=args[++count];

  }


 translate_string check = new translate_string ();
//System.out.println(check.check_invalid(initlang.toUpperCase()));
if(source=="" ||initlang==""||targlang=="")
{
System.out.println("Invalid Number of Arguments");
System.out.println("Usage: javac defined_function [-options]  ");     
System.out.println("	where options include:");
System.out.println("-s\t Source File name");
System.out.println("-i\t Source Language ");
System.out.println("-t\t Target Language");
return ;
}
if(check.check_invalid(initlang.toUpperCase())==0)
{
System.out.println("Invalid Initial Language");
System.out.println("See Languges.txt for list of Supported Languages");
return ;
}
if(check.check_invalid(targlang.toUpperCase())==0)
{
System.out.println("Invalid Target Language");
System.out.println("See Languges.txt for list of Supported Languages");
return ;
}
System.out.println("File : " + source +" to be Converted from " + initlang + " to " +targlang );
    convert_localizablestring (source, initlang,targlang);



  }
  public static void convert_localizablestring (String fname, String lang,String dest)
  {
    translate_string call = new translate_string ();
      try
    {

LineNumberReader  lnr = new LineNumberReader(new FileReader(new File(fname)));
lnr.skip(Long.MAX_VALUE);
int filelinenumbers=lnr.getLineNumber();
System.out.println("Lines in input File : "+ lnr.getLineNumber());




      String filepath = fname + "_" + dest;
		System.out.println("Output will be written to File : " + filepath );
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
	int count=1;
	int nullcount=0;
	while (scanner.hasNextLine ())
	  {

		System.out.print("Lines : "+ count +"/"+filelinenumbers +"\tProgress = "+count*100/filelinenumbers +"% \r\r" );

		count++;
	    String expression = scanner.nextLine ();
	    String[]tokens = expression.split (Pattern.quote ("="));
	    out.append (tokens[0]);
	    if (tokens.length >= 2)
	      {
		String rofl=call.trans_string (tokens[1], lang,dest);
		if(rofl==null)
		nullcount=0;
		out.append ("=" +rofl).append ("\r\n");
	      }

	out.flush ();
	  }
	if(nullcount>0)
		System.out.println("Parses failed for lines : " +nullcount );

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
