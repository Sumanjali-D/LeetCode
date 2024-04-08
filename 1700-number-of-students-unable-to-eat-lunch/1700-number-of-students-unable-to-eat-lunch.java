class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zeroStudentCount = 0;
        int oneStudentCount = 0;
        int n = students.length;
        for(int i=0;i<n;i++){
            if(students[i]==1){
                oneStudentCount++;
            }else{
                zeroStudentCount++;
            }
        }
        
        for(int i =0;i<n;i++){
            if(sandwiches[i]==1 && oneStudentCount==0){
                return zeroStudentCount;
            }
            if(sandwiches[i]==0&&zeroStudentCount==0){
                return oneStudentCount;
            }
            if(sandwiches[i]==1){
                oneStudentCount--;
            }else{
                zeroStudentCount--;
            }
        }
        return 0;
    }
}