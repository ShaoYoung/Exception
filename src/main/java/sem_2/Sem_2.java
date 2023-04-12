package sem_2;

import java.util.Scanner;

public class Sem_2 {
    public static void main(String[] args) {

//        1
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[10];
//        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
//        int index = -1;
//        while (true) {
//            try {
//                index = scanner.nextInt();
//                break;
//            } catch (Exception e) {
//                System.out.println("должно быть число");
//                scanner.next();
//            }
//        }
//        try {
//            arr[index] = 1;
//        } catch (Exception e) {
//            System.out.println("Указан индекс за пределам массива");
//        }


//        2

//        public static void main(String[] args) {
//        int sum = sum2d(new String[][]{{"1", "2", "3", "4", "j", "6"}, {"1", "w"}, {"2", "7"}});
        int sum = sum2d(null);

        System.out.println(sum);
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        try {

            if (arr == null) {
                throw new NullPointerException("Входящий массив не может быть налл. Вычисление суммы не представляется возможным");
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j <= 5; j++) {
                    int val = 0;

                    try {
                        val = Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    sum += val;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Непредвиденная ошибка. " + e.getMessage() );
        }
        return sum;
    }
}
//    }
//        }



// 3 ДЗ

//        public static void main(String[] args) {
//            InputStream inputStream;
//            try {
//                String[] strings = {"apple", "orange"};
//                String strings1 = strings[2];
//                test();
//                int a = 1 / 0;
//                inputStream = new FileInputStream("/broken_reference");
//            } catch (Throwable e) {
//                e.printStackTrace();
//      /*  } catch (StackOverflowError error) {
//            System.out.println("Что-то сломалось");*/
//            } finally {
//                System.out.println("Я все равно выполнился");
//            }
//            System.out.println("Я жив!");
//        }
//
//        private static void test() throws IOException {
//            File file = new File("1");
//            file.createNewFile();
//            FileReader reader = new FileReader(file);
//            reader.read();
//            test();
//        }
//
//

