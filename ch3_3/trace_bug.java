/*
==========================
==Trace bug練習,運用print==
==========================
社區通報小偷出現，警察必須盡快趕到目標區域抓捕小偷
請參考範例程式，當輸入社區的大小sizeW,sizeH和小偷位置(x,y)後
警察會到社區依照範例程式中的巢狀for迴圈依序進行搜索，
從(0,0)開始到(sizeW-1,sizeH-1)搜索(i,j)的區域。
警察在搜索的過程中,已經搜索過的區域數count會隨著i,j的變化而增加
請修改範例程式，當警察抓到小偷時(i等於x 且j等於y時)，
輸出總共搜索過的區域數count。

範例部分程式碼:
count = 0;
for(int i=0; i < sizeW; i++){
   for(int j=0; j < sizeH; j++){
         count++;
         請加入你的程式碼來判斷是否為小偷的位置，並輸出count
    }
}
---------------
輸出入說明
---------------
輸入說明:
輸入第一行sizeW及sizeH代表社區大小
輸入第二行x及y代表小偷所在位置

輸出說明:
輸出count代表總共搜索過的區域數

------------
Example1
------------
範例輸入
3 3 
0 2

範例輸出
3

------------
Example2
------------
範例輸入
4 4 
2 2

範例輸出
11
*/

import java.util.Scanner;

public class trace_bug {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sizeW,sizeH,x,y,count;
		sizeW = sc.nextInt();
		sizeH = sc.nextInt();
		x= sc.nextInt();
		y= sc.nextInt();
		count=0;
		for(int i=0;i<sizeW;i++){
			for(int j=0;j<sizeH;j++){
				++count;
				if( x == i && y == j ){
                    System.out.print(count);
                    break;
                }
			}
		}
	}
}