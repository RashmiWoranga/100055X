/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100055xproject1;

/**
 *
 * @author DELL
 */
public class Main {
    
    public Person[] makeGroup(){
        
        Person []zenith = new Person[5];
        
        for (int i = 0; i < 5; i++) {
            zenith[i] = new Person();
        }
        
        zenith[0].setName("Chamika Kasun");
        zenith[1].setName("Vidudaya Bandara");
        zenith[2].setName("Rashmi Woranga");
        zenith[3].setName("Madhushi Niluka");
        zenith[4].setName("Janindu Sean");
        
        zenith[0].setField("Web Devoloping");
        zenith[1].setField("Analizing and Application developing");
        zenith[2].setField("Documentaion and Analizing");
        zenith[3].setField("Analizing");
        zenith[4].setField("Coding");
        
        return zenith;
    }
    

   public void displayList(){
       
        Person zenith[] = makeGroup();
        
        for(int i=0;i<5;++i){
            System.out.println("Zenith Group member "+zenith[i].getName()+" is has a good knowladge in "+zenith[i].getField());
        }
       
       
   }
    
    public static void main(String[] args) {
       Main peerGroup = new Main();
       peerGroup.displayList();
    }
}
