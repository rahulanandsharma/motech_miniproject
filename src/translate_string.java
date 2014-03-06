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
		Language tmp;
		if(lang.equals("ARABIC"))tmp = Language.ARABIC;
		else if (lang.equals("BULGARIAN"))tmp = Language.BULGARIAN;
		else if (lang.equals("CATALAN"))tmp = Language.CATALAN;
		else if (lang.equals("CHINESE_SIMPLIFIED"))tmp = Language.CHINESE_SIMPLIFIED;
		else if (lang.equals("CHINESE_TRADITIONAL"))tmp = Language.CHINESE_TRADITIONAL;
		else if (lang.equals("CZECH"))tmp = Language.CZECH;
		else if (lang.equals("DANISH"))tmp = Language.DANISH;
		else if (lang.equals("DUTCH"))tmp = Language.DUTCH;
		else if (lang.equals("ENGLISH"))tmp = Language.ENGLISH;
		else if (lang.equals("ESTONIAN"))tmp = Language.ESTONIAN;
		else if (lang.equals("FINNISH"))tmp = Language.FINNISH;
		else if (lang.equals("FRENCH"))tmp = Language.FRENCH;
		else if (lang.equals("GERMAN"))tmp = Language.GERMAN;
		else if (lang.equals("GREEK"))tmp = Language.GREEK;
		else if (lang.equals("HAITIAN_CREOLE"))tmp = Language.HAITIAN_CREOLE;
		else if (lang.equals("HEBREW"))tmp = Language.HEBREW;
		else if (lang.equals("HINDI"))tmp = Language.HINDI;
		else if (lang.equals("HMONG_DAW"))tmp = Language.HMONG_DAW;
		else if (lang.equals("HUNGARIAN"))tmp = Language.HUNGARIAN;
		else if (lang.equals("INDONESIAN"))tmp = Language.INDONESIAN;
		else if (lang.equals("ITALIAN"))tmp = Language.ITALIAN;
		else if (lang.equals("JAPANESE"))tmp = Language.JAPANESE;
		else if (lang.equals("KOREAN"))tmp = Language.KOREAN;
		else if (lang.equals("LATVIAN"))tmp = Language.LATVIAN;
		else if (lang.equals("LITHUANIAN"))tmp = Language.LITHUANIAN;
		else if (lang.equals("MALAY"))tmp = Language.MALAY;
		else if (lang.equals("NORWEGIAN"))tmp = Language.NORWEGIAN;
		else if (lang.equals("PERSIAN"))tmp = Language.PERSIAN;
		else if (lang.equals("POLISH"))tmp = Language.POLISH;
		else if (lang.equals("PORTUGUESE"))tmp = Language.PORTUGUESE;
		else if (lang.equals("ROMANIAN"))tmp = Language.ROMANIAN;
		else if (lang.equals("RUSSIAN"))tmp = Language.RUSSIAN;
		else if (lang.equals("SLOVAK"))tmp = Language.SLOVAK;
		else if (lang.equals("SLOVENIAN"))tmp = Language.SLOVENIAN;
		else if (lang.equals("SPANISH"))tmp = Language.SPANISH;
		else if (lang.equals("SWEDISH"))tmp = Language.SWEDISH;
		else if (lang.equals("THAI"))tmp = Language.THAI;
		else if (lang.equals("TURKISH"))tmp = Language.TURKISH;
		else if (lang.equals("UKRAINIAN"))tmp = Language.UKRAINIAN;
		else if (lang.equals("URDU"))tmp = Language.URDU;
		else if (lang.equals("VIETNAMESE"))tmp = Language.VIETNAMESE;
		else tmp = Language.ENGLISH;

		return tmp;
	}

public static int check_invalid(String lang)
	{
		Language tmp;
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


 
