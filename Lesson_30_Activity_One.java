//THIS CODE IS INCOMPLETE AND WILL NOT COMPILE CORRECTLY

import java.util.Scanner;

public class Lesson_30_Activity_One {

       public static void main (String[] args){
           String [] list = {"every", " near  ing ", "      checking", "food ", "stand", "value      "};
       int i = 0;
       String stringOne;
       String stringTwo;

       for (i = 0; i < list.length; i++){
           if (list[i].indexOf(" ") == 0){
               list[i] = list[i].substring(1, list[i].length() - 1);
           }
           else if (list[i].indexOf(" ") == (list[i].length() - 1)){
               list[i] = list[i].substring(0, list[i].indexOf(" "));
           }
           else{
               stringOne = list[i].substring(0, list[i].indexOf(" "));
               stringTwo= list[i].substring(list[i].indexOf(" ") +  1, list[i].length() - 1);

               list[i] = stringOne + stringTwo;
           }
       }

       System.out.println(list);
   }
}

