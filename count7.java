//Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). 
public int count7(int n) {
  if (n == 0 ){
    return 0;
  }
  
  int count = n%10;
  
  if (count == 7){
    return 1 + count7(n/10);
  } else {
    return count7(n/10);
  }
}
