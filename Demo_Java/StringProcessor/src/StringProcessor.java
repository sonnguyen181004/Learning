/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class StringProcessor {
    public static boolean  match_student_id(String s){
      if(s.matches("(?i)(se|he|ge)\\d{4,6}"))
          return true;
      else
          return false;
              //(?i): Đây là một cờ trong biểu thức chính quy cho phép khớp không phân biệt hoa thường. 
              //Nó có nghĩa là mẫu phía sau nó sẽ khớp bất kể ký tự nào, viết hoa hay viết thường. 
             //Do đó, (se|he|ge) sẽ khớp với "se", "Se", "HE", "He", "GE", hoặc "Ge".
            // ki tu"|" là một toán tử hoặc cho phép khớp vói bất kỳ kí tự           
              //d  là môt lớp ký tự khớp với bất kỳ số nào {4,6}  xác định số lần xuất hiện tối thiểu và tối đa của phần tử trc đó  trường hợp này là các chữ số        
    }         // matches là  (regex) để xem 1 chuỗi có khớp với 1 biểu thức chính quy (regular expression) k
    public static String format_camel(String input){
        String [] arr= input.toLowerCase().split("_");//chuỗi đầu vào được chuyển thành chữ thường và sau đó được phân tách thành một mảng các phần tử dựa trên dấu gạch dưới "_
        StringBuilder sb=new StringBuilder(arr[0]);//Một đối tượng StringBuilder mới được tạo với phần tử đầu tiên của mảng (tức là từ đầu tiên) được đưa vào.
        for(int i=1;i<arr.length;i++){
          
         String ch =arr[i].substring(0,1).toUpperCase();//: Ký tự đầu tiên của từ đang được xử lý được chuyển thành chữ in hoa.
         String newstring=arr[i].substring(1).toLowerCase();//phần còn lại của từ đó được chuyển thành chữ thường.
         sb.append(ch).append(newstring);
        }
        
                return sb.toString().trim();
                
    }
    public static String reverseAll(String input){
     StringBuilder sb=new StringBuilder(input);
     return sb.reverse().toString();
    }
    public static String replaceACharAtEvenPosition(String input,char newChar){
    char[] charArray=input.toCharArray();
    for(int i=0;i<charArray.length;i++){
     if(i%2==0){
     charArray[i]=newChar;//''char phai xai cai nay
     }
    }
    return new String(charArray);
    }
    
    public static int countSpecialCharacter(String input){
    int count=0;
    for(int i=0;i<input.length();i++){
     if(!Character.isLetterOrDigit(input.charAt(i))){
     count++;
     } 
    }
    return count;
    }
    public static String replaceWord(String input ,String oldWord,String newWord){ 
        return input.replaceAll(oldWord,newWord);
    }
    public static boolean findWordInSentence(String input,String word){
    return input.contains(word);//ham nay giup kiem tra chu do co trong chuoi k
    }
    
    public static String replaceWordIgnoreCase(String input,String oldWord,String newWord){
    String[] words=input.split(" ");//cat ra
    for(int i=0;i<words.length;i++){
     if(words[i].equalsIgnoreCase(oldWord)){//k phan biet hoa thuong
      words[i]=newWord;
     }
    }
    String result=String.join(" ", words);// join dung de chuyen mang thanh chuoi
    return result;
    }
    public static boolean isPaindrome(String input){
     StringBuilder sb=new StringBuilder(input);
     String reversed=sb.reverse().toString();
     return input.equals(reversed);
    }//ddoi xung
    public static int countPalidromeWord(String input){
     String []words=input.split(" ");//dem co bao nhieu chu doi xung
     int count=0;
     for(String word:words){
       if(isPaindrome(word)){
       count++;
       }
     }
     return count;
    }
    public String removeAWord(String input,String word){
    return input.replaceAll(word," ");
    }
    public boolean checkPrefix(String input,String prefix){
    return input.startsWith(prefix);
    }//kiem tra co bat dau bang chu nhap vao hay k
    public boolean checkSuffix(String input,String prefix){// kiem tra chu cuoi
    return input.endsWith(prefix);
    }
    
    public int countUpperCase(String input){
    int count=0;
    for(int i=0;i<input.length();i++){
      if(Character.isUpperCase(input.charAt(i))){
       count++;}
      }
    return count;
    }
    
    public String toUpperCaseFirstLetterOfWords(String input){
    String[] words=input.split(" ");
    for(int i=0;i<words.length;i++){
      words[i]=words[i].substring(0,1).toUpperCase()+words[i].substring(1);
    }
    return String.join(" ", words);
    }
    
    public String removespace(String input){
    return input.trim();
    }
    
    
 }
    
  