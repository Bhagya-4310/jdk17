package hashcode;

   public class Address {
       public String state;
       public String area;
       public boolean equals(Object o) {
           if (this==o){
               return true;
           }
           if(this.getClass() != o.getClass()){
               return false;
           }
           Address address=(Address) o;
           return this.state.equals(address.state) && this.area.equals(address.area);
       }
       public int hashCode(){
           return this.state.hashCode()+this.area.hashCode();
       }

       @Override
       public String toString() {
           return "Address{" +
                   "state='" + state + '\'' +
                   ", area='" + area + '\'' +
                   '}';
       }
   }


