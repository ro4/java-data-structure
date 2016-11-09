/**
 * Created by fan on 2016/11/9.
 */
public class Run {
    public static void main(String[] args) {
        FanStack fs = new FanStack();
        fs.push("3232");
        fs.push("3fsdf232");
        fs.push("sdfsdf");
        fs.showStack();
        fs.pop();
        fs.showStack();
        fs.pop();
        fs.showStack();
        fs.pop();
        fs.showStack();
        fs.pop();
        fs.showStack();
    }
}
