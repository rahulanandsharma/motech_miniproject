import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;

 
 
public class translate_string
{
  
public static void main (String[]args) throws Exception
  {
    
System.out.println (trans_string ("Hello World", "ENGLISH","HINDI"));
  
} 
public static String trans_string (String input, String initLang,String targLang) 
  {
    
//Bing Client ID
      Translate.setClientId ("motech_trans");
    
//Bing Client secret
//try catch used to prevent crashing of program when unable to connect to internet
      Translate.setClientSecret ("6C7xj1fGRXbMabrGsULcrOc9TRuJoJIuismCPihPAd0=");
try{
return Translate.execute(input, determine(initLang.toUpperCase()), determine(targLang.toUpperCase()));
}
catch(Exception e)
		{
			System.out.println("Exception");
return null;
		}

}
public static Language determine(String lang)
	{
		Language temporary;
		if(lang.equals("ARABIC"))temporary = Language.ARABIC;
		else if (lang.equals("BULGARIAN"))temporary = Language.BULGARIAN;
		else if (lang.equals("CATALAN"))temporary = Language.CATALAN;
		else if (lang.equals("CHINESE_SIMPLIFIED"))temporary = Language.CHINESE_SIMPLIFIED;
		else if (lang.equals("CHINESE_TRADITIONAL"))temporary = Language.CHINESE_TRADITIONAL;
		else if (lang.equals("CZECH"))temporary = Language.CZECH;
		else if (lang.equals("DANISH"))temporary = Language.DANISH;
		else if (lang.equals("DUTCH"))temporary = Language.DUTCH;
		else if (lang.equals("ENGLISH"))temporary = Language.ENGLISH;
		else if (lang.equals("ESTONIAN"))temporary = Language.ESTONIAN;
		else if (lang.equals("FINNISH"))temporary = Language.FINNISH;
		else if (lang.equals("FRENCH"))temporary = Language.FRENCH;
		else if (lang.equals("GERMAN"))temporary = Language.GERMAN;
		else if (lang.equals("GREEK"))temporary = Language.GREEK;
		else if (lang.equals("HAITIAN_CREOLE"))temporary = Language.HAITIAN_CREOLE;
		else if (lang.equals("HEBREW"))temporary = Language.HEBREW;
		else if (lang.equals("HINDI"))temporary = Language.HINDI;
		else if (lang.equals("HMONG_DAW"))temporary = Language.HMONG_DAW;
		else if (lang.equals("HUNGARIAN"))temporary = Language.HUNGARIAN;
		else if (lang.equals("INDONESIAN"))temporary = Language.INDONESIAN;
		else if (lang.equals("ITALIAN"))temporary = Language.ITALIAN;
		else if (lang.equals("JAPANESE"))temporary = Language.JAPANESE;
		else if (lang.equals("KOREAN"))temporary = Language.KOREAN;
		else if (lang.equals("LATVIAN"))temporary = Language.LATVIAN;
		else if (lang.equals("LITHUANIAN"))temporary = Language.LITHUANIAN;
		else if (lang.equals("MALAY"))temporary = Language.MALAY;
		else if (lang.equals("NORWEGIAN"))temporary = Language.NORWEGIAN;
		else if (lang.equals("PERSIAN"))temporary = Language.PERSIAN;
		else if (lang.equals("POLISH"))temporary = Language.POLISH;
		else if (lang.equals("PORTUGUESE"))temporary = Language.PORTUGUESE;
		else if (lang.equals("ROMANIAN"))temporary = Language.ROMANIAN;
		else if (lang.equals("RUSSIAN"))temporary = Language.RUSSIAN;
		else if (lang.equals("SLOVAK"))temporary = Language.SLOVAK;
		else if (lang.equals("SLOVENIAN"))temporary = Language.SLOVENIAN;
		else if (lang.equals("SPANISH"))temporary = Language.SPANISH;
		else if (lang.equals("SWEDISH"))temporary = Language.SWEDISH;
		else if (lang.equals("THAI"))temporary = Language.THAI;
		else if (lang.equals("TURKISH"))temporary = Language.TURKISH;
		else if (lang.equals("UKRAINIAN"))temporary = Language.UKRAINIAN;
		else if (lang.equals("URDU"))temporary = Language.URDU;
		else if (lang.equals("VIETNAMESE"))temporary = Language.VIETNAMESE;
		else temporary = Language.ENGLISH;

		return temporary;
	}
public static int check_invalid(String lang)
	{

		if(lang.equals("ARABIC")) return 1;
		else if (lang.equals("BULGARIAN")) return 1;
		else if (lang.equals("CATALAN")) return 1;
		else if (lang.equals("CHINESE_SIMPLIFIED")) return 1;
		else if (lang.equals("CHINESE_TRADITIONAL")) return 1;
		else if (lang.equals("CZECH")) return 1;
		else if (lang.equals("DANISH")) return 1;
		else if (lang.equals("DUTCH")) return 1;
		else if (lang.equals("ENGLISH")) return 1;
		else if (lang.equals("ESTONIAN")) return 1;
		else if (lang.equals("FINNISH")) return 1;
		else if (lang.equals("FRENCH")) return 1;
		else if (lang.equals("GERMAN")) return 1;
		else if (lang.equals("GREEK")) return 1;
		else if (lang.equals("HAITIAN_CREOLE")) return 1;
		else if (lang.equals("HEBREW")) return 1;
		else if (lang.equals("HINDI")) return 1;
		else if (lang.equals("HMONG_DAW")) return 1;
		else if (lang.equals("HUNGARIAN")) return 1;
		else if (lang.equals("INDONESIAN")) return 1;
		else if (lang.equals("ITALIAN")) return 1;
		else if (lang.equals("JAPANESE")) return 1;
		else if (lang.equals("KOREAN")) return 1;
		else if (lang.equals("LATVIAN")) return 1;
		else if (lang.equals("LITHUANIAN")) return 1;
		else if (lang.equals("MALAY")) return 1;
		else if (lang.equals("NORWEGIAN")) return 1;
		else if (lang.equals("PERSIAN")) return 1;
		else if (lang.equals("POLISH")) return 1;
		else if (lang.equals("PORTUGUESE")) return 1;
		else if (lang.equals("ROMANIAN")) return 1;
		else if (lang.equals("RUSSIAN")) return 1;
		else if (lang.equals("SLOVAK")) return 1;
		else if (lang.equals("SLOVENIAN")) return 1;
		else if (lang.equals("SPANISH")) return 1;
		else if (lang.equals("SWEDISH")) return 1;
		else if (lang.equals("THAI")) return 1;
		else if (lang.equals("TURKISH")) return 1;
		else if (lang.equals("UKRAINIAN")) return 1;
		else if (lang.equals("URDU")) return 1;
		else if (lang.equals("VIETNAMESE")) return 1;
		else  return 0;
	}



}


 
