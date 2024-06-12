package hashcode;

public class Test{
    public static void main(String[] args) {
            Address resadd = new Address();
            Address res = resadd;
            resadd.area="kphb";
            resadd.state="ap";
            Address deliveryadd = new Address();
            deliveryadd.area="Hyd";
            resadd.area="miyapur";
            resadd.state="ap";
            System.out.println("reflexive Test Start here");
            System.out.println(resadd.equals(res));
            System.out.println("reflexive Test End here");
            System.out.println();
            System.out.println("Symmetric  Test Start here");
            System.out.println(resadd.equals(deliveryadd));
            System.out.println(deliveryadd.equals(resadd));
            System.out.println("Symmetric Test End here");
            System.out.println();
            System.out.println("Consistency Test Start here");
            System.out.println("Restaurant hashcode: "+resadd.hashCode());
            System.out.println("Delivery hashcode: "+deliveryadd.hashCode());
            System.out.println("Consistency Test End here");

            System.out.println(deliveryadd.state.hashCode());

        }
    }