public class ValidParentheses {
    public static void main(String[] args) {
        String c="{abc}";
        System.out.println(c.length());
        if ((c.startsWith("(")||c.startsWith("{")||c.startsWith("["))&&
                (c.endsWith(")")||c.endsWith("}")||c.endsWith("]"))
        ){
            if (c.startsWith("(")&& c.endsWith(")")){
            System.out.println(true);
            } else if (c.startsWith("{")&&c.endsWith("}")) {
                System.out.println(true);
            }else if (c.startsWith("[")&&c.endsWith("]")){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }else {
            System.out.println(false);
        }


    }
}
