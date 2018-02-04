package com.home.algorithms.dp;

import java.util.Stack;

public class TowerofHanoi {
	private Stack<Integer> disks;
	private int index;

	public TowerofHanoi(int n) {
		disks = new Stack<Integer>();
		index = n;
	}

	public void movetop(TowerofHanoi origin,TowerofHanoi destn) {
			int disk = origin.disks.pop();
			destn.disks.push(disk);
	}

	public void moveDisks(int n,TowerofHanoi origin, TowerofHanoi destination,
			TowerofHanoi buffer) {
		if(n>0){
			moveDisks(n - 1,this, buffer, destination);
			movetop(this,destination);
			buffer.moveDisks(n - 1, buffer,destination,this);
		}

	}
	
	public static void main(String args[]) {
		int n =3;
		TowerofHanoi[] tower = new TowerofHanoi[n];
		for (int i = 0; i < tower.length; i++) {
			tower[i] = new TowerofHanoi(i);
		}
		for (int i = n-1; i >=0; i--) {
			tower[0].disks.push(i);
		}
		tower[0].moveDisks(n, tower[0],tower[2], tower[1]);
		System.out.println("towers" +tower[2].disks);
	}
}
