import java.util.*;

import javax.lang.model.util.ElementScanner14;

import static java.lang.System.exit;

public class duplicatebrackstack {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' ')
            continue;
            else if(ch == ')'){
                if(st.peek() == '('){
                System.out.println("true yes it has duplicate brackets!!");
                return;
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                    }
                }
                else 
                st.push(ch);
            }

            System.out.println("false it doesn't have");
        }
    }
