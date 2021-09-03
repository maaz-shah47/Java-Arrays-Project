class Main {
    public static boolean find(int[] A, int search, int l, int r) {
        if (l > r)
            return false;
        int m = l + (r - l) / 2;
        if (A[m] == search)
            return true;
        if (A[0] > search) {
            if (A[m] > search || A[m] > A[0])
                return find(A, search, m + 1, r);
            return find(A, search, l, m - 1);
        }
        else {
            if (A[m] > search || A[m] < A[0])
                return find(A, search, l, m - 1);
            return find(A, search, m + 1, r);
        }
     }
     public static void main(String[] args) {
        int[] A = { 1, 3, 4, 5, 7, 14, 11, 7, 2, -4, -8 };
        System.out.println(find(A, 5, 0, A.length));
        System.out.println(find(A, 0, 0, A.length));
     }
}