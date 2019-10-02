public class Mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] v1 = {0, 1, 2, 3, 4};
		int [] v2 = {4, 3, 2, 1, 0};
		sort(v1, 0, v1.length-1);
		sort(v2, 0, v2.length-1);
		imprimir(v1);
		imprimir(v2);
	}
    public static void imprimir(int a[]) 
    {
    	System.out.print("Array: ");
    	for(int i = 0; i < a.length-1; i++)
    		System.out.print(a[i]+", ");
    	System.out.println(a[a.length-1]);
    }
    public static void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            int m = (l+r)/2; 
  
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            merge(arr, l, m, r); 
        } 
    }

    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        
        int i = 0, j = 0;
        int k = l;
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1) 
            arr[k++] = L[i++];
        
        while(j < n2) 
                arr[k++] = R[j++];

    }
}
