package nl.hva.dmci.ict.se.datastructures;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yasmin
 */
public class Rijtjes implements RijtjesControle {

    public static List optellen = new ArrayList();

    public static void main(String[] args) {
        optellen.add(1);
        optellen.add(9);
        optellen.add(7);
        Rijtjes r = new Rijtjes();
        System.out.println(r.isStijgend(optellen, 1));
    }

    @Override
    public <T extends Comparable<T>> boolean isDalend(List<T> rijtje) {
        return false;
    }

    @Override
    public <T extends Comparable<T>> boolean isStijgend(List<T> rijtje, int n) {
        if (rijtje != null) { 
            if (n == rijtje.size() - 1) {
                return true;
            } else if (rijtje.get(n).compareTo(rijtje.get(n + 1)) < 0) {
                return isStijgend(rijtje, n + 1);
            }
        }
        return false;
    }

    @Override
    public <T extends Comparable<T>> boolean isGelijk(List<T> rijtje) {
        return false;
    }
}

// feedback docent, gebruik sublist 
//    public class IsStijgend {
//        public boolean isStijgend(int[] getallen) {
//            return isStijgend(getallen, 0);
//        }
//    }
//
//    private boolean isStijgend(int[] getallen, int n) {
//        if (n == getallen.length - 1) {
//            return true;
//        } else {
//            return getallen[n] < getallen[n + 1] && isStijgend(getallen, n + 1);
//        }
//    }
//}
//
//private List<directoryListObj> dataList = new ArrayList<>();
//
//dataList = dataList.subList(firstRow, lastRow);
//private int getPredecessorCount(int id){
//    for(int i:elementList[id-1].predecessors){
//        return 1+getPredecessorCount(i);
//    }
//    return 0;
//}
// als eerste < volgende
// stijgend als vanaf volgende stijgend is
// sublist

