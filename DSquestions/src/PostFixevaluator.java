import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;

public class PostFixevaluator {
    public static int evaluation(String ex)

    {
        Stack<Integer>stack=new Stack<>();
        HashMap map=new HashMap();
        Hashtable table;
       //for(char c:ex.toCharArray())
        //{
        for(int i=ex.length()-1;i>=0;i--)
        {
            char c=ex.charAt(i);
            if(Character.isDigit(c))
            {
                stack.push(Character.getNumericValue(c));
            }
            else {
                int operand1=stack.pop();
                int operand2=stack.pop();
                switch (c){
                    case '+':
                        stack.push(operand1+operand2);
                        break;
                    case '-':
                        stack.push(operand1-operand2);
                        break;
                    case '*':
                        stack.push(operand1*operand2);
                        break;
                    case '/':
                        stack.push(operand1/operand2);
                        break;

                }


            }

        }
return stack.pop();
    }

    public static void main(String[] args) {

        System.out.println(PostFixevaluator.evaluation("+23"));
    }
}
