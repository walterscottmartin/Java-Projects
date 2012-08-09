//Current Formula Sheet
What class of variable does setDim work on?
How can a function return void and still output a string?
Setter + Getter

Formula : isEmpty()
Use : Stringname.isEmpty()
comments : checks to see if string is empty / Error checking

Formula : indexOf()
Use : nameofstringvariable.indexOf(" "); //Goes from left to Right
Comments : Goes from left to right

Formula : lastIndexOf()
Use : int p = text.lastindexOf(" ");
Comments : Counts from the left but begins at the right.

Formula : setDim (,,)
Use : b.setDim(9,7,2); // versus b.width=9;b.height=7;b.depth=2;
Comments : a more efficient method to set varables.

Formula : setDim (,,)
Use : b.setDim(9,7,2); // versus b.width=9;b.height=7;b.depth=2;
Comments : a more efficient method to set varables.

Custom 
Formula : getter ()
Code :
public int getWidth()
{
return (width);
}

//********************Class Conversions******************************* 

Formula : valueOf(int);
Use : String str = String.valueOf(num);
Comments : short, long, float, int converts all to String

Formula : Integer.parseInt (Stringname)
Use : int num = Integer.parseInt(snum);
Comments : Converts Strings into integers. 
		
Formula : double.parseDouble (string num)
Use : double num = Double.parseDouble (str);
Comments : Converts String to Double

//*****************String Manipulation*********************************
Static Functions

Formula : lpad()
Use : lpad(String, int n); || lpad(String, int n, char )
IE: lpad(str, 38, '=');
Comments : n is the # of spaces you want to add to the left

Formula : rpad()
Use : rpad(String, int n); || rpad(String, int n, char )
IE: rpad(str, 38, '=');
Comments : n is the # of spaces you want to add to the right

Formula : center()
Use : center(String, int n); || center(String, int n, char );
IE : center(str, 38, '=');
Comments : n is the # of spaces you want to add before and after the string

Formula : replaceFirst()
Use : replaceFirst (String oldsrt, String newstr);
IE : str.replaceFirst("hot", "cold");
Comments : replaces first instance of hot with cold 

Formula : replaceAll()
Use : replaceAll(String oldsrt, String newstr);
IE : str.replaceAll("hot", "cold");
Comments : replaces all instances of hot with cold 
















Custom Functions

Formula : ltrim()
Use : str.ltrim();
Comments : This will remove the last character on the left of the string

public static String ltrim(String str)
{
	char c;
	if(str.isEmpty())return (""); // you can also use return string
	for(int i = 0; i<str.length(); i++)
	{
	  c=str.charAt(i);
	  if(c==''||c=='\t'||c=='\n') continue;
	  return str.substring (i) ; 
	}
}

Formula : rtrim()
Use : str.rtrim();
Comments : This will remove the last character on the right of the string
public static String rtrim(String str)
{
	char c;
	if(str.isEmpty())return (""); // you can also use return string
	for(int i <= str.length() + 1; i > 0; i--)
	{
	  c=str.charAt(i);
	  if(c==''||c=='\t'||c=='\n') continue;
	  return str.substring (i) ; 
	}
}

Formula : Chop()
Use : str.chop()
Comments : removes the last character of a string
public static String chop(String str)
{
    if(str.isEmpty()) return (str);
	return (str.substring (o, str.length() -1));
}

Formula : Chomp()
Use : str.chomp()
Comments : removes the last character of a string if it's /n
public static String chomp(String str)
{
    if(str.isEmpty()) return (str);
	char c 
	c = charAt(str.length);
	
	if (c=='/n') return (str.substring (o, str.length() -1));
}


	