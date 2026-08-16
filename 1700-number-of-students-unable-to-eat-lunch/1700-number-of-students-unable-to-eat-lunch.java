import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
         Deque<Integer> queue = new ArrayDeque<>();
         int numberOfStudents = students.length;
         for(int i = 0; i < numberOfStudents; i++) {
             queue.add(students[i]);
         }
         
         int sandwichCount = 0;

         while(!queue.isEmpty()) {
             int currentStudent = queue.poll();
             if(sandwiches[sandwichCount] == currentStudent) {
                 sandwichCount++;
             }
             else{
                 if(currentStudent == 1){
                     if(!queue.contains(0)){
                         break;
                     }
                 }
                 else{
                     if(!queue.contains(1)){
                         break;
                     }
                 }
                 queue.add(currentStudent);
             }
         }
         return sandwiches.length-sandwichCount;
    }
}
