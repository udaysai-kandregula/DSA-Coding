class MultiplicationTable{
    public static void main(String [] args){
        int n = 19;
        for(int i = 1 ; i <= 20; i++){
            System.out.println(n + " " + "X" + " " + i + "\t" + "=" +" " + (n*i));
        }
    }
}


// TC = O(N)
// SC = O(1)