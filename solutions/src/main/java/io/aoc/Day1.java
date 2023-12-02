package io.aoc;

public class Day1 {

    public static void main(String[] args) {
        FileProvider.readFileFromResources("day1input.txt");
        System.out.println(new Day1Solution().result(FileProvider.readFileFromResources("day1input.txt")));
        System.out.println(new Day1Solution().resultPart2(FileProvider.readFileFromResources("day1input.txt")));
    }

    static class Day1Solution {
        public int result(String input) {
            int result = 0;

            for(char c : input.toCharArray()) {
                if(c == '(')
                    result++;
                else if (c==')') {
                    result--;
                }
            }
            return result;
        }

        public int resultPart2(String input) {
            int result = 0;
            int index = 1;

            for(char c : input.toCharArray()) {
                if(c == '(') {
                    result++;
                }
                else if (c==')') {
                    result--;
                }
                if(result<0) {
                    return index;
                }
                index++;
            }
            return index;
        }
    }


}
