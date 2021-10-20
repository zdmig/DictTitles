package com.company;
import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {
	int guests[] = {1,4,2,0,2,1,4,3,0,2};
	int roomNum = 0;

	out.println("Комната\tКоличество");
	for (roomNum=0; roomNum<10; roomNum++) {
	    out.print(roomNum);
	    out.print("\t");
	    out.println(guests[roomNum]);
    }
    }
}
