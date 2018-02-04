package com.home.algorithms.sorting;

import java.util.Arrays;

public class MeetingSchedule {
	
	public int workonschedule(int[] mstart_time,int[] mend_time){
		Arrays.sort(mstart_time);
		Arrays.sort(mend_time);
		int conf_room = 1;
		int result =1;
		int i =1;
		int j =0;

		while(i<mstart_time.length){
		
			if(mstart_time[i]<mend_time[j]){
				conf_room++;
				if(conf_room>result){
				result=conf_room;
				}
				i++;
			}
			else{
				conf_room--;
				j++;
			}
		}
		return result;
	}
	
	public static void main(String args[]){
		 int mstart_time[] = {900, 905, 950, 1100, 1115, 1800};
		 int mend_time[] = {910, 1200, 1120, 1130, 1900, 2000};
		 MeetingSchedule ms = new MeetingSchedule();
		 System.out.println(" "+ ms.workonschedule(mstart_time, mend_time));
	}
	
	//Time complexity O(n+1)
}
