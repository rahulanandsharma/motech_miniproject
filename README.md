motech_miniproject
==================

A script to convert string into localizable files with given target language.

Features:-


1.) Uses Microsoft Bing Translator API instead of google translator API because Google translator API is no longer a free service.


2.) All API related calls are enclosed in a single wrapper so even if the API has to be changed the outer function remains the same.


3.) Created a function that takes input as string, language and converts it to that language


ex usage


	translate_string call=new translate_string();
	output=call.trans_string("Hello World","HINDI");


	A demo of this Function is available in directory temp.

4.) A new Function created in file defined_function.java


ex usage


	translator call=new translator();
	call.convert_localizablestring("samples/message.properties","HINDI");


	It creates a file message.properties_HINDI with all UI strings converted to hindi.




5.) I have used Try cache for every function call to prevent crashing of program 


	ex. when user is not connected to internet



6.) Supported Langauges http://msdn.microsoft.com/en-us/library/hh456380.aspx


7.) Current implementation gives error behind a proxy server as "java http request" proxy setting have to be explicitly defined.



Command Line Usage 
==================

To Build run the command

	sh build.sh

To call Java method from command line use
java translator -s sourcefilename -i sourcelanguage -t targetlanguage

Usage: java translator [-options]      
 
	where options include:

	-s Source File name

	-i Source Language 

	-t Target Language

