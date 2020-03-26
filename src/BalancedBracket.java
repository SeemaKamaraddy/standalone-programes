import java.util.Stack;

public class BalancedBracket {

	public static void main(String args[]) {
		//Balanced Tree 
		//{}()[]
		//{{()}[]
		
		    String brackets = "{{()()}}[]";
		    char charArray[] = brackets.toCharArray();
		    Stack<String> stack = new Stack<String>();
		    
		    boolean balanced = true;
		    for(char c:charArray) {
		        switch (c) {
		            case '{':
		            case '(':
		            case '[':
		                stack.push(String.valueOf(c));
		                break;
		            case '}':
		                if (stack.empty() || !("{".equals(stack.peek()))) {
		                	balanced = false;
		                    break;
		                }
		                stack.pop();
		                break;
		            case ')':
		                if (stack.empty() || !("(".equals(stack.peek()))) {
		                	balanced = false;
		                    break;
		                }
		                stack.pop();
		                break;
		            case ']':
		                if (stack.empty() || !("[".equals(stack.peek()))) {
		                	balanced = false;
		                	break;
		                }
		                stack.pop();
		                break;
		        }
		    }
		    if(balanced) {
		    	if(stack.empty())
			    	System.out.println("YES - its a balanced bracket");
			    else
			    	System.out.println("NO - its not a balanced bracket");
		    }
		    else
		    	System.out.println("NO - its not a balanced bracket");
		}

}
