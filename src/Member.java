public class Member {
    private String name;
     private int age;

     public void setName(String name) throws Exception{
         if(name.length()>15){
             //에러 발생시키던가.  앞에서 15자만 자르던가..
             throw  new Exception("15자이상인데?");
         }else{
             this.name=name;
         }

     }



}
