package Homework;
import java.io.IOException;
import java.io.FileReader;

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
		heap = new element[n];
		heap_size = 0;
		for(int i =0; i<n; i++) {
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
	static HeapType insert_min_heap(HeapType h, element item) {
		
		//System.out.println(h.heap[i].key);
		return h;
	}
	
	static TreeNode make_tree(TreeNode left, TreeNode right) {
		TreeNode node = new TreeNode();
		node.left = left;
		node.right = right;
		return node;
	}
	
	static void huffman_tree(int freq[], char ch_list[], int n) {
		TreeNode node;
		HeapType heap;
		heap = create(n);
		element e = new element();
		for(int i =0; i<n;i++) {
			node = make_tree(null, null);
			e.ch = ch_list[i];
			e.key = freq[i];
			e.ptree = node;
			heap.heap[i].key= e.key;
			heap.heap[i].ch = e.ch;
			heap.heap[i].ptree = e.ptree;
			/*int y = heap.heap_size;
			//System.out.println(i);
			while(y!=1 && e.key<heap.heap[(int)y/2].key) {
				heap.heap[y] = heap.heap[(int)y/2];
				y=(int)y/2;
			}
			//System.out.println(item.key);
			heap.heap[y]= e;
			heap.heap_size +=1;*/
		}
		System.out.println(heap.heap[0].ch);
		for(int z =0; z <n; z++) {
			System.out.println(heap.heap[z].key);
		}
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
		FileReader reader = new FileReader("/Users/kjm/eclipse-workspace/data_analysis/src/Homework/ds.txt");
		 
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
		//System.out.println(cnt[20]);
		huffman_tree(cnt, ch, n);
	}
}
