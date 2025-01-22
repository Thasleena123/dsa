//package dsapartone;
//import java.io.*;
//
//public class StringOccurrence {
//    public static int getOccurrenceCount(String toSearch, InputStream stream) throws Exception {
//        int count = 0;
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                if (line.contains(toSearch)) {
//                    count++;
//                }
//            }
//        }
//
//        return count;
//    }
//
//    public static void main(String[] args) throws Exception {
//        String msg = "Hey! How are you?\nI am good, how about you?\nI am good too.";
//        try (InputStream stream = new ByteArrayInputStream(msg.getBytes())) {
//            System.out.println(StringOccurrence.getOccurrenceCount("good", stream));
//        }
//    }
//}
