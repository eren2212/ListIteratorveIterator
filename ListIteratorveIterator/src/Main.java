
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;


public class Main {

    /*
    Listiterator
    
    Sadece List Interfacei implemente eden classlarda kullanılır.
    next() ve previous() metodu vardır.
    Ekstradan add() metoduda bulunutr.
    
    Iterator
    
    set ,queue ve list Interfacei implemente eden classlarda kullanılabilir
    previous() metoodu yoktur.
    
    */
    
    public static void main(String[] args) {
        //Set<String> set = new HashSet<String>();
        List<String> liste = new ArrayList<String>();
        
        
        
        liste.add("Java");
        liste.add("Pyhton");
        liste.add("C++");
        liste.add("Go");
        
        ListIterator<String> listIterator = liste.listIterator();
        
        //burada normal ileri giderek bastırdık
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        //burada geri gelerek bastırıyoruz.
        while(listIterator.hasPrevious()){
            String kelime = listIterator.previous();
            
            if(kelime.equals("Go")){
                listIterator.remove();
            }
        }
        
        System.out.println("********************************");
        
        for(String s:liste){
            System.out.println(s);
        }
        
        
        
        /*set.add("Java");
        set.add("Pyhton");
        set.add("C++");
        set.add("Go");
        
       
        
        Iterator<String> iterator1 = set.iterator();
        Iterator<String> iterator2 = liste.iterator();
        
        
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("***************************");
        
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("/**************************");
        
       
            burada iterator1 sona geldiği için ve daha fazla ilerleyemediği için
            başka bastıramıyoruz bir şey while döngüsüne girmiyor o yüzden.
        */
        
        /*
        
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        */
    }
    
}
