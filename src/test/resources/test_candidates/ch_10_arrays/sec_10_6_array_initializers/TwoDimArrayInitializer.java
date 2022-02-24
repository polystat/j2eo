public class TwoDimArrayInitializer {
    public static void main(String[] args) {
        Object[][] arr2 = new Object[][] {
            { null, null, null },
            { new Object(), "string", .5f },
            {  }
        };
        for (Object[] objects : arr2) {
            for (Object obj : objects) {
                System.out.println(obj);
            }
        }
        System.out.println("passed");
    }    
}
