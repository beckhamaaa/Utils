package com.torres.utils.lombok;

/**
 * @Cleanup
 * Created by Torres on 2018-05-23 12:20.
 */
public class CleanUp {
//    public static void main(String[] args) {
//        try {
////  自动管理资源，用在局部变量之前，在当前变量范围内即将执行完毕退出之前会自动清理资源，
////  自动生成try-finally这样的代码来关闭流
//           @Cleanup InputStream inputStream = new FileInputStream(args[0]);
//            System.out.println(inputStream);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        //=>相当于
////        InputStream inputStream = null;
////        try {
////            inputStream = new FileInputStream(args[0]);
////        } catch (FileNotFoundException e) {
////            e.printStackTrace();
////        } finally {
////            if (inputStream != null) {
////                try {
////                    inputStream.close();
////                } catch (IOException e) {
////                    e.printStackTrace();
////                }
////            }
////        }
//    }


}
