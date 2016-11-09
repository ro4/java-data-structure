import java.util.ArrayList;
import java.util.Iterator;

public class FanStack {

    private ArrayList<String> stack = new ArrayList<>();

    public boolean pop() {
        if(this.checkEmpty()) {
            System.out.println("pop failed!");
            return false;
        }
        try{
            this.stack.remove(stack.size()-1);
        } catch(Exception e) {
            System.out.println("pop failed!");
            return false;
        }
        System.out.println("pop successful!");
        return true;
    }

    private boolean checkEmpty() {
       return this.stack.isEmpty();
    }

    public boolean push(String item) {
        try{
            this.stack.add(stack.size(),item);
        } catch(Exception e) {
            System.out.println("push failed!");
            return false;
        }
        System.out.println("push successful!");
        return true;
    }

    public boolean showStack() {
        Iterator<String> iterator = this.stack.iterator();
        while(iterator.hasNext()){
            System.out.println("------------");
            String s = iterator.next();
            s = "|---"+s+"---|";
            System.out.println(s);
        }
        System.out.println("------------");
        return true;
    }
}