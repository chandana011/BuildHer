//Easy--example3
//Question--->
//Given an integer numRows, return the first numRows of Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//    1
//   1 1
//  1 2 1
// 1 3 3 1
//1 4 6 4 1

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> result = pascalTriangle.generate(n);  
        
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}

