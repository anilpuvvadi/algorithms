//package com.home.algorithms.sorting;
//
//public class MyHeap{
//
//	int HEAP_SIZE;
//	HeapNode[] a = new Element[HEAP_SIZE];
//
//	public MyHeap(HeapNode[] heapNode){
//		int k = heapNode.size();
//		for(int i=k/2;k>=0;k--){
//			heapify(heapNode,i,k);
//		}
//
//	}
//	
//	public void heapify(HeapNode[] a, int i, int n){
//		
//		int left = 2*i+1;
//		int right = 2*i+2;
//		int min = i;
//
//		if(left<n && a[left].data<a[min].data){
//			min = left;
//		}
//
//		if(right<n && a[right].data<a[min].data){
//			min = right;
//		}
//		if(i!=min){
//			HeapNode temp = a[i];
//			a[i] = a[min];
//			a[min] = a[i];
//			heapify(a,min,n);
//
//		}
//	}
//
//	public Elem getMin(){
//		return a[0];
//	}
//
//	public void insertElem(Element elem){
//
//		a[0] = elem.data;
//		heapify(a,0,n);
//	}
//
//	public Elem removeElem(Element elem){
//			if(heapsize =0) return null
//			int returnvalue = a[0];
//			swap(a[0],a[n]);
//			heapsize --;
//			heapify(a,0,n);
//	}
//	
//}
//
//class HeapNode{
//	int data;
//	int cur_pos;
//	int array_no;
//}
//
//
//Merge Sort nkLogk
//
//
//public class KwayMerge{
//
//int[][] a = {
//	{1,2,3,4},
//	{5,6,7,8},
//	{10,20,30,40}
//};
//int k = a.length;
//HeapNode[] heapnode = new HeapNode[k];
//for (int i =0;i<k;i++){
//	HeapNode heapNode = new HeapNode();
//	heapNode.data = a[i][0];
//	heapNode.cur_pos = 1;
//	heapNode.array_no = i;
//}
//int[] merged = new int[n*k];
//int j =0;
//	MyHeap heap = new MyHeap(heapNode);
//	for(int i =0;i<n*k;i++){
//		HeapNode elem =removeElem();
//		if elem is null - break;
//		merged[j++] = elem.data;
//		if(elem.cur_pos<a[elem.array_no].length){
//			
//			if(elem.data==INTEGER.MAX_INFINITY){
//				//ignore
//			}
//			
//			ELement e = new Element();
//			e.cur_pos = elem.cur_pos+1;
//			e.data = a[elem.array_no][cur_pos+1];
//			insertitem(e);
//			}
//			else{
//			ELement e = new Element();
//			e.cur_pos = elem.cur_pos+1;
//			e.data = Integer.INFINITY;
//			insertitem(e);
//			}
//
//	}
//
//}
