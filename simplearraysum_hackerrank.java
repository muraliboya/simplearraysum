 public static int simpleArraySum(List<Integer> ar) {
    // Write your code here
    int total=0;
    for (int i=0;i<ar.size();i++){
        total=total+ar.get(i);
    }
    return total;

    }
