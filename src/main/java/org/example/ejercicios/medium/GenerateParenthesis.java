package org.example.ejercicios.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        // we are given n pairs of parenthesis. i have to make a backtracking algo that
        // through 2 parameters (parenthesis remaining, nest level of parenthesis)
        // adds those combinations to the array
        // I can create the combinations through a String Builder.
        if (n == 0) return new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        List<String> answer = new ArrayList<>();
        recursiveParenthesisFunction(answer, n, 0, sb);
        return answer;
    }

    private void recursiveParenthesisFunction(List<String> ans, int remaining, int placed, StringBuilder sb) {
        if (remaining == placed && placed == 0) {
            ans.add(sb.toString());
            return;
        }
        if (remaining > 0) {
            sb.append('(');
            recursiveParenthesisFunction(ans, remaining - 1, placed + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (placed > 0){
            sb.append(')');
            recursiveParenthesisFunction(ans, remaining, placed - 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        return;
    }

    ;
}