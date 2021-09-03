public class SortedArrayOfInteger
{
    public static int first_occurence_index(int []A, int start, int end, int k, int n)
    {
        if(end >= start)
        {
            int mid = ( start + end )/2;
            if(A[mid] == k && ( mid == 0 || k > A[mid-1]))
                return mid;
        
            else if(k > A[mid])
                return first_occurence_index(A, mid + 1, end, k, n);
            else
                return first_occurence_index(A, start, mid -1, k, n);
        }
        return -1; // when not present
        }
        
        public static int last_occurence_index(int []A, int start, int end, int k, int n)
        { 
            if(end >= start)
            {
                int mid = ( start + end )/2;
                if ( A[mid] == k && (mid == n-1 || k < A[mid+1]) )
                    return mid;
                else if (k < A[mid])
                    return last_occurence_index(A, start, mid -1, k, n);
                else
                    return last_occurence_index(A, mid + 1, end, k, n);
            }
            return -2; // -2 so that when not present -2+1-1 = 0
        }
    public static int count(int [] A,int k)
    {
        int n = A.length;
        return last_occurence_index(A,0,n-1,k,n)-first_occurence_index(A,0,n-1,k,n) + 1;
    }
    public static void main(String[] args) {
        int[] A ={-1,2,3,5,6,6,6,9,10};
        int k =6;
        
        System.out.println(count(A,k));
    
    }
}