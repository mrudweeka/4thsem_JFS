class Graph{
   int v;
   int[][] mat;
   Graph(int v){
     this.v=v;
     mat=new int[v][v];
   }
   void add(int u,int v){
     mat[u][v]=1;
   }
   void show(){
      for(int i=0;i<v;i++){
      for(int j=0;j<v;j++){
         System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
   }
   void prob(){
     int x=0;
     for(int i=0;i<v;i++){
       int count=0;
       for(int j=0;j<v;j++){
          if(mat[i][j]==0){
          count++;
        }
       }
       if(count==v){
         x++;
       }
     }
     System.out.println("result : "+x);
   }
   
}
class Main_Graph{
  public static void main(String[] args){
    Graph obj =new Graph(5);
    obj.add(0,1);
    obj.add(0,2);
    obj.add(0,4);
    obj.add(1,3);
    obj.add(2,4);
    obj.show();
    obj.prob();
  }
}