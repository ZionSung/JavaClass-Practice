/*
=============
Constructor練習
=============
請修改Constructor的範例程式
在Date的class中新增一個包含三個參數的Constructor
如果輸入錯誤的日期，則輸出"Fatal Error"
public Date(int myMonth, int myDay, int myYear)
附註:本題輸入的年範圍限制在1000~9999, 若做閏年的檢查只考慮此範圍

範例輸入
10 13 2013
範例輸出
Your birthday is October 13, 2013.

注意:
(a)善用Date.java所提供的各種set方法可以更簡單地完成任務
(b)
     1.一般水準(通過Test Case 1-8)：考慮輸入的月和日的範圍，
       月在1~12日在1~31，不考慮大小月
     2.進階水準(通過Test Case 9)：考慮大小月
     3.挑戰水準(通過Test Case 10)：考慮閏年要有2月29日
        閏年的檢查為:
	西元年為4的倍數且為400的倍數時為閏年，閏年時的2月有29日
*/


int isFalse = 0;

if( myYear >= 1000 && myYear <= 9999){

   if( myYear%4 == 0 && myYear%400 != 0 ){
      if( myMonth >= 1 && myMonth <= 12){
         if( myMonth == 2 ){
            if( myDay >= 1 && myDay <= 29 ){
               setDay(myDay);
               setMonth(myMonth);
               setYear(myYear);
            }
         }
         else if( myMonth == 1 || myMonth == 3 || myMonth == 5 || myMonth == 7 || myMonth == 8 || myMonth == 10 || myMonth == 12 ){
            if( myDay >= 1 && myDay <= 31 ){
               setDay(myDay);
               setMonth(myMonth);
               setYear(myYear);
            }
            else{
               isFalse = 1;
            }
         }
         else{
            if( myDay >= 1 && myDay <= 30 ){
               setDay(myDay);
               setMonth(myMonth);
               setYear(myYear);               
            }
            else{
               isFalse = 1;
            }
         }
      }
      else{
         isFalse = 1; // month is false
      }
   }
   else{
      if( myMonth >= 1 && myMonth <= 12 ){
         if( myMonth == 2 ){
            if( myDay >= 1 && myDay <= 28){
               setDay(myDay);
               setMonth(myMonth);
               setYear(myYear);
            }
            else{
               isFalse = 1;
            }
         }
         else if( myMonth == 1 || myMonth == 3 || myMonth == 5 || myMonth == 7 || myMonth == 8 || myMonth == 10 || myMonth == 12 ){
            if( myDay >= 1 && myDay <= 31 ){
               setDay(myDay);
               setMonth(myMonth);
               setYear(myYear);
            }
            else{
               isFalse = 1;
            }
         }
         else{
            if( myDay >= 1 && myDay <= 30 ){
               setDay(myDay);
               setMonth(myMonth);
               setYear(myYear);               
            }
            else{
               isFalse = 1;
            }
         }
      }
      else{
         isFalse = 1;
      }
   }   
}
else{
   isFalse = 1;
}

if( isFalse == 1 ){
    System.out.println("Fatal Error");
    System.exit(0);
}
 