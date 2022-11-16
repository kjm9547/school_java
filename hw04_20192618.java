package homework;
import java.io.IOException;
import java.io.FileReader;
import java.math.*;
import java.util.Arrays;
class TreeNode{
	int weight;
	char ch;
	TreeNode left;
	TreeNode right;
}

class element{
	TreeNode ptree;
	char ch;
	int key;
}

class HeapType{
	element heap[];
	int heap_size;
	public HeapType(int n) {
		
		heap = new element[300];
		heap_size = 0;
		for(int i =0; i<300; i++) {
			heap[i]= new element();
		}
	}
}
public class hw04_20192618 {
	
	static HeapType create(int n) {
		HeapType heap = new HeapType(n);
		heap.heap_size = 0;
		return heap;
	}
	static void insert_max_heap(HeapType h, element item) {
		
		int y =++h.heap_size;
		
		//System.out.println(h.heap.length+" "+ y);
		
		while(y!=1 && item.key>h.heap[Math.round(y/2)].key) {
			h.heap[y] = h.heap[Math.round(y/2)];
			y=Math.round(y/2);
		}
		
		//System.out.println(item.key);
		
		h.heap[y].key= item.key;
		h.heap[y].ch = item.ch;
		h.heap[y].ptree = item.ptree;
		

	}
	static HeapType sort(HeapType h) {
		element e;
		for(int i =0; i<h.heap_size;i++) {
			for(int y=0;y<h.heap_size;y++) {
				if(h.heap[i].key<h.heap[y].key) {
					e = h.heap[i];
					h.heap[i] = h.heap[y];
					h.heap[y] = e;
									}
			}
		}
		return h;
	}
	static element delete_min_heap(HeapType h) {
		int parent, child;
		element item, temp;
		temp = new element();
		item = h.heap[1];
		
		temp = h.heap[(h.heap_size)--];
		//System.out.println(h.heap[0].key);
		parent = 1;
		child = 2;
		while (child <= h.heap_size) {
			// 현재 노드의 자식노드중 더 작은 자식노드를 찾는다.
			if ((child < h.heap_size) &&
				(h.heap[child].key) > h.heap[child + 1].key)
				child++;
			if (temp.key >= h.heap[child].key) break;
			// 한 단계 아래로 이동
			h.heap[parent] = h.heap[child];
			parent = child;
			child =child*2;
		}
		h.heap[parent] = temp;
		
		return item;


	}
	
	static TreeNode make_tree(TreeNode left, TreeNode right) {
		TreeNode node = new TreeNode();
		node.left = left;
		node.right = right;
		return node;
	}
	
	static void huffman_tree(int freq[], char ch_list[], int n) {
		TreeNode node,x;
		HeapType heap;
		heap = create(n);
		element e = new element();
		element e1,e2 = new element();
		for(int i =0; i<n;i++) {
			node = make_tree(null, null);
			e.ch = node.ch =ch_list[i];
			e.key = node.weight = freq[i];
			e.ptree = node;
			insert_max_heap(heap, e);
		}
		for(int i =0; i<n;i++) {
			System.out.println(heap.heap[i].key);
		}
		
		for(int i=0; i<n;i++) {
			heap=sort(heap);
			e1 = delete_min_heap(heap);
			e2 = delete_min_heap(heap);
			
			x=make_tree(e1.ptree, e2.ptree);
			e.key = x.weight = e1.key+e2.key;
			e.ptree = x;
			System.out.println(e1.key+"+"+e2.key +"=" + e.key);
			insert_max_heap(heap, e);
		}
		//e= delete_min_heap(heap);
		
		
		
	}
	public static void main(String [] args) throws IOException{
		int n = 128;
		int cnt[] = new int[n];
		
		char ch[] = new char[n];
		for(int i =0;i<ch.length;i++) {
			ch[i] = '\u0000';
			ch[i] +=i;
		}
		try {
		FileReader reader = new FileReader("C:\\Users\\user\\eclipse-workspace\\homework\\src\\homework\\ds.txt");
		 
        int code;
        while ((code = reader.read()) != -1) {
            for(int i =0;i<128;i++) {
            	if(ch[i] == code) {
            		cnt[i]++;
            }
            	

            }
        }
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		int tmp_n;
		char tmp_c;
		for(int i =0;i<n;i++) {
			for(int y=0; y<n;y++) {
				if(cnt[i]>cnt[y]) {
					tmp_n = cnt[y];
					cnt[y] = cnt[i];
					cnt[i] = tmp_n;
					
					tmp_c = ch[y];
					ch[y] = ch[i];
					ch[i] = tmp_c;
				}
			}
		}
		int s=0;
		for(int i =0;i<n;i++) {
			if(cnt[i]==0) {
				s++;
			}
			
		}
		n-=s;
		int amount = 0;
		for(int i= 0; i<n; i++) {
			//System.out.println(cnt[i] +" "+ i);
			amount+=cnt[i];
		}
		System.out.println(amount);
		huffman_tree(cnt, ch, n);
		
		
	}
}
