export CLASSPATH='.:library/microsoft-translator-java-api-0.6.2.jar:library/json-simple-1.1.1.jar:class/'
#For Windows export CLASSPATH='.;microsoft-translator-java-api-0.6.2.jar;json-simple-1.1.1.jar'
javac -d class/ src/translate_string.java
javac -d class/ -cp class/ src/defined_function.java
