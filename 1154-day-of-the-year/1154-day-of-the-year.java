class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int days = Integer.parseInt(date.substring(8, 10));

        int[] Monthdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(isLeap(year)){
            Monthdays[1] = 29;
        }
        for(int i = 0; i < month - 1; i++){
            days += Monthdays[i];
        }
        return days;
    }
    public static boolean isLeap(int year){
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}