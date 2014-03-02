import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;

 
 
public class translate_string
{
  
public static void main (String[]args) throws Exception
  {
    
System.out.println (trans_string ("Hello World", "SPANISH"));
  
} 
public static String trans_string (String input, String lang) 
  {
    
//Bing Client ID
      Translate.setClientId ("motech_trans");
    
//Bing Client secret
//try catch used to prevent crashing of program when unable to connect to internet
      Translate.
      setClientSecret ("6C7xj1fGRXbMabrGsULcrOc9TRuJoJIuismCPihPAd0=");
    
if (lang == "ARABIC")
      
      {
	try
	{
	  return Translate.execute (input, Language.HINDI);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "BULGARIAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.BULGARIAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "CATALAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.CATALAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "CHINESE_SIMPLIFIED")
      
      {
	try
	{
	  return Translate.execute (input, Language.CHINESE_SIMPLIFIED);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "CHINESE_TRADITIONAL")
      
      {
	try
	{
	  return Translate.execute (input, Language.CHINESE_TRADITIONAL);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "CZECH")
      
      {
	try
	{
	  return Translate.execute (input, Language.CZECH);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "DANISH")
      
      {
	try
	{
	  return Translate.execute (input, Language.DANISH);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "ENGLISH")
      
      {
	try
	{
	  return Translate.execute (input, Language.ENGLISH);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "ESTONIAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.ESTONIAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "FINNISH")
      
      {
	try
	{
	  return Translate.execute (input, Language.FINNISH);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "FRENCH")
      
      {
	try
	{
	  return Translate.execute (input, Language.FRENCH);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "GERMAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.GERMAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "GREEK")
      
      {
	try
	{
	  return Translate.execute (input, Language.GREEK);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "HAITIAN_CREOLE")
      
      {
	try
	{
	  return Translate.execute (input, Language.HAITIAN_CREOLE);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "HEBREW")
      
      {
	try
	{
	  return Translate.execute (input, Language.HEBREW);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "HINDI")
      
      {
	try
	{
	  return Translate.execute (input, Language.HINDI);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "HMONG_DAW")
      
      {
	try
	{
	  return Translate.execute (input, Language.HMONG_DAW);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "INDONESIAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.INDONESIAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "ITALIAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.ITALIAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "JAPANESE")
      
      {
	try
	{
	  return Translate.execute (input, Language.JAPANESE);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "KOREAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.KOREAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "LATVIAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.LATVIAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "LITHUANIAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.LITHUANIAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "MALAY")
      
      {
	try
	{
	  return Translate.execute (input, Language.MALAY);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "NORWEGIAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.NORWEGIAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "MALAY")
      
      {
	try
	{
	  return Translate.execute (input, Language.MALAY);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "PERSIAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.PERSIAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "POLISH")
      
      {
	try
	{
	  return Translate.execute (input, Language.POLISH);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "PORTUGUESE")
      
      {
	try
	{
	  return Translate.execute (input, Language.PORTUGUESE);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "ROMANIAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.ROMANIAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "RUSSIAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.RUSSIAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "SLOVAK")
      
      {
	try
	{
	  return Translate.execute (input, Language.SLOVAK);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "SLOVENIAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.SLOVENIAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "SPANISH")
      
      {
	try
	{
	  return Translate.execute (input, Language.SPANISH);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "SWEDISH")
      
      {
	try
	{
	  return Translate.execute (input, Language.SWEDISH);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "THAI")
      
      {
	try
	{
	  return Translate.execute (input, Language.THAI);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "TURKISH")
      
      {
	try
	{
	  return Translate.execute (input, Language.TURKISH);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "UKRAINIAN")
      
      {
	try
	{
	  return Translate.execute (input, Language.UKRAINIAN);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "URDU")
      
      {
	try
	{
	  return Translate.execute (input, Language.URDU);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
    else if (lang == "VIETNAMESE")
      
      {
	try
	{
	  return Translate.execute (input, Language.VIETNAMESE);
	}
	catch (Exception e)
	{
	  return null;
	}
      }
    
 
 
 
 
 
 
 
 
 
 
return null;
  
}

}


 
