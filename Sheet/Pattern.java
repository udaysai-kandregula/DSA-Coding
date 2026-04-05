class Pattern{
    static void box(int num){
        for(int i = 0 ; i < num ; i++){
            for(int j = 0 ; j < num ; j++){
                System.out.print("x" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Pattern obj = new Pattern();
        obj.box(5);
    }
}