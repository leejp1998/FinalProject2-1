package todo.routeinfor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class DayInfor implements Serializable {

    HashMap<String,Infor> infors = new HashMap<String ,Infor>();

    public void addInfor(String key,Infor infor){
        infors.put(key,infor);
    }
    public HashMap<String,Infor> getDayInfors(){
        return infors;
    }

    public Infor getInfor(String key){
        return infors.get(key);
    }

    public List<Infor> getInforList(){

        List<Infor> list = new ArrayList<>();
        HashMap map = getDayInfors();
        Collection<String> set1 = map.values();
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()){
            Infor value = (Infor) iterator.next();
            list.add(value);
        }
        return list;
    }

    public void remove(String key){
        infors.remove(key);
    }

    @Override
    public String toString() {
        return "DayInfor{" +
                "infors=" + infors +
                '}';
    }
}
