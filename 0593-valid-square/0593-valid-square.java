class Solution {
    static int getSquaredDistance(int[] a,int[] b){
        return (a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1]);
    }
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> distances =new HashSet<>(Arrays.asList(
            getSquaredDistance(p1,p2),
            getSquaredDistance(p1,p3),
            getSquaredDistance(p1,p4),
            getSquaredDistance(p2,p3),
            getSquaredDistance(p2,p4),
            getSquaredDistance(p3,p4)
        ));
        return!distances.contains(0)&& distances.size()==2;
    }
}