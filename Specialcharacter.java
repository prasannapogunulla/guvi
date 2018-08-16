import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Specialcharacter
{
public static String password="";
public static final String FINAL_CHAR_REGEX="[!@#$%^&*()_[\\\\]|;',./{}\\\\\\\\:\\\"<>?]";
public static void main(String args[])throws IOException
{
BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
password=dataIn.readLine();
for(int i=0;i<password.length();i++)
{
}
int specialCharCount=password.split(FINAL_CHAR_REGEX,-1).length-1;
System.out.println(specialCharCount);
}
}
