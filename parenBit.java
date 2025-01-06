//Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
public String parenBit(String str) {
  
  if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')'){
    return str;
  }
  //if the first char of the string is (, return the string from the start till the end.
  if (str.charAt(0) == '('){
    return parenBit(str.substring(0, str.length()-1));
  }
  
  //if the last char of the string is ), return the string from the second char to the end.
  if (str.charAt(str.length()-1) == ')'){
    return parenBit(str.substring(1));
  }
  
  //else return the string from the second char to the end.
  return parenBit(str.substring(1, str.length()-1));
  
}
