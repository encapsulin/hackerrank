package en.caps.hackerrank.algo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GradingStudents {

	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		System.out.println(grades);
		
		grades = gradingStudents(grades);
		
		System.out.println(grades);
		
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> gradesR = new ArrayList<>();
		int i=0;
		for(Iterator<Integer> itr=grades.iterator();itr.hasNext();) {
			int i1 = itr.next();
//			i1++;
			int iNext5 = (i1/5 * 5 + 5);
			int iRound = iNext5 - i1;
			if(iRound < 3 && i1 >=38)
				i1 = iNext5;
			gradesR.add(i1);
		}
		return gradesR;

	}
}
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class Result {
//
//    /*
//     * Complete the 'gradingStudents' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts INTEGER_ARRAY grades as parameter.
//     */
//
//public static List<Integer> gradingStudents(List<Integer> grades) {
//        List<Integer> gradesR = new ArrayList<>();
//        int i=0;
//        for(Iterator<Integer> itr=grades.iterator();itr.hasNext();) {
//            int i1 = itr.next();
////            i1++;
//            int iNext5 = (i1/5 * 5 + 5);
//            int iRound = iNext5 - i1;
//            if(iRound < 3 && i1 >=38)
//                i1 = iNext5;
//            gradesR.add(i1);
//        }
//        return gradesR;
//
//    }
//
//}
//
// class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//            .map(String::trim)
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        List<Integer> result = Result.gradingStudents(grades);
//
//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining("\n"))
//            + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
//
