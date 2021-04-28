public class Test {
    public int foo(String c, int d) {
        // Matched
        if (c == "hello") {
            return 1;
        }
        // Not matched
        if (d == 2) {
            return -1;
        }
        return 1;
    }


    public void testSemgrep(int a, int b, String c, String d){
        if(a > b && b > a+1 && c == d){
            a = b;
        }
    }
}