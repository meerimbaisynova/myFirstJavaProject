package constructors;

public class Barista {
    /*
    VARIABLES
   - name
    -position
    -salary
    -gender
    -isExperienced

    METHODS
    talk to client
    steam milk
    take order
    wash hands
    get tips
    get name of client
    is happy
     */
    String name;
    String position;
    double salary;
    char gender;
    boolean isExperienced;
     boolean areHandsClean;
     boolean isHappy;
     static double jarOfTips = 2.50;

     public Barista(String name, String position, double salary){
         this.name = name;
         this.position = position;
         this.salary =salary;
         System.out.println("Hired a new " + position + " . The same is " + name + " The salary will be " + salary + " $ per hour");
     }
     public Barista (String name, boolean isExperienced){
         this.name = name;
         this.isExperienced = isExperienced;
         System.out.println(" Hired new barista " + name + "Experience" + isExperienced) ;
     }

     public void  talkToClient(String clientsName){
        System.out.println(name + " is talking to client " + clientsName);
    }
    public  void steamMilk (String typeOfMilk){
        System.out.println(name + " is steaming the " + typeOfMilk + "milk ");
    }

    public void takeOrder(String orderName , String clientName){
        System.out.println(position + " " + " is taken order of " + orderName + " from client :" + clientName);
    }
    public void washHands(boolean cleanHands){
        if(cleanHands){
            System.out.println(name + " 's hands are clean . Not washing  again ");

            }else {
            System.out.println(name + " is washing the hands ");
            areHandsClean = true;
        }
    }
    public boolean getTips(double tips ){
        if (tips > 0) {
            System.out.println( position + " " + name + " is is getting tips in the amount of : " + tips + "$");
            isHappy = true;
            jarOfTips = jarOfTips + tips;
            return true;
        }else {
            System.out.println(" no tips for " + position + " " + name + "this time!") ;
            isHappy = false;
            return false;
        }
    }
    public boolean isBaristaHappy(){
        return isHappy;
    }

}
